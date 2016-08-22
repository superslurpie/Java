import java.util.Random;
public class P1E
{
    public static void main(String args[]){
        String[] movie = {"Up","Life of Pi", "Harambe the Musical"};
        String[] song = {"Uber Everywhere","Animal", "ABC Song"};

       for(int i =0; i < 6; i++){// how do you count the amount of things in each array?
           if (i <=2 ) {
           System.out.println("One of my Favorite Movies: " + movie[i]);
        }
            else if (i == 3){
                System.out.println("");
                System.out.println("");
            }
            if (i>= 3) { 
           System.out.println("One of my Favorite Songs:" + song[i-3]);
}
}
}
}