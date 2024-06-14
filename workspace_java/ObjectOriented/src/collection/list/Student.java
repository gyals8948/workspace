package collection.list;

public class Student {

    //Student는 학생에 대한 정보가 들어있는 클래스이다.
    // 해당 클래스는 학생이름, 국어점수, 영어점수, 총점 데이터를 가지고 있다.
    // 각 필드를 선언하고 setter와 getter를 만들어보자.
    // 추가적으로 모든 정보를 출력하는 기능을 toString()메소드를 오버라이딩하여 작성한다.


    private String name;
    private int korScore;
    private int engScore;
    private int Score;

    public Student(String name, int korScore, int engScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        Score = korScore + engScore ;
        // 총점은 korScore + engScore로 받는다

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", Score=" + Score +
                '}';
    }
}




