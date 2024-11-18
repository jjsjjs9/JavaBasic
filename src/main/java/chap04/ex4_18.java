package chap04;

import java.util.Scanner;

// 메뉴 선택하기 예제.(break-continue 예제)
public class ex4_18 {
    public static void main(String[] args) {
        int menu = 0 , num = 0; // 메뉴 , num변수 선언.

        Scanner scanner = new Scanner(System.in);   // 스캐너 객체 생성.

        // 무한 반복
        while (true){
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료 > 0)> ");


            String tmp = scanner.nextLine();    // 화면에서 입력받은 내용을 tmp에 저장.
            menu=Integer.parseInt(tmp); // 입력받은 문자열 tmp를 숫자로 변환.

            if(menu == 0){  // 0번을 입력받을 경우
                System.out.println("프로그램을 종료합니다."); // 프로그램을 끝냄.
                break;  // 반복문 빠져나감.
            } else if (!(1 <= menu && menu <=3)) {  // 1~3번 메뉴를 선택하지 않은 경우
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0 입니다.)");  // 출력.
                continue;       // 다시 반복문 처음으로 돌아감.
            }

            System.out.println("선택하신 메뉴는" + menu + "입니다.");
        }
    }
}
