package day04;

public class Example1 {
    public static void main(String[] args) {
        /*[반복문]
        1. 조건에 따른 결과가 true 일때 반복 코드 실행
        2. for ( 초기값 ; 조건문 ; 증감식){
                실행문;
           }
           초기값 : 반복문에서 사용되는 변수 * 반복 횟수 , int i = 1
           조건문 : 반복변수의 조건은 * 주로 반복 횟수 제한 , i <=10 
           증감식 : 반복변수의 증가 또는 감소 식 , i++
           실행문 : 조건 충족시 실행 되는 코드
           
        3. 초기값 -> 조건문 -> 실행문 -> 증감식 -> 조건문 -> 실행문 -> 증감식
        
        4. 상위 fo r문이 1회전 할 때마다 하위 for 문이 전체 회전 한다 
        for(){
                for(){}
           }
        5. 주요 키워드
            break; : 가장 가까운 반복문으로 이동 반복문 멈춤
            continue : 가장 가까운 반복문으로 이동
            
            방법 for( ; ; ){}
                while( true ){}




        */
        // 반복 문이 없을때
        System.out.println( 1 );
        System.out.println( 2 );
        System.out.println( 3 );
        System.out.println( 4 );
        System.out.println( 5 );
        // 반복 문을 사용할시
        for ( int i = 1 ; i<= 5;i++ ){
            System.out.println(i);
        }
        
        //구구단 예시
            // 구구단 단
        for ( int 단 = 2 ; 단 <=9 ; 단++) {
            System.out.println(단);
        }
            // 구구단 곱
        for ( int 곱 = 1 ; 곱 <=9 ; 곱++) {
            System.out.println(곱);
        }
            //합치기
        for ( int 단 = 2 ; 단 <=9 ; 단++){
            for ( int 곱 = 1 ; 곱 <=9 ; 곱++) {
                System.out.printf("%d X %d = %d" , 단 , 곱 , 단*곱);
            }
        }
        
        
        
        
        
        
        
        
        
        
    }
}
