-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: cnpm
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chung_minh_thu`
--

DROP TABLE IF EXISTS `chung_minh_thu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `chung_minh_thu` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int DEFAULT NULL,
  `soCMT` varchar(12) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ngayCap` date DEFAULT NULL,
  `noiCap` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau` (`idNhanKhau`),
  FULLTEXT KEY `soCMT` (`soCMT`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chung_minh_thu`
--

LOCK TABLES `chung_minh_thu` WRITE;
/*!40000 ALTER TABLE `chung_minh_thu` DISABLE KEYS */;
INSERT INTO `chung_minh_thu` VALUES (13,26,'000000000001',NULL,NULL),(14,27,'000000000002',NULL,NULL),(15,28,'000000000003',NULL,NULL),(16,29,'000000000004',NULL,NULL),(17,30,'000000000005',NULL,NULL),(18,31,'000000000006',NULL,NULL),(19,32,'000000000007',NULL,NULL),(20,33,'000000000008',NULL,NULL),(21,34,'000000000009',NULL,NULL),(22,35,'100000000001',NULL,NULL),(23,36,'100000000002',NULL,NULL),(24,37,'000000000010',NULL,NULL),(25,38,'000000000011',NULL,NULL);
/*!40000 ALTER TABLE `chung_minh_thu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dinh_chinh`
--

DROP TABLE IF EXISTS `dinh_chinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `dinh_chinh` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `idHoKhau` int DEFAULT NULL,
  `thongTinThayDoi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `thayDoiTu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `thayDoiThanh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayThayDoi` date DEFAULT NULL,
  `nguoiThayDoi` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idHoKhau` (`idHoKhau`),
  KEY `nguoiThayDoi` (`nguoiThayDoi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dinh_chinh`
--

LOCK TABLES `dinh_chinh` WRITE;
/*!40000 ALTER TABLE `dinh_chinh` DISABLE KEYS */;
/*!40000 ALTER TABLE `dinh_chinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dong_gop`
--

DROP TABLE IF EXISTS `dong_gop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `dong_gop` (
  `iddong_gop` int NOT NULL AUTO_INCREMENT,
  `idHoKhau` int NOT NULL,
  `idLoaiDongGop` int NOT NULL,
  `idLanDong` int NOT NULL,
  `ngayDong` datetime NOT NULL,
  `so_tien` int DEFAULT NULL,
  PRIMARY KEY (`iddong_gop`),
  KEY `idHK` (`idHoKhau`),
  KEY `idLoai` (`idLoaiDongGop`),
  KEY `idLanDG` (`idLanDong`),
  CONSTRAINT `idHK` FOREIGN KEY (`idHoKhau`) REFERENCES `thanh_vien_cua_ho` (`idHoKhau`),
  CONSTRAINT `idLanDG` FOREIGN KEY (`idLanDong`) REFERENCES `lan_dong` (`idlan_dong`),
  CONSTRAINT `idLoai` FOREIGN KEY (`idLoaiDongGop`) REFERENCES `loai_dong_gop` (`idloai_dong_gop`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dong_gop`
--

LOCK TABLES `dong_gop` WRITE;
/*!40000 ALTER TABLE `dong_gop` DISABLE KEYS */;
/*!40000 ALTER TABLE `dong_gop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gia_dinh`
--

DROP TABLE IF EXISTS `gia_dinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `gia_dinh` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int DEFAULT NULL,
  `hoTen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `namSinh` date DEFAULT NULL,
  `gioiTinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `quanHeVoiNhanKhau` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChiHienTai` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau` (`idNhanKhau`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gia_dinh`
--

LOCK TABLES `gia_dinh` WRITE;
/*!40000 ALTER TABLE `gia_dinh` DISABLE KEYS */;
INSERT INTO `gia_dinh` VALUES (2,27,'Nguyễn Minh Quân','1995-05-31','Nam','Chồng','Kỹ sư','Số 2 Tạ Quang Bửu, Hai Bà Trưng, Hà Nội'),(3,28,'Trần Thanh Duyên','1997-12-23','Nữ','Vợ','Nhân viên văn phòng','Số 2 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(4,29,'Vũ Mỹ Linh','1965-12-06','Nữ','Vợ','Nội trợ','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(5,29,'Nguyễn Tiến Đạt','1990-09-09','Nam','Con trai','Kỹ sư điện','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(6,29,'Nguyễn Trà My','1997-12-12','Nữ','Con gái','Luật sư','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(7,30,'Nguyễn Tiến Dũng','1964-06-03','Nam','Chồng','Phó giám đốc','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(8,30,'Nguyễn Tiến Đạt','1990-09-09','Nam','Con trai','Kỹ sư điện','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(9,30,'Nguyễn Trà My','1997-12-12','Nữ','Con Gái','Luật sư',''),(10,31,'Nguyễn Tiến Dũng','1964-06-03','Nam','Bố','Phó giám đốc','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(11,31,'Vũ Mỹ Linh','1965-12-06','Nữ','Mẹ','Nội trợ','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(12,31,'Nguyễn Trà My','1997-12-12','Nữ','Em gái','Luật sư','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(13,32,'Nguyễn Tiến Dũng','1964-06-03','Nam','Bố','Phó giám đốc','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(14,32,'Vũ Mỹ Linh','1965-12-06','Nữ','Mẹ','Nội trợ','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(15,32,'Nguyễn Tiến Đạt','1990-09-09','Nam','Anh trai','Kỹ sư điện','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(16,33,'Nguyễn Minh Tuyết','1985-09-02','Nữ','Vợ','Bác sĩ','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(17,33,'Trần Trung Kiên','2008-12-25','Nam','Con trai','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(18,33,'Trần Thúy Ngọc','2013-01-15','Nữ','Con gái','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(19,34,'Trần Trung Kiên','2008-12-25','Nam','Con trai','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(20,34,'Trần Thúy Ngọc','2013-01-15','Nữ','Con gái','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(21,34,'Trần Văn Nam','1980-07-09','Nam','Chồng','Giảng viên đại học','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(22,35,'Trần Văn Nam','1980-07-09','Nam','Bố','Giảng viên đại học','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(23,35,'Nguyễn Minh Tuyết','1985-09-02','Nữ','Mẹ','Bác sĩ','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(24,35,'Trần Thúy Ngọc','2013-01-15','Nữ','Em gái','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(25,36,'Trần Văn Nam','1980-07-09','Nam','Bố','Giảng viên đại học','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(26,36,'Nguyễn Minh Tuyết','1985-09-02','Nữ ','Mẹ','Bác sĩ','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(27,36,'Trần Trung Kiên','2008-12-25','Nam','Anh trai','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(28,37,'Bùi Thị Hà','1948-02-03','Nữ','Vợ','Nội trợ','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(29,37,'Lý Thành Nam','1968-06-12','Nam','Con Trai','Công nhân','Số 89, ngõ 98 Trường Chinh, Hà Nội'),(30,37,'Lý Thu Thủy','1971-03-05','Nữ','Con Gái','Nhân viên văn phòng','Số 3, ngõ 568 Đường Láng, Hà Nội'),(31,38,'Lý Văn Công','1945-06-04','Nam','Chồng','Bộ đội về hưu','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(32,38,'Lý Thành Nam','1968-06-12','Nam','Con trai','Công nhân','Số 89, ngõ 98 Trường Chinh, Hà Nội'),(33,38,'Lý Thu Thủy','1971-03-05','Nữ','Con gái','Nhân viên văn phòng','Số 3, ngõ 568 Đường Láng, Hà Nội');
/*!40000 ALTER TABLE `gia_dinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ho_khau`
--

DROP TABLE IF EXISTS `ho_khau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `ho_khau` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `maHoKhau` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `idChuHo` int DEFAULT NULL,
  `maKhuVuc` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayLap` date DEFAULT NULL,
  `ngayChuyenDi` date DEFAULT NULL,
  `lyDoChuyen` text CHARACTER SET utf8 COLLATE utf8_unicode_ci,
  `nguoiThucHien` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idChuHo` (`idChuHo`),
  FULLTEXT KEY `maHoKhau` (`maHoKhau`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ho_khau`
--

LOCK TABLES `ho_khau` WRITE;
/*!40000 ALTER TABLE `ho_khau` DISABLE KEYS */;
INSERT INTO `ho_khau` VALUES (13,'TQB002',28,'HN03','Số 2 Tạ Quang Bửu, quần Hai Bà Trưng, Hà Nội','2019-12-08',NULL,NULL,NULL),(14,'TQB001',26,'HN03','Số 1 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','2019-12-08',NULL,NULL,NULL),(15,'TQB003',29,'HN03','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','2019-12-08',NULL,NULL,NULL),(16,'TQB004',33,'HN03','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','2019-12-08',NULL,NULL,NULL);
/*!40000 ALTER TABLE `ho_khau` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khai_tu`
--

DROP TABLE IF EXISTS `khai_tu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `khai_tu` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `soGiayKhaiTu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `idNguoiKhai` int DEFAULT NULL,
  `idNguoiChet` int DEFAULT NULL,
  `ngayKhai` date DEFAULT NULL,
  `ngayChet` date DEFAULT NULL,
  `lyDoChet` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNguoiKhai` (`idNguoiKhai`),
  KEY `idNguoiChet` (`idNguoiChet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khai_tu`
--

LOCK TABLES `khai_tu` WRITE;
/*!40000 ALTER TABLE `khai_tu` DISABLE KEYS */;
/*!40000 ALTER TABLE `khai_tu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lan_dong`
--

DROP TABLE IF EXISTS `lan_dong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `lan_dong` (
  `idlan_dong` int NOT NULL,
  `lan_thu` int NOT NULL,
  `ngay` datetime NOT NULL,
  PRIMARY KEY (`idlan_dong`),
  CONSTRAINT `idLDG` FOREIGN KEY (`idlan_dong`) REFERENCES `dong_gop` (`iddong_gop`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lan_dong`
--

LOCK TABLES `lan_dong` WRITE;
/*!40000 ALTER TABLE `lan_dong` DISABLE KEYS */;
/*!40000 ALTER TABLE `lan_dong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loai_dong_gop`
--

DROP TABLE IF EXISTS `loai_dong_gop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `loai_dong_gop` (
  `idloai_dong_gop` int NOT NULL,
  `name` varchar(150) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `code` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idloai_dong_gop`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loai_dong_gop`
--

LOCK TABLES `loai_dong_gop` WRITE;
/*!40000 ALTER TABLE `loai_dong_gop` DISABLE KEYS */;
/*!40000 ALTER TABLE `loai_dong_gop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhan_khau`
--

DROP TABLE IF EXISTS `nhan_khau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `nhan_khau` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `maNhanKhau` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `hoTen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `bietDanh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `namSinh` date DEFAULT NULL,
  `gioiTinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiSinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `nguyenQuan` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `danToc` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `tonGiao` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `quocTich` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `soHoChieu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiThuongTru` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChiHienNay` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `trinhDoHocVan` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `TrinhDoChuyenMon` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `bietTiengDanToc` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `trinhDoNgoaiNgu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiLamViec` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `tienAn` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayChuyenDen` date DEFAULT NULL,
  `lyDoChuyenDen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayChuyenDi` date DEFAULT NULL,
  `lyDoChuyenDi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChiMoi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayTao` date DEFAULT NULL,
  `idNguoiTao` int DEFAULT NULL,
  `ngayXoa` date DEFAULT NULL,
  `idNguoiXoa` int DEFAULT NULL,
  `lyDoXoa` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ghiChu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNguoiTao` (`idNguoiTao`),
  KEY `idNguoiXoa` (`idNguoiXoa`),
  FULLTEXT KEY `hoTen` (`hoTen`,`bietDanh`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_khau`
--

LOCK TABLES `nhan_khau` WRITE;
/*!40000 ALTER TABLE `nhan_khau` DISABLE KEYS */;
INSERT INTO `nhan_khau` VALUES (26,NULL,'Trinh Văn An','','1990-12-07','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 1 Tạ Quang Bưu, Hai Bà Trưng, Hà Nội','Số 1 Tạ Quang Bưu, Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','Không','Anh trình đọ B','Giáo Viên','Trường THCS Chu Văn An',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(27,NULL,'Trần Thanh Duyên','','1997-12-23','Nữ',NULL,'Hải Phòng','Kinh','Không','Việt Nam','','Số 3, đường Đình Đông, phường Đình Đông, quận Ngô Quyền, Hải Phòng','Số 2 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','Không','Anh trình độ D','Nhân viên văn phòng','Công ty ABC',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(28,NULL,'Nguyễn Minh Quân','','1995-05-31','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 2 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 2 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','Không','Anh trình độ D','Kỹ sư','Viettel',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(29,NULL,'Nguyễn Tiến Dũng','','1964-06-03','Nam',NULL,'Hải Dương','Kinh','Thiên chúa giáo','Việt Nam','','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Kỹ sư','Không','Không','Phó giám đốc','Công ty EXE',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(30,NULL,'Vũ Mỹ Linh','','1965-12-06','Nữ',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12','Cử Nhân','Không','Không','Nội trợ','Tại nhà',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(31,NULL,'Nguyễn Tiến Đạt','','1990-09-09','Nam',NULL,'Hải Dương','Kinh','Thiên chúa giáo','Việt Nam','','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Kỹ sư','không','Anh trình độ C','Kỹ sư điện','Công ty điện EVN',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(32,NULL,'Nguyễn Trà My','','1997-12-12','Nữ',NULL,'Hải Dương','Kinh','Thiên chúa giáo','Việt Nam','','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','không','Anh trình đố D','Luật sư','Văn phòng luật sư 123',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(33,NULL,'Trần Văn Nam','','1980-07-09','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Tiến sĩ','Không','Anh trình độ D','Giảng viên đại học','Đại học Bách khoa Hà Nội',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(34,NULL,'Nguyễn Minh Tuyết','','1985-09-02','Nữ',NULL,'Nam Định','Kinh','Không','Việt Nam','','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','Không','Anh trình độ D','Bác sĩ','Bệnh viện quốc tế HJK',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(35,NULL,'Trần Trung Kiên','','2008-12-25','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','6/12 chính quy','Không','Không','Không','Học sinh','Trường THCS Chu Văn An',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(36,NULL,'Trần Thúy Ngọc','','2013-01-15','Nữ',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','1/12 chính quy','Không','Không','Không','Học sinh','Trường tiểu học Chu Văn An',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(37,NULL,'Lý Văn Công','','1945-06-04','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','10/12 chính quy','Không','Không','Không','Về hưu','Không',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(38,NULL,'Bùi Thị Hà','','1948-02-03','Nữ',NULL,'Hải Phòng','Kinh','Không','Việt Nam','','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','10/12','Không','Không','Không','Nội trợ','Tại nhà',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `nhan_khau` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phi_ve_sinh`
--

DROP TABLE IF EXISTS `phi_ve_sinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `phi_ve_sinh` (
  `idphi_ve_sinh` int NOT NULL AUTO_INCREMENT,
  `idHoKhau` int NOT NULL,
  `phiVeSinh` int NOT NULL,
  `ngayNop` datetime NOT NULL,
  `Da_thu` int unsigned DEFAULT '0',
  `SoNhanKhau` int unsigned DEFAULT '1',
  `Thang` int unsigned DEFAULT NULL,
  `Nam` int unsigned DEFAULT NULL,
  PRIMARY KEY (`idphi_ve_sinh`),
  KEY `fkIDHK` (`idHoKhau`),
  CONSTRAINT `fkIDHK` FOREIGN KEY (`idHoKhau`) REFERENCES `thanh_vien_cua_ho` (`idHoKhau`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phi_ve_sinh`
--

LOCK TABLES `phi_ve_sinh` WRITE;
/*!40000 ALTER TABLE `phi_ve_sinh` DISABLE KEYS */;
INSERT INTO `phi_ve_sinh` VALUES (1,13,6000,'2020-02-10 00:00:00',1,4,4,2020),(47,14,6000,'2020-12-01 10:53:29',0,4,10,2020),(48,15,6000,'2020-12-01 10:53:29',0,4,10,2020),(49,15,6000,'2020-12-01 10:53:29',0,4,10,2020),(50,15,6000,'2020-12-01 10:53:29',0,4,10,2020),(51,15,6000,'2020-12-01 10:53:29',0,4,10,2020),(52,16,6000,'2020-12-01 10:53:29',0,4,10,2020),(53,16,6000,'2020-12-01 10:53:30',0,4,10,2020),(54,16,6000,'2020-12-01 10:53:30',0,4,10,2020),(55,16,6000,'2020-12-01 10:53:30',0,4,10,2020);
/*!40000 ALTER TABLE `phi_ve_sinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tam_tru`
--

DROP TABLE IF EXISTS `tam_tru`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `tam_tru` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int DEFAULT NULL,
  `maGiayTamtru` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `soDienThoaiNguoiDangKy` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgay` date NOT NULL,
  `denNgay` date NOT NULL,
  `lyDo` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau` (`idNhanKhau`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tam_tru`
--

LOCK TABLES `tam_tru` WRITE;
/*!40000 ALTER TABLE `tam_tru` DISABLE KEYS */;
/*!40000 ALTER TABLE `tam_tru` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tam_vang`
--

DROP TABLE IF EXISTS `tam_vang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `tam_vang` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int DEFAULT NULL,
  `maGiayTamVang` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiTamtru` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `lyDo` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau` (`idNhanKhau`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tam_vang`
--

LOCK TABLES `tam_vang` WRITE;
/*!40000 ALTER TABLE `tam_vang` DISABLE KEYS */;
/*!40000 ALTER TABLE `tam_vang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thanh_vien_cua_ho`
--

DROP TABLE IF EXISTS `thanh_vien_cua_ho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `thanh_vien_cua_ho` (
  `idNhanKhau` int NOT NULL,
  `idHoKhau` int NOT NULL,
  `quanHeVoiChuHo` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idNhanKhau`,`idHoKhau`),
  KEY `idHoKhau` (`idHoKhau`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thanh_vien_cua_ho`
--

LOCK TABLES `thanh_vien_cua_ho` WRITE;
/*!40000 ALTER TABLE `thanh_vien_cua_ho` DISABLE KEYS */;
INSERT INTO `thanh_vien_cua_ho` VALUES (26,14,'Chủ hộ'),(27,13,'Vợ'),(29,15,'Chủ hộ'),(30,15,'Vợ'),(31,15,'Con trai'),(32,15,'Con gái'),(33,16,'Chủ hộ'),(34,16,'Vợ'),(35,16,'Con trai'),(36,16,'Con gái');
/*!40000 ALTER TABLE `thanh_vien_cua_ho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tieu_su`
--

DROP TABLE IF EXISTS `tieu_su`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `tieu_su` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `diaChi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiLamViec` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau` (`idNhanKhau`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tieu_su`
--

LOCK TABLES `tieu_su` WRITE;
/*!40000 ALTER TABLE `tieu_su` DISABLE KEYS */;
INSERT INTO `tieu_su` VALUES (2,27,'2015-09-05','2015-09-05','Số 45, ngõ 56, Nguyễn Khang, Cầu Giấy, Hà Nội','Sinh Viên','Đại học Thương mại'),(3,28,'2012-09-05','2017-09-05','556 La Thành, Hà Nội','Sinh Viên','Đại học Bách khoa Hà Nội'),(4,29,'1989-05-10','2000-08-25','Số 5 Nguyễn Khuyến, Hà Nội','Quản lý nhận sự','Công ty BCC'),(5,30,'1987-05-23','1997-03-01','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Nhân viên văn phòng','Công ty Zezs'),(6,31,'2008-09-05','2013-09-05','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Sinh viên','Đại học Bách khoa Hà Nội'),(7,32,'2015-09-05','2019-09-05','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Sinh viên','Đại học Luật Hà Nội'),(8,33,'1998-09-05','2003-09-05','Số 66, ngõ 445 Nguyễn Khang, Cầu Giấy, Hà Nội','Sinh Vvên','Đại học Bách khoa Hà Nội'),(9,33,'2003-10-03','2018-08-06','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Giảng viên','Đại học Công ngiệp Hà Nội'),(10,34,'2003-09-05','2011-09-05','Số 8 Tôn Thất Tùng, Hà Nội','Sinh viên','Đại học Y Hà Nội'),(11,34,'2011-10-03','2015-08-09','Số 8 Tôn Thất Tùng, Hà Nội','Bác sĩ nội trú','Bệnh viện Bạch Mai'),(12,37,'1961-01-01','1963-01-01','Không rõ','Bộ đội','Hà Nội');
/*!40000 ALTER TABLE `tieu_su` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `passwd` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','1'),(2,'ketoan','2');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'cnpm'
--

--
-- Dumping routines for database 'cnpm'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-01 11:16:27
