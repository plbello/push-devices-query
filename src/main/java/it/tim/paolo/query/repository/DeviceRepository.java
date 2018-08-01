package it.tim.paolo.query.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.tim.paolo.query.dao.DeviceDAO;

public interface DeviceRepository extends CrudRepository<DeviceDAO, Integer>{
	List<DeviceDAO> findByFisCod(String fisCod);
	List<DeviceDAO> findByDeviceType(String deviceType);
	List<DeviceDAO> findByDeviceToken(String deviceToken);
}
