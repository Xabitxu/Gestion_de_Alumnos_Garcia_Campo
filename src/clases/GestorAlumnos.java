package clases;

import java.util.ArrayList;

public class GestorAlumnos {
	private ArrayList<Alumno> alumnos = new ArrayList<>();

    public void a�adirAlumno(Alumno alumno) {
        alumnos.add(alumno);
        System.out.println("Alumno añadido: " + alumno);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

}
