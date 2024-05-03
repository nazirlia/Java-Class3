import java.util.Scanner;

public class Method_Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.next();
        System.out.println(validationChecker(password));

    }
    public static String validationChecker(String password){
        if (password.length()>8 || password.length()<3){
            return "Text is wrong";
        }
        else return "Text is okay";
    }
}
