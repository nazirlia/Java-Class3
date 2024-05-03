import java.util.Scanner;

public class String_Task4 {
    public static void main(String[] args) {
        String text = "This is Java String Class";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sequence: ");
        String seq = sc.next();
        System.out.println(text.contains(seq));
    }
}
