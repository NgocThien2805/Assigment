package Assigment;

import java.util.Scanner;

public class finabon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số : ");
        int n = sc.nextInt();
        int sum = 0;
        int f1 = 1, f0 = 0;
        while (f0 < n) {
            System.out.println(", " + f0);
            sum = f1 + f0;
            f0 = f1;
            f1 = sum;
        }

    }

}
