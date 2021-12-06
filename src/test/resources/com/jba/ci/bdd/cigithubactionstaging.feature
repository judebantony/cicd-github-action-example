@Staging
Feature: Test Health Check Rest API
  Scenario: Health Check Api call is successful 

    Given user wants to call health check api
    When user call health check api with the url "http://35.194.14.180/api/v1"
    Then return result
