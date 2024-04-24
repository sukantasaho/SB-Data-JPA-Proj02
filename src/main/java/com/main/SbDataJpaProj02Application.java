package com.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.main.entity.Doctor;
import com.main.services.IDoctorService;

@SpringBootApplication
public class SbDataJpaProj02Application 
{

	public static void main(String[] args) 
	{
		   ApplicationContext ctx = SpringApplication.run(SbDataJpaProj02Application.class, args);
		   IDoctorService service = ctx.getBean("docService", IDoctorService.class);
			/*Page<Doctor> page = service.getAllDoctorsByPageAndSortingDesc(2, 3, true, "income");
			if(!page.isEmpty())
			{
			   List<Doctor> dList = (List<Doctor>) page.getContent();
			   dList.forEach(d->System.out.println(d.getDocId()+"  "+d.getDocName()+"  "+d.getIncome()));
			   System.out.println("*************["+(page.getNumber()+1)+"/"+page.getTotalPages()+"]*************");
			}
			else
			{
			   System.out.println("Page is not found");
			}*/
		   //Sorting the property according to pass field
			/*service.getAllDoctorsByDescOrder(true, "docName").forEach(System.out::print);*/
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
