$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Myntra.feature");
formatter.feature({
  "name": "To Validate the functionality of Myntra application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature3"
    }
  ]
});
formatter.scenario({
  "name": "Search Item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature3"
    },
    {
      "name": "@Sanity1"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Myntra.to_launch_the_chrome_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Type and search the T-Shirt product",
  "keyword": "When "
});
formatter.match({
  "location": "Myntra.to_Type_and_search_the_T_Shirt_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Select the first product and select the M size",
  "keyword": "When "
});
formatter.match({
  "location": "Myntra.to_Select_the_first_product_and_select_the_M_size()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the Add To Bag button and close the current tab",
  "keyword": "And "
});
formatter.match({
  "location": "Myntra.to_click_the_Add_To_Bag_button_and_close_the_current_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the bag icon",
  "keyword": "When "
});
formatter.match({
  "location": "Myntra.to_click_the_bag_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take the screenshot selected bag",
  "keyword": "And "
});
formatter.match({
  "location": "Myntra.take_the_screenshot_selected_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Myntra.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});