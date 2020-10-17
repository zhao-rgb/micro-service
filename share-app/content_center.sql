/*
 Navicat Premium Data Transfer

 Source Server         : zxl
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 101.200.130.236:3306
 Source Schema         : content_center

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 17/10/2020 22:06:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mid_user_share
-- ----------------------------
DROP TABLE IF EXISTS `mid_user_share`;
CREATE TABLE `mid_user_share`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `share_id` int(0) NOT NULL COMMENT 'share.id',
  `user_id` int(0) NOT NULL COMMENT 'user.id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_mid_user_share_share1_idx`(`share_id`) USING BTREE,
  INDEX `fk_mid_user_share_user1_idx`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 73 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户-分享中间表【描述用户购买的分享】' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mid_user_share
-- ----------------------------
INSERT INTO `mid_user_share` VALUES (1, 1, 1);
INSERT INTO `mid_user_share` VALUES (2, 2, 2);
INSERT INTO `mid_user_share` VALUES (4, 4, 1);
INSERT INTO `mid_user_share` VALUES (5, 5, 2);
INSERT INTO `mid_user_share` VALUES (6, 6, 1);
INSERT INTO `mid_user_share` VALUES (15, 1, 9);
INSERT INTO `mid_user_share` VALUES (59, 1, 7);
INSERT INTO `mid_user_share` VALUES (68, 2, 9);
INSERT INTO `mid_user_share` VALUES (74, 2, 7);

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '内容',
  `show_flag` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否显示 0:否 1:是',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES (1, '我我我', 1, '2020-09-30 21:54:38');
INSERT INTO `notice` VALUES (2, '关注你我之书,发现更多精彩', 1, '2020-10-01 21:55:10');
INSERT INTO `notice` VALUES (3, 'bbb', 0, '2020-10-04 21:55:27');

-- ----------------------------
-- Table structure for share
-- ----------------------------
DROP TABLE IF EXISTS `share`;
CREATE TABLE `share`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(0) NOT NULL DEFAULT 0 COMMENT '发布人id',
  `title` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '标题',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '修改时间',
  `is_original` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否原创 0:否 1:是',
  `author` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '作者',
  `cover` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '封面',
  `summary` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '概要信息',
  `price` int(0) NOT NULL DEFAULT 0 COMMENT '价格（需要的积分）',
  `download_url` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '下载地址',
  `buy_count` int(0) NOT NULL DEFAULT 0 COMMENT '下载数 ',
  `show_flag` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否显示 0:否 1:是',
  `audit_status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过',
  `reason` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '审核不通过原因',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '分享表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of share
-- ----------------------------
INSERT INTO `share` VALUES (1, 1, '后端架构技术', '2020-09-29 15:29:51', '2020-09-29 15:29:55', 1, '赵肖龙', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/QQ图片20200614131831.png', '停止胡思乱想', 20, 'https://www.zhihu.com/', 20, 1, 'PASS', 'iiii');
INSERT INTO `share` VALUES (2, 2, '前端框架技术', '2020-09-23 15:31:55', '2020-09-29 15:32:02', 0, 'zxl', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/短发11.jpeg', '高效学习方法', 40, 'https://www.zhihu.com/', 100, 1, 'NOT_YET', '');
INSERT INTO `share` VALUES (3, 3, '微服务技术', '2020-10-04 23:34:24', '2020-10-04 23:34:30', 0, '撒野', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/avatar/20200420202138.png', '集中', 20, 'https://github.com/zhao-rgb/micro-service', 30, 1, '0', '');
INSERT INTO `share` VALUES (4, 1, 'Linux学习笔记', '2020-10-01 23:35:34', '2020-10-04 23:35:39', 0, '王庆媛', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/avatar/20200420202237.png', '仔细', 30, 'https://www.yuque.com/dashboard/docs', 10, 1, '0', '');
INSERT INTO `share` VALUES (5, 9, 'Web开发', '2020-10-08 13:07:50', '2020-10-08 13:07:50', 1, '撒野', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/avatar/20200420202237.png', 'Web应用开发技术', 50, 'https://www.yuque.com/dashboard/docs', 20, 0, 'NOT_YET', '无');
INSERT INTO `share` VALUES (6, 7, 'Docker开源书', '2020-10-14 15:20:29', '2020-10-15 15:20:34', 0, '啦', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/20201014090712.png', 'Docker开源书，涵盖Docker常用命令！', 60, 'https://book.douban.com/subject/26285268/', 15, 0, 'NOT_YET', '');
INSERT INTO `share` VALUES (13, 9, 'JAVA编程', '2020-10-17 12:47:55', '2020-10-17 12:47:55', 0, '撒野', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/java.png', '面向对象编程，简单易学', 20, 'http://product.dangdang.com/28487946.html', 20, 0, 'NOT_YET', '无');
INSERT INTO `share` VALUES (25, 7, '我', '2020-10-17 14:47:00', '2020-10-17 14:47:00', 0, '我', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/java.png', '我', 20, '我', 20, 0, 'NOT_YET', '无');
INSERT INTO `share` VALUES (35, 9, '我', '2020-10-17 22:01:56', '2020-10-17 22:01:56', 0, '撒野', 'https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/java.png', 'home', 30, 'https：daidu.com', 20, 0, 'NOT_YET', '无');

SET FOREIGN_KEY_CHECKS = 1;
