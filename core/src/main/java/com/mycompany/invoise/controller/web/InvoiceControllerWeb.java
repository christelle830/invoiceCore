package com.mycompany.invoise.controller.web;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface{
	
	public InvoiceControllerWeb(InvoiceServiceInterface invoiceService) {
	        this.invoiceService = invoiceService;
	    }
	@Autowired
	  private final InvoiceServiceInterface invoiceService;
	  
	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}

	
	public String createInvoice() {
		
        String customerName= "Tesla";
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerName);
        
        invoiceService.createInvoice(invoice);
		return customerName;
	}


	@Override
	public void setInvoiceService(InvoiceServiceInterface invoiceServiceInterface) {
		// TODO Auto-generated method stub
		
	}

	//@GetMapping("/invoice-home")
	
	//public String displayHome(HttpServletRequest request) {
	//	List<Invoice> invoices=invoiceService.getInvoiceList();
	//	request.setAttribute("invoices", invoices);
	//	return "index";
	//}
	
	// est equivalent a :
	//public @ModelAttribute("invoices") List<Invoice> displayHome() {
	//	List<Invoice> invoices=invoiceService.getInvoiceList();
		
	//	return invoices;
	//}
}
