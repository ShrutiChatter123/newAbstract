package dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResortDTO implements Serializable,Comparable<ResortDTO> {

	private String resortName;
	private String ownerName;
	private String location;
	private String mobileNo;
	private String email;
	private String roomType;
	private String priceRange;
	private String foodType;
	private String swimingFoolAcess;

	
	@Override
	public int
	
	compareTo(ResortDTO o) {
		return this.getOwnerName().compareTo(o.getOwnerName());
	}

	
	
	
	
}
