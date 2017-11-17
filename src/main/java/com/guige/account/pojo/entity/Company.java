package com.guige.account.pojo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_company")
public class Company {
    @Id
    @Column(name = "UUID")
    private String uuid;

    /**
     * 营业执照全称
     */
    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 显示名称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 试用期截止
     */
    @Column(name = "TRIAL_END")
    private Date trialEnd;

    /**
     * 所在地区
     */
    @Column(name = "AREA")
    private String area;

    /**
     * 地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 电话
     */
    @Column(name = "TEL")
    private String tel;

    /**
     * 传真
     */
    @Column(name = "FAX")
    private String fax;

    /**
     * 邮编
     */
    @Column(name = "ZIP_CODE")
    private String zipCode;

    /**
     * 公司LOGO
     */
    @Column(name = "LOGO_FILE")
    private String logoFile;

    /**
     * 营业执照保存的文件id
     */
    @Column(name = "BUSI_LICE_FILE")
    private String busiLiceFile;

    /**
     * 联系人
     */
    @Column(name = "CONTACTOR")
    private String contactor;

    /**
     * 联系人手机
     */
    @Column(name = "CONT_MOBLIE")
    private String contMoblie;

    /**
     * 联系人邮箱
     */
    @Column(name = "CONT_EMAIL")
    private String contEmail;

    /**
     * 联系人所在地区
     */
    @Column(name = "CONT_AREA")
    private String contArea;

    /**
     * 联系人详细地址
     */
    @Column(name = "CONT_ADDRESS")
    private String contAddress;

    /**
     * 联系人邮编
     */
    @Column(name = "CONT_ZIP_CODE")
    private String contZipCode;

    /**
     * 公司类型
     */
    @Column(name = "COMP_TYPE")
    private String compType;

    /**
     * 初始化标志
     */
    @Column(name = "INIT_FLAG")
    private String initFlag;

    /**
     * 初始化时间
     */
    @Column(name = "INIT_TIME")
    private Date initTime;

    /**
     * 注册渠道
     */
    @Column(name = "REG_CHANNEL")
    private String regChannel;

    /**
     * 注册来源
     */
    @Column(name = "SOURCE")
    private String source;

    /**
     * 审核标志
     */
    @Column(name = "REVIEW_FLG")
    private String reviewFlg;

    /**
     * 行业
     */
    @Column(name = "INDUSTRY")
    private String industry;

    /**
     * 企业规模
     */
    @Column(name = "SCALE")
    private String scale;

    @Column(name = "INSERT_USER")
    private String insertUser;

    @Column(name = "INSERT_TIME")
    private Date insertTime;

