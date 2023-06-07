package dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformationDTO implements Serializable,Comparable<InformationDTO> {

	private String name;
	private String email;
	private String country;
	private String mobile;
	private String type;
	
	@Override
	public int compareTo(InformationDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
