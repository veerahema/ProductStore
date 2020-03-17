$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/login.feature");
formatter.feature({
  "name": "Login",
  "description": "\tIn order to buy something\n\tAs a customer\n\tI want to get access to the portal",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with demoblaze page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_have_browser_with_demoblaze_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Signup",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter username as \u0027veerahema.g\u0027 and password as \u0027veerahema\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_enter_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get popup as \u0027Sign up successful.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_should_get_popup_as(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Sign up successful].\u003e but was:\u003c[Please fill out Username and Password].\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.cts.stepdefnitions.StepDefnition.i_should_get_popup_as(StepDefnition.java:54)\r\n\tat ✽.I should get popup as \u0027Sign up successful.\u0027(file:///C:/NewJavaSelenium/ProductStoreBDD/src/main/resources/feature/login.feature:11)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with demoblaze page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_have_browser_with_demoblaze_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid signup with blank username/password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter blankusername as \u0027\u0027 and password as \u0027veerahema\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_enter_blankusername_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get error popup as \u0027Please fill out Username and Password.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_should_get_error_popup_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Valid Credential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter username as \u0027\u003cusername\u003e\u0027 and I enter password as \u0027\u003cpassword\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should have login to the account",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "veerahemagovada@gmail.com",
        "veerahema"
      ]
    },
    {
      "cells": [
        "kavyakalathuru1998@gmail.com",
        "kavyakalathuru"
      ]
    },
    {
      "cells": [
        "oohasri234@gmail.com",
        "9493824001"
      ]
    }
  ]
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with demoblaze page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_have_browser_with_demoblaze_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Credential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter username as \u0027veerahemagovada@gmail.com\u0027 and I enter password as \u0027veerahema\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_enter_username_as_and_I_enter_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should have login to the account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_should_have_login_to_the_account()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with demoblaze page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_have_browser_with_demoblaze_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Credential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter username as \u0027kavyakalathuru1998@gmail.com\u0027 and I enter password as \u0027kavyakalathuru\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_enter_username_as_and_I_enter_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should have login to the account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_should_have_login_to_the_account()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with demoblaze page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_have_browser_with_demoblaze_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Credential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter username as \u0027oohasri234@gmail.com\u0027 and I enter password as \u00279493824001\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_enter_username_as_and_I_enter_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should have login to the account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_should_have_login_to_the_account()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with demoblaze page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_have_browser_with_demoblaze_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Password Credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter valid username as \u0027veerahemagovada@gmail.com\u0027 and invalid password as \u002723drttun5\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_enter_username_as_and_invalid_password_as1(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get error popup message as \u0027Wrong password.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefnitions.StepDefnition.i_should_get_error_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});