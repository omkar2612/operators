public class code7 {
    public static void main(String[] args) {
        int x = 19;

        // int result = x++ + x++;
        int Finalresult = ++x + x++ + ++x;
        // System.out.println("Result: " + result);
        System.out.println("Final Result: " + Finalresult);
        System.out.println("Final value of x: " + x);
    }
}
