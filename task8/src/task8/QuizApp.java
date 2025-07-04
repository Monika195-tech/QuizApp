package task8;
import java.util.*;

public class QuizApp {

    static class Question {
        String question;
        String[] options;
        int correctOption;

        public Question(String question, String[] options, int correctOption) {
            this.question = question;
            this.options = options;
            this.correctOption = correctOption;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();
        int score = 0;

        questions.add(new Question("1. What are Java loops?",
                new String[]{"They open files", "They repeat code blocks", "They run only once", "They delete files"}, 2));

        questions.add(new Question("2. What is enhanced for-loop?",
                new String[]{"A loop that runs infinitely", "A loop that uses break", "A for-each loop", "A while loop"}, 3));

        questions.add(new Question("3. How do you handle multiple user inputs?",
                new String[]{"Using Scanner and loops", "Using int only", "Using break statement", "Using array only"}, 1));

        questions.add(new Question("4. How is switch-case different from if-else?",
                new String[]{"switch is only for strings", "if-else is for numbers only", "switch checks multiple cases easily", "if is faster always"}, 3));

        questions.add(new Question("5. What are collections in Java?",
                new String[]{"A group of files", "A framework to store/manipulate objects", "A type of loop", "None"}, 2));


        System.out.println("Welcome to the Java Quiz!");
        int qNo = 1;

        for (Question q : questions) {
            System.out.println("\n" + q.question);
            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }

            System.out.print("Your answer (1-4): ");
            int userAnswer;
            try {
                userAnswer = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" Invalid input! Skipping question.");
                scanner.next();
                qNo++;
                continue;
            }

            if (userAnswer == q.correctOption) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Incorrect. Correct Answer: " + q.correctOption);
            }

            qNo++;
        }

        System.out.println("\n Quiz Completed! Your Score: " + score + "/" + questions.size());
        scanner.close();
    }
}
