package Assigment;
import java.util.Scanner;
public class khoa {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
System.out.println("Nhap so n: ");
int n = sc.nextInt();
int a = 0;
int b = 1;
int c = 0;
while (a < n) {
System.out.println(a + " ") ;
c = a + b;
a = b;
b = c;


}
    }

}