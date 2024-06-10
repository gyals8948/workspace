package class_basic.car;

import java.util.SortedMap;

public class Car {
    // 제조사, 차이름, 차량번호, 가격, 소유주의 속성


    String brand;
    String modelName;
    String carNumber;
    int price;
    String owner;
    //실행은 main 메서드에서 가능



    //자동차의 속성 하나하나를 각각 변경하는 메소드들을 만들어보세요.
    //제조사의 값을 변경하는 메서드
    public void setBrand(String b){
        brand = b;
    }

    //차이름을 변경하는 메서드

    public void  setCarName(String x){
        modelName = x;
    }
    //차량번호를 변경하는 메서드


    public  void setCarNum(String y){
        carNumber = y;
    }


    //가격을 변경하는 메서드

    public void setCarPrice(int a){
        price  = a;
    }

    //소유주를 변경하는 메서드

    public  void setCarOwner(String o){
        owner = o;
    }


    //자동차의 속성 출력
    public void printCarInto(){
        System.out.println("브랜드 : " + brand);
        System.out.println("차량이름 : " + modelName);
        System.out.println("차람번호 : " + carNumber);
        System.out.println("가격 : " + price);
        System.out.println("소유주 : " + owner);
    }



}





