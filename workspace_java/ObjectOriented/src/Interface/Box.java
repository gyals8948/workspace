package Interface;


//무엇이든 넣고 뺄 수 있는 만능 박스
public class Box {
    Object str;

    public void setBox(Object str){ //(Object str) = 해석 : 무엇이든(모든 클래스 자료형) 들어올 수 있음 Object == "모든클래스의 부모"
                                    // Objact는 int, double 들어 올 수가 없다. -> 기본자료형을 클래스화 시킨 Wrap클래스는 가능
        //기본자료형(8 가지)을 클래스화 시킨  == Wrap == 랩(랩으로 감싸는)
        this.str = str;

    }

    public Object getBox(){
        return str;

    }


}
