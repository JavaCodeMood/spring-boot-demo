CREATE TABLE `User` (
  `userId` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(300) NOT NULL DEFAULT '' COMMENT '用户名',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `User` (`userId`, `name`)
VALUES
	(1, 'codeyung');
