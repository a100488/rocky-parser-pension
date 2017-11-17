package com.guige.parser.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_comp_fund_report_sheet")
public class CompFundReportSheet {
    @Id
    @Column(name = "UUID")
    private String uuid;

    /**
     * 报告ID
     */
    @Column(name = "REPORT_UUID")
    private String reportUuid;

    /**
     * 填报单位
     */
    @Column(name = "FILLING_UNIT")
    private String fillingUnit;

    /**
     * 单位负责人
     */
    @Column(name = "HEAD_UNIT")
    private String headUnit;

    /**
     * 填表人
     */
    @Column(name = "FORM_HOLDER")
    private String formHolder;

    /**
     * 报表报出时间
     */
    @Column(name = "REPORT_DATE")
    private Date reportDate;

    /**
     * 报表截止时间
     */
    @Column(name = "REPORT_DEADLINE")
    private Date reportDeadline;

    /**
     * 报告类型受托人1
     */
    @Column(name = "REPORT_TYPE")
    private String reportType;

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
     * 获取报告ID
     *
     * @return REPORT_UUID - 报告ID
     */
    public String getReportUuid() {
        return reportUuid;
    }

    /**
     * 设置报告ID
     *
     * @param reportUuid 报告ID
     */
    public void setReportUuid(String reportUuid) {
        this.reportUuid = reportUuid;
    }

    /**
     * 获取填报单位
     *
     * @return FILLING_UNIT - 填报单位
     */
    public String getFillingUnit() {
        return fillingUnit;
    }

    /**
     * 设置填报单位
     *
     * @param fillingUnit 填报单位
     */
    public void setFillingUnit(String fillingUnit) {
        this.fillingUnit = fillingUnit;
    }

    /**
     * 获取单位负责人
     *
     * @return HEAD_UNIT - 单位负责人
     */
    public String getHeadUnit() {
        return headUnit;
    }

    /**
     * 设置单位负责人
     *
     * @param headUnit 单位负责人
     */
    public void setHeadUnit(String headUnit) {
        this.headUnit = headUnit;
    }

    /**
     * 获取填表人
     *
     * @return FORM_HOLDER - 填表人
     */
    public String getFormHolder() {
        return formHolder;
    }

    /**
     * 设置填表人
     *
     * @param formHolder 填表人
     */
    public void setFormHolder(String formHolder) {
        this.formHolder = formHolder;
    }

    /**
     * 获取报表报出时间
     *
     * @return REPORT_DATE - 报表报出时间
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * 设置报表报出时间
     *
     * @param reportDate 报表报出时间
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * 获取报表截止时间
     *
     * @return REPORT_DEADLINE - 报表截止时间
     */
    public Date getReportDeadline() {
        return reportDeadline;
    }

    /**
     * 设置报表截止时间
     *
     * @param reportDeadline 报表截止时间
     */
    public void setReportDeadline(Date reportDeadline) {
        this.reportDeadline = reportDeadline;
    }

    /**
     * 获取报告类型受托人1
     *
     * @return REPORT_TYPE - 报告类型受托人1
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * 设置报告类型受托人1
     *
     * @param reportType 报告类型受托人1
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
}