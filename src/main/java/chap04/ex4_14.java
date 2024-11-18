package chap04;

import java.util.Scanner;

public class ex4_14 {
    public static void main(String[] args) {
        int num = 0, sum =0 ;
        System.out.println("숫자를 입력하세요. (예:12345)>");

        Scanner scanner = new Scanner(System.in);   // 스캐너 객체 생성.
        String tmp = scanner.nextLine();        // 문자를 입력받고 tmp에 저장.
        num = Integer.parseInt(tmp);    // 입력받은 문자 tmp를 정수로 변환.

        // num이 0이 아닌경우 계속 반복.
        while (num != 0 ){
            sum += num%10;  // sum 은 num을 10으로 나눈 나머지
            System.out.printf("sum = %3d num = %d%n" , sum , num);

            num /=10 ;
        }
        System.out.println("각 자리수의 합:" + sum);
    }
}
