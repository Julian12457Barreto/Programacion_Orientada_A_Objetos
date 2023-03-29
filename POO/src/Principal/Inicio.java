package Principal;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona ejecuta=new Persona();
        ejecuta.pedirDatos();
        ejecuta.calcularImc();
        ejecuta.mostrarPersona();
    }
}

