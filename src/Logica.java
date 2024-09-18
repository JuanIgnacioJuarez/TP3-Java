import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Logica {

    public static void punto2() {
        //Punto 2:
        Scanner sc = new Scanner(System.in);
        int [] arreglo = new int[5];
        for (int i=0; i < arreglo.length; i++){
            System.out.println("Ingrese un número para la posición " + i);
            arreglo[i] = sc.nextInt();
        }
        System.out.println("El arreglo entonces es: "+ Arrays.toString(arreglo));
    }

    public static void punto3() {
        //Punto 3:
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese de que tamaño desea que sea el arreglo: ");
        int dimension = sc.nextInt();
        int [] arreglo = new int[dimension];
        System.out.println("Ingrese un valor entero para calcular sus múltiplos: ");
        int num = sc.nextInt();
        for (int i=0; i < arreglo.length; i++){
            arreglo[i] = num*(i+1);
        }
        System.out.println("Los múltiplos de " + num + " entonces son: "+ Arrays.toString(arreglo));
    }

    public static void punto4(){
        //Punto 4:
        Scanner sc = new Scanner(System.in);
        Double[] arreglo = new Double[20];
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
        System.out.println("El rango entre los números " + mayor + " y " + menor + " es " + rango);
    }

    public static void punto5() {
        //Punto 5:
        //Se declara el array y se le asignan valores pares enteros aleatorios.
        int suma = 0;
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            int numAleatorio = (int) (Math.random() * 100) + 1;
            if(numAleatorio % 2 == 0){
                numeros[i]=numAleatorio;
            }else {
                numeros[i]=numAleatorio+1;
            }
            suma += numeros[i]; //Se suman los valores enteros pares del array.
        }

        int promedioAritmetico = suma / numeros.length; //Se cacula el promedio aritmetico.
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
        //Punto 6:
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

    public static void punto7(){
        //Punto 7:
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
        //Punto 8:
        Scanner sc = new Scanner(System.in);
        int dim = 10;
        int [] numeros = new int[dim];
        for(int i = 0; i<numeros.length; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° numero entero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Array original: "+Arrays.toString(numeros));
        Arrays.sort(numeros);
        int [] descendentes = new int[dim];
        int [] ascendentes;
        ascendentes = numeros;
        for(int i=0; i<numeros.length; i++){
            descendentes[(dim-1)-i] = numeros[i];
        }
        System.out.println(Arrays.toString(ascendentes));
        System.out.println(Arrays.toString(descendentes));
    }

    public static void punto9() {
        //Punto 9:
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de números separadas por guiones medio.");
        String cadena = sc.nextLine();
        String [] numerosStr = cadena.split("-");
        int [] numerosInt = new int [numerosStr.length];
        int suma=0;
        double promedio=0;
        for(int i=0; i<numerosStr.length;i++){
            numerosInt[i] = Integer.parseInt(numerosStr[i]);
            suma+=numerosInt[i];
        }
        promedio=suma/numerosInt.length;
        System.out.println("La suma total es: "+suma+"\n"+
                           "El promedio es: "+promedio);
    }

    public static void punto10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su DNI: ");
        long dni = sc.nextLong();
        char [] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = (int) dni%23;
        String dniToString = String.valueOf(dni);
        String dniConLetra = buscarLetraP10(resto, letras, dniToString);
        System.out.println(dniConLetra);
    }
    public static String buscarLetraP10 (int resto, char[]letras, String dniToString){
        char letra = letras[resto];
        String letraToString = String.valueOf(letra);
        return dniToString+letraToString;
    }

    public static void punto11(){
        //Punto 11:
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        System.out.println("Ingrese 5 números enteros: ");
        for(int i = 0; i < array1.length; i++){
            System.out.print((i + 1) + ". ");
            array1[i] = sc.nextInt();
        }

        int[] array2 = new int[10];
        System.out.println("Ingrese 10 números enteros: ");
        for(int i = 0; i < array2.length; i++){
            System.out.print((i + 1) + ". ");
            array2[i] = sc.nextInt();
        }

        int[] array3 = new int[5];
        for(int i = 0; i < array1.length; i++){
            array3[i] = 0;
            for(int j = 0; j < array2.length; j++){
                array3[i] += array1[i] * array2[j];
            }
        }

        System.out.println("\n");
        System.out.println("Primer array:       " + Arrays.toString(array1));
        System.out.println("Segundo array:      " + Arrays.toString(array2));
        System.out.println("Resultado final:    " + Arrays.toString(array3));
    }

    public static void punto12(){
        //Punto 12:
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Ingrese 10 números enteros: ");
        for(int i = 0; i < array.length; i++){
            System.out.print((i + 1) + ". ");
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Ingrese un número que desee eliminar: ");
        int borrarnum = sc.nextInt();

        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] != borrarnum){
                count++;
            }
        }

        int[] array2 = new int[count];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != borrarnum){
                array2[index++] = array[i];
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
