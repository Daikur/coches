package coche;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GestionCoches {

    Connection conexion;
    static String bd = "coches";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/" + bd;

    public boolean crearConexion() {
        boolean resultado = false;

        try {
            conexion = DriverManager.getConnection(url, login, password);
            if (conexion != null) {
                resultado = true;
//                this.labelConexion.setText("Conexión Establecida");

            }
        } catch (SQLException ex) {
//            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
        return resultado;
    }

    public boolean crearTablaCoche() {
        boolean resultado = false;

        String tabla = "CREATE TABLE IF NOT EXISTS `coches`.`coches` (\n"
                + "  `Matricula` VARCHAR(7) NOT NULL,\n"
                + "  `Marca` VARCHAR(45) NOT NULL,\n"
                + "  `Modelo` VARCHAR(45) NULL,\n"
                + "  `Color` VARCHAR(45) NULL,\n"
                + "  `Año` INT NULL,\n"
                + "  `Precio` DOUBLE NULL,\n"
                + "  PRIMARY KEY (`Matricula`));";
        try {
            PreparedStatement ps = conexion.prepareStatement(tabla);
            ps.execute();
            resultado = true;
        } catch (SQLException ex) {

        }
        return resultado;
    }

    public int cargarTablaCoches(File fichero) {
        String matricula;
        String marca;
        String modelo;
        String color;
        int año;
        double precio;
        String linea;
        int numFilas = 0;

        try (BufferedReader archivo = new BufferedReader(new FileReader("coches.txt"))) {
            while ((linea = archivo.readLine()) != null) {
                String datos[] = linea.split(":");
                matricula = datos[0];
                marca = datos[1];
                modelo = datos[2];
                color = datos[3];
                año = Integer.parseInt(datos[4]);
                precio = Double.parseDouble(datos[5]);

                String insertar = "Insert into coches values(?,?,?,?,?,?)";
                PreparedStatement ps = conexion.prepareStatement(insertar);
                ps.setString(1, matricula);
                ps.setString(2, marca);
                ps.setString(3, modelo);
                ps.setString(4, color);
                ps.setInt(5, año);
                ps.setDouble(6, precio);

                numFilas = ps.executeUpdate();

            }
        } catch (IOException | SQLException ex) {
            throw new RuntimeException(ex);
        }
        return numFilas;
    }

    public List<Coche> mostrarTablaCocches(String sql) {
        List<Coche> listaCoches = new ArrayList();
        String matricula, marca, modelo, color;
        Integer año;
        Double precio;

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                matricula = rs.getString("Matricula");
                marca = rs.getString("Marca");
                modelo = rs.getString("Modelo");
                color = rs.getString("Color");
                año = rs.getInt("Año");
                precio = rs.getDouble("Precio");

                listaCoches.add(new Coche(matricula, marca, modelo, color, año, precio));
            }

        } catch (SQLException ex) {

        }
        return listaCoches;
    }

    public boolean exportarDatos(TableModel datosCoche, Path archivo) {
        boolean resultado = false;
        int numLinea = datosCoche.getRowCount();
        int column = datosCoche.getColumnCount();
        String datos;
        Double precioCoches = 0.0;
        int countCoche = 1;
        try (BufferedWriter coches = new BufferedWriter(new FileWriter(archivo.toFile(), false))) {
            for (int contadorFila = 0; contadorFila < numLinea; contadorFila++) {
                coches.newLine();
                coches.write("Coche Nº: " + countCoche);
                coches.newLine();
                precioCoches += Double.parseDouble((String)datosCoche.getValueAt(contadorFila, 5));
                for (int contadorColumna = 0; contadorColumna < column; contadorColumna++) {                    
                    coches.write(datosCoche.getColumnName(contadorColumna)+".........."+datosCoche.getValueAt(contadorFila, contadorColumna));
                    coches.newLine();
                    resultado = true;
                }
                coches.newLine();
                countCoche++;
            }
            coches.write("Precio total: "+precioCoches);
        } catch (IOException ex) {
            resultado = false;
        }
        return resultado;
    }
}
