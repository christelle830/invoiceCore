package com.mycompany.invoise.servicePrefix;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {
	
	public InvoiceServicePrefix(InvoiceRepositoryInterface invoiceRepository, String string) {
		this.invoiceRepository=invoiceRepository;
	}
	
	@Value("${invoice.lastNumber}")
	private long lastNumber;
	@Value("${invoice.prefix}")
	private String prefix;
	
	private final InvoiceRepositoryInterface invoiceRepository;
	
	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepository;
	}
	
	public void createInvoice(Invoice invoice) {
		invoice.setNumber(prefix+(++lastNumber));
		invoiceRepository.create(invoice);
	}
	
	
	@Override
	public List<Invoice> getInvoiceList() {
		// TODO Auto-generated method stub
		return invoiceRepository.list();
	}



	public long getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(long lastNumber) {
		this.lastNumber = lastNumber;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
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
