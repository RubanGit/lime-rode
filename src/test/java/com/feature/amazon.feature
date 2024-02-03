Feature: mobile price

Scenario:Checking mobile price in amazon

Given  User lauch browser "chrome"
Where  User launch the Url"https://www.amazon.in/"
And  User enter <Moble> 
And Use enter <price>
Then Use close browser


Example:
        
        |Mobile    | price   |
        |poco      | 15k     |
        |Vivo      | 18k     |