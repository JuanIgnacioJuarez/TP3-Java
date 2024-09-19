
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("""
                               INGRESE LA OPCIÓN QUE DESEE:
                               1- Intentar acceder a un elemento fuera de rango del array (teoría).
                               2- Definir array y mostrarlo
                               3- Mostrar multiplos de un numero.
                               4- Mostrar mayor, menor y rango de un arreglo.
                               5- Calcular promedio.
                               6- Buscar valor.
                               7- Sumar numeros pares e impares.
                               8- Ordenar arrays en forma ascendente y descendente.
                               9- Convertir una cadena en un array de int, calcular suma y promedio.
                               10- Devolver DNI con letra.
                               11- Sumatoria de multiplicación de un array con otro array.
                               12- Eliminando elementos de un array.
                               0 - SALIR """);
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> Logica.punto1();
                case 2 -> Logica.punto2();
                case 3 -> Logica.punto3();
                case 4 -> Logica.punto4();
                case 5 -> Logica.punto5();
                case 6 -> Logica.punto6();
                case 7 -> Logica.punto7();
                case 8 -> Logica.punto8();
                case 9 -> Logica.punto9();
                case 10 -> Logica.punto10();
                case 11 -> Logica.punto11();
                case 12 -> Logica.punto12();
            }
        } while (opcion!=0);
    }

}