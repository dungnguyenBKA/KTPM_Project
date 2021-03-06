-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema quan_ly_nhan_khau
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema quan_ly_nhan_khau
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `quan_ly_nhan_khau` DEFAULT CHARACTER SET latin1 ;
USE `quan_ly_nhan_khau` ;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`users` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(50) NOT NULL,
  `passwd` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`nhan_khau`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`nhan_khau` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `maNhanKhau` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `hoTen` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `bietDanh` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `namSinh` DATE NULL DEFAULT NULL,
  `gioiTinh` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `noiSinh` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `nguyenQuan` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `danToc` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `tonGiao` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `quocTich` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `soHoChieu` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `noiThuongTru` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `diaChiHienNay` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `trinhDoHocVan` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `TrinhDoChuyenMon` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `bietTiengDanToc` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `trinhDoNgoaiNgu` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ngheNghiep` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `noiLamViec` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `tienAn` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ngayChuyenDen` DATE NULL DEFAULT NULL,
  `lyDoChuyenDen` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ngayChuyenDi` DATE NULL DEFAULT NULL,
  `lyDoChuyenDi` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `diaChiMoi` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ngayTao` DATE NULL DEFAULT NULL,
  `idNguoiTao` INT(11) NULL DEFAULT NULL,
  `ngayXoa` DATE NULL DEFAULT NULL,
  `idNguoiXoa` INT(11) NULL DEFAULT NULL,
  `lyDoXoa` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ghiChu` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idNguoiTao` (`idNguoiTao` ASC) ,
  INDEX `idNguoiXoa` (`idNguoiXoa` ASC) ,
  FULLTEXT INDEX `hoTen` (`hoTen`, `bietDanh`) ,
  CONSTRAINT `nhan_khau_ibfk_1`
    FOREIGN KEY (`idNguoiTao`)
    REFERENCES `quan_ly_nhan_khau`.`users` (`ID`),
  CONSTRAINT `nhan_khau_ibfk_2`
    FOREIGN KEY (`idNguoiXoa`)
    REFERENCES `quan_ly_nhan_khau`.`users` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 39
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`chung_minh_thu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`chung_minh_thu` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` INT(11) NULL DEFAULT NULL,
  `soCMT` VARCHAR(12) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `ngayCap` DATE NULL DEFAULT NULL,
  `noiCap` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idNhanKhau` (`idNhanKhau` ASC) ,
  FULLTEXT INDEX `soCMT` (`soCMT`) ,
  CONSTRAINT `chung_minh_thu_ibfk_1`
    FOREIGN KEY (`idNhanKhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 26
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`ho_khau`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`ho_khau` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `maHoKhau` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `idChuHo` INT(11) NULL DEFAULT NULL,
  `maKhuVuc` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `diaChi` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ngayLap` DATE NULL DEFAULT NULL,
  `ngayChuyenDi` DATE NULL DEFAULT NULL,
  `lyDoChuyen` TEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `nguoiThucHien` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idChuHo` (`idChuHo` ASC) ,
  FULLTEXT INDEX `maHoKhau` (`maHoKhau`) ,
  CONSTRAINT `ho_khau_ibfk_1`
    FOREIGN KEY (`idChuHo`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`dinh_chinh`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`dinh_chinh` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `idHoKhau` INT(11) NULL DEFAULT NULL,
  `thongTinThayDoi` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `thayDoiTu` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `thayDoiThanh` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ngayThayDoi` DATE NULL DEFAULT NULL,
  `nguoiThayDoi` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idHoKhau` (`idHoKhau` ASC) ,
  INDEX `nguoiThayDoi` (`nguoiThayDoi` ASC) ,
  CONSTRAINT `dinh_chinh_ibfk_1`
    FOREIGN KEY (`idHoKhau`)
    REFERENCES `quan_ly_nhan_khau`.`ho_khau` (`ID`),
  CONSTRAINT `dinh_chinh_ibfk_2`
    FOREIGN KEY (`nguoiThayDoi`)
    REFERENCES `quan_ly_nhan_khau`.`users` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`gia_dinh`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`gia_dinh` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` INT(11) NULL DEFAULT NULL,
  `hoTen` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `namSinh` DATE NULL DEFAULT NULL,
  `gioiTinh` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `quanHeVoiNhanKhau` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ngheNghiep` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `diaChiHienTai` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idNhanKhau` (`idNhanKhau` ASC) ,
  CONSTRAINT `gia_dinh_ibfk_1`
    FOREIGN KEY (`idNhanKhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 34
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`khai_tu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`khai_tu` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `soGiayKhaiTu` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `idNguoiKhai` INT(11) NULL DEFAULT NULL,
  `idNguoiChet` INT(11) NULL DEFAULT NULL,
  `ngayKhai` DATE NULL DEFAULT NULL,
  `ngayChet` DATE NULL DEFAULT NULL,
  `lyDoChet` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idNguoiKhai` (`idNguoiKhai` ASC) ,
  INDEX `idNguoiChet` (`idNguoiChet` ASC) ,
  CONSTRAINT `khai_tu_ibfk_1`
    FOREIGN KEY (`idNguoiKhai`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`),
  CONSTRAINT `khai_tu_ibfk_2`
    FOREIGN KEY (`idNguoiChet`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`tam_tru`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`tam_tru` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` INT(11) NULL DEFAULT NULL,
  `maGiayTamtru` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `soDienThoaiNguoiDangKy` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `tuNgay` DATE NOT NULL,
  `denNgay` DATE NOT NULL,
  `lyDo` TEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idNhanKhau` (`idNhanKhau` ASC) ,
  CONSTRAINT `tam_tru_ibfk_1`
    FOREIGN KEY (`idNhanKhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`tam_vang`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`tam_vang` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` INT(11) NULL DEFAULT NULL,
  `maGiayTamVang` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `noiTamtru` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `tuNgay` DATE NULL DEFAULT NULL,
  `denNgay` DATE NULL DEFAULT NULL,
  `lyDo` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idNhanKhau` (`idNhanKhau` ASC) ,
  CONSTRAINT `tam_vang_ibfk_1`
    FOREIGN KEY (`idNhanKhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`thanh_vien_cua_ho`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`thanh_vien_cua_ho` (
  `idNhanKhau` INT(11) NOT NULL,
  `idHoKhau` INT(11) NOT NULL,
  `quanHeVoiChuHo` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`idNhanKhau`, `idHoKhau`),
  INDEX `idHoKhau` (`idHoKhau` ASC) ,
  CONSTRAINT `thanh_vien_cua_ho_ibfk_1`
    FOREIGN KEY (`idNhanKhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`),
  CONSTRAINT `thanh_vien_cua_ho_ibfk_2`
    FOREIGN KEY (`idHoKhau`)
    REFERENCES `quan_ly_nhan_khau`.`ho_khau` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`tieu_su`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`tieu_su` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` INT(11) NULL DEFAULT NULL,
  `tuNgay` DATE NULL DEFAULT NULL,
  `denNgay` DATE NULL DEFAULT NULL,
  `diaChi` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ngheNghiep` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `noiLamViec` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `idNhanKhau` (`idNhanKhau` ASC) ,
  CONSTRAINT `tieu_su_ibfk_1`
    FOREIGN KEY (`idNhanKhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 13
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;

INSERT INTO `chung_minh_thu` (`ID`, `idNhanKhau`, `soCMT`, `ngayCap`, `noiCap`) VALUES
(13, 26, '000000000001', NULL, NULL),
(14, 27, '000000000002', NULL, NULL),
(15, 28, '000000000003', NULL, NULL),
(16, 29, '000000000004', NULL, NULL),
(17, 30, '000000000005', NULL, NULL),
(18, 31, '000000000006', NULL, NULL),
(19, 32, '000000000007', NULL, NULL),
(20, 33, '000000000008', NULL, NULL),
(21, 34, '000000000009', NULL, NULL),
(22, 35, '100000000001', NULL, NULL),
(23, 36, '100000000002', NULL, NULL),
(24, 37, '000000000010', NULL, NULL),
(25, 38, '000000000011', NULL, NULL);

INSERT INTO `gia_dinh` (`ID`, `idNhanKhau`, `hoTen`, `namSinh`, `gioiTinh`, `quanHeVoiNhanKhau`, `ngheNghiep`, `diaChiHienTai`) VALUES
(2, 27, 'Nguy???n Minh Qu??n', '1995-05-31', 'Nam', 'Ch???ng', 'K??? s??', 'S??? 2 T??? Quang B???u, Hai B?? Tr??ng, H?? N???i'),
(3, 28, 'Tr???n Thanh Duy??n', '1997-12-23', 'N???', 'V???', 'Nh??n vi??n v??n ph??ng', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(4, 29, 'V?? M??? Linh', '1965-12-06', 'N???', 'V???', 'N???i tr???', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(5, 29, 'Nguy???n Ti???n ?????t', '1990-09-09', 'Nam', 'Con trai', 'K??? s?? ??i???n', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(6, 29, 'Nguy???n Tr?? My', '1997-12-12', 'N???', 'Con g??i', 'Lu???t s??', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(7, 30, 'Nguy???n Ti???n D??ng', '1964-06-03', 'Nam', 'Ch???ng', 'Ph?? gi??m ?????c', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(8, 30, 'Nguy???n Ti???n ?????t', '1990-09-09', 'Nam', 'Con trai', 'K??? s?? ??i???n', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(9, 30, 'Nguy???n Tr?? My', '1997-12-12', 'N???', 'Con G??i', 'Lu???t s??', ''),
(10, 31, 'Nguy???n Ti???n D??ng', '1964-06-03', 'Nam', 'B???', 'Ph?? gi??m ?????c', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(11, 31, 'V?? M??? Linh', '1965-12-06', 'N???', 'M???', 'N???i tr???', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(12, 31, 'Nguy???n Tr?? My', '1997-12-12', 'N???', 'Em g??i', 'Lu???t s??', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(13, 32, 'Nguy???n Ti???n D??ng', '1964-06-03', 'Nam', 'B???', 'Ph?? gi??m ?????c', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(14, 32, 'V?? M??? Linh', '1965-12-06', 'N???', 'M???', 'N???i tr???', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(15, 32, 'Nguy???n Ti???n ?????t', '1990-09-09', 'Nam', 'Anh trai', 'K??? s?? ??i???n', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(16, 33, 'Nguy???n Minh Tuy???t', '1985-09-02', 'N???', 'V???', 'B??c s??', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(17, 33, 'Tr???n Trung Ki??n', '2008-12-25', 'Nam', 'Con trai', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(18, 33, 'Tr???n Th??y Ng???c', '2013-01-15', 'N???', 'Con g??i', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(19, 34, 'Tr???n Trung Ki??n', '2008-12-25', 'Nam', 'Con trai', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(20, 34, 'Tr???n Th??y Ng???c', '2013-01-15', 'N???', 'Con g??i', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(21, 34, 'Tr???n V??n Nam', '1980-07-09', 'Nam', 'Ch???ng', 'Gi???ng vi??n ?????i h???c', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(22, 35, 'Tr???n V??n Nam', '1980-07-09', 'Nam', 'B???', 'Gi???ng vi??n ?????i h???c', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(23, 35, 'Nguy???n Minh Tuy???t', '1985-09-02', 'N???', 'M???', 'B??c s??', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(24, 35, 'Tr???n Th??y Ng???c', '2013-01-15', 'N???', 'Em g??i', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(25, 36, 'Tr???n V??n Nam', '1980-07-09', 'Nam', 'B???', 'Gi???ng vi??n ?????i h???c', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(26, 36, 'Nguy???n Minh Tuy???t', '1985-09-02', 'N??? ', 'M???', 'B??c s??', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(27, 36, 'Tr???n Trung Ki??n', '2008-12-25', 'Nam', 'Anh trai', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(28, 37, 'B??i Th??? H??', '1948-02-03', 'N???', 'V???', 'N???i tr???', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(29, 37, 'L?? Th??nh Nam', '1968-06-12', 'Nam', 'Con Trai', 'C??ng nh??n', 'S??? 89, ng?? 98 Tr?????ng Chinh, H?? N???i'),
(30, 37, 'L?? Thu Th???y', '1971-03-05', 'N???', 'Con G??i', 'Nh??n vi??n v??n ph??ng', 'S??? 3, ng?? 568 ???????ng L??ng, H?? N???i'),
(31, 38, 'L?? V??n C??ng', '1945-06-04', 'Nam', 'Ch???ng', 'B??? ?????i v??? h??u', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i'),
(32, 38, 'L?? Th??nh Nam', '1968-06-12', 'Nam', 'Con trai', 'C??ng nh??n', 'S??? 89, ng?? 98 Tr?????ng Chinh, H?? N???i'),
(33, 38, 'L?? Thu Th???y', '1971-03-05', 'N???', 'Con g??i', 'Nh??n vi??n v??n ph??ng', 'S??? 3, ng?? 568 ???????ng L??ng, H?? N???i');

INSERT INTO `ho_khau` (`ID`, `maHoKhau`, `idChuHo`, `maKhuVuc`, `diaChi`, `ngayLap`, `ngayChuyenDi`, `lyDoChuyen`, `nguoiThucHien`) VALUES
(13, 'TQB002', 28, 'HN03', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '2019-12-08', NULL, NULL, NULL),
(14, 'TQB001', 26, 'HN03', 'S??? 1 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '2019-12-08', NULL, NULL, NULL),
(15, 'TQB003', 29, 'HN03', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '2019-12-08', NULL, NULL, NULL),
(16, 'TQB004', 33, 'HN03', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '2019-12-08', NULL, NULL, NULL);

INSERT INTO `nhan_khau` (`ID`, `maNhanKhau`, `hoTen`, `bietDanh`, `namSinh`, `gioiTinh`, `noiSinh`, `nguyenQuan`, `danToc`, `tonGiao`, `quocTich`, `soHoChieu`, `noiThuongTru`, `diaChiHienNay`, `trinhDoHocVan`, `TrinhDoChuyenMon`, `bietTiengDanToc`, `trinhDoNgoaiNgu`, `ngheNghiep`, `noiLamViec`, `tienAn`, `ngayChuyenDen`, `lyDoChuyenDen`, `ngayChuyenDi`, `lyDoChuyenDi`, `diaChiMoi`, `ngayTao`, `idNguoiTao`, `ngayXoa`, `idNguoiXoa`, `lyDoXoa`, `ghiChu`) VALUES
(26, 'TA26', 'Trinh V??n An', '', '1990-12-07', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 1 T??? Quang B??u, Hai B?? Tr??ng, H?? N???i', 'S??? 1 T??? Quang B??u, Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'Kh??ng', 'Anh tr??nh ????? B', 'Gi??o Vi??n', 'Tr?????ng THCS Chu V??n An', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(27, 'TD27', 'Tr???n Thanh Duy??n', '', '1997-12-23', 'N???', NULL, 'H???i Ph??ng', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 3, ???????ng ????nh ????ng, ph?????ng ????nh ????ng, qu???n Ng?? Quy???n, H???i Ph??ng', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'Kh??ng', 'Anh tr??nh ????? D', 'Nh??n vi??n v??n ph??ng', 'C??ng ty ABC', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(28, 'NQ28', 'Nguy???n Minh Qu??n', '', '1995-05-31', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'Kh??ng', 'Anh tr??nh ????? D', 'K??? s??', 'Viettel', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(29, 'ND29', 'Nguy???n Ti???n D??ng', '', '1964-06-03', 'Nam', NULL, 'H???i D????ng', 'Kinh', 'Thi??n ch??a gi??o', 'Vi???t Nam', '', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'K??? s??', 'Kh??ng', 'Kh??ng', 'Ph?? gi??m ?????c', 'C??ng ty EXE', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(30, 'VL30', 'V?? M??? Linh', '', '1965-12-06', 'N???', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12', 'C??? Nh??n', 'Kh??ng', 'Kh??ng', 'N???i tr???', 'T???i nh??', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(31, 'ND31', 'Nguy???n Ti???n ?????t', '', '1990-09-09', 'Nam', NULL, 'H???i D????ng', 'Kinh', 'Thi??n ch??a gi??o', 'Vi???t Nam', '', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'K??? s??', 'kh??ng', 'Anh tr??nh ????? C', 'K??? s?? ??i???n', 'C??ng ty ??i???n EVN', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(32, 'NM32', 'Nguy???n Tr?? My', '', '1997-12-12', 'N???', NULL, 'H???i D????ng', 'Kinh', 'Thi??n ch??a gi??o', 'Vi???t Nam', '', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'kh??ng', 'Anh tr??nh ????? D', 'Lu???t s??', 'V??n ph??ng lu???t s?? 123', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(33, 'TN33', 'Tr???n V??n Nam', '', '1980-07-09', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Ti???n s??', 'Kh??ng', 'Anh tr??nh ????? D', 'Gi???ng vi??n ?????i h???c', '?????i h???c B??ch khoa H?? N???i', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(34, 'NT34', 'Nguy???n Minh Tuy???t', '', '1985-09-02', 'N???', NULL, 'Nam ?????nh', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'Kh??ng', 'Anh tr??nh ????? D', 'B??c s??', 'B???nh vi???n qu???c t??? HJK', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(35, 'TK35', 'Tr???n Trung Ki??n', '', '2008-12-25', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '6/12 ch??nh quy', 'Kh??ng', 'Kh??ng', 'Kh??ng', 'H???c sinh', 'Tr?????ng THCS Chu V??n An', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(36, 'TN36', 'Tr???n Th??y Ng???c', '', '2013-01-15', 'N???', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '1/12 ch??nh quy', 'Kh??ng', 'Kh??ng', 'Kh??ng', 'H???c sinh', 'Tr?????ng ti???u h???c Chu V??n An', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(37, 'LC37', 'L?? V??n C??ng', '', '1945-06-04', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '10/12 ch??nh quy', 'Kh??ng', 'Kh??ng', 'Kh??ng', 'V??? h??u', 'Kh??ng', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL),
(38, 'BH38', 'B??i Th??? H??', '', '1948-02-03', 'N???', NULL, 'H???i Ph??ng', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '10/12', 'Kh??ng', 'Kh??ng', 'Kh??ng', 'N???i tr???', 'T???i nh??', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);

INSERT INTO `thanh_vien_cua_ho` (`idNhanKhau`, `idHoKhau`, `quanHeVoiChuHo`) VALUES
(26, 14, 'Ch??? h???'),
(27, 13, 'V???'),
(29, 15, 'Ch??? h???'),
(30, 15, 'V???'),
(31, 15, 'Con trai'),
(32, 15, 'Con g??i'),
(33, 16, 'Ch??? h???'),
(34, 16, 'V???'),
(35, 16, 'Con trai'),
(36, 16, 'Con g??i');

INSERT INTO `tieu_su` (`ID`, `idNhanKhau`, `tuNgay`, `denNgay`, `diaChi`, `ngheNghiep`, `noiLamViec`) VALUES
(2, 27, '2015-09-05', '2015-09-05', 'S??? 45, ng?? 56, Nguy???n Khang, C???u Gi???y, H?? N???i', 'Sinh Vi??n', '?????i h???c Th????ng m???i'),
(3, 28, '2012-09-05', '2017-09-05', '556 La Th??nh, H?? N???i', 'Sinh Vi??n', '?????i h???c B??ch khoa H?? N???i'),
(4, 29, '1989-05-10', '2000-08-25', 'S??? 5 Nguy???n Khuy???n, H?? N???i', 'Qu???n l?? nh???n s???', 'C??ng ty BCC'),
(5, 30, '1987-05-23', '1997-03-01', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'Nh??n vi??n v??n ph??ng', 'C??ng ty Zezs'),
(6, 31, '2008-09-05', '2013-09-05', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'Sinh vi??n', '?????i h???c B??ch khoa H?? N???i'),
(7, 32, '2015-09-05', '2019-09-05', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'Sinh vi??n', '?????i h???c Lu???t H?? N???i'),
(8, 33, '1998-09-05', '2003-09-05', 'S??? 66, ng?? 445 Nguy???n Khang, C???u Gi???y, H?? N???i', 'Sinh Vv??n', '?????i h???c B??ch khoa H?? N???i'),
(9, 33, '2003-10-03', '2018-08-06', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'Gi???ng vi??n', '?????i h???c C??ng ngi???p H?? N???i'),
(10, 34, '2003-09-05', '2011-09-05', 'S??? 8 T??n Th???t T??ng, H?? N???i', 'Sinh vi??n', '?????i h???c Y H?? N???i'),
(11, 34, '2011-10-03', '2015-08-09', 'S??? 8 T??n Th???t T??ng, H?? N???i', 'B??c s?? n???i tr??', 'B???nh vi???n B???ch Mai'),
(12, 37, '1961-01-01', '1963-01-01', 'Kh??ng r??', 'B??? ?????i', 'H?? N???i');

INSERT INTO `users` (`ID`, `userName`, `passwd`) VALUES
(1, 'admin', '1');



-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`khai_bao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`khai_bao` (
  `id_khaibao` INT(11) NOT NULL auto_increment,
  `id_nhankhau` INT(11) NOT NULL,
  `vung_dich` VARCHAR(50) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `bieu_hien` VARCHAR(50) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `ngay_khai_bao` DATE NOT NULL,
  PRIMARY KEY (`id_khaibao`),
  INDEX `fk_nhankhau_id_1` (`id_nhankhau` ASC) ,
  CONSTRAINT `fk_nhankhau_khaibao`
    FOREIGN KEY (`id_nhankhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`cach_ly`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`cach_ly` (
  `id_cachly` INT(11) NOT NULL auto_increment,
  `id_nhankhau` INT(11) NOT NULL,
  `noi_cach_ly` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `tgian_bat_dau` DATETIME NOT NULL,
  `muc_do_cach_ly` VARCHAR(50) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `is_tested` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id_cachly`),
    INDEX `fk_nhankhau_id_2` (`id_nhankhau` ASC) ,
  CONSTRAINT `fk_nhankhau_cachly`
    FOREIGN KEY (`id_nhankhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `quan_ly_nhan_khau`.`test`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quan_ly_nhan_khau`.`test` (
  `id_test` INT(11) NOT NULL auto_increment,
  `id_nhankhau` INT(11) NOT NULL,
  `thoi_diem_test` DATETIME NOT NULL,
  `hinh_thuc_test` VARCHAR(50) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `ket_qua` VARCHAR(50) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  PRIMARY KEY (`id_test`),
	INDEX `fk_nhankhau_id_3` (`id_nhankhau` ASC) ,
  CONSTRAINT `fk_nhankhau_test`
    FOREIGN KEY (`id_nhankhau`)
    REFERENCES `quan_ly_nhan_khau`.`nhan_khau` (`ID`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

INSERT INTO `khai_bao` VALUES (1,30,'???? N???ng','???m, s???t','2020-12-08 08:20:00');
INSERT INTO `cach_ly` VALUES (1,30, 'B???nh vi???n Thanh Nh??n','2020-12-09 09:00:00','F1',1);
INSERT INTO `test` VALUES (1,30,'2020-12-09 07:00:00','nhanh','??m t??nh');


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;