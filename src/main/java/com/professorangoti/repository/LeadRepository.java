package com.professorangoti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.professorangoti.domain.Lead;

@Repository
public interface LeadRepository extends CrudRepository<Lead, Integer> {
}
