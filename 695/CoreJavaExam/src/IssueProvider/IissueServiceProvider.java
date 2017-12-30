
package IssueProvider;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IissueServiceProvider {
	
	public boolean createIssue(Issue newIssue) throws SQLException;
	public boolean deleteIssue(int issueId)throws SQLException;
	public boolean updateIssue(int issueId, Issue updatedIssue)throws SQLException;
	public Issue getIssue(int issueId)throws SQLException;
	public ArrayList<Issue> getAllIssues()throws SQLException;

}
