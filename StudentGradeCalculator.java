import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== STUDENT GRADE CALCULATOR ===");

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Number of subjects must be positive.");
            sc.close();
            return;
        }

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i
                    + " (0-100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter 0 to 100.");
                i--;
                continue;
            }

            totalMarks += marks;
        }

        double percentage = (double) totalMarks / subjects;
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else if (percentage >= 33) {
            grade = "E";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Total Subjects: " + subjects);
        System.out.println("Total Marks: " + totalMarks
                + " / " + (subjects * 100));
        System.out.printf("Average Percentage: %.2f%%%n",
                percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
