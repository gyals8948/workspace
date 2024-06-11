package class_basic;

public class Book {
     String title; // 멤버변수
     String writer;
     int price;

    public Book(){ //멤버변수의 값을 초기화 == 생성자
        this.title = "";
        this.writer = "";
        this.price = 0;
        //this. 이 클래스에서 선언됨
    }

    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }

    //    public Book(String title, String writer, int price){ //메서드 오버로딩
//        title = ?;
//        writer = ?;
//        price = ?;

//        this.title = title;
//        this.writer = writer;
//        this.price = price;
//

    }











//}
