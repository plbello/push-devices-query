package it.tim.paolo.query.dao;

import java.util.ArrayList;
import java.util.List;

public class DevicesDAO {
	private List<DeviceDAO> devices;
	
	public DevicesDAO() {
		this.devices = new ArrayList<>();
	}
	
	public DevicesDAO(List<DeviceDAO> d) {
		this.devices = d;
	}
	
	public List<DeviceDAO> getDevices() {
		return devices;
	}
	
	public void setDevices(List<DeviceDAO> devices) {
		this.devices = devices;
	}
}