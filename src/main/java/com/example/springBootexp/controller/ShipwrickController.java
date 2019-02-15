package com.example.springBootexp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.springBootexp.model.*;

@RestController
@RequestMapping("api/v1/")
public class ShipwrickController {
	@RequestMapping(value="Shipwreck",method= RequestMethod.GET)
	public List<Shipwreck>list(){
		return ShipwreckStub.list();
	}
	@RequestMapping(value="Shipwreck",method= RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck){
		return ShipwreckStub.create(shipwreck);
	}
	@RequestMapping(value="Shipwreck/{id}", method= RequestMethod.GET)
	public Shipwreck get(@PathVariable  Long id){
		return ShipwreckStub.get(id);
	}
	@RequestMapping(value="Shipwreck/{id}", method= RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
		return ShipwreckStub.update(id,shipwreck);
	}
	@RequestMapping(value="Shipwreck/{id}",method= RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id){
		return ShipwreckStub.delete(id);
	}
}
