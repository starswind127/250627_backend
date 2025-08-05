// 이 클래스가 속한 패키지(폴더) 이름을 나타냄
package 개인과제.day02;

// 사용자 입력을 받기 위한 Scanner 클래스를 사용하기 위해 불러옴
import java.util.Scanner;

// 클래스 선언: 게시판 기능을 담당하는 클래스
public class BoardService220250729신승민4 {

    // main 메서드: 자바 프로그램의 시작 지점
    public static void main(String[] args) {

        // 게시물 내용을 저장할 String 배열 선언 (최대 100개까지 저장 가능)
        String[] contents = new String[100];

        // 작성자 이름을 저장할 String 배열 선언 (내용과 같은 인덱스끼리 매칭됨)
        String[] writers = new String[100];

        // 무한 반복문 시작: 프로그램이 강제 종료되기 전까지 계속 반복됨
        for (; ; ) {

            // 메뉴 화면 출력
            System.out.println("========== My community =========");
            System.out.println(" 1. 게시물 쓰기 | 2. 게시물 출력 ");
            System.out.println("=================================");

            // 입력 유도 메시지 (줄바꿈 없이 출력됨)
            System.out.print(" 선택 > ");

            // Scanner 객체 생성: 사용자 입력을 받기 위한 도구
            Scanner scan = new Scanner(System.in);

            // 사용자가 숫자를 입력하면 해당 값을 변수 choose에 저장
            int choose = scan.nextInt();

            // 사용자가 1번을 선택한 경우 = 게시물 쓰기 기능
            if (choose == 1) {

                // 게시글 내용 입력 요청
                System.out.print(" 내용 : ");

                // 입력된 내용을 문자열로 저장 (공백 포함 안 됨)
                String content = scan.next();

                // 작성자 이름 입력 요청
                System.out.print(" 작성자 : ");

                // 입력된 작성자 정보를 저장
                String writer = scan.next();

                // 글쓰기 성공 여부를 판단하기 위한 변수 (처음엔 실패 상태로 설정)
                boolean check = false;

                // 배열의 모든 칸을 순서대로 검사함
                for (int index = 0; index <= contents.length - 1; index++) {

                    // 해당 인덱스가 비어 있으면 (null) → 이곳에 저장
                    if (contents[index] == null) {
                        contents[index] = content; // 내용 저장
                        writers[index] = writer;   // 작성자 저장
                        check = true;              // 성공 여부 true로 바꿈
                        break;                     // 저장했으므로 반복 종료
                    }
                }

                // 저장 성공 여부에 따라 안내 메시지 출력
                if (check) {
                    System.out.println("[안내] 글쓰기 성공");
                } else {
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다");
                }

                // 사용자가 2번을 선택한 경우 = 게시물 출력 기능
            } else if (choose == 2) {

                // 게시물 목록 제목 출력
                System.out.println("======== 게시물 목록 ========");

                // 배열 전체를 순회하면서 비어 있지 않은 칸만 출력
                for (int index = 0; index <= contents.length - 1; index++) {

                    // 내용이 있는 게시글만 출력함
                    if (contents[index] != null) {
                        System.out.println("작성자 : " + writers[index]); // 작성자 출력
                        System.out.println("내용 : " + contents[index]);   // 내용 출력
                        System.out.println("----------------------------"); // 구분선
                    }
                }
            } // 메뉴 2번 처리 끝
        } // 무한 반복문 끝
    } // main 메서드 끝
} // 클래스 끝
