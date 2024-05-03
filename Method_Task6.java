import java.util.Scanner;

public class Method_Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add first number");
        int num1 = sc.nextInt();
        System.out.println("Add second number");
        int num2 = sc.nextInt();
        System.out.println("Select operation: 1 for +; 2 for -; 3 for x; 4 for /");
        int operation = sc.nextInt();
        System.out.println("Answer is: " + calculator(num1,num2,operation));
    }
    public static int calculator(int num1, int num2, int operation){
        if (operation == 1){
            return num1 + num2;
        } else if (operation == 2) {
            return num1 - num2;
        } else if (operation == 3) {
            return num1*num2;
        } else return num1/num2;
    }
}
