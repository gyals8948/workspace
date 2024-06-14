package Interface.student;

import javax.swing.text.Style;

public class MyStudent implements StudentUtil {


    public String getGradeByStudentName(Student[] students, String name) {

        String grade = "등급 없음";

        for(Student stu: students){
            if (stu.getName().equals(name)){
                double avg = (stu.getKorScore() + stu.getMathScore() + stu.getEngScore()) / 3.0;
                grade =  getGradeByAvg(avg);

            }

        }
        return grade;
    }



    //점수에 따라 등급 결정

    public String getGradeByAvg(double avg){
         String grade = "등급 없음";
        if(avg >= 90 && avg <= 100){
                     grade = "A";

                }

                 else if (avg >= 80){
                     grade = "B";
                }

                 else if (avg >= 70) {
                    grade = "C";

                }

                 else {
                     grade = "D";

                }

                 return grade;



    }


    @Override
    public void getGradeByStudentName(Student student, String name) {

    }


    //-- 두번째 메서드 --
    //메서드명 : getTotalScoresToArray
    //매개변수로 받은 다수의 학생들의 총점을 배열로 리턴

    public int[] getTotalScoresToArray(Student[] students) {

        //총점이 들어가서 저장될 배열 생성
        int[] totalScores = new int[students.length];

        for (int i = 0; i < students.length ; i++){
            //        ↑ 매개변수로 전달될 학생 한명 한명

          totalScores[i] = students[i].getKorScore() + students[i].getMathScore() + students[i].getEngScore();
            // 학생의 총점
        }


        return totalScores;
    }



    //-- 세번째 메서드 --
    //메서드명 : getHighScoreStudent
    //매개변수로 두 명의 학생이 전달된다.
    //전달된 두 학생 중 총점이 높은 학생 개체를 리턴.
    //단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정한다


    public Student getHighScoreStudent(Student stu1, Student stu2) {
       int sum1  = stu1.getKorScore() + stu1.getMathScore() + stu1.getEngScore();
        //sum1 == 첫번째 학생의 총점

        int sum2  = stu1.getKorScore() + stu1.getMathScore() + stu1.getEngScore();
        //sum2 == 첫번째 학생의 총점

        return sum1 > sum2 ? stu1 : stu2;
        //삼항 연산자






//        if (sum1 > sum2){
//            return stu1;
//        }
//        else {
//            return stu2;
//
//        }

    }







}

