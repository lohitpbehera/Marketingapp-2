package com.marketing2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing2.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
