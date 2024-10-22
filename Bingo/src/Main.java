// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int primero;
        int segundo;
        int casilla;
        int[][] tabla = new int[3][9];

        Random random = new Random();

        for (int j = 0; j < 9; j++) {
            primero = 10 * (j+1);
            for (int i = 0; i < 3; i++) {
                segundo =  random.nextInt(9);
                casilla = primero + segundo;
                tabla[i][j]= casilla;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println(" ");
        int columna= 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                if (tabla[i][j] > tabla[i+1][j]){
                    int temp= tabla[i][j];
                    tabla[i][j]=tabla[i+1][j];
                    tabla[i+1][j]= temp;
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            if(tabla[0][j]>tabla[1][j]){
                int temp= tabla[0][j];
                tabla[0][j]=tabla[1][j];
                tabla[1][j]= temp;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}