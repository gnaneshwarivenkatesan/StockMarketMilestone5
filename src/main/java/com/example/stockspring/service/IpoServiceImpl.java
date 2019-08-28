package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.IpoDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPODetails;

@Service
public class IpoServiceImpl implements IpoService {

	@Autowired
	private IpoDao ipoDao;
	

	@Override
	public IPODetails updateIpo(IPODetails ipo) {
		// TODO Auto-generated method stub
		return ipoDao.save(ipo);
	}

	@Override
	public List<IPODetails> getIpoList() throws SQLException {
		// TODO Auto-generated method stub
		return ipoDao.findAll();
	}

	@Override
	public IPODetails insertIpo(IPODetails ipo) throws SQLException {
		// TODO Auto-generated method stub
		return ipoDao.save(ipo);
	}

	@Override
	public IPODetails findByid(int ipo) {
		// TODO Auto-generated method stub
		return ipoDao.getOne(ipo);
	}

	@Override
	public void deletebyid(int ipo) {
		// TODO Auto-generated method stub
		ipoDao.deleteById(ipo);
	}

}
