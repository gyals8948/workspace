package IF_문제_1;

public class Test5 {

    public static void main(String[] args) {


        int x = 91;
        String grade;
        if(x > 90 && x <=100){
           // System.out.println("학점은 A입니다");
            grade = "A";



        }
        else if(x > 80){ // && x <=90){
            //  && x <=90){ 굳이 뒤에는 안 넣어도 됨
            grade = "B";


          //  System.out.println("학점은 B입니다");
        }

        else{
            System.out.println("학점은 C입니다");
//            System.out.println("학점은" + grade);
        }





    }
}
