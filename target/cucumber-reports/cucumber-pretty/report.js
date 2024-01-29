$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to Add Product",
  "description": "",
  "id": "as-a-user,-i-want-to-add-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11420847600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successful login using valid account",
  "description": "",
  "id": "as-a-user,-i-want-to-add-product;successful-login-using-valid-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@ValidLogin"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login from login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Submit email using \"admin@ojas-it.com\" and password using \"Admin@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Success login to home page with displaying account button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.login_from_login_page()"
});
formatter.result({
  "duration": 507991800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@ojas-it.com",
      "offset": 20
    },
    {
      "val": "Admin@123",
      "offset": 59
    }
  ],
  "location": "LoginSteps.submit_email_using_and_password_using(String,String)"
});
formatter.result({
  "duration": 938023200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.success_login_to_home_page_with_displaying_account_button()"
});
formatter.result({
  "duration": 2583618200,
  "status": "passed"
});
formatter.after({
  "duration": 1996493000,
  "status": "passed"
});
formatter.before({
  "duration": 8890165800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Successful login using valid account",
  "description": "",
  "id": "as-a-user,-i-want-to-add-product;successful-login-using-valid-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@ValidLogin"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Login from login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Submit email using \"admin@ojas-it.com\" and password using \"Admin@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Success login to home page with displaying account button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.login_from_login_page()"
});
formatter.result({
  "duration": 163261500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@ojas-it.com",
      "offset": 20
    },
    {
      "val": "Admin@123",
      "offset": 59
    }
  ],
  "location": "LoginSteps.submit_email_using_and_password_using(String,String)"
});
formatter.result({
  "duration": 891742000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.success_login_to_home_page_with_displaying_account_button()"
});
