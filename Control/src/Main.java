import java.util.Random;
import java.util.Scanner;


public class Main {

    private static int fil;
    private static int col;
    void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(matriz[i][j]) ;
            }
        }
    }


    public static void main(String[] args) {
        //creacion de variables: tamaño de la matriz, matriz de numeros, matriz de letras y elemento Random
        int filas = 10;
        int columnas = 10;
        Random ale = new Random();
        int matriznumeros[][] = new int[filas][columnas];
        String matrizLetras[][] = new String[filas][columnas];

        matrizletras.imprimirMatriz;


        // asignamos a cada casilla de la matriz de numeros un aleatorio del 10 al 99
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriznumeros[i][j] = ale.nextInt(10, 100);
            }
        }

        for (int a = 0; a < filas; a++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriznumeros[a][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizLetras[i][j] = "XX";
            }
        }


        Scanner leer=new Scanner(System.in);

        for (int i = 1; i <11; i++) {
            System.out.println("Adivina numeros:");

            //Imprimimos la matriz por pantalla

            for (int h = 0; h <filas; h++) {
                for (int n = 0; n <columnas; n++) {
                    System.out.print(matrizLetras[h][n]+" ");
                }
                System.out.println();
            }

            System.out.println("Numero a buscar "+i);

            int NumUsua=leer.nextInt();

            for (int j = 0; j <filas; j++) {
                for (int k = 0; k <columnas; k++) {
                    if (matriznumeros[j][k]==NumUsua){
                        matrizLetras[j][k]= String.valueOf(matriznumeros[j][k]);
                        System.out.println("Acierto. El numero" +matriznumeros[j][k] +"está en la posicion " +j + " " +k );
                    }
                }
            }
        }



    }
}