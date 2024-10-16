import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Code: A1, Product: soda, Price: $1.50");
        System.out.println("Code: B2, Product: chips, Price: $1.25");
        System.out.println("Code: C3, Product: candy, Price: $0.75");
        System.out.println("Code: D4, Product: water, Price: $1.00");
        System.out.println("Enter a code");

        String code = reader.nextLine();

        switch (code) {
            case "A1":
                System.out.println("Code: A1, Product: soda, Price: $1.50");
                break;

            case "B2":
                    System.out.println("Code: B2, Product: chips, Price: $1.25");
                    break;

            case "C3":
                System.out.println("Code: C3, Product: candy, Price: $0.75");
                break;

            case "D4":
                System.out.println("Code: D4, Product: water, Price: $1.00");
                break;

            default:
                System.out.println("This code does not exist");
        }
    }
}