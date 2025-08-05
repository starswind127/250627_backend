package 개인과제.day06;

import java.util.Scanner;

public class BoardService620250805신승민1 {
    public static void main(String[] args) {
        // 예제 4/5번 과 다르게 static으로 구성된 메소드는 객체가 필요 없다
        for ( ; ; ) {//무한루프
            System.out.println("============== My Commnity ==============");
            System.out.println(" 1. 게시물 쓰기 | 2. 게시물 출력 ");
            System.out.println("=========================================");
            System.out.println(" 선택 > ");
            Scanner scan = new Scanner( System.in ); // 입력
            int choose = scan.nextInt();
            if ( choose == 1) { // 입력에 따른 화면 출력
                System.out.println(" 내용 : ");
                String content = scan.next();
                System.out.print("작성자 : ");
                String writer = scan.next();
                boolean result = BoardController.doPost( content , writer ); // 클래스명.static메소드명( );
                if( result ){
                    System.out.println("[안내] 글쓰기 성공");
                }
                else{
                    System.out.println("[경고] 글쓰기 실패");
                }
            }else if( choose == 2 ) {
                System.out.println("============= 게시물 목록 =============");
                Board[] boards = BoardController.doGet();
                for( int i = 0 ; i<boards.length ; i++ ) {
                    Board board = boards[i];
                    if (board != null) { // board.content : private 이라서 불가능
                        System.out.println("작성자 : " + board.getWriter());
                        System.out.println("내용 : " + board.getContent());
                        System.out.println("------------------------------------");
                    }
                }
            }
        }
    }
}
