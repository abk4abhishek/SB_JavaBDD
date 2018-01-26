$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomepageSearch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    },
    {
      "line": 19,
      "value": "#@tag"
    },
    {
      "line": 20,
      "value": "#Feature: Title of your feature"
    },
    {
      "line": 21,
      "value": "#I want to use this template for my feature file"
    },
    {
      "line": 22,
      "value": "#"
    },
    {
      "line": 23,
      "value": "#@tag1"
    },
    {
      "line": 24,
      "value": "#Scenario: Title of your scenario"
    },
    {
      "line": 25,
      "value": "#Given I want to write a step with precondition"
    },
    {
      "line": 26,
      "value": "#And some other precondition"
    },
    {
      "line": 27,
      "value": "#When I complete action"
    },
    {
      "line": 28,
      "value": "#And some other action"
    },
    {
      "line": 29,
      "value": "#And yet another action"
    },
    {
      "line": 30,
      "value": "#Then I validate the outcomes"
    },
    {
      "line": 31,
      "value": "#And check more outcomes"
    },
    {
      "line": 32,
      "value": "#"
    },
    {
      "line": 33,
      "value": "#@tag2"
    },
    {
      "line": 34,
      "value": "#Scenario Outline: Title of your scenario outline"
    },
    {
      "line": 35,
      "value": "#Given I want to write a step with \u003cname\u003e"
    },
    {
      "line": 36,
      "value": "#When I check for the \u003cvalue\u003e in step"
    },
    {
      "line": 37,
      "value": "#Then I verify the \u003cstatus\u003e in step"
    },
    {
      "line": 38,
      "value": "#"
    },
    {
      "line": 39,
      "value": "#Examples:"
    },
    {
      "line": 40,
      "value": "#| name  | value | status  |"
    },
    {
      "line": 41,
      "value": "#| name1 |     5 | success |"
    },
    {
      "line": 42,
      "value": "#| name2 |     7 | Fail    |"
    }
  ],
  "line": 45,
  "name": "Homepage Search",
  "description": "",
  "id": "homepage-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 47,
  "name": "Performing Web search from Home page",
  "description": "",
  "id": "homepage-search;performing-web-search-from-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 48,
  "name": "User is on Home Page of SPIX",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "User inputs Search term in the Search Box",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User clicks Go button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User navigates to Web Search page",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Page Title is Startpage Web Search",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page_of_SPIX()"
});
formatter.result({
  "duration": 10728082742,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_inputs_Search_term_in_the_Search_Box()"
});
formatter.result({
  "duration": 199809095,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_clicks_Go_button()"
});
formatter.result({
  "duration": 19788023355,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_navigates_to_Web_Search_page()"
});
formatter.result({
  "duration": 25114426,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.page_Title_is_Startpage_Web_Search()"
});
formatter.result({
  "duration": 662158979,
  "status": "passed"
});
});