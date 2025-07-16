package Comprehensive.Comp2; // .java 파일의 폴더/패키지 위치

import java.util.Scanner;

public class Comp2 { // class start
    public static void main(String[] args) { // main start
        Waiting[] waitings = new Waiting[100];
        for( ; ; ) {
            System.out.println("============= 맛집 대기 시스템 =============");
            System.out.println("   1.대기 등록 | 2.대기 현황 ");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner( System.in );
            int choose = scan.nextInt();
            if( choose == 1 ){
                System.out.print("전화번호 : ");         String phone = scan.next();
                System.out.print("인원수 : ");       String count = scan.next();
                Waiting waiting = new Waiting();
                waiting.phone = phone;
                waiting.count = count;
                boolean check = false;
                for( int index = 0 ; index <= waitings.length -1 ; index++ ){
                    if( waitings[index] == null ){
                        waitings[index] = waiting;
                        check = true;
                        break;
                    } // if end
                } // for end
                if( check ){  System.out.println("[안내] 대기 등록이 완료되었습니다"); }
                else{  System.out.println("[[경고] 더 이상 대기 등록을 할 수 없습니다."); }

            }else if( choose == 2 ){
                System.out.println("============= 대기 현황 =============");
                for( int index = 0 ; index <= waitings.length - 1 ; index++ ){
                    Waiting waiting = waitings[index];
                    if( waiting != null ){
                        System.out.println("전화번호: " + waiting.phone + " - 인원수: " + waiting.count + "명");
                        System.out.println("------------------------------------------");
                    } // if end
                } // for end
            }
        } // for end
    } // main end
} // class end
