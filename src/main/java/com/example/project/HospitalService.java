package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepository hospitalRepository;


public List<Hospital> getAllHospitals(){
	return null;
}

public Hospital getHospital(int id){
	return null;
}

public void addHospital(Hospital hospital){

}

public void updateHospital(Hospital hospital){

}

public void deleteHospital(Hospital hospital) {

}
}
