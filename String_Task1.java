import java.util.Scanner;

public class String_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String text = sc.next();
        System.out.println("Enter number of index you want to see: ");
        int index = sc.nextInt();
        System.out.println(text.charAt(index));
        System.out.println();
    }

}
