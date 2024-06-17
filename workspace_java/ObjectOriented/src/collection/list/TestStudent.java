package collection.list;

import class_basic.stu_manage.Stu;
import com.sun.source.tree.NewArrayTree;
import object.Person;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        //TestStudent 라는 클래스를 만들어, 위에서 만든 Student클래스의 객체가 저장되는
        // 리스트를 만들어 3명의 학생 정보를 추가한 다음, 아래 문제를 풀어보세요
        //1) 리스트에 저장된 모든 정보를 출력해보세요.
        //2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
        //3) 모든 학생에 대한 평균 점수를 출력하세요.
        //4) 총점이 1등인 학생의 모든 정보를 출력해보세요.

        List<Student>studentList = new ArrayList<>();



        Student s1 = new Student("kim",50,70);// 총점 데이터는 받지 않는다. --
        // korScore + engScore로 받는다
        Student s2 = new Student("lee",20,55);
        Student s3 = new Student("park",70,90);



        int sum = 0;


        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        //1) 리스트에 저장된 모든 정보를 출력해보세요.
        for (Student student : studentList){

            System.out.println(student.toString());

        }

        //2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.




        //2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.

        for (int i = 0; i < studentList.size() ; i++){

            sum =  sum + studentList.get(i).getScore();

            if (studentList.get(i).getScore() >= 150){

                System.out.println(studentList.get(i).toString());
            }


        }

        System.out.println();
        System.out.println();


        //3) 모든 학생에 대한 총점에 대한 평균 점수를 출력하세요.
        int s = 0;

        for (Student stu : studentList){
            s = s + stu.getScore();

        }
        System.out.println(s / studentList.size());


        System.out.println();
        System.out.println();

        //4) 총점이 1등인 학생의 모든 정보를 출력해보세요.

        int index = 0; // 총점이 1등인 학생의 index
        int max = 0; // 가장 높은 총점

        for (int i = 0 ; i < studentList.size(); i ++){

            if(max < studentList.get(i).getScore()){
                max = studentList.get(i).getScore();
                index = i;
            }

        }
        System.out.println(studentList.get(index));





    }


}
