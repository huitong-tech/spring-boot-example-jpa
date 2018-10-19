package com.pivaiot.starter.project.service.hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingEntity, Long> {

}
