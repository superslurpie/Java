import java.util.Random;
import java.lang.Math;
public class P1F
{
    public static void main(String args[]){
        Random rn = new Random();
        int[] number = new int[50];
        
        for (int i =0; i<=49; i++){
            int k = (int) Math.floor(Math.random() * 101);
            System.out.println(k);
            System.out.println(i);
            number[i] = k;
            System.out.println(number);
        }
    }
}

