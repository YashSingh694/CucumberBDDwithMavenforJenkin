$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers1.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Delete the user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "User can view Dashboad",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.step({
  "name": "Enter customer EMail as \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.step({
  "name": "User should found Email \"\u003cemail\u003e\" as in the Search table",
  "keyword": "Then "
});
formatter.step({
  "name": "click on EditBtn",
  "keyword": "When "
});
formatter.step({
  "name": "Page Title should be \"Edit customer details / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Add the following details",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Yash"
      ]
    },
    {
      "cells": [
        "Singh"
      ]
    },
    {
      "cells": [
        "Testing Edit functionality"
      ]
    }
  ]
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "name": "User can view confirmation message \"The customer has been updated successfully.\"",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "victoria_victoria@nopCommerce.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Delete the user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Testing"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboad",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_can_view_Dashboad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer EMail as \"victoria_victoria@nopCommerce.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.enter_customer_EMail_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Email \"victoria_victoria@nopCommerce.com\" as in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_should_found_Email_as_in_the_Search_table(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on EditBtn",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.click_on_EditBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Edit customer details / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add the following details",
  "rows": [
    {
      "cells": [
        "Yash"
      ]
    },
    {
      "cells": [
        "Singh"
      ]
    },
    {
      "cells": [
        "Testing Edit functionality"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.add_the_following_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view confirmation message \"The customer has been updated successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_can_view_confirmation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.close_browser()"
});
formatter.result({
  "status": "passed"
});
});