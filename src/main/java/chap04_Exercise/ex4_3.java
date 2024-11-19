package chap04_Exercise;

// 1~10까지의 누적된 정수합 구하기. (시그마 문제)
public class ex4_3 {
    public static void main(String[] args) {
        int sum=0 ;
        int result = 0;
        for (int i = 1; i <=10 ; i++) {

            sum+=i;
            result = sum + i;

        }
        System.out.println(result);
    }
}
