package 개인과제.day06; // 현재 클래스의 패키지 경로를 지정

import java.util.Scanner; // 사용자 입력을 받기 위해 Scanner 클래스를 import

public class BoardService620250805신승민4 { // 게시판 서비스를 실행하는 메인 클래스
    public static void main(String[] args) { // 프로그램의 시작점: main 메서드
        for ( ; ; ) { // 무한 루프를 사용하여 메뉴를 반복해서 출력
            System.out.println("================My Community ==============="); // 커뮤니티 제목 출력
            System.out.println(" 1. 게시물 쓰기 | 2. 게시물 출력 "); // 사용자 선택 옵션 출력
            System.out.println("==========================================="); // 구분선 출력
            System.out.println(" 선택 > "); // 사용자 입력 유도
            Scanner scan = new Scanner(System.in); // 사용자로부터 입력을 받기 위한 Scanner 객체 생성
            int choose = scan.nextInt(); // 사용자가 선택한 메뉴 번호를 정수로 입력받음

            if (choose == 1) { // 1번: 게시물 쓰기를 선택한 경우
                System.out.println(" 내용 : "); // 게시물 내용을 입력받기 위한 출력문
                String content = scan.next(); // 게시물 내용 입력 받기 (공백 전까지만 입력됨)
                System.out.println(" 작성자 : "); // 작성자 입력 유도
                String writer = scan.next(); // 작성자 이름 입력 받기 (공백 전까지만 입력됨)

                boolean result = BoardController.doPost(content, writer); // 입력받은 내용과 작성자를 저장 요청

                if (result) { // 저장에 성공했을 경우
                    System.out.println(" [안내] 글쓰기 성공"); // 성공 메시지 출력
                } else { // 저장에 실패했을 경우
                    System.out.println(" [경고] 글쓰기 실패"); // 실패 메시지 출력
                }

            } else if (choose == 2) { // 2번: 게시물 목록 출력 선택
                System.out.println("================ 게시물 목록 ================="); // 게시물 목록 제목 출력

                Board[] boards = BoardController.doGet(); // 저장된 게시물 목록을 가져옴

                for (int i = 0; i < boards.length; i++) { // 배열 순회하여 게시물 출력
                    Board board = boards[i]; // 현재 인덱스의 게시물 객체 가져오기

                    if (board != null) { // 게시물이 존재하는 경우에만 출력
                        System.out.println(" 작성자 :" + board.getWriter()); // 게시물 작성자 출력
                        System.out.println(" 내용 : " + board.getContent()); // 게시물 내용 출력
                        System.out.println("------------------------------------"); // 각 게시물 간 구분선
                    }
                }
            }
        }
    }
}

