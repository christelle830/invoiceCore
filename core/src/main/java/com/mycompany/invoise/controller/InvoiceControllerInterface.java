package com.mycompany.invoise.controller;

import com.mycompany.invoise.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
	String createInvoice();
	void setInvoiceService(InvoiceServiceInterface invoiceServiceInterface);
	
}
