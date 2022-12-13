package school.mjc.stage0.loops.task4;

public class TwoRangesSum {

    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            System.exit(0);
        }
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            System.exit(0);
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= lastInRow; i++) {
            sum1 = sum1 + i;
            if (i == numberToSkip) {
                sum1 = sum1 - i;
                System.out.println("skipped sum is number " + sum1);
            }
            if (i > numberToSkip) {
                sum2 = sum2 + i;
            }
            if (i == lastInRow) {
                System.out.println("counted sum is number " + sum2);
            }
        }
    }
}
