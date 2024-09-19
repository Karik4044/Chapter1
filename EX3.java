import java.util.Scanner;
public class EX3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Width: ");
        double width = keyboard.nextDouble();
        System.out.print("Input Height: ");
        double height = keyboard.nextDouble();
        System.out.println("rectangle's area is: " + (width * height));
        System.out.println("rectangle's perimeter is: " + (2*(width+height)));
    }
}
