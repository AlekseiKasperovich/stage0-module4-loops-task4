package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {

    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int i = 0; i <= numberToGoUntil; i++) {
            if (numberToGoUntil < toBreakWith) {
                if (i == 0) {
                    System.out.println("iterating till the end");
                }
                System.out.println(i);
            } else {
                System.out.println(i);
                if (i == toBreakWith) {
                    break;
                }
            }
        }
    }
}
