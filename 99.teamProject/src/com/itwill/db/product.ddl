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



ALTER TABLE Product ADD CONSTRAINT IDX_Product_PK PRIMARY KEY (pNo);

