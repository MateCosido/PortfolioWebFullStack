-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 26-06-2022 a las 02:05:12
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bddargprog`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acerca_de`
--

DROP TABLE IF EXISTS `acerca_de`;
CREATE TABLE IF NOT EXISTS `acerca_de` (
  `id` bigint NOT NULL,
  `texto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `acerca_de`
--

INSERT INTO `acerca_de` (`id`, `texto`) VALUES
(1, 'Desarrolador Web Full Stack Jr.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

DROP TABLE IF EXISTS `educacion`;
CREATE TABLE IF NOT EXISTS `educacion` (
  `id_edu` bigint NOT NULL,
  `desc_edu` varchar(255) DEFAULT NULL,
  `fecha_edu` int NOT NULL,
  `img_edu` varchar(255) DEFAULT NULL,
  `titulo_edu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_edu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `educacion`
--

INSERT INTO `educacion` (`id_edu`, `desc_edu`, `fecha_edu`, `img_edu`, `titulo_edu`) VALUES
(1, 'Profesorado Universitario', 2018, 'unlinkdeimagen', 'Universidad Autonoma de Entre Ríos'),
(2, 'Desarrollador Web Full Stack jr', 2022, 'imagenArgProg', 'Argentina Programa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
CREATE TABLE IF NOT EXISTS `experiencia` (
  `id_exp` bigint NOT NULL,
  `desc_exp` varchar(255) DEFAULT NULL,
  `fecha_exp` int NOT NULL,
  `img_exp` varchar(255) DEFAULT NULL,
  `titulo_exp` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_exp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `experiencia`
--

INSERT INTO `experiencia` (`id_exp`, `desc_exp`, `fecha_exp`, `img_exp`, `titulo_exp`) VALUES
(1, 'AADI-CAPIF ACR', 2022, 'logoaadicapif', 'Cobrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `id` bigint NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `foto_perfil` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `apellido`, `descripcion`, `foto_perfil`, `nombre`, `titulo`) VALUES
(1, 'Larrosa', 'Paraná', 'mifoto', 'Sebastian Ramon', 'Desarrollador Web full stack Jr.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
CREATE TABLE IF NOT EXISTS `proyectos` (
  `id` bigint NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `proyectos`
--

INSERT INTO `proyectos` (`id`, `descripcion`, `link`, `nombre`) VALUES
(1, 'Porfolio Argentina Programa', 'linkamiporfolio', 'Porfolio Argentina Programa 2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `skills`
--

DROP TABLE IF EXISTS `skills`;
CREATE TABLE IF NOT EXISTS `skills` (
  `id_skill` bigint NOT NULL,
  `foto_skill` varchar(255) DEFAULT NULL,
  `nombre_skill` varchar(255) DEFAULT NULL,
  `porcentaje` int NOT NULL,
  PRIMARY KEY (`id_skill`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `skills`
--

INSERT INTO `skills` (`id_skill`, `foto_skill`, `nombre_skill`, `porcentaje`) VALUES
(1, NULL, 'Trabajo en equipo', 98),
(2, NULL, 'Ingles', 85);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_user` bigint NOT NULL,
  `nombre_user` varchar(255) DEFAULT NULL,
  `pass_user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;