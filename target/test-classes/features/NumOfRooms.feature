
Feature: Verifying adactin functionalities
@Smoke
Scenario Outline: Verifying adactin booking based on number of rooms
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

|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|1 - One|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|2 - Two|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|

|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|3 - Three|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|4 - Four|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|

|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|5 - Five|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|6 - Six|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|7 - Seven|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|

|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|8 - Eight|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|9 - Nine|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|
|divyakrish|divyakrish|Sydney|Hotel Sunshine|Deluxe|10 - Ten|24/08/20|25/08/20|1 - One|0 - None|divya|sri|bangalore|6543217895643245|VISA|May|2021|123|

