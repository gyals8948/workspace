package Interface.math;

public class MyMath implements MathUtil{


    public int getMin(int a, int b) {

        return a < b ? a : b;
    }


    public double getCircleArea(int redius) {
        if(redius < 0){
            return 0;
        }
        else {
//            return 2 * Math.PI * redius;
            return redius < 0 ? 0 : 2 * Math.PI *redius;
        }

    }


    public int getMultiple(int num1, int n) {
        int result = 1;
        for (int i = 0;  i < n ; i++){
            result = result * num1;
        }

        return result;
    }
}
