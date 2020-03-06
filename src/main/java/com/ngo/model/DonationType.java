package com.ngo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name="donation_types")
@Table(name="donation_types")
public class DonationType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="donation_type_id")
	private long donationTypeId;
	
	@Column(name="type_name")
	@NotNull
	private String typeName;
	
	@Column(name="has_recurring_option")
	@NotNull
	private boolean hasRecurringOption;
}
