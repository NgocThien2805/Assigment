package Assigment;
import java.util.Scanner;
import java.util.ArrayList;
public class daydainhatkhonglap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap day: ");
        String s = sc.nextLine();
       ArrayList<Character> list = new ArrayList<>();

        int left = 0;
        int maxLength = 0;


        for (int right = 0; right < s.length(); right++) {


            while (list.contains(s.charAt(right))) {


                list.remove(Character.valueOf(s.charAt(left)));

                left++;
            }


            list.add(s.charAt(right));


            maxLength = Math.max(maxLength, right - left + 1);

        }


        System.out.println("Do dai lon nhat: " + maxLength);

    }
}
