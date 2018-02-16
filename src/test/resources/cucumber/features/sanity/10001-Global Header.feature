@10001 @regression @Sprint1
Feature: 10001 - Sprint 1

  Scenario: Verify Home Page
  	Given I am at the RCG Enabled Banking site Home Page
  	Then I should see Menu 1 Active
  	Then I should see Menu 2 Inactive
  	Then I should see Menu 3 Inactive
  	Then I should see Menu 4 Inactive
  	Then I should see Menu 5 Inactive
	Then I should see Sub-Menu 1
	Then I should see Sub-Menu 2
	Then I should see Sub-Menu 3
  	# Then I should see Home Content
  	Then I should see Global Headers
  	Then I should see Global Footers