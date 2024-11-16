package CHAP03;

public class EX3_2 {
    public static void  main(String[]args){
        // 전위, 후위 연산자 보기.
        int i =5, j=0;

        j = i++;    // 후위 연산자를 실행 ,
        System.out.println("j = i++; 실행후, i=" + i+ ", j="+ j);      // i=6, j=5


        i=5;
        j=0;

        j= ++i; // 전위 연산자를 실행.
        System.out.println("j = i++; 실행후, i=" + i+ ", j="+ j);  // i=6, j=6;
    }
}
