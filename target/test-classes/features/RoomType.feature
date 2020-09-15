
Feature: Verifying adactin functionalities
@retest
Scenario Outline: Verifying adactin booking based on different room types
Given User should launch adactin page in browser
When User should enter the "<username>" and "<password>"
Then User should click the login button
And User should select "<location>","<hotel>","<room type>","<numofrooms>","<checkin>","<checkout>","<adults>","<children>"
Then User should click search button
And user should click select button
Then user should click continue button
And user should enter "<firstname>","<lastname>","<address>","<card num>","<card type>","<expmonth>","<expyear>","<cvv>"
And user should click booknow button
And user should get the order id

Examples:
|username|password|location|hotel|room type|numofrooms|checkin|checkout|adults|children|firstname|lastname|address|card num|card type|expmonth|expyear|cvv|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|2 - Two|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Standard|2 - Two|24/08/20|25/08/20|2 - Two|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Super Deluxe|2 - Two|24/08/20|25/08/20|3 - Three|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Double|2 - Two|24/08/20|25/08/20|4 - Four|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
