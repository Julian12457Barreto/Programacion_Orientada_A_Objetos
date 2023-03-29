package Salud;
import java.util.Scanner;
public class Empleado extends Persona{
    private String cargo;
    private double valorHora=4.833;
    private int horasTrabajadas;
    private String departamento;
    public Empleado(String tipoDoc,int documento,String nombre,String apellido,double peso,double estatura,int edad,double pesoActual,String sexo,String cargo,int valorHora,int horasTrabajadas,String departamento){
        super(tipoDoc,documento,nombre,apellido,peso,estatura,edad,pesoActual,sexo);
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Empleado(){}
    public void calcularHonorarios(){
        double reteica=0.966;
        double totalPagar;
        Scanner lectura=new Scanner(System.in);
        Persona p1=new Persona();
        System.out.println("Digite su Cargo");
        cargo=lectura.next();
        System.out.println("Digite cuantas Horas Trabajo");
        horasTrabajadas=lectura.nextInt();
        System.out.println("Digite el Departamento en donde Labora");
        departamento=lectura.next();
        System.out.println("Una Hora de Trabajo cuesta"+valorHora);
        System.out.println("El Tipo de Documento del Usuario es:"+p1.getTipoDoc());
        System.out.println("El Documento del Usuario es:"+p1.getDocumento());
        System.out.println("El Nombre del Usuario es:"+p1.getNombre());
        System.out.println("El Apellido del Usuario es:"+getApellido());
        System.out.println("El Cargo del usuario es:"+cargo);
        System.out.println("El Departamento donde Labora el Usuario es"+departamento);
        System.out.println("Las Horas Trabajadas por el Usuario son:"+horasTrabajadas);
        System.out.println("El Costo por Hora Trabajada es de"+valorHora);
        totalPagar=valorHora*horasTrabajadas-reteica;
        System.out.println("El Total que se le debe pagar al Usuario es de:"+totalPagar);
    }
    
}

