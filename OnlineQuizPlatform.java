import java.util.Scanner;

public class OnlineQuizPlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] questions = {
            "What is the capital of France?",
            "Which programming language is used for Android development?",
            "What is 5 + 7?",
            "Who is the inventor of Java programming language?",
            "Which planet is known as the Red Planet?"
        };

        String[][] options = {
            {"1. Paris", "2. London", "3. Rome", "4. Berlin"},
            {"1. Python", "2. Java", "3. C++", "4. Swift"},
            {"1. 10", "2. 11", "3. 12", "4. 13"},
            {"1. Dennis Ritchie", "2. Bjarne Stroustrup", "3. James Gosling", "4. Guido van Rossum"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Venus"}
        };

        int[] answers = {1, 2, 3, 3, 2}; 
        int score = 0;

        System.out.println("Welcome to the Online Quiz Platform!");
        System.out.println("-----------------------------------\n");

       
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

           
            for (String option : options[i]) {
                System.out.println(option);
            }

          
            System.out.print("Enter your choice (1-4): ");
            int userChoice = scanner.nextInt();

            if (userChoice == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + options[i][answers[i] - 1] + "\n");
            }
        }

        
        System.out.println("-----------------------------------");
        System.out.println("Quiz Over! Your Score: " + score + " out of " + questions.length);
        System.out.println("-----------------------------------");

        scanner.close();
    }
}
