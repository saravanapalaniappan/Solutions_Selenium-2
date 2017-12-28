package com.htc.coreJava4dao;

import com.htc.coreJava4dto.Issue;
import com.htc.coreJava4exceptions.*;


public interface IissueServiceProvider {

	public boolean createIssue(Issue iss) throws DuplicateIssueException;
	public Issue readIssue(int issueId) throws IssueNotFoundException;
	public boolean updateIssue(int issueId,String issueCategory) throws DuplicateIssueException;
	public boolean deleteIssue(int issueId) throws DuplicateIssueException;
	
}
