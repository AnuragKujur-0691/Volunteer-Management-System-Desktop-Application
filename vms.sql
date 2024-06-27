-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 18, 2023 at 01:30 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `swe`
--

-- --------------------------------------------------------

--
-- Table structure for table `apply`
--

DROP TABLE IF EXISTS `apply`;
CREATE TABLE IF NOT EXISTS `apply` (
  `applyid` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `vid` varchar(100) NOT NULL,
  `skills` varchar(1000) NOT NULL,
  `experience` varchar(100) NOT NULL,
  `contribute` varchar(1000) NOT NULL,
  `idtype` varchar(100) NOT NULL,
  `shift` varchar(100) DEFAULT NULL,
  `starttime` time(6) DEFAULT NULL,
  `endtime` time(6) DEFAULT NULL,
  PRIMARY KEY (`applyid`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `apply`
--

INSERT INTO `apply` (`applyid`, `name`, `roll`, `email`, `vid`, `skills`, `experience`, `contribute`, `idtype`, `shift`, `starttime`, `endtime`) VALUES
(1, 'IJN', '255554', 'ijn@vms.com', '1', '', '', 'useless', 'ACCEPTED', 'Day', '07:00:00.000000', '12:00:00.000000'),
(2, 'IJNa', '2555542', 'ijn@vms.coma', '12', '', '', 'useless', 'REJECTED', '', '00:00:00.000000', '00:00:00.000000'),
(22, 'IJN', '255554', 'ijn@vms.com', '3', '', '', 'I am from MCA.', 'ACCEPTED', 'Day', '07:00:00.000000', '12:00:00.000000'),
(21, 'IJN', '255554', 'ijn@vms.com', '2', '', '', 'I Think I am capable for it, because, I am a good book reader and a keeper too.', 'ACCEPTED', 'Day', '07:00:00.000000', '12:00:00.000000'),
(23, 'Boda Rakesh', 'M210685CA', 'rakesh@vms.com', '4', '', '', 'I am good for this!', 'ACCEPTED', 'Day', '08:00:00.000000', '12:00:00.000000'),
(24, 'Boda Rakesh', 'M210685CA', 'rakesh@vms.com', '5', '', '', 'I am eligible.', 'ACCEPTED', 'Day', '08:00:00.000000', '12:00:00.000000'),
(25, 'IJN', '255554', 'ijn@vms.com', '12', 'Leadership', 'No', 'i can try', 'ACCEPTED', 'Day', '07:00:00.000000', '12:00:00.000000'),
(26, 'Boda Rakesh', 'M210685CA', 'rakesh@vms.com', '14', 'Designer\nInterior Designing\nPainter', 'Yes', 'I can design the walls', 'ACCEPTED', 'Noon', '02:00:00.000000', '06:00:00.000000'),
(27, 'IJN', '255554', 'ijn@vms.com', '15', 'Serving', 'Yes', 'Mess Serving', 'ACCEPTED', 'Day', '07:00:00.000000', '12:00:00.000000'),
(28, 'IJN', '255554', 'ijn@vms.com', '14', 'DecorATING', 'Yes', 'Interior design', 'ACCEPTED', 'Day', '07:00:00.000000', '12:00:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `opportunities`
--

DROP TABLE IF EXISTS `opportunities`;
CREATE TABLE IF NOT EXISTS `opportunities` (
  `code` int(100) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `studentrequired` int(100) NOT NULL,
  `period` int(100) NOT NULL,
  `lastdate` varchar(100) NOT NULL,
  `contactemail` varchar(100) NOT NULL,
  `moredetails` varchar(1000) NOT NULL,
  `studentsapplied` int(100) NOT NULL DEFAULT '0',
  `studentsentered` int(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`code`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opportunities`
--

INSERT INTO `opportunities` (`code`, `title`, `studentrequired`, `period`, `lastdate`, `contactemail`, `moredetails`, `studentsapplied`, `studentsentered`) VALUES
(1, 'Garbage Collection', 30, 12, '2023-04-26', 'admin@vms.com', 'You were the collector', 0, 0),
(2, 'Library', 4, 30, '2023-04-27', 'admmin@vms.com', '', 0, 0),
(3, 'NSL Admin', 2, 30, '2023-01-31', 'admin@vms.com', '', 0, 0),
(4, 'Holi Event Manager', 10, 1, '2023-01-31', 'admin@vms.com', '', 0, 0),
(5, 'Ragam Backstage Volunteers', 10, 3, '2023-02-03', 'admin@vms.com', '', 0, 0),
(12, 'Picnic', 2, 10, '2023-04-24', 'admin@vms.com', 'Leadership', 1, 2),
(14, 'Ganesh Puja Decorators', 5, 4, '2023-03-31', 'admin@vms.com', 'Should have a good knowledge on designs and decorations.', 2, 2),
(15, 'Mess Serving', 1, 10, '2023-03-17', 'admin@vms.com', 'No Details', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `requests`
--

DROP TABLE IF EXISTS `requests`;
CREATE TABLE IF NOT EXISTS `requests` (
  `requestid` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `vid` varchar(100) NOT NULL,
  `requestfor` varchar(100) NOT NULL,
  `suggestion` varchar(100) DEFAULT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`requestid`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `requests`
--

INSERT INTO `requests` (`requestid`, `name`, `email`, `vid`, `requestfor`, `suggestion`, `remarks`) VALUES
(4, 'IJN', 'ijn@vms.com', '1', 'Opt Out', ' ', ' '),
(5, 'IJN', 'ijn@vms.com', '1', 'Shift Change', 'Day', 'ACCEPTED'),
(6, 'IJN', 'ijn@vms.com', '1', 'Shift Change', 'Noon', ' '),
(10, 'Boda Rakesh', 'rakesh@vms.com', '14', 'Shift Change', 'Noon', 'ACCEPTED'),
(7, 'IJN', 'ijn@vms.com', '3', 'Shift Change', 'Day', ' '),
(8, 'Boda Rakesh', 'rakesh@vms.com', '4', 'Shift Change', 'Noon', 'ACCEPTED'),
(9, 'Boda Rakesh', 'rakesh@vms.com', '5', 'Shift Change', 'Evening', 'ACCEPTED');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`name`, `roll`, `email`, `phone`, `password`, `gender`) VALUES
('IJN', '255554', 'ijn@vms.com', '7978322882', '123456', 'Male'),
('Boda Rakesh', 'M210685CA', 'rakesh@vms.com', '8008265843', '123456', 'Male'),
('Ijn', 'M210645CA', 'ijn@vms.coma', '4512563258', '123456', 'male');

-- --------------------------------------------------------

--
-- Table structure for table `volunteers`
--

DROP TABLE IF EXISTS `volunteers`;
CREATE TABLE IF NOT EXISTS `volunteers` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `vid` varchar(100) NOT NULL,
  `dailytime` time(6) NOT NULL,
  `dailydate` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
