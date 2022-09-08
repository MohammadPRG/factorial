import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner intput = new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter number: ");
        n = intput.nextInt();

        for(int i=1; i<=n ;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

    }

}