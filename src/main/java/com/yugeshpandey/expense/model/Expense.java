package com.yugeshpandey.expense.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "EXPENSE")
public class Expense {
	
	@Id
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private Instant expenseDate;
	
	@Getter @Setter
	private String description;
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private User user;
	
}
