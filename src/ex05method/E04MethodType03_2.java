package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {
    
    static void inputGugudan(int sNum, int eNum) {
        // Ensure sNum is less than or equal to eNum for proper loop iteration
        if (sNum > eNum) {
            int temp = sNum;
            sNum = eNum;
            eNum = temp;
        }
        
        for (int a = sNum; a <= eNum; a++) {
            for (int b = 1; b <= 9; b++) {
                System.out.print(a + " * " + b + " = " + (a * b));
                if (b < 9) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s, e;
        
        while (true) {
            System.out.print("시작값 (2~9 사이의 숫자): ");
            s = scanner.nextInt();
            if (s >= 2 && s <= 9) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 2~9 사이의 숫자를 입력해주세요.");
            }
        }
        
        while (true) {
            System.out.print("종료값 (2~9 사이의 숫자): ");
            e = scanner.nextInt();
            if (e >= 2 && e <= 9) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 2~9 사이의 숫자를 입력해주세요.");
            }
        }
        
        inputGugudan(s, e);
    }
}
