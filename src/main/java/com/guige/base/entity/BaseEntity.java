package com.guige.base.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.guige.base.util.StringUtils;
import com.guige.base.util.UuidUtils;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class BaseEntity implements  Serializable {
    private static final long serialVersionUID = 858294042419172707L;
    @Id
    @Column(
        name = "UUID"
    )
    private String uuid;
    @JsonIgnore
    @Column(
        name = "INSERT_USER"
    )
    private String insertUser;
    @JsonIgnore
    @Column(
        name = "INSERT_TIME"
    )
    private Date insertTime;
    @JsonIgnore
    @Column(
        name = "UPDATE_USER"
    )
    private String updateUser;
    @JsonIgnore
    @Column(
        name = "UPDATE_TIME"
    )
    private Date updateTime;
    @JsonIgnore
    @Column(
        name = "DELETE_FLAG"
    )
    private Boolean deleteFlag;

    public BaseEntity buildForInsert() {
        if(StringUtils.isBlank(this.uuid)) {
            this.setUuid(UuidUtils.base58Uuid());
        }

       /* if(Objects.isNull(this.insertUser)) {
            this.setInsertUser(this.currentUserId());
        }*/

        if(Objects.isNull(this.insertTime)) {
            this.setInsertTime(new Date());
        }

        if(Objects.isNull(this.updateTime)) {
            this.setUpdateTime(new Date());
        }

        if(this.deleteFlag == null) {
            this.setDeleteFlag(Boolean.valueOf(false));
        }

        return this;
    }

    public BaseEntity buildForUpdate() {
        //this.setUpdateUser(this.currentUserId());
        this.setUpdateTime(new Date());
        return this;
    }

    public BaseEntity buildForDel() {
        //this.setUpdateUser(this.currentUserId());
        this.setUpdateTime(new Date());
        this.setDeleteFlag(Boolean.valueOf(true));
        return this;
    }

    public void build(Object vo) {
        BeanUtils.copyProperties(vo, this);
    }

    public BaseEntity() {
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getInsertUser() {
        return this.insertUser;
    }

    public Date getInsertTime() {
        return this.insertTime;
    }

    public String getUpdateUser() {
        return this.updateUser;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public boolean equals(Object o) {
        if(o == this) {
            return true;
        } else if(!(o instanceof BaseEntity)) {
            return false;
        } else {
            BaseEntity other = (BaseEntity)o;
            if(!other.canEqual(this)) {
                return false;
            } else {
                Object this$uuid = this.getUuid();
                Object other$uuid = other.getUuid();
                if(this$uuid == null) {
                    if(other$uuid != null) {
                        return false;
                    }
                } else if(!this$uuid.equals(other$uuid)) {
                    return false;
                }

                Object this$insertUser = this.getInsertUser();
                Object other$insertUser = other.getInsertUser();
                if(this$insertUser == null) {
                    if(other$insertUser != null) {
                        return false;
                    }
                } else if(!this$insertUser.equals(other$insertUser)) {
                    return false;
                }

                Object this$insertTime = this.getInsertTime();
                Object other$insertTime = other.getInsertTime();
                if(this$insertTime == null) {
                    if(other$insertTime != null) {
                        return false;
                    }
                } else if(!this$insertTime.equals(other$insertTime)) {
                    return false;
                }

                label62: {
                    Object this$updateUser = this.getUpdateUser();
                    Object other$updateUser = other.getUpdateUser();
                    if(this$updateUser == null) {
                        if(other$updateUser == null) {
                            break label62;
                        }
                    } else if(this$updateUser.equals(other$updateUser)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$updateTime = this.getUpdateTime();
                    Object other$updateTime = other.getUpdateTime();
                    if(this$updateTime == null) {
                        if(other$updateTime == null) {
                            break label55;
                        }
                    } else if(this$updateTime.equals(other$updateTime)) {
                        break label55;
                    }

                    return false;
                }

                Object this$deleteFlag = this.getDeleteFlag();
                Object other$deleteFlag = other.getDeleteFlag();
                if(this$deleteFlag == null) {
                    if(other$deleteFlag != null) {
                        return false;
                    }
                } else if(!this$deleteFlag.equals(other$deleteFlag)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseEntity;
    }

    public String toString() {
        return "BaseEntity(uuid=" + this.getUuid() + ", insertUser=" + this.getInsertUser() + ", insertTime=" + this.getInsertTime() + ", updateUser=" + this.getUpdateUser() + ", updateTime=" + this.getUpdateTime() + ", deleteFlag=" + this.getDeleteFlag() + ")";
    }
}