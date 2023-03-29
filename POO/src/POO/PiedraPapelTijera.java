package POO;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego{

    private String jugador;
    private int resultado;
    private int sistema;
    Scanner lectura=new Scanner(System.in);
    public void iniciar() {
        System.out.println("Digita el Nombre del Jugador");
        jugador=lectura.next();
    }
    public void jugar() {
        System.out.println("Digite Una Opcion:");
        System.out.println("1.Piedra");
        System.out.println("2.Papel");
        System.out.println("3.Tijeras");
        resultado=lectura.nextInt();
        Random aleatorio=new Random();
        sistema=aleatorio.nextInt(3)+1;
    }
    public void finalizar() {
        if(resultado==sistema){
            System.out.println("Es un Empate con la Maquina");
        }
        else if(resultado==2&&sistema==1){
            System.out.println("Papel Vence a Piedra.");
            System.out.println("Usted Gano el Juego");
        }
        else if(resultado==3&&sistema==2){
            System.out.println("Tijera Vence a Papel");
            System.out.println("Usted Gano el Juego");
        }
        else if(resultado==1&&sistema==3){
            System.out.println("Piedra Vence a Tijera.");
            System.out.println("Usted Gano el Juego");
        }
        else{
            System.out.println("Ingresa Una Opcion Valida");
        }
    }
    
}

