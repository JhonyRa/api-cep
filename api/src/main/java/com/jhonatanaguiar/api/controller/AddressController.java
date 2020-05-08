package com.jhonatanaguiar.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonatanaguiar.api.dto.AddressDto;
import com.jhonatanaguiar.api.service.AddressService;

@RestController
@RequestMapping(value="/api/address")
@CrossOrigin(origins = "*")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping(path= "/search")
	public AddressDto searchAddress(@RequestBody String cep) {
		return addressService.searchAddress(cep);
	}

}
