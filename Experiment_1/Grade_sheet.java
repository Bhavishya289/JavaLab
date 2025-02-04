import java.util.Scanner;

public class Grade_sheet{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your SAP ID: ");
            int id = scanner.nextInt();
            
            System.out.print("Enter your Roll Number: ");
            int roll = scanner.nextInt();
            // Subject marks
            int maths = 80;
            int eng = 75;
            int hindi = 90;
            int sst = 68;
            int music = 100;
            
            int totalMarks = maths + eng + hindi + sst + music;
            double perc = (double) totalMarks / 500 * 100;
            
            System.out.println("SAP ID: " + id);
            System.out.println("Roll Number: " + roll);
            System.out.println("Percentage: " + perc + "%");
            
            if (perc <= 100 && perc >= 80) {
                System.out.println("A grade");
            } else if (perc < 80 && perc >= 60) {
                System.out.println("B grade");
            } else if (perc < 60 && perc >= 40) {
                System.out.println("C grade");
            } else if (perc < 40 && perc >= 20) {
                System.out.println("D grade");
            } else if (perc < 20 && perc >= 0) {
                System.out.println("You are fail");
            }
        }
    }
}