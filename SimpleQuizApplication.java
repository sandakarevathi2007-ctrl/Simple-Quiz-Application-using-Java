
import java.util.Scanner;

public class SimpleQuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which language is used for Android development?",
            "2. Which keyword is used to create a class in Java?",
            "3. Which method is the entry point of a Java program?",
            "4. Which data type stores whole numbers?",
            "5. Which symbol ends a Java statement?"
        };

        String[][] options = {
            {"A. HTML", "B. Java", "C. CSS", "D. SQL"},
            {"A. method", "B. static", "C. class", "D. new"},
            {"A. start()", "B. run()", "C. main()", "D. init()"},
            {"A. int", "B. String", "C. boolean", "D. char"},
            {"A. :", "B. ,", "C. .", "D. ;"}
        };

        char[] answers = {'B', 'C', 'C', 'A', 'D'};
        int score = 0;

        System.out.println("===== SIMPLE QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            String input = sc.nextLine().trim().toUpperCase();

            if (input.length() == 1 &&
                input.charAt(0) == answers[i]) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println(
                    "Wrong answer! Correct answer: " + answers[i]
                );
            }
        }

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " +
                           (questions.length - score));
        System.out.println("Final Score: " + score + "/" +
                           questions.length);
        System.out.println("Percentage: " +
                           (score * 100.0 / questions.length) + "%");

        sc.close();
    }
}
