# Create DB
CREATE DATABASE IF NOT EXISTS `company` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `company`;

# Create table
CREATE TABLE `employee_info` (
    `employee_id` INT NOT NULL AUTO_INCREMENT,
    `employee_name` VARCHAR (64) NOT NULL COMMENT '员工名称',
    `gender` INT NOT NULL COMMENT '员工性别',
    `role` VARCHAR(64) NOT NULL COMMENT '员工职位',
    `location` VARCHAR(64) COMMENT '地理位置',
    `create_time` TIMESTAMP NOT NULL DEFAULT COMMENT '创建时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY_KEY(`employee_id`)
);