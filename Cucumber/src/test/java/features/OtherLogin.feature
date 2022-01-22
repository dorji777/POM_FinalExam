@OtherLoginfeature @Regression
Feature: Other TechFios Login functionality validation

@OtherScenerio1 @Smoke
Scenario Outline: User should be able to login with valid credentials
	Given User is on the Techfios login page 
	When User enters username as "<username>"
	When User enters password as "<password>"
	And User clikcks on signin button
	Then user should land on dashboard page
	
	Examples:
	|username | password |
	|demo@techfios.com | abc123 |
	