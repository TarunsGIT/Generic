package in.co.webservice.em.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseBean implements Serializable, DropdownList,
		Comparable<BaseBean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7544903568808723103L;

	/*** Non Business primary key */

	@Id
	@GenericGenerator(name = "hiIncrement", strategy = "increment")
	@GeneratedValue(generator = "hiIncrement")
	@Column(name = "ID", unique = true, nullable = false)
	protected Long id;

	/*** Contains USER ID who created this database record */

	@Column(name = "CREATED_BY", length = 50)
	protected String createdBy;

	/*** Contains USER ID who modified this database record */
	@Column(name = "MODIFIED_BY", length = 50)
	protected String modifiedBy;

	/*** Contains Created Timestamp of database record */
	@Column(name = "CREATED_DATETIME")
	protected Timestamp createdDatetime;

	/*** Contains Modified Timestamp of database record */
	@Column(name = "MODIFIED_DATETIME")
	protected Timestamp modifiedDatetime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Timestamp getModifiedDatetime() {
		return modifiedDatetime;
	}

	public void setModifiedDatetime(Timestamp modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public int compareTo(BaseBean next) {
		return getValue().compareTo(next.getValue());
	}

/*	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}*/
}
