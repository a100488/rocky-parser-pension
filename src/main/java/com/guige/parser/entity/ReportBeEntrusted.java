package com.guige.parser.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "t_report_be_entrusted")
public class ReportBeEntrusted {
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
     * 企业数
     */
    @Column(name = "COMP_NUM")
    private Integer compNum;

    /**
     * 职工数
     */
    @Column(name = "EMPL_NUM")
    private Integer emplNum;

    /**
     * 受托管理基金金额(万元)
     */
    @Column(name = "ENTRUSTED_FUND")
    private BigDecimal entrustedFund;

    /**
     * 计划直投养老金产品资产净值(万元)
     */
    @Column(name = "PENSION_ASSETS")
    private BigDecimal pensionAssets;

    /**
     * 受托管理费(万元)
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
     * 获取企业数
     *
     * @return COMP_NUM - 企业数
     */
    public Integer getCompNum() {
        return compNum;
    }

    /**
     * 设置企业数
     *
     * @param compNum 企业数
     */
    public void setCompNum(Integer compNum) {
        this.compNum = compNum;
    }

    /**
     * 获取职工数
     *
     * @return EMPL_NUM - 职工数
     */
    public Integer getEmplNum() {
        return emplNum;
    }

    /**
     * 设置职工数
     *
     * @param emplNum 职工数
     */
    public void setEmplNum(Integer emplNum) {
        this.emplNum = emplNum;
    }

    /**
     * 获取受托管理基金金额(万元)
     *
     * @return ENTRUSTED_FUND - 受托管理基金金额(万元)
     */
    public BigDecimal getEntrustedFund() {
        return entrustedFund;
    }

    /**
     * 设置受托管理基金金额(万元)
     *
     * @param entrustedFund 受托管理基金金额(万元)
     */
    public void setEntrustedFund(BigDecimal entrustedFund) {
        this.entrustedFund = entrustedFund;
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
     * 获取受托管理费(万元)
     *
     * @return TRUSTEE_FEE - 受托管理费(万元)
     */
    public BigDecimal getTrusteeFee() {
        return trusteeFee;
    }

    /**
     * 设置受托管理费(万元)
     *
     * @param trusteeFee 受托管理费(万元)
     */
    public void setTrusteeFee(BigDecimal trusteeFee) {
        this.trusteeFee = trusteeFee;
    }
}