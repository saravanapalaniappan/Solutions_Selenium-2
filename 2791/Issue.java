package com.htc.coreJava4dto;

import java.sql.Date;

public class Issue {

	private int issueId;
	private Date issueGeneratedDate;
	private String issueCategory,issueDescription;
	
	public Issue() {
		// TODO Auto-generated constructor stub
	}
	
	public Issue(int issueId, Date issueGeneratedDate, String issueCategory,
			String issueDescription) {
		super();
		this.issueId = issueId;
		this.issueGeneratedDate = issueGeneratedDate;
		this.issueCategory = issueCategory;
		this.issueDescription = issueDescription;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public Date getIssueGeneratedDate() {
		return issueGeneratedDate;
	}

	public void setIssueGeneratedDate(Date issueGeneratedDate) {
		this.issueGeneratedDate = issueGeneratedDate;
	}

	public String getIssueCategory() {
		return issueCategory;
	}

	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((issueCategory == null) ? 0 : issueCategory.hashCode());
		result = prime
				* result
				+ ((issueDescription == null) ? 0 : issueDescription.hashCode());
		result = prime
				* result
				+ ((issueGeneratedDate == null) ? 0 : issueGeneratedDate
						.hashCode());
		result = prime * result + issueId;
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
		Issue other = (Issue) obj;
		if (issueCategory == null) {
			if (other.issueCategory != null)
				return false;
		} else if (!issueCategory.equals(other.issueCategory))
			return false;
		if (issueDescription == null) {
			if (other.issueDescription != null)
				return false;
		} else if (!issueDescription.equals(other.issueDescription))
			return false;
		if (issueGeneratedDate == null) {
			if (other.issueGeneratedDate != null)
				return false;
		} else if (!issueGeneratedDate.equals(other.issueGeneratedDate))
			return false;
		if (issueId != other.issueId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueGeneratedDate="
				+ issueGeneratedDate + ", issueCategory=" + issueCategory
				+ ", issueDescription=" + issueDescription + "]";
	}
	
	
}
