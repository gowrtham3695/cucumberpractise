$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/OrangeHRM.feature");
formatter.feature({
  "name": "this is the login for orange HRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "this is login scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMLogIn.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMLogIn.user_enters_the_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMLogIn.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "orange HRM home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMLogIn.orange_HRM_home_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});