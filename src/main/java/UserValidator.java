import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class UserValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (validate(username, password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }
    }
    
    public static boolean validate(String username, String password) {
        Properties properties = new Properties();
        try (InputStream inputStream = UserValidator.class.getResourceAsStream("/user.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        String storedUsername = properties.getProperty("username");
        String storedPassword = properties.getProperty("password");

        return username.equals(storedUsername) && password.equals(storedPassword);
    }
}
