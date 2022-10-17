package com.storemanagement.storemanagement.serviceinterface;

import java.util.List;

import com.storemanagement.storemanagement.model.Supplier;

public interface ServiceClass {

	List<Supplier> viewSupplier();
	void insertSupplier(Supplier supplier);
	void deleteSupplier(int supplier_id);
	Supplier editSupplier(int supplier_id);
	//int updateSuppler(int supplier_id, String supplier_name, String mobile_no);

}
