package chap04;

import java.util.Scanner;

// if-else문 예시
public class ex4_3 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력하세요.>");
        Scanner scanner = new Scanner(System.in);   // 키보드로 입력받기 위해 스캐너 객체 생성.
        int input = scanner.nextInt();  // 줄바꿈 하기 전, 숫자를 입력한 값을 input에 저장.

        if(input ==0){      // input값이 0 이면
            System.out.println("입력하신 숫자는 0 입니다.");      // 출력
        }
        else    // 0이 아닐경우
        {
            System.out.println("입력하신 숫자는 0이 아닙니다.");    // 출력.
        }
    }
}
