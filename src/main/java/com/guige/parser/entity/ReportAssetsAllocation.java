package com.guige.parser.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_report_assets_allocation")
public class ReportAssetsAllocation {
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
     * 组合代码
     */
    @Column(name = "PROD_CD")
    private String prodCd;

    /**
     * 组合名称
     */
    @Column(name = "PROD_NAME")
    private String prodName;

    /**
     * 组合类型
     */
    @Column(name = "PROD_TYPE")
    private String prodType;

    /**
     * 组合类别
     */
    @Column(name = "PROD_CLASS")
    private String prodClass;

    /**
     * 计划类型
     */
    @Column(name = "PLAN_TYPE")
    private String planType;

    /**
     * 受托人
     */
    @Column(name = "BE_ENTRUSTED")
    private String beEntrusted;

    /**
     * 托管人
     */
    @Column(name = "TRUSTEESHIP")
    private String trusteeship;

    /**
     * 起始运作日期
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 期末资产净值（万元）
     */
    @Column(name = "NET_ASSET_VALUE_END")
    private BigDecimal netAssetValueEnd;

    /**
     * 期末资产份额（份）
     */
    @Column(name = "FINAL_ASSET_SHARE")
    private Integer finalAssetShare;

    /**
     * 期末单位净值
     */
    @Column(name = "FINAL_UNIT_VALUE")
    private BigDecimal finalUnitValue;

    /**
     * 流动性资产_占净值比例%
     */
    @Column(name = "LIQUID_ASSETS_PCT")
    private Double liquidAssetsPct;

    /**
     * 银行活期存款_占净值比例%
     */
    @Column(name = "BANK_DEPOSIT_PCT")
    private Double bankDepositPct;

    /**
     * 中央银行票据_占净值比例%
     */
    @Column(name = "CENTRAL_BANK_NOTE_PCT")
    private Double centralBankNotePct;

    /**
     * 一年期以内（含一年）定期存款、协议存款_占净值比例%
     */
    @Column(name = "ONE_YEAR_FIXED_DEPOSIT_PCT")
    private Double oneYearFixedDepositPct;

    /**
     * 买入返售金融资产_占净值比例%
     */
    @Column(name = "BUY_BACK_PCT")
    private Double buyBackPct;

    /**
     * 货币市场基金_占净值比例%
     */
    @Column(name = "MONEY_MARKET_FUND_PCT")
    private Double moneyMarketFundPct;

    /**
     * 货币型养老金产品_占净值比例%
     */
    @Column(name = "MONETARY_PENSION_PRODUCTS_PCT")
    private Double monetaryPensionProductsPct;

    /**
     * 清算备付金_占净值比例%
     */
    @Column(name = "LIQUIDATION_RESERVE_FUND_PCT")
    private Double liquidationReserveFundPct;

    /**
     * 应收证券清算款_占净值比例%
     */
    @Column(name = "STOCK_CLEARING_PCT")
    private Double stockClearingPct;

    /**
     * 其他流动性资产_占净值比例%
     */
    @Column(name = "OTHER_LIQUIDITY_ASSETS_PCT")
    private Double otherLiquidityAssetsPct;

    /**
     * 固定收益类资产_占净值比例%
     */
    @Column(name = "FIXED_INCOME_ASSETS_PCT")
    private Double fixedIncomeAssetsPct;

    /**
     * （其中）一年期以上定期存款、协议存款_占净值比例%
     */
    @Column(name = "ONE_YEAR_UP_FIXED_DEPOSIT_PCT")
    private Double oneYearUpFixedDepositPct;

    /**
     * 国债_占净值比例%
     */
    @Column(name = "NATIONAL_DEBT_PCT")
    private Double nationalDebtPct;

    /**
     * 金融债_占净值比例%
     */
    @Column(name = "FINANCIAL_DEBT_PCT")
    private Double financialDebtPct;

    /**
     * 企业（公司）债_占净值比例%
     */
    @Column(name = "CORPORATE_DEBT_PCT")
    private Double corporateDebtPct;

