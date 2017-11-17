package com.guige.parser.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_report_trusteeship")
public class ReportTrusteeship {
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
     * 计划数
     */
    @Column(name = "PLAN_NUM")
    private Integer planNum;

    /**
     * 托管基金金额合计  
     */
    @Column(name = "ENTRUSTED_FUND_SUM")
    private BigDecimal entrustedFundSum;

    /**
     * 受托财产托管账户余额(万元)
     */
    @Column(name = "ENTRUSTED_FUND")
    private BigDecimal entrustedFund;

    /**
     * 委托投资 资产净值
     */
    @Column(name = "ENTRUSTED_INVESTMENT_FUND")
    private BigDecimal entrustedInvestmentFund;

    /**
     * 计划直投养老金产品资产净值(万元)
     */
    @Column(name = "PENSION_ASSETS")
    private BigDecimal pensionAssets;

    /**
     * 托管管理费(万元)
     */
    @Column(name = "TRUSTEE_FEE")
    private BigDecimal trusteeFee;

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
     * 获取计划数
     *
     * @return PLAN_NUM - 计划数
     */
    public Integer getPlanNum() {
        return planNum;
    }

    /**
     * 设置计划数
     *
     * @param planNum 计划数
     */
    public void setPlanNum(Integer planNum) {
        this.planNum = planNum;
    }

    /**
     * 获取托管基金金额合计  
     *
     * @return ENTRUSTED_FUND_SUM - 托管基金金额合计  
     */
    public BigDecimal getEntrustedFundSum() {
        return entrustedFundSum;
    }

    /**
     * 设置托管基金金额合计  
     *
     * @param entrustedFundSum 托管基金金额合计  
     */
    public void setEntrustedFundSum(BigDecimal entrustedFundSum) {
        this.entrustedFundSum = entrustedFundSum;
    }

    /**
     * 获取受托财产托管账户余额(万元)
     *
     * @return ENTRUSTED_FUND - 受托财产托管账户余额(万元)
     */
    public BigDecimal getEntrustedFund() {
        return entrustedFund;
    }

    /**
     * 设置受托财产托管账户余额(万元)
     *
     * @param entrustedFund 受托财产托管账户余额(万元)
     */
    public void setEntrustedFund(BigDecimal entrustedFund) {
        this.entrustedFund = entrustedFund;
    }

    /**
     * 获取委托投资 资产净值
     *
     * @return ENTRUSTED_INVESTMENT_FUND - 委托投资 资产净值
     */
    public BigDecimal getEntrustedInvestmentFund() {
        return entrustedInvestmentFund;
    }

    /**
     * 设置委托投资 资产净值
     *
     * @param entrustedInvestmentFund 委托投资 资产净值
     */
    public void setEntrustedInvestmentFund(BigDecimal entrustedInvestmentFund) {
        this.entrustedInvestmentFund = entrustedInvestmentFund;
    }

    /**
     * 获取计划直投养老金产品资产净值(万元)
     *
     * @return PENSION_ASSETS - 计划直投养老金产品资产净值(万元)
     */
    public BigDecimal getPensionAssets() {
        return pensionAssets;
    }

    /**
     * 设置计划直投养老金产品资产净值(万元)
     *
     * @param pensionAssets 计划直投养老金产品资产净值(万元)
     */
    public void setPensionAssets(BigDecimal pensionAssets) {
        this.pensionAssets = pensionAssets;
    }

    /**
     * 获取托管管理费(万元)
     *
     * @return TRUSTEE_FEE - 托管管理费(万元)
     */
    public BigDecimal getTrusteeFee() {
        return trusteeFee;
    }

    /**
     * 设置托管管理费(万元)
     *
     * @param trusteeFee 托管管理费(万元)
     */
    public void setTrusteeFee(BigDecimal trusteeFee) {
        this.trusteeFee = trusteeFee;
    }
}