-- auto Generated on 2021-05-29
-- DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	role_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'roleName',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'role';
