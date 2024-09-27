package login;
import java.util.Scanner;
public class SignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
        
        String Username = "admin";
        String Password = "password123";
        
        System.out.print("Enter username: ");
        Username = input.nextLine();
        
        System.out.print("Enter password: ");
        Password = input.nextLine();
        
        if (Username.equals("admin") && Password.equals("password123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }
	}

}
