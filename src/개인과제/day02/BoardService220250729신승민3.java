package 개인과제.day02;

import java.util.Scanner;

public class BoardService220250729신승민3 {
    public static void main(String[] args) {
        String[] contents = new String[100];
        String[] writers = new String[100];

        for ( ; ; ){
            System.out.println("========== My community =========");
            System.out.println(" 1. 게시물 쓰기 | 2. 게시물 출력 ");
            System.out.println("=================================");
            System.out.print(" 선택 > ");
            Scanner scan = new Scanner( System.in );
            int choose = scan.nextInt();
            if (choose == 1 ) {
                System.out.print(" 내용 : ");             String content = scan.next();
                System.out.print(" 작성자 : ");           String writer = scan.next();
                boolean check = false;
                for (int index = 0; index <= contents.length - 1; index++) {
                    if (contents[index] == null) {
                        contents[index] = content;
                        writers[index] = writer;
                        check = true;
                        break;
                    }
                }
                if (check) {System.out.println("[안내] 글쓰기 성공");}
                else {System.out.println("[경고] 게시물을 등록할 공간이 부족합니다");}
            } else if (choose == 2) {
                System.out.println("======== 게시물 목록 ========");
                for (int index = 0; index <= contents.length - 1 ; index++ ){
                    if (contents[index] != null){
                        System.out.println("작성자 : "+ writers[index]);
                        System.out.println("내용 : "+ contents[index]);
                        System.out.println("----------------------------");
                    }
                }
            }
        }
    }
}