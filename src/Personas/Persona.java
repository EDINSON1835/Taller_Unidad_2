package Personas;

public class Persona {
    private String nombre, apellido, genero, cargo;
    private int edad;
    private double sueldoHora;

    public Persona(String nombre, String apellido, int edad, String genero, double sueldoHora, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.sueldoHora = sueldoHora;
        this.cargo = cargo;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public String getGenero() { return genero; }
    public double getSueldoHora() { return sueldoHora; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", " + cargo + ", $" + sueldoHora + "/h";
    }
}
