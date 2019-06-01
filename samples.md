# RingCentral Java SDK Code Samples


## Get API Versions

HTTP GET `/restapi`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi().list();
rc.revoke();
```


- `result` is of type [GetVersionsResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetVersionsResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersions) in API Explorer.


## Revoke Token

HTTP POST `/restapi/oauth/revoke`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi().oauth().revoke().post(revokeTokenRequest);
rc.revoke();
```

- Parameter `revokeTokenRequest` is of type [RevokeTokenRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/RevokeTokenRequest.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Authentication-revokeToken) in API Explorer.


## Get Token

HTTP POST `/restapi/oauth/token`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi().oauth().token().post(getTokenRequest);
rc.revoke();
```

- Parameter `getTokenRequest` is of type [GetTokenRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetTokenRequest.cs)
- `result` is of type [TokenInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/TokenInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Authentication-getToken) in API Explorer.


## Get Version Info

HTTP GET `/restapi/{apiVersion}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).get();
rc.revoke();
```


- `result` is of type [GetVersionResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetVersionResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersion) in API Explorer.


## Get Account Info

HTTP GET `/restapi/v1.0/account/{accountId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).get();
rc.revoke();
```


- `result` is of type [GetAccountInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetAccountInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountInfo) in API Explorer.


## Get Company Active Calls

HTTP GET `/restapi/v1.0/account/{accountId}/active-calls`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).activecalls().get(listCompanyActiveCallsParameters);
rc.revoke();
```

- Parameter `listCompanyActiveCallsParameters` is of type [ListCompanyActiveCallsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListCompanyActiveCallsParameters.cs)
- `result` is of type [ActiveCallsResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ActiveCallsResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listCompanyActiveCalls) in API Explorer.


## Create Company Call Handling Rule

HTTP POST `/restapi/v1.0/account/{accountId}/answering-rule`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).answeringrule().post(companyAnsweringRuleRequest);
rc.revoke();
```

- Parameter `companyAnsweringRuleRequest` is of type [CompanyAnsweringRuleRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleRequest.cs)
- `result` is of type [CompanyAnsweringRuleInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-createCompanyAnsweringRule) in API Explorer.


## Get Company Call Handling Rule List

HTTP GET `/restapi/v1.0/account/{accountId}/answering-rule`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).answeringrule().list();
rc.revoke();
```


- `result` is of type [CompanyAnsweringRuleList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listCompanyAnsweringRules) in API Explorer.


## Get Company Call Handling Rule

HTTP GET `/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).answeringrule(ruleid).get();
rc.revoke();
```


- `result` is of type [CompanyAnsweringRuleInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readCompanyAnsweringRule) in API Explorer.


## Update Company Call Handling Rule

HTTP PUT `/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).answeringrule(ruleid).put(companyAnsweringRuleUpdate);
rc.revoke();
```

- Parameter `companyAnsweringRuleUpdate` is of type [CompanyAnsweringRuleUpdate](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleUpdate.cs)
- `result` is of type [CompanyAnsweringRuleInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-updateCompanyAnsweringRule) in API Explorer.


## Delete Company Call Handling Rule

HTTP DELETE `/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).answeringrule(ruleid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-deleteCompanyAnsweringRule) in API Explorer.


## Get Account Business Address

HTTP GET `/restapi/v1.0/account/{accountId}/business-address`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).businessaddress().get();
rc.revoke();
```


- `result` is of type [AccountBusinessAddressResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountBusinessAddress) in API Explorer.


## Update Company Business Address

HTTP PUT `/restapi/v1.0/account/{accountId}/business-address`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).businessaddress().put(modifyAccountBusinessAddressRequest);
rc.revoke();
```

- Parameter `modifyAccountBusinessAddressRequest` is of type [ModifyAccountBusinessAddressRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ModifyAccountBusinessAddressRequest.cs)
- `result` is of type [AccountBusinessAddressResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Company-updateAccountBusinessAddress) in API Explorer.


## Get Company Business Hours

HTTP GET `/restapi/v1.0/account/{accountId}/business-hours`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).businesshours().get();
rc.revoke();
```


- `result` is of type [CompanyBusinessHours](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyBusinessHours.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-readCompanyBusinessHours) in API Explorer.


## Update Company Business Hours

HTTP PUT `/restapi/v1.0/account/{accountId}/business-hours`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).businesshours().put(companyBusinessHoursUpdateRequest);
rc.revoke();
```

- Parameter `companyBusinessHoursUpdateRequest` is of type [CompanyBusinessHoursUpdateRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyBusinessHoursUpdateRequest.cs)
- `result` is of type [CompanyBusinessHours](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyBusinessHours.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateCompanyBusinessHours) in API Explorer.


## Get Company Call Log Records

HTTP GET `/restapi/v1.0/account/{accountId}/call-log`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).calllog().list(readCompanyCallLogParameters);
rc.revoke();
```

- Parameter `readCompanyCallLogParameters` is of type [ReadCompanyCallLogParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadCompanyCallLogParameters.cs)
- `result` is of type [AccountCallLogResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AccountCallLogResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallLog) in API Explorer.


## Get Company Call Log Record(s)

HTTP GET `/restapi/v1.0/account/{accountId}/call-log/{callRecordId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).calllog(callrecordid).get();
rc.revoke();
```


- `result` is of type [CompanyCallLogRecord](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyCallLogRecord.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallRecord) in API Explorer.


## Create Call Monitoring Group

HTTP POST `/restapi/v1.0/account/{accountId}/call-monitoring-groups`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callmonitoringgroups().post(createCallMonitoringGroupRequest);
rc.revoke();
```

- Parameter `createCallMonitoringGroupRequest` is of type [CreateCallMonitoringGroupRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.cs)
- `result` is of type [CallMonitoringGroup](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallMonitoringGroup.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Account-Provisioning-createCallMonitoringGroup) in API Explorer.


## Get Call Monitoring Groups List

HTTP GET `/restapi/v1.0/account/{accountId}/call-monitoring-groups`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callmonitoringgroups().get(listCallMonitoringGroupsParameters);
rc.revoke();
```

- Parameter `listCallMonitoringGroupsParameters` is of type [ListCallMonitoringGroupsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupsParameters.cs)
- `result` is of type [CallMonitoringGroups](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallMonitoringGroups.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Account-Provisioning-listCallMonitoringGroups) in API Explorer.


## Updates Call Monitoring Group

HTTP PUT `/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callmonitoringgroups(groupid).put(createCallMonitoringGroupRequest);
rc.revoke();
```

- Parameter `createCallMonitoringGroupRequest` is of type [CreateCallMonitoringGroupRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.cs)
- `result` is of type [CallMonitoringGroup](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallMonitoringGroup.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Account-Provisioning-updateCallMonitoringGroup) in API Explorer.


## Delete Call Monitoring Group

HTTP DELETE `/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callmonitoringgroups(groupid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Account-Provisioning-deleteCallMonitoringGroup) in API Explorer.


## Update Call Monitoring Group List

HTTP POST `/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callmonitoringgroups(groupid).bulkassign().post(callMonitoringBulkAssign);
rc.revoke();
```

- Parameter `callMonitoringBulkAssign` is of type [CallMonitoringBulkAssign](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallMonitoringBulkAssign.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Account-Provisioning-updateCallMonitoringGroupList) in API Explorer.


## Get Call Monitoring Group Member List

HTTP GET `/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/members`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callmonitoringgroups(groupid).members().get(listCallMonitoringGroupMembersParameters);
rc.revoke();
```

- Parameter `listCallMonitoringGroupMembersParameters` is of type [ListCallMonitoringGroupMembersParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupMembersParameters.cs)
- `result` is of type [CallMonitoringGroupMemberList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallMonitoringGroupMemberList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Account-Provisioning-listCallMonitoringGroupMembers) in API Explorer.


## Get Call Queues

HTTP GET `/restapi/v1.0/account/{accountId}/call-queues`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callqueues().get(listCallQueuesParameters);
rc.revoke();
```

- Parameter `listCallQueuesParameters` is of type [ListCallQueuesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListCallQueuesParameters.cs)
- `result` is of type [CallQueues](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallQueues.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listCallQueues) in API Explorer.


## Assign Multiple Call Queue Members

HTTP POST `/restapi/v1.0/account/{accountId}/call-queues/{groupId}/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callqueues(groupid).bulkassign().post(callQueueBulkAssignResource);
rc.revoke();
```

- Parameter `callQueueBulkAssignResource` is of type [CallQueueBulkAssignResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallQueueBulkAssignResource.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-assignMultipleCallQueueMembers) in API Explorer.


## Get Call Queue Members

HTTP GET `/restapi/v1.0/account/{accountId}/call-queues/{groupId}/members`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callqueues(groupid).members().get(listCallQueueMembersParameters);
rc.revoke();
```

- Parameter `listCallQueueMembersParameters` is of type [ListCallQueueMembersParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListCallQueueMembersParameters.cs)
- `result` is of type [CallQueueMembers](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallQueueMembers.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listCallQueueMembers) in API Explorer.


## Get Call Recording Settings

