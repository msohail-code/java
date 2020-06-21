//import java.util.Scanner to get input from user
import java.util.Scanner;

public class table {
    //creating table program
    //cool thing is you just need to write little code
    public static void main(String[] args) {
        //getting input as number from user
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt(); //humna x ma input la li hai
        //ab hum table ko print krwain ga

        for(int i=1;i<=10;i++){

            /**
            *Nicha wali line important hai, isma hum pehly i ki
            value print krwa rahe hai, phir * phir x ki value phir 
            "=" and last ma hum "x*i" print krwa raha hai
            */
            System.out.print(i+"*"+x+"="+x*i);
            //printing new line
            System.out.println("\n");
        }

        //scanner ko lazmi close krna hai
        sc.close();
        
    }
}