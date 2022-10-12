package com.gl.casestudyApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.casestudyApplication.bean.CompanyShare;


	@Repository
	public interface CompanyRepository extends JpaRepository<CompanyShare, Long> {
	   @Query("select max(companyId) from CompanyShare")
	
	public Long findMaxCompanyId();	
	
}
