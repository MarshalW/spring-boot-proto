-- test.USERS definition
DROP TABLE IF EXISTS `USERS`;

CREATE TABLE
    `USERS` (
        `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
        `id` bigint NOT NULL AUTO_INCREMENT,
        PRIMARY KEY (`id`),
        UNIQUE KEY `USERS_UNIQUE` (`name`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 2 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;