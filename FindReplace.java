import java.util.Scanner;

class FindReplace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = getUserInput(scanner, "Enter a Text: ");

        if (containsText(text, "name")) {
            System.out.println("Typed text is found in the text");
        } else {
            System.out.println("Typed text is not found in the text");
        }

        String replacedText = replaceText(text, "Heshan", "Tekshan");
        System.out.println(replacedText);

        scanner.close();
    }

    private static String getUserInput(Scanner scanner, String prompt) {
        System.out.printf(prompt);
        return scanner.nextLine();
    }

    private static boolean containsText(String text, String searchText) {
        return text.contains(searchText);
    }

    private static String replaceText(String text, String oldText, String newText) {
        return text.replace(oldText, newText);
    }
}
