package com.tns.adminservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	private AdminService service;
	
	@PostMapping("/adminservice")
	public void add(@RequestBody Admin admin)
	{
		service.insertRecord(admin);
	}
	
	@GetMapping("/adminservice")
	public List<Admin> ShowAll()
	{
		return service.getAllRecords();
	}
	
	@GetMapping("/adminservice/{id}")
	public Admin getAdminById(@PathVariable Integer id)
	{
		return service.getAdminById(id);
	}
	
	@DeleteMapping("/adminservice/{id}")
	public void deleteAdmin(@PathVariable Integer id)
	{
		service.deleteAdmin(id);
	}
	
	@PutMapping("/adminservice/{id}")
	public ResponseEntity<String> updateAdmin(@PathVariable Integer id,@RequestBody Admin updatedAdmin)
	{
		service.updateAdmin(id,updatedAdmin);
		return ResponseEntity.ok("Admin updated Successfully");
	}
}
