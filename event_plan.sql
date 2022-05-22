-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220507.f68a18df64
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 08, 2022 at 06:29 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `event_plan`
--

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `e_id` int(11) NOT NULL,
  `event_name` varchar(50) NOT NULL,
  `type` varchar(100) NOT NULL,
  `type2` varchar(10) NOT NULL,
  `city` varchar(50) NOT NULL,
  `pay_plan` text NOT NULL,
  `price` double NOT NULL,
  `description` text NOT NULL,
  `cont_name` varchar(40) NOT NULL,
  `cont_phone` varchar(20) NOT NULL,
  `feature_1` varchar(40) NOT NULL,
  `feature_2` varchar(40) NOT NULL,
  `feature_3` varchar(40) NOT NULL,
  `feature_4` varchar(40) NOT NULL,
  `link` varchar(100) NOT NULL,
  `featured` varchar(50) NOT NULL DEFAULT 'Not Featured',
  `listed` varchar(50) NOT NULL DEFAULT 'Listed',
  `f_id` int(11) NOT NULL DEFAULT 1,
  `status` varchar(20) NOT NULL DEFAULT 'active'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`e_id`, `event_name`, `type`, `type2`, `city`, `pay_plan`, `price`, `description`, `cont_name`, `cont_phone`, `feature_1`, `feature_2`, `feature_3`, `feature_4`, `link`, `featured`, `listed`, `f_id`, `status`) VALUES
(1, 'Wedding Function', 'Indoor', 'General', 'Kandy', 'Estimated total budget (Wedding Function Platinum) Rs.1500000 .Advance Payment Rs .100000.(Max Person 200)', 1500000, 'For some of the best wedding function locations in Kandy, \r\ndedicated event teams and expert chefs from around the world, \r\nexpect the most memorable celebration for your special day at Peradeniya Rest house.', 'Mr.Sandaruwan', '0778020500', 'Full Band Play & lighting', 'Plate Price Starts @ Rs.7500', 'Disco light Full Deco', 'Event Photography', 'fRTamIr6ZeM', 'Featured', 'Listed', 2, 'active'),
(2, 'Batch Party Function', 'Indoor', 'General', 'Kandy', 'Estimated total budget (Batch Party General) Rs.100000 .Advance Payment Rs .100000(Max Person 200)', 1000000, 'For some of the best batch party locations in Kandy,  dedicated event teams and expert chefs from around the world,  expect the most memorable celebration for your special day at Golden Crown.', 'Miss. Lihini', '0777123456', 'Full Band Play & lighting', 'Plate Price Starts @ Rs.3000', 'Disco light', 'Event Photography', 'IxRmtoGOBEc', 'Not Featured', 'Listed', 1, 'active'),
(3, 'Birthday Party Function', 'Indoor', 'General', 'Galle', 'Estimated total budget (Birthday Party Platinum) Rs.2000000 .Advance Payment Rs .100000(Max Person 200)', 2000000, 'For some of the best birthday party locations in Galle,  dedicated event teams and expert chefs from around the world,  expect the most memorable celebration for your special day at Plam Beach.', 'Mr.Lankanatha', '0778020123', 'Full Band Play & lighting', 'Plate Price Starts @ Rs.5000', 'Disco light', 'Event Photography', 'Y5ZTCSPWdmU', 'Not Featured', 'Listed', 1, 'active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`e_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `events`
--
ALTER TABLE `events`
  MODIFY `e_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



