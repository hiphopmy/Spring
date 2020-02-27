DROP TABLE Board CASCADE CONSTRAINTS;
DROP TABLE OrdDetail CASCADE CONSTRAINTS;
DROP TABLE Ord CASCADE CONSTRAINTS;
DROP TABLE Address CASCADE CONSTRAINTS;
DROP TABLE Cart CASCADE CONSTRAINTS;
DROP TABLE Customer CASCADE CONSTRAINTS;
DROP TABLE Product CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: 상품 */
/**********************************/
CREATE TABLE Product(
		pNo                           		NUMBER(12)		 NULL ,
		pName                         		VARCHAR2(50)		 NOT NULL,
		pDesc                         		VARCHAR2(100)		 NULL ,
		pPrice                        		NUMBER(12)		 DEFAULT 0		 NULL ,
		pPoint                        		NUMBER(3,1)		 DEFAULT 5		 NULL ,
		pStockQty                     		NUMBER(12)		 DEFAULT 0		 NULL ,
		pUnit                         		VARCHAR2(10)		 NULL 
);

DROP SEQUENCE Product_pNo_SEQ;

CREATE SEQUENCE Product_pNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE Product is '상품';
COMMENT ON COLUMN Product.pNo is '상품번호';
COMMENT ON COLUMN Product.pName is '상품명';
COMMENT ON COLUMN Product.pDesc is '상품설명';
COMMENT ON COLUMN Product.pPrice is '가격';
COMMENT ON COLUMN Product.pPoint is '평점';
COMMENT ON COLUMN Product.pStockQty is '재고량';
COMMENT ON COLUMN Product.pUnit is '판매단위';


/**********************************/
/* Table Name: 고객정보 */
/**********************************/
CREATE TABLE Customer(
		cEmail                        		VARCHAR2(50)		 NULL ,
		cPassword                     		VARCHAR2(50)		 NOT NULL,
		cBirth                        		VARCHAR2(12)		 NULL ,
		cTel                          		VARCHAR2(20)		 NULL ,
		cSex                          		VARCHAR2(1)		 NULL 
);

COMMENT ON TABLE Customer is '고객정보';
COMMENT ON COLUMN Customer.cEmail is '이메일';
COMMENT ON COLUMN Customer.cPassword is '비밀번호';
COMMENT ON COLUMN Customer.cBirth is '생년월일';
COMMENT ON COLUMN Customer.cTel is '전화번호';
COMMENT ON COLUMN Customer.cSex is '성별';


