import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class birthdaycapsule2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\uD83C\uDF89 Welcome to Your Birthday Capsule \uD83C\uDF89");
        System.out.println("Enter the messsage to your future: ");
        String message = scanner.nextLine();

        System.out.println("Enter 3 biggest goals of the year: ");
        System.out.println("Goal1: ");
        String goal1 = scanner.nextLine();
        System.out.println("Goal2: ");
        String goal2 = scanner.nextLine();
        System.out.println("Goal3: ");
        String goal3 = scanner.nextLine();

        System.out.println("Enter one motivation quote that fuels you: ");
        String quote = scanner.nextLine();

        try{
            FileWriter writer = new FileWriter("birthdaycapsule25.txt");
            writer.write("\uD83C\uDF81 Birthday Capsule for Ashish \uD83C\uDF81\\n\\n");
            writer.write("Message to Future Me:\n" + message + "\n\n");
            writer.write("Goals for the Year:\n");
            writer.write("1. " + goal1 + "\n");
            writer.write("2. " + goal2 + "\n");
            writer.write("3. " + goal3 + "\n\n");
            writer.write("Favorite Motivational Quote:\n\"" + quote + "\"\n");
            writer.close();

            System.out.println("\n✅ Your capsule has been saved to 'BirthdayCapsule_2025.txt'!");
        }catch(IOException e){
            System.out.println("❌ Error saving capsule: " + e.getMessage());
        }
        scanner.close();
    }
}
