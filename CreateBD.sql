-- Crear Base de datos
CREATE DATABASE `SENA` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `areas` (
  `ID_Area` int NOT NULL AUTO_INCREMENT,
  `Areas` varchar(200) NOT NULL,
  PRIMARY KEY (`ID_Area`),
  UNIQUE KEY `Areas` (`Areas`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Cracion de Tablas
CREATE TABLE `asuntos` (
  `ID_Asunto` int NOT NULL AUTO_INCREMENT,
  `Asunto` varchar(150) NOT NULL,
  PRIMARY KEY (`ID_Asunto`),
  UNIQUE KEY `Asunto` (`Asunto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `estados` (
  `ID_Estado` int NOT NULL AUTO_INCREMENT,
  `Estado` varchar(125) NOT NULL,
  PRIMARY KEY (`ID_Estado`),
  UNIQUE KEY `Estado` (`Estado`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `solicitudes` (
  `ID_Solicitud` int NOT NULL AUTO_INCREMENT,
  `ID_Usuario` int DEFAULT NULL,
  `ID_Funcionario` int DEFAULT NULL,
  `ID_TipoS` int DEFAULT NULL,
  `ID_Estado` int DEFAULT NULL,
  `Fecha_Solicitud` datetime DEFAULT NULL,
  `ID_Asunto` int DEFAULT NULL,
  `Detalle` varchar(250) NOT NULL,
  `Adjunto_Sol` blob,
  `Fecha_Respuesta` datetime DEFAULT NULL,
  `Respuesta` varchar(250) NOT NULL,
  `Adjunto_Res` blob,
  PRIMARY KEY (`ID_Solicitud`),
  KEY `ID_Usuario` (`ID_Usuario`),
  KEY `ID_Funcionario` (`ID_Funcionario`),
  KEY `ID_TipoS` (`ID_TipoS`),
  KEY `ID_Estado` (`ID_Estado`),
  KEY `ID_Asunto` (`ID_Asunto`),
  KEY `idx_solicitud` (`ID_Solicitud`),
  CONSTRAINT `solicitudes_ibfk_1` FOREIGN KEY (`ID_Usuario`) REFERENCES `usuarios` (`ID_Usuario`),
  CONSTRAINT `solicitudes_ibfk_2` FOREIGN KEY (`ID_Funcionario`) REFERENCES `usuarios` (`ID_Usuario`),
  CONSTRAINT `solicitudes_ibfk_3` FOREIGN KEY (`ID_TipoS`) REFERENCES `tipo_solicitud` (`ID_TipoS`),
  CONSTRAINT `solicitudes_ibfk_4` FOREIGN KEY (`ID_Estado`) REFERENCES `estados` (`ID_Estado`),
  CONSTRAINT `solicitudes_ibfk_5` FOREIGN KEY (`ID_Asunto`) REFERENCES `asuntos` (`ID_Asunto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tipo_solicitud` (
  `ID_TipoS` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(200) NOT NULL,
  PRIMARY KEY (`ID_TipoS`),
  UNIQUE KEY `tipo` (`tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tipo_usuarios` (
  `ID_TipoU` int NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(25) NOT NULL,
  PRIMARY KEY (`ID_TipoU`),
  UNIQUE KEY `Tipo` (`Tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `usuarios` (
  `ID_Usuario` int NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Clave` varchar(20) NOT NULL,
  `Tipo_Usuario` int DEFAULT NULL,
  `Areas` int DEFAULT NULL,
  `Estado` int DEFAULT NULL,
  PRIMARY KEY (`ID_Usuario`),
  UNIQUE KEY `Email` (`Email`),
  UNIQUE KEY `ID_Usuario_UNIQUE` (`ID_Usuario`),
  KEY `Tipo_Usuario` (`Tipo_Usuario`),
  KEY `Areas` (`Areas`),
  KEY `Estado` (`Estado`),
  KEY `idx_usuario` (`ID_Usuario`),
  KEY `idx_email` (`Email`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`Tipo_Usuario`) REFERENCES `tipo_usuarios` (`ID_TipoU`),
  CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`Areas`) REFERENCES `areas` (`ID_Area`),
  CONSTRAINT `usuarios_ibfk_3` FOREIGN KEY (`Estado`) REFERENCES `estados` (`ID_Estado`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
