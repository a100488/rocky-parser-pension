package com.guige.account.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_module")
public class Module {
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Column(name = "SERVICE_CD")
    private String serviceCd;

    @Column(name = "MODULE_CD")
    private String moduleCd;

    @Column(name = "MODULE_NAME")
    private String moduleName;

    @Column(name = "MODULE_URL")
    private String moduleUrl;

    @Column(name = "PARENT_UUID")
    private String parentUuid;

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
     * @return SERVICE_CD
     */
    public String getServiceCd() {
        return serviceCd;
    }

    /**
     * @param serviceCd
     */
    public void setServiceCd(String serviceCd) {
        this.serviceCd = serviceCd;
    }

    /**
     * @return MODULE_CD
     */
    public String getModuleCd() {
        return moduleCd;
    }

    /**
     * @param moduleCd
     */
    public void setModuleCd(String moduleCd) {
        this.moduleCd = moduleCd;
    }

    /**
     * @return MODULE_NAME
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * @param moduleName
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * @return MODULE_URL
     */
    public String getModuleUrl() {
        return moduleUrl;
    }

    /**
     * @param moduleUrl
     */
    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    /**
     * @return PARENT_UUID
     */
    public String getParentUuid() {
        return parentUuid;
    }

    /**
     * @param parentUuid
     */
    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
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