    /**
     * 短期融资券_占净值比例%
     */
    @Column(name = "SHORT_TERM_FINANCING_BOND_PCT")
    private Double shortTermFinancingBondPct;

    /**
     * 中期票据_占净值比例%
     */
    @Column(name = "MEDIUM_TERM_NOTE_PCT")
    private Double mediumTermNotePct;

    /**
     * 可转换债_占净值比例%
     */
    @Column(name = "CONVERTIBLE_DEBT_PCT")
    private Double convertibleDebtPct;

    /**
     * 债券基金_占净值比例%
     */
    @Column(name = "BOND_FUND_PCT")
    private Double bondFundPct;

    /**
     * 保险产品（万能保险、股票投资比例≤30%的投资连接保险）_占净值比例%
     */
    @Column(name = "INSURANCE_PRODUCTS_PCT")
    private Double insuranceProductsPct;

    /**
     * 商业银行理财产品_占净值比例%
     */
    @Column(name = "COMP_BANK_PRODUCTS_PCT")
    private Double compBankProductsPct;

    /**
     * 信托产品_占净值比例%
     */
    @Column(name = "TRUST_PRODUCTS_PCT")
    private Double trustProductsPct;

    /**
     * 特定资产管理计划_占净值比例%
     */
    @Column(name = "SPECIFIC_ASSET_PLAN_PCT")
    private Double specificAssetPlanPct;

    /**
     * 基础设施债权投资计划_占净值比例%
     */
    @Column(name = "INFRASTRUCTURE_DEBT_PLAN_PCT")
    private Double infrastructureDebtPlanPct;

    /**
     * 固定收益型养老金产品_占净值比例%
     */
    @Column(name = "FIXED_INCOME_PENSION_PCT")
    private Double fixedIncomePensionPct;

    /**
     * 混合型养老金产品_占净值比例%
     */
    @Column(name = "MIXED_PENSION_PCT")
    private Double mixedPensionPct;

    /**
     * 其他固定收益类资产_占净值比例%
     */
    @Column(name = "OTHER_FIXED_INCOME_PCT")
    private Double otherFixedIncomePct;

    /**
     * 权益类资产_占净值比例%
     */
    @Column(name = "EQUITY_ASSETS_PCT")
    private Double equityAssetsPct;

    /**
     * 股票_占净值比例%
     */
    @Column(name = "SHARES_PCT")
    private Double sharesPct;

    /**
     * 股票基金、混合基金_占净值比例%
     */
    @Column(name = "EQUITY_OR_HYBRID_FUNDS_PCT")
    private Double equityOrHybridFundsPct;

    /**
     * 投资连结保险产品（股票投资比例＞30%）_占净值比例%
     */
    @Column(name = "INVESTMENT_ADN_INSURANCE_PCT")
    private Double investmentAdnInsurancePct;

    /**
     * 权证（非直接投资）_占净值比例%
     */
    @Column(name = "WARRANT_PCT")
    private Double warrantPct;

    /**
     * 权益工具_占净值比例%
     */
    @Column(name = "EQUITY_INSTRUMENTS_PCT")
    private Double equityInstrumentsPct;

    /**
     * 股票型养老金产品_占净值比例%
     */
    @Column(name = "EQUITY_PENSION_PCT")
    private Double equityPensionPct;

    /**
     * 其他权益类资产_占净值比例%
     */
    @Column(name = "OTHER_EQUITY_ASSETS_PCT")
    private Double otherEquityAssetsPct;

    /**
     * 其他资产_占净值比例%
     */
    @Column(name = "OTHER_ASSETS_PCT")
    private Double otherAssetsPct;

    /**
     * 备注
     */
    @Column(name = "REMARKS")
    private String remarks;

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
     * 获取组合代码
     *
     * @return PROD_CD - 组合代码
     */
    public String getProdCd() {
        return prodCd;
    }

