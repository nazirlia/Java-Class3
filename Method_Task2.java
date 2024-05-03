public class Method_Task2 {
    public static void main(String[] args) {
        int a = 115;
        int b = 110;
        int c = 42;

        System.out.println("smallest number is " + getSmallest(a,b,c));
    }
    public static int getSmallest(int a , int b, int c){
        if (a < b && a < c){
            return a;
        } else if (b < c){
            return b;
        } else {
            return c;
        }
    }
}
