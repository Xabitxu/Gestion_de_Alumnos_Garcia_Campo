package clases;

public class Alumno {
	 private String nombre;
	    private int edad;

	    public Alumno(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    @Override
	    public String toString() {
	        return "Alumno{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
	    }
}
