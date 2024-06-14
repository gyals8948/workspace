package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_1_Test_1 {
    //1. 문자열을 저장하는 리스트를 만들고 3개의 데이터를 넣어보자. 그 후 리스트에 저장된 3개의 데이터를 출력해보라.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list1 = new ArrayList<>();

        list1.add("김");
        list1.add("이");
        list1.add("박");

        System.out.println(list1);




         //2번. 정수를 저장할 수 있는 리스트를 만들고
        //5개의 정수를 scanner를 통해 입력받아 리스트에 저장한다.
        //리스트에 저장된 모든 데이터의 합을 출력하여라.

        List<Integer> list2 = new ArrayList<>();



            //리스트에 데이터 저장
        for (int i = 0; i < 5; i++ ){ // 5대신에 list.size(통을 만드는) 는 0개라 x

            System.out.println("정수 입력 : ");
            int a = sc.nextInt();
            list2.add(a);

        }

        //리스트에 저장된 데이터의 합

        int sum = 0;
        for(int e : list2){
            sum = sum + e;

        }
        System.out.println(sum);
















    }
}

