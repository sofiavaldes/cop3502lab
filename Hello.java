import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Allows user to type in answers by allowing information input from the keyboard

        System.out.print("Hello. What is your name? "); // Ask for user name

        String userName;
        userName = keyboard.next();
        System.out.print("It's nice to meet you, " + userName + ". How old are you? "); // Ask for user age

        String userAge;
        userAge = keyboard.next();
        System.out.println("I see that you are still quite young at only " + userAge + ".");


        System.out.print("Where do you live? "); // Ask where the user is from

        String userHome;
        userHome = keyboard.next();
        System.out.print("Wow! I've always wanted to go to " + userHome + ". Thanks for chatting with me. Bye!");

    }
}
