package solution10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    private List<Integer> list = new ArrayList<>();

    public MyList(String[] readedList) {
        list = Arrays.stream(readedList).map(value -> Integer.parseInt(value)).collect(Collectors.toList());
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public boolean isValidIndex(Integer index) {
        if (index < 0 || index >= list.size()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return list.stream().map(Object::toString).collect(Collectors.joining(" "));
    }
}
