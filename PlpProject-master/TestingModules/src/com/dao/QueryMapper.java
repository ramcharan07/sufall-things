package com.dao;

public interface QueryMapper {
	
	public String INSERT_QUERY = "INSERT INTO accountDetails VALUES(?,?,?,?,?,?,?,?,?)";
	public String FIND_AGENT_NAME = "Select username from profileDetails where username=?";
	public String VIEW_POLICY_DETAILS_QUERY = "select a.policy_number,b.business_segment,a.account_number,a.premium from policyDetails a,businessReport b, accountdetails c where c.username=? and c.account_number=a.account_number and  a.policy_number=b.policy_number";
	public String SEARCH_POLICY = "Select question,answer1,answer2,answer3 from question_bank where business_Segment=?";
	public String CREATE_POLICY = "Insert into reportgeneration values(?,?,?,?)";
	public String FIND_ROLE = "Select rolecode from profiledetails where username=?";
	public String CREATE_PROFILE = "Insert into profileDetails values(?,?,?)";
    public String VALIDATE_USER="Select rolecode from userlogin where username=? and password=?";
    public String CHECK_ACCOUNT="select username from accounDetails where username=?";
	public String AGENT_VIEW_POLICY_QUERY = "select insured_name,account_number,business_segment from accountdetails where agent_name=?";
	public String ADMIN_VIEW_POLICY_DETAILS_QUERY = "select c.agent_name,c.insured_name,a.policy_number,b.business_segment,a.account_number,a.premium from policyDetails a,businessReport b, accountdetails c where c.account_number=a.account_number and  a.policy_number=b.policy_number";
}
