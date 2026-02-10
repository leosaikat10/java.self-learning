import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Are you single ?");
        boolean single = sc.nextBoolean();
        System.out.println("my name is "+name);
        System.out.println("My age is "+age);
        System.out.println("Are you single ?"+single);
    }
}
