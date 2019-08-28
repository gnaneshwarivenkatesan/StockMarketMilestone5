package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.IPODetails;

public interface IpoService {
	 public IPODetails updateIpo(IPODetails ipo);
		public List<IPODetails> getIpoList() throws SQLException;
		
		public IPODetails insertIpo(IPODetails ipo) throws SQLException ;
		public IPODetails findByid(int ipo);
		public void deletebyid(int ipo);
}
