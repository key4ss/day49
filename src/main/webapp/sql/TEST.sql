CREATE TABLE MEMBER(
	MID VARCHAR(10) PRIMARY KEY,
	MPW VARCHAR(10) NOT NULL,
	MNAME VARCHAR(20) NOT NULL
);
CREATE TABLE BOARD(
	BID INT PRIMARY KEY,
	MID VARCHAR(10) NOT NULL, -- FK는 반드시 상대 테이블의 PK를 사용
	MSG VARCHAR(50) NOT NULL,
	FAVCNT INT DEFAULT 0,
	RCNT INT DEFAULT 0
);
CREATE TABLE REPLY(
	RID INT PRIMARY KEY,
	MID VARCHAR(10) NOT NULL,
	BID INT NOT NULL,
	RMSG VARCHAR(30) NOT NULL,
	CONSTRAINT BOARD_REPLY FOREIGN KEY (BID) REFERENCES BOARD (BID) ON DELETE CASCADE
);