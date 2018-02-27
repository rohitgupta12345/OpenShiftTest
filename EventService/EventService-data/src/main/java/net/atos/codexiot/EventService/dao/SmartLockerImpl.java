package net.atos.codexiot.EventService.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import net.atos.codexiot.EventService.pojo.SmartLocker;




@Transactional
@Repository
public class SmartLockerImpl implements SmartLockerDao {
	@Autowired
	private SessionFactory sessionfactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<SmartLocker> getallLocker() {
		return this.sessionfactory.getCurrentSession().createQuery("select e from SmartLocker e").list();
		
	}

}
