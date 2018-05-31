@Homepage
Feature: feature for validating ntl homepage
Scenario Outline: validate home with valid testdata
Given open browser as <BROWSER>
Given enter url as <URL>
Then enter Username as <USERNAME>
Then enter Password as <PASSWORD>
And enter captcha as <CAPTCHA>
When click login button 
But dont click otp checkbox
Examples: 
 |BROWSER|URL|USERNAME|PASSWORD|CATCHA|
 |Firefox|https://www.irctc.co.in/eticketing/loginHome.jsf|Username a|Password a|Captcha a|
 |Firefox|https://www.irctc.co.in/eticketing/loginHome.jsf|Username b|Password b|Captcha b|
 |Firefox|https://www.irctc.co.in/eticketing/loginHome.jsf|Username c|Password c|Captcha c| 


