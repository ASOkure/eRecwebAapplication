package net.eurreca.orc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="REPORTER_ADULT_CONDITIONS")
public class UniqueId implements Serializable {
	
	
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer	Reporter_Adult_Condition_Id;
	
	
	@Column(name="Reporter_Adult_Id") //Foreign key
	private int Reporter_Adult_Id;
	

	@Column(name="Condition_Id")
	private int	Condition_Id;
	

	@Column(name="Case_Number_Seen_Adult")
	private int Case_Number_Seen_Adult; 
	

	@Column(name="Year")
	Date Year;
    

	@Column(name="Month")
	Date Month;
    
	
	@Column(name="Unique_Id")
	private int Unique_Id;
    
	
	@Column(name="Age_Adult")
	private String  Age_Adult;
	
	Reporter reporter;
	
	
	
	public Integer getReporter_Adult_Condition_Id() {
		return Reporter_Adult_Condition_Id;
	}
	public void setReporter_Adult_Condition_Id(Integer reporter_Adult_Condition_Id) {
		Reporter_Adult_Condition_Id = reporter_Adult_Condition_Id;
	}
	public int getReporter_Adult_Id() {
		return Reporter_Adult_Id;
	}
	public void setReporter_Adult_Id(int reporter_Adult_Id) {
		Reporter_Adult_Id = reporter_Adult_Id;
	}
	public int getCondition_Id() {
		return Condition_Id;
	}
	public void setCondition_Id(int condition_Id) {
		Condition_Id = condition_Id;
	}
	public int getCase_Number_Seen_Adult() {
		return Case_Number_Seen_Adult;
	}
	public void setCase_Number_Seen_Adult(int case_Number_Seen_Adult) {
		Case_Number_Seen_Adult = case_Number_Seen_Adult;
	}
	public Date getYear() {
		return Year;
	}
	public void setYear(Date year) {
		Year = year;
	}
	public Date getMonth() {
		return Month;
	}
	public void setMonth(Date month) {
		Month = month;
	}
	public int getUnique_Id() {
		return Unique_Id;
	}
	public void setUnique_Id(int unique_Id) {
		Unique_Id = unique_Id;
	}
	public String getAge_Adult() {
		return Age_Adult;
	}
	public void setAge_Adult(String age_Adult) {
		Age_Adult = age_Adult;
	}
	public Reporter getReporter() {
		return reporter;
	}
	public void setReporter(Reporter reporter) {
		this.reporter = reporter;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Age_Adult == null) ? 0 : Age_Adult.hashCode());
		result = prime * result + Case_Number_Seen_Adult;
		result = prime * result + Condition_Id;
		result = prime * result + ((Month == null) ? 0 : Month.hashCode());
		result = prime * result + ((Reporter_Adult_Condition_Id == null) ? 0 : Reporter_Adult_Condition_Id.hashCode());
		result = prime * result + Reporter_Adult_Id;
		result = prime * result + Unique_Id;
		result = prime * result + ((Year == null) ? 0 : Year.hashCode());
		result = prime * result + ((reporter == null) ? 0 : reporter.hashCode());
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
		UniqueId other = (UniqueId) obj;
		if (Age_Adult == null) {
			if (other.Age_Adult != null)
				return false;
		} else if (!Age_Adult.equals(other.Age_Adult))
			return false;
		if (Case_Number_Seen_Adult != other.Case_Number_Seen_Adult)
			return false;
		if (Condition_Id != other.Condition_Id)
			return false;
		if (Month == null) {
			if (other.Month != null)
				return false;
		} else if (!Month.equals(other.Month))
			return false;
		if (Reporter_Adult_Condition_Id == null) {
			if (other.Reporter_Adult_Condition_Id != null)
				return false;
		} else if (!Reporter_Adult_Condition_Id.equals(other.Reporter_Adult_Condition_Id))
			return false;
		if (Reporter_Adult_Id != other.Reporter_Adult_Id)
			return false;
		if (Unique_Id != other.Unique_Id)
			return false;
		if (Year == null) {
			if (other.Year != null)
				return false;
		} else if (!Year.equals(other.Year))
			return false;
		if (reporter == null) {
			if (other.reporter != null)
				return false;
		} else if (!reporter.equals(other.reporter))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UniqueId [Reporter_Adult_Condition_Id=" + Reporter_Adult_Condition_Id + ", Reporter_Adult_Id="
				+ Reporter_Adult_Id + ", Condition_Id=" + Condition_Id + ", Case_Number_Seen_Adult="
				+ Case_Number_Seen_Adult + ", Year=" + Year + ", Month=" + Month + ", Unique_Id=" + Unique_Id
				+ ", Age_Adult=" + Age_Adult + ", reporter=" + reporter + "]";
	}
	
	
	
	
	
	
	
	
	}


