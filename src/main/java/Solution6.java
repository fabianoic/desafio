import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution6 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("c:\\inputFile.txt"))))) {
            Integer sizeArray = Integer.parseInt(reader.readLine());
            String[] values = reader.readLine().split(" ");

            Integer total = 0;
            for (int i = 0; i < sizeArray; i++) {
                total += Integer.parseInt(values[i]);
            }

            System.out.println(total);
        } catch (
                Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
