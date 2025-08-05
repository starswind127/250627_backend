package 개인과제.day04; // 이 파일이 속한 패키지(폴더)를 정의한다. Java 파일들을 논리적으로 구분할 때 사용한다.

import java.util.Scanner; // 사용자로부터 입력을 받을 수 있도록 Scanner 클래스를 사용하기 위해 import 한다.

public class BoardService420250731신승민4 { // 클래스 정의: 게시판 기능을 실행하는 메인 클래스
    public static void main(String[] args) { // 자바 프로그램이 시작되는 메인 메서드
        BoardController bs = new  BoardController();
        // BoardController 클래스의 객체를 생성. 게시글 등록 및 출력 기능을 이 객체를 통해 수행한다.

        for ( ; ; ) { // 무한 반복 루프. 사용자가 프로그램을 종료하지 않는 이상 계속 실행된다.
            System.out.println("=========== My Community ===========");
            System.out.println("  1.게시물쓰기 | 2.게시물출력"); // 메뉴 출력
            System.out.println("====================================");
            System.out.print("선택 > "); // 사용자에게 번호 선택을 유도

            Scanner scan = new Scanner( System.in ); // 사용자 입력을 받기 위해 Scanner 객체 생성

            int choose = scan.nextInt(); // 사용자가 입력한 숫자를 저장 (메뉴 선택용)

            if( choose == 1 ){ // 1번 선택: 게시물 쓰기
                System.out.println("내용 : ");
                String content = scan.next(); // 게시물 내용 입력
                System.out.println("작성자 : ");
                String writer = scan.next(); // 작성자 이름 입력

                boolean result = bs.doPost( content, writer );
                // BoardController의 doPost 메서드를 호출해 게시물 등록을 시도함. 결과는 true/false 반환.

                if ( result == true ) {
                    System.out.println("[안내] 글쓰기 성공"); // 글 등록 성공 시 출력
                } else {
                    System.out.println("[경고] 글쓰기 실패"); // 글 등록 실패 시 출력 (예: 저장 공간 없음 등)
                }

            } else if (choose == 2) { // 2번 선택: 게시물 출력
                System.out.println("==============게시물 목록=============");

                Board[] boards = bs.doGet();
                // BoardController의 doGet 메서드를 호출하여 저장된 모든 게시물 배열을 가져옴

                for (int index = 0; index <= boards.length - 1 ; index++ ){
                    // 배열을 처음부터 끝까지 반복하며 게시물 출력

                    Board board = boards[index]; // 현재 인덱스의 게시물 객체를 꺼냄

                    if( board != null ){ // 게시물이 비어있지 않은 경우만 출력
                        System.out.println(" 작성자 : " + board.writer); // 작성자 출력
                        System.out.println(" 내용 : " + board.content); // 내용 출력
                        System.out.println("------------------------------------"); // 구분선 출력
                    }
                }
            }
        }
    }
}
