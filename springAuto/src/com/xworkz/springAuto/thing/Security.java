package com.xworkz.springAuto.thing;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString

public class Security {

	private Thing thing;

	public Security(Thing thing) {
		this.thing = thing;
	}

}
