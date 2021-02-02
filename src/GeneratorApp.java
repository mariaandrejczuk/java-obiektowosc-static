import java.util.Scanner;

public class GeneratorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter size of text: ");
            int size = scanner.nextInt();
            String text = Generator.text(size);
            System.out.println(text);
        }
    }
}
