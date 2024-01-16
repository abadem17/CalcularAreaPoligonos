package Eje9_9;

public class Rectangulo extends Poligono{

    private double lado1,lado2,area;

    public Rectangulo(int nLados, double lado1, double lado2, double area) {
        super(nLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
    }

    public Rectangulo(int nLados, double lado1, double lado2) {
        super(nLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo:\n" +super.toString()+"\nlado1= " + lado1 + ", lado2= " + lado2+ ", area= " + area;
    }

    @Override
    public double area() {

        return lado1*lado2;

    }


}
