package com.st.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.st.model.StaffDetails;

public interface StaffRepo extends JpaRepository<StaffDetails, Integer>{

	//find by Name
	/*
	 * List<StaffDetails> findByStaffName(String sName); //find by gender
	 * List<StaffDetails> findByGender(String gender); List<StaffDetails>
	 * findByAgeGreaterThan(Integer age); List<StaffDetails>
	 * findBysalaryLessThan(Double salary);
	 */
	
	// FindAllData By static Projection
	
	/*List<MyViewB>findAllByStaffNo(Integer staffNo);
	
	interface MyViewA {
		String getStaffName();
		String getGender();
	}
	
	interface MyViewB {
		String getSalary();
		Integer getAge();
	}*/
	
	// FindAllData By dynamic Projection
	
	/*<K> List <K> findByStaffName(String StaffName,Class <K> cls);

	interface DatailsA {
		String getGender();
		Integer getAge();
	}
	
	interface DatailsB {
		Double getSalary();
		Integer getStaffNo();
	}*/
	
	//get one column  from datatype
	@Query("select staffName from com.st.model.StaffDetails where staffNo=:staffNo")
	List<String> getMyData(Integer staffNo);
	@Query("select staffNo from StaffDetails where staffName=:staffName")
	List<Integer> getMyInfo(String staffName);
	@Query("select s.gender from StaffDetails s where s.age=:age")
	List<String> getMyGender(Integer age);
	//get more than 1 column from object
	@Query("select s.age,s.salary from StaffDetails s where s.staffName=:staffName")
	List<Object[]> getsName(String staffName);
	//get AllColumn from model class
	@Query("select s from StaffDetails s where s.age=:age or s.staffName=:staffName")
	List<StaffDetails> getData(Integer age,String staffName);
	
	//one row data
	
	@Query("select s from StaffDetails s where s.staffNo=:staffNo")
	StaffDetails getDetails(Integer staffNo);
	//@Query("select s.age from Staffdetails s where s.staffNo=:staffNo")
	//Integer details(Integer staffNo);
	@Query("select s.staffName from StaffDetails s where s.staffNo=:staffNo") //Fine
	String getDetailsA(Integer staffNo);

	@Query("select s.staffNo,s.gender from StaffDetails s where s.age=:age ")
	Object getDetailsB(Integer age);
}
