package com.guige.parser.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_report_account")
public class ReportAccount {
    @Id
    @Column(name = "UUID")
    private String uuid;

    /**
     * 报表ID
     */
    @Column(name = "REPORT_UUID")
    private String reportUuid;

    /**
     * 页ID
     */
    @Column(name = "SHEET_UUID")
    private String sheetUuid;

    /**
     * 项目名称
     */
    @Column(name = "PROJECT_NAME")
    private String projectName;

    /**
     * 企业账户数
     */
    @Column(name = "COMP_ACCOUNT_NUM")
    private Integer compAccountNum;

    /**
     * 个人账户数
     */
    @Column(name = "PERSION_ACCOUNT__NUM")
    private Integer persionAccountNum;

    /**
     * 保留账户数
     */
    @Column(name = "ACCOUNT_BALANCE_NUM")
    private Integer accountBalanceNum;

    /**
     * 保留账户资金余额
     */
    @Column(name = "ACCOUNT_BALANCE")
    private BigDecimal accountBalance;

    /**
     * 本期缴费(万元)
     */
    @Column(name = "CURRENT_PAYMENT")
    private BigDecimal currentPayment;

    /**
     * （其中）本期新增缴费(万元)
     */
    @Column(name = "CURRENT_NEW_PAYMENT")
    private BigDecimal currentNewPayment;

    /**
     * 领取人数(人)一次性
     */
    @Column(name = "RECIPIENTS_ONCE")
    private Integer recipientsOnce;

    /**
     * 领取人数(人)分期
     */
    @Column(name = "RECIPIENTS_STAGES")
    private Integer recipientsStages;

    /**
     * 领取金额(万元)一次性
     */
    @Column(name = "RECEIVE_AMOUNT_ONCE")
    private BigDecimal receiveAmountOnce;

    /**
     * 领取金额(万元)分期
     */
    @Column(name = "RECEIVE_AMOUNT_STAGES")
    private BigDecimal receiveAmountStages;

    /**
     * 账户管理费（万元）
     */
    @Column(name = "MANAGE_ACCOUNT_FEE")
    private BigDecimal manageAccountFee;

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
     * 获取报表ID
     *
     * @return REPORT_UUID - 报表ID
     */
    public String getReportUuid() {
        return reportUuid;
    }

    /**
     * 设置报表ID
     *
     * @param reportUuid 报表ID
     */
    public void setReportUuid(String reportUuid) {
        this.reportUuid = reportUuid;
    }

    /**
     * 获取页ID
     *
     * @return SHEET_UUID - 页ID
     */
    public String getSheetUuid() {
        return sheetUuid;
    }

    /**
     * 设置页ID
     *
     * @param sheetUuid 页ID
     */
    public void setSheetUuid(String sheetUuid) {
        this.sheetUuid = sheetUuid;
    }

    /**
     * 获取项目名称
     *
     * @return PROJECT_NAME - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取企业账户数
     *
     * @return COMP_ACCOUNT_NUM - 企业账户数
     */
    public Integer getCompAccountNum() {
        return compAccountNum;
    }

    /**
     * 设置企业账户数
     *
     * @param compAccountNum 企业账户数
     */
    public void setCompAccountNum(Integer compAccountNum) {
        this.compAccountNum = compAccountNum;
    }

    /**
     * 获取个人账户数
     *
     * @return PERSION_ACCOUNT__NUM - 个人账户数
     */
    public Integer getPersionAccountNum() {
        return persionAccountNum;
    }

    /**
     * 设置个人账户数
     *
     * @param persionAccountNum 个人账户数
     */
    public void setPersionAccountNum(Integer persionAccountNum) {
        this.persionAccountNum = persionAccountNum;
    }

    /**
     * 获取保留账户数
     *
     * @return ACCOUNT_BALANCE_NUM - 保留账户数
     */
    public Integer getAccountBalanceNum() {
        return accountBalanceNum;
    }

