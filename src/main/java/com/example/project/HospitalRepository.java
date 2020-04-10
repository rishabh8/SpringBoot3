package com.example.project;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HospitalRepository extends CrudRepository<Hospital, Integer>{
	List<Hospital> findById(int hospitalID);
}
