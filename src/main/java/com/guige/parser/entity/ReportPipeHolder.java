package com.guige.parser.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_report_pipe_holder")
public class ReportPipeHolder {
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
     * 组合数
     */
    @Column(name = "PORTFOLIO_NUM")
    private Integer portfolioNum;

    /**
     * 组合资产净值本期投资收益
     */
    @Column(name = "PORTFOLIO_ASSETS")
    private BigDecimal portfolioAssets;

    /**
     * 本期投资收益(万元)
     */
    @Column(name = "RETURN_ON_INVESTMENT")
    private BigDecimal returnOnInvestment;

    /**
     * 投资管理费(万元)
     */
    @Column(name = "INVESTMENT_MANAGEMENT_FEE")
    private BigDecimal investmentManagementFee;

    /**
     * 投资管理风险准备金(万元)
     */
    @Column(name = "INVESTMENT_MANAGEMENT_RISK_RESERVE")
    private BigDecimal investmentManagementRiskReserve;

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
     * 获取组合数
     *
     * @return PORTFOLIO_NUM - 组合数
     */
    public Integer getPortfolioNum() {
        return portfolioNum;
    }

    /**
     * 设置组合数
     *
     * @param portfolioNum 组合数
     */
    public void setPortfolioNum(Integer portfolioNum) {
        this.portfolioNum = portfolioNum;
    }

    /**
     * 获取组合资产净值本期投资收益
     *
     * @return PORTFOLIO_ASSETS - 组合资产净值本期投资收益
     */
    public BigDecimal getPortfolioAssets() {
        return portfolioAssets;
    }

    /**
     * 设置组合资产净值本期投资收益
     *
     * @param portfolioAssets 组合资产净值本期投资收益
     */
    public void setPortfolioAssets(BigDecimal portfolioAssets) {
        this.portfolioAssets = portfolioAssets;
    }

    /**
     * 获取本期投资收益(万元)
     *
     * @return RETURN_ON_INVESTMENT - 本期投资收益(万元)
     */
    public BigDecimal getReturnOnInvestment() {
        return returnOnInvestment;
    }

    /**
     * 设置本期投资收益(万元)
     *
     * @param returnOnInvestment 本期投资收益(万元)
     */
    public void setReturnOnInvestment(BigDecimal returnOnInvestment) {
        this.returnOnInvestment = returnOnInvestment;
    }

    /**
     * 获取投资管理费(万元)
     *
     * @return INVESTMENT_MANAGEMENT_FEE - 投资管理费(万元)
     */
    public BigDecimal getInvestmentManagementFee() {
        return investmentManagementFee;
    }

    /**
     * 设置投资管理费(万元)
     *
     * @param investmentManagementFee 投资管理费(万元)
     */
    public void setInvestmentManagementFee(BigDecimal investmentManagementFee) {
        this.investmentManagementFee = investmentManagementFee;
    }

    /**
     * 获取投资管理风险准备金(万元)
     *
     * @return INVESTMENT_MANAGEMENT_RISK_RESERVE - 投资管理风险准备金(万元)
     */
    public BigDecimal getInvestmentManagementRiskReserve() {
        return investmentManagementRiskReserve;
    }

    /**
     * 设置投资管理风险准备金(万元)
     *
     * @param investmentManagementRiskReserve 投资管理风险准备金(万元)
     */
    public void setInvestmentManagementRiskReserve(BigDecimal investmentManagementRiskReserve) {
        this.investmentManagementRiskReserve = investmentManagementRiskReserve;
    }
}