    /**
     * 设置组合代码
     *
     * @param prodCd 组合代码
     */
    public void setProdCd(String prodCd) {
        this.prodCd = prodCd;
    }

    /**
     * 获取组合名称
     *
     * @return PROD_NAME - 组合名称
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * 设置组合名称
     *
     * @param prodName 组合名称
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     * 获取组合类型
     *
     * @return PROD_TYPE - 组合类型
     */
    public String getProdType() {
        return prodType;
    }

    /**
     * 设置组合类型
     *
     * @param prodType 组合类型
     */
    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    /**
     * 获取组合类别
     *
     * @return PROD_CLASS - 组合类别
     */
    public String getProdClass() {
        return prodClass;
    }

    /**
     * 设置组合类别
     *
     * @param prodClass 组合类别
     */
    public void setProdClass(String prodClass) {
        this.prodClass = prodClass;
    }

    /**
     * 获取计划类型
     *
     * @return PLAN_TYPE - 计划类型
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * 设置计划类型
     *
     * @param planType 计划类型
     */
    public void setPlanType(String planType) {
        this.planType = planType;
    }

    /**
     * 获取受托人
     *
     * @return BE_ENTRUSTED - 受托人
     */
    public String getBeEntrusted() {
        return beEntrusted;
    }

    /**
     * 设置受托人
     *
     * @param beEntrusted 受托人
     */
    public void setBeEntrusted(String beEntrusted) {
        this.beEntrusted = beEntrusted;
    }

    /**
     * 获取托管人
     *
     * @return TRUSTEESHIP - 托管人
     */
    public String getTrusteeship() {
        return trusteeship;
    }

    /**
     * 设置托管人
     *
     * @param trusteeship 托管人
     */
    public void setTrusteeship(String trusteeship) {
        this.trusteeship = trusteeship;
    }

    /**
     * 获取起始运作日期
     *
     * @return START_DATE - 起始运作日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置起始运作日期
     *
     * @param startDate 起始运作日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取期末资产净值（万元）
     *
     * @return NET_ASSET_VALUE_END - 期末资产净值（万元）
     */
    public BigDecimal getNetAssetValueEnd() {
        return netAssetValueEnd;
    }

    /**
     * 设置期末资产净值（万元）
     *
     * @param netAssetValueEnd 期末资产净值（万元）
     */
    public void setNetAssetValueEnd(BigDecimal netAssetValueEnd) {
        this.netAssetValueEnd = netAssetValueEnd;
    }

    /**
     * 获取期末资产份额（份）
     *
     * @return FINAL_ASSET_SHARE - 期末资产份额（份）
     */
    public Integer getFinalAssetShare() {
        return finalAssetShare;
    }

    /**
     * 设置期末资产份额（份）
     *
     * @param finalAssetShare 期末资产份额（份）
     */
    public void setFinalAssetShare(Integer finalAssetShare) {
        this.finalAssetShare = finalAssetShare;
    }

    /**
     * 获取期末单位净值
     *
     * @return FINAL_UNIT_VALUE - 期末单位净值
     */
    public BigDecimal getFinalUnitValue() {
        return finalUnitValue;
    }

    /**
     * 设置期末单位净值
     *
     * @param finalUnitValue 期末单位净值
     */
    public void setFinalUnitValue(BigDecimal finalUnitValue) {
        this.finalUnitValue = finalUnitValue;
    }

    /**
     * 获取流动性资产_占净值比例%
     *
     * @return LIQUID_ASSETS_PCT - 流动性资产_占净值比例%
     */
    public Double getLiquidAssetsPct() {
        return liquidAssetsPct;
    }

    /**
     * 设置流动性资产_占净值比例%
     *
     * @param liquidAssetsPct 流动性资产_占净值比例%
     */
    public void setLiquidAssetsPct(Double liquidAssetsPct) {
        this.liquidAssetsPct = liquidAssetsPct;
    }

