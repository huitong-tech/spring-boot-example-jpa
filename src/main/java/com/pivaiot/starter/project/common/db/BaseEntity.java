package com.pivaiot.starter.project.common.db;

import com.pivaiot.starter.project.common.data.ToData;
import com.pivaiot.starter.project.common.util.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;


/**
 * 所有数据库表类的基类.
 *
 * 每个表实体有三个必备字段
 * - id
 * - created_time
 * - updated_time
 */
@Data
@EqualsAndHashCode(callSuper = false)
@MappedSuperclass
public abstract class BaseEntity<T> implements ToData<T>, Serializable {

    protected abstract Long generateId();

    protected abstract Long getId();

    protected abstract void setId(Long id);

    @Column
    private Date createdTime;

    @Column
    private Date updatedTime;

    @PrePersist
    @PreUpdate
    public void updateTime() {
        Date now = new Date();
        if (this.getCreatedTime() == null) {
            this.setCreatedTime(now);
        }

        this.setUpdatedTime(now);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T toData() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        Class<T> dtoClass = (Class) params[0];
        try {
            T data = dtoClass.newInstance();
            BeanUtil.copyProperties(this, data);
            return  data;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