    /**
     * 设置保留账户数
     *
     * @param accountBalanceNum 保留账户数
     */
    public void setAccountBalanceNum(Integer accountBalanceNum) {
        this.accountBalanceNum = accountBalanceNum;
    }

    /**
     * 获取保留账户资金余额
     *
     * @return ACCOUNT_BALANCE - 保留账户资金余额
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * 设置保留账户资金余额
     *
     * @param accountBalance 保留账户资金余额
     */
    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * 获取本期缴费(万元)
     *
     * @return CURRENT_PAYMENT - 本期缴费(万元)
     */
    public BigDecimal getCurrentPayment() {
        return currentPayment;
    }

    /**
     * 设置本期缴费(万元)
     *
     * @param currentPayment 本期缴费(万元)
     */
    public void setCurrentPayment(BigDecimal currentPayment) {
        this.currentPayment = currentPayment;
    }

    /**
     * 获取（其中）本期新增缴费(万元)
     *
     * @return CURRENT_NEW_PAYMENT - （其中）本期新增缴费(万元)
     */
    public BigDecimal getCurrentNewPayment() {
        return currentNewPayment;
    }

    /**
     * 设置（其中）本期新增缴费(万元)
     *
     * @param currentNewPayment （其中）本期新增缴费(万元)
     */
    public void setCurrentNewPayment(BigDecimal currentNewPayment) {
        this.currentNewPayment = currentNewPayment;
    }

    /**
     * 获取领取人数(人)一次性
     *
     * @return RECIPIENTS_ONCE - 领取人数(人)一次性
     */
    public Integer getRecipientsOnce() {
        return recipientsOnce;
    }

    /**
     * 设置领取人数(人)一次性
     *
     * @param recipientsOnce 领取人数(人)一次性
     */
    public void setRecipientsOnce(Integer recipientsOnce) {
        this.recipientsOnce = recipientsOnce;
    }

    /**
     * 获取领取人数(人)分期
     *
     * @return RECIPIENTS_STAGES - 领取人数(人)分期
     */
    public Integer getRecipientsStages() {
        return recipientsStages;
    }

    /**
     * 设置领取人数(人)分期
     *
     * @param recipientsStages 领取人数(人)分期
     */
    public void setRecipientsStages(Integer recipientsStages) {
        this.recipientsStages = recipientsStages;
    }

    /**
     * 获取领取金额(万元)一次性
     *
     * @return RECEIVE_AMOUNT_ONCE - 领取金额(万元)一次性
     */
    public BigDecimal getReceiveAmountOnce() {
        return receiveAmountOnce;
    }

    /**
     * 设置领取金额(万元)一次性
     *
     * @param receiveAmountOnce 领取金额(万元)一次性
     */
    public void setReceiveAmountOnce(BigDecimal receiveAmountOnce) {
        this.receiveAmountOnce = receiveAmountOnce;
    }

    /**
     * 获取领取金额(万元)分期
     *
     * @return RECEIVE_AMOUNT_STAGES - 领取金额(万元)分期
     */
    public BigDecimal getReceiveAmountStages() {
        return receiveAmountStages;
    }

    /**
     * 设置领取金额(万元)分期
     *
     * @param receiveAmountStages 领取金额(万元)分期
     */
    public void setReceiveAmountStages(BigDecimal receiveAmountStages) {
        this.receiveAmountStages = receiveAmountStages;
    }

    /**
     * 获取账户管理费（万元）
     *
     * @return MANAGE_ACCOUNT_FEE - 账户管理费（万元）
     */
    public BigDecimal getManageAccountFee() {
        return manageAccountFee;
    }

    /**
     * 设置账户管理费（万元）
     *
     * @param manageAccountFee 账户管理费（万元）
     */
    public void setManageAccountFee(BigDecimal manageAccountFee) {
        this.manageAccountFee = manageAccountFee;
    }
}