package solution11;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MyArrayPrinter<T> {

    public String printArray(T[] array) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(" - "));
    }
}
