Feature: Recruitment Add Candidate

Scenario: Admin add new candidate
Given I am on the login page
  When I enter a username and password
And Admin go to menu Recruitment
When Admin click button Add
And Admin enter firstname
And Admin enter lastname
And Admin enter email
And Admin click button save
