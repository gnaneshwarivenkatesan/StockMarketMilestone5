package com.example.stockspring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;

/*@Repository
public class CompanyDaoImpl implements CompanyDao{

	public Company insertCompany(Company company) throws SQLException  {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_exchange","root","root");
		PreparedStatement ps=conn.prepareStatement("insert into company(company_code,company_name,turnover,ceo,breifwriteup) values(?,?,?,?,?)");
		ps.setInt(1, company.getCompanyCode());
		ps.setString(2, company.getCompanyName());
		ps.setFloat(3, company.getTurnOver());
		ps.setString(4, company.getCeo());
	
		//ps.setInt(6, company.getSector());
		ps.setString(5,company.getBriefWriteup());
		//ps.setInt(8, company.getStockCode());
		ps.executeUpdate();
		return company;
	}

	
	public List<Company> getCompanyList() throws SQLException {
		List <Company> companyList=new ArrayList<Company>();
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_exchange","root","root");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		Company company=null;
		while(rs.next()){
			 company=new Company();
			 int companyId=rs.getInt("company_code");
			company.setCompanyCode(companyId);
			company.setBoard(rs.getString("boardofdirectors"));
			company.setCompanyName(rs.getString("company_name"));
			company.setCeo(rs.getString("ceo"));
			company.setBriefWriteup(rs.getString("breifwriteup"));
			company.setTurnOver(rs.getFloat("turnover"));
			company.setStockCode(rs.getInt("stock_code"));
			company.setSector(rs.getInt("sector_id"));
			companyList.add(company);
		}
		}catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return companyList;
	}

	
	
	
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		//Company compnay=new Company();
		//compnay.setCompanyId(1001);
		//dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}

}
*/