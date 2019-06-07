package net.eurreca.orc.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="REPORTER_ADULT")
public class Reporter implements Serializable{
 
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Reporter_Adult_Id;
 
  
  //  @NotEmpty
    @Column(name="FIRST_NAME", nullable=false)
    private String firstName;
 
   // @NotEmpty
    @Column(name="LAST_NAME", nullable=false)
    private String lastName;
 
   // @NotEmpty
    @Column(name="Reporter_Email", nullable=false)
    private String email;
    
    @ManyToMany
	@JoinTable(name = "REPORTER_ADULT_CONDITIONS",
	joinColumns = @JoinColumn(name = "Reporter_Adult_Id"),
	inverseJoinColumns = @JoinColumn(name = "Condition_Id"))
	private Set<Conditions> reporterconditions = new HashSet<Conditions>();
	
	
	public Set<Conditions> getReporterconditions() {
		return this.reporterconditions;
	}

	public void setReporterconditions(Set<Conditions> reporterconditions) {
		this.reporterconditions = reporterconditions;
	}

	public Integer getId() {
        return Reporter_Adult_Id;
    }
 
    public void setId(Integer Reporter_Adult_Id) {
        this.Reporter_Adult_Id = Reporter_Adult_Id;
    }
 
 
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
  
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Reporter_Adult_Id == null) ? 0 : Reporter_Adult_Id.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Reporter))
            return false;
        Reporter other = (Reporter) obj;
        if (Reporter_Adult_Id == null) {
            if (other.Reporter_Adult_Id != null)
                return false;
        } else if (!Reporter_Adult_Id.equals(other.Reporter_Adult_Id))
            return false;
		return false; // auto gen. check this if code is not working
    }
 
    @Override
    public String toString() {
        return "Reporter [Reporter_Adult_Id=" + Reporter_Adult_Id + ",  firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + "]";
    }
 
}