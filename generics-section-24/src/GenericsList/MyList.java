package GenericsList;

import java.util.ArrayList;

public class MyList<T extends Number> {
    ArrayList<T> list = new ArrayList<T>();

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public void print() {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public T get(int index) {
        return list.get(index);
    }
}