HTTP GET `/restapi/v1.0/account/{accountId}/call-recording`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callrecording().get();
rc.revoke();
```


- `result` is of type [CallRecordingSettingsResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readCallRecordingSettings) in API Explorer.


## Update Call Recording Settings

HTTP PUT `/restapi/v1.0/account/{accountId}/call-recording`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callrecording().put(callRecordingSettingsResource);
rc.revoke();
```

- Parameter `callRecordingSettingsResource` is of type [CallRecordingSettingsResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.cs)
- `result` is of type [CallRecordingSettingsResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-updateCallRecordingSettings) in API Explorer.


## Update Call Recording Extension List

HTTP POST `/restapi/v1.0/account/{accountId}/call-recording/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callrecording().bulkassign().post(bulkAccountCallRecordingsResource);
rc.revoke();
```

- Parameter `bulkAccountCallRecordingsResource` is of type [BulkAccountCallRecordingsResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/BulkAccountCallRecordingsResource.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-updateCallRecordingExtensionList) in API Explorer.


## Get Call Recording Custom Greeting List

HTTP GET `/restapi/v1.0/account/{accountId}/call-recording/custom-greetings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callrecording().customgreetings().get(listCallRecordingCustomGreetingsParameters);
rc.revoke();
```

- Parameter `listCallRecordingCustomGreetingsParameters` is of type [ListCallRecordingCustomGreetingsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListCallRecordingCustomGreetingsParameters.cs)
- `result` is of type [CallRecordingCustomGreetings](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallRecordingCustomGreetings.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listCallRecordingCustomGreetings) in API Explorer.


## Delete Call Recording Custom Greeting

HTTP DELETE `/restapi/v1.0/account/{accountId}/call-recording/custom-greetings/{greetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callrecording().customgreetings(greetingid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-deleteCallRecordingCustomGreeting) in API Explorer.


## Get Call Recording Extension List

HTTP GET `/restapi/v1.0/account/{accountId}/call-recording/extensions`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).callrecording().extensions().get();
rc.revoke();
```


- `result` is of type [CallRecordingExtensions](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallRecordingExtensions.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listCallRecordingExtensions) in API Explorer.


## Assign Multiple Department Members

HTTP POST `/restapi/v1.0/account/{accountId}/department/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).department().bulkassign().post(departmentBulkAssignResource);
rc.revoke();
```

- Parameter `departmentBulkAssignResource` is of type [DepartmentBulkAssignResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DepartmentBulkAssignResource.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-assignMultipleDepartmentMembers) in API Explorer.


## Get Department Member List

HTTP GET `/restapi/v1.0/account/{accountId}/department/{departmentId}/members`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).department(departmentid).members().get(listDepartmentMembersParameters);
rc.revoke();
```

- Parameter `listDepartmentMembersParameters` is of type [ListDepartmentMembersParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListDepartmentMembersParameters.cs)
- `result` is of type [DepartmentMemberList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DepartmentMemberList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listDepartmentMembers) in API Explorer.


## Get Device

HTTP GET `/restapi/v1.0/account/{accountId}/device/{deviceId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).device(deviceid).get(readDeviceParameters);
rc.revoke();
```

- Parameter `readDeviceParameters` is of type [ReadDeviceParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadDeviceParameters.cs)
- `result` is of type [GetDeviceInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetDeviceInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-readDevice) in API Explorer.


## Update Device

HTTP PUT `/restapi/v1.0/account/{accountId}/device/{deviceId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).device(deviceid).put(accountDeviceUpdate);
rc.revoke();
```

- Parameter `accountDeviceUpdate` is of type [AccountDeviceUpdate](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AccountDeviceUpdate.cs)
- `result` is of type [DeviceResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DeviceResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-updateDevice) in API Explorer.


## Get Company Directory Entries

HTTP GET `/restapi/v1.0/account/{accountId}/directory/entries`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).directory().entries().list(listDirectoryEntriesParameters);
rc.revoke();
```

- Parameter `listDirectoryEntriesParameters` is of type [ListDirectoryEntriesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListDirectoryEntriesParameters.cs)
- `result` is of type [DirectoryResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DirectoryResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-listDirectoryEntries) in API Explorer.


## Search Company Directory Entries

HTTP POST `/restapi/v1.0/account/{accountId}/directory/entries/search`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).directory().entries().search().post(searchDirectoryEntriesRequest);
rc.revoke();
```

- Parameter `searchDirectoryEntriesRequest` is of type [SearchDirectoryEntriesRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SearchDirectoryEntriesRequest.cs)
- `result` is of type [DirectoryResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DirectoryResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-searchDirectoryEntries) in API Explorer.


## Get Corporate Directory Entry

HTTP GET `/restapi/v1.0/account/{accountId}/directory/entries/{entryId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).directory().entries(entryid).get();
rc.revoke();
```


- `result` is of type [ContactResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ContactResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readDirectoryEntry) in API Explorer.


## Get Account Federation

HTTP GET `/restapi/v1.0/account/{accountId}/directory/federation`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).directory().federation().get();
rc.revoke();
```


- `result` is of type [FederationResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/FederationResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readAccountFederation) in API Explorer.


## Get Extension List

HTTP GET `/restapi/v1.0/account/{accountId}/extension`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension().list(listExtensionsParameters);
rc.revoke();
```

- Parameter `listExtensionsParameters` is of type [ListExtensionsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListExtensionsParameters.cs)
- `result` is of type [GetExtensionListResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetExtensionListResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-listExtensions) in API Explorer.


## Create Extension

HTTP POST `/restapi/v1.0/account/{accountId}/extension`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension().post(extensionCreationRequest);
rc.revoke();
```

- Parameter `extensionCreationRequest` is of type [ExtensionCreationRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ExtensionCreationRequest.cs)
- `result` is of type [ExtensionCreationResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ExtensionCreationResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-createExtension) in API Explorer.


## Get Extension

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).get();
rc.revoke();
```


- `result` is of type [GetExtensionInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readExtension) in API Explorer.


## Update Extension

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).put(extensionUpdateRequest);
rc.revoke();
```

- Parameter `extensionUpdateRequest` is of type [ExtensionUpdateRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ExtensionUpdateRequest.cs)
- `result` is of type [GetExtensionInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateExtension) in API Explorer.


## Delete Extension

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-deleteExtension) in API Explorer.


## Get User Active Calls

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/active-calls`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).activecalls().get(listExtensionActiveCallsParameters);
rc.revoke();
```

- Parameter `listExtensionActiveCallsParameters` is of type [ListExtensionActiveCallsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListExtensionActiveCallsParameters.cs)
- `result` is of type [ActiveCallsResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ActiveCallsResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listExtensionActiveCalls) in API Explorer.


## Address Book Synchronization

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book-sync`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).addressbooksync().get(syncAddressBookParameters);
rc.revoke();
```

- Parameter `syncAddressBookParameters` is of type [SyncAddressBookParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SyncAddressBookParameters.cs)
- `result` is of type [AddressBookSync](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AddressBookSync.cs)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-syncAddressBook) in API Explorer.


## Get Contact List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).addressbook().contact().list(listContactsParameters);
rc.revoke();
```

- Parameter `listContactsParameters` is of type [ListContactsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListContactsParameters.cs)
- `result` is of type [ContactList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ContactList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listContacts) in API Explorer.


## Create Contact

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).addressbook().contact().post(personalContactRequest, createContactParameters);
rc.revoke();
```

- Parameter `personalContactRequest` is of type [PersonalContactRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PersonalContactRequest.cs)
- Parameter `createContactParameters` is of type [CreateContactParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateContactParameters.cs)
- `result` is of type [PersonalContactResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PersonalContactResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-createContact) in API Explorer.


## Get Contact

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).addressbook().contact(contactid).get();
rc.revoke();
```


- `result` is of type [PersonalContactResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PersonalContactResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-readContact) in API Explorer.


## Update Contact

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).addressbook().contact(contactid).put(personalContactRequest, updateContactParameters);
rc.revoke();
```

- Parameter `personalContactRequest` is of type [PersonalContactRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PersonalContactRequest.cs)
- Parameter `updateContactParameters` is of type [UpdateContactParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UpdateContactParameters.cs)
- `result` is of type [PersonalContactResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PersonalContactResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateContact) in API Explorer.


## Delete Contact

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).addressbook().contact(contactid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-deleteContact) in API Explorer.


## Get Call Handling Rules

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).answeringrule().list(listAnsweringRulesParameters);
rc.revoke();
```

- Parameter `listAnsweringRulesParameters` is of type [ListAnsweringRulesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListAnsweringRulesParameters.cs)
- `result` is of type [UserAnsweringRuleList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserAnsweringRuleList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listAnsweringRules) in API Explorer.


## Create Call Handling Rule

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).answeringrule().post(createAnsweringRuleRequest);
rc.revoke();
```

- Parameter `createAnsweringRuleRequest` is of type [CreateAnsweringRuleRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateAnsweringRuleRequest.cs)
- `result` is of type [AnsweringRuleInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-createAnsweringRule) in API Explorer.


