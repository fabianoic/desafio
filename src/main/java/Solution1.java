import java.io.*;
import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("c:\\inputFile.txt"))))) {
            Integer quantityOfPhones = Integer.parseInt(reader.readLine());
            if (quantityOfPhones <= 0 && quantityOfPhones > 100000) {
                return;
            }

            HashMap<String, String> contactMap = new HashMap<>();
            String line;
            while ((line = reader.readLine()) != null) {
                if (quantityOfPhones > 0) {
                    String numberWithoutLeadingZero = reader.readLine().replaceAll("^0+(?!$)", "");

                    if (isValidInput(line, numberWithoutLeadingZero)) {
                        contactMap.put(line, numberWithoutLeadingZero);
                    }
                    quantityOfPhones--;
                    continue;
                }
                String number = contactMap.get(line);
                if (number != null) {
                    System.out.println(String.format("%s=%s", line, number));
                } else {
                    System.out.println("Not found");
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("Invalid input");
        }
    }

    public static boolean isValidInput(String name, String number) {
        if (name.matches("(^[a-z]+$)|(^[a-z]+ [a-z]+$)") && number.length() == 8) {
            return true;
        }
        return false;
    }
}
