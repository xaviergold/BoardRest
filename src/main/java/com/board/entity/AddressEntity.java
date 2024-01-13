package com.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity(name="address")
@Table(name="tbl_addr")
@Getter
public class AddressEntity {

	@Id
	@Column(name="seqno")
	private int seqno;
	
	@Column(name="zipcode", length=10, nullable=true)
	private String zipcode;
	
	@Column(name="province", length=50, nullable=true)
	private String province;
	
	@Column(name="road", length=200, nullable=true)
	private String road;
	
	@Column(name="building", length=200, nullable=true)
	private String building;
	
	@Column(name="oldaddr", length=200, nullable=true)
	private String oldaddr;
	
}
