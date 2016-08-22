import java.util.Random;
import java.lang.Math;
public class P1G
{
    public static void main(String args[]){
        Random rn = new Random();
        int[] number = new int[10];
        
        for (int i =0; i<=9; i++){
            int s = (int) Math.floor(Math.random() * 2);
            int negative = 0;
            if (s == 0) {
                negative = 1;
            } else {
                negative = -1;
            }
            int k = (int) Math.floor(Math.random() * 101*negative);
            number[i] = k;
        
        }
        int i = 0;
        while (i<10) {
            System.out.println(number[i]);
            i++;
        }
        int o = 0;
        System.out.println("Now for positive only");
        while (o<10) {
            int r = number[o];
            if (r > 0) {
               System.out.println(r);
             
            }
            o++;
        }
}
}
