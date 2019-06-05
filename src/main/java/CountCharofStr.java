import java.util.Scanner;

public class CountCharofStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Enter a character to count: ");
        String c = input.nextLine();

        if (c.length() > 1) {
            System.out.println("You've entered a string instead of a character!");
            System.exit(0);
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Character appears in string " + count + " times");
    }
}
