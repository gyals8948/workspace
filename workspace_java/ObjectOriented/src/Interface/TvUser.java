package Interface;

import java.rmi.dgc.Lease;

public class TvUser {

    public static void main(String[] args) {
        // interface를 구현한 class의 생성자로 interface 객체 생성
        Tv tv = new SamsungTv();
        tv.turnOn();
        tv.volumeDown();
        tv.volumeUp();
        tv.turnOff();


        //이런 방식으로 가능  // 아래의 2개가 선호되는 형태
//        SamsungTv tv1 = new SamsungTv();
//        LgTv tv2 = new LgTv();
//        Tv tv3 = new SamsungTv();
//        Tv tv4 = new LgTv();
//

//         SamsungTv tv = new SamsungTv();
//        tv.powerOn();
//        tv.soundOn();
//        tv.soundDown();
//        tv.powerOff();
//



    }

}
