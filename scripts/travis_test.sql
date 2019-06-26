# Create DB
CREATE DATABASE IF NOT EXISTS `e2x`;
GRANT ALL PRIVILEGES ON e2x.* TO 'travis'@'%';
USE `e2x`;

# Create table
CREATE TABLE `user` (
    `id` VARCHAR(64) NOT NULL UNIQUE COMMENT 'primary key',
    `user_id` VARCHAR (64) NOT NULL COMMENT 'user created id',
    `first_name` VARCHAR(64) NOT NULL COMMENT 'user first name',
    `last_name` VARCHAR(64) NOT NULL COMMENT 'user last name',
    `email` VARCHAR(64) NOT NULL COMMENT 'user email',
    `contact_number` VARCHAR(64) COMMENT 'phone number',
    `password` VARCHAR(64) COMMENT 'password',
    `activation_status` INT NOT NULL COMMENT 'account activation status',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'account creation timestamp',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'account modification timestamp',
    PRIMARY KEY (`id`)
);

# Add seed data into user table
INSERT into `user` (`id`, `user_id`, `first_name`, `last_name` ,`email`, `contact_number`, `password`, `activation_status`)
VALUES ('1561465397985191625', 'user3301','user', '3301', 'user3301@dataseek.info', '8EshyckhhJDDtYPrKDIiWkwSiq7E25/o', '0420002000','1');