    @Column(name = "UPDATE_USER")
    private String updateUser;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "DELETE_FLAG")
    private Boolean deleteFlag;

    /**
     * @return UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取营业执照全称
     *
     * @return REAL_NAME - 营业执照全称
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置营业执照全称
     *
     * @param realName 营业执照全称
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取显示名称
     *
     * @return NICK_NAME - 显示名称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置显示名称
     *
     * @param nickName 显示名称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取试用期截止
     *
     * @return TRIAL_END - 试用期截止
     */
    public Date getTrialEnd() {
        return trialEnd;
    }

    /**
     * 设置试用期截止
     *
     * @param trialEnd 试用期截止
     */
    public void setTrialEnd(Date trialEnd) {
        this.trialEnd = trialEnd;
    }

    /**
     * 获取所在地区
     *
     * @return AREA - 所在地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置所在地区
     *
     * @param area 所在地区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取地址
     *
     * @return ADDRESS - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取电话
     *
     * @return TEL - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取传真
     *
     * @return FAX - 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置传真
     *
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取邮编
     *
     * @return ZIP_CODE - 邮编
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置邮编
     *
     * @param zipCode 邮编
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 获取公司LOGO
     *
     * @return LOGO_FILE - 公司LOGO
     */
    public String getLogoFile() {
        return logoFile;
    }

    /**
     * 设置公司LOGO
     *
     * @param logoFile 公司LOGO
     */
    public void setLogoFile(String logoFile) {
        this.logoFile = logoFile;
    }

    /**
     * 获取营业执照保存的文件id
     *
     * @return BUSI_LICE_FILE - 营业执照保存的文件id
     */
    public String getBusiLiceFile() {
        return busiLiceFile;
    }

    /**
     * 设置营业执照保存的文件id
     *
     * @param busiLiceFile 营业执照保存的文件id
     */
    public void setBusiLiceFile(String busiLiceFile) {
        this.busiLiceFile = busiLiceFile;
    }

    /**
     * 获取联系人
     *
     * @return CONTACTOR - 联系人
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * 设置联系人
     *
     * @param contactor 联系人
     */
    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    /**
     * 获取联系人手机
     *
     * @return CONT_MOBLIE - 联系人手机
     */
    public String getContMoblie() {
        return contMoblie;
    }

    /**
     * 设置联系人手机
     *
     * @param contMoblie 联系人手机
     */
    public void setContMoblie(String contMoblie) {
        this.contMoblie = contMoblie;
    }

    /**
     * 获取联系人邮箱
     *
     * @return CONT_EMAIL - 联系人邮箱
     */
    public String getContEmail() {
        return contEmail;
    }

    /**
     * 设置联系人邮箱
     *
     * @param contEmail 联系人邮箱
     */
    public void setContEmail(String contEmail) {
        this.contEmail = contEmail;
    }

    /**
     * 获取联系人所在地区
     *
     * @return CONT_AREA - 联系人所在地区
     */
    public String getContArea() {
        return contArea;
    }

    /**
     * 设置联系人所在地区
     *
     * @param contArea 联系人所在地区
     */
    public void setContArea(String contArea) {
        this.contArea = contArea;
    }

    /**
     * 获取联系人详细地址
     *
     * @return CONT_ADDRESS - 联系人详细地址
     */
    public String getContAddress() {
        return contAddress;
    }

    /**
     * 设置联系人详细地址
     *
     * @param contAddress 联系人详细地址
     */
    public void setContAddress(String contAddress) {
        this.contAddress = contAddress;
    }

    /**
     * 获取联系人邮编
     *
     * @return CONT_ZIP_CODE - 联系人邮编
     */
    public String getContZipCode() {
        return contZipCode;
    }

    /**
     * 设置联系人邮编
     *
     * @param contZipCode 联系人邮编
     */
    public void setContZipCode(String contZipCode) {
        this.contZipCode = contZipCode;
    }

    /**
     * 获取公司类型
     *
     * @return COMP_TYPE - 公司类型
     */
    public String getCompType() {
        return compType;
    }

    /**
     * 设置公司类型
     *
     * @param compType 公司类型
     */
    public void setCompType(String compType) {
        this.compType = compType;
    }

    /**
     * 获取初始化标志
     *
     * @return INIT_FLAG - 初始化标志
     */
    public String getInitFlag() {
        return initFlag;
    }

    /**
     * 设置初始化标志
     *
     * @param initFlag 初始化标志
     */
    public void setInitFlag(String initFlag) {
        this.initFlag = initFlag;
    }

    /**
     * 获取初始化时间
     *
     * @return INIT_TIME - 初始化时间
     */
    public Date getInitTime() {
        return initTime;
    }

    /**
     * 设置初始化时间
     *
     * @param initTime 初始化时间
     */
    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }

    /**
     * 获取注册渠道
     *
     * @return REG_CHANNEL - 注册渠道
     */
    public String getRegChannel() {
        return regChannel;
    }

    /**
     * 设置注册渠道
     *
     * @param regChannel 注册渠道
     */
    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }

    /**
     * 获取注册来源
     *
     * @return SOURCE - 注册来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置注册来源
     *
     * @param source 注册来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取审核标志
     *
     * @return REVIEW_FLG - 审核标志
     */
    public String getReviewFlg() {
        return reviewFlg;
    }

    /**
     * 设置审核标志
     *
     * @param reviewFlg 审核标志
     */
    public void setReviewFlg(String reviewFlg) {
        this.reviewFlg = reviewFlg;
    }

    /**
     * 获取行业
     *
     * @return INDUSTRY - 行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 设置行业
     *
     * @param industry 行业
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 获取企业规模
     *
     * @return SCALE - 企业规模
     */
    public String getScale() {
        return scale;
    }

    /**
     * 设置企业规模
     *
     * @param scale 企业规模
     */
    public void setScale(String scale) {
        this.scale = scale;
    }

    /**
     * @return INSERT_USER
     */
    public String getInsertUser() {
        return insertUser;
    }

    /**
     * @param insertUser
     */
    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser;
    }

    /**
     * @return INSERT_TIME
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * @param insertTime
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * @return UPDATE_USER
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return DELETE_FLAG
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param deleteFlag
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}