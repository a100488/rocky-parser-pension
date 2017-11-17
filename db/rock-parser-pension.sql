/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : rock-parser-pension

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-11-17 11:24:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_company
-- ----------------------------
DROP TABLE IF EXISTS `t_company`;
CREATE TABLE `t_company` (
  `UUID` char(22) NOT NULL,
  `REAL_NAME` varchar(100) DEFAULT NULL COMMENT '营业执照全称',
  `NICK_NAME` varchar(100) NOT NULL COMMENT '显示名称',
  `TRIAL_END` date DEFAULT NULL COMMENT '试用期截止',
  `AREA` varchar(20) DEFAULT NULL COMMENT '所在地区',
  `ADDRESS` varchar(200) DEFAULT NULL COMMENT '地址',
  `TEL` varchar(30) DEFAULT NULL COMMENT '电话',
  `FAX` varchar(30) DEFAULT NULL COMMENT '传真',
  `ZIP_CODE` varchar(6) DEFAULT NULL COMMENT '邮编',
  `LOGO_FILE` char(22) DEFAULT NULL COMMENT '公司LOGO',
  `BUSI_LICE_FILE` char(22) DEFAULT NULL COMMENT '营业执照保存的文件id',
  `CONTACTOR` varchar(30) DEFAULT NULL COMMENT '联系人',
  `CONT_MOBLIE` varchar(20) DEFAULT NULL COMMENT '联系人手机',
  `CONT_EMAIL` varchar(50) DEFAULT NULL COMMENT '联系人邮箱',
  `CONT_AREA` varchar(20) DEFAULT NULL COMMENT '联系人所在地区',
  `CONT_ADDRESS` varchar(200) DEFAULT NULL COMMENT '联系人详细地址',
  `CONT_ZIP_CODE` varchar(6) DEFAULT NULL COMMENT '联系人邮编',
  `COMP_TYPE` char(2) DEFAULT NULL COMMENT '公司类型',
  `INIT_FLAG` char(1) DEFAULT NULL COMMENT '初始化标志',
  `INIT_TIME` datetime DEFAULT NULL COMMENT '初始化时间',
  `REG_CHANNEL` char(2) DEFAULT NULL COMMENT '注册渠道',
  `SOURCE` char(2) DEFAULT NULL COMMENT '注册来源',
  `REVIEW_FLG` char(1) DEFAULT NULL COMMENT '审核标志',
  `INDUSTRY` char(2) DEFAULT NULL COMMENT '行业',
  `SCALE` char(2) DEFAULT NULL COMMENT '企业规模',
  `INSERT_USER` char(22) DEFAULT NULL,
  `INSERT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPDATE_USER` char(22) DEFAULT NULL,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `DELETE_FLAG` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_company
-- ----------------------------
INSERT INTO `t_company` VALUES ('07A98B424A9A11E7BB4A00', null, '郑凡测试有限公司', '2017-06-20', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', null, null, '8BXkUqDcK1A35f6g9pJeMy', '2017-06-06 17:25:07', null, '2017-06-06 17:25:07', '0');
INSERT INTO `t_company` VALUES ('3kjy7udcRNqzYYFdV9z4nY', null, '上海云才网络技术有限公司', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'QQutyfffpMbv5KbfgPzHHM', '2017-04-25 14:22:42', null, '2017-04-25 14:22:42', '0');
INSERT INTO `t_company` VALUES ('4wkEbMAAW3jXHNGdo6Dznn', null, 'asdasdasd', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'GKkfJ2EA8U4gLRZMDfuCgU', '2017-04-25 14:15:28', null, '2017-04-25 14:15:28', '0');
INSERT INTO `t_company` VALUES ('5D9C5CFB559C11E7BB4A00', null, 'admin测试有限公司1', '2017-07-04', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', null, null, '5D9A17B6559C11E7BB4A00', '2017-06-20 17:39:33', null, '2017-06-20 17:39:33', '0');
INSERT INTO `t_company` VALUES ('6241F5B7559C11E7BB4A00', null, 'admin测试有限公司2', '2017-07-04', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', null, null, '5D9A17B6559C11E7BB4A00', '2017-06-20 17:39:40', null, '2017-06-20 17:39:40', '0');
INSERT INTO `t_company` VALUES ('6B5641DF558A11E7BB4A00', null, 'admin测试有限公司1', '2017-07-04', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', null, null, '6B52B421558A11E7BB4A00', '2017-06-20 15:31:05', null, '2017-06-20 15:31:05', '0');
INSERT INTO `t_company` VALUES ('9V6VJZKDVY53PD4NUrymgd', null, 'werwer', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'GKkfJ2EA8U4gLRZMDfuCgU', '2017-04-25 14:28:41', null, '2017-04-25 14:28:41', '0');
INSERT INTO `t_company` VALUES ('AG8vJGmCb9njEn6UPjVWzo', null, '创建一家企业您的企业故那里之路从此开始', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'DgwimmQ5gs3T6NnpCDRRXY', '2017-04-25 14:17:08', null, '2017-04-25 14:17:08', '0');
INSERT INTO `t_company` VALUES ('BqpRh1hw2ePHcTwW4xt52E', null, '创建企业啊啊', '2017-06-01', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', null, null, 'Tk4DMhCTwPayLxDjrsgDAV', '2017-05-18 15:19:07', null, '2017-05-18 15:19:07', '0');
INSERT INTO `t_company` VALUES ('DMqWzKgsAhD9mjG8Fgkxz2', null, '创建企业创建企业', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'DgwimmQ5gs3T6NnpCDRRXY', '2017-04-25 14:17:25', null, '2017-04-25 14:17:25', '0');
INSERT INTO `t_company` VALUES ('EH4ZqDMJ3BNDozi4G1fe8s', null, '创建企业创建企业', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'DgwimmQ5gs3T6NnpCDRRXY', '2017-04-25 14:17:25', null, '2017-04-25 14:17:25', '0');
INSERT INTO `t_company` VALUES ('F3pfHUXTCNm3e3LfW9tHMt', null, '测试公司必须要六个字', '2017-06-19', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', null, null, 'L61EVGqin3qMt4EbvLdr2A', '2017-06-05 14:05:36', null, '2017-06-05 14:05:36', '0');
INSERT INTO `t_company` VALUES ('F8T8m5HprSkQhrJe1hFW5r', '哈哈哈哈嘎嘎嘎', '资源管理有限公司', '2017-06-01', null, null, null, null, null, null, '6dfNK9dyr4o4RYMgapf9nC', null, null, null, null, null, null, null, '0', null, null, null, '1', null, null, 'Tk4DMhCTwPayLxDjrsgDAV', '2017-05-18 14:35:27', 'Tk4DMhCTwPayLxDjrsgDAV', '2017-05-18 14:46:24', '0');
INSERT INTO `t_company` VALUES ('G4tL7agaTuifpxBKcYAdi6', null, '班步智能云平台', '2017-06-20', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', null, null, 'Qpr4hw8xBRVBXyyBzyG2m7', '2017-06-06 10:47:13', null, '2017-06-06 10:47:13', '0');
INSERT INTO `t_company` VALUES ('Hs1xcVz4Dtbs5VMWuybQEx', null, 'asdasdasd', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'GKkfJ2EA8U4gLRZMDfuCgU', '2017-04-25 14:17:27', null, '2017-04-25 14:17:27', '0');
INSERT INTO `t_company` VALUES ('K6pmWQgAMAmJMV1renC5rS', null, '创建企业创建企业', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'DgwimmQ5gs3T6NnpCDRRXY', '2017-04-25 14:17:26', null, '2017-04-25 14:17:26', '0');
INSERT INTO `t_company` VALUES ('LUBZndtd3AbjoGDdPGn3ig', null, '钱多多智能云平台', '2017-06-21', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', null, null, 'Qpr4hw8xBRVBXyyBzyG2m7', '2017-06-07 09:37:37', null, '2017-06-07 09:37:37', '0');
INSERT INTO `t_company` VALUES ('MLsxPktqjdz9HdwLqBCtaZ', '放进去玩具飞机前往附近', '上看的关键时刻东立国际', null, '320000,320900,320903', 'jk3t23t32', null, null, '123123', 'H2ZPjin8ZeuzP9vJDJkvuH', '5MnSZHJk9wiTNbVrSVwvXW', null, null, null, null, null, null, null, null, null, null, null, '1', '05', '6', 'AHATBkDyhEL5n7qHX2B5L5', '2017-04-25 14:20:12', 'AHATBkDyhEL5n7qHX2B5L5', '2017-04-26 15:56:32', '0');
INSERT INTO `t_company` VALUES ('NpySM7y5ZDy2BerDyCKLe1', null, 'werwerwerwerwerewrwer', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'GKkfJ2EA8U4gLRZMDfuCgU', '2017-04-25 14:28:51', null, '2017-04-25 14:28:51', '0');
INSERT INTO `t_company` VALUES ('WBudpLEaE75qTtU7BYc4LJ', null, 'qweqweqwe', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'GKkfJ2EA8U4gLRZMDfuCgU', '2017-04-25 14:22:26', null, '2017-04-25 14:22:26', '0');
INSERT INTO `t_company` VALUES ('XoBm87t6hYMeTaEkxPa1Qi', null, 'zxczxczxc', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'GKkfJ2EA8U4gLRZMDfuCgU', '2017-04-25 14:22:46', null, '2017-04-25 14:22:46', '0');
INSERT INTO `t_company` VALUES ('YAim9Psh4TNGTURPnquBWs', null, '啊动物的权威', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'UkR9incuK6KSaXeEqhnXV8', '2017-04-25 14:18:57', null, '2017-04-25 14:18:57', '0');

-- ----------------------------
-- Table structure for t_comp_fund_report
-- ----------------------------
DROP TABLE IF EXISTS `t_comp_fund_report`;
CREATE TABLE `t_comp_fund_report` (
  `UUID` char(22) NOT NULL,
  `FILENAME` text COMMENT '文件名称',
  `TITLE` varchar(255) DEFAULT NULL COMMENT '封面标题',
  `COMP_NAME` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `DATE` varchar(255) DEFAULT NULL COMMENT '日期',
  `CREATE_USER` char(22) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建日期',
  `UPDATE_USER` char(22) DEFAULT NULL COMMENT '修改人',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改日期',
  `DELETE_FLAG` tinyint(1) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='报告主表';

-- ----------------------------
-- Records of t_comp_fund_report
-- ----------------------------

-- ----------------------------
-- Table structure for t_comp_fund_report_sheet
-- ----------------------------
DROP TABLE IF EXISTS `t_comp_fund_report_sheet`;
CREATE TABLE `t_comp_fund_report_sheet` (
  `UUID` char(22) NOT NULL,
  `REPORT_UUID` char(22) DEFAULT NULL COMMENT '报告ID',
  `FILLING_UNIT` varchar(255) DEFAULT NULL COMMENT '填报单位',
  `HEAD_UNIT` varchar(50) DEFAULT NULL COMMENT '单位负责人',
  `FORM_HOLDER` varchar(50) DEFAULT NULL COMMENT '填表人',
  `REPORT_DATE` date DEFAULT NULL COMMENT '报表报出时间',
  `REPORT_DEADLINE` date DEFAULT NULL COMMENT '报表截止时间',
  `REPORT_TYPE` char(2) DEFAULT NULL COMMENT '报告类型受托人1',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='报告页\r\n';

-- ----------------------------
-- Records of t_comp_fund_report_sheet
-- ----------------------------

-- ----------------------------
-- Table structure for t_module
-- ----------------------------
DROP TABLE IF EXISTS `t_module`;
CREATE TABLE `t_module` (
  `UUID` char(22) NOT NULL,
  `SERVICE_CD` varchar(30) NOT NULL,
  `MODULE_CD` varchar(30) NOT NULL,
  `MODULE_NAME` varchar(40) NOT NULL,
  `MODULE_URL` varchar(255) DEFAULT NULL,
  `PARENT_UUID` char(22) DEFAULT NULL,
  `INSERT_USER` char(22) NOT NULL,
  `INSERT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_USER` char(22) DEFAULT NULL,
  `UPDATE_TIME` timestamp NULL DEFAULT NULL,
  `DELETE_FLAG` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_module
-- ----------------------------

-- ----------------------------
-- Table structure for t_report_account
-- ----------------------------
DROP TABLE IF EXISTS `t_report_account`;
CREATE TABLE `t_report_account` (
  `UUID` char(22) NOT NULL,
  `REPORT_UUID` char(22) DEFAULT NULL COMMENT '报表ID',
  `SHEET_UUID` char(22) DEFAULT NULL COMMENT '页ID',
  `PROJECT_NAME` varchar(50) DEFAULT NULL COMMENT '项目名称',
  `COMP_ACCOUNT_NUM` int(11) DEFAULT NULL COMMENT '企业账户数',
  `PERSION_ACCOUNT__NUM` int(11) DEFAULT NULL COMMENT '个人账户数',
  `ACCOUNT_BALANCE_NUM` int(11) DEFAULT NULL COMMENT '保留账户数',
  `ACCOUNT_BALANCE` decimal(16,4) DEFAULT NULL COMMENT '保留账户资金余额',
  `CURRENT_PAYMENT` decimal(16,4) DEFAULT NULL COMMENT '本期缴费(万元)',
  `CURRENT_NEW_PAYMENT` decimal(16,4) DEFAULT NULL COMMENT '（其中）本期新增缴费(万元)',
  `RECIPIENTS_ONCE` int(11) DEFAULT NULL COMMENT '领取人数(人)一次性',
  `RECIPIENTS_STAGES` int(11) DEFAULT NULL COMMENT '领取人数(人)分期',
  `RECEIVE_AMOUNT_ONCE` decimal(16,4) DEFAULT NULL COMMENT '领取金额(万元)一次性',
  `RECEIVE_AMOUNT_STAGES` decimal(16,4) DEFAULT NULL COMMENT '领取金额(万元)分期',
  `MANAGE_ACCOUNT_FEE` decimal(16,4) DEFAULT NULL COMMENT '账户管理费（万元）',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='帐管人';

-- ----------------------------
-- Records of t_report_account
-- ----------------------------

-- ----------------------------
-- Table structure for t_report_assete_normalization
-- ----------------------------
DROP TABLE IF EXISTS `t_report_assete_normalization`;
CREATE TABLE `t_report_assete_normalization` (
  `UUID` char(22) NOT NULL,
  `REPORT_UUID` char(22) DEFAULT NULL COMMENT '报表ID',
  `SHEET_UUID` char(22) DEFAULT NULL COMMENT '页ID',
  `PROD_CD` varchar(50) DEFAULT NULL COMMENT '组合代码',
  `PROD_NAME` varchar(255) DEFAULT NULL COMMENT '组合名称',
  `START_DATE` date DEFAULT NULL COMMENT '起始运作日期',
  `HAPPEN_DATE` date DEFAULT NULL COMMENT '净值归一发生日期',
  `SAME_DAY_MONEY` double(16,4) DEFAULT NULL COMMENT '当天单位净值（元）',
  `SAME_DAY_TOTAL_SHARE` varchar(255) DEFAULT NULL COMMENT '当天总份额（份）',
  `PRE_TOTAL_SHARE` int(11) DEFAULT NULL COMMENT ' 前一天总份额（份）',
  `PRE_DAY_MONEY` double(16,4) DEFAULT NULL COMMENT ' 前一天单位净值（元）',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='因净值归一影响组合单位净值补充信息表';

-- ----------------------------
-- Records of t_report_assete_normalization
-- ----------------------------

-- ----------------------------
-- Table structure for t_report_assets_allocation
-- ----------------------------
DROP TABLE IF EXISTS `t_report_assets_allocation`;
CREATE TABLE `t_report_assets_allocation` (
  `UUID` char(22) NOT NULL,
  `REPORT_UUID` char(22) DEFAULT NULL COMMENT '报表ID',
  `SHEET_UUID` char(22) DEFAULT NULL COMMENT '页ID',
  `PROD_CD` varchar(50) DEFAULT NULL COMMENT '组合代码',
  `PROD_NAME` varchar(255) DEFAULT NULL COMMENT '组合名称',
  `PROD_TYPE` varchar(255) DEFAULT NULL COMMENT '组合类型',
  `PROD_CLASS` varchar(255) DEFAULT NULL COMMENT '组合类别',
  `PLAN_TYPE` varchar(255) DEFAULT NULL COMMENT '计划类型',
  `BE_ENTRUSTED` varchar(255) DEFAULT NULL COMMENT '受托人',
  `TRUSTEESHIP` varchar(255) DEFAULT NULL COMMENT '托管人',
  `START_DATE` date DEFAULT NULL COMMENT '起始运作日期',
  `NET_ASSET_VALUE_END` decimal(16,4) DEFAULT NULL COMMENT '期末资产净值（万元）',
  `FINAL_ASSET_SHARE` int(11) DEFAULT NULL COMMENT '期末资产份额（份）',
  `FINAL_UNIT_VALUE` decimal(16,4) DEFAULT NULL COMMENT '期末单位净值',
  `LIQUID_ASSETS_PCT` double(10,4) DEFAULT NULL COMMENT '流动性资产_占净值比例%',
  `BANK_DEPOSIT_PCT` double(10,4) DEFAULT NULL COMMENT '银行活期存款_占净值比例%',
  `CENTRAL_BANK_NOTE_PCT` double(10,4) DEFAULT NULL COMMENT '中央银行票据_占净值比例%',
  `ONE_YEAR_FIXED_DEPOSIT_PCT` double(10,4) DEFAULT NULL COMMENT '一年期以内（含一年）定期存款、协议存款_占净值比例%',
  `BUY_BACK_PCT` double(10,4) DEFAULT NULL COMMENT '买入返售金融资产_占净值比例%',
  `MONEY_MARKET_FUND_PCT` double(10,4) DEFAULT NULL COMMENT '货币市场基金_占净值比例%',
  `MONETARY_PENSION_PRODUCTS_PCT` double(10,4) DEFAULT NULL COMMENT '货币型养老金产品_占净值比例%',
  `LIQUIDATION_RESERVE_FUND_PCT` double(10,4) DEFAULT NULL COMMENT '清算备付金_占净值比例%',
  `STOCK_CLEARING_PCT` double(10,4) DEFAULT NULL COMMENT '应收证券清算款_占净值比例%',
  `OTHER_LIQUIDITY_ASSETS_PCT` double(10,4) DEFAULT NULL COMMENT '其他流动性资产_占净值比例%',
  `FIXED_INCOME_ASSETS_PCT` double(10,4) DEFAULT NULL COMMENT '固定收益类资产_占净值比例%',
  `ONE_YEAR_UP_FIXED_DEPOSIT_PCT` double(10,4) DEFAULT NULL COMMENT '（其中）一年期以上定期存款、协议存款_占净值比例%',
  `NATIONAL_DEBT_PCT` double(10,4) DEFAULT NULL COMMENT '国债_占净值比例%',
  `FINANCIAL_DEBT_PCT` double(10,4) DEFAULT NULL COMMENT '金融债_占净值比例%',
  `CORPORATE_DEBT_PCT` double(10,4) DEFAULT NULL COMMENT '企业（公司）债_占净值比例%',
  `SHORT_TERM_FINANCING_BOND_PCT` double(10,4) DEFAULT NULL COMMENT '短期融资券_占净值比例%',
  `MEDIUM_TERM_NOTE_PCT` double(10,4) DEFAULT NULL COMMENT '中期票据_占净值比例%',
  `CONVERTIBLE_DEBT_PCT` double(10,4) DEFAULT NULL COMMENT '可转换债_占净值比例%',
  `BOND_FUND_PCT` double(10,4) DEFAULT NULL COMMENT '债券基金_占净值比例%',
  `INSURANCE_PRODUCTS_PCT` double(10,4) DEFAULT NULL COMMENT '保险产品（万能保险、股票投资比例≤30%的投资连接保险）_占净值比例%',
  `COMP_BANK_PRODUCTS_PCT` double(10,4) DEFAULT NULL COMMENT '商业银行理财产品_占净值比例%',
  `TRUST_PRODUCTS_PCT` double(10,4) DEFAULT NULL COMMENT '信托产品_占净值比例%',
  `SPECIFIC_ASSET_PLAN_PCT` double(10,4) DEFAULT NULL COMMENT '特定资产管理计划_占净值比例%',
  `INFRASTRUCTURE_DEBT_PLAN_PCT` double(10,4) DEFAULT NULL COMMENT '基础设施债权投资计划_占净值比例%',
  `FIXED_INCOME_PENSION_PCT` double(10,4) DEFAULT NULL COMMENT '固定收益型养老金产品_占净值比例%',
  `MIXED_PENSION_PCT` double(10,4) DEFAULT NULL COMMENT '混合型养老金产品_占净值比例%',
  `OTHER_FIXED_INCOME_PCT` double(10,4) DEFAULT NULL COMMENT '其他固定收益类资产_占净值比例%',
  `EQUITY_ASSETS_PCT` double(10,4) DEFAULT NULL COMMENT '权益类资产_占净值比例%',
  `SHARES_PCT` double(10,4) DEFAULT NULL COMMENT '股票_占净值比例%',
  `EQUITY_OR_HYBRID_FUNDS_PCT` double(10,4) DEFAULT NULL COMMENT '股票基金、混合基金_占净值比例%',
  `INVESTMENT_ADN_INSURANCE_PCT` double(10,4) DEFAULT NULL COMMENT '投资连结保险产品（股票投资比例＞30%）_占净值比例%',
  `WARRANT_PCT` double(10,4) DEFAULT NULL COMMENT '权证（非直接投资）_占净值比例%',
  `EQUITY_INSTRUMENTS_PCT` double(10,4) DEFAULT NULL COMMENT '权益工具_占净值比例%',
  `EQUITY_PENSION_PCT` double(10,4) DEFAULT NULL COMMENT '股票型养老金产品_占净值比例%',
  `OTHER_EQUITY_ASSETS_PCT` double(10,4) DEFAULT NULL COMMENT '其他权益类资产_占净值比例%',
  `OTHER_ASSETS_PCT` double(10,4) DEFAULT NULL COMMENT '其他资产_占净值比例%',
  `REMARKS` text COMMENT '备注',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='投管人企业年金基金投资组合资产配置报表';

-- ----------------------------
-- Records of t_report_assets_allocation
-- ----------------------------

-- ----------------------------
-- Table structure for t_report_be_entrusted
-- ----------------------------
DROP TABLE IF EXISTS `t_report_be_entrusted`;
CREATE TABLE `t_report_be_entrusted` (
  `UUID` char(22) NOT NULL,
  `REPORT_UUID` char(22) DEFAULT NULL COMMENT '报表ID',
  `SHEET_UUID` char(22) DEFAULT NULL COMMENT '页ID',
  `PROJECT_NAME` varchar(50) DEFAULT NULL COMMENT '项目名称',
  `PLAN_NUM` int(11) DEFAULT NULL COMMENT '计划数',
  `COMP_NUM` int(11) DEFAULT NULL COMMENT '企业数',
  `EMPL_NUM` int(11) DEFAULT NULL COMMENT '职工数',
  `ENTRUSTED_FUND` decimal(16,4) DEFAULT NULL COMMENT '受托管理基金金额(万元)',
  `PENSION_ASSETS` decimal(16,4) DEFAULT NULL COMMENT '计划直投养老金产品资产净值(万元)',
  `TRUSTEE_FEE` decimal(16,4) DEFAULT NULL COMMENT '受托管理费(万元)',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='受托人';

-- ----------------------------
-- Records of t_report_be_entrusted
-- ----------------------------

-- ----------------------------
-- Table structure for t_report_dividend_effect
-- ----------------------------
DROP TABLE IF EXISTS `t_report_dividend_effect`;
CREATE TABLE `t_report_dividend_effect` (
  `UUID` char(22) NOT NULL,
  `REPORT_UUID` char(22) DEFAULT NULL COMMENT '报表ID',
  `SHEET_UUID` char(22) DEFAULT NULL COMMENT '页ID',
  `PROD_CD` varchar(50) DEFAULT NULL COMMENT '组合代码',
  `PROD_NAME` varchar(255) DEFAULT NULL COMMENT '组合名称',
  `START_DATE` date DEFAULT NULL COMMENT '起始运作日期',
  `HAPPEN_DATE` datetime DEFAULT NULL COMMENT '分红发生日期',
  `SAME_DAY_MONEY` double(16,4) DEFAULT NULL COMMENT '分红当天分红金额（元）',
  `PRE_TOTAL_SHARE` int(11) DEFAULT NULL COMMENT '分红前总份额  (份)',
  `PRE_DAY_MONEY` double(16,4) DEFAULT NULL COMMENT '分红前一日单位净值',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='因分红影响组合单位净值补充信息表';

-- ----------------------------
-- Records of t_report_dividend_effect
-- ----------------------------

-- ----------------------------
-- Table structure for t_report_pipe_holder
-- ----------------------------
DROP TABLE IF EXISTS `t_report_pipe_holder`;
CREATE TABLE `t_report_pipe_holder` (
  `UUID` char(22) NOT NULL,
  `REPORT_UUID` char(22) DEFAULT NULL COMMENT '报表ID',
  `SHEET_UUID` char(22) DEFAULT NULL COMMENT '页ID',
  `PROJECT_NAME` varchar(50) DEFAULT NULL COMMENT '项目名称',
  `PORTFOLIO_NUM` int(11) DEFAULT NULL COMMENT '组合数',
  `PORTFOLIO_ASSETS` decimal(16,4) DEFAULT NULL COMMENT '组合资产净值本期投资收益',
  `RETURN_ON_INVESTMENT` decimal(16,4) DEFAULT NULL COMMENT '本期投资收益(万元)',
  `INVESTMENT_MANAGEMENT_FEE` decimal(16,4) DEFAULT NULL COMMENT '投资管理费(万元)',
  `INVESTMENT_MANAGEMENT_RISK_RESERVE` decimal(16,4) DEFAULT NULL COMMENT '投资管理风险准备金(万元)',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='投管人';

-- ----------------------------
-- Records of t_report_pipe_holder
-- ----------------------------

-- ----------------------------
-- Table structure for t_report_trusteeship
-- ----------------------------
DROP TABLE IF EXISTS `t_report_trusteeship`;
CREATE TABLE `t_report_trusteeship` (
  `UUID` char(22) NOT NULL,
  `REPORT_UUID` char(22) DEFAULT NULL COMMENT '报表ID',
  `SHEET_UUID` char(22) DEFAULT NULL COMMENT '页ID',
  `PROJECT_NAME` varchar(50) DEFAULT NULL COMMENT '项目名称',
  `PLAN_NUM` int(11) DEFAULT NULL COMMENT '计划数',
  `ENTRUSTED_FUND_SUM` decimal(16,4) DEFAULT NULL COMMENT '托管基金金额合计  ',
  `ENTRUSTED_FUND` decimal(16,4) DEFAULT NULL COMMENT '受托财产托管账户余额(万元)',
  `ENTRUSTED_INVESTMENT_FUND` decimal(16,4) DEFAULT NULL COMMENT '委托投资 资产净值',
  `PENSION_ASSETS` decimal(16,4) DEFAULT NULL COMMENT '计划直投养老金产品资产净值(万元)',
  `TRUSTEE_FEE` decimal(16,4) DEFAULT NULL COMMENT '托管管理费(万元)',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='托管人';

-- ----------------------------
-- Records of t_report_trusteeship
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `UUID` char(22) NOT NULL,
  `COMP_UUID` char(22) NOT NULL,
  `ROLE_NAME` varchar(30) NOT NULL,
  `ROLE_LEVEL` smallint(4) NOT NULL COMMENT '0-系统运维,2-集团管理员,4-公司管理员,16-普通角色。低级的角色不能给他人设置高等级的角色。',
  `DESCRIPTION` varchar(300) DEFAULT NULL,
  `INSERT_USER` char(22) NOT NULL,
  `INSERT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_USER` char(22) DEFAULT NULL,
  `UPDATE_TIME` timestamp NULL DEFAULT NULL,
  `DELETE_FLAG` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('8r5CnSedbdNBDFKUguD9fS', 'GLOBAL', '手机用户', '5', '', 'admin', '2017-04-19 10:20:09', '11', '2017-06-13 15:58:16', '0');
INSERT INTO `t_role` VALUES ('8r5CnSedbZNBDFKUguD9fd', 'GLOBAL', '人事经理', '2', null, 'admin', '2017-04-19 10:20:06', null, null, '0');
INSERT INTO `t_role` VALUES ('8r5CnSedbZNBDFKUguD9fe', 'GLOBAL', 'CEO', '3', null, 'admin', '2017-04-19 10:20:42', null, null, '0');
INSERT INTO `t_role` VALUES ('8r5CnSedbZNBDFKUguD9ff', 'GLOBAL', '人事专员', '4', null, 'admin', '2017-04-19 10:21:17', null, null, '0');
INSERT INTO `t_role` VALUES ('8r5CnSedbZNBDFKUguD9fS', 'GLOBAL', 'ROLE_ADMIN', '1', '超级管理员', 'admin', '2017-11-15 14:30:39', '11', null, '0');

-- ----------------------------
-- Table structure for t_role_mod
-- ----------------------------
DROP TABLE IF EXISTS `t_role_mod`;
CREATE TABLE `t_role_mod` (
  `COMP_UUID` char(22) NOT NULL,
  `ROLE_UUID` char(22) NOT NULL,
  `MODULE_UUID` char(22) NOT NULL,
  `ENABLE` tinyint(1) NOT NULL DEFAULT '1',
  `INSERT_USER` char(22) NOT NULL,
  `INSERT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_USER` char(22) DEFAULT NULL,
  `UPDATE_TIME` timestamp NULL DEFAULT NULL,
  `DELETE_FLAG` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ROLE_UUID`,`COMP_UUID`,`MODULE_UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_role_mod
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `UUID` char(22) NOT NULL COMMENT '加密',
  `MOBILE` varchar(20) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `SALT` varchar(64) DEFAULT NULL COMMENT '盐 废弃掉',
  `IS_ACTIVE` tinyint(1) DEFAULT '1',
  `CRYPT_VER` int(11) DEFAULT '0',
  `USER_PHOTO` char(22) DEFAULT NULL,
  `NAME` varchar(30) DEFAULT NULL COMMENT '真实姓名',
  `SHOW_NAME` varchar(30) DEFAULT NULL,
  `ENGLISH_NAME` varchar(30) DEFAULT NULL,
  `SPELLING` varchar(180) DEFAULT NULL,
  `FIRST_LETTER` varchar(30) DEFAULT NULL,
  `GENDER` char(1) DEFAULT NULL,
  `CITIZEN_SHIP` char(3) DEFAULT NULL,
  `ID_TYPE` char(2) DEFAULT NULL,
  `ID_NUMBER` varchar(18) DEFAULT NULL,
  `ID_NUMBER_FORWARD_FILE` char(22) DEFAULT NULL,
  `ID_NUMBER_BACK_FILE` char(22) DEFAULT NULL,
  `BIRTHDAY` date DEFAULT NULL,
  `ZODIAC` varchar(30) DEFAULT NULL,
  `BLOOD_TYPE` varchar(10) DEFAULT NULL,
  `NATIONALITY` char(2) DEFAULT NULL,
  `POLI_STATUS` char(2) DEFAULT NULL,
  `NATI_PLACE` varchar(50) DEFAULT NULL,
  `REGI_CITY` varchar(50) DEFAULT NULL,
  `REGI_PROPERTY` char(1) DEFAULT NULL,
  `MARI_STATUS` char(1) DEFAULT NULL,
  `FERT_MEMO` varchar(30) DEFAULT NULL COMMENT '生育状况',
  `FERT_STATUS` char(1) DEFAULT NULL COMMENT '是否已育',
  `CONTACT_TELE` varchar(30) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `QQ` varchar(20) DEFAULT NULL,
  `WEIXIN` varchar(30) DEFAULT NULL,
  `ADDENDA_PROV_FUND_ACCOUNT` varchar(12) DEFAULT NULL,
  `PROV_FUND_ACCOUNT` varchar(12) DEFAULT NULL,
  `PERSONNEL_FILE_LOCATION` varchar(100) DEFAULT NULL,
  `SOCIAL_ACCOUNT` varchar(30) DEFAULT NULL,
  `RESI_PERMIT` char(1) DEFAULT NULL,
  `REGI_ADDRESS` varchar(200) DEFAULT NULL,
  `RESI_NUMBER` varchar(20) DEFAULT NULL,
  `RESI_VALID_DATE` date DEFAULT NULL,
  `LIVE_ADDRESS` varchar(200) DEFAULT NULL,
  `LIVE_ZIP` char(6) DEFAULT NULL,
  `EDU_LEVEL` char(2) DEFAULT NULL,
  `WORK_START_DATE` date DEFAULT NULL,
  `HEIGHT` varchar(20) DEFAULT NULL,
  `WEIGHT` varchar(20) DEFAULT NULL,
  `INIT_FLAG` char(1) DEFAULT NULL,
  `DETAIL_RATE` varchar(22) DEFAULT '0' COMMENT '详细信息完成率',
  `INSERT_USER` char(22) DEFAULT NULL,
  `INSERT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_USER` char(22) DEFAULT NULL,
  `LAST_PASSWORD_RESET_DATE` timestamp NULL DEFAULT NULL COMMENT '最后一次修改密码时间',
  `UPDATE_TIME` timestamp NULL DEFAULT NULL,
  `DELETE_FLAG` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('3ShTCRwxVwepfaXdhhj8VW', '15900804441', 'a9cf196f15c3005a9e037f47d121099da6596896197d5ab6a1c4fd51615a6701', '376666ba207adff3', '1', '0', null, '杨佳军', null, null, null, null, null, null, '5', '235uu328582385', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, '1', '0', null, '2017-05-12 13:30:45', '3ShTCRwxVwepfaXdhhj8VW', null, '2017-05-22 16:39:52', '0');
INSERT INTO `t_user` VALUES ('5D9A17B6559C11E7BB4A00', '18621783959', '671ba4966112fc61089bf53ffd7ed86a0ed7ce098818a463be4baa6cd2e128a8', 'c7ee8a7a2280c6a3', '1', '0', '7EJBot48tQaAeyQFGDHFnQ', 'admin', null, null, null, null, '1', null, '2', '5D9A19E1559C11E7BB', null, null, null, null, null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '24', null, '2017-04-19 10:41:32', null, null, '2017-06-22 10:55:22', '0');
INSERT INTO `t_user` VALUES ('6B52B421558A11E7BB4A00', '15225166590', '78c1ce82f876f13cb233a799ce7dbb959da679624e5b16bfd66c7b68f78ef336', 'c7ee8a7a2280c6a3', '1', '0', '7EJBot48tQaAeyQFGDHFnQ', 'admin', null, null, null, null, '1', null, '2', '6B52B575558A11E7BB', null, null, null, null, null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '24', null, '2017-06-21 14:37:03', null, null, '2017-05-27 10:41:31', '0');
INSERT INTO `t_user` VALUES ('8BXkUqDcK1A35f6g9pJeMy', '17621034070', 'bff6eda0c8ceec481737e8143294249eceeb235d9f328c063ffe31ead59ef9e0', 'a6936dbe477ffd7a', '1', '0', null, '郑凡', null, 'zhengfan', null, null, '1', '156', '1', '420802199104070019', null, null, '1991-04-07', '水电费', '0', '15', '13', '水电费', '620000,621100', '1', '1', '水电费', '0', '17621034070 ', 'zf_fanfan123@163.com', '是的发', '水电费', '是的 ', '是的', '水电费', '是的发', '0', '水电费', '是的发', '2017-04-18', '水电费', null, '14', '2017-04-03', '是的发', '是的', '0', '0', null, '2017-04-25 14:29:24', null, null, '2017-04-25 14:29:21', '0');
INSERT INTO `t_user` VALUES ('936E61AF4A9611E7BB4A00', '15762313863', '78c1ce82f876f13cb233a799ce7dbb959da679624e5b16bfd66c7b68f78ef336', 'c7ee8a7a2280c6a3', '1', '0', '7EJBot48tQaAeyQFGDHFnQ', 'aaaa', null, null, null, null, '1', null, '2', '936E65204A9611E7BB', null, null, null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '24', null, '2017-04-19 10:41:32', null, null, '2017-05-27 10:41:31', '0');
INSERT INTO `t_user` VALUES ('AHATBkDyhEL5n7qHX2B5L5', '15900804441', 'b16592fd3c804afcc77efa4b6731032867dfb8a50a314eef7dea3a905c8d35ce', '5a9327d35155b051', '1', '0', '8iUaFnAxBwddcaHnpDdF38', '杨佳军', null, 'asfasfasf', null, null, '1', '840', '1', '214124', null, null, '1988-07-08', '214124', '4', '45', '01', '上海', '110000,110100', '1', '1', '112421', '0', '15900804441', '651380735@qq.com', '651380735', 'yjj15900804441', 'qwgkqwgq', 'efqoijgqwg', '上海', 'wqfljwqfqwf', '1', '1微积分却无法111号', '1234556', '2017-04-13', '玉兰香苑511弄', null, '31', '2017-04-13', '180', '80kg', '1', '0', null, '2017-04-25 10:23:47', null, null, '2017-05-22 16:39:52', '0');
INSERT INTO `t_user` VALUES ('CA3581E04A8C11E7BB4A00', '15837372530', '78c1ce82f876f13cb233a799ce7dbb959da679624e5b16bfd66c7b68f78ef336', 'c7ee8a7a2280c6a3', '1', '0', '7EJBot48tQaAeyQFGDHFnQ', 'admin', null, null, null, null, '1', null, '2', 'CA3584084A8C11E7BB', null, null, null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '24', null, '2017-04-19 10:41:32', null, null, '2017-05-27 10:41:31', '0');
INSERT INTO `t_user` VALUES ('F7RRNGAAjCp3kcNrYryNae', '15225166591', '63fe3f2bf672380af777aa3756845dccff88d5919b918e3e1a7b903ef71568d9e3f7447a416c164d', null, '1', '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, '2017-11-15 13:46:21', null, null, '2017-11-15 13:46:21', '0');
INSERT INTO `t_user` VALUES ('Qpr4hw8xBRVBXyyBzyG2m7', '17602127071', 'f03ede6e907ab6b30f010ed409363e823a4141d3c518f3af0a2aad3d1f5eef98', 'a44bf3668f3cd40e', '1', '0', 'YNBL2ziCT5rAGorZVhNcr6', '徐高翔', null, 'ada', null, null, '1', '156', '2', '4654654654', null, null, '2017-05-09', '4', '0', '2', '2', null, '120000,120200', '1', '1', '无', '1', '17602127071', '6039499@qq.com', '0649787', 'adasd', '313145', '456456465', null, '345646456', '0', null, null, null, '还是那个号', null, '41', '2017-05-17', '454', '54', '1', '62', null, '2017-06-15 15:18:53', null, null, '2017-06-12 16:37:23', '0');
INSERT INTO `t_user` VALUES ('SQL9GBAqX8FPYBoP7JUneM', '15225166593', '6f46f9757ef93a67a567ab314bff02cd139924af7eadc34f96b94ea537f76d473d4271f80599c162', null, '1', '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, '2017-11-15 13:49:17', null, null, '2017-11-15 13:49:17', '0');
INSERT INTO `t_user` VALUES ('WN8Zr3S6kNA4tfZvmUQx2g', '15225166595', '1f569851263228f1eed9efe5d1d4cdf1dc5b96677b02fb34b3d3a6c8d8f57f9a3ee5c3f4a2c2d6ad', null, '1', '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, '2017-11-15 13:52:50', null, null, '2017-11-15 13:52:50', '0');

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `UUID` char(22) NOT NULL,
  `COMP_UUID` char(22) NOT NULL,
  `USER_UUID` char(22) NOT NULL,
  `ROLE_UUID` char(22) NOT NULL,
  `EMPL_UUID` char(22) DEFAULT NULL COMMENT '员工编号',
  `ON_OFF_FLAG` char(1) NOT NULL DEFAULT '0' COMMENT '启/禁标示,0:启用;1:禁用',
  `RELA_STATUS` char(1) DEFAULT '0' COMMENT '关联状态:0未关联;1已关联;',
  `INSERT_USER` char(22) DEFAULT NULL,
  `INSERT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_USER` char(22) DEFAULT NULL,
  `UPDATE_TIME` timestamp NULL DEFAULT NULL,
  `DELETE_FLAG` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('07ADE5A24A9A11E7BB4A00', '07A98B424A9A11E7BB4A00', '8BXkUqDcK1A35f6g9pJeMy', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-06-06 17:25:07', null, '2017-06-06 17:25:07', '0');
INSERT INTO `t_user_role` VALUES ('2jRsDtSuA3nytgDUHLg6bQ', 'TPNq21SV3ZfNSinwrXo11B', 'UkR9incuK6KSaXeEqhnXV8', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-24 11:09:51', null, '2017-04-24 11:09:51', '0');
INSERT INTO `t_user_role` VALUES ('2S7Ny35Xz9cC6XJskcwytd', 'EH4ZqDMJ3BNDozi4G1fe8s', 'DgwimmQ5gs3T6NnpCDRRXY', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:17:25', null, '2017-04-25 14:17:25', '0');
INSERT INTO `t_user_role` VALUES ('3913bVbxPHKZXzaA4d7fdi', 'WBudpLEaE75qTtU7BYc4LJ', 'GKkfJ2EA8U4gLRZMDfuCgU', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:22:26', null, '2017-04-25 14:22:26', '0');
INSERT INTO `t_user_role` VALUES ('53cD92RCtsB5eTYW9hGkdY', 'G4tL7agaTuifpxBKcYAdi6', 'Qpr4hw8xBRVBXyyBzyG2m7', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-06-06 10:47:11', null, '2017-06-06 10:47:11', '0');
INSERT INTO `t_user_role` VALUES ('5DA07577559C11E7BB4A00', '5D9C5CFB559C11E7BB4A00', '5D9A17B6559C11E7BB4A00', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-06-20 17:39:33', null, '2017-06-20 17:39:33', '0');
INSERT INTO `t_user_role` VALUES ('62729CE5559C11E7BB4A00', '6241F5B7559C11E7BB4A00', '5D9A17B6559C11E7BB4A00', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-06-20 17:39:41', null, '2017-06-20 17:39:41', '0');
INSERT INTO `t_user_role` VALUES ('6B582967558A11E7BB4A00', '6B5641DF558A11E7BB4A00', '6B52B421558A11E7BB4A00', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-06-20 15:31:05', null, '2017-06-20 15:31:05', '0');
INSERT INTO `t_user_role` VALUES ('6SUB5458Ha9e3GBRFGRonx', 'FKf4EfKyShDPRNsn4Sbw3D', 'DgwimmQ5gs3T6NnpCDRRXY', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-21 15:40:12', null, '2017-04-21 15:40:12', '0');
INSERT INTO `t_user_role` VALUES ('7BZ6Vb9aEpsE3kAXHf47Xx', 'GdfWVZCdMZNJRyR4u7PSCF', 'AHATBkDyhEL5n7qHX2B5L5', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 13:53:41', null, '2017-04-25 13:53:41', '0');
INSERT INTO `t_user_role` VALUES ('7PYQNdiNhHh2PE9CiJessP', 'YSwZoF9VXYFXLCDWNAN6KE', 'DgwimmQ5gs3T6NnpCDRRXY', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-21 15:39:39', null, '2017-04-21 15:39:39', '0');
INSERT INTO `t_user_role` VALUES ('AKjVJyArQ2eAD9cSnkhrTJ', 'JaYjarpYPUmrQqmMGY1C9b', 'GKkfJ2EA8U4gLRZMDfuCgU', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:01:58', null, '2017-04-25 14:01:58', '0');
INSERT INTO `t_user_role` VALUES ('B3ccAZ1KbZadoWu7MHKa25', '9V6VJZKDVY53PD4NUrymgd', 'GKkfJ2EA8U4gLRZMDfuCgU', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:28:41', null, '2017-04-25 14:28:41', '0');
INSERT INTO `t_user_role` VALUES ('DRgw8epJWqRrMvEjtQa74s', 'MLsxPktqjdz9HdwLqBCtaZ', 'AHATBkDyhEL5n7qHX2B5L5', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:20:12', null, '2017-04-25 14:20:12', '0');
INSERT INTO `t_user_role` VALUES ('F25FFNpKzHfUutDLDwyoya', '4wkEbMAAW3jXHNGdo6Dznn', 'GKkfJ2EA8U4gLRZMDfuCgU', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:15:27', null, '2017-04-25 14:15:27', '0');
INSERT INTO `t_user_role` VALUES ('Fp2DcZxyqZiukEencjNXgx', 'XoBm87t6hYMeTaEkxPa1Qi', 'GKkfJ2EA8U4gLRZMDfuCgU', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:22:45', null, '2017-04-25 14:22:45', '0');
INSERT INTO `t_user_role` VALUES ('Gi47HbJu4icKaXdNxrod2B', 'AG8vJGmCb9njEn6UPjVWzo', 'DgwimmQ5gs3T6NnpCDRRXY', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:17:07', null, '2017-04-25 14:17:07', '0');
INSERT INTO `t_user_role` VALUES ('J94Bsn6fyko5jmUoqSpncz', '3kjy7udcRNqzYYFdV9z4nY', 'QQutyfffpMbv5KbfgPzHHM', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:22:42', null, '2017-04-25 14:22:42', '0');
INSERT INTO `t_user_role` VALUES ('JBWiBuixx5E2fpNuHbHowf', 'YAim9Psh4TNGTURPnquBWs', 'UkR9incuK6KSaXeEqhnXV8', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:18:57', null, '2017-04-25 14:18:57', '0');
INSERT INTO `t_user_role` VALUES ('KFGmm5Td5duFD3GSz9zQiV', 'XVxb51CAV72EX7AqPdSR1E', 'AHATBkDyhEL5n7qHX2B5L5', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-21 11:43:02', null, '2017-04-21 11:43:02', '0');
INSERT INTO `t_user_role` VALUES ('KNBy8Etrrt7PFKa2oqWaUC', 'DMqWzKgsAhD9mjG8Fgkxz2', 'DgwimmQ5gs3T6NnpCDRRXY', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:17:25', null, '2017-04-25 14:17:25', '0');
INSERT INTO `t_user_role` VALUES ('LQAfctqxoGdJov7PuqbabE', 'F8T8m5HprSkQhrJe1hFW5r', 'Tk4DMhCTwPayLxDjrsgDAV', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-05-18 14:35:26', null, '2017-05-18 14:35:26', '0');
INSERT INTO `t_user_role` VALUES ('MvasSEGsUet4mykaxtbB65', 'NpySM7y5ZDy2BerDyCKLe1', 'GKkfJ2EA8U4gLRZMDfuCgU', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:28:51', null, '2017-04-25 14:28:51', '0');
INSERT INTO `t_user_role` VALUES ('Rtq23NQdV5WpbJppMp1iCQ', 'A3xWSnD3PLzZ2ry5NibN7B', 'GKkfJ2EA8U4gLRZMDfuCgU', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:00:21', null, '2017-04-25 14:00:21', '0');
INSERT INTO `t_user_role` VALUES ('T43iajoKc3YPkMNbMvQiax', 'BqpRh1hw2ePHcTwW4xt52E', 'Tk4DMhCTwPayLxDjrsgDAV', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-05-18 15:19:07', null, '2017-05-18 15:19:07', '0');
INSERT INTO `t_user_role` VALUES ('VcXMt9npmrqbZ2WCsAaUVs', 'Hs1xcVz4Dtbs5VMWuybQEx', 'GKkfJ2EA8U4gLRZMDfuCgU', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:17:26', null, '2017-04-25 14:17:26', '0');
INSERT INTO `t_user_role` VALUES ('VKguUWYnbPSKiVeSfkYpMa', 'K6pmWQgAMAmJMV1renC5rS', 'DgwimmQ5gs3T6NnpCDRRXY', '8r5CnSedbZNBDFKUguD9fS', null, '0', '0', null, '2017-04-25 14:17:25', null, '2017-04-25 14:17:25', '0');
