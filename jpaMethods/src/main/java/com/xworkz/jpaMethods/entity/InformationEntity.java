package com.xworkz.jpaMethods.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "jdbctabale")

@NamedQuery(name ="findAll",query="select info from InformationEntity as  info" )
@NamedQuery(name = "findByName",query="select result from InformationEntity as result where result.name=:byName")
public class InformationEntity {

	@Id
	private int id;
	private String name;
	private String location;
	private int age;
	private int height;
	private int weight;
	
	
	
	
}
