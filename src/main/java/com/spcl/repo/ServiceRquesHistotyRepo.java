package com.spcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spcl.entity.ServiceRequestHistory;

@Repository
public interface ServiceRquesHistotyRepo extends JpaRepository<ServiceRequestHistory, Long> {

}
