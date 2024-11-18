package chap04;

// 중첩 for문을 이용해 별을 찍어보자.
public class ex4_11 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
