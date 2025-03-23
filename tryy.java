import java.util.Scanner;

public class tryy {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Hello, World!");

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        System.out.println("Hello, " + name + "! Welcome to Java.");

       
        scanner.close();
    }
}
