Feature: Login with multiple data
  @datadriven
  Scenario Outline: Attempt login with specific credentials
    Given the user is on login page
    When he enters user id as "<user>"
    And he enters user password as "<password>"
    And hits submit
    Then the user should be logged in successfully


    Examples:
    | user |password |
    |  u1  |  abc123 |
#    |  u2  |  xyz123 |
#    |  u3  |  abc321 |
#    |  u4  |  xyz321 |