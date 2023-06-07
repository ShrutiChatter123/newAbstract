package com.xworkz.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO implements Serializable,Comparable<ClientDTO> {

	@NotEmpty
	@Size(min = 5,max = 10)
	private String officeName;
	
	@NotEmpty
	@NotNull
	@Size(min = 5,max =10 )
	private String managerName;
	@NotEmpty
	@NotNull
	@Size(min = 5,max =10 )

	private String location;
	@NotEmpty
	@NotNull
	@Size(min = 5,max =10 )

	private String email;
	@NotEmpty
	@NotNull
	@Size(min = 5,max =10 )

	private String subBranchLocation;
	@NotEmpty
	@NotNull
	private String okForRegistraion;
	
	
	@Override
	public int compareTo(ClientDTO o) {
		return this.getManagerName().compareTo(o.getManagerName());
	}

	
	
}
