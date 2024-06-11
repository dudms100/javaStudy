package quiz;

public class QuUpgradeGuGu {

    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            for (int num = 1; num <= 9; num++) {
                guguUp(dan, num);
                System.out.println();
            }
        }
    }

    public static void guguUp(int dan, int num) {
        int result = 1;
        if (num == 1) {
            System.out.print(dan + " X 1 = " + dan);
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.print(dan);
                if (i < num) {
                    System.out.print(" X ");
                }
                result *= dan;
            }
            System.out.print(" = " + result);
        }
    }
}

