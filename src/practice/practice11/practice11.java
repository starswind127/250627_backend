package practice.practice11;

import java.util.ArrayList;

public class practice11 {
    public static void main(String[] args) {

        // 1. String 타입의 항목들을 저장할 리스트 객체
        ArrayList< String > nameList = new ArrayList<>(); // ArrayList< 요소타입 >
        nameList.add( "유재석" );
        // nameList.add( 3 ); // 오류 발생 : 요소값 과 요소 타입이 일치 하지 않다.
        nameList.add( "강호동" );
        nameList.add( "신동엽" );
        System.out.println( nameList ); // [유재석, 강호동, 신동엽]

        // 2~3
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        // 2. 일반 for문
        for( int i = 0 ; i < fruits.size() ; i++ ){
            String str = fruits.get(i);
            System.out.printf("인덱스 %d : %s \n" , i , str );
        } // for end
        // 3. 향상된 for문
        for( String str : fruits ){
            System.out.println( str );
        } // for end

        // 4. "A", "B", "C", "D", "E" 저장할 요소들의 자료타입 String , " " = String , ' ' = char
        ArrayList< String > list4 = new ArrayList<>();
        list4.add( "A");    list4.add( "B" );   list4.add("C");
        list4.add("D");     list4.add("E");
        list4.remove( 2 ); // 2번(세번째) 인덱스 요소 삭제
        System.out.println( list4 );    // [A, B, D, E]

        // 5. "자바", "파이썬", "C++"를 요소 타입 : String
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("자바");    list5.add("파이썬");   list5.add("C++");
        list5.add( 1 , "자바스크립트");   // 1번(두번째) 인덱스에 요소 삽입
        System.out.println( list5 );    // [자바, 자바스크립트, 파이썬, C++]

        // 6. Book 객체를 여러개 저장할 타입 <Book>
        ArrayList< Book > library = new ArrayList<>();
        Book book1 = new Book( "제목1" , "저자1" );
        Book book2 = new Book( "제목2" , "저자2" );
        Book book3 = new Book( "제목3" , "저자3" );
        library.add( book1 );   library.add( book2 ); library.add( book3 );
        for( Book book : library ){
            System.out.println( book ); // [ 확인용 ]
            System.out.println( "제목 : " + book.getTitle() );
            System.out.println( "저자 : " + book.getAuthor() );




        } // for end






    } // main end

} // class end
/*

[JAVA] 실습11 : ArrayList 클래스
[ 문제 ] 아래 ArrayList 관련 문제를 해결하시오.
[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.

[문제 1] String 타입의 요소를 저장할 수 있는 ArrayList를 nameList 라는 이름으로 생성하세요.
1. .add() 메소드를 사용하여 "유재석", "강호동", "신동엽" 세 개의 이름을 리스트에 추가하세요.
2. 리스트의 모든 요소를 System.out.println()으로 한 번에 출력하세요.

[문제 2] 다음과 같이 초기화된 ArrayList가 있습니다.
1. ArrayList<String> fruits = new ArrayList<>();
2. fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
3. 일반 for문을 사용하여, 각 인덱스와 해당 인덱스의 요소를 "인덱스 0: 사과" 형식으로 모두 출력하세요.

[문제 3] 문제 3의 fruits 리스트를 사용합니다.
1. 향상된 for문 을 사용하여 리스트의 모든 요소를 하나씩 출력하세요.

[문제 4] "A", "B", "C", "D", "E"를 요소로 가지는 ArrayList를 생성하세요.
1. .remove() 메소드를 사용하여 2번 인덱스의 요소("C")를 삭제하세요.
2. 삭제 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.

[문제 5] "자바", "파이썬", "C++"를 요소로 가지는 ArrayList를 생성하세요.
1. .add(인덱스, 요소) 메소드를 사용하여 1번 인덱스에 "자바스크립트"를 삽입하세요.
2. 삽입 후의 리스트 전체를 출력하여 순서가 올바르게 변경되었는지 확인하세요.

[문제 6] title(문자열)과 author(문자열) 멤버 변수를 가진 Book 클래스를 만드세요.
1. Book 객체를 저장할 수 있는 ArrayList를 library 라는 이름으로 생성하세요.
2. new Book(...)을 사용하여 3권의 책 객체를 생성하고 library 리스트에 추가하세요.
3. 향상된 for문을 사용하여 library에 저장된 모든 책의 제목과 저자를 출력하세요.

[문제 7] Scanner를 사용하여 사용자로부터 문자열을 계속해서 입력받습니다.
1. 입력받은 문자열은 ArrayList에 순서대로 저장합니다.
2. 만약 사용자가 "종료" 라는 단어를 입력하면, 입력을 멈추고 그때까지 리스트에 저장된 모든 내용을 출력한 뒤 프로그램을 종료하세요.

[문제 8] "국어", "수학", "사회", "과학"을 요소로 가지는 ArrayList를 생성하세요.
1. .set(인덱스, 요소) 메소드를 사용하여 1번 인덱스의 "수학"을 "영어"로 수정하세요.
2. 수정 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.


*/