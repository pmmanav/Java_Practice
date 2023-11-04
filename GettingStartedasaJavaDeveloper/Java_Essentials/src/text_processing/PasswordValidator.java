package text_processing;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        String userName = "johndoe";
        String password = "ABC_1234";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new password: ");
        String newPassword = scanner.nextLine(); 
        scanner.close();
        Boolean validateResult = validatePassword(userName, password, newPassword);
        if(validateResult){
            System.out.println("Given Password is valid!");
        }
        else {
            System.out.println("Invalid Password!");
        }
    }
    /**
     * 
     * @param userName
     * @param password
     * @param newPassword
     * @return
     */
    public static Boolean validatePassword(String userName, String password, String newPassword){
        // verify atleast 8 characters long
        if(newPassword.length() < 8){
            return false;
        }
        // verify contains atleast 1 uppercase character 
        if(!Pattern.compile("[A-Z]").matcher(newPassword).find()){
            return false;
        }
        // verify contains 1 special character 
        if(!Pattern.compile("[^a-zA-Z0-9]").matcher(newPassword).find()){
            return false;
        }
        // verify newPassword does not contain username
        if(newPassword.contains(userName)){
            return false;
        }
        // neqPassword is not password
        if(newPassword.equals(password)){
            return false;
        }

        return true;
    }
}
