package 개인과제.day05;

//(1) (게시물) 데이터 모델/ 형식
public class Board {
    // 1. 멤버변수
    String content;
    String writer;
    // 2. 생성자
        // -> 인텔리제이에서 자동생성자 지원
        // 1. 코드 파일내 빈공간 오른쪽 클릭
        // 2. [생성] -> [생성자]
        // 3. ctrl키 이용한 멤버변수 복수 선택 후 -> [선택]

    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}

