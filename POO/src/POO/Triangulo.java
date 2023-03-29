package POO;

public class Triangulo extends Figuras{
    private float baseT;
    private float alturaT;
    public Triangulo(float baseT,float alturaT){
        this.baseT=baseT;
        this.alturaT=alturaT;
    }
    public float getBase() {
        return baseT;
    }
    public void setBase(float baseT) {
        this.baseT = baseT;
    }
    public float getAltura() {
        return alturaT;
    }
    public void setAltura(float alturaT) {
        this.alturaT = alturaT;
    }
    public void calcularArea(){
        float area=0;
        area=baseT*alturaT/2;
        System.out.println("La Base del Triangulo es"+baseT+"La Altura del Triangulo es:"+alturaT+"El Area del Triangulo es:"+area);
    }
}