    /**
     * 获取银行活期存款_占净值比例%
     *
     * @return BANK_DEPOSIT_PCT - 银行活期存款_占净值比例%
     */
    public Double getBankDepositPct() {
        return bankDepositPct;
    }

    /**
     * 设置银行活期存款_占净值比例%
     *
     * @param bankDepositPct 银行活期存款_占净值比例%
     */
    public void setBankDepositPct(Double bankDepositPct) {
        this.bankDepositPct = bankDepositPct;
    }

    /**
     * 获取中央银行票据_占净值比例%
     *
     * @return CENTRAL_BANK_NOTE_PCT - 中央银行票据_占净值比例%
     */
    public Double getCentralBankNotePct() {
        return centralBankNotePct;
    }

    /**
     * 设置中央银行票据_占净值比例%
     *
     * @param centralBankNotePct 中央银行票据_占净值比例%
     */
    public void setCentralBankNotePct(Double centralBankNotePct) {
        this.centralBankNotePct = centralBankNotePct;
    }

    /**
     * 获取一年期以内（含一年）定期存款、协议存款_占净值比例%
     *
     * @return ONE_YEAR_FIXED_DEPOSIT_PCT - 一年期以内（含一年）定期存款、协议存款_占净值比例%
     */
    public Double getOneYearFixedDepositPct() {
        return oneYearFixedDepositPct;
    }

    /**
     * 设置一年期以内（含一年）定期存款、协议存款_占净值比例%
     *
     * @param oneYearFixedDepositPct 一年期以内（含一年）定期存款、协议存款_占净值比例%
     */
    public void setOneYearFixedDepositPct(Double oneYearFixedDepositPct) {
        this.oneYearFixedDepositPct = oneYearFixedDepositPct;
    }

    /**
     * 获取买入返售金融资产_占净值比例%
     *
     * @return BUY_BACK_PCT - 买入返售金融资产_占净值比例%
     */
    public Double getBuyBackPct() {
        return buyBackPct;
    }

    /**
     * 设置买入返售金融资产_占净值比例%
     *
     * @param buyBackPct 买入返售金融资产_占净值比例%
     */
    public void setBuyBackPct(Double buyBackPct) {
        this.buyBackPct = buyBackPct;
    }

    /**
     * 获取货币市场基金_占净值比例%
     *
     * @return MONEY_MARKET_FUND_PCT - 货币市场基金_占净值比例%
     */
    public Double getMoneyMarketFundPct() {
        return moneyMarketFundPct;
    }

    /**
     * 设置货币市场基金_占净值比例%
     *
     * @param moneyMarketFundPct 货币市场基金_占净值比例%
     */
    public void setMoneyMarketFundPct(Double moneyMarketFundPct) {
        this.moneyMarketFundPct = moneyMarketFundPct;
    }

    /**
     * 获取货币型养老金产品_占净值比例%
     *
     * @return MONETARY_PENSION_PRODUCTS_PCT - 货币型养老金产品_占净值比例%
     */
    public Double getMonetaryPensionProductsPct() {
        return monetaryPensionProductsPct;
    }

    /**
     * 设置货币型养老金产品_占净值比例%
     *
     * @param monetaryPensionProductsPct 货币型养老金产品_占净值比例%
     */
    public void setMonetaryPensionProductsPct(Double monetaryPensionProductsPct) {
        this.monetaryPensionProductsPct = monetaryPensionProductsPct;
    }

    /**
     * 获取清算备付金_占净值比例%
     *
     * @return LIQUIDATION_RESERVE_FUND_PCT - 清算备付金_占净值比例%
     */
    public Double getLiquidationReserveFundPct() {
        return liquidationReserveFundPct;
    }

    /**
     * 设置清算备付金_占净值比例%
     *
     * @param liquidationReserveFundPct 清算备付金_占净值比例%
     */
    public void setLiquidationReserveFundPct(Double liquidationReserveFundPct) {
        this.liquidationReserveFundPct = liquidationReserveFundPct;
    }

