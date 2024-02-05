import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("enter a degree in celsius");

        double celsius = input.nextDouble();

        double fahrenheit = 9.0 / 5 * celsius + 32;

        System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit ");


    }
}
