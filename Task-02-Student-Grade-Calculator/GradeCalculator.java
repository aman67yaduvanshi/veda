import java.util.*;

public class GradeCalculator {

    static final int MAX_MARKS_PER_SUBJECT = 100;

    static int readMark(Scanner sc, String subject) {
        while (true) {
            System.out.print("Enter marks for " + subject + " (0-" + MAX_MARKS_PER_SUBJECT + "): ");
            if (!sc.hasNextInt()) {
                System.out.println("  Invalid input! Please enter a number.");
                sc.next();
                continue;
            }
            int mark = sc.nextInt();
            if (mark < 0 || mark > MAX_MARKS_PER_SUBJECT) {
                System.out.println("  Invalid marks! Must be between 0 and " + MAX_MARKS_PER_SUBJECT + ".");
            } else {
                return mark;
            }
        }
    }

    
    static int readSubjectCount(Scanner sc) {
        while (true) {
            System.out.print("Enter number of subjects: ");
            if (!sc.hasNextInt()) {
                System.out.println("  Invalid input! Please enter a no..");
                sc.next();
                continue;
            }
            int n = sc.nextInt();
            if (n < 1) {
                System.out.println("  There must be at least 1 subject.");
            } else {
                return n;
            }
        }
    }

    static int calculateTotal(int[] marks) {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    static double calculatePercentage(int total, int subjects) {
        return (total * 100.0) / (subjects * MAX_MARKS_PER_SUBJECT);
    }

    static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "F (Fail)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator ====");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int n = readSubjectCount(sc);
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = readMark(sc, "Subject " + (i + 1));
        }

        int total = calculateTotal(marks);
        double percentage = calculatePercentage(total, n);
        String grade = calculateGrade(percentage);

        System.out.println("\n========== RESULT =========");
        System.out.println("Student    : " + name);
        System.out.println("Total      : " + total + " / " + (n * MAX_MARKS_PER_SUBJECT));
        System.out.printf("Percentage : %.2f%%%n", percentage);
        System.out.println("Grade      : " + grade);
        System.out.println("===========================");

        sc.close();
    }
}
