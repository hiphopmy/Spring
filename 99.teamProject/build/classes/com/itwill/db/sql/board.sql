
-------------------------------- insert문 ------------------------------------
insert into board values(BOARD_BNO_SEQ.nextval, '시험용이지롱~', '텍스트으으으으으내요오오옹', sysdate, null);

-------------------------------- update문 ------------------------------------
update board 
set btitle = 'test',
    bcontent = '업데이트해에에에엣다아',
    bdate = sysdate
where bno = 1;
    

-------------------------------- delete문 ------------------------------------
delete from board where bno = 1;



------------------------------- select문 ---------------------------------

-- 조회 시, 하나의 게시물 내용 꺼내오기
select * 
from board
where bno = 1;

-- 전체를 꺼내오기(리스트)
select * 
from board;




