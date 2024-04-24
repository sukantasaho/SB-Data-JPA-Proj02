package com.main.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.main.entity.Doctor;

public interface IDoctorService 
{
      public Page<Doctor> getAllDoctorsByPageAndSortingDesc(int pageNo, int pageSize, boolean sorting, String... prop);
      public List<Doctor> getAllDoctorsByDescOrder(boolean sorting, String...prop);
}
