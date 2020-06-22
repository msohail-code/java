import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt(); //geting user input
        for(int i=1;i<=10;i++){
            System.out.print(i+"*"+x+"="+x*i); //print product of i and x
            System.out.println("\n");
        }
        sc.close();
    }
}