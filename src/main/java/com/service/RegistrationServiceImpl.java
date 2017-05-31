package com.service;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.model.Registration;

/**
 *
 * @author MAC
 */
public class RegistrationServiceImpl implements RegistrationService {

    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    public void add(Registration registration) {
        hibernateTemplate.saveOrUpdate(registration);
        System.out.println(listUser());
    }

    public List<Registration> listUser() {
        return (List<Registration>) hibernateTemplate.find("from Registration");
    }
}
