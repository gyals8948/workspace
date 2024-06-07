package 메서드_2예제;

import java.util.Scanner;

public class 메서드예제_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("입력 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }

    public static int sum(int a, int b){
      return a * b ;
    }
}
