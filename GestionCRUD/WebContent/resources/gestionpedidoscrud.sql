-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220905.b20d7f3a04
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 08, 2022 at 12:07 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestionpedidoscrud`
--

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id` int(10) NOT NULL,
  `nombre` varchar(35) DEFAULT NULL,
  `apellido` varchar(35) DEFAULT NULL,
  `sexo` varchar(35) DEFAULT NULL,
  `telefono` varchar(35) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `apellido`, `sexo`, `telefono`, `email`) VALUES
(1, 'Yoniber', 'Encarnacion', 'Masculino', '8299884791', 'yoniber@pildorasinformaticas.es'),
(3, 'María', 'Gómez', 'Masculino', '8298451145', 'maria@pildorasinformaticas.es'),
(4, 'Antonio', 'Fernández', 'Masculino', '8095698874', 'Antonio@pildorasinformaticas.es'),
(15, 'Peter', 'Cruz', 'Masculino', '8096821307', 'peter@pildorasinformaticas.es'),
(17, 'Martha', 'Perez', 'Femenino', '8495412145', 'martha@pildorasinformaticas.es'),
(25, 'Altagracia', 'Urena', 'Femenino', '8295841234', 'altagracia@pildorasinformaticas.es'),
(26, 'Kelvin', 'Jhoss', 'Masculino', '8495847451', 'kelvin@pildorasinformaticas.es');

-- --------------------------------------------------------

--
-- Table structure for table `loggin`
--

CREATE TABLE `loggin` (
  `id` int(10) NOT NULL,
  `usuario` varchar(35) NOT NULL,
  `clave` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loggin`
--

INSERT INTO `loggin` (`id`, `usuario`, `clave`) VALUES
(3, '1', '1'),
(4, 'yoniber', 'yoniber07');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `loggin`
--
ALTER TABLE `loggin`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `loggin`
--
ALTER TABLE `loggin`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
