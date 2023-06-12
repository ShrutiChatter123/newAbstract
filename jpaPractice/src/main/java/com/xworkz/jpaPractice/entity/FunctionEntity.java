package com.xworkz.jpaPractice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "jdbcpracticetable")
@NamedQuery(name = "findAll", query = "select save from FunctionEntity as save")
@NamedQuery(name = "findByName",query="select happy from FunctionEntity as happy where happy.name=: byName ")
@NamedQuery(name = "findByLocation",query = "select server from FunctionEntity as server where server.location=:byLocation")
public class FunctionEntity {

	@Id
	private int id;
	private String name;
	private String location;
	private int date;
	private String address;
	
	
	
	
}
