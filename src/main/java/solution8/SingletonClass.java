package solution8;

public class SingletonClass {
    private static SingletonClass singleInstance;
    private String str;

    private SingletonClass() {
    }

    public static SingletonClass getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new SingletonClass();
        }
        return singleInstance;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
