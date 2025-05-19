-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2024 at 08:52 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pasystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `First Name` varchar(20) NOT NULL,
  `Last Name` varchar(20) NOT NULL,
  `Birthday` varchar(10) NOT NULL,
  `Height` varchar(5) NOT NULL,
  `Weight` varchar(5) NOT NULL,
  `Phone Number` varchar(11) NOT NULL,
  `Gender` varchar(12) NOT NULL,
  `Appointment Purpose` varchar(20) NOT NULL,
  `Type of Doctor` varchar(20) NOT NULL,
  `Schedule` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`First Name`, `Last Name`, `Birthday`, `Height`, `Weight`, `Phone Number`, `Gender`, `Appointment Purpose`, `Type of Doctor`, `Schedule`) VALUES
('yawa', 'konichi', '07/27/2020', '5\'10', '62', '0988776553', 'Male', 'Physical Exam', 'Orthopedic', '06/29/2020'),
('Jerome', 'Balboa', '07/26/2004', '5\'5', '62', '09321722905', 'Male', 'Physical Exam', 'Dermatologist', '05/29/2024');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
