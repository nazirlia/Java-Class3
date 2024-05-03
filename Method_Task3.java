public class Method_Task3 {
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        double c = 20;
        System.out.println("Average of numbers is: " + getAverage(a, b, c));
    }
    public static double getAverage(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;
    }
}
