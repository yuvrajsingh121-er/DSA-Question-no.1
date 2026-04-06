import java.util.*;

public class BasicJava {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter value of a");
        int a = sc.nextInt();
         System.out.println("enter value of b");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two  number: "+sum);
        sc.close();

    }
}

