package Comprehensive.Comp9.controller;

import java.util.ArrayList;

public class BoardController {
    // (*) 싱글톤
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    // (*) Controller는 Dao만 호출 할수 있다. dao 싱글톤 호출
    private BoardDao boardDao = BoardDao.getInstance();
    // (1) 등록
    public boolean boardWrite( String content , String writer ){
        // 1. 매개변수를 dto객체 생성
        BoardDto boardDto = new BoardDto( content,writer);
        // 2. dao 에게 저장할 객체를 전달하여 결과 받기
        boolean result = boardDao.boardWrite( boardDto );
        // 3. 결과를 view에게 리턴한다.
        return result;
    }
    // (2) 전체조회
    public ArrayList<BoardDto> boardPrint(){
        // 1. dao에게 매개변수없이 모든 dto 정보를 요청하여 받는다.
        ArrayList<BoardDto> result = boardDao.boardPrint();
        // 2. 결과를 view에게 리턴한다
        return result;
    }

} // class end