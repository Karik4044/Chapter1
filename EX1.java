import java.util.*;
public class EX1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = keyboard.nextInt();
        System.out.println("Sin(n) = " + Math.sin(num));
        System.out.println("Cos(n) = " + Math.cos(num));
        System.out.println("Square root of n is: " + Math.sqrt(num));

    }
}
