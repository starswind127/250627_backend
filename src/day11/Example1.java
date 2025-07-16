package day11;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        /*
            [배열] 고정길이 , 메소드 없다. / 기능없다.
            [ArrayList] 가변길이 ,  다양한 메소드 / 기능 제공
                - 자바 회 사에 미리 제공하는 클래스
                1. 정의 : 컬렉션 프레임워크 중 리스트 자료형 클래스
                2. 목적 : 가변길이의 배열
                3. 사용법
                    1) 선언방법
                    ArrayList<항목타입> 변수명 = new ArrayList<>();
                    *<제네릭 타입 > : 리스트에 저장할 항목/요소 들의 타입
                    2) 요소 추가
                        (1) 변수명.add( 요소값 );           : 마지막 인덱스 뒤로 요소 추가
                        (2) 변수명.add( 인덱스, 요소값 );    : 지정한 인덱스에 요소 삽입
                    3) 출력/반환
                        (1) 변수명                         : 전체 요소값 문자열 반환.
                        (2) 변수명.size();                 : 리스트내 전체 요소개수 반환
                        (3) 변수명.get();                  : 지정한 인덱스에 요소값 반환
                    4) 요소 수정
                        (1) 변수명.set( 인덱스, 새로운값)     : 지정한 인덱스에 요소값 수정
                    5) 요소 삭제
                        (1) 변수명.remove( 인덱스 )          : 지정한 인덱스 삭제

                4. 리스트와 반복문 관계
                    (1) 일반 반복문
                    for( int i = 0 ; i < 리스트변수명.size() ; i++ ){
                         항목타입 변수명 = 리스트변수명.get(i);
                         }
                    (2) 항상된 반복문
                        for( 항목타입 변수명 : 리스트 변수명){
                        }

        */
        // [1] ArrayList 객체 생성하기
        ArrayList< String > 리스트객체 = new ArrayList<>();

        // [2] .add(); 요소 추가 하기.
        리스트객체.add("유재석");

        // [3] 변수명
        System.out.println( 리스트객체 );
        // ! 요소 추가
        리스트객체.add("강호동");
        리스트객체.add("신동엽");
        System.out.println( 리스트객체 );
        // ! 중간에 요소 추가
        리스트객체.add(1, "박명수");
        System.out.println( 리스트객체 );

        // [4] .set(); 요소 수정하기
        리스트객체.set(1,"노홍철");
        System.out.println( 리스트객체 );
        
        // [5] .size(); 리스트 크기 확인하기 vs 배열에서 사용한.length 비슷하다
        System.out.println( 리스트객체.size());
        
        // [6] .get(); : 요소 값 출력/반환  
        System.out.println( 리스트객체.get(1)); // 1번 인덱스의 요소값 반환  vs 변수명 [1]

        // [7] .remove(); : 요소 삭제
        리스트객체.remove( 1 ); //1번 인덱스(노홍철) 삭제
        System.out.println( 리스트객체 );

        // [8] 리스트객체와 반복문 관계
            // (1) 일반 반복문
        for( int i = 0 ; i < 리스트객체.size() ; i++ ){
            String str = 리스트객체.get(i); //1번째 인덱스 요소를 하나씩 순회
            System.out.println( str );
        }
            // (2) 향상된 반복문, for (항목타입 변수명 : 리스트명){}
        for( String str : 리스트객체 ){ // 리스트 (목록)내 요소 값 하나씩 str에 대입 반복
            System.out.println( str );
        }
        
        // [9] String이 아닌 내가만든 클래스 타입
        Member m1 = new Member("강호동" , 10 ); // 1)3개의 Member 객체 생성
        Member m2 = new Member("신동엽" , 20 );
        Member m3 = new Member("유재석" , 30 );
        // 2) <Memver> 타입/클래스 의 객체 3개를 저장할 ArrayList 객체 생성
        ArrayList< Member > memberList = new ArrayList<>();
        // 3) 리스트에 객체들을 저장하기
        memberList.add( m1 );
        memberList.add( m2 );
        memberList.add( m3 );
        // 4) 리스트네 요소(객체)들을 순회(하나씩 조회) 하기
        for( int i = 0 ; i < memberList.size() ; i++ ){
            Member m = memberList.get(i); // [i] --> .get(i)
            System.out.println("이름 : " + m.name );
            System.out.println("나이 : " + m.age );
        }

    } // main end
} // class end

class Member{
    String name; // 이름
    int age;  // 나이
    // -> 오른쪽 클릭 -> 생성 -> 생성자 -> 여러개 속성 본수 선택후 -> [확인]
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