## Get Call Handling Rule

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).answeringrule(ruleid).get(readAnsweringRuleParameters);
rc.revoke();
```

- Parameter `readAnsweringRuleParameters` is of type [ReadAnsweringRuleParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadAnsweringRuleParameters.cs)
- `result` is of type [AnsweringRuleInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readAnsweringRule) in API Explorer.


## Update Call Handling Rule

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).answeringrule(ruleid).put(updateAnsweringRuleRequest);
rc.revoke();
```

- Parameter `updateAnsweringRuleRequest` is of type [UpdateAnsweringRuleRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UpdateAnsweringRuleRequest.cs)
- `result` is of type [AnsweringRuleInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-updateAnsweringRule) in API Explorer.


## Delete Call Handling Rule

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).answeringrule(ruleid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-deleteAnsweringRule) in API Explorer.


## Get Authorization Profile

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).authzprofile().get();
rc.revoke();
```


- `result` is of type [AuthProfileResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AuthProfileResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Permissions-readAuthorizationProfile) in API Explorer.


## Check User Permission

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile/check`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).authzprofile().check().get(checkUserPermissionParameters);
rc.revoke();
```

- Parameter `checkUserPermissionParameters` is of type [CheckUserPermissionParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CheckUserPermissionParameters.cs)
- `result` is of type [AuthProfileCheckResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AuthProfileCheckResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Permissions-checkUserPermission) in API Explorer.


## Get User Business Hours

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).businesshours().get();
rc.revoke();
```


- `result` is of type [GetUserBusinessHoursResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetUserBusinessHoursResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-readUserBusinessHours) in API Explorer.


## Update User Business Hours

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).businesshours().put(userBusinessHoursUpdateRequest);
rc.revoke();
```

- Parameter `userBusinessHoursUpdateRequest` is of type [UserBusinessHoursUpdateRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateRequest.cs)
- `result` is of type [UserBusinessHoursUpdateResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateUserBusinessHours) in API Explorer.


## Get User Call Log Records

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).calllog().list(readUserCallLogParameters);
rc.revoke();
```

- Parameter `readUserCallLogParameters` is of type [ReadUserCallLogParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadUserCallLogParameters.cs)
- `result` is of type [UserCallLogResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserCallLogResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallLog) in API Explorer.


## Delete User Call Log

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).calllog().delete(deleteUserCallLogParameters);
rc.revoke();
```

- Parameter `deleteUserCallLogParameters` is of type [DeleteUserCallLogParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DeleteUserCallLogParameters.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-deleteUserCallLog) in API Explorer.


## Sync User Call Log

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log-sync`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).calllogsync().get(syncUserCallLogParameters);
rc.revoke();
```

- Parameter `syncUserCallLogParameters` is of type [SyncUserCallLogParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SyncUserCallLogParameters.cs)
- `result` is of type [CallLogSync](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallLogSync.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncUserCallLog) in API Explorer.


## Get User Call Record

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log/{callRecordId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).calllog(callrecordid).get(readUserCallRecordParameters);
rc.revoke();
```

- Parameter `readUserCallRecordParameters` is of type [ReadUserCallRecordParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadUserCallRecordParameters.cs)
- `result` is of type [UserCallLogRecord](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserCallLogRecord.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallRecord) in API Explorer.


## Get Caller Blocking Settings

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerblocking().get();
rc.revoke();
```


- `result` is of type [CallerBlockingSettings](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallerBlockingSettings.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-readCallerBlockingSettings) in API Explorer.


## Update Caller Blocking Settings

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerblocking().put(callerBlockingSettingsUpdate);
rc.revoke();
```

- Parameter `callerBlockingSettingsUpdate` is of type [CallerBlockingSettingsUpdate](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallerBlockingSettingsUpdate.cs)
- `result` is of type [CallerBlockingSettings](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallerBlockingSettings.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateCallerBlockingSettings) in API Explorer.


## Get Blocked/Allowed Phone Numbers

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerblocking().phonenumbers().list(listBlockedAllowedNumbersParameters);
rc.revoke();
```

- Parameter `listBlockedAllowedNumbersParameters` is of type [ListBlockedAllowedNumbersParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListBlockedAllowedNumbersParameters.cs)
- `result` is of type [BlockedAllowedPhoneNumbersList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumbersList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-listBlockedAllowedNumbers) in API Explorer.


## Add Blocked/Allowed Number

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerblocking().phonenumbers().post(addBlockedAllowedPhoneNumber);
rc.revoke();
```

- Parameter `addBlockedAllowedPhoneNumber` is of type [AddBlockedAllowedPhoneNumber](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.cs)
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-createBlockedAllowedNumber) in API Explorer.


## Get Blocked/Allowed Number

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerblocking().phonenumbers(blockednumberid).get();
rc.revoke();
```


- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-readBlockedAllowedNumber) in API Explorer.


## Delete Blocked/Allowed Number

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerblocking().phonenumbers(blockednumberid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-deleteBlockedAllowedNumber) in API Explorer.


## Update Blocked/Allowed Number

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerblocking().phonenumbers(blockednumberid).put(addBlockedAllowedPhoneNumber);
rc.revoke();
```

- Parameter `addBlockedAllowedPhoneNumber` is of type [AddBlockedAllowedPhoneNumber](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.cs)
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateBlockedAllowedNumber) in API Explorer.


## Get Extension Caller ID

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-id`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerid().get();
rc.revoke();
```


- `result` is of type [ExtensionCallerIdInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readExtensionCallerId) in API Explorer.


## Update Extension Caller ID

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-id`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).callerid().put(extensionCallerIdInfo);
rc.revoke();
```

- Parameter `extensionCallerIdInfo` is of type [ExtensionCallerIdInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.cs)
- `result` is of type [ExtensionCallerIdInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateExtensionCallerId) in API Explorer.


## Create Internal Text Message

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/company-pager`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).companypager().post(createInternalTextMessageRequest);
rc.revoke();
```

- Parameter `createInternalTextMessageRequest` is of type [CreateInternalTextMessageRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateInternalTextMessageRequest.cs)
- `result` is of type [GetMessageInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Pager-Messages-createInternalTextMessage) in API Explorer.


## Get User Conferencing Settings

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).conferencing().get(readConferencingSettingsParameters);
rc.revoke();
```

- Parameter `readConferencingSettingsParameters` is of type [ReadConferencingSettingsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadConferencingSettingsParameters.cs)
- `result` is of type [GetConferencingInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readConferencingSettings) in API Explorer.


## Update User Conferencing Settings

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).conferencing().put(updateConferencingInfoRequest);
rc.revoke();
```

- Parameter `updateConferencingInfoRequest` is of type [UpdateConferencingInfoRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UpdateConferencingInfoRequest.cs)
- `result` is of type [GetConferencingInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateConferencingSettings) in API Explorer.


## Get Extension Device List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/device`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).device().get(listExtensionDevicesParameters);
rc.revoke();
```

- Parameter `listExtensionDevicesParameters` is of type [ListExtensionDevicesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListExtensionDevicesParameters.cs)
- `result` is of type [GetExtensionDevicesResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetExtensionDevicesResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-listExtensionDevices) in API Explorer.


## Get Favorite Contact List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).favorite().get();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listFavoriteContacts) in API Explorer.


## Update Favorite Contact List

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).favorite().put(favoriteCollection);
rc.revoke();
```

- Parameter `favoriteCollection` is of type [FavoriteCollection](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/FavoriteCollection.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateFavoriteContactList) in API Explorer.


## Create Fax Message

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/fax`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).fax().post(createFaxMessageRequest);
rc.revoke();
```

- Parameter `createFaxMessageRequest` is of type [CreateFaxMessageRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateFaxMessageRequest.cs)
- `result` is of type [FaxResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/FaxResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Fax-createFaxMessage) in API Explorer.


## Get Forwarding Number List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).forwardingnumber().list(listForwardingNumbersParameters);
rc.revoke();
```

- Parameter `listForwardingNumbersParameters` is of type [ListForwardingNumbersParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListForwardingNumbersParameters.cs)
- `result` is of type [GetExtensionForwardingNumberListResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetExtensionForwardingNumberListResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-listForwardingNumbers) in API Explorer.


## Create Forwarding Number

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).forwardingnumber().post(createForwardingNumberRequest);
rc.revoke();
```

- Parameter `createForwardingNumberRequest` is of type [CreateForwardingNumberRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateForwardingNumberRequest.cs)
- `result` is of type [ForwardingNumberInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-createForwardingNumber) in API Explorer.


## Get Forwarding Number

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).forwardingnumber(forwardingnumberid).get();
rc.revoke();
```


- `result` is of type [ForwardingNumberResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ForwardingNumberResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-readForwardingNumber) in API Explorer.


## Update Forwarding Number

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).forwardingnumber(forwardingnumberid).put(updateForwardingNumberRequest);
rc.revoke();
```

- Parameter `updateForwardingNumberRequest` is of type [UpdateForwardingNumberRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UpdateForwardingNumberRequest.cs)
- `result` is of type [ForwardingNumberInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-updateForwardingNumber) in API Explorer.


## Delete Forwarding Number

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).forwardingnumber(forwardingnumberid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-deleteForwardingNumber) in API Explorer.


