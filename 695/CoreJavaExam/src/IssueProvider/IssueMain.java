package IssueProvider;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import IssueProvider.*;

public class IssueMain {
	
	private static java.sql.Date getCurrentDate() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}
	
public static void main(String[] args) {
		
		try {
			
			
			IssueServiceProviderImpl IssueCRUD= new IssueServiceProviderImpl();
			
			//Create Issues
			System.out.println( "Create Issues..." );
			boolean insertflag=IssueCRUD.createIssue(new Issue(0001,getCurrentDate(), "Application Issue", "Application not getting Launched"));
			System.out.println("Insert Flag for 1st issue:"+insertflag);
			 insertflag=IssueCRUD.createIssue(new Issue(0002,getCurrentDate(), "Environment Issue", "Environment set-up"));
			System.out.println("Insert Flag for 2nd issue :"+insertflag);
			 insertflag=IssueCRUD.createIssue(new Issue(0003,getCurrentDate(), "Firewall Issue", "Firewall security issue"));
			System.out.println("Insert Flag for 3rd issue:"+insertflag);
			 insertflag=IssueCRUD.createIssue(new Issue(0004,getCurrentDate(), "Connection Issue", "Connection not getting Established"));
			System.out.println("Insert Flag for 4th issue :"+insertflag);
			 insertflag=IssueCRUD.createIssue(new Issue(0005,getCurrentDate(), "Data Issue", "Incorrect Data"));
			System.out.println("Insert Flag for 5th issue:"+insertflag);
			System.out.println( "\n\n\n" );
			
			// get all Issues after insert
			System.out.println( "get all Issues after insert..." );
			for(Issue Issues:IssueCRUD.getAllIssues()) {
				System.out.println(Issues.toString());
			}
			System.out.println( "\n\n\n" );	
			
			//Retrieve Issue before update
			System.out.println( "Retrieve Issue before update..." );
			Issue retIssue=IssueCRUD.getIssue(0001);
			System.out.println(retIssue.toString());
			System.out.println( "Update Issue..." );
			
			//Update Issue
			Issue updatedIssue = new Issue();
			updatedIssue.setIssueGeneratedDate(getCurrentDate());
			updatedIssue.setIssueCategory("Database Issue");
			updatedIssue.setIssueDescription("Database reloaded");
			boolean updateflag=IssueCRUD.updateIssue(001, updatedIssue);
			System.out.println("update Flag:"+updateflag);
			
			//Retrieve Issue after update
			System.out.println( "Retrieve Issue after update..." );
			retIssue=IssueCRUD.getIssue(0001);
			System.out.println(retIssue.toString());
			System.out.println( "\n\n\n" );	
			
			//Retrieve Issue before delete
			System.out.println( "Retrieve Issue before delete..." );
			retIssue=IssueCRUD.getIssue(0005);
			System.out.println(retIssue.toString());
			System.out.println( "Delete Issue..." );			
			//Delete Issue 005
			boolean deleteFlag=IssueCRUD.deleteIssue(005);
			System.out.println("delete Flag:"+deleteFlag);
			
			// Print all Issues after delete
			System.out.println( "Retrieve All Issue after delete..." );
			for(Issue Issues:IssueCRUD.getAllIssues()) {
							System.out.println(Issues.toString());
						}
						
						
						
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	

}
