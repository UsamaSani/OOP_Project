-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2024 at 06:18 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quizforge`
--

-- --------------------------------------------------------

--
-- Table structure for table `assignmentquestion`
--

CREATE TABLE `assignmentquestion` (
  `SRn0` int(100) NOT NULL,
  `Assignment` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `assignmentquestion`
--

INSERT INTO `assignmentquestion` (`SRn0`, `Assignment`) VALUES
(9, 'xhbcv;khxhzcbv;khxbcv'),
(10, 'xhbcv;khxhzcbv;khxbcv'),
(11, 'xhbcv;khxhzcbv;khxbcv'),
(12, 'xhbcv;khxhzcbv;khxbcv'),
(13, 'xhbcv;khxhzcbv;khxbcv'),
(18, 'xhbcv;khxhzcbv;khxbcv'),
(19, 'xhbcv;khxhzcbv;khxbcv'),
(20, 'xhbcv;khxhzcbv;khxbcv'),
(21, 'xhbcv;khxhzcbv;khxbcv'),
(22, 'xhbcv;khxhzcbv;khxbcv'),
(23, 'xhbcv;khxhzcbv;khxbcv'),
(24, 'xhbcv;khxhzcbv;khxbcv');

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `SRn0` int(100) NOT NULL,
  `Questions` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`SRn0`, `Questions`) VALUES
(5, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(6, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(7, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(8, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(9, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(10, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(11, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(12, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(13, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(14, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(15, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(16, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(17, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(18, 'dfgdsfgedsfgdsfgdsfgdsfgdsfgdsfgdsgedsfg'),
(19, NULL),
(20, NULL),
(21, NULL),
(22, NULL),
(23, 'how did you know about us?'),
(24, 'how did you know abogdsfgdsfg?'),
(25, 'how did you know abogdsfgdbdbgfdgfg?'),
(26, 'how did you know abogdsfgdbdbgfdgfg?'),
(27, 'how did you know abogdsfgdbdbgfdgfg?'),
(28, 'how did you know abogdsfgdbdbgfdgfg?'),
(29, 'how did you know abogdsfgdbdbgfdgfg?'),
(30, 'how did you know abogdsfgdbdbgfdgfg?'),
(31, 'how did you know abogdsfgdbdbgfdgfg?'),
(32, 'how did you know abogdsfgdbdbgfdgfg?'),
(33, 'how did you know abogdsfgdbdbgfdgfg?'),
(34, 'how did you know abogdsfgdbdbgfdgfg?'),
(35, 'how did you know abogdsfgdbdbgfdgfg?');

-- --------------------------------------------------------

--
-- Table structure for table `studentinfo`
--

CREATE TABLE `studentinfo` (
  `UserName` text NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `PhoneNumber` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `teacherinfo`
--

CREATE TABLE `teacherinfo` (
  `UserName` text NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacherinfo`
--

INSERT INTO `teacherinfo` (`UserName`, `Email`, `Password`) VALUES
('sani', 'itssani@gmail.com', 'sani'),
('usama', 'itsusama@gmail.com', 'usama');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assignmentquestion`
--
ALTER TABLE `assignmentquestion`
  ADD PRIMARY KEY (`SRn0`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`SRn0`);

--
-- Indexes for table `studentinfo`
--
ALTER TABLE `studentinfo`
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `Phone Number` (`PhoneNumber`),
  ADD UNIQUE KEY `PhoneNumber` (`PhoneNumber`);

--
-- Indexes for table `teacherinfo`
--
ALTER TABLE `teacherinfo`
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `assignmentquestion`
--
ALTER TABLE `assignmentquestion`
  MODIFY `SRn0` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `SRn0` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
