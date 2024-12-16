package FunctionalProgramming;

import java.util.function.Consumer;

public class forEachPredicate implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
