package chap04_Exercise;

public class ex4_1 {
    public static void main(String[] args) {
        //1.
        int x = 0;
        while (x>10 && x<20){
            System.out.println("true");


        }
        //2.
        char ch = 0;
        while (ch == ' ' && ch =='\t'){

        }
        //3.
        while (ch == 'x' || ch =='X'){

        }
       //4.
        while (ch == 'x' || ch =='X'){

        }
        //5.
        while (ch == 'x' || ch =='X'){

        }
        //6.
        int year = 0 ;
        if ((year%400 ==0) || (year%4 == 0) && (year%100!=0)){
            System.out.println(true);
        }
        //7.
        boolean powerOn= false;
        while(powerOn){
            System.out.println(true);
        }
        //8.
        String str ="yes";
        if (str==" "){
            System.out.println(true);
        }
    }

}


