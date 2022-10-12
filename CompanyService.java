package com.gl.casestudyApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.casestudyApplication.bean.CompanyShare;
import com.gl.casestudyApplication.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository repository;
	
	public void save(CompanyShare company) {
		repository.save(company);
	}
	
	public List<CompanyShare> findAll() {
		return repository.findAll();
	}
	
	public CompanyShare findById(Long id) {
		return repository.getById(id);
	}
	
	public Long generateCompanyId() {
		Long val = repository.findMaxCompanyId();
		if(val == null)
			val = 1000001L;
		else
			val = val + 1;
		return val;
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
}
