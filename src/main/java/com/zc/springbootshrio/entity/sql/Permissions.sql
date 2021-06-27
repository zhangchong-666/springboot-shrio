-- auto Generated on 2021-05-29
-- DROP TABLE IF EXISTS permissions;
CREATE TABLE permissions(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	permissions_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'permissionsName',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'permissions';
