package IssueProvider;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import IssueProvider.*;

public class IssueServiceProviderImpl implements IissueServiceProvider {

	@Override
	public boolean createIssue(Issue newIssue) throws SQLException {
		
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call createIssue(?,?,?,?)}");
		cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
		cstmt.setInt(2, newIssue.getIssueId());
		cstmt.setDate(3, newIssue.getIssueGeneratedDate());
		cstmt.setString(4, newIssue.getIssueCategory());
		cstmt.setString(5, newIssue.getIssueDescription());
		
		//cstmt.setTimestamp(3, new Timestamp(utilDate.getTime()));

		cstmt.execute();
		int flag = cstmt.getInt(1);
		if (flag == 1)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean deleteIssue(int issueId) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call deleteissue(?)}");
		cstmt.registerOutParameter(1, Types.BOOLEAN);
		cstmt.setInt(2, issueId);
		
		cstmt.execute();
		if (cstmt.getBoolean(1)) 
			return true;
		else
			return false;
	}

	@Override
	public boolean updateIssue(int updatedissueId, Issue updatedIssue) throws SQLException {
		
		
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call updateissue(?,?,?,?)}");
		cstmt.registerOutParameter(1, Types.BOOLEAN);
		cstmt.setInt(2, updatedissueId);
		cstmt.setDate(3, updatedIssue.getIssueGeneratedDate());
		cstmt.setString(4, updatedIssue.getIssueCategory());
		cstmt.setString(5, updatedIssue.getIssueDescription());
		
		cstmt.execute();
		if (cstmt.getBoolean(1)) 
			return true;
		else
			return false;
			
	}

	@Override
	public Issue getIssue(int issueId) throws SQLException {
		
		Connection con = DBConnector.getConnection();
		Issue retrieveissue=null;
		PreparedStatement ps = con.prepareStatement("SELECT issuegenerateddate, issuecategory, issuedescription FROM issuetable WHERE issueid=?");
		ps.setInt(1, issueId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		retrieveissue=new Issue(issueId, rs.getDate(1), rs.getString(2), rs.getString(3));
		return retrieveissue;		
	
	}

	@Override
	public ArrayList<Issue> getAllIssues() throws SQLException {
		ArrayList<Issue>allissues = new ArrayList<>();
		Connection con = DBConnector.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT issueid, issuegenerateddate, issuecategory, issuedescription FROM issuetable");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			allissues.add(new Issue(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4)));
		}
		
		return allissues;		
		
	}

}
