import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the game!!!");
        System.out.println("Choose dog or cat");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //HEr bliver der valgt (hund eller kat)
        Tamagotchi pet = null; // Det her er en variabel til at holde det her pet-objekt

        // Den kommer kun i spil hvis brugeren vælger hund, så oprettes en hund
        if (input.equalsIgnoreCase("dog")) {
            System.out.println("Great choice! You want a dog. What's the dog's name?");
            String petName = scanner.nextLine(); // Hundens navn
            pet = new Dog(petName, new Random().nextInt(5) + 1, "Happy", 100); // Sådan her oprettes en hund med tilfældig alder
        }
        // Her sker det sammee bare med kat
        else if (input.equalsIgnoreCase("cat")) {
            System.out.println("Great choice! You want a cat. What's the cat's name?");
            String petName = scanner.nextLine(); // Kattens navn
            pet = new Cat(petName, new Random().nextInt(5) + 1, "Happy", 100); // Sådan her oprettes en kat med tilfældig alder
        }

        // Når dyret er oprettet så vises dens info og starter spil-loopet
        if (pet != null) {
            System.out.println("Here is your " + pet.getClass().getSimpleName() + ": " + pet.getName());
            pet.showInfo(); // Viser pet's info
            gameLoop(pet, scanner); // HEr starter spil-loopet
        } else {
            System.out.println("Invalid choice. Please restart the game.");
        }
    }

    // Hovedspil-loop hvor brugeren bestemmer hvad dyret skal
    private static void gameLoop(Tamagotchi pet, Scanner scanner) {
        while (true) {
            // Her vælger brugeren hvad dyret skal
            System.out.println("What would you like to do?");
            System.out.println("1 - Play\n2 - Feed\n3 - Sleep\n4 - Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pet.play(); // Her kaldes play-metoden på pet
                    break;
                case 2:
                    pet.feed(); // Her kaldes feed-metoden på pet
                    break;
                case 3:
                    pet.sleep(); // Her kaldes sleep-metoden på pet
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return; // Sådan afsluttes spillet
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }
    }
}
