import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a score
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Get the grade using a separate method
        String grade = calculateGrade(score);

        // Display the grade
        System.out.println("Your Grade is: " + grade);

        scanner.close();
    }

    // Method to determine the grade based on score
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
