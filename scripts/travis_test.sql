# Create DB
CREATE DATABASE IF NOT EXISTS `e2x`;
GRANT ALL PRIVILEGES ON e2x.* TO 'travis'@'%';
USE `e2x`;

# Create table
CREATE TABLE `user` (
    `id` VARCHAR(64) NOT NULL UNIQUE COMMENT 'primary key',
    `user_id` VARCHAR (64) NOT NULL COMMENT 'user created id',
    `user_name` VARCHAR(64) NOT NULL COMMENT 'user full name',
    `email` VARCHAR(64) NOT NULL COMMENT 'user email',
    `contact_number` VARCHAR(64) COMMENT 'phone number',
    `password` VARCHAR(64) COMMENT 'password',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'account creation timestamp',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'account modification timestamp',
    PRIMARY KEY (`id`)
);

# Add seed data into user table
INSERT into `user` (`id`, `user_id`, `user_name`, `email`, `contact_number`, `password`)
VALUES ('1561465397985191625', 'user3301','user 3301', 'user3301@dataseek.info', '8EshyckhhJDDtYPrKDIiWkwSiq7E25/o', '0420002000');