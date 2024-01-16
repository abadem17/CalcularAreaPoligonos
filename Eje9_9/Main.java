package Eje9_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    public static void main(String[] args) {

        llenarPoligono();

    }
    public static void llenarPoligono(){
            Scanner entrada = new Scanner(System.in);
            int dato;
            double lado1=0,lado2=0,lado3=0, area;


            do {
                System.out.println("Que tipo de poligono desea ingresar? ");
                System.out.println("1. Rectangulo." +
                        "\n2. Triangulo." +
                        "\n3. Mostrar poligonos"+
                        "\n4. Salir");
                System.out.print("Opcion: ");

                dato = entrada.nextInt();
                switch (dato){
                    case 1:
                        llenarRectangulo();
                        break;
                    case 2:
                        llenarTriangulo();
                        break;
                    case 3:
                        mostrarDatos();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Numero incorrecto, ingrese nuevamente.");
                }

            }while(dato != 4);
        }
        public static void llenarRectangulo(){
        Scanner entrada = new Scanner(System.in);
        double lado1,lado2,area;

            System.out.println("Digite el primer lado del rectangulo");
            lado1 = entrada.nextDouble();
            System.out.println("Digite el segundo lado del rectangulo");
            lado2 = entrada.nextDouble();

            Rectangulo rectangulo = new Rectangulo(4,lado1,lado2);
            area = rectangulo.area();
            rectangulo = new Rectangulo(4,lado1 ,lado2, area);


            poligono.add(rectangulo);
            System.out.println(rectangulo.toString()+"\nArea= "+area);
            System.out.println();

            System.out.println();
        }
        public static void llenarTriangulo(){
        Scanner entrada = new Scanner(System.in);
        double lado1,lado2,lado3,area;

            System.out.println("Digite el primer numero: ");
            lado1 = entrada.nextDouble();
            System.out.println("Digite el segundo numero: ");
            lado2 = entrada.nextDouble();
            System.out.println("Digite el tercer numero: ");
            lado3 = entrada.nextDouble();

            Triangulo triangulo = new Triangulo(3,lado1,lado2,lado3);
            area = triangulo.area();
            triangulo = new Triangulo(3,lado1, lado2, lado3, area);


            poligono.add(triangulo);
            System.out.println(triangulo.toString() + "\nArea: "+area);
            System.out.println();

            System.out.println();
        }
        public static void mostrarDatos(){
            for (int i = 0; i < poligono.size(); i++) {
                System.out.println(poligono.get(i));
                System.out.println();
            }
            System.out.println();
        }

}
