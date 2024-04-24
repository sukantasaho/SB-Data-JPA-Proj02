package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.main.entity.Doctor;
import com.main.repository.DoctorRepository;

@Service("docService")
public class DoctorServiceImp implements IDoctorService 
{
	
	 @Autowired
     private DoctorRepository repo;
	 
	@Override
	public Page<Doctor> getAllDoctorsByPageAndSortingDesc(int pageNo, int pageSize, boolean sorting, String... prop)
	{
		    Sort sort = Sort.by(sorting?Direction.DESC:Direction.ASC, prop);
		    Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		    
		return repo.findAll(pageable);
	}

	@Override
	public List<Doctor> getAllDoctorsByDescOrder(boolean sorting, String... prop) 
	{
		Sort sort = Sort.by(sorting?Direction.DESC:Direction.ASC, prop);
		
		return (List<Doctor>) repo.findAll(sort);
	}

}
