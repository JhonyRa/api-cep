package com.jhonatanaguiar.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jhonatanaguiar.api.dto.AddressDto;
import com.jhonatanaguiar.api.model.Address;
import com.jhonatanaguiar.api.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	public AddressDto searchAddress(String cep) {
		
		AddressDto addressDto = new AddressDto();
		RestTemplate restTemplate = new RestTemplate();
		
		addressDto = restTemplate.getForObject("https://viacep.com.br/ws/"+cep+"/json/", AddressDto.class);
		
		if(addressDto  != null && addressDto.getCep() != null) {
			this.save(addressDto.transformDtoToAddress());
		}
		
		return addressDto;
	}
	
	public Address save(Address address) {
		return addressRepository.save(address);
	}

}