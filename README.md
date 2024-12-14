# JavaWeb-MyBatis

練習 MyBatis 的簡單 SpringBoot小專案<br />

```no-highlight
預前準備

1.
在你的電腦安裝
資料庫：Microsoft SQL Server 2017 (RTM-GDR) (KB4494351) - 14.0.2014.14 (X64)
Java開發包：jdk 11.0.17
IDE：Eclipse IDE


2.
打開 Microsoft SQL Server Management Studio 17
執行下述指令 創建資料庫表 以及相關資料。

USE [book];

CREATE TABLE [dbo].[product2](
    [booknum] [int] NOT NULL,
    [bookname] [nvarchar](50) NULL,
    [booktype] [nvarchar](4) NULL,
    [author] [nvarchar](20) NULL,
    [price] [int] NULL,
    PRIMARY KEY([booknum])
);

INSERT INTO product2(booknum, bookname, booktype, author, price) VALUES(1, 'C語言教學手冊（四版）', 'A', '洪維恩', 620);
INSERT INTO product2(booknum, bookname, booktype, author, price) VALUES(2, 'C++ 教學手冊 第三版', 'B', '洪維恩', 640);
INSERT INTO product2(booknum, bookname, booktype, author, price) VALUES(3, 'Java 7 教學手冊 第五版', 'B', '林信良', 700);
INSERT INTO product2(booknum, bookname, booktype, author, price) VALUES(4, 'jQuery 實戰手冊(第三版)', 'C', '林信良', 450);


3.
進入 src\main\resources\ 資料夾，
接著創建 application.properties 檔案
輸入內容可參考 application.properties.local範例檔案
在 application.properties 加入資料庫連線URL、帳號、密碼 等相關設定。


4.
打開 命令提示字元，
用 cd 指令移動到此專案的根目錄。
接著下指令 run2.bat 來 啟動 SpringBoot專案。
```