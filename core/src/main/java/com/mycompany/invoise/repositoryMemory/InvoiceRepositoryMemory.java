package com.mycompany.invoise.repositoryMemory;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface{
	
	private static List<Invoice>invoices=new ArrayList<>();

	public void create (Invoice invoice) {
		invoices.add(invoice);
		System.out.println("invoices added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());
	}

	@Override
	public List<Invoice> list() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Invoice getById(String number) {
		throw new UnsupportedOperationException();
	}
	
}
