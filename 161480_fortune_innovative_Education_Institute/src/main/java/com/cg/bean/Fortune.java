package com.cg.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="QUERY_MASTER")
public class Fortune {
	@Id
	@GeneratedValue
	private Integer query_id;
	private String technology;
	private String query_raised_by;
	private String query;
	public Integer getQuery_id() {
		return query_id;
	}
	public void setQuery_id(Integer query_id) {
		this.query_id = query_id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQuery_raised_by() {
		return query_raised_by;
	}
	public void setQuery_raised_by(String query_raised_by) {
		this.query_raised_by = query_raised_by;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	
	
	
	

}
