package com.guige.parser.entity;

import com.guige.base.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Table(name = "t_comp_fund_report")
public class CompFundReport  extends BaseEntity{
    @Id
    @Column(name = "UUID")
    private String uuid;

    /**
     * 封面标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 公司名称
     */
    @Column(name = "COMP_NAME")
    private String compName;

    /**
     * 日期
     */
    @Column(name = "DATE")
    private String date;

    /**
     * 创建人
     */
    @Column(name = "CREATE_USER")
    private String createUser;

    /**
     * 创建日期
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改人
     */
    @Column(name = "UPDATE_USER")
    private String updateUser;

    /**
     * 修改日期
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 是否删除
     */
    @Column(name = "DELETE_FLAG")
    private Boolean deleteFlag;

    /**
     * 文件名称
     */
    @Column(name = "FILENAME")
    private String filename;

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
     * 获取封面标题
     *
     * @return TITLE - 封面标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置封面标题
     *
     * @param title 封面标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取公司名称
     *
     * @return COMP_NAME - 公司名称
     */
    public String getCompName() {
        return compName;
    }

    /**
     * 设置公司名称
     *
     * @param compName 公司名称
     */
    public void setCompName(String compName) {
        this.compName = compName;
    }

    /**
     * 获取日期
     *
     * @return DATE - 日期
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置日期
     *
     * @param date 日期
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 获取创建人
     *
     * @return CREATE_USER - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_TIME - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人
     *
     * @return UPDATE_USER - 修改人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改人
     *
     * @param updateUser 修改人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取修改日期
     *
     * @return UPDATE_TIME - 修改日期
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改日期
     *
     * @param updateTime 修改日期
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除
     *
     * @return DELETE_FLAG - 是否删除
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置是否删除
     *
     * @param deleteFlag 是否删除
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 获取文件名称
     *
     * @return FILENAME - 文件名称
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置文件名称
     *
     * @param filename 文件名称
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }
}