package Assigment;

import java.util.Scanner;

public class doixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhaap: ");
        int a = sc.nextInt();
        int luu = 0;
        int kq=0;
        while (a > 0) {
            luu = a%10;
            kq = kq*10 + luu;
            a = a/10;

        }
        System.out.println("so doi xung cua a :" + kq);
        System.out.println("a la : " + a);
        if (kq == a){
            System.out.println("a la so doi xung ");
        }else {
            System.out.println("a khong phai so doi xung");
        }
        
    }
}

