 @test1
Feature: Retail Page
Background:
Given User is on Retail website
And User click on MyAccount
When User click on Login
And User enter username 'userName'and password 'passWord'
And User click on Login button
Then User should be logged in to MyAccount dashboard
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on 'Register for an Affiliate Account'link
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|
|judy|www.judy.com|2022|souini|
And User check on About us check box
And User click on continue button1
Then User should see a success message
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on Edit your affiliate information link
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|bmce|1234|AE2022|ANASSE|11132018|
And User click on continue button2
Then User should see a success Message
Scenario: Edit your account Information
When User click on 'Edit your account information'link
And User modify below information
|firstname|lastName|email|telephone|
|Anasse|El Hazime|ahmed53252@gmail.com|7033388083|
And User click on continue button3
Then User Should see a message 'Success: Your account has been successfully updated.'

 