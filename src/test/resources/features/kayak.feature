#Author: jhonnyocampo14@gmail.com
Feature: As a Kayak's client I want to flight from Medellin to San Francisco

  Background: Enter to the kayak home page
    Given that I am in the Kayak home page

  @FlightToSanFrancisco
  Scenario: Search flights in Kayak
    When I search the flight with my schedule
    Then I should see the offer with the lowest price
