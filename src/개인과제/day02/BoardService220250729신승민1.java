package 개인과제.day02;

import java.util.Scanner;

public class BoardService220250729신승민1 { //class start
    public static void main(String[] args) { // main start
        //(5) 메모리 설계
        // boardService1에서는 총 게시물 3개 저장 , 변수 --> 게시물 100개 -> 200개 변수 필요.
        // boardService2에서는 총 게시물 100개 저장, 변수+배열 --> 게시물 100개 -> 배열 2개 변수 필요
        String[] contents = new String[100]; // 총 문자열(String) 100개를 저장할수 있는 배열 선언
        String[] writers = new String[100]; // 총 문자열(String) 100개를 저장할수 있는 배열 선언

        for ( ; ; ){                                                        // (1) 무한후프
            System.out.println("======== My Community ========"); // (2) 출력
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("==============================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner( System.in );                        // (3) 입력객체 생성
            int choose = scan.nextInt();

            if ( choose == 1 ){                                             // (4) '1'qjs 입력시
                System.out.println(" 내용 : "); String content = scan.next();
                System.out.println(" 작성자 : "); String writer = scan.next();
                // 배열네 빈(null) 공간을 찾아 빈공간에 입력 받은 값 대입한다.

                boolean check = false; // false : 저장실패 , true:저장성공

                for( int index = 0 ; index <= contents.length -1 ; index++ ){ // * 향상된 for 문 vs 일반 for 문
                    if( contents[index] == null ){ // 만약에 index 번째가 null(비어있으면) 이면
                        contents[index] = content;  // 입력받은 값 대입한다.
                        writers[index] = writer;
                        check = true;   break; // 저장 성공시 상태변수 수정후 반복문 탈출
                    }
                }

                if( check ){  System.out.println("[안내] 글쓰기 성공"); }
                else{  System.out.println("[경고] 게시물을 등록할 공간이 부족합니다."); }


            }else if( choose == 2 ) {                                        // (4) '2'번 입력시
                System.out.println("=========== 게시물 목록 ===========");
                // ** 배열내 빈(null)공간이 아니면 요소 값들 출력
                for (int index = 0; index <= contents.length - 1; index++) {
                    if (contents[index] != null) {
                        System.out.println("작성자 : " + writers[index]);
                        System.out.println("내용 : " + contents[index]);
                        System.out.println("---------------------------------");
                    } //if end
                } // for ed
            }
        } // for end
    } // main end
} //class end
