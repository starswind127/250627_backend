package practice; // .java 파일의 폴더/패키지 위치

import java.util.Scanner;

public class comppra2 { // class start
    public static void main(String[] args) { // main start
        String[] contents = new String[100];    // 총 문자열(String) 100개를 저장할수 있는 배열 선언
        String[] writers = new String[100];     // 총 문자열(String) 100개를 저장할수 있는 배열 선언

        for( ; ; ) {
            System.out.println("============= 맛집 대기 시스템 =============");
            System.out.println("  1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner( System.in );
            int choose = scan.nextInt();
            if( choose == 1 ){
                System.out.print("전화번호 : ");          String content = scan.next();
                System.out.print("인원 수 : ");         String writer = scan.next();

                boolean check = false;
                for( int index = 0 ; index <= contents.length -1 ; index++ ){
                    if( contents[index] == null ){
                        contents[index] = content;
                        writers[index] = writer;
                        check = true;   break;
                    }
                }
                if( check ){  System.out.println("[안내] 글쓰기 성공"); }
                else{  System.out.println("[경고] 더이상 대기등록을 할 수 없습니다."); }

            }else if( choose == 2 ){
                System.out.println("============= 대기 현황 =============");

                for( int index = 0 ; index <= contents.length - 1 ; index++ ){
                    if( contents[index] != null ){
                        System.out.println( ( index + 1 ) +". 연락처 : " + contents[index] + " - 인원수 :" + writers[index] );
                        System.out.println("------------------------------------------");
                    } // if end
                } // for end
            }
        } // for end
    } // main end
} // class end
