
@tag
Feature: Sparsh-contact

  #@tag1
  #Scenario: validate the contact us page
   #Given user should open chrome browser and enter url
   #When navigate to url of sparsh hospital
   #And user enter firstname, lastname, phone no, email address, search hospital, type of enquiry 
   #And click on send
   #Then getting thank you message.
  
  

  @tag2
  Scenario Outline: Title of your scenario outline
   Given user should open chrome browser and enter url
    When navigate to url of sparsh hospital
    And user enter "<firstname>", "<lastname>", "<phoneno>", "<emaiaddress>"
    Then getting thank you message.

    Examples: 
      | firstname  | lastname | phoneno    |emaiaddress      |
      | virat      |    kohli |9281818181  |virat@gmail.com  |
      | Rohit      |   sharma |9284545454  |rohit@gmail.com  |
