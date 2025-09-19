public class code9 {
    public static void main(String[] args) {
        int x =0;
        // int result = ++x + ++x + ++x + ++x;
        int Finalresult = x++ + x++ + x++ + x++;
        System.out.println("Final Result: " + Finalresult);
        // System.out.println("Result: " + result);
        System.out.println("Final value of x: " + x);
    }
}
