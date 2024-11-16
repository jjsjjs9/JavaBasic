package chap02;

public class Ex2_17 {
    public static void main(String[] args) {
        String str = "3";   // 3이라는 문자열을 가진 str

        System.out.println(str.charAt(0) - '0');        // 문자열을 문자로 변환.
        System.out.println('3' - '0' + 1);      // 3-0 +1 = 4
        System.out.println(Integer.parseInt("3") + 1);  // 문자열3을 숫자로 변환 // 3+1 = 4
        System.out.println("3" + 1);    // 31
        System.out.println((char) (3 + '0'));   // 3

    }
}

