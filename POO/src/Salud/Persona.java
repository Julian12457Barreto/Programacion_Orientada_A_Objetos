package Salud;
import java.util.Scanner;

public class Persona {
    
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private double pesoActual;
    private String sexo;

    public Persona(){}
    
    
    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, double pesoActual, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.pesoActual = pesoActual;
        this.sexo = sexo;
    }


   
    
    
    public String getTipoDoc() {
        return tipoDoc;
    }


    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    public int getDocumento() {
        return documento;
    }


    public void setDocumento(int documento) {
        this.documento = documento;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getEstatura() {
        return estatura;
    }


    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public double getPesoActual() {
        return pesoActual;
    }


    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public void pedirDatos(){
    Scanner lectura=new Scanner(System.in);
    System.out.println("Registrese, Digite el Tipo de su Documento");
    tipoDoc=lectura.next();
    System.out.println("Digite su Documento");
    documento=lectura.nextInt();
    System.out.println("Digite sus Nombres");
    nombre=lectura.next();
    System.out.println("Digite sus Apellidos");
    apellido=lectura.next();
    System.out.println("Digite su Peso en Kg");
    peso=lectura.nextDouble();
    System.out.println("Digite su Estatura");
    estatura=lectura.nextDouble();
    System.out.println("Digite su Edad");
    edad=lectura.nextInt();
    System.out.println("Digite su Sexo");
    sexo=lectura.next();
    }

    public void calcularImc(){
        pesoActual=peso/estatura*estatura;
        if (pesoActual<=20) {
            System.out.println("Peso Bajo, Su Peso esta por debajo de lo Ideal");
        }
        else if (pesoActual>20&&pesoActual<=25) {
            System.out.println("Peso Ideal, Esta en su Peso Ideal");
        }
        else if (pesoActual>25) {
            System.out.println("SobrePeso, Usted tiene SobrePeso");
        }
        else{
            System.out.println("Su Peso es Invalido, Intente Nuevamente");
        }
        if (edad<18) {
            System.out.println("Usted es Menor de Edad");  
        }
        else if (edad>=18) {
            System.out.println("Usted es Mayor de Edad");  
        }
        else{
            System.out.println("Digita un Peso valido");
        }
    }
    
    public void mostrarPersona(){
        System.out.println("Los Datos que Usted Ingreso son los Siguientes:");
        System.out.println("Su Nombre es:"+nombre);
        System.out.println("Sus Apellidos son:"+apellido);
        System.out.println("Su Edad es:"+edad);
        System.out.println("El Tipo de su Documento es:"+tipoDoc);
        System.out.println("Su Documento es:"+documento);
        System.out.println("Su Peso en Kg es:"+peso);   
        System.out.println("Su Estatura es:"+estatura);
        System.out.println("Su Sexo es:"+sexo);
    }
}