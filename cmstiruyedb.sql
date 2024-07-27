-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: cmsdb
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `customer_id` varchar(255) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES ('CUST12345678','Anytown','CA','456 Elm St','12345','tiruye.doe@example.com','Jhon','Doe','Preferred contact method: Email','123-456-7890'),('CUST12345679','town Any','DC','12345 Elm St','23451','tiru.workie@example.com','Tirualem','Work','Preferred contact method: Phone','123-456-7980');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers_custom_fields`
--

DROP TABLE IF EXISTS `customers_custom_fields`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers_custom_fields` (
  `customers_customer_id` varchar(255) NOT NULL,
  `custom_fields` varchar(255) DEFAULT NULL,
  `custom_fields_key` varchar(255) NOT NULL,
  PRIMARY KEY (`customers_customer_id`,`custom_fields_key`),
  CONSTRAINT `FK3qxsu2n759xns9bc422v7u44k` FOREIGN KEY (`customers_customer_id`) REFERENCES `customers` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers_custom_fields`
--

LOCK TABLES `customers_custom_fields` WRITE;
/*!40000 ALTER TABLE `customers_custom_fields` DISABLE KEYS */;
INSERT INTO `customers_custom_fields` VALUES ('CUST12345678','1990-05-15','birthday'),('CUST12345678','ABC Inc.','company'),('CUST12345679','1980-04-05','birthday'),('CUST12345679','CBA Inc.','company');
/*!40000 ALTER TABLE `customers_custom_fields` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leads_ma`
--

DROP TABLE IF EXISTS `leads_ma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leads_ma` (
  `lead_id` varchar(255) NOT NULL,
  `company` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`lead_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leads_ma`
--

LOCK TABLES `leads_ma` WRITE;
/*!40000 ALTER TABLE `leads_ma` DISABLE KEYS */;
INSERT INTO `leads_ma` VALUES ('LEAD987654','XYZ Corp','jane.doe@example.com','Jane','Doe',NULL,'987-654-3210','Referral','Open');
/*!40000 ALTER TABLE `leads_ma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leads_ma_custom_fields`
--

DROP TABLE IF EXISTS `leads_ma_custom_fields`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leads_ma_custom_fields` (
  `leads_ma_lead_id` varchar(255) NOT NULL,
  `custom_fields` varchar(255) DEFAULT NULL,
  `custom_fields_key` varchar(255) NOT NULL,
  PRIMARY KEY (`leads_ma_lead_id`,`custom_fields_key`),
  CONSTRAINT `FKb3j4r2gy425r1kwggsl82u92a` FOREIGN KEY (`leads_ma_lead_id`) REFERENCES `leads_ma` (`lead_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leads_ma_custom_fields`
--

LOCK TABLES `leads_ma_custom_fields` WRITE;
/*!40000 ALTER TABLE `leads_ma_custom_fields` DISABLE KEYS */;
INSERT INTO `leads_ma_custom_fields` VALUES ('LEAD987654','Technology','industry'),('LEAD987654','75','leadScore');
/*!40000 ALTER TABLE `leads_ma_custom_fields` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` varchar(255) NOT NULL,
  `customer_id` varchar(255) DEFAULT NULL,
  `discount` double NOT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `zip_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders_products`
--

DROP TABLE IF EXISTS `orders_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders_products` (
  `orders_order_id` varchar(255) NOT NULL,
  `price` double DEFAULT NULL,
  `product_id` varchar(255) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  KEY `FKkvbdnmkt6wjt1f11o0yxf6602` (`orders_order_id`),
  CONSTRAINT `FKkvbdnmkt6wjt1f11o0yxf6602` FOREIGN KEY (`orders_order_id`) REFERENCES `orders` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders_products`
--

LOCK TABLES `orders_products` WRITE;
/*!40000 ALTER TABLE `orders_products` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders_products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-27 13:39:44
