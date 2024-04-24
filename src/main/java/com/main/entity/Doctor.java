package com.main.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Jpa_Doctor_Info")
public class Doctor
{
	 @Id
	 @SequenceGenerator(name="gen1", sequenceName = "DOC_ID_SEQ1", initialValue = 3000, allocationSize = 1)
	 @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	 @Column(name="DOC_ID")
     private Integer docId;
	 
	 @Column(name="DOC_NAME")
     private String docName;
	 
	 @Column(name="INCOME")
     private Float income;
	 
	 @Column(name="SPECIALIZATION")
     private String specialization;
}