    /**
     * 获取应收证券清算款_占净值比例%
     *
     * @return STOCK_CLEARING_PCT - 应收证券清算款_占净值比例%
     */
    public Double getStockClearingPct() {
        return stockClearingPct;
    }

    /**
     * 设置应收证券清算款_占净值比例%
     *
     * @param stockClearingPct 应收证券清算款_占净值比例%
     */
    public void setStockClearingPct(Double stockClearingPct) {
        this.stockClearingPct = stockClearingPct;
    }

    /**
     * 获取其他流动性资产_占净值比例%
     *
     * @return OTHER_LIQUIDITY_ASSETS_PCT - 其他流动性资产_占净值比例%
     */
    public Double getOtherLiquidityAssetsPct() {
        return otherLiquidityAssetsPct;
    }

    /**
     * 设置其他流动性资产_占净值比例%
     *
     * @param otherLiquidityAssetsPct 其他流动性资产_占净值比例%
     */
    public void setOtherLiquidityAssetsPct(Double otherLiquidityAssetsPct) {
        this.otherLiquidityAssetsPct = otherLiquidityAssetsPct;
    }

    /**
     * 获取固定收益类资产_占净值比例%
     *
     * @return FIXED_INCOME_ASSETS_PCT - 固定收益类资产_占净值比例%
     */
    public Double getFixedIncomeAssetsPct() {
        return fixedIncomeAssetsPct;
    }

    /**
     * 设置固定收益类资产_占净值比例%
     *
     * @param fixedIncomeAssetsPct 固定收益类资产_占净值比例%
     */
    public void setFixedIncomeAssetsPct(Double fixedIncomeAssetsPct) {
        this.fixedIncomeAssetsPct = fixedIncomeAssetsPct;
    }

    /**
     * 获取（其中）一年期以上定期存款、协议存款_占净值比例%
     *
     * @return ONE_YEAR_UP_FIXED_DEPOSIT_PCT - （其中）一年期以上定期存款、协议存款_占净值比例%
     */
    public Double getOneYearUpFixedDepositPct() {
        return oneYearUpFixedDepositPct;
    }

    /**
     * 设置（其中）一年期以上定期存款、协议存款_占净值比例%
     *
     * @param oneYearUpFixedDepositPct （其中）一年期以上定期存款、协议存款_占净值比例%
     */
    public void setOneYearUpFixedDepositPct(Double oneYearUpFixedDepositPct) {
        this.oneYearUpFixedDepositPct = oneYearUpFixedDepositPct;
    }

    /**
     * 获取国债_占净值比例%
     *
     * @return NATIONAL_DEBT_PCT - 国债_占净值比例%
     */
    public Double getNationalDebtPct() {
        return nationalDebtPct;
    }

    /**
     * 设置国债_占净值比例%
     *
     * @param nationalDebtPct 国债_占净值比例%
     */
    public void setNationalDebtPct(Double nationalDebtPct) {
        this.nationalDebtPct = nationalDebtPct;
    }

    /**
     * 获取金融债_占净值比例%
     *
     * @return FINANCIAL_DEBT_PCT - 金融债_占净值比例%
     */
    public Double getFinancialDebtPct() {
        return financialDebtPct;
    }

    /**
     * 设置金融债_占净值比例%
     *
     * @param financialDebtPct 金融债_占净值比例%
     */
    public void setFinancialDebtPct(Double financialDebtPct) {
        this.financialDebtPct = financialDebtPct;
    }

    /**
     * 获取企业（公司）债_占净值比例%
     *
     * @return CORPORATE_DEBT_PCT - 企业（公司）债_占净值比例%
     */
    public Double getCorporateDebtPct() {
        return corporateDebtPct;
    }

    /**
     * 设置企业（公司）债_占净值比例%
     *
     * @param corporateDebtPct 企业（公司）债_占净值比例%
     */
    public void setCorporateDebtPct(Double corporateDebtPct) {
        this.corporateDebtPct = corporateDebtPct;
    }

