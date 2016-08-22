import java.util.Random;
import java.lang.Math;
public class P1H
{
    public static void main(String args[]){
        String[] music = new String[3];
        music[0] = "Adele";
        music[1] = "Miley Cirus";
        music[2] = "Justin Bieber";
      
        for (int i = 0;i<3; i++){
           System.out.println(music[i]); 
        }
         int randno = (int) Math.floor(Math.random() * 3);
        music[randno] = "Michael Jackson";
        
        for (int i = 0; i<3; i++) {
           if (music[i].equals(music[randno])) {
            System.out.println("We found Michael!");
            } else {
               System.out.println("No Michael in music["+i+"].");
            }
           
        }
}
}
