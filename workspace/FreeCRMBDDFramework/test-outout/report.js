$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/pautp/workspace/FreeCRMBDDFramework/src/main/java/Features/dealsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Map Data creation",
  "description": "",
  "id": "deal-map-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM create a New Deal Scenario",
  "description": "",
  "id": "deal-map-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "sharvutpat",
        "prachi"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User moves to New Deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enters deals details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal1",
        "100",
        "10",
        "20"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal2",
        "110",
        "20",
        "30"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal3",
        "120",
        "30",
        "40"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal4",
        "130",
        "50",
        "60"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 12844849362,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.title_is_Free_CRM()"
});
formatter.result({
  "duration": 42932459,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 814600978,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4130779678,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 10507700,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_moves_to_New_Deals_page()"
});
formatter.result({
  "duration": 5454182256,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_deals_details(DataTable)"
});
formatter.result({
  "duration": 23123258267,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.User_closes_browser()"
});
formatter.result({
  "duration": 839227938,
  "status": "passed"
});
});