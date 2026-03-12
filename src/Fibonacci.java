import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a  = sc.nextInt();
        System.out.println("Enter the other number : ");
        int b  = sc.nextInt();
        System.out.println("Till the number ? :");
        int n = sc.nextInt();

        System.out.println("The Series is :");
        for(int i = 1; i<=n; i++ ) {
            System.out.println(a + ",");
            int c = a + b ;
            a = b ;
            b = c ;
        }
        sc.close();
    }
}
