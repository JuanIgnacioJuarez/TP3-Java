import java.util.Arrays;
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

        /*public static void punto5() {
            //Se declara el array y se le asignan valores enteros aleatorios.
            int suma = 0;
            int[] numeros = new int[20];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 100) + 1;
                suma += numeros[i]; //Se suman los valores del array.
            }

            int promedioAritmetico = suma / 20; //Se cacula el promedio aritmetico.
            int igualAlPromedio = 0;
            int mayorAlPromedio = 0;
            int menorAlPromedio = 0;
            //Se recorre el array y se determina si cada valor es mayor, menor o igual al promedio.
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == promedioAritmetico) {
                    igualAlPromedio++;
                } else if (numeros[i] > promedioAritmetico) {
                    mayorAlPromedio++;
                } else {
                    menorAlPromedio++;
                }
            }
            System.out.println("Array: \n"+ Arrays.toString(numeros));
            System.out.println("El promedio aritmetico es: " + promedioAritmetico);
            System.out.println("La cantidad de numeros igual al promedio es: " + igualAlPromedio);
            System.out.println("La cantidad de numeros mayor al promedio es: " + mayorAlPromedio);
            System.out.println("La cantidad de numeros menor al promedio es: " + menorAlPromedio);
        }


        public static void punto6(){
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int [] numeros = new int [50];
            for(int i = 0; i<numeros.length; i++){
                numeros[i]= random.nextInt(100); //Se define un rango de 100 para no trabajar con numeros tan grandes.
            }
            boolean encontrado = false;
            System.out.println("Array: "+Arrays.toString(numeros));
            System.out.println("Ingrese el valor que desea buscar: ");
            int valor = sc.nextInt();
            for(int i = 0; i< numeros.length;i++){
                if (valor==numeros[i]){
                    System.out.println("Valor encontrado.\n"+
                            "El valor "+valor+" esta en la posicion: "+i);
                    encontrado=true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("El valor "+valor+" no esta en el array.");
            }
        }

        public static void punto7 (){
            Scanner sc = new Scanner(System.in);
            int [] numeros = new int[20];
            int sumaPar=0;
            int sumaImar=0;
            for(int i = 0; i<numeros.length; i++){
                System.out.println("Ingrese el "+(i+1)+"° numero entero: ");
                numeros[i]=sc.nextInt();
                if(numeros[i]%2==0){
                    sumaPar+=numeros[i];
                }else{
                    sumaImar+=numeros[i];
                }
            }
            System.out.println("Array: "+Arrays.toString(numeros));
            System.out.println("La suma de los numeros pares es: "+sumaPar);
            System.out.println("La suma de los numeros impares es: "+sumaImar);
        }

        public static void punto8(){
            Scanner sc = new Scanner(System.in);
            int [] numeros = new int[10];
            int [] ascendentes;
            int [] descendentes;

            for(int i = 0; i<numeros.length; i++) {
                System.out.println("Ingrese el " + (i + 1) + "° numero entero: ");
                numeros[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(numeros));
        }*/

    }
}