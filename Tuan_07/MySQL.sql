CREATE DATABASE QLSP;
USE QLSP;

CREATE TABLE DanhMuc
(
    MaDM INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    TenDM NVARCHAR(50),
    MoTa NVARCHAR(255)
);

CREATE TABLE SanPham
(
    MaSP int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    TenSP NVARCHAR(50),
    DonGia DECIMAL,
    SoLuong int,
    MoTa NVARCHAR(255),
    MaDM INT,
    CONSTRAINT PK_SanPham_DanhMuc foreign KEY (MaDM) REFERENCES DanhMuc(MaDM)
);

INSERT INTO DanhMuc
VALUES
    (1, "Điện thoại", "Mặt hàng điện thoại xách tay / chính hãng"),
    (2, "Laptop / PC", "Máy tính để bàn, máy tính xách tay"),
    (3, "Tablet", "Máy tính bảng")
;

INSERT INTO SanPham 
VALUES
    (1,"iPhone 18", 35000000, 75, "Hãng : Apple",1),
    (2,"iPhone 18 Pro", 40000000, 175, "Hãng : Apple",1),
    (3,"iPhone Duo", 75000000, 125, "Hãng : Apple",1),
    (4,"Xiaomi 18 Pro", 25000000, 25, "Hãng : Xiaomi",1),
    (5,"Xiaomi Pad 8 Pro", 13000000, 35, "Hãng : Xiaomi",3),
    (6,"Lenovo LOQ 15IRX9", 33000000, 10, "Hãng : Lenovo",2);

SELECT * FROM DanhMuc;
SELECT * FROM SanPham;
