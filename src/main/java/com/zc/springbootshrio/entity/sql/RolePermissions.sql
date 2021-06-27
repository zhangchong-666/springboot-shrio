-- auto Generated on 2021-05-29
-- DROP TABLE IF EXISTS role_permissions;
CREATE TABLE role_permissions(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	rid INT (11) NOT NULL DEFAULT -1 COMMENT 'rid',
	pid INT (11) NOT NULL DEFAULT -1 COMMENT 'pid',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'role_permissions';
