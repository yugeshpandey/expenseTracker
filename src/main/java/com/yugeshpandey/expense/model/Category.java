package com.yugeshpandey.expense.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
@Table(name = "CATEGORY")
public class Category {
	
	@Id
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private String name;
	
	

}
