import java.util.Scanner;

public class PrintPersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables
        String firstName, lastName, streetAddress, city, zipCode;
        
        // Input data
        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();
        
        System.out.print("Enter Street Address: ");
        streetAddress = scanner.nextLine();
        
        System.out.print("Enter City: ");
        city = scanner.nextLine();
        
        System.out.print("Enter Zip Code: ");
        zipCode = scanner.nextLine();
        
        // Print the information
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
        
        // Close the scanner
        scanner.close();
    }
}
