package coche;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Integer año;
    private Double precio;

    public Coche(String matricula, String marca, String modelo, String color, Integer año, Double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Matricula......" + matricula + "\nMarca..... " + marca + "\nModelo...... " + modelo + "\nColor......" + color + "\nAño....... " + año + "\nPrecio..... " + precio;
    }
}
