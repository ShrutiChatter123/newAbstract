package dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BloodDonationDTO implements Serializable,Comparable<BloodDonationDTO> {

	@Size(min = 5,max = 15,message = "donatorName between 5 to 15")
	private String donatorName;
	
	private long donatorMobileNo;
	
	@NotEmpty(message = "bloodGroupType must not be empty")
	private String bloodGroupType;
	
	@Size(min = 2,max = 20, message = "gender shoud between 3 to 20")
	@NotEmpty(message = "gender must not be empty")
	private String gender;
	
	@Email(message = "enter valid email")
	private String email;
	
	@Size(min = 5,max = 30,message = "donatorName between 5 to 15")
	private String address;
	
	@Min(value = 30, message = "weight at least minimun 30")
	@Max(value = 65,message = "weight at least max 65")
	private Integer weight;
	
	private String haveyoudonatedpreviously;
	
	
	
	@Override
	public int compareTo(BloodDonationDTO o) {
		return this.getDonatorName().compareTo(o.getDonatorName());
	}

}
