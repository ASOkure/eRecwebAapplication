package net.eurreca.orc.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CONDITIONS")
public class Conditions implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int Condition_Id;
	
	@NotEmpty
	@Column(name="Condition_Type", unique=true, nullable=false)
	String Condition_type;
	
	/*
	@ManyToOne(optional=false)
	@JoinColumn(name="reporter_Id")
    private Reporter reporters;
	
	
	public Reporter getReporters() {
		return reporters;
	}
	public void setReporters(Reporter reporters) {
		this.reporters = reporters;
	}
	*/
	
	@ManyToMany
	@JoinTable(name = "REPORTER_ADULT_CONDITIONS",
	joinColumns = @JoinColumn(name = "Condition_Id"),
	inverseJoinColumns = @JoinColumn(name = "Reporter_Adult_Id"))
	private Set<Reporter> conditionsreporter = new HashSet<Reporter>();
	
	
	public Set<Reporter> getConditionsreporter() {
		return conditionsreporter;
	}
	public void setConditionsreporter(Set<Reporter> conditionsreporter) {
		this.conditionsreporter = conditionsreporter;
	}
	public int getCondition_Id() {
		return Condition_Id;
	}
	public void setCondition_Id(int condition_Id) {
		Condition_Id = condition_Id;
	}
	public String getCondition_type() {
		return Condition_type;
	}
	public void setCondition_type(String condition_type) {
		Condition_type = condition_type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Condition_Id;
		result = prime * result + ((Condition_type == null) ? 0 : Condition_type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conditions other = (Conditions) obj;
		if (Condition_Id != other.Condition_Id)
			return false;
		if (Condition_type == null) {
			if (other.Condition_type != null)
				return false;
		} else if (!Condition_type.equals(other.Condition_type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Conditions [Condition_Id=" + Condition_Id + ", Condition_type=" + Condition_type + "]";
	}
	

}
