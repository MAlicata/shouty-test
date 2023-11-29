Feature: Hear shout
  Scenario: Listener is within range
    Given Lucy is standing 1 metre from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener hears a different message
    Given Lucy is 15 metres from Sean
    When Sean shout "Free coffee!"
    Then Lucy should hear Sean's message

