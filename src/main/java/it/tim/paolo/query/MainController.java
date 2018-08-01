package it.tim.paolo.query;

import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import it.tim.paolo.query.dao.DeviceDAO;
import it.tim.paolo.query.dao.DevicesDAO;
import it.tim.paolo.query.repository.DeviceRepository;

@Controller
@RequestMapping(path="/device-query")
public class MainController {

	@Autowired
	private DeviceRepository repository;

	@GetMapping(path="/findAll")
	public @ResponseBody Iterable<DeviceDAO> getAllRelations(){
		return repository.findAll();
	}
	
	@PostMapping(path="/findById")
	public @ResponseBody Optional<DeviceDAO> getDeviceById(@RequestBody String id){
		/*Optional<DeviceDAO> d = repository.findById(Integer.parseInt(id));
		if (d.isPresent()) {
			return Optional.of(new Device(d.get().getDeviceStatus(), r.get().getDeviceToken(), r.get().getDeviceType()));
		}
		return Optional.ofNullable(null);*/
		return repository.findById(Integer.parseInt(id));
	}
	
	@PostMapping(path="/findByFisCod")
	public @ResponseBody DevicesDAO getDevicesByFisCod(@RequestBody String fisCod){
		List<DeviceDAO> listDevices = repository.findByFisCod(fisCod);
		if (listDevices.size() == 0){
			return null;
		}
		DevicesDAO devices = new DevicesDAO(listDevices);
		//List<Device> devices = new ArrayList<>();
		/*for (Relation r : itRelation) {
			devices.getDevices().add(new Device(r.getDeviceStatus(), r.getDeviceToken(), r.getDeviceType()));
		}*/
		return devices;
	}
	
	@PostMapping(path="/findByType")
	public @ResponseBody DevicesDAO getDevicesByType(@RequestBody String type){
		List<DeviceDAO> listDevices = repository.findByDeviceType(type);
		DevicesDAO devices = new DevicesDAO(listDevices);
		/*for (Relation r : itRelation) {
			devices.getDevices().add(new Device(r.getDeviceStatus(), r.getDeviceToken(), r.getDeviceType()));
		}*/
		return devices;
	}
	
	@PostMapping(path="/findByToken")
	public @ResponseBody DeviceDAO getDeviceByToken(@RequestBody String token){
		List<DeviceDAO> listDevices = repository.findByDeviceToken(token);
		
		if (!listDevices.isEmpty()) {
			return listDevices.get(0);
		}
		
		//Devices devices = new Devices(listDevices);
		/*for (Relation r : itRelation) {
			devices.getDevices().add(new Device(r.getDeviceStatus(), r.getDeviceToken(), r.getDeviceType()));
		}*/
		return null;
	}
}