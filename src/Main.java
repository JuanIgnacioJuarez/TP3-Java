import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Punto 2:

        /*int [] arreglo = new int[5];
        int i;

        for (i=0; i < arreglo.length; i = i+1){
            System.out.println("Ingrese un número para la posición " + i);
            arreglo[i] = sc.nextInt();
        }

        System.out.println("El arreglo entonces es: ");
        for (i=0; i < arreglo.length; i = i+1){
            System.out.print(arreglo[i] + " ");
        }*/


        //Punto 3:

        /*System.out.println("Ingrese de que tamaño desea que sea el arreglo: ");
        int dimension = sc.nextInt();
        int [] arreglo = new int[dimension];
        System.out.println("Ingrese un valor entero para calcular sus múltiplos: ");
        int num = sc.nextInt();
        int i;

        for (i=0; i < arreglo.length; i++){
            arreglo[i] = num*(i+1);
        }

        System.out.println("Los múltiplos de " + num + " entonces son: ");
        for (i=0; i < arreglo.length; i = i+1){
            System.out.print(arreglo[i] + " ");
        }*/


        //Punto 4:

        /*Double[] arreglo = new Double[20];
        System.out.println("Ingrese 20 número decimales: ");
        int i;
        double mayor = 0, menor = 0, rango;

        for (i=0; i < arreglo.length; i++ ) {
            arreglo[i] = sc.nextDouble();
            if (arreglo[i] > mayor){
                mayor = arreglo[i];
                menor = mayor;
            }
        }

        for (i=0; i < arreglo.length; i++) {
            if (arreglo[i] < menor){
                menor = arreglo[i];
            }
        }

        rango = mayor - menor;

        System.out.println("El rango entre los números " + mayor + " y " + menor + " es " + rango);*/


        //Punto 5:

        Random random = new Random();
        double [] arreglo = new double[20];
        int i, j, cont=0, contIguales=0, contMenores=0, contMayores=0, var;
        double prom, suma=0.0;

        for (i=cont; cont<20;) {
            var = random.nextInt(100);
            if (var % 2 == 0){
                arreglo[i] = var;
                cont = cont+1;
                suma = suma + arreglo[i];
            }
        }

        System.out.println(suma);
        prom = suma / 20;
        prom = Math.round(prom);

        for (j=0; j<arreglo.length; j++) {
            if (arreglo[j] == prom) {
                contIguales++;
            }else{
                if (arreglo[j] > prom) {
                    contMayores++;
                }else{
                    contMenores++;
                }
            }
        }

        System.out.println("El promedio de los número ingresados es: " + prom);
        System.out.println("Hay " + contIguales + " números iguales al promedio");
        System.out.println("Hay " + contMenores + " números menores al promedio");
        System.out.println("Hay " + contMayores + " números mayores al promedio");

    }
}