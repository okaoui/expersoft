-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `xpersoft` DEFAULT CHARACTER SET utf8 ;
USE `xpersoft` ;

-- -----------------------------------------------------
-- Table `mydb`.`campagne`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`campagne` (
  `id` INT NOT NULL,
  `code` VARCHAR(45) NULL,
  `raison_sociale` VARCHAR(100) NULL,
  `address` VARCHAR(500) NULL,
  `activity` VARCHAR(45) NULL,
  `pays` VARCHAR(45) NULL,
  `ville` VARCHAR(45) NULL,
  `telephone` VARCHAR(45) NULL,
  `fax` VARCHAR(45) NULL COMMENT '	',
  `siteweb` VARCHAR(100) NULL COMMENT '	',
  `email` VARCHAR(150) NULL COMMENT '	',
  `code_fiscalite` VARCHAR(45) NULL COMMENT '	',
  `agrement` VARCHAR(45) NULL,
  `compte_contribual` VARCHAR(100) NULL,
  `recolte` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`profile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`profile` (
  `id` INT NOT NULL,
  `code` VARCHAR(45) NULL COMMENT '		',
  `nom` VARCHAR(45) NULL COMMENT '	',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`menu` (
  `id` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`submenu1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`submenu1` (
  `id` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  `menu_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_submenu1_menu_idx` (`menu_id` ASC),
  CONSTRAINT `fk_submenu1_menu`
    FOREIGN KEY (`menu_id`)
    REFERENCES `xpersoft`.`menu` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`submenu2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`submenu2` (
  `id` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  `submenu1_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_submenu2_submenu11_idx` (`submenu1_id` ASC),
  CONSTRAINT `fk_submenu2_submenu11`
    FOREIGN KEY (`submenu1_id`)
    REFERENCES `xpersoft`.`submenu1` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`acces`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`acces` (
  `id` INT NOT NULL COMMENT '		',
  `login` VARCHAR(45) NULL COMMENT '	',
  `password` VARCHAR(45) NULL,
  `profile_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_acces_profile1_idx` (`profile_id` ASC),
  CONSTRAINT `fk_acces_profile1`
    FOREIGN KEY (`profile_id`)
    REFERENCES `xpersoft`.`profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`utilisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`utilisateur` (
  `id` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  `prenom` VARCHAR(45) NULL,
  `matricule` VARCHAR(45) NULL,
  `fonction` VARCHAR(45) NULL,
  `email` VARCHAR(200) NULL,
  `telephone` VARCHAR(45) NULL,
  `acces_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_utilisateur_acces1_idx` (`acces_id` ASC),
  CONSTRAINT `fk_utilisateur_acces1`
    FOREIGN KEY (`acces_id`)
    REFERENCES `xpersoft`.`acces` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`profile_has_menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`profile_has_menu` (
  `profile_id` INT NOT NULL,
  `menu_id` INT NOT NULL,
  PRIMARY KEY (`profile_id`, `menu_id`),
  INDEX `fk_profile_has_menu_menu1_idx` (`menu_id` ASC),
  INDEX `fk_profile_has_menu_profile1_idx` (`profile_id` ASC),
  CONSTRAINT `fk_profile_has_menu_profile1`
    FOREIGN KEY (`profile_id`)
    REFERENCES `xpersoft`.`profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_profile_has_menu_menu1`
    FOREIGN KEY (`menu_id`)
    REFERENCES `xpersoft`.`menu` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xpersoft`.`login` (
  `id` INT NOT NULL COMMENT '	',
  `login_date` VARCHAR(45) NULL,
  `utilisateur_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_login_utilisateur1_idx` (`utilisateur_id` ASC),
  CONSTRAINT `fk_login_utilisateur1`
    FOREIGN KEY (`utilisateur_id`)
    REFERENCES `xpersoft`.`utilisateur` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