    /**
     * 获取短期融资券_占净值比例%
     *
     * @return SHORT_TERM_FINANCING_BOND_PCT - 短期融资券_占净值比例%
     */
    public Double getShortTermFinancingBondPct() {
        return shortTermFinancingBondPct;
    }

    /**
     * 设置短期融资券_占净值比例%
     *
     * @param shortTermFinancingBondPct 短期融资券_占净值比例%
     */
    public void setShortTermFinancingBondPct(Double shortTermFinancingBondPct) {
        this.shortTermFinancingBondPct = shortTermFinancingBondPct;
    }

    /**
     * 获取中期票据_占净值比例%
     *
     * @return MEDIUM_TERM_NOTE_PCT - 中期票据_占净值比例%
     */
    public Double getMediumTermNotePct() {
        return mediumTermNotePct;
    }

    /**
     * 设置中期票据_占净值比例%
     *
     * @param mediumTermNotePct 中期票据_占净值比例%
     */
    public void setMediumTermNotePct(Double mediumTermNotePct) {
        this.mediumTermNotePct = mediumTermNotePct;
    }

    /**
     * 获取可转换债_占净值比例%
     *
     * @return CONVERTIBLE_DEBT_PCT - 可转换债_占净值比例%
     */
    public Double getConvertibleDebtPct() {
        return convertibleDebtPct;
    }

    /**
     * 设置可转换债_占净值比例%
     *
     * @param convertibleDebtPct 可转换债_占净值比例%
     */
    public void setConvertibleDebtPct(Double convertibleDebtPct) {
        this.convertibleDebtPct = convertibleDebtPct;
    }

    /**
     * 获取债券基金_占净值比例%
     *
     * @return BOND_FUND_PCT - 债券基金_占净值比例%
     */
    public Double getBondFundPct() {
        return bondFundPct;
    }

    /**
     * 设置债券基金_占净值比例%
     *
     * @param bondFundPct 债券基金_占净值比例%
     */
    public void setBondFundPct(Double bondFundPct) {
        this.bondFundPct = bondFundPct;
    }

    /**
     * 获取保险产品（万能保险、股票投资比例≤30%的投资连接保险）_占净值比例%
     *
     * @return INSURANCE_PRODUCTS_PCT - 保险产品（万能保险、股票投资比例≤30%的投资连接保险）_占净值比例%
     */
    public Double getInsuranceProductsPct() {
        return insuranceProductsPct;
    }

    /**
     * 设置保险产品（万能保险、股票投资比例≤30%的投资连接保险）_占净值比例%
     *
     * @param insuranceProductsPct 保险产品（万能保险、股票投资比例≤30%的投资连接保险）_占净值比例%
     */
    public void setInsuranceProductsPct(Double insuranceProductsPct) {
        this.insuranceProductsPct = insuranceProductsPct;
    }

    /**
     * 获取商业银行理财产品_占净值比例%
     *
     * @return COMP_BANK_PRODUCTS_PCT - 商业银行理财产品_占净值比例%
     */
    public Double getCompBankProductsPct() {
        return compBankProductsPct;
    }

    /**
     * 设置商业银行理财产品_占净值比例%
     *
     * @param compBankProductsPct 商业银行理财产品_占净值比例%
     */
    public void setCompBankProductsPct(Double compBankProductsPct) {
        this.compBankProductsPct = compBankProductsPct;
    }

    /**
     * 获取信托产品_占净值比例%
     *
     * @return TRUST_PRODUCTS_PCT - 信托产品_占净值比例%
     */
    public Double getTrustProductsPct() {
        return trustProductsPct;
    }

    /**
     * 设置信托产品_占净值比例%
     *
     * @param trustProductsPct 信托产品_占净值比例%
     */
    public void setTrustProductsPct(Double trustProductsPct) {
        this.trustProductsPct = trustProductsPct;
    }

