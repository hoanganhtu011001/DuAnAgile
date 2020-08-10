create database QL_BDS
go

use QL_BDS
go

create table NhanVien  (
	MaNV nvarchar(100) UNIQUE not null,
	TenNV nvarchar(100) not null,
	NgaySinhNV date not null,
	GioiTinhNV nvarchar(100) not null,
	SDTNV nvarchar(100) UNIQUE not null,
	CMNDNV nvarchar(100) UNIQUE not null,
	EmailNV nvarchar(100) UNIQUE not null,
	ChucVuNV nvarchar(500) not null,
	LuongNV decimal not null,
	UsernameNV nvarchar(100) UNIQUE not null,
	PasswordNV nvarchar(100) not null,
);

create table BatDongSan (
	MaBDS nvarchar(100) UNIQUE NOT NULL,
	TenBDS nvarchar(500) not null,
	GiaBDS decimal not null,
	DiaChiBDS nvarchar(500) not null,
	LoaiBDS nvarchar(500) not null,
	MotaBDS nvarchar(500),
	TrangThai nvarchar(100) not null,
);

create table KhachHang (
	MaKH nvarchar(100) UNIQUE not null,
	TenKH nvarchar(100) not null,
	NgaySinhKH date not null,
	GioiTinhKH nvarchar(100) not null,
	SDTKH nvarchar(100) UNIQUE not null,
	CMNDKH nvarchar(100) UNIQUE not null,
	EmailKH nvarchar(100) UNIQUE,
);

create table HopDong (
	MaHD nvarchar(100) UNIQUE not null,
	TenHD nvarchar(500) not null,
	MaNV nvarchar(100) not null,
	MaKH nvarchar(100) not null,
	MaBDS nvarchar(100) UNIQUE not null,
	NgayTaoHD date not null,
);

alter table NhanVien
add Constraint NhanVien_PK Primary key (MaNV);

alter table KhachHang
add Constraint KhachHang_PK primary key (MaKH);

alter table BatDongSan
add Constraint BatDongSan_PK primary key (MaBDS);

alter table HopDong
add Constraint HopDong_PK primary key (MaHD);

alter table HopDong
add Constraint HopDong_NhanVien_FK foreign key (MaNV) references NhanVien(MaNV);

alter table HopDong
add Constraint HopDong_KhachHang_FK foreign key (MaKH) references KhachHang(MaKH);

alter table HopDong
add Constraint HopDong_BatDongSan_FK foreign key (MaBDS) references BatDongSan(MaBDS);

-- Add Data
select * from NhanVien
insert into NhanVien
values
('NV009' , N'Nguyễn Ngọc fg Tuấn' , '2001-01-21' , N'Nam' , '09661512738' , '037501002286' , 'tuannguyenn5goc01@gmail.com' , N'Nhân viên' , '50000000' , 'TuanN5guyenNgoc' , '123456'),
	('NV001' , N'Nguyễn Ngọc Tuấn' , '2001-01-21' , N'Nam' , '0966112738' , '03701002286' , 'tuannguyenngoc01@gmail.com' , N'Nhân viên' , '50000000' , 'TuanNguyenNgoc' , '123456'),
	('NV002' , N'Hoàng Anh Tú' , '2001-10-01' , N'Nam' , '0966115438' , '033201006286' , 'hoanganhtu@gmail.com' , N'Quản Lý' , '100000000' , 'HoangAnhTu' , '123456'),
	('NV003' , N'Trương Đức Thắng' , '2001-01-12' , N'Nam' , '0966712738' , '033291002286' , 'truongducthang@gmail.com' , N'Nhân viên' , '50000000' , 'TruongDucThang' , '123456'),
	('NV004' , N'Hồ Ngọc Thăng' , '2001-01-21' , N'Nam' , '0966116738' , '033201052286' , 'hongocthang@gmail.com' , N'Nhân viên' , '50000000' , 'HoNgocThang' , '123456')
	

insert into BatDongSan
values
	('BDS002' , N'309B-Đơn Nguyên 2-Chung Cư 9 tầng Cầu Bươu' , 1200000000 , N'16 Phan Trọng Tuệ, Thanh Trì , Hà Nội ' , N'Căn Hộ' , N'Sổ đỏ chính chủ, 1 phòng khách 2 phòng ngủ, 1 WC, Ban công đông nam' , N'Chưa bán'),
	('BDS001' , N'Lô đất số 001' , 2000000000 , N'Sỹ Quý, Nguyên Hoà, Phù Cừ, Hưng Yên' , N'Đất nền' , N'Đất mặt đường, rộng 200 mét vuông, lô đất vuông, gần sân bóng mặt tiền hướng đông bắc' , N'Chưa bán');

insert into KhachHang
values
	('KH001' , N'Nguyễn Văn Hoàng' , '2001-05-03' , N'Nam' , '0966112739' , '033201002287' , 'hoangnguyenvan01@gmail.com');

insert into HopDong
values
	('HD001' , N'Hợp đồng mua bán đất' , 'NV001' , 'KH001' , 'BDS001' , '2020-07-01');

select * from NhanVien
select * from BatDongSan
select * from KhachHang
select * from HopDong

