package com.main.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.main.entity.Doctor;

public interface DoctorRepository extends PagingAndSortingRepository<Doctor, Integer> 
{

}
