
package com.mery.cp2_weekk_13;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author emirs
 */
@Entity
@Table(name = "SALARIES")
@NamedQueries({
    @NamedQuery(name = "Salaries.findAll", query = "SELECT s FROM Salaries s"),
    @NamedQuery(name = "Salaries.findBySalaryId", query = "SELECT s FROM Salaries s WHERE s.salaryId = :salaryId"),
    @NamedQuery(name = "Salaries.findByEmployeeId", query = "SELECT s FROM Salaries s WHERE s.employeeId = :employeeId"),
    @NamedQuery(name = "Salaries.findByMonthId", query = "SELECT s FROM Salaries s WHERE s.monthId = :monthId"),
    @NamedQuery(name = "Salaries.findByAmount", query = "SELECT s FROM Salaries s WHERE s.amount = :amount")})
public class Salaries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALARY_ID")
    private Integer salaryId;
    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;
    @Column(name = "MONTH_ID")
    private Integer monthId;
    @Column(name = "AMOUNT")
    private Integer amount;

    public Salaries() {
    }

    public Salaries(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaryId != null ? salaryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salaries)) {
            return false;
        }
        Salaries other = (Salaries) object;
        if ((this.salaryId == null && other.salaryId != null) || (this.salaryId != null && !this.salaryId.equals(other.salaryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mery.cp2_weekk_13.Salaries[ salaryId=" + salaryId + " ]";
    }

}
