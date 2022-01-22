@Loginfeature @Regression
Feature: TechFios Login functionality validation
@Scenerio1 
Scenario: User should be able to login with valid credentials
	Given User is on the Techfios login page 
	When User enters username as "demo@techfios.com"
	When User enters password as "abc123"
	And User clikcks on signin button
	Then user should land on dashboard page
@Scenerio2	 
Scenario: User should be able to login with invalid username
	Given User is on the Techfios login page 
	When User enters username as "demo1@techfios.com"
	When User enters password as "abc123"
	And User clikcks on signin button
	Then user should land on dashboard page

@Scenerio3	 
Scenario: User should be able to login with invalid password
	Given User is on the Techfios login page 
	When User enters username as "demo@techfios.com"
	When User enters password as "abc124"
	And User clikcks on signin button
	Then user should land on dashboard page

@Scenerio4
Scenario: User should be able to login with invalid username & password
	Given User is on the Techfios login page 
	When User enters username as "demo1@techfios.com"
	When User enters password as "abc124"
	And User clikcks on signin button
	Then user should land on dashboard page
	