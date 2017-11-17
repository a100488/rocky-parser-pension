package com.guige.account.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_role_mod")
public class RoleMod {
    @Id
    @Column(name = "ROLE_UUID")
    private String roleUuid;

    @Id
    @Column(name = "COMP_UUID")
    private String compUuid;

    @Id
    @Column(name = "MODULE_UUID")
    private String moduleUuid;

    @Column(name = "ENABLE")
    private Boolean enable;

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
     * @return ROLE_UUID
     */
    public String getRoleUuid() {
        return roleUuid;
    }

    /**
     * @param roleUuid
     */
    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid;
    }

    /**
     * @return COMP_UUID
     */
    public String getCompUuid() {
        return compUuid;
    }

    /**
     * @param compUuid
     */
    public void setCompUuid(String compUuid) {
        this.compUuid = compUuid;
    }

    /**
     * @return MODULE_UUID
     */
    public String getModuleUuid() {
        return moduleUuid;
    }

    /**
     * @param moduleUuid
     */
    public void setModuleUuid(String moduleUuid) {
        this.moduleUuid = moduleUuid;
    }

    /**
     * @return ENABLE
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
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