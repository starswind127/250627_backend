# 01.데이터베이스생성과삭제

#한줄 주석
-- 한줄 주석
/* 여러줄 주석 */

-- [2] SQL 명령어 작성 방법
-- 1. SQL 문법을 작성한다. 2. SQL 문법 끝에 ;으로 마친다.
show databases; 
-- [3] SQL 명령어 실행방법.
-- 1. 단위 실행(;) : 실행할 명령문에 커서를 두고 Ctrl+enter 혹은 상단메뉴 번개(I) 아이콘 클릭
-- 2. 전체 실행 : 현재 파일내 모든 명령어(문장) 실행(위에서 아래로) ctrl+shift+enter 혹은 상단메뉴 번개 아이콘 클릭
-- [4] 실행 결과보는 법
-- 1. 실행후 메뉴 하단에 [ result grid ] 혹은 [ output ] 창 확인 하여 명령문 결과 확인한다.

-- [5] 데이터베이스 관련 주요 명령어
# 1. 데이터베이스가 저장된 로컬 경로 확인
show variables like 'datadir'; # 마지막 ; 잊지 않기.
# C:\ProgramData\MySQL\MySQL Server 8.0\Data , 내 컴퓨터에 DB서버 로컬 경로

# 2. DB서버내 데이터베이스를 생성하기 
# create(생성), database(자료집합소), mydb0714(아무거나 : DB이름)
create database mydb0714;	# 실행할 명령문에 [마우스] 커서를 두고 ctrl+ enter
# 주의할점 : 실행후 하단에 'xxxxxx' ; database exist 이미 존재하는 DB명

# 3. DB서버내 데이터베이스 삭제 하기 
# drop( 버림 ) database mydb0714( 삭제할 DB이름 )
drop database mydb0714; # 두번 실행하면 'xxxxxx' ; database doesn't exist 존재하지 않는 DB명

# 4. DB서버내 데이터베이스가 *존재* 하면 삭제하기
# if(만약)  exists(존재하다)
drop database if  exists mydb0714; # 여러번 실행해도 오류가 없다. 경고는 있다.

# 5. DB서버내 데이터베이스 목록 보기
# show(보다) database*s( 데이터 베이스 목록)
show databases;	# [grid result] 창에서 롹인

# 6. DB서버내 사용할 데이터베이스 (사용) 활성화 하기 
# use (사용하다);
use mydb0714;

# UI 에서 데이터베이스 확인 : 워크벤치 왼쪽 메뉴 [ navigator ] -> [새로고침] 아이콘 클릭
# 진하게 표시된 데이터베이스가 현재 (사용) 활성화 된 상태 뜻

# 예제1 : 데이터베이스 기본 세팅/준비
drop database if exists test0714;	# 'test0714' 존재 시 삭제 
create database test0714; 			# 'test0714' 이름으로 데이터베이스 생성
show databases;						# DB내 모든 데이터베이스 목록보기
use test0714;						# 'test0714' 활성

# 현재 파일을 저장하는 방법 : ctrl+s 강의에서는 자바프로젝트 폴더내 함께 저장

