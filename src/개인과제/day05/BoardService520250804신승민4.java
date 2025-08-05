package 개인과제.day05; // 패키지 선언: 개인과제/day05 폴더에 위치한 클래스임을 명시

import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 임포트

// 메인 클래스 선언
public class BoardService520250804신승민4 {
    public static void main(String[] args) {
        BoardController bs = new BoardController(); // 게시물 관리를 위한 컨트롤러 객체 생성

        for ( ; ; ) { // 무한 루프: 사용자가 프로그램을 종료하지 않는 이상 계속 반복
            // 메뉴 출력
            System.out.println("=============== My Community ===============");
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("============================================");

            System.out.print("선택 > "); // 사용자 입력 유도
            Scanner scan = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성
            int choose = scan.nextInt(); // 사용자의 선택값을 입력받아 정수로 저장

            if (choose == 1) { // 1번 선택 시: 게시물 작성
                System.out.println(" 내용 : "); // 게시물 내용 입력 요청
                String content = scan.next(); // 내용 입력 받기

                System.out.println(" 작성자 : "); // 작성자 이름 입력 요청
                String writer = scan.next(); // 작성자 이름 입력 받기

                boolean result = bs.doPost(content, writer); // 게시물 등록 시도

                // 등록 결과에 따라 안내 메시지 출력
                if (result) {
                    System.out.println("[안내] 글쓰기 성공"); // 등록 성공 시
                } else {
                    System.out.println("[경고] 글쓰기 실패"); // 등록 실패 시
                }

            } else if (choose == 2) { // 2번 선택 시: 게시물 출력
                System.out.println("============== 게시물 목록 ==============");

                Board[] boards = bs.doGet(); // 저장된 게시물 목록 가져오기

                // 배열 전체를 순회
                for (int index = 0; index <= boards.length - 1; index++) {
                    Board board = boards[index]; // 현재 인덱스의 게시물 가져오기

                    if (board != null) { // null이 아닌 경우만 출력
                        System.out.println(" 작성자 : " + board.writer); // 작성자 출력
                        System.out.println(" 내용 : " + board.content); // 내용 출력
                        System.out.println("----------------------------------------"); // 구분선 출력
                    }
                }
            }
            // 선택이 1도 2도 아닌 경우는 무시되며 반복문 처음으로 돌아감
        }
    }
} // class end
