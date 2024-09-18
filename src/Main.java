
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n" +
                    "Ingrese la opcion que desea:\n"+
                    "1-\n"+
                    "2- Definir array y mostrarlo\n"+
                    "3- Mostrar multiplos de un numero.\n"+
                    "4- Mostrar mayor, menor y rango de un arreglo.\n"+
                    "5- Calcular promedio.\n"+
                    "6- Buscar valor.\n"+
                    "7- Sumar numero pares e impares.\n"+
                    "8- Ordenar arrays en forma ascendente y descendente.\n"+
                    "9- Convertir una cadena en un array de int, calcular suma y promedio.\n"+
                    "10- Devolver DNI con letra.\n"+
                    "11- Operaciones de multiplicación y adicción con arrays.\n"+
                    "12- Eliminando elementos de un array"

            );
            opcion = sc.nextInt();
            if (opcion==1){

            } else if (opcion==2) {
                Logica.punto2();
            } else if (opcion==3){
                Logica.punto3();
            } else if (opcion==4){
                Logica.punto4();
            } else if (opcion==5) {
                Logica.punto5();
            } else if (opcion==6){
                Logica.punto6();
            } else if (opcion==7) {
                Logica.punto7();
            } else if (opcion==8) {
                Logica.punto8();
            } else if (opcion==9) {
                Logica.punto9();
            } else if (opcion==10) {
                Logica.punto10();
            } else if (opcion==11) {
                Logica.punto11();
            } else if (opcion==12){
                Logica.punto12();
            }
        } while (opcion!=0);
    }

}