package com.guige.base.service;


import com.guige.base.entity.BaseEntity;
import com.guige.base.exception.BadRequestException;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T extends BaseEntity, ID extends Serializable> {

    Mapper<T> getBaseMapper();

    default T insert(T record) {
        record.buildForInsert();

        int re = this.getBaseMapper().insert(record);

        if (re == 0) {
            throw new BadRequestException("error.0003", this);
        }
        return record;
    }

    default T selectByPrimaryKey(ID id) {
        if (id == null) {
            return null;
        }
        T record = this.getBaseMapper().selectByPrimaryKey(id);

        return record;
    }

    default List<T> select(T record) {

        List<T> records = this.getBaseMapper().select(record);

        return records;
    }



    default T updateByPrimaryKey(T record) {
        record.buildForUpdate();

        int re = this.getBaseMapper().updateByPrimaryKey(record);

        if (re == 0) {
            throw new BadRequestException("error.0000", this);
        }
        return record;
    }

    default void deleteByPrimaryKey(ID id) {
        this.getBaseMapper().deleteByPrimaryKey(id);
    }

    default T insertSelective(T record) {
        record.buildForInsert();

        int re = this.getBaseMapper().insertSelective(record);

        if (re == 0) {
            throw new BadRequestException("error.0003", this);
        }
        return record;
    }

    default T updateByPrimaryKeySelective(T record) {
        record.buildForUpdate();

        int re = this.getBaseMapper().updateByPrimaryKeySelective(record);

        if (re == 0) {
            throw new BadRequestException("error.0000", this);
        }
        return record;
    }
}