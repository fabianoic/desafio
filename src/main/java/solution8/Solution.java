package solution8;

public class Solution {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getSingleInstance();
        SingletonClass singletonClass2 = SingletonClass.getSingleInstance();

        singletonClass1.setStr("A String text");
        singletonClass2.setStr("New String text");

        System.out.println("str value of singletonClass1 is: " + singletonClass1.getStr());
        System.out.println("str value of singletonClass2 is: " + singletonClass2.getStr());
        System.out.println("Is the same instance ? " + (singletonClass1 == singletonClass2));

    }
}