## Get Extension Grant List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/grant`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).grant().get(listExtensionGrantsParameters);
rc.revoke();
```

- Parameter `listExtensionGrantsParameters` is of type [ListExtensionGrantsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListExtensionGrantsParameters.cs)
- `result` is of type [GetExtensionGrantListResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetExtensionGrantListResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-listExtensionGrants) in API Explorer.


## Create Custom User Greeting

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).greeting().post(createCustomUserGreetingRequest);
rc.revoke();
```

- Parameter `createCustomUserGreetingRequest` is of type [CreateCustomUserGreetingRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateCustomUserGreetingRequest.cs)
- `result` is of type [CustomUserGreetingInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CustomUserGreetingInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-createCustomUserGreeting) in API Explorer.


## Get Custom Greeting

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting/{greetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).greeting(greetingid).get();
rc.revoke();
```


- `result` is of type [CustomUserGreetingInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CustomUserGreetingInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readCustomGreeting) in API Explorer.


## Get Scheduled Meetings

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meeting().list();
rc.revoke();
```


- `result` is of type [MeetingsResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MeetingsResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Mgmt.-listMeetings) in API Explorer.


## Create Meetings

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meeting().post(meetingRequestResource);
rc.revoke();
```

- Parameter `meetingRequestResource` is of type [MeetingRequestResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MeetingRequestResource.cs)
- `result` is of type [MeetingResponseResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MeetingResponseResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Mgmt.-createMeeting) in API Explorer.


## Get Meeting Service Info

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/service-info`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meeting().serviceinfo().get();
rc.revoke();
```


- `result` is of type [MeetingServiceInfoResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MeetingServiceInfoResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Meetings-Config-readMeetingServiceInfo) in API Explorer.


## Get Meeting Info

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meeting(meetingid).get();
rc.revoke();
```


- `result` is of type [MeetingResponseResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MeetingResponseResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Mgmt.-readMeeting) in API Explorer.


## Update Meeting

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meeting(meetingid).put(meetingRequestResource);
rc.revoke();
```

- Parameter `meetingRequestResource` is of type [MeetingRequestResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MeetingRequestResource.cs)
- `result` is of type [MeetingResponseResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MeetingResponseResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Mgmt.-updateMeeting) in API Explorer.


## Delete Meeting

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meeting(meetingid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Mgmt.-deleteMeeting) in API Explorer.


## End Meeting

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meeting(meetingid).end().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Control-endMeeting) in API Explorer.


## Get Assistants

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assistants`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meetingsconfiguration().assistants().get();
rc.revoke();
```


- `result` is of type [AssistantsResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AssistantsResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Meetings-Config-readAssistants) in API Explorer.


## Get Assisted Users

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assisted`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).meetingsconfiguration().assisted().get();
rc.revoke();
```


- `result` is of type [AssistedUsersResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AssistedUsersResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Meetings-Config-readAssistedUsers) in API Explorer.


## Get Message List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).messagestore().list(listMessagesParameters);
rc.revoke();
```

- Parameter `listMessagesParameters` is of type [ListMessagesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListMessagesParameters.cs)
- `result` is of type [GetMessageList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetMessageList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-listMessages) in API Explorer.


## Get Message

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).messagestore(messageid).get();
rc.revoke();
```


- `result` is of type [GetMessageInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessage) in API Explorer.


## Update Message(s)

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).messagestore(messageid).put(updateMessageRequest);
rc.revoke();
```

- Parameter `updateMessageRequest` is of type [UpdateMessageRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UpdateMessageRequest.cs)
- `result` is of type [GetMessageInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessage) in API Explorer.


## Delete Message

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).messagestore(messageid).delete(deleteMessageParameters);
rc.revoke();
```

- Parameter `deleteMessageParameters` is of type [DeleteMessageParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DeleteMessageParameters.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-deleteMessage) in API Explorer.


## Get Message Content

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).messagestore(messageid).content(attachmentid).get(readMessageContentParameters);
rc.revoke();
```

- Parameter `readMessageContentParameters` is of type [ReadMessageContentParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadMessageContentParameters.cs)
- `result` is of type `byte[]`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageContent) in API Explorer.


## Sync Messages

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-sync`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).messagesync().get(syncMessagesParameters);
rc.revoke();
```

- Parameter `syncMessagesParameters` is of type [SyncMessagesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SyncMessagesParameters.cs)
- `result` is of type [GetMessageSyncResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetMessageSyncResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-syncMessages) in API Explorer.


## Get Notification Settings

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).notificationsettings().get();
rc.revoke();
```


- `result` is of type [NotificationSettings](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/NotificationSettings.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readNotificationSettings) in API Explorer.


## Update Notification Settings

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).notificationsettings().put(notificationSettingsUpdateRequest);
rc.revoke();
```

- Parameter `notificationSettingsUpdateRequest` is of type [NotificationSettingsUpdateRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/NotificationSettingsUpdateRequest.cs)
- `result` is of type [NotificationSettings](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/NotificationSettings.cs)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateNotificationSettings) in API Explorer.


## Get Extension Phone Number List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/phone-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).phonenumber().get(listExtensionPhoneNumbersParameters);
rc.revoke();
```

- Parameter `listExtensionPhoneNumbersParameters` is of type [ListExtensionPhoneNumbersParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListExtensionPhoneNumbersParameters.cs)
- `result` is of type [GetExtensionPhoneNumbersResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetExtensionPhoneNumbersResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-listExtensionPhoneNumbers) in API Explorer.


## Get User Presence Status

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/presence`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).presence().get(readUserPresenceStatusParameters);
rc.revoke();
```

- Parameter `readUserPresenceStatusParameters` is of type [ReadUserPresenceStatusParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadUserPresenceStatusParameters.cs)
- `result` is of type [GetPresenceInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetPresenceInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readUserPresenceStatus) in API Explorer.


## Update User Presence Status

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/presence`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).presence().put(presenceInfoResource);
rc.revoke();
```

- Parameter `presenceInfoResource` is of type [PresenceInfoResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PresenceInfoResource.cs)
- `result` is of type [PresenceInfoResource](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PresenceInfoResource.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateUserPresenceStatus) in API Explorer.


## Get User Profile Image

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).profileimage().list();
rc.revoke();
```


- `result` is of type `byte[]`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readUserProfileImage) in API Explorer.


## Upload User Profile Image

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).profileimage().post(createUserProfileImageRequest);
rc.revoke();
```

- Parameter `createUserProfileImageRequest` is of type [CreateUserProfileImageRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateUserProfileImageRequest.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-createUserProfileImage) in API Explorer.


## Update User Profile Image

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).profileimage().put(updateUserProfileImageRequest);
rc.revoke();
```

- Parameter `updateUserProfileImageRequest` is of type [UpdateUserProfileImageRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UpdateUserProfileImageRequest.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateUserProfileImage) in API Explorer.


## Get Scaled User Profile Image

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image/{scaleSize}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).profileimage(scalesize).get();
rc.revoke();
```


- `result` is of type `byte[]`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readScaledPofileImage) in API Explorer.


## Make RingOut Call

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).ringout().post(makeRingOutRequest);
rc.revoke();
```

- Parameter `makeRingOutRequest` is of type [MakeRingOutRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MakeRingOutRequest.cs)
- `result` is of type [GetRingOutStatusResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-createRingOutCall) in API Explorer.


## Get RingOut Call Status

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).ringout(ringoutid).get();
rc.revoke();
```


- `result` is of type [GetRingOutStatusResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-readRingOutCallStatus) in API Explorer.


## Cancel RingOut Call

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).ringout(ringoutid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-deleteRingOutCall) in API Explorer.


## Create SMS/MMS Message

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/sms`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).extension(extensionid).sms().post(createSmsMessage);
rc.revoke();
```

- Parameter `createSmsMessage` is of type [CreateSMSMessage](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateSMSMessage.cs)
- `result` is of type [GetMessageInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SMS-createSMSMessage) in API Explorer.


## Create Company Greeting

HTTP POST `/restapi/v1.0/account/{accountId}/greeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).greeting().post(createCompanyGreetingRequest);
rc.revoke();
```

- Parameter `createCompanyGreetingRequest` is of type [CreateCompanyGreetingRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateCompanyGreetingRequest.cs)
- `result` is of type [CustomCompanyGreetingInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CustomCompanyGreetingInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-createCompanyGreeting) in API Explorer.


## Create IVR Menu

HTTP POST `/restapi/v1.0/account/{accountId}/ivr-menus`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrmenus().post(ivrMenuInfo);
rc.revoke();
```

- Parameter `ivrMenuInfo` is of type [IVRMenuInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/IVRMenuInfo.cs)
- `result` is of type [IVRMenuInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/IVRMenuInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-createIVRMenu) in API Explorer.


## Get IVR Menu

HTTP GET `/restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrmenus(ivrmenuid).get();
rc.revoke();
```


- `result` is of type [IVRMenuInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/IVRMenuInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-readIVRMenu) in API Explorer.


## Update IVR Menu

HTTP PUT `/restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrmenus(ivrmenuid).put(ivrMenuInfo);
rc.revoke();
```

