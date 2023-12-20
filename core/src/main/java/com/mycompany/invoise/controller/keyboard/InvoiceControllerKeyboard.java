package com.mycompany.invoise.controller.keyboard;

import java.util.Scanner;

import org.springframework.stereotype.Controller;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface{
	
	public InvoiceControllerKeyboard(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
	
	private final InvoiceServiceInterface invoiceService;

	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}

	
	public String createInvoice(Invoice invoice) {
		System.out.println( "What is the customer name?" );
        Scanner scanner = new Scanner(System.in);
        String customerName= scanner.nextLine();
         invoice=new Invoice();
        invoice.setCustomerName(customerName);
        
        
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
