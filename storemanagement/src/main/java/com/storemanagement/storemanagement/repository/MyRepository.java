package com.storemanagement.storemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.storemanagement.storemanagement.model.Supplier;

@Repository
public interface MyRepository extends JpaRepository<Supplier, Integer> {
//	@Query("update Supplier supplier set supplier.supplier_name =:name , supplier.mobile_no =:mobile, where supplier.supplier_id =:id")
//	@Transactional
//	@Modifying
//	int update(@Param("id") int supplier_id , @Param("name") String supplier_name,
//			@Param("mobile") String mobile_no );

}
	


