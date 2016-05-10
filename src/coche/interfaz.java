package coche;

import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();
        if (gc.crearConexion() == true) {
            this.labelConexion.setText("Conexión Establecida");
//            JOptionPane.showMessageDialog(this, "Pedido Correcto", "Pedido", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoRuta = new javax.swing.JTextField();
        labelConexion = new javax.swing.JLabel();
        botonCrearTablaCoches = new javax.swing.JButton();
        botonCargarDatos = new javax.swing.JButton();
        botonExportarDatos = new javax.swing.JButton();
        botonMostrarDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCoches = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Archivo origen de datos");

        campoRuta.setBackground(new java.awt.Color(153, 255, 153));
        campoRuta.setText("Haz clic para insertar la ruta del archivo");
        campoRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoRutaMouseClicked(evt);
            }
        });

        botonCrearTablaCoches.setText("Crear tabla coches");
        botonCrearTablaCoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearTablaCochesActionPerformed(evt);
            }
        });

        botonCargarDatos.setText("Cargar datos");
        botonCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarDatosActionPerformed(evt);
            }
        });

        botonExportarDatos.setText("Exportar tabla a archivo");
        botonExportarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarDatosActionPerformed(evt);
            }
        });

        botonMostrarDatos.setText("Mostrar datos de coches");
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        tablaCoches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Marca", "Modelo", "Color", "Año", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCoches);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(botonCrearTablaCoches))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(102, 102, 102)
                                    .addComponent(botonCargarDatos))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(labelConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(botonExportarDatos))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonMostrarDatos)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCrearTablaCoches)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargarDatos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(botonMostrarDatos)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(labelConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonExportarDatos)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearTablaCochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearTablaCochesActionPerformed
        if (gc.crearTablaCoche() == true) {
            JOptionPane.showMessageDialog(this, "Se ha creado correctamente la tabla", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ha habido un error al crear la tabla", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonCrearTablaCochesActionPerformed

    private void campoRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoRutaMouseClicked
        int valor = fc.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            this.campoRuta.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_campoRutaMouseClicked

    private void botonCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarDatosActionPerformed
        JOptionPane.showMessageDialog(this, "Se han cargado " + gc.cargarTablaCoches(archivo) + " lineas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonCargarDatosActionPerformed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed
        String[] titulo = {"Matricula", "Marca", "Modelo", "Color", "Año", "Precio"};
        DefaultTableModel tabla = new DefaultTableModel(null, titulo);
        String consulta = "select * from coches";
        List<Coche> lista = gc.mostrarTablaCocches(consulta);
        String[] fila = new String[6];

        for (Coche l : lista) {
            fila[0] = l.getMatricula();
            fila[1] = l.getMarca();
            fila[2] = l.getModelo();
            fila[3] = l.getColor();
            fila[4] = l.getAño().toString();
            fila[5] = l.getPrecio().toString();

            tabla.addRow(fila);
        }
        this.tablaCoches.setModel(tabla);


    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void botonExportarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarDatosActionPerformed
        int valor = this.ventanaElegir.showSaveDialog(this.botonExportarDatos);
        if (valor == JFileChooser.APPROVE_OPTION) {
            File archivo = this.ventanaElegir.getSelectedFile();
            gc.exportarDatos(this.tablaCoches.getModel(), archivo.toPath());
            JOptionPane.showMessageDialog(this, "Se ha exportado correctamente el archivo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonExportarDatosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarDatos;
    private javax.swing.JButton botonCrearTablaCoches;
    private javax.swing.JButton botonExportarDatos;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JTextField campoRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConexion;
    private javax.swing.JTable tablaCoches;
    // End of variables declaration//GEN-END:variables
    GestionCoches gc = new GestionCoches();
    final JFileChooser fc = new JFileChooser();
    File archivo;
    final JFileChooser ventanaElegir = new JFileChooser();
}
