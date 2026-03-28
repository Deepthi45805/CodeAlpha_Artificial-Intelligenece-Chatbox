import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("🤖 Chatbot: Hello! I am your AI chatbot.");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("🤖 Chatbot: Goodbye! Have a nice day 😊");
                break;
            }

            // Rule-based NLP responses
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("🤖 Chatbot: Hello there!");
            }
            else if (input.contains("how are you")) {
                System.out.println("🤖 Chatbot: I'm just code, but I'm doing great!");
            }
            else if (input.contains("your name")) {
                System.out.println("🤖 Chatbot: I am a Java AI Chatbot.");
            }
            else if (input.contains("course") || input.contains("study")) {
                System.out.println("🤖 Chatbot: Focus on Java, DSA, and projects for placements.");
            }
            else if (input.contains("java")) {
                System.out.println("🤖 Chatbot: Java is a powerful object-oriented programming language.");
            }
            else if (input.contains("bye")) {
                System.out.println("🤖 Chatbot: Goodbye!");
                break;
            }
            else {
                System.out.println("🤖 Chatbot: Sorry, I don't understand. Can you rephrase?");
            }
        }

        sc.close();
    }
}
