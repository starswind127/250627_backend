package 개인과제.day05;

import java.util.Scanner;

public class BoardService520250804신승민2 {
    public static void main(String[] args) {
        BoardController bs = new BoardController();

        for ( ; ; ){
            System.out.println("============== My Community =============");
            System.out.println(" 1. 게시물쓰기 | 2. 게시물출력 ");
            System.out.println("=========================================");
            System.out.println(" 선택 > ");
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();
            if( choose == 1 ) {
                System.out.println(" 내용 : ");
                String content = scan.next();;
                System.out.println(" 작성자 : ");
                String writer = scan.next();
                boolean result = bs.doPost( content, writer );
                if( result ){  System.out.println("[안내] 글쓰기 성공");}
                else{ System.out.println("[경고] 글쓰기 실패");}
            } else if (choose == 2 ) {
                System.out.println("=========== 게시물 목록 ===========");
                Board[] boards = bs.doGet();
                for ( int index = 0; index <= boards.length -1 ; index++){
                    Board board = boards[index];
                    if (board != null){
                        System.out.println("작성자 : " + board.writer);
                        System.out.println("작성자 : " + board.writer);
                        System.out.println("-------------------------------");
                    }
                }
            }
        }
    }// main end
} // class end