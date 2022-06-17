package paquete4;

/**
 *
 * @author andreflores
 */
public class Ejecutor2 {

    public static void main(String[] args) {

        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        EstudiantePresencial est1 = new EstudiantePresencial(nombre, apellido,
                identificacion, edad);

        est1.establecerNombresEstudiante(nombre);
        est1.establecerApellidoEstudiante(apellido);
        est1.establecerIdentificacionEstudiante(identificacion);
        est1.establecerEdadEstudiante(edad);

        est1.establecerCostoCredito(50.5);
        est1.establecerNumeroCreditos(5);
        est1.calcularMatriculaPresencial();

        System.out.println(est1);

    }
}
