package 개인과제.day03;

import java.util.Scanner;

public class BoardService220250730신승민1 {
    public static void main(String[] args) {
        Board[] boards = new Board[100];

        for ( ; ; ){
            System.out.println("============ My community ============");
            System.out.println(" 1. 게시물 쓰기 | 2. 게시물 출력 ");
            System.out.println("======================================");
            System.out.print("선택 >");
            Scanner scan = new Scanner( System.in );
            int choose = scan.nextInt();
            if (choose == 1 ) {
                System.out.println("내용 : ");
                String content = scan.next();
                System.out.println("작성자 : ");
                String writer = scan.next();
                Board board = new Board();
                board.content = content;
                board.writer = writer;
                boolean check = false;
                for (int index = 0; index <= boards.length - 1; index++) {
                    if (boards[index] == null) {
                        boards[index] = board;
                        check = true;
                        break;
                    } //if end
                } //for end
                if (check) {System.out.println("[안내]글쓰기 성공");}
                else {System.out.println("[경고] 게시물 등록 공간 부족");}
            } else if ( choose == 2 ) {
                System.out.println("============= 게시물 목록 =============");
                for (int index = 0 ; index <= boards.length - 1 ; index++ ) {
                    Board board = boards[index];
                    if (board != null) {
                        System.out.println("작성자 : " + board.writer);
                        System.out.println("내용 : " + board.content);
                        System.out.println("---------------------------------");
                    } // if end
                }// for end
            } //if end
        } // for end (무한루프 종료)
    } // main end
} // class end
