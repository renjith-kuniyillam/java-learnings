import GenericsList.MyList;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static <X> X duplicate(X x) {
        return x;
    }

    static <X extends List> X duplicateList(X x) {
        x.addAll(x);
        return x;
    }

    public static void main(String[] args) {
        MyList<Long> myStringList = new MyList<>();
        myStringList.add(2l);
        myStringList.add(3l);
        myStringList.print();
        myStringList.get(0);

        MyList<Integer> myIntegerList = new MyList<>();
        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.print();
        myStringList.get(0);

        MyList<Float> myFloatList = new MyList<>();
        myFloatList.add(1f);
        myFloatList.add(2f);
        myFloatList.print();
        myStringList.get(0);

        MyList<Double> myDoubleList = new MyList<>();
        myDoubleList.add(1d);
        myDoubleList.add(2d);
        myDoubleList.print();
        myStringList.get(0);

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        list = Main.duplicateList(list);
        System.out.println(list);
    }
}