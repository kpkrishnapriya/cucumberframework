Feature:Login
Scenario: LoginPass
Given at saucedemo
When user enter password "tested" 
And enter username as "testuname"
Then redirect to user Home page