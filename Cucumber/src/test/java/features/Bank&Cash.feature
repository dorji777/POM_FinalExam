@OtherLoginfeature
Feature: Bank & Cash New Account open

@OtherScenerio @Smoke
Scenario Outline: user should open new account

Given User is on Dashboard page		
When User click on bankCash								
And User click on newAccount	
Then User should land on Accounts Page
And User enter accounttitle as "<accounttitle>"
And User enter descriptive as "<descriptive>"
And User enter initial balance as "<balance>"
And User enter Account Number as "<accountno>"
And User enter Contact Person as "<contactPerson>"
And User enter phoneNo as "<phone>"
And User enter Internet banking URL as "<url>"
And User clicks on "Submit"
Then User should be able to validate account created successfully

	Examples:	 
	|accounttitle|descriptive|balance|accountno|contactPerson|phone|url|
	|Saving|SavingAccount|20000|456789|Dorji|4566571111|http://www.bob.bt|

 
  