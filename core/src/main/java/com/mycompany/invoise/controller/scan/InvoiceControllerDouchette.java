package com.mycompany.invoise.controller.scan;



import org.springframework.stereotype.Controller;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {
	
	 public InvoiceControllerDouchette(InvoiceServiceInterface invoiceService) {
	        this.invoiceService = invoiceService;
	    }

	
	private final InvoiceServiceInterface invoiceService;

	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}

	
	public String createInvoice(Invoice invoice) {
		System.out.println("Usage of a scanner");
		 invoice=new Invoice();
		invoice.setCustomerName("Virgin Galactic");
		invoiceService.createInvoice(invoice);
		return null;
	}


	@Override
	public void setInvoiceService(InvoiceServiceInterface invoiceServiceInterface) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String createInvoice() {
		// TODO Auto-generated method stub
		return null;
	}

}
