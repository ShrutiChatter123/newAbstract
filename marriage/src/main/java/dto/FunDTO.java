package dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FunDTO implements Serializable,Comparable<FunDTO> {

	private String fName;
	private String lName;
	private String Email;
	private String mobile;
	
	
	
	@Override
	public int compareTo(FunDTO o) {
		System.out.println("This is compare to method...");
		return this.getFName().compareTo(o.getFName());
	}

	
	
	
	
	
}
