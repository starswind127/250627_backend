# [4] 
# 비교연산자 : > 초과 <미만 >=이상 <=이하 =같다 !=같지않다
select * from member where mname = '블랙핑크';   -- member테이블의 mname속성의 값이 '블랙핑크' 와 같으면
select * from member where mnumber = 4;         -- member테이블의 mnumber속성의 값이 4 이면 
select * from member where mname != '블랙핑크';   -- member테이블의 mname속성의 값이 '블랙핑크' 가 아니면 
select * from member where not mname = '블랙핑크'; -- member테이블의 mname속성의 값이 '블랙핑크' 와 같지 않으면 
select * from member where mheight <= 162;      -- member테이블의 mheight속성의 값이 162 이하인 
select * from member where mheight >= 165 and mheight <= 170 ; -- mheight속성의 값이 165이상 이면서 170 이하
select * from member where mheight between 165 and 170;     -- mheight속성의 값이 165이상 이면서 170 이하
select * from member where maddr = '경기' or maddr ='전남' or maddr = '경남'; -- 조건1 or 조건2 or 조건3
select * from member where maddr in('경기' , '전남' , '경남' );
# 논리연산자 : not 부정 , and 이면서 , or 이거나 
# 기타연산자 : 속성명 between 시작값 and 끝값  , 속성명 in ( 값1, 값2, 값3 ); 
select * from member where mphone1 = ' ';      -- 속성값이 비어있는 표현 , ' '빈칸 대신에 null 사용한다.
select * from member where mphone1 = null;      -- 속성값이 null 이면 [x불가능] 
select * from member where mphone1 is null;      -- 속성값이 null 이면 [o가능]
select * from member where mphone1 is not null;   -- 속성값이 null 이 아니면 
# null연산자 : 속성명 is null , 속성명 is not null 
select * from member where mname like '에이%';   -- 속성의 값이 '에이'로 시작하는         , 에이X 에이XX 에이XXX ~   
select * from member where mname like '에이_';   -- 속성의 값이 '에이'로 시작하는 세글자    , 에이X 
select * from member where mname like '%핑크';   -- 속성의 값이 '핑크'로 끝나는 , x핑크 , xx핑크 , xxx핑크 ~
select * from member where mname like '%이%';   -- 속성의 값에 '이' 가 포함된
select * from member where mname like '_이_';   -- 속성의 값에 두번째 글자가 '이' 인 세글자  
# 문자패턴 : 속성명 like '문자패턴' , %:문자대응(개수상관) , _:문자대응(_수만큼)

# [5] order by 속성명 asc/desc , 정렬 , asc(오름차순/기본값) desc(내림차순)
# 오름차순 : 1 2 3 4 , a b c , ㄱ ㄴ ㄷ , 25-07-15 25-07-16 25-07-17
# 내림차순 : 4 3 2 1 , c b a , ㄷ ㄴ ㄱ , 25-07-17 25-07-16 25-07-15
select * from member order by mdebut asc; 
select * from member order by mdebut;   -- asc/desc 생략시 자동으로 asc(기본)
select * from member order by mdebut desc;
# 주의할점 : 2개 이상의 정렬은 ,(쉼표)구분 하되 , 1차정렬에서 중복값이 있을경우 중복값 끼리 2차 정렬 
# (1차) 먼저 주소(maddr) 내림차순으로 정렬후 (2차) 주소의 동일한 데이터끼리 mdebut(날짜) 오름차순 정렬  
select * from member order by maddr desc , mdebut asc;

# [6] limit 레코드수 , 조회결과 제한 , *페이징처리
# limit 시작레코드번호(0~) , 개수 
select * from member limit 2;      -- 조회 결과에서 상위2개만 제한
select * from member limit 0 , 2 ;   -- 조회 결과에서 0번 레코드 부터 2개 제한
select * from member limit 2 , 3 ;   -- 2번 레코드 부터 3개 제한
select * from member order by mheight desc limit 3; -- mheight 속성값들을 내림차순 으로 정렬 후 상위 3개