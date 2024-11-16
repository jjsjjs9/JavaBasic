package chap02;

public class Ex2_8 {
    public static void main(String[]args){
        int x =1;
        int y=2;
        int z=3;


        // x,y,z 값을 서로 바꾸기.

        int temp;
        temp = x;
        x=y;
        y=temp;

        int tmp;
        tmp = z;
        z=y;
        y =tmp;


        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z = " + z);
    }
}