- Parameter `ivrMenuInfo` is of type [IVRMenuInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/IVRMenuInfo.cs)
- `result` is of type [IVRMenuInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/IVRMenuInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-updateIVRMenu) in API Explorer.


## Create IVR Prompts

HTTP POST `/restapi/v1.0/account/{accountId}/ivr-prompts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrprompts().post(createIvrPromptRequest);
rc.revoke();
```

- Parameter `createIvrPromptRequest` is of type [CreateIvrPromptRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateIvrPromptRequest.cs)
- `result` is of type [PromptInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PromptInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-createIVRPrompt) in API Explorer.


## Get IVR Prompt List

HTTP GET `/restapi/v1.0/account/{accountId}/ivr-prompts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrprompts().list();
rc.revoke();
```


- `result` is of type [IVRPrompts](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/IVRPrompts.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-listIVRPrompts) in API Explorer.


## Get IVR Prompt

HTTP GET `/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrprompts(promptid).get();
rc.revoke();
```


- `result` is of type [PromptInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PromptInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-readIVRPrompt) in API Explorer.


## Delete IVR Prompt

HTTP DELETE `/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrprompts(promptid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-deleteIVRPrompt) in API Explorer.


## Update IVR Prompt

HTTP PUT `/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrprompts(promptid).put();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-updateIVRPrompt) in API Explorer.


## Get IVR Prompt Content

HTTP GET `/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}/content`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).ivrprompts(promptid).content().get();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-readIVRPromptContent) in API Explorer.


## Get Message Store Configuration

HTTP GET `/restapi/v1.0/account/{accountId}/message-store-configuration`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).messagestoreconfiguration().get();
rc.revoke();
```


- `result` is of type [MessageStoreConfiguration](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageStoreConfiguration) in API Explorer.


## Update Message Store Configuration

HTTP PUT `/restapi/v1.0/account/{accountId}/message-store-configuration`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).messagestoreconfiguration().put(messageStoreConfiguration);
rc.revoke();
```

- Parameter `messageStoreConfiguration` is of type [MessageStoreConfiguration](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.cs)
- `result` is of type [MessageStoreConfiguration](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessageStoreConfiguration) in API Explorer.


## Create Message Store Report

HTTP POST `/restapi/v1.0/account/{accountId}/message-store-report`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).messagestorereport().post(createMessageStoreReportRequest);
rc.revoke();
```

- Parameter `createMessageStoreReportRequest` is of type [CreateMessageStoreReportRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateMessageStoreReportRequest.cs)
- `result` is of type [MessageStoreReport](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MessageStoreReport.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-createMessageStoreReport) in API Explorer.


## Get Message Store Report Task

HTTP GET `/restapi/v1.0/account/{accountId}/message-store-report/{taskId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).messagestorereport(taskid).get();
rc.revoke();
```


- `result` is of type [MessageStoreReport](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MessageStoreReport.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportTask) in API Explorer.


## Get Message Store Report Archive

HTTP GET `/restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).messagestorereport(taskid).archive().list();
rc.revoke();
```


- `result` is of type [MessageStoreReportArchive](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MessageStoreReportArchive.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchive) in API Explorer.


## Get Message Store Report Archive Content

HTTP GET `/restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive/{archiveId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).messagestorereport(taskid).archive(archiveid).get();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchiveContent) in API Explorer.


## Assign Paging Group Users and Devices

HTTP POST `/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).pagingonlygroups(pagingonlygroupid).bulkassign().post(editPagingGroupRequest);
rc.revoke();
```

- Parameter `editPagingGroupRequest` is of type [EditPagingGroupRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/EditPagingGroupRequest.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-assignMultiplePagingGroupUsersDevices) in API Explorer.


## Get Paging Group Devices

HTTP GET `/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/devices`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).pagingonlygroups(pagingonlygroupid).devices().get(listPagingGroupDevicesParameters);
rc.revoke();
```

- Parameter `listPagingGroupDevicesParameters` is of type [ListPagingGroupDevicesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListPagingGroupDevicesParameters.cs)
- `result` is of type [PagingOnlyGroupDevices](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PagingOnlyGroupDevices.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-listPagingGroupDevices) in API Explorer.


## Get Paging Group Users

HTTP GET `/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/users`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).pagingonlygroups(pagingonlygroupid).users().get(listPagingGroupUsersParameters);
rc.revoke();
```

- Parameter `listPagingGroupUsersParameters` is of type [ListPagingGroupUsersParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListPagingGroupUsersParameters.cs)
- `result` is of type [PagingOnlyGroupUsers](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PagingOnlyGroupUsers.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-listPagingGroupUsers) in API Explorer.


## Get Company Phone Number List

HTTP GET `/restapi/v1.0/account/{accountId}/phone-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).phonenumber().list(listAccountPhoneNumbersParameters);
rc.revoke();
```

- Parameter `listAccountPhoneNumbersParameters` is of type [ListAccountPhoneNumbersParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListAccountPhoneNumbersParameters.cs)
- `result` is of type [AccountPhoneNumbers](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AccountPhoneNumbers.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-listAccountPhoneNumbers) in API Explorer.


## Get Phone Number

HTTP GET `/restapi/v1.0/account/{accountId}/phone-number/{phoneNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).phonenumber(phonenumberid).get();
rc.revoke();
```


- `result` is of type [CompanyPhoneNumberInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CompanyPhoneNumberInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-readAccountPhoneNumber) in API Explorer.


## Get User Presence Status List

HTTP GET `/restapi/v1.0/account/{accountId}/presence`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).presence().get(readAccountPresenceParameters);
rc.revoke();
```

- Parameter `readAccountPresenceParameters` is of type [ReadAccountPresenceParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadAccountPresenceParameters.cs)
- `result` is of type [AccountPresenceInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/AccountPresenceInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readAccountPresence) in API Explorer.


## Get Call Recording

HTTP GET `/restapi/v1.0/account/{accountId}/recording/{recordingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).recording(recordingid).get();
rc.revoke();
```


- `result` is of type [GetCallRecordingResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetCallRecordingResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCallRecording) in API Explorer.


## Get Call Recordings Data

HTTP GET `/restapi/v1.0/account/{accountId}/recording/{recordingId}/content`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).recording(recordingid).content().get();
rc.revoke();
```


- `result` is of type `byte[]`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listCallRecordingData) in API Explorer.


## Get Account Service Info

HTTP GET `/restapi/v1.0/account/{accountId}/service-info`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).serviceinfo().get();
rc.revoke();
```


- `result` is of type [GetServiceInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetServiceInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAcountServiceInfo) in API Explorer.


## Create CallOut Call Session

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/call-out`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().callout().post(makeCallOutRequest);
rc.revoke();
```

- Parameter `makeCallOutRequest` is of type [MakeCallOutRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/MakeCallOutRequest.cs)
- `result` is of type [CallSession](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallSession.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-createCallOutCallSession) in API Explorer.


## Get Call Session Status

HTTP GET `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).get(readCallSessionStatusParameters);
rc.revoke();
```

- Parameter `readCallSessionStatusParameters` is of type [ReadCallSessionStatusParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadCallSessionStatusParameters.cs)
- `result` is of type [CallSessionObject](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallSessionObject.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-readCallSessionStatus) in API Explorer.


## Drop Call Session

HTTP DELETE `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-deleteCallSession) in API Explorer.


## Get Call Party Status

HTTP GET `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).get();
rc.revoke();
```


- `result` is of type [CallParty](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallParty.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-readCallPartyStatus) in API Explorer.


## Update Call Party

HTTP PATCH `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).patch(partyUpdateRequest);
rc.revoke();
```

- Parameter `partyUpdateRequest` is of type [PartyUpdateRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PartyUpdateRequest.cs)
- `result` is of type [CallParty](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallParty.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-updateCallParty) in API Explorer.


## Call Flip on Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/flip`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).flip().post(callPartyFlip);
rc.revoke();
```

- Parameter `callPartyFlip` is of type [CallPartyFlip](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallPartyFlip.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-callFlipParty) in API Explorer.


## Forward Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/forward`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).forward().post(forwardTarget);
rc.revoke();
```

- Parameter `forwardTarget` is of type [ForwardTarget](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ForwardTarget.cs)
- `result` is of type [CallParty](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallParty.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-forwardCallParty) in API Explorer.


## Hold Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/hold`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).hold().post();
rc.revoke();
```


- `result` is of type [CallParty](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallParty.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-holdCallParty) in API Explorer.


## Create Recording

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/recordings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).recordings().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-startCallRecording) in API Explorer.


## Pause/Resume Recording

HTTP PATCH `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/recordings/{recordingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).recordings(recordingid).patch(callRecordingUpdate, pauseResumeCallRecordingParameters);
rc.revoke();
```

- Parameter `callRecordingUpdate` is of type [CallRecordingUpdate](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallRecordingUpdate.cs)
- Parameter `pauseResumeCallRecordingParameters` is of type [PauseResumeCallRecordingParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/PauseResumeCallRecordingParameters.cs)
- `result` is of type [CallRecording](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallRecording.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-pauseResumeCallRecording) in API Explorer.


## Reject Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/reject`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).reject().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-rejectParty) in API Explorer.


