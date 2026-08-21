import java.io.Console;
public class UserPass {
    public static void main(String[] args) {
        Console console =System.console();
        if (console==null){
            System.out.println("Console is not available");
            return;
        }
        char[] password = console.readPassword("enter Password");
        int pass=Integer.parseInt(new String(password));
        System.out.println("password entered successfully !"+pass);
        
        // Use passwors here if needed
        // Do not print actual password for security reasons.

    }
    
}
