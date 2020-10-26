use test_db;
flush table userdata;
create table userdata(
    name varchar(255),
    company_name varchar(255),
    city varchar(255)
);
INSERT INTO test_db.userdata(name,company_name,city) VALUES('Suneel', 'Sinch', 'Malmo');
INSERT INTO test_db.userdata(name,company_name,city) VALUES('Joshika', 'Festina', 'Malmo');


-- -----------------------------------------------------
-- Table `version_0_1`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `version_0_1` (
  `version_info` VARCHAR(45) NOT NULL )
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


START TRANSACTION;
INSERT INTO `version_0_1` (`version_info`) VALUES ('This db version is 0.1');

COMMIT;