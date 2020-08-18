package com.springwebflux.r2dbc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table("employee")
public class Employee /* implements Persistable<Employee> */ {
	@Id
	@Column("id")
	@JsonProperty
	//@GeneratedValue(strategy=GenerationType.)
	private Integer id;
	@Column("name")
	@JsonProperty
	private String name;
	@Column("salary")
	@JsonProperty
	private int salary;

	/*
	 * @Transient private boolean newEmployee;
	 * 
	 * @Override
	 * 
	 * @Transient public boolean isNew() { return this.newEmployee || id == null; }
	 * 
	 * public Employee getId() { this.newEmployee = true; return this; }
	 */
}
