package com.mycompany.invoise.serviceNumber;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {
	
	 public InvoiceServiceNumber(InvoiceRepositoryInterface invoiceRepository) {
	        this.invoiceRepository = invoiceRepository;
	    }
	
	private static long lastNumber = 0L;
	
	private final InvoiceRepositoryInterface invoiceRepository;
	@Override
	public List<Invoice> getInvoiceList() {
		// TODO Auto-generated method stub
		return invoiceRepository.list();
	}

	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepository;
	}

	public void createInvoice(Invoice invoice) {
		invoice.setNumber(String.valueOf(++lastNumber));
		invoiceRepository.create(invoice);
	}

	@Override
	public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Invoice getInvoiceByNumber(String number) {
		// TODO Auto-generated method stub
		return invoiceRepository.getById(number);
	}
}
