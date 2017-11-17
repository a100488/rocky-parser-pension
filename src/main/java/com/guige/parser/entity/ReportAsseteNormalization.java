package com.guige.parser.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_report_assete_normalization")
public class ReportAsseteNormalization {
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
     * 起始运作日期
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 净值归一发生日期
     */
    @Column(name = "HAPPEN_DATE")
    private Date happenDate;

    /**
     * 当天单位净值（元）
     */
    @Column(name = "SAME_DAY_MONEY")
    private Double sameDayMoney;

    /**
     * 当天总份额（份）
     */
    @Column(name = "SAME_DAY_TOTAL_SHARE")
    private String sameDayTotalShare;

    /**
     *  前一天总份额（份）
     */
    @Column(name = "PRE_TOTAL_SHARE")
    private Integer preTotalShare;

    /**
     *  前一天单位净值（元）
     */
    @Column(name = "PRE_DAY_MONEY")
    private Double preDayMoney;

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
     * 获取净值归一发生日期
     *
     * @return HAPPEN_DATE - 净值归一发生日期
     */
    public Date getHappenDate() {
        return happenDate;
    }

    /**
     * 设置净值归一发生日期
     *
     * @param happenDate 净值归一发生日期
     */
    public void setHappenDate(Date happenDate) {
        this.happenDate = happenDate;
    }

    /**
     * 获取当天单位净值（元）
     *
     * @return SAME_DAY_MONEY - 当天单位净值（元）
     */
    public Double getSameDayMoney() {
        return sameDayMoney;
    }

    /**
     * 设置当天单位净值（元）
     *
     * @param sameDayMoney 当天单位净值（元）
     */
    public void setSameDayMoney(Double sameDayMoney) {
        this.sameDayMoney = sameDayMoney;
    }

    /**
     * 获取当天总份额（份）
     *
     * @return SAME_DAY_TOTAL_SHARE - 当天总份额（份）
     */
    public String getSameDayTotalShare() {
        return sameDayTotalShare;
    }

    /**
     * 设置当天总份额（份）
     *
     * @param sameDayTotalShare 当天总份额（份）
     */
    public void setSameDayTotalShare(String sameDayTotalShare) {
        this.sameDayTotalShare = sameDayTotalShare;
    }

    /**
     * 获取 前一天总份额（份）
     *
     * @return PRE_TOTAL_SHARE -  前一天总份额（份）
     */
    public Integer getPreTotalShare() {
        return preTotalShare;
    }

    /**
     * 设置 前一天总份额（份）
     *
     * @param preTotalShare  前一天总份额（份）
     */
    public void setPreTotalShare(Integer preTotalShare) {
        this.preTotalShare = preTotalShare;
    }

    /**
     * 获取 前一天单位净值（元）
     *
     * @return PRE_DAY_MONEY -  前一天单位净值（元）
     */
    public Double getPreDayMoney() {
        return preDayMoney;
    }

    /**
     * 设置 前一天单位净值（元）
     *
     * @param preDayMoney  前一天单位净值（元）
     */
    public void setPreDayMoney(Double preDayMoney) {
        this.preDayMoney = preDayMoney;
    }
}