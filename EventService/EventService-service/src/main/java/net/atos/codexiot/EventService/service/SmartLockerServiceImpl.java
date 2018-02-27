package net.atos.codexiot.EventService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.atos.codexiot.EventService.dao.SmartLockerDao;
import net.atos.codexiot.EventService.pojo.SmartLocker;


@Transactional
@Repository
public class SmartLockerServiceImpl  implements SmartLockerService{
	private static final Logger logger = Logger
			.getLogger(SmartLockerServiceImpl.class);
	@Autowired
	SmartLockerDao smartlockerdao;
	@Override
	public List<SmartLocker> getallLocker() {
		logger.info("in event list");
	return smartlockerdao.getallLocker();	}

}
