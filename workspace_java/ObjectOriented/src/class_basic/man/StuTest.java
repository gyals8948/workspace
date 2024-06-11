package class_basic.man;

public class StuTest {
    public static void main(String[] args) {
        //배열 + 클래스
        //학생을 5명 저장할 수 있는 배열을 생성
        //학생 5명을 저장할 수 있는 통
        Student[] students = new Student[5];

        //배열에 저장할 학생 객체 생성
        Student s1 = new Student("김",20,80);
        Student s2 = new Student("이",30,75);
        Student s3 = new Student("최",40,70);
        Student s4 = new Student("박",35,90);
        Student s5 = new Student("홍",25,70);
//        s1.print(); // 메소드 호출

        //배열 0번째 요소에 학생 s1을 저장
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;


        //1. 배열에 저장된 모든 학생의 이름, 나이, 점수를 출력
//
//        for (int i = 0; i < students.length ; i++){
//            students[i].print();
//            System.out.println();
//
//        }

        //1번 문제를 for-each문으로 해결

//        for(Student s : students){
//            s.print();
//        }






        //2. 배열에 저장된 학생중 점수가 80점 이상인 학생의
        //이름, 나이, 점수 출력
//        for (int i = 0; i < students.length; i++){
//
//            if (students[i].getScore() >= 80){
//                students[i].print();
//            }
//        }



        //3. 이름이 '박'인 학생을 찾아 해당 학생의 나이를 10으로 변경하세요
        //for, for-each로 풀어보기

        for (int i = 0; i <students.length; i++){
            if (students[i].getName().equals("박")){
                students[i].setAge(10);
            }
        }
        for (Student e :students){
            if (e.getName().equals("박")){
                e.setAge(10);
            }
        }







    }
}
