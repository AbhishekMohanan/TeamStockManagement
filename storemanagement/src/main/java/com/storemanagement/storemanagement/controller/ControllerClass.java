package com.storemanagement.storemanagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
	
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String login(Model model, String error, String logout) {
	        if (error != null)
	            model.addAttribute("errorMsg", "Your username and password are invalid.");

	        if (logout != null)
	            model.addAttribute("msg", "You have been logged out successfully.");

	        return "LogIn";
	    }
	
	@RequestMapping("/")
	public String dashboard(HttpServletRequest request,Authentication authentication) {
	//model.addAttribute("supplierdetails", new Supplier());
		   HttpSession session = request.getSession();
		    
		    session.setAttribute("sess",authentication.getName());
//		    System.out.println("checking"+authentication.getPrincipal().getEmail());
//	       if (( authentication.getPrincipal().getroles()=="ROLE_CUSTOMER")
	       
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

	@RequestMapping("/e/{supplier_id}")
	public String edit(@PathVariable("supplier_id") int supplier_id, Model model) {
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
