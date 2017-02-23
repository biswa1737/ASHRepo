$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/ASH Automation/ASH Automation/src/test/java/ASHFormBuilder/Features/scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Test Ash FormBuilder application",
  "description": "",
  "id": "test-ash-formbuilder-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20579247569,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Background User should have formbuilder url"
    }
  ],
  "line": 5,
  "name": "Verify the preview after adding project mastercontrol",
  "description": "",
  "id": "test-ash-formbuilder-application;verify-the-preview-after-adding-project-mastercontrol",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User should be logged in to formbuilder application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I drag and drop project control to tab1 of formbuilder",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I edit controls in tab1 of formbuilder",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I rename tab1 as Project",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Click on Save and go to Preview",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify in the Preview tab",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Logout of the application",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_should_be_logged_in_to_formbuilder_application()"
});
formatter.result({
  "duration": 24270970962,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_drag_and_drop_project_control_to_tab1_of_formbuilder()"
});
formatter.result({
  "duration": 4843930698,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_edit_controls_in_tab1_of_formbuilder()"
});
formatter.result({
  "duration": 27421270133,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[contains(@id,\u0027frmb-0-fld-2-2-edit\u0027)]\"}\n  (Session info: chrome\u003d56.0.2924.87)\n  (Driver info: chromedriver\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 13.24 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027ravban-dsk-032\u0027, ip: \u0027192.168.6.210\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf), userDataDir\u003dC:\\Users\\BISWAJ~1.TRI\\AppData\\Local\\Temp\\scoped_dir7372_29319}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d56.0.2924.87, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 54b20224c9a2228260c9e3a6eb25f24a\n*** Element info: {Using\u003dxpath, value\u003d//*[contains(@id,\u0027frmb-0-fld-2-2-edit\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat ASHFormBuilder.PageObjects.poMasterControl.innerElementEdit(poMasterControl.java:164)\r\n\tat ASHFormBuilder.Steps.Steps.i_edit_controls_in_tab1_of_formbuilder(Steps.java:91)\r\n\tat ✽.And I edit controls in tab1 of formbuilder(D:/ASH Automation/ASH Automation/src/test/java/ASHFormBuilder/Features/scenario.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.i_rename_tab1_as_Project()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_click_on_save_and_go_to_Preview()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_verify_in_the_Preview_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.logout_of_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 36655,
  "status": "passed"
});
});