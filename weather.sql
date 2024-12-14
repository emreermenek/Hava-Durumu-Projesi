-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2024 at 06:58 PM
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
-- Database: `weather`
--

-- --------------------------------------------------------

--
-- Table structure for table `days`
--

CREATE TABLE `days` (
  `id` int(11) NOT NULL,
  `date` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `days`
--

INSERT INTO `days` (`id`, `date`) VALUES
(11, '2024-12-05'),
(12, '2024-12-06'),
(13, '2024-12-07'),
(14, '2024-12-08'),
(15, '2024-12-09'),
(16, '2024-12-10'),
(17, '2024-12-11');

-- --------------------------------------------------------

--
-- Table structure for table `day_data`
--

CREATE TABLE `day_data` (
  `id` int(11) NOT NULL,
  `date` text NOT NULL,
  `maxTemp` double NOT NULL,
  `minTemp` double NOT NULL,
  `avgTemp` double NOT NULL,
  `avgHumidity` double NOT NULL,
  `maxWindSpeed` double NOT NULL,
  `avgvis` double NOT NULL,
  `willItRain` double NOT NULL,
  `willItSnow` double NOT NULL,
  `sunrise` text NOT NULL,
  `sunset` text NOT NULL,
  `lastUpdated` text NOT NULL,
  `currTemp` double NOT NULL,
  `currState` text NOT NULL,
  `currWind` double NOT NULL,
  `currHumidity` double NOT NULL,
  `currFeeledTemp` double NOT NULL,
  `currUV` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `day_data`
--

INSERT INTO `day_data` (`id`, `date`, `maxTemp`, `minTemp`, `avgTemp`, `avgHumidity`, `maxWindSpeed`, `avgvis`, `willItRain`, `willItSnow`, `sunrise`, `sunset`, `lastUpdated`, `currTemp`, `currState`, `currWind`, `currHumidity`, `currFeeledTemp`, `currUV`) VALUES
(11, '2024-12-05', 14.8, 7.4, 10.8, 70, 9.7, 10, 0, 0, '08:14 AM', '05:51 PM', '2024-12-05 18:30', 12.1, 'Clear', 8.3, 77, 11.4, 0),
(12, '2024-12-06', 12.5, 9.5, 10.7, 75, 9.4, 8.5, 1, 0, '08:14 AM', '05:51 PM', '2024-12-05 18:30', 12.1, 'Clear', 8.3, 77, 11.4, 0),
(13, '2024-12-07', 15, 9, 11.3, 84, 16.9, 9.3, 1, 0, '08:15 AM', '05:51 PM', '2024-12-05 18:30', 12.1, 'Clear', 8.3, 77, 11.4, 0),
(14, '2024-12-08', 16, 8.9, 11.9, 77, 25.9, 10, 1, 0, '08:16 AM', '05:51 PM', '2024-12-05 18:30', 12.1, 'Clear', 8.3, 77, 11.4, 0),
(15, '2024-12-09', 16.4, 10.9, 13.1, 74, 22.3, 10, 1, 0, '08:17 AM', '05:51 PM', '2024-12-05 18:30', 12.1, 'Clear', 8.3, 77, 11.4, 0),
(16, '2024-12-10', 18, 12.2, 14, 80, 18.7, 9.9, 1, 0, '08:18 AM', '05:51 PM', '2024-12-05 18:30', 12.1, 'Clear', 8.3, 77, 11.4, 0),
(17, '2024-12-11', 17.8, 11.7, 13.8, 82, 11.5, 9.9, 1, 0, '08:18 AM', '05:51 PM', '2024-12-05 18:30', 12.1, 'Clear', 8.3, 77, 11.4, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `days`
--
ALTER TABLE `days`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `day_data`
--
ALTER TABLE `day_data`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `days`
--
ALTER TABLE `days`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `day_data`
--
ALTER TABLE `day_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
