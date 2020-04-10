package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	public List<Hospital> getAllHospitals() {
		return StreamSupport.stream(hospitalRepository
							.findAll()
							.spliterator(), false)
							.collect(Collectors.toList());
	}

	public Hospital getHospital(int id) {
		return hospitalRepository.findById(id).get(0);
	}

	public void addHospitals(Hospital hospital) {
		hospitalRepository.save(hospital);
	}

	public void updateHospitals(Hospital hospital) {
		hospitalRepository.save(hospital);
	}

	public void deleteHospitals(Hospital hospital) {
		hospitalRepository.delete(hospital.getId());
	}
}
