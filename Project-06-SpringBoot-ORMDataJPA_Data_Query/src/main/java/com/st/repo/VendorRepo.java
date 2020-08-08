package com.st.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.st.model.VendorInfo;

public interface VendorRepo extends JpaRepository<VendorInfo, Integer>{

	@Query("select v from com.st.model.VendorInfo v where v.vName=:vName" )
	List<VendorInfo> getVenData(String vName);
	
	@Query(value="select * from vendor where v_name=:vName", nativeQuery= true)
	List<VendorInfo> getVenNativeData(String vName);
	
	@Query(value="select * from vendor  where gender=:gender" ,nativeQuery=true)
	List<VendorInfo> getVData(String gender);
	
	//update /delete by @query
	@Transactional
	@Modifying
	@Query("update com.st.model.VendorInfo set vName=:vName where vId=:vId")
	Integer modifyName(String vName,Integer vId);
	
	@Query("DELETE FROM com.st.model.VendorInfo WHERE age=:age")
	Integer removeBy(Integer age);
}
