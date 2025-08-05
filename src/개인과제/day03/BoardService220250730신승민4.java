// 패키지의 위치를 정의. 이 클래스는 개인과제.day03 폴더(패키지)에 들어 있음
package 개인과제.day03;

// 사용자로부터 입력을 받기 위한 Scanner 클래스 임포트
import java.util.Scanner;

// 게시판 서비스를 위한 클래스 정의. 클래스 이름은 BoardService220250730신승민4
public class BoardService220250730신승민4 {
    // 프로그램의 시작점인 main 메소드
    public static void main(String[] args) {

        // Board 객체들을 저장할 수 있는 배열 선언 (최대 100개 저장 가능)
        Board[] boards = new Board[100];

        // 무한 반복문. 사용자가 종료 명령을 내릴 때까지 계속 실행됨
        for ( ; ; ){
            // 메뉴 출력
            System.out.println("============ My community ============");
            System.out.println(" 1. 게시물 쓰기 | 2. 게시물 출력 ");
            System.out.println("======================================");
            System.out.print("선택 >");

            // 사용자 입력을 받기 위한 Scanner 객체 생성
            Scanner scan = new Scanner(System.in);

            // 사용자가 입력한 숫자(메뉴 선택)를 정수로 저장
            int choose = scan.nextInt();

            // 사용자가 1번(게시물 쓰기)를 선택했을 경우
            if (choose == 1 ) {
                // 게시물 내용 입력 받기
                System.out.println("내용 : ");
                String content = scan.next();

                // 작성자 이름 입력 받기
                System.out.println("작성자 : ");
                String writer = scan.next();

                // 새로운 게시물(Board 객체) 생성
                Board board = new Board();

                // 입력받은 내용과 작성자를 게시물에 저장
                board.content = content;
                board.writer = writer;

                // 게시물이 저장되었는지 확인하는 변수 (기본값 false)
                boolean check = false;

                // 게시물 배열에서 빈 자리를 찾아 저장
                for (int index = 0; index <= boards.length - 1; index++) {
                    if (boards[index] == null) { // 비어있는 칸이면
                        boards[index] = board;  // 그 자리에 게시물 저장
                        check = true;           // 저장 성공 표시
                        break;                  // 더 이상 반복할 필요 없으니 탈출
                    }
                }

                // 저장 여부에 따라 안내 메시지 출력
                if (check) {
                    System.out.println("[안내]글쓰기 성공");
                } else {
                    System.out.println("[경고] 게시물 등록 공간 부족");
                }

                // 사용자가 2번(게시물 출력)을 선택했을 경우
            } else if ( choose == 2 ) {
                // 게시물 목록 출력 시작
                System.out.println("============= 게시물 목록 =============");

                // 배열을 처음부터 끝까지 순회하면서 게시물이 있는지 확인
                for (int index = 0 ; index <= boards.length - 1 ; index++ ) {
                    Board board = boards[index]; // 해당 위치의 게시물 가져오기

                    if (board != null) { // 게시물이 존재하면
                        // 게시물 정보 출력
                        System.out.println("작성자 : " + board.writer);
                        System.out.println("내용 : " + board.content);
                        System.out.println("---------------------------------");
                    }
                }
            } // if (choose) 조건문 끝
        } // for 무한 반복문 끝
    } // main 메소드 끝
} // 클래스 끝
