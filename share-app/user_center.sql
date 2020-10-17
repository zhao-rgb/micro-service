/*
 Navicat Premium Data Transfer

 Source Server         : zxl
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 101.200.130.236:3306
 Source Schema         : user_center

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 17/10/2020 22:07:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bonus_event_log
-- ----------------------------
DROP TABLE IF EXISTS `bonus_event_log`;
CREATE TABLE `bonus_event_log`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `user_id` int(0) NULL DEFAULT NULL COMMENT 'user.id',
  `value` int(0) NULL DEFAULT NULL COMMENT '积分操作值',
  `event` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发生的事件',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_bonus_event_log_user1_idx`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 93 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '积分变更记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bonus_event_log
-- ----------------------------
INSERT INTO `bonus_event_log` VALUES (1, 7, 50, 'CONTRIBUTE', '2020-10-06 15:12:20', '投稿加积分');
INSERT INTO `bonus_event_log` VALUES (2, 9, 50, 'CONTRIBUTE', '2020-10-07 15:12:45', '投稿加积分');
INSERT INTO `bonus_event_log` VALUES (3, 7, -50, 'BUY', '2020-10-07 23:51:52', '兑换减积分');
INSERT INTO `bonus_event_log` VALUES (4, 7, 20, 'CONTRIBUTE', '2020-10-15 14:25:02', '投稿加积分');
INSERT INTO `bonus_event_log` VALUES (72, 9, -40, 'BUY', '2020-10-16 08:30:45', '兑换减积分');
INSERT INTO `bonus_event_log` VALUES (73, 9, 20, 'SIGN_IN', '2020-10-14 10:51:55', '签到加积分');
INSERT INTO `bonus_event_log` VALUES (77, 9, -30, 'BUY', '2020-10-16 14:45:29', '兑换减积分');
INSERT INTO `bonus_event_log` VALUES (79, 7, 20, 'SIGN_IN', '2020-10-16 15:10:51', '签到加积分');
INSERT INTO `bonus_event_log` VALUES (89, 9, 20, 'SIGN_IN', '2020-10-16 15:38:43', '签到加积分');
INSERT INTO `bonus_event_log` VALUES (93, 7, -40, 'BUY', '2020-10-17 14:45:32', '兑换减积分');
INSERT INTO `bonus_event_log` VALUES (94, 7, 20, 'SIGN_IN', '2020-10-17 14:48:08', '签到加积分');
INSERT INTO `bonus_event_log` VALUES (96, 9, -20, 'BUY', '2020-10-17 21:48:42', '兑换减积分');
INSERT INTO `bonus_event_log` VALUES (97, 9, -30, 'BUY', '2020-10-17 21:55:20', '兑换减积分');
INSERT INTO `bonus_event_log` VALUES (99, 9, -50, 'BUY', '2020-10-17 22:01:03', '兑换减积分');
INSERT INTO `bonus_event_log` VALUES (100, 9, 20, 'SIGN_IN', '2020-10-17 22:02:40', '签到加积分');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `mobile` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '手机号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `user_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '姓名',
  `avatar_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '头像地址',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '分享' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, '13951905171', '123', '许莫淇', 'https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/me.jpg', '2020-09-16 23:13:35', '2020-09-17 23:13:40');
INSERT INTO `t_user` VALUES (2, '13877776666', '123', '朱信磊', 'https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/5.jpg', '2020-09-17 23:14:20', '2020-09-17 23:14:22');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `wx_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '微信id',
  `wx_nickname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '微信昵称',
  `roles` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '角色',
  `avatar_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '头像地址',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '修改时间',
  `bonus` int(0) NOT NULL DEFAULT 300 COMMENT '积分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '分享' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '18851860805', '赵肖龙', '1', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/短发19.jpeg', '2020-09-22 15:58:49', '2020-09-29 15:58:52', 601);
INSERT INTO `user` VALUES (2, '18851861839', '王庆媛', '2', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/短发46.jpg', '2020-09-28 15:59:39', '2020-09-29 15:59:44', 200);
INSERT INTO `user` VALUES (7, 'oMs0p4ztZtt892Ufht1oOMBST760', '啦', 'user', 'https://thirdwx.qlogo.cn/mmopen/vi_32/79MBE2icn8gibm2D3j2cLV4Apb4rB9bATHFoLibxp11UMlHZXrct3H06hesc75F9b16r812dUnWMAngCKdgDo6Srg/132', '2020-10-14 07:31:13', '2020-10-13 19:31:13', 380);
INSERT INTO `user` VALUES (9, 'otwxA5ej7KM7etKMmJ_FmMEf60go', '撒野', 'user', 'https://thirdwx.qlogo.cn/mmopen/vi_32/eEJ6py7yXajM9hkeZSFuG8iapukmlzuYveSTW8axds7am8YjI24Fa12icBaa3QUjic5nIHpMIeKj8KGCGvp1NnuVw/132', '2020-10-14 08:55:08', '2020-10-14 08:55:08', 390);

SET FOREIGN_KEY_CHECKS = 1;
