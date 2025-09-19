public class StudentMarks {
    public static void main(String[] args) {
        int maths = 80;
        int science = 70;
        int english = 90;

        // Arithmetic operators
        int total = maths + science + english;
        double percentage = (total / 300.0) * 100;

        // Relational operator
        boolean pass = percentage >= 40;

        // Unary operator (bonus mark for attendance)
        total++;
        
        System.out.println("Total Marks (with bonus): " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Pass Status: " + pass);
    }
}
