package Assigment;

import java.util.Scanner;

public class thien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        while (n>n1) {
            System.out.println(n1 + " ");
            n3 = n1+n2; 
            n1 = n2;
            n2 = n3;

    


        }
}
    
}
