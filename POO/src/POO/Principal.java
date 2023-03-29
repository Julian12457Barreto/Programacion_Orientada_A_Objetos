package POO;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        float base;
        float altura;
        Scanner lectura=new Scanner(System.in);
        int opcion;
        System.out.println("Digite una Opcion de Una Figura de la Cual quiera conocer su Area:");
        System.out.println("1.Rectangulo.");
        System.out.println("2.Triangulo.");
        System.out.println("3.Circulo");
        opcion=lectura.nextInt();
        if (opcion==1) {
            System.out.println("Digite el Valor de la Base del Rectangulo");
            base=lectura.nextFloat();
            System.out.println("Digite el Valor de la Altura del Rectangulo");
            altura=lectura.nextFloat();
            Rectangulo ejecute=new Rectangulo(base,altura);
            ejecute.calcularArea();
        }
        else if (opcion==2) {
            float baseT;
            float alturaT;
            System.out.println("Digite la Base del Triangulo");
            baseT=lectura.nextFloat();
            System.out.println("Digite la Altura del Triangulo");
            alturaT=lectura.nextFloat();
            Triangulo ejecuteT=new Triangulo(baseT,alturaT);
            ejecuteT.calcularArea();
        }
        else if (opcion==3) {
            float radio;
            float pi=31416;
            System.out.println("Digite el Radio del Circulo");
            radio=lectura.nextFloat();
            Circulo ejecuteCir=new Circulo(radio,pi);
            ejecuteCir.calcularArea();
        }
        lectura.close();
    }
}