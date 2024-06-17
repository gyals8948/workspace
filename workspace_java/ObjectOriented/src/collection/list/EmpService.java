package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {

    private Scanner sc;


    private List<Emp> empList;
    //멤버변수는 private붙이기 //list = 자료형 - 기본값 null



    public EmpService(){
        sc = new Scanner(System.in);

        empList = new ArrayList<>();

        Emp e1 = new Emp(1001, "김", "개발부", "1111-1111", 200);
        Emp e2 = new Emp(1002, "이", "개발부", "1111-1112", 300);
        Emp e3 = new Emp(1003, "박", "영업부", "1111-1113", 400);
        Emp e4 = new Emp(1004, "최", "영업부", "1111-1114", 500);
        Emp e5 = new Emp(1005, "정", "인사부", "1111-1115", 600);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

    }




    //1번 문제
    public void login(){
        boolean isRunnering = true; //while문 반복 변수

        while (isRunnering){
            System.out.println("사번 : ");
            int empNo = sc.nextInt();
            System.out.println("비밀번호(연락처 마지막 4자리) : ");
            String pw = sc.next();


            //입력한 사번과 비밀번호 일치 여부 확인


            for (Emp e : empList){
                if (e.getEmpNo() == empNo && e.getPw().equals(pw)) {
//                    break; //반복문안에서 break; == 가장 가까운 반복문을 벗어남 // 여기서는 사용x

                    isRunnering = false; // while문을 벗어남
                    System.out.println("로그인 하였습니다.");
                    System.out.println(e.getName() + "님 반갑습니다.");

                }

            }

            



        }

    }

    //2번 문제

    public void printDeptMoney(){

    }

    //3번
    public void increaseMoney(){


    }

}
