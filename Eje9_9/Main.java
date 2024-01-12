package Eje9_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int dato;
        double lado1=0,lado2=0,lado3=0;


        do {
            System.out.println("Que tipo de poligono desea ingresar? ");
            System.out.println("1. Rectangulo." +
                    "\n2. Triangulo." +
                    "\n3. Salir");
            dato = entrada.nextInt();
            switch (dato){
                case 1:
                    System.out.println("Digite el primer lado del rectangulo");
                    lado1 = entrada.nextDouble();
                    System.out.println("Digite el segundo lado del rectangulo");
                    lado2 = entrada.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(4,lado1 ,lado2);
                    double area = rectangulo.area();

                    poligono.add(rectangulo);
                    System.out.println(rectangulo.toString()+"\nArea= "+area);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Numero incorrecto, ingrese nuevamente.");
            }

        }while(dato != 3);
    }
}
