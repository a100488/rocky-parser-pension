package com.guige.account.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_role")
public class Role {
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Column(name = "COMP_UUID")
    private String compUuid;

    @Column(name = "ROLE_NAME")
    private String roleName;

    /**
     * 0-系统运维,2-集团管理员,4-公司管理员,16-普通角色。低级的角色不能给他人设置高等级的角色。
     */
    @Column(name = "ROLE_LEVEL")
    private Short roleLevel;

    @Column(name = "DESCRIPTION")
    private String description;

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
     * @return ROLE_NAME
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取0-系统运维,2-集团管理员,4-公司管理员,16-普通角色。低级的角色不能给他人设置高等级的角色。
     *
     * @return ROLE_LEVEL - 0-系统运维,2-集团管理员,4-公司管理员,16-普通角色。低级的角色不能给他人设置高等级的角色。
     */
    public Short getRoleLevel() {
        return roleLevel;
    }

    /**
     * 设置0-系统运维,2-集团管理员,4-公司管理员,16-普通角色。低级的角色不能给他人设置高等级的角色。
     *
     * @param roleLevel 0-系统运维,2-集团管理员,4-公司管理员,16-普通角色。低级的角色不能给他人设置高等级的角色。
     */
    public void setRoleLevel(Short roleLevel) {
        this.roleLevel = roleLevel;
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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