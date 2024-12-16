package Student;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> marks;
    private int[] marksArray = {1,2,3,4,5};

    public Student(String name, int... marks) {
        this.name = name;
        for(int mark : marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return this.marks.size();
    }

    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public BigDecimal getAverageMarks() {
        int total = getTotalMarks();
        return new BigDecimal(total).divide(new BigDecimal(getNumberOfMarks()), 2, BigDecimal.ROUND_HALF_UP);
    }

    public int getMaxMarks() {
        return Collections.max(this.marks);
//      Arrays.sort(this.marks);
//      return this.marks[this.marks.length - 1];
    }

    public int getMinMarks() {
       return Collections.min(this.marks);
//        Arrays.sort(this.marks);
//        return this.marks[0];
    }




}
