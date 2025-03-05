import java.util.Scanner;
public class GameMain {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the game!!!");
        System.out.println("Choose dog or cat");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println("Great choise, u want a " + input + ". Whats's the name?");
        String input2 = scanner.nextLine();

        System.out.println("That's ur cat:" + input2);
        


    }
}
