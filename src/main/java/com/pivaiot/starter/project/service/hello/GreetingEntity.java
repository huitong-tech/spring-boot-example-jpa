package com.pivaiot.starter.project.service.hello;

import com.pivaiot.common.db.AutoIncrementIdEntity;
import com.pivaiot.starter.project.data.hello.Greeting;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "greeting")
@Data
@EqualsAndHashCode(callSuper = true)
public class GreetingEntity extends AutoIncrementIdEntity<Greeting> {

    @Column
    private String says;

}
