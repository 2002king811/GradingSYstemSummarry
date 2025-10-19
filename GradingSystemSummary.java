package mi.gradingsystemsummary;

import java.util.Scanner;

public class GradingSystemSummary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int studentCount = 0;           // counter for students
        int totalStudents = 5;          // number of students to process

        // Array to store how many students scored each grade (index 1 to 9)
        int[] gradeCount = new int[10]; // index 0 unused

        while (studentCount < totalStudents) {
            System.out.print("Enter score for student " + (studentCount + 1) + ": ");
            int score = input.nextInt();

            int grade = 0;
            String remark = "";

            // Grading logic (same as previous program)
            if (score >= 80 && score <= 100) {
                grade = 1; remark = "Distinction";
            } else if (score >= 75) {
                grade = 2; remark = "Distinction";
            } else if (score >= 66) {
                grade = 3; remark = "Credit";
            } else if (score >= 60) {
                grade = 4; remark = "Credit";
            } else if (score >= 50) {
                grade = 5; remark = "Credit";
            } else if (score >= 45) {
                grade = 6; remark = "Credit";
            } else if (score >= 35) {
                grade = 7; remark = "Pass";
            } else if (score >= 30) {
                grade = 8; remark = "Pass";
            } else if (score >= 0) {
                grade = 9; remark = "Fail";
            } else {
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
                continue; // repeat for the same student
            }

            // Increment the grade counter
            gradeCount[grade]++;

            // Display individual result
            System.out.println("\n=== Student " + (studentCount + 1) + " Result ===");
            System.out.println("Score : " + score);
            System.out.println("Grade : " + grade);
            System.out.println("Remark: " + remark);
            System.out.println("------------------------------------\n");

            studentCount++;
        }

        // Display grade summary after all students are processed
        System.out.println("\n===== Grade Summary =====");
        for (int g = 1; g <= 9; g++) {
            System.out.println("Grade " + g + " : " + gradeCount[g] + " student(s)");
        }

        input.close();
    }
}
