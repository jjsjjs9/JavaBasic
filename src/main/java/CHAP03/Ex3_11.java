package CHAP03;

// 소수점 n번째 자리에서 반올림하는 예시.
public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi  = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
    }
}
