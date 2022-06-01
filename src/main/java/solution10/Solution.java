package solution10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Write a list of numbers separated by hyphen:");
            MyList list = new MyList(scanner.next().split("-"));


            Integer option = 1;
            while (option != 0) {
                System.out.println("--Select a value --\n1 - Insert a value to index position\n2 - Delete the element at index\n0 - to exit");
                option = scanner.nextInt();
                int index;
                switch (option) {
                    case 0:
                        System.out.println(list);
                        return;
                    case 1:
                        System.out.println("Write a new value");
                        Integer value = scanner.nextInt();
                        System.out.println("Write a index to update(start at 0)");
                        index = scanner.nextInt();
                        if (!list.isValidIndex(index)) {
                            continue;
                        }
                        list.getList().add(index, value);
                        break;
                    case 2:
                        System.out.println("Write a index to delete(start at 0)");
                        index = scanner.nextInt();
                        if (!list.isValidIndex(index)) {
                            continue;
                        }
                        list.getList().remove(index);
                        break;
                    default:
                        System.out.println("The options doesn't exists");
                        break;
                }

            }

        } catch (Exception e) {
            System.out.println("Exception - " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

}
