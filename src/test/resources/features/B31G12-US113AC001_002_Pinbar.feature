@B31G12-140
Feature: Learn How To Use Pinbar
  Background:
    Given the user logged in with username as "User1" and password as "UserUser123"

    Scenario:Verify that when users click the “Learn how to use this space” link
      When the user clicks the "Learn how to use this space" link
      Then the user should see "How To Use Pinbar"
      And "user should see "Use the pin" icon on the right top corner of page to create fast access link in the pinbar.

      Scenario: Verify that users see an image on the pages.
        When the user clicks the "Learn how to use this space" link
        Then verify that users see an image on the page.

