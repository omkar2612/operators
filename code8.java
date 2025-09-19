public class code8 {
    public static void main(String[] args) {
        int x =14;
        int y =22;
        // int result = ++x + y++;
        // int Finalresult = x++ + ++y + ++x + ++x;
        // System.out.println("Result: " + result);
        int finalResult = y++ + ++x + ++x;
        System.out.println(finalResult);
        // System.out.println("Final Result: " + Finalresult); //72
        System.out.println("Final value of x: " + x); //15
        System.out.println("Final value of y: " + y); //23
    }
}
