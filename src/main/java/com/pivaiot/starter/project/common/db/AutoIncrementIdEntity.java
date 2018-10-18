package com.pivaiot.starter.project.common.db;


import javax.persistence.*;

@MappedSuperclass
public abstract class AutoIncrementIdEntity<T> extends BaseEntity<T> {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    protected Long generateId() {
        throw new IllegalArgumentException("Use DB ID Autoincrement. Not implement yet!");
    }
}
