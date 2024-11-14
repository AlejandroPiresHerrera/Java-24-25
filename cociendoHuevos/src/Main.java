
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        short h, c;
        float t;

        h = lee.nextShort();
        c = lee.nextShort();

        while(h != 0 && c != 0){
            t = (float) h / c;

            if(t > (short)h/c){
                t = t + 1;
            }

            System.out.println((short)t * 10);

            h = lee.nextShort();
            c = lee.nextShort();
        }
    }
}
