$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stepdefination/routine.feature");
formatter.feature({
  "line": 1,
  "name": "Attitude Matters",
  "description": "\r\nIn order to understand Attitude\r\nAs a working guy\r\nI want to know whom to wish",
  "id": "attitude-matters",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "I am a Employee and my attitude",
  "description": "",
  "id": "attitude-matters;i-am-a-employee-and-my-attitude",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tester"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I work in Late nights",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I meet Watchman",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "i greet him",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I work in Mornings",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I meet Newspaper",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "i don\u0027t greet him",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Late nights",
      "offset": 10
    }
  ],
  "location": "AtitudeTest.ln(String)"
});
formatter.result({
  "duration": 534941371,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Mornings",
      "offset": 10
    }
  ],
  "location": "AtitudeTest.ln(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});