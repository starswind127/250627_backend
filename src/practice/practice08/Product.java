package practice.practice08;

public class Product {
    String name;
    int stock = 10; // 멤버변수 의 초기화

    boolean sell( int deal ){  // 메소드
        if( stock >= deal ){
            stock -= deal;
            System.out.println("구매 완료");
            return true;
        }else{
            System.out.println("재고 부족");
            return false;
        }
    }
}