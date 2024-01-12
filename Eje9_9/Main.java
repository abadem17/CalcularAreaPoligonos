package Eje9_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int dato;

        do {
            System.out.println("Que tipo de poligono desea ingresar? ");
            System.out.println("1. Rectangulo." +
                    "\n2. Triangulo." +
                    "\n3. Salir");
            dato = entrada.nextInt();
            switch (dato){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Numero incorrecto, ingrese nuevamente.");
            }

        }while(dato != 3);
    }
}
