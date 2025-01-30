import java.util.ArrayList;
import java.util.Scanner;

public class BrainstormingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ideas = new ArrayList<>();

        System.out.println("Welcome to the Brainstorming Game!");
        System.out.println("Enter your ideas, or type 'exit' to quit.");

        String input;
        do {
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("exit")) {
                ideas.add(input);
                System.out.println("Idea added: " + input);
            }
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("\nHere are the ideas you entered:");
        for (String idea : ideas) {
            System.out.println("- " + idea);
        }
    }
}