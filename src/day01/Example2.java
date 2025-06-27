package day01;// 현재 .java 파일 위치한 폴더명

public class Example2 { //class start : 모든 자바코드는 클래스안에 존재한다.

    //(1)main 함수 선언 : main + 엔터(나는 탭!)(자동완성)
    public static void main(String[] args) { //main start
        //(2) 리터럴 : (JAVA) 언어들이 미리 정의한 데이터
        // 3 , '김' , "김현수", 3.14, true
        // 리터럴의 모든 정수는 int, 모든 실수는 double
        //(3) 출력함수 System.out.print( 리터럴/ 변수/ 연산 / 함수 );
        // JS : console.log()
        // sout + 엔터(자동완성)
        //(4) main 함수 실행 : ctrl+shift+f10
        System.out.println(3);      //리터럴 3출력
        System.out.println(3.14);   //리터럴 3.14출력
        System.out.println('김');   //리터럴 '김' 출력
        System.out.println( "김현수"); //리터럴 "김현수" 출력
        System.out.println( true ); //리터럴 true 출력
        // (5) 자료형/타입
            // 정수 : byte, short, int(*), long
            // 실수 : float, double(*)
            // 문자 : char
            // 논릴 : boolean

        //(6) 리터럴 값을 변수(*하나의 자료를 저장*)에 대입하기.
        // ==> 자료형 변수명 = 리터럴;
            //1.boolean 타입 : true와 faise 만 저장
        boolean bool1 = true; //리터럴 true를 저장가능한 타입
        boolean bool2 = false;
        //boolean bool3 = 3;  //3 이라는 리터럴은 boolean에 저장 불가능
        System.out.println(bool1); // 변수명을 호출하여 변수값출력
        System.out.println(bool2);
        //char 타입 : '작은따옴표로 감싼 문자1개 저장
        char ch1 = 'A';
//        char ch2 = 'ABC'; //불가능,문자열(문자 여러개)
//        char ch3 = "ABC"; // "" 감싼 자료도 불가능
        System.out.println(ch1);
                //string 클래스타입 : "큰따옴표로 문자 여러개 저장
        String str1 ="ABC";
//        String str2 ='ABC'; //' ' 감싼 자료는 불가능
        System.out.println(str1);

            //4. byte = -128~ +127
        // 5. short 타입 - 정수 +-3만정도

    }// main end

} //class end
