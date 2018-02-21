-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema xpersoft
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema xpersoft
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `xpersoft` DEFAULT CHARACTER SET utf8 ;
USE `xpersoft` ;

-- -----------------------------------------------------
-- Table `xpersoft`.`profile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`profile` (
  `id` INT(11) NOT NULL,
  `code` VARCHAR(45) NULL DEFAULT NULL COMMENT '		',
  `nom` VARCHAR(45) NULL DEFAULT NULL COMMENT '	',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `xpersoft`.`acces`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`acces` (
  `id` INT(11) NOT NULL COMMENT '		',
  `login` VARCHAR(45) NULL DEFAULT NULL COMMENT '	',
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `profile_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_acces_profile1_idx` (`profile_id` ASC),
  CONSTRAINT `fk_acces_profile1`
    FOREIGN KEY (`profile_id`)
    REFERENCES `xpersoft`.`profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `xpersoft`.`campagne`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`campagne` (
  `id` INT(11) NOT NULL,
  `code` VARCHAR(45) NULL DEFAULT NULL,
  `raison_sociale` VARCHAR(100) NULL DEFAULT NULL,
  `address` VARCHAR(500) NULL DEFAULT NULL,
  `activity` VARCHAR(45) NULL DEFAULT NULL,
  `pays` VARCHAR(45) NULL DEFAULT NULL,
  `ville` VARCHAR(45) NULL DEFAULT NULL,
  `telephone` VARCHAR(45) NULL DEFAULT NULL,
  `fax` VARCHAR(45) NULL DEFAULT NULL COMMENT '	',
  `siteweb` VARCHAR(100) NULL DEFAULT NULL COMMENT '	',
  `email` VARCHAR(150) NULL DEFAULT NULL COMMENT '	',
  `code_fiscalite` VARCHAR(45) NULL DEFAULT NULL COMMENT '	',
  `agrement` VARCHAR(45) NULL DEFAULT NULL,
  `compte_contribual` VARCHAR(100) NULL DEFAULT NULL,
  `recolte` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `xpersoft`.`utilisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`utilisateur` (
  `id` INT(11) NOT NULL,
  `nom` VARCHAR(45) NULL DEFAULT NULL,
  `prenom` VARCHAR(45) NULL DEFAULT NULL,
  `matricule` VARCHAR(45) NULL DEFAULT NULL,
  `fonction` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(200) NULL DEFAULT NULL,
  `telephone` VARCHAR(45) NULL DEFAULT NULL,
  `acces_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_utilisateur_acces1_idx` (`acces_id` ASC),
  CONSTRAINT `fk_utilisateur_acces1`
    FOREIGN KEY (`acces_id`)
    REFERENCES `xpersoft`.`acces` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `xpersoft`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`login` (
  `id` INT(11) NOT NULL COMMENT '	',
  `login_date` VARCHAR(45) NULL DEFAULT NULL,
  `utilisateur_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_login_utilisateur1_idx` (`utilisateur_id` ASC),
  CONSTRAINT `fk_login_utilisateur1`
    FOREIGN KEY (`utilisateur_id`)
    REFERENCES `xpersoft`.`utilisateur` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `xpersoft`.`menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`menu` (
  `id` INT(11) NOT NULL,
  `nom` VARCHAR(45) NULL DEFAULT NULL,
  `menu_id` INT(11) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_menu_menu1_idx` (`menu_id` ASC),
  CONSTRAINT `fk_menu_menu1`
    FOREIGN KEY (`menu_id`)
    REFERENCES `xpersoft`.`menu` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `xpersoft`.`profile_has_menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`profile_has_menu` (
  `profile_id` INT(11) NOT NULL,
  `menu_id` INT(11) NOT NULL,
  PRIMARY KEY (`profile_id`, `menu_id`),
  INDEX `fk_profile_has_menu_menu1_idx` (`menu_id` ASC),
  INDEX `fk_profile_has_menu_profile1_idx` (`profile_id` ASC),
  CONSTRAINT `fk_profile_has_menu_menu1`
    FOREIGN KEY (`menu_id`)
    REFERENCES `xpersoft`.`menu` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_profile_has_menu_profile1`
    FOREIGN KEY (`profile_id`)
    REFERENCES `xpersoft`.`profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