## Transfer Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/transfer`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).transfer().post(transferTarget);
rc.revoke();
```

- Parameter `transferTarget` is of type [TransferTarget](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/TransferTarget.cs)
- `result` is of type [CallParty](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallParty.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-transferCallParty) in API Explorer.


## Unhold Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/unhold`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).parties(partyid).unhold().post();
rc.revoke();
```


- `result` is of type [CallParty](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CallParty.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-unholdCallParty) in API Explorer.


## Supervise Call

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/supervise`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).telephony().sessions(sessionid).supervise().post(superviseCallSessionRequest);
rc.revoke();
```

- Parameter `superviseCallSessionRequest` is of type [SuperviseCallSessionRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SuperviseCallSessionRequest.cs)
- `result` is of type [SuperviseCallSession](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SuperviseCallSession.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-superviseCallSession) in API Explorer.


## Get User Template List

HTTP GET `/restapi/v1.0/account/{accountId}/templates`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).templates().list(listUserTemplatesParameters);
rc.revoke();
```

- Parameter `listUserTemplatesParameters` is of type [ListUserTemplatesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListUserTemplatesParameters.cs)
- `result` is of type [UserTemplates](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserTemplates.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-listUserTemplates) in API Explorer.


## Get User Template

HTTP GET `/restapi/v1.0/account/{accountId}/templates/{templateId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).account(accountid).templates(templateid).get();
rc.revoke();
```


- `result` is of type [TemplateInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/TemplateInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-readUserTemplate) in API Explorer.


## Register SIP Device

HTTP POST `/restapi/v1.0/client-info/sip-provision`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).clientinfo().sipprovision().post(createSipRegistrationRequest);
rc.revoke();
```

- Parameter `createSipRegistrationRequest` is of type [CreateSipRegistrationRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateSipRegistrationRequest.cs)
- `result` is of type [CreateSipRegistrationResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateSipRegistrationResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SIP-createSIPRegistration) in API Explorer.


## Get Country List

HTTP GET `/restapi/v1.0/dictionary/country`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().country().list(listCountriesParameters);
rc.revoke();
```

- Parameter `listCountriesParameters` is of type [ListCountriesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListCountriesParameters.cs)
- `result` is of type [GetCountryListResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetCountryListResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listCountries) in API Explorer.


## Get Country

HTTP GET `/restapi/v1.0/dictionary/country/{countryId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().country(countryid).get();
rc.revoke();
```


- `result` is of type [GetCountryInfoDictionaryResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetCountryInfoDictionaryResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readCountry) in API Explorer.


## Get Fax Cover Page List

HTTP GET `/restapi/v1.0/dictionary/fax-cover-page`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().faxcoverpage().get(listFaxCoverPagesParameters);
rc.revoke();
```

- Parameter `listFaxCoverPagesParameters` is of type [ListFaxCoverPagesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListFaxCoverPagesParameters.cs)
- `result` is of type [ListFaxCoverPagesResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListFaxCoverPagesResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Fax-listFaxCoverPages) in API Explorer.


## Get Standard Greeting List

HTTP GET `/restapi/v1.0/dictionary/greeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().greeting().list(listStandardGreetingsParameters);
rc.revoke();
```

- Parameter `listStandardGreetingsParameters` is of type [ListStandardGreetingsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListStandardGreetingsParameters.cs)
- `result` is of type [DictionaryGreetingList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DictionaryGreetingList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listStandardGreetings) in API Explorer.


## Get Standard Greeting

HTTP GET `/restapi/v1.0/dictionary/greeting/{greetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().greeting(greetingid).get();
rc.revoke();
```


- `result` is of type [DictionaryGreetingInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DictionaryGreetingInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readStandardGreeting) in API Explorer.


## Get Language List

HTTP GET `/restapi/v1.0/dictionary/language`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().language().list();
rc.revoke();
```


- `result` is of type [LanguageList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/LanguageList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLanguages) in API Explorer.


## Get Language

HTTP GET `/restapi/v1.0/dictionary/language/{languageId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().language(languageid).get();
rc.revoke();
```


- `result` is of type [LanguageInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/LanguageInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readLanguage) in API Explorer.


## Get Location List

HTTP GET `/restapi/v1.0/dictionary/location`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().location().get(listLocationsParameters);
rc.revoke();
```

- Parameter `listLocationsParameters` is of type [ListLocationsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListLocationsParameters.cs)
- `result` is of type [GetLocationListResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetLocationListResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLocations) in API Explorer.


## Get States List

HTTP GET `/restapi/v1.0/dictionary/state`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().state().list(listStatesParameters);
rc.revoke();
```

- Parameter `listStatesParameters` is of type [ListStatesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListStatesParameters.cs)
- `result` is of type [GetStateListResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetStateListResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listStates) in API Explorer.


## Get State

HTTP GET `/restapi/v1.0/dictionary/state/{stateId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().state(stateid).get();
rc.revoke();
```


- `result` is of type [GetStateInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetStateInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readState) in API Explorer.


## Get Timezone List

HTTP GET `/restapi/v1.0/dictionary/timezone`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().timezone().list(listTimezonesParameters);
rc.revoke();
```

- Parameter `listTimezonesParameters` is of type [ListTimezonesParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListTimezonesParameters.cs)
- `result` is of type [GetTimezoneListResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetTimezoneListResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listTimezones) in API Explorer.


## Get Timezone

HTTP GET `/restapi/v1.0/dictionary/timezone/{timezoneId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).dictionary().timezone(timezoneid).get(readTimezoneParameters);
rc.revoke();
```

- Parameter `readTimezoneParameters` is of type [ReadTimezoneParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadTimezoneParameters.cs)
- `result` is of type [GetTimezoneInfoResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GetTimezoneInfoResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readTimezone) in API Explorer.


## Create Card

HTTP POST `/restapi/v1.0/glip/cards`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().cards().post(glipMessageAttachmentInfoRequest, createGlipCardParameters);
rc.revoke();
```

- Parameter `glipMessageAttachmentInfoRequest` is of type [GlipMessageAttachmentInfoRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipMessageAttachmentInfoRequest.cs)
- Parameter `createGlipCardParameters` is of type [CreateGlipCardParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateGlipCardParameters.cs)
- `result` is of type [GlipMessageAttachmentInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipMessageAttachmentInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipCard) in API Explorer.


## Get Card

HTTP GET `/restapi/v1.0/glip/cards/{cardId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().cards(cardid).get();
rc.revoke();
```


- `result` is of type [GlipMessageAttachmentInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipMessageAttachmentInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipCard) in API Explorer.


## Update Card

HTTP PUT `/restapi/v1.0/glip/cards/{cardId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().cards(cardid).put(glipMessageAttachmentInfoRequest);
rc.revoke();
```

- Parameter `glipMessageAttachmentInfoRequest` is of type [GlipMessageAttachmentInfoRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipMessageAttachmentInfoRequest.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Posts-updateGlipCard) in API Explorer.


## Delete Card

HTTP DELETE `/restapi/v1.0/glip/cards/{cardId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().cards(cardid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Posts-deleteGlipCard) in API Explorer.


## Get Chats

HTTP GET `/restapi/v1.0/glip/chats`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats().list(listGlipChatsParameters);
rc.revoke();
```

- Parameter `listGlipChatsParameters` is of type [ListGlipChatsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListGlipChatsParameters.cs)
- `result` is of type [GlipChatsList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipChatsList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipChats) in API Explorer.


## Get Chat

HTTP GET `/restapi/v1.0/glip/chats/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).get();
rc.revoke();
```


- `result` is of type [GlipChatInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipChatInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipChat) in API Explorer.


## Add Chat to Favorites

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/favorite`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).favorite().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-favoriteGlipChat) in API Explorer.


## Get Posts

HTTP GET `/restapi/v1.0/glip/chats/{chatId}/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).posts().list(readGlipPostsParameters);
rc.revoke();
```

- Parameter `readGlipPostsParameters` is of type [ReadGlipPostsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadGlipPostsParameters.cs)
- `result` is of type [GlipPostsList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostsList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPosts) in API Explorer.


## Create Post

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).posts().post(glipPostPostBody);
rc.revoke();
```

- Parameter `glipPostPostBody` is of type [GlipPostPostBody](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostPostBody.cs)
- `result` is of type [GlipPostInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipPost) in API Explorer.


## Get Post

HTTP GET `/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).posts(postid).get();
rc.revoke();
```


- `result` is of type [GlipPostInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPost) in API Explorer.


## Update Post

HTTP PATCH `/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).posts(postid).patch(glipPatchPostBody);
rc.revoke();
```

- Parameter `glipPatchPostBody` is of type [GlipPatchPostBody](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPatchPostBody.cs)
- `result` is of type [GlipPostInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-patchGlipPost) in API Explorer.


## Delete Post

HTTP DELETE `/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).posts(postid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Posts-deleteGlipPost) in API Explorer.


## Mark Chat as Read

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/read`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).read().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatRead) in API Explorer.


## Remove Chat from Favorites

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/unfavorite`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).unfavorite().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-unfavoriteGlipChat) in API Explorer.


## Mark Chat as Unread

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/unread`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().chats(chatid).unread().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatUnread) in API Explorer.


