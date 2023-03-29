package Salud;
public class Ejecutar {
    public static void main(String[] args) {
        Empleado muestra=new Empleado();
        Persona ejecuta=new Persona();
        ejecuta.pedirDatos();
        ejecuta.mostrarPersona();
        muestra.calcularHonorarios();
       
        
    }
}