public class HelloApp {
    public static void main(String[] args) {

        String names;

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all arguments with comma and space
            names = String.join(", ", args);
        } else {
            // Default message
            names = "World";
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}