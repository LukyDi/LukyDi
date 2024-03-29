CREATE DATABASE  IF NOT EXISTS `evidencianakladov_db` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `evidencianakladov_db`;
-- MySQL dump 10.13  Distrib 8.0.29, for macos12 (x86_64)
--
-- Host: localhost    Database: evidencianakladov_db
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `vydavky`
--

DROP TABLE IF EXISTS `vydavky`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vydavky` (
  `id` int NOT NULL AUTO_INCREMENT,
  `popis` varchar(45) COLLATE utf8mb3_unicode_ci NOT NULL,
  `cena` float NOT NULL,
  `kategoria` varchar(45) COLLATE utf8mb3_unicode_ci NOT NULL,
  `datum` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vydavky`
--

LOCK TABLES `vydavky` WRITE;
/*!40000 ALTER TABLE `vydavky` DISABLE KEYS */;
INSERT INTO `vydavky` VALUES (3,'Sukňa',20.9,'Oblečenie','2023-05-31'),(4,'Benzín',1.9,'PHM','2023-05-31'),(5,'Diesel',56.9,'PHM','2023-02-01'),(6,'Diesel',56.9,'PHM','2023-02-28'),(7,'Čerešne',10.9,'Ovocie','2023-02-28'),(8,'Čerešne',10.9,'Ovocie','2023-02-28'),(9,'Čerešne',10.9,'Ovocie','2023-02-28'),(10,'Čerešne',10.9,'Ovocie','2023-02-28'),(11,'Čerešne',10.9,'Ovocie','2023-02-28'),(12,'Marhule',4.5,'Ovocie','2023-05-31'),(13,'Čerešne',10.9,'Ovocie','2023-02-28'),(14,'Marhule',4.5,'Ovocie','2023-05-31'),(15,'Kofola',2.4,'Potraviny','2023-07-20');
/*!40000 ALTER TABLE `vydavky` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-20 18:05:16
