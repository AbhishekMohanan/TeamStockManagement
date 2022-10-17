package com.storemanagement.storemanagement.serviceclass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storemanagement.storemanagement.model.Supplier;
import com.storemanagement.storemanagement.repository.MyRepository;
import com.storemanagement.storemanagement.serviceinterface.ServiceClass;

@Service
public class ServiceClassImp implements ServiceClass {
	@Autowired
	private MyRepository myRepository;

	@Override
	public List<Supplier> viewSupplier() {
		
		return myRepository.findAll();
	}

	@Override
	public void insertSupplier(Supplier supplier) {
		this.myRepository.save(supplier);
		
	}

	@Override
	public void deleteSupplier(int supplier_id){
		myRepository.deleteById(supplier_id);
		
		
	}

	@Override
	public Supplier editSupplier(int supplier_id) {
	
		return myRepository.findById(supplier_id).get();
	}

//	@Override
//	public int updateSuppler(int supplier_id, String supplier_name, String mobile_no) {
//		return  myRepository.update(supplier_id, supplier_name, mobile_no);
//	}
	

}