    /**
     * 获取特定资产管理计划_占净值比例%
     *
     * @return SPECIFIC_ASSET_PLAN_PCT - 特定资产管理计划_占净值比例%
     */
    public Double getSpecificAssetPlanPct() {
        return specificAssetPlanPct;
    }

    /**
     * 设置特定资产管理计划_占净值比例%
     *
     * @param specificAssetPlanPct 特定资产管理计划_占净值比例%
     */
    public void setSpecificAssetPlanPct(Double specificAssetPlanPct) {
        this.specificAssetPlanPct = specificAssetPlanPct;
    }

    /**
     * 获取基础设施债权投资计划_占净值比例%
     *
     * @return INFRASTRUCTURE_DEBT_PLAN_PCT - 基础设施债权投资计划_占净值比例%
     */
    public Double getInfrastructureDebtPlanPct() {
        return infrastructureDebtPlanPct;
    }

    /**
     * 设置基础设施债权投资计划_占净值比例%
     *
     * @param infrastructureDebtPlanPct 基础设施债权投资计划_占净值比例%
     */
    public void setInfrastructureDebtPlanPct(Double infrastructureDebtPlanPct) {
        this.infrastructureDebtPlanPct = infrastructureDebtPlanPct;
    }

    /**
     * 获取固定收益型养老金产品_占净值比例%
     *
     * @return FIXED_INCOME_PENSION_PCT - 固定收益型养老金产品_占净值比例%
     */
    public Double getFixedIncomePensionPct() {
        return fixedIncomePensionPct;
    }

    /**
     * 设置固定收益型养老金产品_占净值比例%
     *
     * @param fixedIncomePensionPct 固定收益型养老金产品_占净值比例%
     */
    public void setFixedIncomePensionPct(Double fixedIncomePensionPct) {
        this.fixedIncomePensionPct = fixedIncomePensionPct;
    }

    /**
     * 获取混合型养老金产品_占净值比例%
     *
     * @return MIXED_PENSION_PCT - 混合型养老金产品_占净值比例%
     */
    public Double getMixedPensionPct() {
        return mixedPensionPct;
    }

    /**
     * 设置混合型养老金产品_占净值比例%
     *
     * @param mixedPensionPct 混合型养老金产品_占净值比例%
     */
    public void setMixedPensionPct(Double mixedPensionPct) {
        this.mixedPensionPct = mixedPensionPct;
    }

    /**
     * 获取其他固定收益类资产_占净值比例%
     *
     * @return OTHER_FIXED_INCOME_PCT - 其他固定收益类资产_占净值比例%
     */
    public Double getOtherFixedIncomePct() {
        return otherFixedIncomePct;
    }

    /**
     * 设置其他固定收益类资产_占净值比例%
     *
     * @param otherFixedIncomePct 其他固定收益类资产_占净值比例%
     */
    public void setOtherFixedIncomePct(Double otherFixedIncomePct) {
        this.otherFixedIncomePct = otherFixedIncomePct;
    }

    /**
     * 获取权益类资产_占净值比例%
     *
     * @return EQUITY_ASSETS_PCT - 权益类资产_占净值比例%
     */
    public Double getEquityAssetsPct() {
        return equityAssetsPct;
    }

    /**
     * 设置权益类资产_占净值比例%
     *
     * @param equityAssetsPct 权益类资产_占净值比例%
     */
    public void setEquityAssetsPct(Double equityAssetsPct) {
        this.equityAssetsPct = equityAssetsPct;
    }

    /**
     * 获取股票_占净值比例%
     *
     * @return SHARES_PCT - 股票_占净值比例%
     */
    public Double getSharesPct() {
        return sharesPct;
    }

    /**
     * 设置股票_占净值比例%
     *
     * @param sharesPct 股票_占净值比例%
     */
    public void setSharesPct(Double sharesPct) {
        this.sharesPct = sharesPct;
    }

