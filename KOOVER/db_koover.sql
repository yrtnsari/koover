# Host: localhost  (Version 5.5.5-10.4.6-MariaDB)
# Date: 2019-12-21 16:38:03
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "tukang"
#

DROP TABLE IF EXISTS `tukang`;
CREATE TABLE `tukang` (
  `nohptkg` varchar(11) NOT NULL DEFAULT '',
  `namatkg` varchar(255) NOT NULL DEFAULT '',
  `pekerjaan` varchar(255) NOT NULL DEFAULT '',
  `alamat` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`nohptkg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "tukang"
#

INSERT INTO `tukang` VALUES ('04545454','Yono','Vermak','Bogor'),('0898989','Tukul','Cangkul','Jakarta');

#
# Structure for table "users"
#

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `nohp` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(8) NOT NULL DEFAULT '',
  `nama` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`nohp`)
) ENGINE=InnoDB AUTO_INCREMENT=9090910 DEFAULT CHARSET=utf8mb4;

#
# Data for table "users"
#

INSERT INTO `users` VALUES (9,'0','yuhu'),(9090909,'lao','dd');
