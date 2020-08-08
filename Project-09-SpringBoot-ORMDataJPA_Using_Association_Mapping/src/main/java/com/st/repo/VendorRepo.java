package com.st.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.st.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer>{

	@Query("select v.vName,c.cType,c.cAmount from com.st.model.Vendor v inner join v.cob as c where v.vId=:vId ")
	List<Object[]> getData(Integer vId);
}
