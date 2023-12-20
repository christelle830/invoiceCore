package com.mycompany.invoise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

@Service
public interface InvoiceServiceInterface {
	 void createInvoice(Invoice invoice);
	 List<Invoice> getInvoiceList();
	 Invoice getInvoiceByNumber(String number);
	 void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
