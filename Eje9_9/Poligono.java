package Eje9_9;

public abstract class Poligono {
    protected int nLados;

    public Poligono(int nLados) {
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    @Override
    public String toString() {
        return "Numero de lado= " + nLados;
    }

    //Declaramos el metodo como abstracto
    public abstract double area();

}
