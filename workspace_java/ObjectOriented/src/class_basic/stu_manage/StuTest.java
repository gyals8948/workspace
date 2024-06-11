package class_basic.stu_manage;

import java.util.Scanner;

public class StuTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;

        StuManage stuManage = new StuManage();

        System.out.println("학생관리 프로그램을 실행합니다.");
        while (isRunning) {
            System.out.print("1)학생등록 2)학생정보변경(연락처)" +
                    " 3)학생정보출력 4)모든학생정보출력 5)프로그램종료 : ");

            int menu = sc.nextInt();

            switch (menu){
                case 1 :
                    stuManage.regStu();
//                    System.out.println("학생 등록 실행 ");
                    break;
                case 2 :
                    stuManage.changeInfo();
//                    System.out.println("학생 정보변경(연락처) 실행 ");
                    break;
                case 3 :
                    stuManage.print();
//                    System.out.println("학생정보출력 실행");
                    break;
                case 4 :
                    stuManage.printAll();

//                    System.out.println("모든학생정보출력 실행 ");
                    break;
                case 5 :

                    System.out.println("프로그램을 종료합니다. ");
                    isRunning = false;


            }

        }




    }
}
