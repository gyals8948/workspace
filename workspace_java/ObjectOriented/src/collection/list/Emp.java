package collection.list;

public class Emp {
    private int empNo;
    private String name;
    private String dept;
    private String tel;
    private int money;


    public Emp(int empNo, String name, String dept, String tel, int money) {
        this.empNo = empNo;
        this.name = name;
        this.dept = dept;
        this.tel = tel;
        this.money = money;
    }

    public int getEmpNo(){
        return empNo; //사번을 리턴

    }

    //사원의 연락처 마지막 4자리 값 리턴

    public String getPw(){

//        String num =  "010-1111-2222";
//        num.substring(1,4); // 문자열 추출 // " 10-" //1번째부터 4번째(미포함) 까지 가져옴
//        num.substring(5); //5번째 부터 추출(?) 111-2222

        return  tel.substring(5);

    }

    public String getName(){
        return name;
    }



}