## Get Company Info

HTTP GET `/restapi/v1.0/glip/companies/{companyId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().companies(companyid).get();
rc.revoke();
```


- `result` is of type [GlipCompany](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipCompany.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipCompany) in API Explorer.


## Get Conversations

HTTP GET `/restapi/v1.0/glip/conversations`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().conversations().list(listGlipConversationsParameters);
rc.revoke();
```

- Parameter `listGlipConversationsParameters` is of type [ListGlipConversationsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListGlipConversationsParameters.cs)
- `result` is of type [GlipConversationsList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipConversationsList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipConversations) in API Explorer.


## Create/Open Conversation

HTTP POST `/restapi/v1.0/glip/conversations`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().conversations().post(createGlipConversationRequest);
rc.revoke();
```

- Parameter `createGlipConversationRequest` is of type [CreateGlipConversationRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateGlipConversationRequest.cs)
- `result` is of type [GlipConversationInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipConversationInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-createGlipConversation) in API Explorer.


## Get Conversation

HTTP GET `/restapi/v1.0/glip/conversations/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().conversations(chatid).get();
rc.revoke();
```


- `result` is of type [GlipConversationInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipConversationInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipConversation) in API Explorer.


## Create Data Export Task

HTTP POST `/restapi/v1.0/glip/data-export`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().dataexport().post(createDataExportTaskRequest);
rc.revoke();
```

- Parameter `createDataExportTaskRequest` is of type [CreateDataExportTaskRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateDataExportTaskRequest.cs)
- `result` is of type [DataExportTask](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DataExportTask.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-createDataExportTask) in API Explorer.


## Get Data Export Task

HTTP GET `/restapi/v1.0/glip/data-export/{taskId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().dataexport(taskid).get();
rc.revoke();
```


- `result` is of type [DataExportTask](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/DataExportTask.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-readDataExportTask) in API Explorer.


## Get Glip Data Archive

HTTP GET `/restapi/v1.0/glip/data-export/{taskId}/archive/{archiveId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().dataexport(taskid).archive(archiveid).get();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-readComplianceArchive) in API Explorer.


## Get User Events List

HTTP GET `/restapi/v1.0/glip/events`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().events().list(readGlipEventsParameters);
rc.revoke();
```

- Parameter `readGlipEventsParameters` is of type [ReadGlipEventsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ReadGlipEventsParameters.cs)
- `result` is of type [GlipEventsInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventsInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Events-readGlipEvents) in API Explorer.


## Create Event

HTTP POST `/restapi/v1.0/glip/events`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().events().post(glipEventCreate);
rc.revoke();
```

- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventCreate.cs)
- `result` is of type [GlipEventInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Events-createEvent) in API Explorer.


## Get Event

HTTP GET `/restapi/v1.0/glip/events/{eventId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().events(eventid).get();
rc.revoke();
```


- `result` is of type [GlipEventInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Events-readEvent) in API Explorer.


## Update Event

HTTP PUT `/restapi/v1.0/glip/events/{eventId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().events(eventid).put(glipEventCreate);
rc.revoke();
```

- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventCreate.cs)
- `result` is of type [GlipEventInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Events-updateEvent) in API Explorer.


## Delete Event

HTTP DELETE `/restapi/v1.0/glip/events/{eventId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().events(eventid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Events-deleteEvent) in API Explorer.


## Get Everyone Chat

HTTP GET `/restapi/v1.0/glip/everyone`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().everyone().get();
rc.revoke();
```


- `result` is of type [GlipEveryoneInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEveryoneInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipEveryone) in API Explorer.


## Update Everyone Сhat

HTTP PATCH `/restapi/v1.0/glip/everyone`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().everyone().patch(updateGlipEveryoneRequest);
rc.revoke();
```

- Parameter `updateGlipEveryoneRequest` is of type [UpdateGlipEveryoneRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UpdateGlipEveryoneRequest.cs)
- `result` is of type [GlipEveryoneInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEveryoneInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-patchGlipEveryone) in API Explorer.


## Get Favorite Chats

HTTP GET `/restapi/v1.0/glip/favorites`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().favorites().get(listFavoriteChatsParameters);
rc.revoke();
```

- Parameter `listFavoriteChatsParameters` is of type [ListFavoriteChatsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListFavoriteChatsParameters.cs)
- `result` is of type [GlipChatsListWithoutNavigation](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipChatsListWithoutNavigation.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listFavoriteChats) in API Explorer.


## Get User Groups

HTTP GET `/restapi/v1.0/glip/groups`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups().list(listGlipGroupsParameters);
rc.revoke();
```

- Parameter `listGlipGroupsParameters` is of type [ListGlipGroupsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListGlipGroupsParameters.cs)
- `result` is of type [GlipGroupList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipGroupList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipGroups) in API Explorer.


## Create Group

HTTP POST `/restapi/v1.0/glip/groups`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups().post(glipCreateGroup);
rc.revoke();
```

- Parameter `glipCreateGroup` is of type [GlipCreateGroup](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipCreateGroup.cs)
- `result` is of type [GlipGroupInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipGroupInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-createGlipGroup) in API Explorer.


## Get Group

HTTP GET `/restapi/v1.0/glip/groups/{groupId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).get();
rc.revoke();
```


- `result` is of type [GlipGroupInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipGroupInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipGroup) in API Explorer.


## Edit Group Members

HTTP POST `/restapi/v1.0/glip/groups/{groupId}/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).bulkassign().post(editGroupRequest);
rc.revoke();
```

- Parameter `editGroupRequest` is of type [EditGroupRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/EditGroupRequest.cs)
- `result` is of type [GlipGroupInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipGroupInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-assignGlipGroupMembers) in API Explorer.


## Create Event by Group ID

HTTP POST `/restapi/v1.0/glip/groups/{groupId}/events`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).events().post(glipEventCreate);
rc.revoke();
```

- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventCreate.cs)
- `result` is of type [GlipEventInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Events-createEventbyGroupId) in API Explorer.


## Get Group Events

HTTP GET `/restapi/v1.0/glip/groups/{groupId}/events`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).events().get();
rc.revoke();
```


- `result` is of type [GlipEventInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipEventInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Events-listGroupEvents) in API Explorer.


## Get Group Posts

HTTP GET `/restapi/v1.0/glip/groups/{groupId}/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).posts().get(listGlipGroupPostsParameters);
rc.revoke();
```

- Parameter `listGlipGroupPostsParameters` is of type [ListGlipGroupPostsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListGlipGroupPostsParameters.cs)
- `result` is of type [GlipPosts](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPosts.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-listGlipGroupPosts) in API Explorer.


## Create Post in Group

HTTP POST `/restapi/v1.0/glip/groups/{groupId}/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).posts().post(glipCreatePost);
rc.revoke();
```

- Parameter `glipCreatePost` is of type [GlipCreatePost](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipCreatePost.cs)
- `result` is of type [GlipPostInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipGroupPost) in API Explorer.


## Update Post

HTTP PUT `/restapi/v1.0/glip/groups/{groupId}/posts/{postId}/text`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).posts(postid).text().put(string);
rc.revoke();
```

- Parameter `string` is of type [string](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/string.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Posts-updateGlipPostText) in API Explorer.


## Create Webhook in Group

HTTP POST `/restapi/v1.0/glip/groups/{groupId}/webhooks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).webhooks().post();
rc.revoke();
```


- `result` is of type [GlipWebhookInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipWebhookInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-createGlipGroupWebhook) in API Explorer.


## Get Webhooks in Group

HTTP GET `/restapi/v1.0/glip/groups/{groupId}/webhooks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().groups(groupid).webhooks().get();
rc.revoke();
```


- `result` is of type [GlipWebhookList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipWebhookList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-listGlipGroupWebhooks) in API Explorer.


## Get Person

HTTP GET `/restapi/v1.0/glip/persons/{personId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().persons(personid).get();
rc.revoke();
```


- `result` is of type [GlipPersonInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPersonInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipPerson) in API Explorer.


## Get Posts

HTTP GET `/restapi/v1.0/glip/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().posts().get(listGlipPostsParameters);
rc.revoke();
```

- Parameter `listGlipPostsParameters` is of type [ListGlipPostsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListGlipPostsParameters.cs)
- `result` is of type [GlipPosts](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPosts.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-listGlipPosts) in API Explorer.


## Create Post

HTTP POST `/restapi/v1.0/glip/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().posts().post(glipCreatePost);
rc.revoke();
```

- Parameter `glipCreatePost` is of type [GlipCreatePost](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipCreatePost.cs)
- `result` is of type [GlipPostInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createPost) in API Explorer.


## Get Preferences

HTTP GET `/restapi/v1.0/glip/preferences`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().preferences().get();
rc.revoke();
```


- `result` is of type [GlipPreferencesInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPreferencesInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipPreferences) in API Explorer.


## Get Recent Chats

HTTP GET `/restapi/v1.0/glip/recent/chats`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().recent().chats().get(listRecentChatsParameters);
rc.revoke();
```

- Parameter `listRecentChatsParameters` is of type [ListRecentChatsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListRecentChatsParameters.cs)
- `result` is of type [GlipChatsListWithoutNavigation](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipChatsListWithoutNavigation.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listRecentChats) in API Explorer.


## Get Teams

HTTP GET `/restapi/v1.0/glip/teams`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams().list(listGlipTeamsParameters);
rc.revoke();
```

- Parameter `listGlipTeamsParameters` is of type [ListGlipTeamsParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ListGlipTeamsParameters.cs)
- `result` is of type [GlipTeamsList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipTeamsList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipTeams) in API Explorer.


## Create Team

HTTP POST `/restapi/v1.0/glip/teams`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams().post(glipPostTeamBody);
rc.revoke();
```

- Parameter `glipPostTeamBody` is of type [GlipPostTeamBody](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostTeamBody.cs)
- `result` is of type [GlipTeamInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipTeamInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-createGlipTeam) in API Explorer.


## Get Team

HTTP GET `/restapi/v1.0/glip/teams/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).get();
rc.revoke();
```


- `result` is of type [GlipTeamInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipTeamInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipTeam) in API Explorer.


## Update Team

HTTP PATCH `/restapi/v1.0/glip/teams/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).patch(glipPatchTeamBody);
rc.revoke();
```

- Parameter `glipPatchTeamBody` is of type [GlipPatchTeamBody](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPatchTeamBody.cs)
- `result` is of type [GlipTeamInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipTeamInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-patchGlipTeam) in API Explorer.


## Delete Team

HTTP DELETE `/restapi/v1.0/glip/teams/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-deleteGlipTeam) in API Explorer.


