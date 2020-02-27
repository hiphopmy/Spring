--CREATE
CREATE TABLE Address(
		aNo                           		NUMBER(10)		 NULL ,
		aName                         		VARCHAR2(50)		 NOT NULL,
		address                       		VARCHAR2(255)		 NOT NULL,
		aPhone                        		VARCHAR2(20)		 NOT NULL,
		cEmail                        		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE Address_aNo_SEQ;
CREATE SEQUENCE Address_aNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

COMMENT ON TABLE Address is '주소록';
COMMENT ON COLUMN Address.aNo is '주소록번호';
COMMENT ON COLUMN Address.aName is '받는사람';
COMMENT ON COLUMN Address.address is '주소';
COMMENT ON COLUMN Address.aPhone is '연락처';
COMMENT ON COLUMN Address.cEmail is '이메일';

ALTER TABLE Product ADD CONSTRAINT IDX_Product_PK PRIMARY KEY (pNo);
ALTER TABLE Customer ADD CONSTRAINT IDX_Customer_PK PRIMARY KEY (cEmail);

--INSERT
INSERT INTO ADDRESS (ANO, ANAME, ADDRESS, APHONE, CEMAIL) VALUES 
					(ADDRESS_ANO_SEQ.nextval,'리준수', '경기도목천시','010-9146-1415','1234@email.com');
INSERT INTO ADDRESS (ANO, ANAME, ADDRESS, APHONE, CEMAIL) VALUES 
					(ADDRESS_ANO_SEQ.nextval,'시준수', '경기도파천시','010-8146-2425','5678@email.com');
INSERT INTO ADDRESS (ANO, ANAME, ADDRESS, APHONE, CEMAIL) VALUES 
					(ADDRESS_ANO_SEQ.nextval,'디준수', '경기도천파시','010-7146-3435','9000@email.com');
--UPDATE
UPDATE ADDRESS 
SET 
ANAME = '바보야',
ADDRESS = '경기도인천시',
APHONE = '010-8456-2354'
WHERE CEMAIL = '9012@email.com';
--DELETE
DELETE FROM ADDRESS WHERE ANO = '';
--SELECT by ALL
SELECT * FROM ADDRESS;
--SELECT by one
SELECT * FROM ADDRESS WHERE ANO = 1;