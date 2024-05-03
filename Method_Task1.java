import java.util.Scanner;

public class Method_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add first number");
        int a = sc.nextInt();
        System.out.println("Add second number");
        int b = sc.nextInt();
        System.out.println("Sum equals to " + getTotal(a,b));
    }

    public static int getTotal(int num1, int num2){
        return num1 + num2;
    }
}