    /**
     * 获取股票基金、混合基金_占净值比例%
     *
     * @return EQUITY_OR_HYBRID_FUNDS_PCT - 股票基金、混合基金_占净值比例%
     */
    public Double getEquityOrHybridFundsPct() {
        return equityOrHybridFundsPct;
    }

    /**
     * 设置股票基金、混合基金_占净值比例%
     *
     * @param equityOrHybridFundsPct 股票基金、混合基金_占净值比例%
     */
    public void setEquityOrHybridFundsPct(Double equityOrHybridFundsPct) {
        this.equityOrHybridFundsPct = equityOrHybridFundsPct;
    }

    /**
     * 获取投资连结保险产品（股票投资比例＞30%）_占净值比例%
     *
     * @return INVESTMENT_ADN_INSURANCE_PCT - 投资连结保险产品（股票投资比例＞30%）_占净值比例%
     */
    public Double getInvestmentAdnInsurancePct() {
        return investmentAdnInsurancePct;
    }

    /**
     * 设置投资连结保险产品（股票投资比例＞30%）_占净值比例%
     *
     * @param investmentAdnInsurancePct 投资连结保险产品（股票投资比例＞30%）_占净值比例%
     */
    public void setInvestmentAdnInsurancePct(Double investmentAdnInsurancePct) {
        this.investmentAdnInsurancePct = investmentAdnInsurancePct;
    }

    /**
     * 获取权证（非直接投资）_占净值比例%
     *
     * @return WARRANT_PCT - 权证（非直接投资）_占净值比例%
     */
    public Double getWarrantPct() {
        return warrantPct;
    }

    /**
     * 设置权证（非直接投资）_占净值比例%
     *
     * @param warrantPct 权证（非直接投资）_占净值比例%
     */
    public void setWarrantPct(Double warrantPct) {
        this.warrantPct = warrantPct;
    }

    /**
     * 获取权益工具_占净值比例%
     *
     * @return EQUITY_INSTRUMENTS_PCT - 权益工具_占净值比例%
     */
    public Double getEquityInstrumentsPct() {
        return equityInstrumentsPct;
    }

    /**
     * 设置权益工具_占净值比例%
     *
     * @param equityInstrumentsPct 权益工具_占净值比例%
     */
    public void setEquityInstrumentsPct(Double equityInstrumentsPct) {
        this.equityInstrumentsPct = equityInstrumentsPct;
    }

    /**
     * 获取股票型养老金产品_占净值比例%
     *
     * @return EQUITY_PENSION_PCT - 股票型养老金产品_占净值比例%
     */
    public Double getEquityPensionPct() {
        return equityPensionPct;
    }

    /**
     * 设置股票型养老金产品_占净值比例%
     *
     * @param equityPensionPct 股票型养老金产品_占净值比例%
     */
    public void setEquityPensionPct(Double equityPensionPct) {
        this.equityPensionPct = equityPensionPct;
    }

    /**
     * 获取其他权益类资产_占净值比例%
     *
     * @return OTHER_EQUITY_ASSETS_PCT - 其他权益类资产_占净值比例%
     */
    public Double getOtherEquityAssetsPct() {
        return otherEquityAssetsPct;
    }

    /**
     * 设置其他权益类资产_占净值比例%
     *
     * @param otherEquityAssetsPct 其他权益类资产_占净值比例%
     */
    public void setOtherEquityAssetsPct(Double otherEquityAssetsPct) {
        this.otherEquityAssetsPct = otherEquityAssetsPct;
    }

    /**
     * 获取其他资产_占净值比例%
     *
     * @return OTHER_ASSETS_PCT - 其他资产_占净值比例%
     */
    public Double getOtherAssetsPct() {
        return otherAssetsPct;
    }

    /**
     * 设置其他资产_占净值比例%
     *
     * @param otherAssetsPct 其他资产_占净值比例%
     */
    public void setOtherAssetsPct(Double otherAssetsPct) {
        this.otherAssetsPct = otherAssetsPct;
    }

    /**
     * 获取备注
     *
     * @return REMARKS - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}