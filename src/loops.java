import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("The numbers are :");
        for(int i = 1; i<=n; i++) {

            System.out.print(i+",");
        }
    }
}
