package com.tns.adminservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService 
{
	
	@Autowired
	private AdminRepository repo;
	
	//Get all the records from the table
	public void insertRecord(Admin admin)
	{
		repo.save(admin);
	}
	
	//Show all the records from the table in database
	public List<Admin> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Admin getAdminById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteAdmin(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateAdmin(Integer id,Admin updateAdmin)
	{
		Admin existingAdmin=repo.findById(id).orElse(null);
		if(existingAdmin!=null)
		{
			existingAdmin.setAdminid(updateAdmin.getAdminid());
			existingAdmin.setAdminname(updateAdmin.getAdminname());
			existingAdmin.setPassword(updateAdmin.getPassword());
			existingAdmin.setProductid(updateAdmin.getProductid());
			existingAdmin.setProductname(updateAdmin.getProductname());
			existingAdmin.setTotalprice(updateAdmin.getTotalprice());
			repo.save(existingAdmin);
		}
	}
	
	

}
