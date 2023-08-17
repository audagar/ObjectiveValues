Feature: Outline Objectives Test cases

  Scenario Outline: Check Objectives Values
    Given all the five lbl_val and txt_val
    When check all five values
    Then Total Balence

    Examples: Objectives Values
      | value1      | value2  | value3      | value4     | value5  | Total Balence |
      | $122,365.24 | $599.00 | $850,139.99 | $23,329.50 | $566.27 | $1,000,000.00 |
