package day02;

public class Example1 {
    public static void main(String[] args) {
        //(변수) 타입 변환 , 캐스팅, 다형성 (하나의 자료가 여러개 타입으로 변환이 가능하다.)
        //1. 자동 타입변환 (묵시적)
            // byte -> short/char -> int -> long -> float -> double
//        (1) 메모리크기가 작은것에서 큰것으로 변환가능
//        (메모리 손실이 적다.)
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

        //2. 강제 타입변환 (명시적)
        //double -> float -> long -> int -> short/char -> byte
        //(1) 메모리 크기가 큰 것에서 작은 것으로 변환 가능
        //(2) 데이터 손실이 크다.
        //(3) (변환할타입명)변수명;
        double dvalue = 3.14;
        float fvalue = (float) dvalue;
        long lvalue = (long) fvalue;
        int ivalue = (int) lvalue;
        short svalue = (short) ivalue;
        byte bvalue = (byte) svalue;

        System.out.println(dvalue);
        System.out.println(fvalue);
        System.out.println(lvalue);
        System.out.println(ivalue);
        System.out.println(svalue);
        System.out.println(bvalue);

        //3. 연산 타입변환
        //byte + byte = int , byte + short = int , int + int = int
        //1. 즉 int 이하 연산결과는 int 이다.
        //2. 연산결과는 두 항 중에 더 큰 항으로 자동 타입변환
        byte b1 = 10; byte b2 = 20; short s1 = 30; int i1 = 40; long l1 = 50;
        float f1 = 3.14f; double d1 = 41.25;
        int result1 = b1 + b2;
        int result2 = b1 + s1;
        int result3 = i1 + i1;
        long result4 = i1 + l1;
        float result5 = i1 + f1;
        double result6 = i1 + d1;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);


    }
}