## Add Team Members

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/add`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).add().post(glipPostMembersListBody);
rc.revoke();
```

- Parameter `glipPostMembersListBody` is of type [GlipPostMembersListBody](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostMembersListBody.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-addGlipTeamMembers) in API Explorer.


## Archive Team

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/archive`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).archive().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-archiveGlipTeam) in API Explorer.


## Join Team

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/join`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).join().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-joinGlipTeam) in API Explorer.


## Leave Team

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/leave`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).leave().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-leaveGlipTeam) in API Explorer.


## Remove Team Members

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/remove`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).remove().post(glipPostMembersIdsListBody);
rc.revoke();
```

- Parameter `glipPostMembersIdsListBody` is of type [GlipPostMembersIdsListBody](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipPostMembersIdsListBody.cs)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-removeGlipTeamMembers) in API Explorer.


## Unarchive Team

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/unarchive`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().teams(chatid).unarchive().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-unarchiveGlipTeam) in API Explorer.


## Get Webhooks

HTTP GET `/restapi/v1.0/glip/webhooks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().webhooks().list();
rc.revoke();
```


- `result` is of type [GlipWebhookList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipWebhookList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-listGlipWebhooks) in API Explorer.


## Get Webhook

HTTP GET `/restapi/v1.0/glip/webhooks/{webhookId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().webhooks(webhookid).get();
rc.revoke();
```


- `result` is of type [GlipWebhookList](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/GlipWebhookList.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-readGlipWebhook) in API Explorer.


## Delete Webhook

HTTP DELETE `/restapi/v1.0/glip/webhooks/{webhookId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().webhooks(webhookid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-deleteGlipWebhook) in API Explorer.


## Activate Webhook

HTTP POST `/restapi/v1.0/glip/webhooks/{webhookId}/activate`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().webhooks(webhookid).activate().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-activateGlipWebhook) in API Explorer.


## Suspend Webhook

HTTP POST `/restapi/v1.0/glip/webhooks/{webhookId}/suspend`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).glip().webhooks(webhookid).suspend().post();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-suspendGlipWebhook) in API Explorer.


## Parse Phone Number

HTTP POST `/restapi/v1.0/number-parser/parse`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).numberparser().parse().post(parsePhoneNumberRequest, parsePhoneNumberParameters);
rc.revoke();
```

- Parameter `parsePhoneNumberRequest` is of type [ParsePhoneNumberRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ParsePhoneNumberRequest.cs)
- Parameter `parsePhoneNumberParameters` is of type [ParsePhoneNumberParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ParsePhoneNumberParameters.cs)
- `result` is of type [ParsePhoneNumberResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ParsePhoneNumberResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Account-Provisioning-parsePhoneNumber) in API Explorer.


## Verify Number

HTTP POST `/restapi/v1.0/number-porting/verify-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).numberporting().verifynumber().post(numberPortingVerifyNumberRequest);
rc.revoke();
```

- Parameter `numberPortingVerifyNumberRequest` is of type [NumberPortingVerifyNumberRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/NumberPortingVerifyNumberRequest.cs)
- `result` is of type [NumberPortingVerifyNumberResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/NumberPortingVerifyNumberResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Number-Porting-verifyNumber) in API Explorer.


## Get Service Status

HTTP GET `/restapi/v1.0/status`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).status().get();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIStatus) in API Explorer.


## Get Subscriptions

HTTP GET `/restapi/v1.0/subscription`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).subscription().list();
rc.revoke();
```


- `result` is of type [RecordsCollectionResourceSubscriptionResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/RecordsCollectionResourceSubscriptionResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-listSubscriptions) in API Explorer.


## Create Subscription

HTTP POST `/restapi/v1.0/subscription`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).subscription().post(createSubscriptionRequest);
rc.revoke();
```

- Parameter `createSubscriptionRequest` is of type [CreateSubscriptionRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/CreateSubscriptionRequest.cs)
- `result` is of type [SubscriptionInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SubscriptionInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-createSubscription) in API Explorer.


## Get Subscription

HTTP GET `/restapi/v1.0/subscription/{subscriptionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).subscription(subscriptionid).get();
rc.revoke();
```


- `result` is of type [SubscriptionInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SubscriptionInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-readSubscription) in API Explorer.


## Renew Subscription / Update Event Filters

HTTP PUT `/restapi/v1.0/subscription/{subscriptionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).subscription(subscriptionid).put(modifySubscriptionRequest, updateSubscriptionParameters);
rc.revoke();
```

- Parameter `modifySubscriptionRequest` is of type [ModifySubscriptionRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ModifySubscriptionRequest.cs)
- Parameter `updateSubscriptionParameters` is of type [UpdateSubscriptionParameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UpdateSubscriptionParameters.cs)
- `result` is of type [SubscriptionInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SubscriptionInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-updateSubscription) in API Explorer.


## Cancel Subscription

HTTP DELETE `/restapi/v1.0/subscription/{subscriptionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).subscription(subscriptionid).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-deleteSubscription) in API Explorer.


## Renew Subscription

HTTP POST `/restapi/v1.0/subscription/{subscriptionId}/renew`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.restapi(apiversion).subscription(subscriptionid).renew().post();
rc.revoke();
```


- `result` is of type [SubscriptionInfo](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SubscriptionInfo.cs)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-renewSubscription) in API Explorer.


## Get Service Provider Config

HTTP GET `/scim/v2/ServiceProviderConfig`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).serviceproviderconfig().get();
rc.revoke();
```


- `result` is of type [ServiceProviderConfig](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/ServiceProviderConfig.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-readServiceProviderConfig2) in API Explorer.


## Search or List Users

HTTP GET `/scim/v2/Users`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).users().list(searchViaGet2Parameters);
rc.revoke();
```

- Parameter `searchViaGet2Parameters` is of type [SearchViaGet2Parameters](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SearchViaGet2Parameters.cs)
- `result` is of type [UserSearchResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserSearchResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-searchViaGet2) in API Explorer.


## Create User

HTTP POST `/scim/v2/Users`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).users().post(user);
rc.revoke();
```

- Parameter `user` is of type [User](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/User.cs)
- `result` is of type [UserResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-createUser2) in API Explorer.


## Search or List Users

HTTP POST `/scim/v2/Users/.search`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).users().dotsearch().post(searchRequest);
rc.revoke();
```

- Parameter `searchRequest` is of type [SearchRequest](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/SearchRequest.cs)
- `result` is of type [UserSearchResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserSearchResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-searchViaPost2) in API Explorer.


## Get User

HTTP GET `/scim/v2/Users/{id}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).users(id).get();
rc.revoke();
```


- `result` is of type [UserResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-readUser2) in API Explorer.


## Update/Replace User

HTTP PUT `/scim/v2/Users/{id}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).users(id).put(user);
rc.revoke();
```

- Parameter `user` is of type [User](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/User.cs)
- `result` is of type [UserResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-replaceUser2) in API Explorer.


## Delete User

HTTP DELETE `/scim/v2/Users/{id}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).users(id).delete();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-deleteUser2) in API Explorer.


## Update/Patch User

HTTP PATCH `/scim/v2/Users/{id}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).users(id).patch(userPatch);
rc.revoke();
```

- Parameter `userPatch` is of type [UserPatch](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserPatch.cs)
- `result` is of type [UserResponse](./src/java/ringcentral-java/src/main/java/com/ringcentral/definitions/UserResponse.cs)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-patchUser2) in API Explorer.


## check health

HTTP GET `/scim/v2/health`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.Authorize("username", "extension", "password");
var result = rc.scim(version).health().get();
rc.revoke();
```


- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-checkHealth2) in API Explorer.