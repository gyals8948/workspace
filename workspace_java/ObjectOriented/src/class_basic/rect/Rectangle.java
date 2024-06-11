package class_basic.rect;

public class Rectangle {
    //사각형을 구성하는 두 점의 좌표
    int x1;
    int y1;
    // 한쌍
    int x2;
    int y2;
    //한쌍

    //생성자
    public Rectangle(){ //디폴트 생성자(매개변수x) 문제의 객체 오류를 막기위해
        //디폴트생성자를 만듦
    }

    public Rectangle(int x1,int y1, int x2, int y2){
        this.x1 = x1;// x1; (매개변수)
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int square(){
        return (x2 - x1) * (y2 - y1);
        // 직사각형넓이 가로*세로
        //       return (x2 - x1) * (y2 - y1)
    }

    //좌표 정보, 넓이 출력
    //(1, 2), (5, 7)
    public void show(){
        System.out.println("(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
        System.out.println("사각형의 넓이 : " + square());

    }

    //인자로 전달된 객체 r과 현 객체가 같은 넓이라면 return true
    public boolean equals(Rectangle r){ //<== public class Rectangle
        if(r.square() == square ()){
           return true ;
        }
        else {
            return  false;
        }
    }


}
