-- MySQL dump 10.13  Distrib 5.6.28, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: marketplace
-- ------------------------------------------------------
-- Server version	5.6.28-0ubuntu0.15.10.1-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `region`
--

LOCK TABLES `region` WRITE;
/*!40000 ALTER TABLE `region` DISABLE KEYS */;
INSERT INTO `region` VALUES (1,56,'De Tarapacá','I',3);
INSERT INTO `region` VALUES (2,56,'Antofagasta','II',4);
INSERT INTO `region` VALUES (3,56,'Atacama','III',5);
INSERT INTO `region` VALUES (4,56,'Coquimbo','IV',6);
INSERT INTO `region` VALUES (5,56,'De Valparaíso','V',7);
INSERT INTO `region` VALUES (6,56,'Del Lib. Bernardo O\'Higgins','VI',8);
INSERT INTO `region` VALUES (7,56,'Del Maule','VII',9);
INSERT INTO `region` VALUES (8,56,'Del Bío  Bío','VIII',10);
INSERT INTO `region` VALUES (9,56,'De La Araucanía','IX',11);
INSERT INTO `region` VALUES (10,56,'De Los Lagos','X',12);
INSERT INTO `region` VALUES (11,56,'Aysén','XI',14);
INSERT INTO `region` VALUES (12,56,'De Magallanes y La Antártica Chilena','XII',15);
INSERT INTO `region` VALUES (13,56,'Metropolitana','RM',1);
INSERT INTO `region` VALUES (14,56,'De Los Ríos','XIV',13);
INSERT INTO `region` VALUES (15,56,'Arica y Parinacota','XV',2);
/*!40000 ALTER TABLE `region` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-19 13:10:24