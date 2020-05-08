package com.jhonatanaguiar.api.dto;

import com.jhonatanaguiar.api.model.Address;

import lombok.Data;

@Data
public class AddressDto {
	
	private String cep;
	
	private String logradouro;
	
	private String complemento;
	
	private String bairro;
	
	private String localidade;
	
	private String uf;
	
	private String unidade;
	
	private String ibge;
	
	private String gia;	
	
	public Address transformDtoToAddress() {
		
		Address address = new Address();
		
		address.setCep(this.cep);
		
		address.setLogradouro(this.logradouro);
		
		address.setComplemento(this.complemento);

		address.setBairro(this.bairro);
		
		address.setLocalidade(this.localidade);
		
		address.setUf(this.uf);
		
		address.setUnidade(this.unidade);
		
		address.setIbge(this.ibge);

		address.setGia(this.gia);
		
		return address;
	}

}
