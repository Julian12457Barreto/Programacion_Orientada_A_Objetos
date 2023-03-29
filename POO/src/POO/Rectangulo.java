package POO;

public class Rectangulo extends Figuras{
    private float base;
    private float altura;
    public Rectangulo(float base,float altura){
        this.base=base;
        this.altura=altura;
    }
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void calcularArea(){
        float area=0;
        area=base*altura;
        System.out.println("La Base del Rectangulo es:"+base+"La Altura del Rectangulo es:"+altura+"Y su Area es:"+area);
    }
}
