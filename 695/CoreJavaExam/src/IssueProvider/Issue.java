package IssueProvider;

import java.util.*;

public class Issue {
	
	// properties
		private int issueId;
		private java.sql.Date issueGeneratedDate;
		private String issueCategory;
		private String issueDescription;
		/**
		 * @return the issueId
		 */
		public int getIssueId() {
			return issueId;
		}
		/**
		 * @param issueId the issueId to set
		 */
		public void setIssueId(int issueId) {
			this.issueId = issueId;
		}
		/**
		 * @return the issueGeneratedDate
		 */
		public java.sql.Date getIssueGeneratedDate() {
			return  issueGeneratedDate;
		}
		/**
		 * @param issueGeneratedDate the issueGeneratedDate to set
		 */
		public void setIssueGeneratedDate(java.sql.Date issueGeneratedDate) {
			this.issueGeneratedDate = issueGeneratedDate;
		}
		/**
		 * @return the issueCategory
		 */
		public String getIssueCategory() {
			return issueCategory;
		}
		/**
		 * @param issueCategory the issueCategory to set
		 */
		public void setIssueCategory(String issueCategory) {
			this.issueCategory = issueCategory;
		}
		/**
		 * @return the issueDescription
		 */
		public String getIssueDescription() {
			return issueDescription;
		}
		/**
		 * @param issueDescription the issueDescription to set
		 */
		public void setIssueDescription(String issueDescription) {
			this.issueDescription = issueDescription;
		}
		/**
		 * @param issueId
		 * @param issueGeneratedDate
		 * @param issueCategory
		 * @param issueDescription
		 */
		public Issue(int issueId, java.sql.Date issueGeneratedDate, String issueCategory, String issueDescription) {
			super();
			this.issueId = issueId;
			this.issueGeneratedDate = issueGeneratedDate;
			this.issueCategory = issueCategory;
			this.issueDescription = issueDescription;
		}
		/**
		 * 
		 */
		public Issue() {
			super();
			// TODO Auto-generated constructor stub
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Issue [issueId=" + issueId + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
					+ issueCategory + ", issueDescription=" + issueDescription + "]";
		}
		
		
		
		
}
