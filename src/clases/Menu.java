package clases;

public class Menu {
    private GestorAlumnos gestorAlumnos = new GestorAlumnos();
    
    public void mostrarMenu() {
        System.out.println("1. Agregar Alumno");
        System.out.println("2. Mostrar Alumnos");
        System.out.println("3. Salir");
    }
    
    public void procesarOpcion(int opcion) {
        IOpcionMenu opcionMenu = null;
        
        switch(opcion) {
            case 1:
 //               opcionMenu = new OpcionAgregarAlumno();
                break;
            case 2:
  //              opcionMenu = new OpcionMostrarAlumnos();
                break;
            case 3:
                return;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        
        // Pasar gestorAlumnos a la opción seleccionada
        opcionMenu.ejecutar(gestorAlumnos);
    }
}
