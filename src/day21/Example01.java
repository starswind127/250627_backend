package day21;

import java.awt.*;

public class Example01 {
    public static void main(String[] args) {
        /*
        - 프로그램 : 코드(명령어)들의 집합
        - 프로세스 : 실행중인 프로그램
        - 멀티 태스킹 : 두가지 이상의 작업을 동시 처리
        - 멀티 프로세스 : 운영체제가 동시에 여러개 프로세스 동시처리
            -> 프로그램 단위의 멀티 태스킹
        - 멀티 스레드 : 프로세스 내에서 실행되는 작업 처리
            -> 하나의 프로그램 내 *멀티 태스킹*

        { 스레드 Thread }
            1. 정의 : 하나의 프로세스 내에서 실행되는 작업 단위, 실행 흐름의 단위
            2. 목적 : 코드 ( 명령어 )를 읽어드리고 CPU가 명령어 처리한다.
            3. 자바 에서의 스레드
                1) main 메소드 :public static void main(String[] args) {} 에는 main스레드가 나
            4. 사용법
                1) 자바 프로그램은 항상 main 메소드(Thread)로 부터 실행 흐름 시작된다.
                - public static void main(String[] args) {}

        {멀티스레드 Multi - Thread}
            1. 정의 : main스레드 외 새로운 *작업스레드*를 생성하여 동시 작업
            2. 목적 : *병렬처리* . 동시에 여러 작업을 수행
            3. 사용처 : 웹/앱 , 채팅/첨부파일/JDBC , 동기화/비돋기화 처리
            4. 사용법
        */
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //java ui 제공하는 패키지 ( java.net )

        // [1] 단일(싱글) 스레드 예
        System.out.println("[1] MAIN 스레드가 읽어드리는 코드");//main메소드가 처리하는 코드
        for ( int i = 1 ; i<=5 ; i++ ){
            System.out.println("[1] MAIN 스레드가 읽어드리는 코드"+i);
        }// for end
        for ( int i = 1 ; i<=5 ; i++ ) {
        }// for end



    } //main end
} //class end
