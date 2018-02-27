package net.atos.codexiot.EventService.dao;

import java.util.List;

import net.atos.codexiot.EventService.pojo.Event;
import net.atos.codexiot.EventService.pojo.SmartLocker;

public interface SmartLockerDao {
	List<SmartLocker> getallLocker();
}
