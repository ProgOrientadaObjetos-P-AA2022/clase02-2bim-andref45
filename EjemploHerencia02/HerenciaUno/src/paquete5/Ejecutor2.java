
package paquete5;

public class Ejecutor2 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numCre = 5;
        double costoCre = 50.5;
        
                
        EstudiantePresencial estDistancia = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCre, costoCre);
        
        estDistancia.calcularMatriculaPresencial();
        
        System.out.println(estDistancia);
    }
}