/*
Navicat MySQL Data Transfer

Source Server         : MariaDB-aliyun
Source Server Version : 50544
Source Host           : 121.42.197.31:3306
Source Database       : newvil

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2016-07-08 14:43:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for BusinessCost
-- ----------------------------
DROP TABLE IF EXISTS `BusinessCost`;
CREATE TABLE `BusinessCost` (
  `costId` int(11) NOT NULL AUTO_INCREMENT,
  `costItem` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Charge` double DEFAULT NULL,
  `Refund` double DEFAULT NULL,
  `createTime` timestamp NOT NULL,
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `payPrecent` int(11) DEFAULT NULL,
  PRIMARY KEY (`costId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of BusinessCost
-- ----------------------------
INSERT INTO `BusinessCost` VALUES ('1', '电源数量：2', '1060', '0', '2016-06-06 13:29:58', '1', '1', null);
INSERT INTO `BusinessCost` VALUES ('2', '电源数量：2', '1060', '0', '2016-06-06 13:39:16', '2', '1', null);
INSERT INTO `BusinessCost` VALUES ('3', '电源数量：3', '1590', '0', '2016-06-06 14:23:23', '3', '1', null);

-- ----------------------------
-- Table structure for CheckInfo
-- ----------------------------
DROP TABLE IF EXISTS `CheckInfo`;
CREATE TABLE `CheckInfo` (
  `checkInfoId` int(11) NOT NULL AUTO_INCREMENT,
  `checkInfoTime` date DEFAULT NULL,
  `qualified` char(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `checkNum` int(11) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `checkInfoerId` int(11) DEFAULT NULL,
  PRIMARY KEY (`checkInfoId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of CheckInfo
-- ----------------------------
INSERT INTO `CheckInfo` VALUES ('1', '2016-06-01', '1', '1', '2016-06-06 13:34:37', '1', null, '17');
INSERT INTO `CheckInfo` VALUES ('2', '2016-06-01', '2', '1', '2016-06-06 13:47:31', '2', null, '17');
INSERT INTO `CheckInfo` VALUES ('3', '2016-06-01', '2', '1', '2016-06-06 13:47:53', '2', null, '17');
INSERT INTO `CheckInfo` VALUES ('4', '2016-06-01', '2', '1', '2016-06-06 13:57:11', '2', null, '17');
INSERT INTO `CheckInfo` VALUES ('5', '2016-06-01', '1', '11', '2016-06-06 14:37:08', '3', null, '17');
INSERT INTO `CheckInfo` VALUES ('6', '2016-06-01', '1', '11', '2016-06-06 14:37:09', '3', null, '17');

-- ----------------------------
-- Table structure for DesignFileCheck
-- ----------------------------
DROP TABLE IF EXISTS `DesignFileCheck`;
CREATE TABLE `DesignFileCheck` (
  `designFileId` int(11) NOT NULL AUTO_INCREMENT,
  `designUnit` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `designLevel` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `submittedUnit` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `submittedTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `accPerId` int(11) DEFAULT NULL,
  `checkPerId` int(11) DEFAULT NULL,
  `checkTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `civilDrawingNum` int(11) DEFAULT NULL,
  `lineDrawingNum` int(11) DEFAULT NULL,
  `eleDrawingNum` int(11) DEFAULT NULL,
  `checkOpinion` text COLLATE utf8_unicode_ci,
  `registerPerId` int(11) DEFAULT NULL,
  `registerTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`designFileId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of DesignFileCheck
-- ----------------------------
INSERT INTO `DesignFileCheck` VALUES ('1', '1', '1', '1', '2016-06-01 00:00:00', '1', '1', '2016-06-02 00:00:00', '1', '1', '1', '通过', '1', '2016-06-03 00:00:00', '2016-06-06 13:32:00', '1', '2');
INSERT INTO `DesignFileCheck` VALUES ('2', '1', '1', '1', '2016-06-06 00:00:00', '1', '1', '2016-06-02 00:00:00', '1', '1', '1', '通过', '1', '2016-06-03 00:00:00', '2016-06-06 13:41:05', '2', '2');
INSERT INTO `DesignFileCheck` VALUES ('3', '', '', '', '2016-06-06 14:31:43', '0', '0', '2016-06-06 14:31:43', '0', '0', '0', '通过', '0', '2016-06-06 14:31:43', '2016-06-06 14:31:43', '3', '2');

-- ----------------------------
-- Table structure for Employee
-- ----------------------------
DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
  `empId` int(11) NOT NULL AUTO_INCREMENT,
  `empName` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `empDep` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `empJob` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `empTel` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `empPwd` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`empId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Employee
-- ----------------------------
INSERT INTO `Employee` VALUES ('1', 'aaa', '业务员', '业务员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('2', 'bbb', '业务员', '业务员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('3', 'ccc', '勘查员', '勘查员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('4', 'ddd', '勘查员', '勘查员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('5', 'eee', '方案小组', '方案小组', '123456789', '1234');
INSERT INTO `Employee` VALUES ('6', 'fff', '方案小组', '方案小组', '123456789', '1234');
INSERT INTO `Employee` VALUES ('7', 'ggg', '审批员', '审批员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('8', 'hhh', '审批员', '审批员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('9', 'iii', '财务', '财务', '123456789', '1234');
INSERT INTO `Employee` VALUES ('10', 'jjj', '财务', '财务', '123456789', '1234');
INSERT INTO `Employee` VALUES ('11', 'kkk', '记录员', '记录员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('12', 'lll', '记录员', '记录员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('13', 'mmm', '检查员', '检查员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('14', 'nnn', '检查员', '检查员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('15', 'ooo', '报验员', '报验员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('16', 'ppp', '报验员', '报验员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('17', 'qqq', '验收小组', '验收小组', '123456789', '1234');
INSERT INTO `Employee` VALUES ('18', 'rrr', '验收小组', '验收小组', '123456789', '1234');
INSERT INTO `Employee` VALUES ('19', 'sss', '归档员', '归档员', '123456789', '1234');
INSERT INTO `Employee` VALUES ('20', 'ttt', '归档员', '归档员', '123456789', '1234');

-- ----------------------------
-- Table structure for Examination
-- ----------------------------
DROP TABLE IF EXISTS `Examination`;
CREATE TABLE `Examination` (
  `exId` int(11) NOT NULL AUTO_INCREMENT,
  `exPerId` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `exTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `exResult` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `exOpinion` text COLLATE utf8_unicode_ci,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`exId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Examination
-- ----------------------------
INSERT INTO `Examination` VALUES ('1', '7', '2016-06-06 13:28:46', '不通过', '1234', '2016-06-06 13:28:46', '1', null);
INSERT INTO `Examination` VALUES ('2', '7', '2016-06-06 13:29:34', '通过', 'tt', '2016-06-06 13:29:34', '1', null);
INSERT INTO `Examination` VALUES ('3', '7', '2016-06-06 13:38:56', '通过', '123', '2016-06-06 13:38:56', '2', null);
INSERT INTO `Examination` VALUES ('4', '7', '2016-06-06 14:20:07', '不通过', '123', '2016-06-06 14:20:07', '3', null);
INSERT INTO `Examination` VALUES ('5', '7', '2016-06-06 14:22:29', '通过', 'SDAS', '2016-06-06 14:22:29', '3', null);

-- ----------------------------
-- Table structure for Inspect
-- ----------------------------
DROP TABLE IF EXISTS `Inspect`;
CREATE TABLE `Inspect` (
  `checkId` int(11) NOT NULL AUTO_INCREMENT,
  `checkPerId` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `checkTime` date DEFAULT NULL,
  `checkContent` text COLLATE utf8_unicode_ci,
  `checkNum` int(11) DEFAULT NULL,
  `chenckResult` text COLLATE utf8_unicode_ci,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`checkId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Inspect
-- ----------------------------
INSERT INTO `Inspect` VALUES ('1', '13', '2016-06-01', '111', '1', '合格', '2016-06-06 13:33:47', '1', '1');
INSERT INTO `Inspect` VALUES ('2', '13', '2016-06-01', '111', '1', '合格', '2016-06-06 13:46:20', '2', '1');
INSERT INTO `Inspect` VALUES ('3', '13', '2016-06-01', '1', '1', '合格', '2016-06-06 13:54:20', '2', '1');
INSERT INTO `Inspect` VALUES ('4', '13', '2016-06-01', '1212', '1', '合格', '2016-06-06 14:35:05', '3', '1');

-- ----------------------------
-- Table structure for Inspection
-- ----------------------------
DROP TABLE IF EXISTS `Inspection`;
CREATE TABLE `Inspection` (
  `insId` int(11) NOT NULL AUTO_INCREMENT,
  `insUnit` char(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `insPerId` int(11) DEFAULT NULL,
  `accPerId` int(11) DEFAULT NULL,
  `accTime` date DEFAULT NULL,
  `insRequire` text COLLATE utf8_unicode_ci,
  `insTime` date DEFAULT NULL,
  `insNum` int(11) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`insId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Inspection
-- ----------------------------
INSERT INTO `Inspection` VALUES ('1', '1', '15', '1', '2016-06-01', '11', '2016-06-01', '1', '2016-06-06 13:34:16', '1', '1');
INSERT INTO `Inspection` VALUES ('2', '1', '15', '1', '2016-06-01', '12', '2016-06-02', '1', '2016-06-06 13:46:55', '2', '2');
INSERT INTO `Inspection` VALUES ('3', '1', '15', '1', '2016-06-01', '1', '2016-06-01', '1', '2016-06-06 13:55:31', '2', '0');
INSERT INTO `Inspection` VALUES ('4', '1', '15', '1', '2016-06-08', '1', '2016-06-03', '1', '2016-06-06 13:56:13', '2', '2');
INSERT INTO `Inspection` VALUES ('5', '1', '15', '1', '2016-06-10', '11', '2016-06-03', '1', '2016-06-06 14:35:52', '3', '1');

-- ----------------------------
-- Table structure for InvestigationSite
-- ----------------------------
DROP TABLE IF EXISTS `InvestigationSite`;
CREATE TABLE `InvestigationSite` (
  `invesSiteId` int(11) NOT NULL AUTO_INCREMENT,
  `appCapacity` int(11) DEFAULT NULL,
  `supplyMode` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `voltageLevel` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `powerComp` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `invesSituation` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `powerId` int(11) DEFAULT NULL,
  `invesPerId` int(11) DEFAULT NULL,
  `RunTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`invesSiteId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of InvestigationSite
-- ----------------------------
INSERT INTO `InvestigationSite` VALUES ('1', '1', '1', '1', '1', '11111', '2', '3', '2016-06-06 13:27:49', '2016-06-06 13:27:49', '1', '0');
INSERT INTO `InvestigationSite` VALUES ('2', '2', '2', '2', '2', '2\r\n                                               ', '3', '4', '2016-06-06 13:37:53', '2016-06-06 13:37:53', '2', '0');
INSERT INTO `InvestigationSite` VALUES ('3', '3', '3', '3', '3', '3\r\n                                               ', '5', '3', '2016-06-06 14:18:34', '2016-06-06 14:18:34', '3', '0');

-- ----------------------------
-- Table structure for InvestigationWork
-- ----------------------------
DROP TABLE IF EXISTS `InvestigationWork`;
CREATE TABLE `InvestigationWork` (
  `invesId` int(11) NOT NULL AUTO_INCREMENT,
  `newId` int(11) DEFAULT NULL,
  `invesPerId` int(11) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `InvesTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`invesId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of InvestigationWork
-- ----------------------------
INSERT INTO `InvestigationWork` VALUES ('1', '1', '3', '2016-06-06 13:27:04', '2016-06-07 13:27:04', '2');
INSERT INTO `InvestigationWork` VALUES ('2', '2', '4', '2016-06-06 13:37:27', '2016-06-07 13:37:27', '2');
INSERT INTO `InvestigationWork` VALUES ('3', '3', '3', '2016-06-06 14:16:56', '2016-06-07 14:16:56', '2');

-- ----------------------------
-- Table structure for JobInfo
-- ----------------------------
DROP TABLE IF EXISTS `JobInfo`;
CREATE TABLE `JobInfo` (
  `empId` int(11) NOT NULL AUTO_INCREMENT,
  `jobNum` int(11) DEFAULT NULL,
  `jobInfo` int(11) DEFAULT NULL,
  `empDep` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`empId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of JobInfo
-- ----------------------------
INSERT INTO `JobInfo` VALUES ('1', '3', null, '业务员');
INSERT INTO `JobInfo` VALUES ('2', '0', null, '业务员');
INSERT INTO `JobInfo` VALUES ('3', '2', null, '勘查员');
INSERT INTO `JobInfo` VALUES ('4', '1', null, '勘查员');
INSERT INTO `JobInfo` VALUES ('5', '2', null, '方案小组');
INSERT INTO `JobInfo` VALUES ('6', '1', null, '方案小组');
INSERT INTO `JobInfo` VALUES ('7', '0', null, '审批员');
INSERT INTO `JobInfo` VALUES ('8', '0', null, '审批员');
INSERT INTO `JobInfo` VALUES ('9', '0', null, '财务');
INSERT INTO `JobInfo` VALUES ('10', '0', null, '财务');
INSERT INTO `JobInfo` VALUES ('11', '0', null, '记录员');
INSERT INTO `JobInfo` VALUES ('12', '0', null, '记录员');
INSERT INTO `JobInfo` VALUES ('13', '0', null, '检查员');
INSERT INTO `JobInfo` VALUES ('14', '0', null, '检查员');
INSERT INTO `JobInfo` VALUES ('15', '0', null, '报验员');
INSERT INTO `JobInfo` VALUES ('16', '0', null, '报验员');
INSERT INTO `JobInfo` VALUES ('17', '0', null, '验收小组');
INSERT INTO `JobInfo` VALUES ('18', '0', null, '验收小组');
INSERT INTO `JobInfo` VALUES ('19', '0', null, '归档员');
INSERT INTO `JobInfo` VALUES ('20', '0', null, '归档员');

-- ----------------------------
-- Table structure for Lot
-- ----------------------------
DROP TABLE IF EXISTS `Lot`;
CREATE TABLE `Lot` (
  `lotId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` char(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `type` char(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `capacity` int(11) DEFAULT NULL,
  `userType` char(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creatrTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`lotId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Lot
-- ----------------------------

-- ----------------------------
-- Table structure for Message
-- ----------------------------
DROP TABLE IF EXISTS `Message`;
CREATE TABLE `Message` (
  `messId` int(11) NOT NULL AUTO_INCREMENT,
  `empId` int(11) DEFAULT NULL,
  `newId` int(11) DEFAULT NULL,
  `Refund` text COLLATE utf8_unicode_ci,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`messId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Message
-- ----------------------------
INSERT INTO `Message` VALUES ('1', '5', '1', '1234', '1');
INSERT INTO `Message` VALUES ('2', '5', '3', '123', '1');

-- ----------------------------
-- Table structure for NewVillage
-- ----------------------------
DROP TABLE IF EXISTS `NewVillage`;
CREATE TABLE `NewVillage` (
  `newId` int(11) NOT NULL AUTO_INCREMENT,
  `vilName` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `adminArea` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `eleAddress` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `eleType` int(11) DEFAULT NULL,
  `eleCapacity` int(11) DEFAULT NULL,
  `residentNum` int(11) DEFAULT NULL,
  `userName` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userPtype` int(11) DEFAULT NULL,
  `userPid` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `userTel` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newVilPerId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`newId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of NewVillage
-- ----------------------------
INSERT INTO `NewVillage` VALUES ('1', '1', '1', '1', '0', '0', '1', '1', '0', '1', '1', '2016-06-06 13:27:01', '1', '2');
INSERT INTO `NewVillage` VALUES ('2', '2', '2', '2', '0', '0', '2', '2', '0', '2', '2', '2016-06-06 13:37:24', '1', '2');
INSERT INTO `NewVillage` VALUES ('3', '3', '3', '3', '0', '0', '3', '3', '0', '3', '3', '2016-06-06 14:16:53', '1', '2');

-- ----------------------------
-- Table structure for PayRecord
-- ----------------------------
DROP TABLE IF EXISTS `PayRecord`;
CREATE TABLE `PayRecord` (
  `payId` int(11) NOT NULL AUTO_INCREMENT,
  `newId` int(11) DEFAULT NULL,
  `payPerId` int(11) DEFAULT NULL,
  `payDep` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `payTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `payment` double DEFAULT NULL,
  `sumPay` double DEFAULT NULL,
  `unpaidAmount` double DEFAULT NULL,
  `invioiceId` int(11) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `payPrecent` int(11) DEFAULT NULL,
  PRIMARY KEY (`payId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of PayRecord
-- ----------------------------
INSERT INTO `PayRecord` VALUES ('1', '1', '9', null, '2016-06-06 13:30:23', '212', null, '848', null, '2016-06-06 13:30:23', '2', '20');
INSERT INTO `PayRecord` VALUES ('2', '2', '9', null, '2016-06-06 13:39:49', '212', null, '848', null, '2016-06-06 13:39:49', '2', '20');
INSERT INTO `PayRecord` VALUES ('3', '3', '9', null, '2016-06-06 14:24:44', '318', null, '1272', null, '2016-06-06 14:24:44', '2', '20');
INSERT INTO `PayRecord` VALUES ('4', '3', '9', null, '2016-06-06 14:24:51', '636', null, '636', null, '2016-06-06 14:24:51', '1', '40');
INSERT INTO `PayRecord` VALUES ('5', '3', '9', null, '2016-06-06 14:24:58', '636', null, '0', null, '2016-06-06 14:24:58', '1', '40');

-- ----------------------------
-- Table structure for PowerDesign
-- ----------------------------
DROP TABLE IF EXISTS `PowerDesign`;
CREATE TABLE `PowerDesign` (
  `powerId` int(11) NOT NULL AUTO_INCREMENT,
  `powerQuality` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `powerType` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `powerSupplyMode` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `powerVoltage` int(11) DEFAULT NULL,
  `powerCapacity` int(11) DEFAULT NULL,
  `powerAddress` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `powerNum` int(11) DEFAULT NULL,
  `powerLineNum` int(11) DEFAULT NULL,
  `powerStation` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `powerLine` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `powerInMode` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `powerPoleId` int(11) DEFAULT NULL,
  `checkPoint` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `protectMode` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `powerDesignDraw` int(11) DEFAULT NULL,
  `checkPointDraw` int(11) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `powerDesignPerId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `newId` int(11) DEFAULT NULL,
  PRIMARY KEY (`powerId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of PowerDesign
-- ----------------------------
INSERT INTO `PowerDesign` VALUES ('1', '1', '1', '1', '1', '1', null, '1', '1', '1', null, null, null, null, null, null, null, '2016-06-06 13:27:51', '5', '-1', '1');
INSERT INTO `PowerDesign` VALUES ('2', '2', '2', '2', '2', '2', null, '2', '2', '2', null, null, null, null, null, null, null, '2016-06-06 13:29:01', '5', '3', '1');
INSERT INTO `PowerDesign` VALUES ('3', '2', '2', '2', '2', '2', null, '2', '2', '2', null, null, null, null, null, null, null, '2016-06-06 13:37:56', '6', '3', '2');
INSERT INTO `PowerDesign` VALUES ('4', '3', '3', '3', '3', '3', null, '3', '3', '3', null, null, null, null, null, null, null, '2016-06-06 14:18:36', '5', '-1', '3');
INSERT INTO `PowerDesign` VALUES ('5', '3', '3', '3', '3', '3', null, '3', '3', '3', null, null, null, null, null, null, null, '2016-06-06 14:20:23', '5', '3', '3');

-- ----------------------------
-- Table structure for PowerDesign_Reply
-- ----------------------------
DROP TABLE IF EXISTS `PowerDesign_Reply`;
CREATE TABLE `PowerDesign_Reply` (
  `replyId` int(11) NOT NULL AUTO_INCREMENT,
  `replyPerId` int(11) DEFAULT NULL,
  `replyTime` timestamp NOT NULL,
  `custOpinion` text COLLATE utf8_unicode_ci,
  `userId` int(11) DEFAULT NULL,
  `signoffTime` timestamp NOT NULL,
  `custReplyTime` timestamp NOT NULL,
  `replyType` int(11) DEFAULT NULL,
  `createTime` timestamp NOT NULL,
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`replyId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of PowerDesign_Reply
-- ----------------------------
INSERT INTO `PowerDesign_Reply` VALUES ('1', '1', '2016-06-06 13:29:57', '11111', '1', '2016-06-06 13:29:57', '2016-06-06 13:29:57', '0', '2016-06-06 13:29:57', '1', '2');
INSERT INTO `PowerDesign_Reply` VALUES ('2', '1', '2016-06-06 13:39:15', '2', '2', '2016-06-06 13:39:15', '2016-06-06 13:39:15', '0', '2016-06-06 13:39:15', '2', '2');
INSERT INTO `PowerDesign_Reply` VALUES ('3', '1', '2016-06-06 14:23:22', '232', '23', '2016-06-06 14:23:22', '2016-06-06 14:23:22', '0', '2016-06-06 14:23:22', '3', '1');

-- ----------------------------
-- Table structure for ProcessRecord
-- ----------------------------
DROP TABLE IF EXISTS `ProcessRecord`;
CREATE TABLE `ProcessRecord` (
  `processRecordId` int(11) NOT NULL AUTO_INCREMENT,
  `newId` int(11) DEFAULT NULL,
  `invesId` int(11) DEFAULT NULL,
  `invesSiteId` int(11) DEFAULT NULL,
  `powerId` int(11) DEFAULT NULL,
  `exId` int(11) DEFAULT NULL,
  `replyId` int(11) DEFAULT NULL,
  `costId` int(11) DEFAULT NULL,
  `payId` int(11) DEFAULT NULL,
  `traceId` int(11) DEFAULT NULL,
  `designFileId` int(11) DEFAULT NULL,
  `checkId` int(11) DEFAULT NULL,
  `insId` int(11) DEFAULT NULL,
  `lotId` int(11) DEFAULT NULL,
  `checkInfoId` int(11) DEFAULT NULL,
  `refileId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`processRecordId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of ProcessRecord
-- ----------------------------
INSERT INTO `ProcessRecord` VALUES ('1', '1', '1', '1', '2', '1', '1', '1', '1', '1', '1', '1', '1', null, '1', null, '制定电源方案');
INSERT INTO `ProcessRecord` VALUES ('2', '2', '2', '2', '3', '3', '2', '2', '2', '2', '2', '2', '2', null, '2', null, '制定电源方案');
INSERT INTO `ProcessRecord` VALUES ('3', '3', '3', '3', '5', '4', '3', '3', '3', '3', '3', '4', null, null, null, null, '制定电源方案');

-- ----------------------------
-- Table structure for Refile
-- ----------------------------
DROP TABLE IF EXISTS `Refile`;
CREATE TABLE `Refile` (
  `refileId` int(11) NOT NULL AUTO_INCREMENT,
  `fileId` int(11) DEFAULT NULL,
  `filePlace` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `refileTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`refileId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Refile
-- ----------------------------

-- ----------------------------
-- Table structure for TraceTable
-- ----------------------------
DROP TABLE IF EXISTS `TraceTable`;
CREATE TABLE `TraceTable` (
  `traceId` int(11) NOT NULL AUTO_INCREMENT,
  `responsiblePerId` int(11) DEFAULT NULL,
  `responsibleUnit` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `supervisorUnit` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `proDesignResult` text COLLATE utf8_unicode_ci,
  `proFileResult` text COLLATE utf8_unicode_ci,
  `budgetResult` text COLLATE utf8_unicode_ci,
  `chargeResult` text COLLATE utf8_unicode_ci,
  `equipmentSupResult` text COLLATE utf8_unicode_ci,
  `ConstructionResult` text COLLATE utf8_unicode_ci,
  `midCheckResult` text COLLATE utf8_unicode_ci,
  `FinalInsResult` text COLLATE utf8_unicode_ci,
  `proAccountsResult` text COLLATE utf8_unicode_ci,
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `newId` int(11) DEFAULT NULL,
  `status` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`traceId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of TraceTable
-- ----------------------------
INSERT INTO `TraceTable` VALUES ('1', '1', '1', '1', '1', '1', '1', '1 ', '1 ', '1', '1', '1', '1', '2016-06-06 13:30:55', '1', '2');
INSERT INTO `TraceTable` VALUES ('2', '1', '1', '1', '1', '1', '1', '1 ', '1 ', '1', '1', '1', '1', '2016-06-06 13:40:14', '2', '2');
INSERT INTO `TraceTable` VALUES ('3', null, null, null, null, null, null, null, null, null, null, null, null, '2016-06-06 14:26:29', '3', '1');

-- ----------------------------
-- Table structure for User
-- ----------------------------
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userPtype` int(11) DEFAULT NULL,
  `userPid` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `userTel` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `userTicket` double DEFAULT NULL,
  `userType` int(11) DEFAULT NULL,
  `userLevel` int(11) DEFAULT NULL,
  `userPwd` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of User
-- ----------------------------
INSERT INTO `User` VALUES ('1', '1', '0', '1', '1', '212', '0', '0', '1234');
INSERT INTO `User` VALUES ('2', '2', '0', '2', '2', '212', '0', '0', '1234');
INSERT INTO `User` VALUES ('3', '3', '0', '3', '3', '1590', '0', '0', '1234');
