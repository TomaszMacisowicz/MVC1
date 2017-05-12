/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvc1;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
/**
 *
 * @author tomas
 */
public class RegServiceImpl implements RegService{
    
	
	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	public void add(Registration registration) {
		hibernateTemplate.saveOrUpdate(registration);
		System.out.println(listUser());
	}
	
	public List<Registration> listUser() {
		return hibernateTemplate.find("from Registration");
	}
}

