package Comprehensive.Comp2; // .java 파일의 폴더/패키지 위치

import java.util.Scanner;

public class Comp2 { // class start
    public static void main(String[] args) { // main start
        String[] contents = new String[100];    // 총 문자열(String) 100개를 저장할수 있는 배열 선언
        String[] writers = new String[100];     // 총 문자열(String) 100개를 저장할수 있는 배열 선언

        for( ; ; ) {
            System.out.println("============= My Community =============");
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner( System.in );
            int choose = scan.nextInt();
            if( choose == 1 ){
                System.out.print("내용 : ");          String content = scan.next();
                System.out.print("작성자 : ");         String writer = scan.next();

                boolean check = false;
                for( int index = 0 ; index <= contents.length -1 ; index++ ){
                    if( contents[index] == null ){
                        contents[index] = content;
                        writers[index] = writer;
                        check = true;   break;
                    }
                }
                if( check ){  System.out.println("[안내] 글쓰기 성공"); }
                else{  System.out.println("[경고] 게시물을 등록할 공간이 부족합니다."); }

            }else if( choose == 2 ){
                System.out.println("============= 게시물 목록 =============");

                for( int index = 0 ; index <= contents.length - 1 ; index++ ){
                    if( contents[index] != null ){
                        System.out.println("작성자 : " + writers[index] );
                        System.out.println("내용 : " + contents[index] );
                        System.out.println("------------------------------------------");
                    } // if end
                } // for end
            }
        } // for end
    } // main end
} // class end
