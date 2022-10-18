package com.storemanagement.storemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.storemanagement.storemanagement.model.Supplier;
import com.storemanagement.storemanagement.serviceinterface.ServiceClass;

@Controller
public class ControllerClass {
	@Autowired
	private ServiceClass serviceClass;
	
	@RequestMapping("/")
	public String login() {
	//model.addAttribute("supplierdetails", new Supplier());
	return "Dashboard";
	}

	@RequestMapping("/ViewSupplierDetails")
	public String viewPage(Model model) {
		List<Supplier> viewSupplier = serviceClass.viewSupplier();
		model.addAttribute("supplierdetails", viewSupplier);
		return "ViewSupplierDetails";
	}

	@RequestMapping("/SupplierAdd")
	public String insert(Model model) {
		model.addAttribute("supplierdetails", new Supplier());
		return "SupplierAdd";
	}

	@PostMapping("/added")
	public String inserted(@ModelAttribute("supplierdetails") Supplier supplier, Model model) {
		serviceClass.insertSupplier(supplier);
		List<Supplier> viewSupplier = serviceClass.viewSupplier();
		model.addAttribute("supplierdetails", viewSupplier);
		return "redirect:/ViewSupplierDetails";
	}

	@RequestMapping(value = "/delete/{supplier_id}", method = RequestMethod.GET)
	public String delete(@PathVariable("supplier_id") int id) {
		serviceClass.deleteSupplier(id);
		return "redirect:/ViewSupplierDetails";

	}

	@RequestMapping("/e/{supplier}")
	public String edit(@PathVariable("supplier") int supplier_id, Model model) {
		Supplier supplier = serviceClass.editSupplier(supplier_id);
		model.addAttribute("Editdetails", supplier);
		return "SupplierEditPage";

	}

//	@PostMapping("/updated")
//	public String update(@ModelAttribute("supplierdetails")Supplier supplier) {
//		serviceClass.updateSuppler(supplier.getSupplier_id(), supplier.getSupplier_name(),supplier.getMobile_no() );
//		return "redirect:/";
//	}

}
