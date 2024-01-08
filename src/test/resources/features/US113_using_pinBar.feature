@login
Feature: Learn How To Use Pinbar
Background:
  Given the user is on the homepage

@wip
  Scenario: Clicking the "Learn how to use this space" link
    #Given the user is on the homepage
    When the user clicks the "Learn how to use this space" link
    Then the user should see "How To Use Pinbar"
    And User clicks pin icon

  Scenario: Verifying the image on the page
    #Given the user is on the homepage
    When the user clicks the "Learn how to use this space" link
    Then the user should see an image on the page
    #And the image source should be "/bundles/oronavigation/images/pinbar-location.jpg"


  #User Story 3: As a user, I want to learn how to use the pinbar.
  #
  #AC #1: Verify that when users click the "Learn how to use this space” link on the
  #homepage, users see:
  #“How To Use Pinbar” and
  #“Use the pin icon on the right top corner of page to create fast access link in the pinbar.”
  #Verify
  #AC #2: Verify that users see an image on the page.
  #(For automation testing, just verify the image source.)