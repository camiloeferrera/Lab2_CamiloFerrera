package lab2_camiloferrera;

public class Personaje {
    
    private String nombre, clase, raza, descripcion, nacionalidad;
    private double estatura,peso;
    private int edad;

    public Personaje(String nombre, String clase, String raza, String descripcion, String nacionalidad, double estatura, double peso, int edad) {
        this.nombre = nombre;
        this.clase = clase;
        this.raza = raza;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getClase() {
        return clase;
    }
    public String getRaza() {
        return raza;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public double getEstatura() {
        return estatura;
    }
    public double getPeso() {
        return peso;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString (){
        return "Nombre: " + nombre; 
    }

}