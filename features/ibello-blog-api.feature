# language: en
# namespace: Api
#Test for ibello api calls
@full-test @api
Feature: Test for ibello api calls

Scenario: Test api call
	When Api: I query the blog articles
	Then Api: The queried articles are displayed correctly
