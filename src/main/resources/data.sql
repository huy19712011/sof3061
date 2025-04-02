INSERT INTO todos(title, description, completed) VALUES('Learn Spring Boot', 'Learn Spring Boot by doing projects', 0);
INSERT INTO todos(title, description, completed) VALUES('Learn Rest API', 'Learn Rest API by doing projects', 0);
INSERT INTO todos(title, description, completed) VALUES('Learn Spring security', 'Learn Spring security by doing projects', 0);

------------------------------------------------------------------------

INSERT INTO users(name, username, email, password) VALUES('user', 'user', 'user@gmail.com', '$2a$10$ZJ95pqs8zJVEaXMiyXR49unS/21S.BoDd/yfNXXtkWeJ627r5eLWm'); -- password = 123456
INSERT INTO users(name, username, email, password) VALUES('admin', 'admin', 'admin@gmail.com', '$2a$10$ZJ95pqs8zJVEaXMiyXR49unS/21S.BoDd/yfNXXtkWeJ627r5eLWm');

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);

------------------------------------------------------------------------

INSERT INTO sinh_vien (ma_sinh_vien, ho_ten, ngay_sinh, dia_chi) VALUES
('SV001', 'Nguyen Thi Lan', '2000-05-15', 'Ha Noi'),
('SV002', 'Tran Minh Tu', '2001-08-22', 'Ho Chi Minh'),
('SV003', 'Le Quang Hieu', '1999-03-30', 'Da Nang'),
('SV004', 'Pham Minh Tu', '2000-11-12', 'Hai Phong'),
('SV005', 'Nguyen Thi Mai', '2001-06-19', 'Can Tho'),
('SV006', 'Nguyen Tuan Anh', '1998-02-25', 'Hue'),
('SV007', 'Bui Thi Mai', '1999-09-17', 'Nha Trang'),
('SV008', 'Le Thi Thanh', '2000-12-01', 'Quang Ninh'),
('SV009', 'Nguyen Minh Tien', '2001-07-06', 'Bac Ninh'),
('SV010', 'Hoang Tuan Anh', '2000-04-22', 'Vinh');

INSERT INTO bang_diem (ma_diem, sinh_vien_id, mon_hoc, diem_so) VALUES
('D001', 1, 'Toan', 8.5),
('D002', 1, 'Ly', 9.0),
('D003', 2, 'Toan', 7.0),
('D004', 2, 'Hoa', 6.5),
('D005', 3, 'Toan', 8.0),
('D006', 3, 'Hoa', 7.5),
('D007', 4, 'Anh', 8.0),
('D008', 4, 'Sinh', 9.5),
('D009', 5, 'Toan', 6.0),
('D010', 5, 'Anh', 7.8),
('D011', 6, 'Ly', 7.2),
('D012', 6, 'Hoa', 8.6),
('D013', 7, 'Toan', 9.3),
('D014', 7, 'Anh', 8.4),
('D015', 8, 'Sinh', 6.7),
('D016', 8, 'Hoa', 8.1),
('D017', 9, 'Ly', 7.5),
('D018', 9, 'Toan', 6.8),
('D019', 10, 'Anh', 9.1),
('D020', 10, 'Sinh', 7.9);