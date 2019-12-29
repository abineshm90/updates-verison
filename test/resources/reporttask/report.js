$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/etsyaddtocart.feature");
formatter.feature({
  "name": "Etsy product purchase validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Etsy search the product to purchase validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Etsy in signin page",
  "keyword": "Given "
});
formatter.step({
  "name": "Etsy enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Etsy search the \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Etsy choose the product and enters the add to cart page",
  "keyword": "When "
});
formatter.step({
  "name": "Etsy choose the filter option, quantity and click add to cart button",
  "keyword": "And "
});
formatter.step({
  "name": "Etsy click the paybal payment and give \"\u003cpaypaluser\u003e\",\"\u003cpaypalpass\u003e\" to proceed for given address",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "product",
        "paypaluser",
        "paypalpass"
      ]
    },
    {
      "cells": [
        "Abinesh",
        "Abi12345",
        "coffemaker",
        "abinesh4567",
        "sdfgh12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Etsy search the product to purchase validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Etsy in signin page",
  "keyword": "Given "
});
formatter.match({
  "location": "Etsy.etsy_in_signin_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Etsy enters \"Abinesh\" and \"Abi12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "Etsy.etsy_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Etsy search the \"coffemaker\"",
  "keyword": "When "
});
formatter.match({
  "location": "Etsy.etsy_search_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Etsy choose the product and enters the add to cart page",
  "keyword": "When "
});
formatter.match({
  "location": "Etsy.etsy_choose_the_product_and_enters_the_add_to_cart_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Etsy choose the filter option, quantity and click add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "Etsy.etsy_choose_the_filter_option_quantity_and_click_add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Etsy click the paybal payment and give \"abinesh4567\",\"sdfgh12345\" to proceed for given address",
  "keyword": "And "
});
formatter.match({
  "location": "Etsy.etsy_click_the_paybal_payment_and_give_to_proceed_for_given_address(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/feature/loginpage.feature");
formatter.feature({
  "name": "Etsy Product checkout",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Etsy Product Add to Cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" ,\"\u003cpassword\u003e\" and enters booking page",
  "keyword": "When "
});
formatter.step({
  "name": "User now in search hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User is on select hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User is on book ahotel page",
  "keyword": "And "
});
formatter.step({
  "name": "user is on booking confirmation page",
  "keyword": "And "
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
        "abineshm900",
        "Abinesh123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "Etsy Product Add to Cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "Etsy.user_is_on_HomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters the \"abineshm900\" ,\"Abinesh123\" and enters booking page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_enters_the_and_enters_booking_page(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User now in search hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_now_in_search_hotel_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is on select hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_is_on_select_hotel_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is on book ahotel page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_is_on_book_ahotel_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is on booking confirmation page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_is_on_booking_confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
});