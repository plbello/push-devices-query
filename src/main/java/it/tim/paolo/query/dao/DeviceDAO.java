package it.tim.paolo.query.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registered_devices")
public class DeviceDAO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idDevice;
	
	private String fisCod;
	private String telephone;
	private String deviceToken;
	private String deviceType;
	private String deviceName;
	private String deviceStatus;
	private Date regTime;
	

	public String getFisCod() {
		return fisCod;
	}

	public void setFisCod(String fisCod) {
		this.fisCod = fisCod;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	
	public Integer getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(Integer idDevice) {
		this.idDevice = idDevice;
	}
	
	public Date getRegTime() {
		return regTime;
	}
	
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	
}