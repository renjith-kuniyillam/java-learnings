import FunctionalProgramming.ForLoopPrintingFunctional;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ForLoopPrintingFunctional forLoopPrintingFunctional = new ForLoopPrintingFunctional(List.of("Apple", "Banana", "Orange"), List.of(1,2,3,4,5,6));

        forLoopPrintingFunctional.printListNormal();
        forLoopPrintingFunctional.printListFunctional();

        forLoopPrintingFunctional.printListFunctional2();

        forLoopPrintingFunctional.printSumOfNumbers();

    }
}