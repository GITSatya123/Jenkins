package com.st.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.st.model.StaffDetails;
import com.st.repo.StaffRepo;
//import com.st.repo.StaffRepo.DatailsA;
//import com.st.repo.StaffRepo.DatailsB;
//import com.st.repo.StaffRepo.MyViewA;
//import com.st.repo.StaffRepo.MyViewB;

@Component
public class StaffRunner implements CommandLineRunner{
	
	@Autowired
	private StaffRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		/*
		 * repo.save(new StaffDetails(1001, "Satya", "male", 25, 67887.56));
		 * repo.save(new StaffDetails(1002, "Samir", "male", 56, 77554.34));
		 * repo.save(new StaffDetails(1003, "Sanu", "male", 45, 56446.67));
		 * repo.save(new StaffDetails(1004, "lipy", "Female", 23, 65676.26));
		 * repo.save(new StaffDetails(1005, "anuu", "Female", 26, 99777.78));
		 * repo.save(new StaffDetails(1006, "ruby", "Female", 28, 33445.43));
		 * repo.save(new StaffDetails(1007, "sachin", "male", 30, 77888.567));
		 * 
		 * System.out.println("DataInserted");
		 */
		 
		 //findAll()
		//List<StaffDetails> list=repo.findAll();
		//list.forEach(System.out::println);
		
		/*findAll(Sort s)
		ByDefault Accending_Order
		Sort sort=Sort.by("staffName");
		 Data retrival by Descending_Order
		Sort sort=Sort.by(Direction.DESC, "staffNo");
		repo.findAll(sort).forEach(System.out::println);*/
		
		//FindAll(Example<T> ex):List<t>
		/*StaffDetails ob=new StaffDetails(null,null,null,30,null);
		Example<StaffDetails> ex =Example.of(ob);
		repo.findAll(ex).forEach(System.out::println);*/
		
		//pagean
		//input data
		/*Pageable p=PageRequest.of(1	, 3);
		Page<StaffDetails> page=repo.findAll(p);
		//get page data
		page.getContent().forEach(System.out::println);
		System.out.println("..................................");
		System.out.println("FirstPage:"+page.isFirst());
		System.out.println("LastPage:"+page.isLast());
		System.out.println("NextPage:"+page.hasNext());
		System.out.println("LastPage:"+page.hasPrevious());
		//result page size
		System.out.println("Result PAge size::"+page.getContent().size());
		//request page size
		System.out.println("Request page size::"+page.getSize());
		System.out.println("Is page having rows:"+page.hasContent());
		//get total page
		System.out.println("Total page::"+page.getTotalPages());
		//total rows in table
		System.out.println("Total Rows in a page:"+page.getNumberOfElements());
		System.out.println("Total Rows in table:"+page.getTotalElements());
		System.out.println("Pageable:"+page.getPageable());*/
		
		//CustomQuery
		/*
		 * repo.findByStaffName("satya").forEach(System.out::println);
		 * repo.findByGender("Female").forEach(System.out::println);
		 * System.out.println("----------------------------");
		 * repo.findByAgeGreaterThan(25).forEach(System.out::println);
		 * System.out.println("===============================");
		 * repo.findBysalaryLessThan(70000.56).forEach(System.out::println);
		 */
		
		//FindAll by using  static Projection
		
		
		  /*List<MyViewA> list=repo.findAllByStaffNo(1003); 
		  for(MyViewA ob:list) {
		  System.out.println(ob.getStaffName()+".."+ob.getGender()); 
		  }
		 
		
		List<MyViewB> list=repo.findAllByStaffNo(1005);
		for(MyViewB ob:list) {
			System.out.println(ob.getSalary()+"...."+ob.getAge());
		}*/
		
		//FindAll by using dynamic projection
		
		/*List<DatailsA> list1=repo.findByStaffName("anuu", DatailsA.class);
		list1.forEach(ob->System.out.println(ob.getAge()+"..."+ob.getGender()));
		System.out.println("==================================");
		List< DatailsB> list2=repo.findByStaffName("satya", DatailsB.class);
		list2.forEach(ob->System.out.println(ob.getSalary()+"..."+ob.getStaffNo()));*/
		
		repo.getMyData(1003).forEach(System.out::println);
		System.out.println("============================");
		 repo.getMyInfo("lipy").forEach(System.out::println);
		 System.out.println("============================");
		 repo.getMyGender(30).forEach(System.out::println);
		 System.out.println("============================");
		 repo.getsName("sachin").forEach((ob)->System.out.println(ob[0]+".."+ob[1]));
		 System.out.println("============================");
		 repo.getData(28, "ruby").forEach(System.out::println);
		 System.out.println("Sigle row data:");
		 StaffDetails s=repo.getDetails(1004);
		 System.out.println(s);
		 System.out.println();
		 String s1=repo.getDetailsA(1003);
		 System.out.println(s1);
		 System.out.println();
		 Object ob=repo.getDetailsB(28);
		 Object [] arr=(Object[])ob;
		 System.out.println(arr[0]+"..."+arr[1]);
	}

}
