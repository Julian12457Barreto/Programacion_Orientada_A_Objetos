package POO;

public class Circulo extends Figuras{
    private float radio;
    private float pi=31416;
    public Circulo(float radio, float pi){
        this.radio=radio;
        this.pi=pi;
    }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public void calcularArea(){
        float area=0;
        area=pi*radio*radio;
        System.out.println("El Radio del Circulo es:"+radio+"El Area del Circulo es:"+area);

    }
}
