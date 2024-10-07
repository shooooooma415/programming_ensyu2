import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex1104 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ex1104 <filename>");
            return;
        }

        String filename = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
