# Create DB
CREATE DATABASE IF NOT EXISTS `company`;
USE `company`;

# Create table
CREATE TABLE `employee_info` (
    `employee_id` INT NOT NULL AUTO_INCREMENT,
    `employee_name` VARCHAR (64) NOT NULL COMMENT '员工名称',
    `gender` INT NOT NULL COMMENT '员工性别',
    `role` VARCHAR(64) NOT NULL COMMENT '员工职位',
    `location` VARCHAR(64) COMMENT '地理位置',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP  ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY_KEY (`employee_id`)
);