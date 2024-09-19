import java.util.Scanner;
public class EX2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = keyboard.nextLine();
        int leng = str.length();
        System.out.println("The number of characters in the string is " + leng);
    }
}