/**********************************/
/* Table Name: 장바구니 */
/**********************************/
CREATE TABLE Cart(
		cNo                           		NUMBER(12)		 NULL ,
		cQty                          		NUMBER(10)		 DEFAULT 0		 NULL ,
		cPrice                        		NUMBER(10)		 DEFAULT 0		 NULL ,
		pNo                           		NUMBER(12)		 NULL ,
		cEmail                        		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE Cart_cNo_SEQ;

CREATE SEQUENCE Cart_cNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE Cart is '장바구니';
COMMENT ON COLUMN Cart.cNo is '카트번호';
COMMENT ON COLUMN Cart.cQty is '수량';
COMMENT ON COLUMN Cart.cPrice is '가격';
COMMENT ON COLUMN Cart.pNo is '상품번호';
COMMENT ON COLUMN Cart.cEmail is '이메일';


/**********************************/
/* Table Name: 주소록 */
/**********************************/
CREATE TABLE Address(
		aNo                           		NUMBER(10)		 NULL ,
		aName                         		VARCHAR2(50)		 NOT NULL,
		adresss                       		VARCHAR2(255)		 NOT NULL,
		aPhone                        		VARCHAR2(20)		 NOT NULL,
		cEmail                        		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE Address_aNo_SEQ;

CREATE SEQUENCE Address_aNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE Address is '주소록';
COMMENT ON COLUMN Address.aNo is '주소록번호';
COMMENT ON COLUMN Address.aName is '받는사람';
COMMENT ON COLUMN Address.adresss is '주소';
COMMENT ON COLUMN Address.aPhone is '연락처';
COMMENT ON COLUMN Address.cEmail is '이메일';


/**********************************/
/* Table Name: 주문정보 */
/**********************************/
CREATE TABLE Ord(
		oNo                           		NUMBER(12)		 NULL ,
		oCnt                          		NUMBER(10)		 DEFAULT 0		 NULL ,
		oAmount                       		NUMBER(10)		 DEFAULT 0		 NULL ,
		oCharge                       		VARCHAR2(10)		 NULL ,
		oSts                          		VARCHAR2(1)		 NULL ,
		oDate                         		DATE		 DEFAULT sysdate		 NULL ,
		cEmail                        		VARCHAR2(50)		 NULL ,
		aNo                           		NUMBER(10)		 NULL 
);

DROP SEQUENCE Ord_oNo_SEQ;

CREATE SEQUENCE Ord_oNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE Ord is '주문정보';
COMMENT ON COLUMN Ord.oNo is '주문번호';
COMMENT ON COLUMN Ord.oCnt is '주문건수';
COMMENT ON COLUMN Ord.oAmount is '총금액';
COMMENT ON COLUMN Ord.oCharge is '결재수단';
COMMENT ON COLUMN Ord.oSts is '상태';
COMMENT ON COLUMN Ord.oDate is '주문일자';
COMMENT ON COLUMN Ord.cEmail is '이메일';
COMMENT ON COLUMN Ord.aNo is '주소록번호';


/**********************************/
/* Table Name: 주문상세 */
/**********************************/
CREATE TABLE OrdDetail(
		odNo                          		NUMBER(10)		 NULL ,
		odQty                         		NUMBER(10)		 DEFAULT 0		 NULL ,
		odPrice                       		NUMBER(10)		 DEFAULT 0		 NULL ,
		oNo                           		NUMBER(12)		 NULL ,
		pNo                           		NUMBER(12)		 NULL 
);

DROP SEQUENCE OrdDetail_odNo_SEQ;

CREATE SEQUENCE OrdDetail_odNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

COMMENT ON TABLE OrdDetail is '주문상세';
COMMENT ON COLUMN OrdDetail.odNo is '주문상세번호';
COMMENT ON COLUMN OrdDetail.odQty is '주문수량';
COMMENT ON COLUMN OrdDetail.odPrice is '주문금액';
COMMENT ON COLUMN OrdDetail.oNo is '주문번호';
COMMENT ON COLUMN OrdDetail.pNo is '상품번호';


/**********************************/
/* Table Name: 게시판 */
/**********************************/
CREATE TABLE Board(
		bNo                           		NUMBER(12)		 NULL ,
		bTitle                        		VARCHAR2(255)		 NULL ,
		bContent                      		VARCHAR2(4000)		 NULL ,
		bDate                         		DATE		 DEFAULT sysdate		 NULL ,
		cEmail                        		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE Board_bNo_SEQ;

CREATE SEQUENCE Board_bNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE Board is '게시판';
COMMENT ON COLUMN Board.bNo is '글번호';
COMMENT ON COLUMN Board.bTitle is '글제목';
COMMENT ON COLUMN Board.bContent is '글내용';
COMMENT ON COLUMN Board.bDate is '글쓴날자';
COMMENT ON COLUMN Board.cEmail is '이메일';



ALTER TABLE Product ADD CONSTRAINT IDX_Product_PK PRIMARY KEY (pNo);

ALTER TABLE Customer ADD CONSTRAINT IDX_Customer_PK PRIMARY KEY (cEmail);

ALTER TABLE Cart ADD CONSTRAINT IDX_Cart_PK PRIMARY KEY (cNo);
ALTER TABLE Cart ADD CONSTRAINT IDX_Cart_FK0 FOREIGN KEY (pNo) REFERENCES Product (pNo);
ALTER TABLE Cart ADD CONSTRAINT IDX_Cart_FK1 FOREIGN KEY (cEmail) REFERENCES Customer (cEmail);

ALTER TABLE Address ADD CONSTRAINT IDX_Address_PK PRIMARY KEY (aNo);
ALTER TABLE Address ADD CONSTRAINT IDX_Address_FK0 FOREIGN KEY (cEmail) REFERENCES Customer (cEmail);

ALTER TABLE Ord ADD CONSTRAINT IDX_Ord_PK PRIMARY KEY (oNo);
ALTER TABLE Ord ADD CONSTRAINT IDX_Ord_FK0 FOREIGN KEY (cEmail) REFERENCES Customer (cEmail);
ALTER TABLE Ord ADD CONSTRAINT IDX_Ord_FK1 FOREIGN KEY (aNo) REFERENCES Address (aNo);

ALTER TABLE OrdDetail ADD CONSTRAINT IDX_OrdDetail_PK PRIMARY KEY (odNo);
ALTER TABLE OrdDetail ADD CONSTRAINT IDX_OrdDetail_FK0 FOREIGN KEY (pNo) REFERENCES Product (pNo);
ALTER TABLE OrdDetail ADD CONSTRAINT IDX_OrdDetail_FK1 FOREIGN KEY (oNo) REFERENCES Ord (oNo);

ALTER TABLE Board ADD CONSTRAINT IDX_Board_PK PRIMARY KEY (bNo);
ALTER TABLE Board ADD CONSTRAINT IDX_Board_FK0 FOREIGN KEY (cEmail) REFERENCES Customer (cEmail);

