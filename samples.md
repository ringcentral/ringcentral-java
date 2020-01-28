# RingCentral Java SDK Code Samples


## Get API Versions

HTTP GET `/restapi`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi().list();
rc.revoke();
```


- `result` is of type [GetVersionsResponse](./src/main/java/com/ringcentral/definitions/GetVersionsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersions) in API Explorer.


## Revoke Token

HTTP POST `/restapi/oauth/revoke`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi().oauth().revoke().post(revokeTokenRequest);
rc.revoke();
```

- Parameter `revokeTokenRequest` is of type [RevokeTokenRequest](./src/main/java/com/ringcentral/definitions/RevokeTokenRequest.java)
- `result` is `null`

[Try it out](https://developer.ringcentral.com/api-reference#OAuth-2.0-revokeToken) in API Explorer.


## Get Token

HTTP POST `/restapi/oauth/token`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi().oauth().token().post(getTokenRequest);
rc.revoke();
```

- Parameter `getTokenRequest` is of type [GetTokenRequest](./src/main/java/com/ringcentral/definitions/GetTokenRequest.java)
- `result` is of type [TokenInfo](./src/main/java/com/ringcentral/definitions/TokenInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#OAuth-2.0-getToken) in API Explorer.


## Get Version Info

HTTP GET `/restapi/{apiVersion}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).get();
rc.revoke();
```


- `result` is of type [GetVersionResponse](./src/main/java/com/ringcentral/definitions/GetVersionResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersion) in API Explorer.


## Get Account Info

HTTP GET `/restapi/v1.0/account/{accountId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).get();
rc.revoke();
```


- `result` is of type [GetAccountInfoResponse](./src/main/java/com/ringcentral/definitions/GetAccountInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountInfo) in API Explorer.


## Get Company Active Calls

HTTP GET `/restapi/v1.0/account/{accountId}/active-calls`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).activeCalls().get(listCompanyActiveCallsParameters);
rc.revoke();
```

- Parameter `listCompanyActiveCallsParameters` is of type [ListCompanyActiveCallsParameters](./src/main/java/com/ringcentral/definitions/ListCompanyActiveCallsParameters.java)
- `result` is of type [CompanyActiveCallsResponse](./src/main/java/com/ringcentral/definitions/CompanyActiveCallsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listCompanyActiveCalls) in API Explorer.


## Create Company Call Handling Rule

HTTP POST `/restapi/v1.0/account/{accountId}/answering-rule`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).answeringRule().post(companyAnsweringRuleRequest);
rc.revoke();
```

- Parameter `companyAnsweringRuleRequest` is of type [CompanyAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleRequest.java)
- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-createCompanyAnsweringRule) in API Explorer.


## Get Company Call Handling Rule List

HTTP GET `/restapi/v1.0/account/{accountId}/answering-rule`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).answeringRule().list();
rc.revoke();
```


- `result` is of type [CompanyAnsweringRuleList](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listCompanyAnsweringRules) in API Explorer.


## Get Company Call Handling Rule

HTTP GET `/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).get();
rc.revoke();
```


- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readCompanyAnsweringRule) in API Explorer.


## Update Company Call Handling Rule

HTTP PUT `/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).put(companyAnsweringRuleUpdate);
rc.revoke();
```

- Parameter `companyAnsweringRuleUpdate` is of type [CompanyAnsweringRuleUpdate](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleUpdate.java)
- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-updateCompanyAnsweringRule) in API Explorer.


## Delete Company Call Handling Rule

HTTP DELETE `/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-deleteCompanyAnsweringRule) in API Explorer.


## Get Account Business Address

HTTP GET `/restapi/v1.0/account/{accountId}/business-address`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).businessAddress().get();
rc.revoke();
```


- `result` is of type [AccountBusinessAddressResource](./src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountBusinessAddress) in API Explorer.


## Update Company Business Address

HTTP PUT `/restapi/v1.0/account/{accountId}/business-address`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).businessAddress().put(modifyAccountBusinessAddressRequest);
rc.revoke();
```

- Parameter `modifyAccountBusinessAddressRequest` is of type [ModifyAccountBusinessAddressRequest](./src/main/java/com/ringcentral/definitions/ModifyAccountBusinessAddressRequest.java)
- `result` is of type [AccountBusinessAddressResource](./src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Company-updateAccountBusinessAddress) in API Explorer.


## Get Company Business Hours

HTTP GET `/restapi/v1.0/account/{accountId}/business-hours`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).businessHours().get();
rc.revoke();
```


- `result` is of type [CompanyBusinessHours](./src/main/java/com/ringcentral/definitions/CompanyBusinessHours.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-readCompanyBusinessHours) in API Explorer.


## Update Company Business Hours

HTTP PUT `/restapi/v1.0/account/{accountId}/business-hours`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).businessHours().put(companyBusinessHoursUpdateRequest);
rc.revoke();
```

- Parameter `companyBusinessHoursUpdateRequest` is of type [CompanyBusinessHoursUpdateRequest](./src/main/java/com/ringcentral/definitions/CompanyBusinessHoursUpdateRequest.java)
- `result` is of type [CompanyBusinessHours](./src/main/java/com/ringcentral/definitions/CompanyBusinessHours.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateCompanyBusinessHours) in API Explorer.


## Get Company Call Log Records

HTTP GET `/restapi/v1.0/account/{accountId}/call-log`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callLog().list(readCompanyCallLogParameters);
rc.revoke();
```

- Parameter `readCompanyCallLogParameters` is of type [ReadCompanyCallLogParameters](./src/main/java/com/ringcentral/definitions/ReadCompanyCallLogParameters.java)
- `result` is of type [AccountCallLogResponse](./src/main/java/com/ringcentral/definitions/AccountCallLogResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallLog) in API Explorer.


## Sync Company Call Log

HTTP GET `/restapi/v1.0/account/{accountId}/call-log-sync`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callLogSync().get(syncAccountCallLogParameters);
rc.revoke();
```

- Parameter `syncAccountCallLogParameters` is of type [SyncAccountCallLogParameters](./src/main/java/com/ringcentral/definitions/SyncAccountCallLogParameters.java)
- `result` is of type [AccountCallLogSyncResponse](./src/main/java/com/ringcentral/definitions/AccountCallLogSyncResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncAccountCallLog) in API Explorer.


## Get Company Call Log Record(s)

HTTP GET `/restapi/v1.0/account/{accountId}/call-log/{callRecordId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callLog(callRecordId).get();
rc.revoke();
```


- `result` is of type [CompanyCallLogRecord](./src/main/java/com/ringcentral/definitions/CompanyCallLogRecord.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallRecord) in API Explorer.


## Create Call Monitoring Group

HTTP POST `/restapi/v1.0/account/{accountId}/call-monitoring-groups`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups().post(createCallMonitoringGroupRequest);
rc.revoke();
```

- Parameter `createCallMonitoringGroupRequest` is of type [CreateCallMonitoringGroupRequest](./src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.java)
- `result` is of type [CallMonitoringGroup](./src/main/java/com/ringcentral/definitions/CallMonitoringGroup.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-createCallMonitoringGroup) in API Explorer.


## Get Call Monitoring Groups List

HTTP GET `/restapi/v1.0/account/{accountId}/call-monitoring-groups`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups().get(listCallMonitoringGroupsParameters);
rc.revoke();
```

- Parameter `listCallMonitoringGroupsParameters` is of type [ListCallMonitoringGroupsParameters](./src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupsParameters.java)
- `result` is of type [CallMonitoringGroups](./src/main/java/com/ringcentral/definitions/CallMonitoringGroups.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-listCallMonitoringGroups) in API Explorer.


## Updates Call Monitoring Group

HTTP PUT `/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).put(createCallMonitoringGroupRequest);
rc.revoke();
```

- Parameter `createCallMonitoringGroupRequest` is of type [CreateCallMonitoringGroupRequest](./src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.java)
- `result` is of type [CallMonitoringGroup](./src/main/java/com/ringcentral/definitions/CallMonitoringGroup.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-updateCallMonitoringGroup) in API Explorer.


## Delete Call Monitoring Group

HTTP DELETE `/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-deleteCallMonitoringGroup) in API Explorer.


## Update Call Monitoring Group List

HTTP POST `/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).bulkAssign().post(callMonitoringBulkAssign);
rc.revoke();
```

- Parameter `callMonitoringBulkAssign` is of type [CallMonitoringBulkAssign](./src/main/java/com/ringcentral/definitions/CallMonitoringBulkAssign.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-updateCallMonitoringGroupList) in API Explorer.


## Get Call Monitoring Group Member List

HTTP GET `/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/members`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).members().get(listCallMonitoringGroupMembersParameters);
rc.revoke();
```

- Parameter `listCallMonitoringGroupMembersParameters` is of type [ListCallMonitoringGroupMembersParameters](./src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupMembersParameters.java)
- `result` is of type [CallMonitoringGroupMemberList](./src/main/java/com/ringcentral/definitions/CallMonitoringGroupMemberList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-listCallMonitoringGroupMembers) in API Explorer.


## Get Call Queues

HTTP GET `/restapi/v1.0/account/{accountId}/call-queues`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callQueues().get(listCallQueuesParameters);
rc.revoke();
```

- Parameter `listCallQueuesParameters` is of type [ListCallQueuesParameters](./src/main/java/com/ringcentral/definitions/ListCallQueuesParameters.java)
- `result` is of type [CallQueues](./src/main/java/com/ringcentral/definitions/CallQueues.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listCallQueues) in API Explorer.


## Assign Multiple Call Queue Members

HTTP POST `/restapi/v1.0/account/{accountId}/call-queues/{groupId}/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).bulkAssign().post(callQueueBulkAssignResource);
rc.revoke();
```

- Parameter `callQueueBulkAssignResource` is of type [CallQueueBulkAssignResource](./src/main/java/com/ringcentral/definitions/CallQueueBulkAssignResource.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-assignMultipleCallQueueMembers) in API Explorer.


## Get Call Queue Members

HTTP GET `/restapi/v1.0/account/{accountId}/call-queues/{groupId}/members`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).members().get(listCallQueueMembersParameters);
rc.revoke();
```

- Parameter `listCallQueueMembersParameters` is of type [ListCallQueueMembersParameters](./src/main/java/com/ringcentral/definitions/ListCallQueueMembersParameters.java)
- `result` is of type [CallQueueMembers](./src/main/java/com/ringcentral/definitions/CallQueueMembers.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listCallQueueMembers) in API Explorer.


## Get Call Recording Settings

HTTP GET `/restapi/v1.0/account/{accountId}/call-recording`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callRecording().get();
rc.revoke();
```


- `result` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readCallRecordingSettings) in API Explorer.


## Update Call Recording Settings

HTTP PUT `/restapi/v1.0/account/{accountId}/call-recording`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callRecording().put(callRecordingSettingsResource);
rc.revoke();
```

- Parameter `callRecordingSettingsResource` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)
- `result` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-updateCallRecordingSettings) in API Explorer.


## Update Call Recording Extension List

HTTP POST `/restapi/v1.0/account/{accountId}/call-recording/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callRecording().bulkAssign().post(bulkAccountCallRecordingsResource);
rc.revoke();
```

- Parameter `bulkAccountCallRecordingsResource` is of type [BulkAccountCallRecordingsResource](./src/main/java/com/ringcentral/definitions/BulkAccountCallRecordingsResource.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-updateCallRecordingExtensionList) in API Explorer.


## Get Call Recording Custom Greeting List

HTTP GET `/restapi/v1.0/account/{accountId}/call-recording/custom-greetings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callRecording().customGreetings().get(listCallRecordingCustomGreetingsParameters);
rc.revoke();
```

- Parameter `listCallRecordingCustomGreetingsParameters` is of type [ListCallRecordingCustomGreetingsParameters](./src/main/java/com/ringcentral/definitions/ListCallRecordingCustomGreetingsParameters.java)
- `result` is of type [CallRecordingCustomGreetings](./src/main/java/com/ringcentral/definitions/CallRecordingCustomGreetings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listCallRecordingCustomGreetings) in API Explorer.


## Delete Call Recording Custom Greeting

HTTP DELETE `/restapi/v1.0/account/{accountId}/call-recording/custom-greetings/{greetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callRecording().customGreetings(greetingId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-deleteCallRecordingCustomGreeting) in API Explorer.


## Get Call Recording Extension List

HTTP GET `/restapi/v1.0/account/{accountId}/call-recording/extensions`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).callRecording().extensions().get();
rc.revoke();
```


- `result` is of type [CallRecordingExtensions](./src/main/java/com/ringcentral/definitions/CallRecordingExtensions.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listCallRecordingExtensions) in API Explorer.


## Assign Multiple Department Members

HTTP POST `/restapi/v1.0/account/{accountId}/department/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).department().bulkAssign().post(departmentBulkAssignResource);
rc.revoke();
```

- Parameter `departmentBulkAssignResource` is of type [DepartmentBulkAssignResource](./src/main/java/com/ringcentral/definitions/DepartmentBulkAssignResource.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-assignMultipleDepartmentMembers) in API Explorer.


## Get Department Member List

HTTP GET `/restapi/v1.0/account/{accountId}/department/{departmentId}/members`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).department(departmentId).members().get(listDepartmentMembersParameters);
rc.revoke();
```

- Parameter `listDepartmentMembersParameters` is of type [ListDepartmentMembersParameters](./src/main/java/com/ringcentral/definitions/ListDepartmentMembersParameters.java)
- `result` is of type [DepartmentMemberList](./src/main/java/com/ringcentral/definitions/DepartmentMemberList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listDepartmentMembers) in API Explorer.


## Get Device

HTTP GET `/restapi/v1.0/account/{accountId}/device/{deviceId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).device(deviceId).get(readDeviceParameters);
rc.revoke();
```

- Parameter `readDeviceParameters` is of type [ReadDeviceParameters](./src/main/java/com/ringcentral/definitions/ReadDeviceParameters.java)
- `result` is of type [GetDeviceInfoResponse](./src/main/java/com/ringcentral/definitions/GetDeviceInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Devices-readDevice) in API Explorer.


## Update Device

HTTP PUT `/restapi/v1.0/account/{accountId}/device/{deviceId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).device(deviceId).put(accountDeviceUpdate);
rc.revoke();
```

- Parameter `accountDeviceUpdate` is of type [AccountDeviceUpdate](./src/main/java/com/ringcentral/definitions/AccountDeviceUpdate.java)
- `result` is of type [DeviceResource](./src/main/java/com/ringcentral/definitions/DeviceResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Devices-updateDevice) in API Explorer.


## Get Company Directory Entries

HTTP GET `/restapi/v1.0/account/{accountId}/directory/entries`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).directory().entries().list(listDirectoryEntriesParameters);
rc.revoke();
```

- Parameter `listDirectoryEntriesParameters` is of type [ListDirectoryEntriesParameters](./src/main/java/com/ringcentral/definitions/ListDirectoryEntriesParameters.java)
- `result` is of type [DirectoryResource](./src/main/java/com/ringcentral/definitions/DirectoryResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-listDirectoryEntries) in API Explorer.


## Search Company Directory Entries

HTTP POST `/restapi/v1.0/account/{accountId}/directory/entries/search`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).directory().entries().search().post(searchDirectoryEntriesRequest);
rc.revoke();
```

- Parameter `searchDirectoryEntriesRequest` is of type [SearchDirectoryEntriesRequest](./src/main/java/com/ringcentral/definitions/SearchDirectoryEntriesRequest.java)
- `result` is of type [DirectoryResource](./src/main/java/com/ringcentral/definitions/DirectoryResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-searchDirectoryEntries) in API Explorer.


## Get Corporate Directory Entry

HTTP GET `/restapi/v1.0/account/{accountId}/directory/entries/{entryId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).directory().entries(entryId).get();
rc.revoke();
```


- `result` is of type [ContactResource](./src/main/java/com/ringcentral/definitions/ContactResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readDirectoryEntry) in API Explorer.


## Get Account Federation

HTTP GET `/restapi/v1.0/account/{accountId}/directory/federation`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).directory().federation().get();
rc.revoke();
```


- `result` is of type [FederationResource](./src/main/java/com/ringcentral/definitions/FederationResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readAccountFederation) in API Explorer.


## Get Device List

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/devices`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().devices().get(listDevicesAutomaticLocationUpdatesParameters);
rc.revoke();
```

- Parameter `listDevicesAutomaticLocationUpdatesParameters` is of type [ListDevicesAutomaticLocationUpdatesParameters](./src/main/java/com/ringcentral/definitions/ListDevicesAutomaticLocationUpdatesParameters.java)
- `result` is of type [ListDevicesAutomaticLocationUpdates](./src/main/java/com/ringcentral/definitions/ListDevicesAutomaticLocationUpdates.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listDevicesAutomaticLocationUpdates) in API Explorer.


## Enable Automatic Location Updates for Devices

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/devices/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().devices().bulkAssign().post(assignMultipleDevicesAutomaticLocationUpdates);
rc.revoke();
```

- Parameter `assignMultipleDevicesAutomaticLocationUpdates` is of type [AssignMultipleDevicesAutomaticLocationUpdates](./src/main/java/com/ringcentral/definitions/AssignMultipleDevicesAutomaticLocationUpdates.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-assignMultipleDevicesAutomaticLocationUpdates) in API Explorer.


## Get Network Map

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks().list();
rc.revoke();
```


- `result` is of type [NetworksList](./src/main/java/com/ringcentral/definitions/NetworksList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listNetworks) in API Explorer.


## Create Network

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks().post(createNetworkRequest);
rc.revoke();
```

- Parameter `createNetworkRequest` is of type [CreateNetworkRequest](./src/main/java/com/ringcentral/definitions/CreateNetworkRequest.java)
- `result` is of type [NetworkInfo](./src/main/java/com/ringcentral/definitions/NetworkInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createNetwork) in API Explorer.


## Get Network

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).get();
rc.revoke();
```


- `result` is of type [NetworkInfo](./src/main/java/com/ringcentral/definitions/NetworkInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readNetwork) in API Explorer.


## Update Network

HTTP PUT `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).put(updateNetworkRequest);
rc.revoke();
```

- Parameter `updateNetworkRequest` is of type [UpdateNetworkRequest](./src/main/java/com/ringcentral/definitions/UpdateNetworkRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateNetwork) in API Explorer.


## Delete Network

HTTP DELETE `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteNetwork) in API Explorer.


## Get Account Switch List

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches().list(listAccountSwitchesParameters);
rc.revoke();
```

- Parameter `listAccountSwitchesParameters` is of type [ListAccountSwitchesParameters](./src/main/java/com/ringcentral/definitions/ListAccountSwitchesParameters.java)
- `result` is of type [SwitchesList](./src/main/java/com/ringcentral/definitions/SwitchesList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listAccountSwitches) in API Explorer.


## Create Switch

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches().post(createSwitchInfo);
rc.revoke();
```

- Parameter `createSwitchInfo` is of type [CreateSwitchInfo](./src/main/java/com/ringcentral/definitions/CreateSwitchInfo.java)
- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createSwitch) in API Explorer.


## Create Multiple Switches

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-create`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkCreate().post(createMultipleSwitchesRequest);
rc.revoke();
```

- Parameter `createMultipleSwitchesRequest` is of type [CreateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/CreateMultipleSwitchesRequest.java)
- `result` is of type [CreateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/CreateMultipleSwitchesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createMultipleSwitches) in API Explorer.


## Update Multiple Switches

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-update`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkUpdate().post(updateMultipleSwitchesRequest);
rc.revoke();
```

- Parameter `updateMultipleSwitchesRequest` is of type [UpdateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/UpdateMultipleSwitchesRequest.java)
- `result` is of type [UpdateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/UpdateMultipleSwitchesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateMultipleSwitches) in API Explorer.


## Validate Multiple Switches

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-validate`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkValidate().post(validateMultipleSwitchesRequest);
rc.revoke();
```

- Parameter `validateMultipleSwitchesRequest` is of type [ValidateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/ValidateMultipleSwitchesRequest.java)
- `result` is of type [ValidateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/ValidateMultipleSwitchesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-validateMultipleSwitches) in API Explorer.


## Get Switch

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).get();
rc.revoke();
```


- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readSwitch) in API Explorer.


## Update Switch

HTTP PUT `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).put(updateSwitchInfo);
rc.revoke();
```

- Parameter `updateSwitchInfo` is of type [UpdateSwitchInfo](./src/main/java/com/ringcentral/definitions/UpdateSwitchInfo.java)
- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateSwitch) in API Explorer.


## Delete Switch

HTTP DELETE `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteSwitch) in API Explorer.


## Get Emergency Map Configuration Task

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/tasks/{taskId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().tasks(taskId).get();
rc.revoke();
```


- `result` is of type [AutomaticLocationUpdatesTaskInfo](./src/main/java/com/ringcentral/definitions/AutomaticLocationUpdatesTaskInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readAutomaticLocationUpdatesTask) in API Explorer.


## Get User List

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/users`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().users().get(listAutomaticLocationUpdatesUsersParameters);
rc.revoke();
```

- Parameter `listAutomaticLocationUpdatesUsersParameters` is of type [ListAutomaticLocationUpdatesUsersParameters](./src/main/java/com/ringcentral/definitions/ListAutomaticLocationUpdatesUsersParameters.java)
- `result` is of type [AutomaticLocationUpdatesUserList](./src/main/java/com/ringcentral/definitions/AutomaticLocationUpdatesUserList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listAutomaticLocationUpdatesUsers) in API Explorer.


## Enable Automatic Location Updates for Users

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/users/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().users().bulkAssign().post(bulkAssignAutomaticaLocationUpdatesUsers);
rc.revoke();
```

- Parameter `bulkAssignAutomaticaLocationUpdatesUsers` is of type [BulkAssignAutomaticaLocationUpdatesUsers](./src/main/java/com/ringcentral/definitions/BulkAssignAutomaticaLocationUpdatesUsers.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-assignMultipleAutomaticaLocationUpdatesUsers) in API Explorer.


## Get Wireless Point List

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints().list(listWirelessPointsParameters);
rc.revoke();
```

- Parameter `listWirelessPointsParameters` is of type [ListWirelessPointsParameters](./src/main/java/com/ringcentral/definitions/ListWirelessPointsParameters.java)
- `result` is of type [WirelessPointsList](./src/main/java/com/ringcentral/definitions/WirelessPointsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listWirelessPoints) in API Explorer.


## Create Wireless Point

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints().post(createWirelessPoint);
rc.revoke();
```

- Parameter `createWirelessPoint` is of type [CreateWirelessPoint](./src/main/java/com/ringcentral/definitions/CreateWirelessPoint.java)
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createWirelessPoint) in API Explorer.


## Create Multiple Wireless Points

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-create`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkCreate().post(createMultipleWirelessPointsRequest);
rc.revoke();
```

- Parameter `createMultipleWirelessPointsRequest` is of type [CreateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/CreateMultipleWirelessPointsRequest.java)
- `result` is of type [CreateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/CreateMultipleWirelessPointsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createMultipleWirelessPoints) in API Explorer.


## Update Multiple Wireless Points

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-update`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkUpdate().post(updateMultipleWirelessPointsRequest);
rc.revoke();
```

- Parameter `updateMultipleWirelessPointsRequest` is of type [UpdateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/UpdateMultipleWirelessPointsRequest.java)
- `result` is of type [UpdateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/UpdateMultipleWirelessPointsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateMultipleWirelessPoints) in API Explorer.


## Validate Multiple Wireless Points

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-validate`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkValidate().post(validateMultipleWirelessPointsRequest);
rc.revoke();
```

- Parameter `validateMultipleWirelessPointsRequest` is of type [ValidateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/ValidateMultipleWirelessPointsRequest.java)
- `result` is of type [ValidateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/ValidateMultipleWirelessPointsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-validateMultipleWirelessPoints) in API Explorer.


## Get Wireless Point

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).get();
rc.revoke();
```


- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readWirelessPoint) in API Explorer.


## Update Wireless Point

HTTP PUT `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).put(updateWirelessPoint);
rc.revoke();
```

- Parameter `updateWirelessPoint` is of type [UpdateWirelessPoint](./src/main/java/com/ringcentral/definitions/UpdateWirelessPoint.java)
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateWirelessPoint) in API Explorer.


## Delete Wireless Point

HTTP DELETE `/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteWirelessPoint) in API Explorer.


## Add Emergency Location

HTTP POST `/restapi/v1.0/account/{accountId}/emergency-locations`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyLocations().post(emergencyLocationInfoRequest);
rc.revoke();
```

- Parameter `emergencyLocationInfoRequest` is of type [EmergencyLocationInfoRequest](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfoRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createEmergencyLocation) in API Explorer.


## Get Emergency Location List

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-locations`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyLocations().list(listEmergencyLocationsParameters);
rc.revoke();
```

- Parameter `listEmergencyLocationsParameters` is of type [ListEmergencyLocationsParameters](./src/main/java/com/ringcentral/definitions/ListEmergencyLocationsParameters.java)
- `result` is of type [EmergencyLocationList](./src/main/java/com/ringcentral/definitions/EmergencyLocationList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listEmergencyLocations) in API Explorer.


## Get Emergency Location

HTTP GET `/restapi/v1.0/account/{accountId}/emergency-locations/{locationId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).get();
rc.revoke();
```


- `result` is of type [EmergencyLocationInfo](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readEmergencyLocation) in API Explorer.


## Update Emergency Location

HTTP PUT `/restapi/v1.0/account/{accountId}/emergency-locations/{locationId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).put(emergencyLocationInfoRequest);
rc.revoke();
```

- Parameter `emergencyLocationInfoRequest` is of type [EmergencyLocationInfoRequest](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfoRequest.java)
- `result` is of type [EmergencyLocationInfo](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateEmergencyLocation) in API Explorer.


## Get Extension List

HTTP GET `/restapi/v1.0/account/{accountId}/extension`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension().list(listExtensionsParameters);
rc.revoke();
```

- Parameter `listExtensionsParameters` is of type [ListExtensionsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionsParameters.java)
- `result` is of type [GetExtensionListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-listExtensions) in API Explorer.


## Create Extension

HTTP POST `/restapi/v1.0/account/{accountId}/extension`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension().post(extensionCreationRequest);
rc.revoke();
```

- Parameter `extensionCreationRequest` is of type [ExtensionCreationRequest](./src/main/java/com/ringcentral/definitions/ExtensionCreationRequest.java)
- `result` is of type [ExtensionCreationResponse](./src/main/java/com/ringcentral/definitions/ExtensionCreationResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-createExtension) in API Explorer.


## Get Extension

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).get();
rc.revoke();
```


- `result` is of type [GetExtensionInfoResponse](./src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readExtension) in API Explorer.


## Update Extension

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).put(extensionUpdateRequest);
rc.revoke();
```

- Parameter `extensionUpdateRequest` is of type [ExtensionUpdateRequest](./src/main/java/com/ringcentral/definitions/ExtensionUpdateRequest.java)
- `result` is of type [GetExtensionInfoResponse](./src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateExtension) in API Explorer.


## Delete Extension

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).delete(deleteExtensionParameters);
rc.revoke();
```

- Parameter `deleteExtensionParameters` is of type [DeleteExtensionParameters](./src/main/java/com/ringcentral/definitions/DeleteExtensionParameters.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-deleteExtension) in API Explorer.


## Get User Active Calls

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/active-calls`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).activeCalls().get(listExtensionActiveCallsParameters);
rc.revoke();
```

- Parameter `listExtensionActiveCallsParameters` is of type [ListExtensionActiveCallsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionActiveCallsParameters.java)
- `result` is of type [UserActiveCallsResponse](./src/main/java/com/ringcentral/definitions/UserActiveCallsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listExtensionActiveCalls) in API Explorer.


## Address Book Synchronization

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book-sync`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBookSync().get(syncAddressBookParameters);
rc.revoke();
```

- Parameter `syncAddressBookParameters` is of type [SyncAddressBookParameters](./src/main/java/com/ringcentral/definitions/SyncAddressBookParameters.java)
- `result` is of type [AddressBookSync](./src/main/java/com/ringcentral/definitions/AddressBookSync.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-syncAddressBook) in API Explorer.


## Get Contact List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact().list(listContactsParameters);
rc.revoke();
```

- Parameter `listContactsParameters` is of type [ListContactsParameters](./src/main/java/com/ringcentral/definitions/ListContactsParameters.java)
- `result` is of type [ContactList](./src/main/java/com/ringcentral/definitions/ContactList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listContacts) in API Explorer.


## Create Contact

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact().post(personalContactRequest, createContactParameters);
rc.revoke();
```

- Parameter `personalContactRequest` is of type [PersonalContactRequest](./src/main/java/com/ringcentral/definitions/PersonalContactRequest.java)
- Parameter `createContactParameters` is of type [CreateContactParameters](./src/main/java/com/ringcentral/definitions/CreateContactParameters.java)
- `result` is of type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-createContact) in API Explorer.


## Get Contact

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).get();
rc.revoke();
```


- `result` is of type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-readContact) in API Explorer.


## Update Contact

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).put(personalContactRequest, updateContactParameters);
rc.revoke();
```

- Parameter `personalContactRequest` is of type [PersonalContactRequest](./src/main/java/com/ringcentral/definitions/PersonalContactRequest.java)
- Parameter `updateContactParameters` is of type [UpdateContactParameters](./src/main/java/com/ringcentral/definitions/UpdateContactParameters.java)
- `result` is of type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateContact) in API Explorer.


## Delete Contact

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-deleteContact) in API Explorer.


## Get Call Handling Rules

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule().list(listAnsweringRulesParameters);
rc.revoke();
```

- Parameter `listAnsweringRulesParameters` is of type [ListAnsweringRulesParameters](./src/main/java/com/ringcentral/definitions/ListAnsweringRulesParameters.java)
- `result` is of type [UserAnsweringRuleList](./src/main/java/com/ringcentral/definitions/UserAnsweringRuleList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listAnsweringRules) in API Explorer.


## Create Call Handling Rule

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule().post(createAnsweringRuleRequest);
rc.revoke();
```

- Parameter `createAnsweringRuleRequest` is of type [CreateAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/CreateAnsweringRuleRequest.java)
- `result` is of type [CustomAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CustomAnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-createAnsweringRule) in API Explorer.


## Get Call Handling Rule

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).get(readAnsweringRuleParameters);
rc.revoke();
```

- Parameter `readAnsweringRuleParameters` is of type [ReadAnsweringRuleParameters](./src/main/java/com/ringcentral/definitions/ReadAnsweringRuleParameters.java)
- `result` is of type [AnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readAnsweringRule) in API Explorer.


## Update Call Handling Rule

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).put(updateAnsweringRuleRequest);
rc.revoke();
```

- Parameter `updateAnsweringRuleRequest` is of type [UpdateAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/UpdateAnsweringRuleRequest.java)
- `result` is of type [AnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-updateAnsweringRule) in API Explorer.


## Delete Call Handling Rule

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-deleteAnsweringRule) in API Explorer.


## Get Authorization Profile

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).authzProfile().get();
rc.revoke();
```


- `result` is of type [AuthProfileResource](./src/main/java/com/ringcentral/definitions/AuthProfileResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Permissions-readAuthorizationProfile) in API Explorer.


## Check User Permission

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile/check`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).authzProfile().check().get(checkUserPermissionParameters);
rc.revoke();
```

- Parameter `checkUserPermissionParameters` is of type [CheckUserPermissionParameters](./src/main/java/com/ringcentral/definitions/CheckUserPermissionParameters.java)
- `result` is of type [AuthProfileCheckResource](./src/main/java/com/ringcentral/definitions/AuthProfileCheckResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Permissions-checkUserPermission) in API Explorer.


## Get User Business Hours

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).businessHours().get();
rc.revoke();
```


- `result` is of type [GetUserBusinessHoursResponse](./src/main/java/com/ringcentral/definitions/GetUserBusinessHoursResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-readUserBusinessHours) in API Explorer.


## Update User Business Hours

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).businessHours().put(userBusinessHoursUpdateRequest);
rc.revoke();
```

- Parameter `userBusinessHoursUpdateRequest` is of type [UserBusinessHoursUpdateRequest](./src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateRequest.java)
- `result` is of type [UserBusinessHoursUpdateResponse](./src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateUserBusinessHours) in API Explorer.


## Get User Call Log Records

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog().list(readUserCallLogParameters);
rc.revoke();
```

- Parameter `readUserCallLogParameters` is of type [ReadUserCallLogParameters](./src/main/java/com/ringcentral/definitions/ReadUserCallLogParameters.java)
- `result` is of type [UserCallLogResponse](./src/main/java/com/ringcentral/definitions/UserCallLogResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallLog) in API Explorer.


## Delete User Call Log

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog().delete(deleteUserCallLogParameters);
rc.revoke();
```

- Parameter `deleteUserCallLogParameters` is of type [DeleteUserCallLogParameters](./src/main/java/com/ringcentral/definitions/DeleteUserCallLogParameters.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-deleteUserCallLog) in API Explorer.


## Sync User Call Log

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log-sync`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLogSync().get(syncUserCallLogParameters);
rc.revoke();
```

- Parameter `syncUserCallLogParameters` is of type [SyncUserCallLogParameters](./src/main/java/com/ringcentral/definitions/SyncUserCallLogParameters.java)
- `result` is of type [CallLogSync](./src/main/java/com/ringcentral/definitions/CallLogSync.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncUserCallLog) in API Explorer.


## Get User Call Record

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log/{callRecordId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog(callRecordId).get(readUserCallRecordParameters);
rc.revoke();
```

- Parameter `readUserCallRecordParameters` is of type [ReadUserCallRecordParameters](./src/main/java/com/ringcentral/definitions/ReadUserCallRecordParameters.java)
- `result` is of type [UserCallLogRecord](./src/main/java/com/ringcentral/definitions/UserCallLogRecord.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallRecord) in API Explorer.


## Update User Call Queues

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-queues`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callQueues().put(userCallQueues);
rc.revoke();
```

- Parameter `userCallQueues` is of type [UserCallQueues](./src/main/java/com/ringcentral/definitions/UserCallQueues.java)
- `result` is of type [UserCallQueues](./src/main/java/com/ringcentral/definitions/UserCallQueues.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-updateUserCallQueues) in API Explorer.


## Get Caller Blocking Settings

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().get();
rc.revoke();
```


- `result` is of type [CallerBlockingSettings](./src/main/java/com/ringcentral/definitions/CallerBlockingSettings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-readCallerBlockingSettings) in API Explorer.


## Update Caller Blocking Settings

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().put(callerBlockingSettingsUpdate);
rc.revoke();
```

- Parameter `callerBlockingSettingsUpdate` is of type [CallerBlockingSettingsUpdate](./src/main/java/com/ringcentral/definitions/CallerBlockingSettingsUpdate.java)
- `result` is of type [CallerBlockingSettings](./src/main/java/com/ringcentral/definitions/CallerBlockingSettings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateCallerBlockingSettings) in API Explorer.


## Get Blocked/Allowed Phone Numbers

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers().list(listBlockedAllowedNumbersParameters);
rc.revoke();
```

- Parameter `listBlockedAllowedNumbersParameters` is of type [ListBlockedAllowedNumbersParameters](./src/main/java/com/ringcentral/definitions/ListBlockedAllowedNumbersParameters.java)
- `result` is of type [BlockedAllowedPhoneNumbersList](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumbersList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-listBlockedAllowedNumbers) in API Explorer.


## Add Blocked/Allowed Number

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers().post(addBlockedAllowedPhoneNumber);
rc.revoke();
```

- Parameter `addBlockedAllowedPhoneNumber` is of type [AddBlockedAllowedPhoneNumber](./src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.java)
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-createBlockedAllowedNumber) in API Explorer.


## Get Blocked/Allowed Number

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).get();
rc.revoke();
```


- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-readBlockedAllowedNumber) in API Explorer.


## Delete Blocked/Allowed Number

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-deleteBlockedAllowedNumber) in API Explorer.


## Update Blocked/Allowed Number

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).put(addBlockedAllowedPhoneNumber);
rc.revoke();
```

- Parameter `addBlockedAllowedPhoneNumber` is of type [AddBlockedAllowedPhoneNumber](./src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.java)
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateBlockedAllowedNumber) in API Explorer.


## Get Extension Caller ID

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-id`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerId().get();
rc.revoke();
```


- `result` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readExtensionCallerId) in API Explorer.


## Update Extension Caller ID

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-id`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerId().put(extensionCallerIdInfo);
rc.revoke();
```

- Parameter `extensionCallerIdInfo` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)
- `result` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateExtensionCallerId) in API Explorer.


## Create Internal Text Message

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/company-pager`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).companyPager().post(createInternalTextMessageRequest);
rc.revoke();
```

- Parameter `createInternalTextMessageRequest` is of type [CreateInternalTextMessageRequest](./src/main/java/com/ringcentral/definitions/CreateInternalTextMessageRequest.java)
- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Pager-Messages-createInternalTextMessage) in API Explorer.


## Get User Conferencing Settings

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).conferencing().get(readConferencingSettingsParameters);
rc.revoke();
```

- Parameter `readConferencingSettingsParameters` is of type [ReadConferencingSettingsParameters](./src/main/java/com/ringcentral/definitions/ReadConferencingSettingsParameters.java)
- `result` is of type [GetConferencingInfoResponse](./src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readConferencingSettings) in API Explorer.


## Update User Conferencing Settings

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).conferencing().put(updateConferencingInfoRequest);
rc.revoke();
```

- Parameter `updateConferencingInfoRequest` is of type [UpdateConferencingInfoRequest](./src/main/java/com/ringcentral/definitions/UpdateConferencingInfoRequest.java)
- `result` is of type [GetConferencingInfoResponse](./src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateConferencingSettings) in API Explorer.


## Get Extension Device List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/device`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).device().get(listExtensionDevicesParameters);
rc.revoke();
```

- Parameter `listExtensionDevicesParameters` is of type [ListExtensionDevicesParameters](./src/main/java/com/ringcentral/definitions/ListExtensionDevicesParameters.java)
- `result` is of type [GetExtensionDevicesResponse](./src/main/java/com/ringcentral/definitions/GetExtensionDevicesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Devices-listExtensionDevices) in API Explorer.


## Get Favorite Contact List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).favorite().get();
rc.revoke();
```


- `result` is of type [FavoriteContactList](./src/main/java/com/ringcentral/definitions/FavoriteContactList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listFavoriteContacts) in API Explorer.


## Update Favorite Contact List

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).favorite().put(favoriteCollection);
rc.revoke();
```

- Parameter `favoriteCollection` is of type [FavoriteCollection](./src/main/java/com/ringcentral/definitions/FavoriteCollection.java)
- `result` is of type [FavoriteContactList](./src/main/java/com/ringcentral/definitions/FavoriteContactList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateFavoriteContactList) in API Explorer.


## Create Fax Message

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/fax`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).fax().post(createFaxMessageRequest);
rc.revoke();
```

- Parameter `createFaxMessageRequest` is of type [CreateFaxMessageRequest](./src/main/java/com/ringcentral/definitions/CreateFaxMessageRequest.java)
- `result` is of type [FaxResponse](./src/main/java/com/ringcentral/definitions/FaxResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Fax-createFaxMessage) in API Explorer.


## Get User Features

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/features`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).features().get(readUserFeaturesParameters);
rc.revoke();
```

- Parameter `readUserFeaturesParameters` is of type [ReadUserFeaturesParameters](./src/main/java/com/ringcentral/definitions/ReadUserFeaturesParameters.java)
- `result` is of type [FeatureList](./src/main/java/com/ringcentral/definitions/FeatureList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Features-readUserFeatures) in API Explorer.


## Get Forwarding Number List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber().list(listForwardingNumbersParameters);
rc.revoke();
```

- Parameter `listForwardingNumbersParameters` is of type [ListForwardingNumbersParameters](./src/main/java/com/ringcentral/definitions/ListForwardingNumbersParameters.java)
- `result` is of type [GetExtensionForwardingNumberListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionForwardingNumberListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-listForwardingNumbers) in API Explorer.


## Create Forwarding Number

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber().post(createForwardingNumberRequest);
rc.revoke();
```

- Parameter `createForwardingNumberRequest` is of type [CreateForwardingNumberRequest](./src/main/java/com/ringcentral/definitions/CreateForwardingNumberRequest.java)
- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-createForwardingNumber) in API Explorer.


## Get Forwarding Number

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).get();
rc.revoke();
```


- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-readForwardingNumber) in API Explorer.


## Update Forwarding Number

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).put(updateForwardingNumberRequest);
rc.revoke();
```

- Parameter `updateForwardingNumberRequest` is of type [UpdateForwardingNumberRequest](./src/main/java/com/ringcentral/definitions/UpdateForwardingNumberRequest.java)
- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-updateForwardingNumber) in API Explorer.


## Delete Forwarding Number

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-deleteForwardingNumber) in API Explorer.


## Get Extension Grant List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/grant`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).grant().get(listExtensionGrantsParameters);
rc.revoke();
```

- Parameter `listExtensionGrantsParameters` is of type [ListExtensionGrantsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionGrantsParameters.java)
- `result` is of type [GetExtensionGrantListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionGrantListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-listExtensionGrants) in API Explorer.


## Create Custom User Greeting

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).greeting().post(createCustomUserGreetingRequest);
rc.revoke();
```

- Parameter `createCustomUserGreetingRequest` is of type [CreateCustomUserGreetingRequest](./src/main/java/com/ringcentral/definitions/CreateCustomUserGreetingRequest.java)
- `result` is of type [CustomUserGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomUserGreetingInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-createCustomUserGreeting) in API Explorer.


## Get Custom Greeting

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting/{greetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).greeting(greetingId).get();
rc.revoke();
```


- `result` is of type [CustomUserGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomUserGreetingInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readCustomGreeting) in API Explorer.


## Get Scheduled Meetings

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().list();
rc.revoke();
```


- `result` is of type [MeetingsResource](./src/main/java/com/ringcentral/definitions/MeetingsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-listMeetings) in API Explorer.


## Create Meetings

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().post(meetingRequestResource);
rc.revoke();
```

- Parameter `meetingRequestResource` is of type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-createMeeting) in API Explorer.


## Get User Meeting Recordings List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting-recordings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingRecordings().get(listUserMeetingRecordingsParameters);
rc.revoke();
```

- Parameter `listUserMeetingRecordingsParameters` is of type [ListUserMeetingRecordingsParameters](./src/main/java/com/ringcentral/definitions/ListUserMeetingRecordingsParameters.java)
- `result` is of type [ListMeetingRecordingsResponse](./src/main/java/com/ringcentral/definitions/ListMeetingRecordingsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Recordings-listUserMeetingRecordings) in API Explorer.


## Get Meeting Service Info

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/service-info`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().serviceInfo().get();
rc.revoke();
```


- `result` is of type [MeetingServiceInfoResource](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readMeetingServiceInfo) in API Explorer.


## Get Meeting Info

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).get();
rc.revoke();
```


- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-readMeeting) in API Explorer.


## Update Meeting

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).put(meetingRequestResource);
rc.revoke();
```

- Parameter `meetingRequestResource` is of type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-updateMeeting) in API Explorer.


## Delete Meeting

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-deleteMeeting) in API Explorer.


## End Meeting

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).end().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-endMeeting) in API Explorer.


## Get Assistants

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assistants`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingsConfiguration().assistants().get();
rc.revoke();
```


- `result` is of type [AssistantsResource](./src/main/java/com/ringcentral/definitions/AssistantsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readAssistants) in API Explorer.


## Get Assisted Users

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assisted`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingsConfiguration().assisted().get();
rc.revoke();
```


- `result` is of type [AssistedUsersResource](./src/main/java/com/ringcentral/definitions/AssistedUsersResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readAssistedUsers) in API Explorer.


## Get Message List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore().list(listMessagesParameters);
rc.revoke();
```

- Parameter `listMessagesParameters` is of type [ListMessagesParameters](./src/main/java/com/ringcentral/definitions/ListMessagesParameters.java)
- `result` is of type [GetMessageList](./src/main/java/com/ringcentral/definitions/GetMessageList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-listMessages) in API Explorer.


## Get Message

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).get();
rc.revoke();
```


- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessage) in API Explorer.


## Update Message(s)

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).put(updateMessageRequest);
rc.revoke();
```

- Parameter `updateMessageRequest` is of type [UpdateMessageRequest](./src/main/java/com/ringcentral/definitions/UpdateMessageRequest.java)
- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessage) in API Explorer.


## Delete Message

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).delete(deleteMessageParameters);
rc.revoke();
```

- Parameter `deleteMessageParameters` is of type [DeleteMessageParameters](./src/main/java/com/ringcentral/definitions/DeleteMessageParameters.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-deleteMessage) in API Explorer.


## Get Message Content

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).content(attachmentId).get(readMessageContentParameters);
rc.revoke();
```

- Parameter `readMessageContentParameters` is of type [ReadMessageContentParameters](./src/main/java/com/ringcentral/definitions/ReadMessageContentParameters.java)
- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageContent) in API Explorer.


## Sync Messages

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-sync`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageSync().get(syncMessagesParameters);
rc.revoke();
```

- Parameter `syncMessagesParameters` is of type [SyncMessagesParameters](./src/main/java/com/ringcentral/definitions/SyncMessagesParameters.java)
- `result` is of type [GetMessageSyncResponse](./src/main/java/com/ringcentral/definitions/GetMessageSyncResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-syncMessages) in API Explorer.


## Create MMS Message

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/mms`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).mms().post(createSmsMessage);
rc.revoke();
```

- Parameter `createSmsMessage` is of type [CreateSMSMessage](./src/main/java/com/ringcentral/definitions/CreateSMSMessage.java)
- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#MMS-createMMS) in API Explorer.


## Get Notification Settings

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).notificationSettings().get();
rc.revoke();
```


- `result` is of type [NotificationSettings](./src/main/java/com/ringcentral/definitions/NotificationSettings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readNotificationSettings) in API Explorer.


## Update Notification Settings

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).notificationSettings().put(notificationSettingsUpdateRequest);
rc.revoke();
```

- Parameter `notificationSettingsUpdateRequest` is of type [NotificationSettingsUpdateRequest](./src/main/java/com/ringcentral/definitions/NotificationSettingsUpdateRequest.java)
- `result` is of type [NotificationSettings](./src/main/java/com/ringcentral/definitions/NotificationSettings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateNotificationSettings) in API Explorer.


## Get Extension Phone Number List

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/phone-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).phoneNumber().get(listExtensionPhoneNumbersParameters);
rc.revoke();
```

- Parameter `listExtensionPhoneNumbersParameters` is of type [ListExtensionPhoneNumbersParameters](./src/main/java/com/ringcentral/definitions/ListExtensionPhoneNumbersParameters.java)
- `result` is of type [GetExtensionPhoneNumbersResponse](./src/main/java/com/ringcentral/definitions/GetExtensionPhoneNumbersResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-listExtensionPhoneNumbers) in API Explorer.


## Get User Presence Status

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/presence`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).presence().get(readUserPresenceStatusParameters);
rc.revoke();
```

- Parameter `readUserPresenceStatusParameters` is of type [ReadUserPresenceStatusParameters](./src/main/java/com/ringcentral/definitions/ReadUserPresenceStatusParameters.java)
- `result` is of type [GetPresenceInfo](./src/main/java/com/ringcentral/definitions/GetPresenceInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readUserPresenceStatus) in API Explorer.


## Update User Presence Status

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/presence`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).presence().put(presenceInfoResource);
rc.revoke();
```

- Parameter `presenceInfoResource` is of type [PresenceInfoResource](./src/main/java/com/ringcentral/definitions/PresenceInfoResource.java)
- `result` is of type [PresenceInfoResource](./src/main/java/com/ringcentral/definitions/PresenceInfoResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateUserPresenceStatus) in API Explorer.


## Get User Profile Image

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().list();
rc.revoke();
```


- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readUserProfileImage) in API Explorer.


## Upload User Profile Image

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().post(createUserProfileImageRequest);
rc.revoke();
```

- Parameter `createUserProfileImageRequest` is of type [CreateUserProfileImageRequest](./src/main/java/com/ringcentral/definitions/CreateUserProfileImageRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-createUserProfileImage) in API Explorer.


## Update User Profile Image

HTTP PUT `/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().put(updateUserProfileImageRequest);
rc.revoke();
```

- Parameter `updateUserProfileImageRequest` is of type [UpdateUserProfileImageRequest](./src/main/java/com/ringcentral/definitions/UpdateUserProfileImageRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateUserProfileImage) in API Explorer.


## Get Scaled User Profile Image

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image/{scaleSize}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage(scaleSize).get();
rc.revoke();
```


- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readScaledPofileImage) in API Explorer.


## Make RingOut Call

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut().post(makeRingOutRequest);
rc.revoke();
```

- Parameter `makeRingOutRequest` is of type [MakeRingOutRequest](./src/main/java/com/ringcentral/definitions/MakeRingOutRequest.java)
- `result` is of type [GetRingOutStatusResponse](./src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-createRingOutCall) in API Explorer.


## Get RingOut Call Status

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut(ringoutId).get();
rc.revoke();
```


- `result` is of type [GetRingOutStatusResponse](./src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-readRingOutCallStatus) in API Explorer.


## Cancel RingOut Call

HTTP DELETE `/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut(ringoutId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-deleteRingOutCall) in API Explorer.


## Send SMS

HTTP POST `/restapi/v1.0/account/{accountId}/extension/{extensionId}/sms`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).sms().post(createSmsMessage);
rc.revoke();
```

- Parameter `createSmsMessage` is of type [CreateSMSMessage](./src/main/java/com/ringcentral/definitions/CreateSMSMessage.java)
- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#SMS-createSMSMessage) in API Explorer.


## Get Unified Presence

HTTP GET `/restapi/v1.0/account/{accountId}/extension/{extensionId}/unified-presence`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).unifiedPresence().get();
rc.revoke();
```


- `result` is of type [UnifiedPresence](./src/main/java/com/ringcentral/definitions/UnifiedPresence.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readUnifiedPresence) in API Explorer.


## Update Unified Presence

HTTP PATCH `/restapi/v1.0/account/{accountId}/extension/{extensionId}/unified-presence`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).unifiedPresence().patch(updateUnifiedPresence);
rc.revoke();
```

- Parameter `updateUnifiedPresence` is of type [UpdateUnifiedPresence](./src/main/java/com/ringcentral/definitions/UpdateUnifiedPresence.java)
- `result` is of type [UnifiedPresence](./src/main/java/com/ringcentral/definitions/UnifiedPresence.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateUnifiedPresence) in API Explorer.


## Create Company Greeting

HTTP POST `/restapi/v1.0/account/{accountId}/greeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).greeting().post(createCompanyGreetingRequest);
rc.revoke();
```

- Parameter `createCompanyGreetingRequest` is of type [CreateCompanyGreetingRequest](./src/main/java/com/ringcentral/definitions/CreateCompanyGreetingRequest.java)
- `result` is of type [CustomCompanyGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomCompanyGreetingInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-createCompanyGreeting) in API Explorer.


## Create IVR Menu

HTTP POST `/restapi/v1.0/account/{accountId}/ivr-menus`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrMenus().post(ivrMenuInfo);
rc.revoke();
```

- Parameter `ivrMenuInfo` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-createIVRMenu) in API Explorer.


## Get IVR Menu

HTTP GET `/restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrMenus(ivrMenuId).get();
rc.revoke();
```


- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-readIVRMenu) in API Explorer.


## Update IVR Menu

HTTP PUT `/restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrMenus(ivrMenuId).put(ivrMenuInfo);
rc.revoke();
```

- Parameter `ivrMenuInfo` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-updateIVRMenu) in API Explorer.


## Create IVR Prompts

HTTP POST `/restapi/v1.0/account/{accountId}/ivr-prompts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts().post(createIvrPromptRequest);
rc.revoke();
```

- Parameter `createIvrPromptRequest` is of type [CreateIvrPromptRequest](./src/main/java/com/ringcentral/definitions/CreateIvrPromptRequest.java)
- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-createIVRPrompt) in API Explorer.


## Get IVR Prompt List

HTTP GET `/restapi/v1.0/account/{accountId}/ivr-prompts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts().list();
rc.revoke();
```


- `result` is of type [IVRPrompts](./src/main/java/com/ringcentral/definitions/IVRPrompts.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-listIVRPrompts) in API Explorer.


## Get IVR Prompt

HTTP GET `/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).get();
rc.revoke();
```


- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-readIVRPrompt) in API Explorer.


## Delete IVR Prompt

HTTP DELETE `/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-deleteIVRPrompt) in API Explorer.


## Update IVR Prompt

HTTP PUT `/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).put(updateIvrPromptRequest);
rc.revoke();
```

- Parameter `updateIvrPromptRequest` is of type [UpdateIVRPromptRequest](./src/main/java/com/ringcentral/definitions/UpdateIVRPromptRequest.java)
- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-updateIVRPrompt) in API Explorer.


## Get IVR Prompt Content

HTTP GET `/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}/content`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).content().get();
rc.revoke();
```


- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Routing-readIVRPromptContent) in API Explorer.


## Get Account Meeting Recordings List

HTTP GET `/restapi/v1.0/account/{accountId}/meeting-recordings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).meetingRecordings().get(listAccountMeetingRecordingsParameters);
rc.revoke();
```

- Parameter `listAccountMeetingRecordingsParameters` is of type [ListAccountMeetingRecordingsParameters](./src/main/java/com/ringcentral/definitions/ListAccountMeetingRecordingsParameters.java)
- `result` is of type [ListMeetingRecordingsResponse](./src/main/java/com/ringcentral/definitions/ListMeetingRecordingsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Recordings-listAccountMeetingRecordings) in API Explorer.


## Get Message Store Configuration

HTTP GET `/restapi/v1.0/account/{accountId}/message-store-configuration`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).messageStoreConfiguration().get();
rc.revoke();
```


- `result` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageStoreConfiguration) in API Explorer.


## Update Message Store Configuration

HTTP PUT `/restapi/v1.0/account/{accountId}/message-store-configuration`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).messageStoreConfiguration().put(messageStoreConfiguration);
rc.revoke();
```

- Parameter `messageStoreConfiguration` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)
- `result` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessageStoreConfiguration) in API Explorer.


## Create Message Store Report

HTTP POST `/restapi/v1.0/account/{accountId}/message-store-report`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).messageStoreReport().post(createMessageStoreReportRequest);
rc.revoke();
```

- Parameter `createMessageStoreReportRequest` is of type [CreateMessageStoreReportRequest](./src/main/java/com/ringcentral/definitions/CreateMessageStoreReportRequest.java)
- `result` is of type [MessageStoreReport](./src/main/java/com/ringcentral/definitions/MessageStoreReport.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-createMessageStoreReport) in API Explorer.


## Get Message Store Report Task

HTTP GET `/restapi/v1.0/account/{accountId}/message-store-report/{taskId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).get();
rc.revoke();
```


- `result` is of type [MessageStoreReport](./src/main/java/com/ringcentral/definitions/MessageStoreReport.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportTask) in API Explorer.


## Get Message Store Report Archive

HTTP GET `/restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).archive().list();
rc.revoke();
```


- `result` is of type [MessageStoreReportArchive](./src/main/java/com/ringcentral/definitions/MessageStoreReportArchive.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchive) in API Explorer.


## Get Message Store Report Archive Content

HTTP GET `/restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive/{archiveId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).archive(archiveId).get();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchiveContent) in API Explorer.


## Assign Paging Group Users and Devices

HTTP POST `/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).bulkAssign().post(editPagingGroupRequest);
rc.revoke();
```

- Parameter `editPagingGroupRequest` is of type [EditPagingGroupRequest](./src/main/java/com/ringcentral/definitions/EditPagingGroupRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-assignMultiplePagingGroupUsersDevices) in API Explorer.


## Get Paging Group Devices

HTTP GET `/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/devices`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).devices().get(listPagingGroupDevicesParameters);
rc.revoke();
```

- Parameter `listPagingGroupDevicesParameters` is of type [ListPagingGroupDevicesParameters](./src/main/java/com/ringcentral/definitions/ListPagingGroupDevicesParameters.java)
- `result` is of type [PagingOnlyGroupDevices](./src/main/java/com/ringcentral/definitions/PagingOnlyGroupDevices.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-listPagingGroupDevices) in API Explorer.


## Get Paging Group Users

HTTP GET `/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/users`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).users().get(listPagingGroupUsersParameters);
rc.revoke();
```

- Parameter `listPagingGroupUsersParameters` is of type [ListPagingGroupUsersParameters](./src/main/java/com/ringcentral/definitions/ListPagingGroupUsersParameters.java)
- `result` is of type [PagingOnlyGroupUsers](./src/main/java/com/ringcentral/definitions/PagingOnlyGroupUsers.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-listPagingGroupUsers) in API Explorer.


## Get Company Phone Number List

HTTP GET `/restapi/v1.0/account/{accountId}/phone-number`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).phoneNumber().list(listAccountPhoneNumbersParameters);
rc.revoke();
```

- Parameter `listAccountPhoneNumbersParameters` is of type [ListAccountPhoneNumbersParameters](./src/main/java/com/ringcentral/definitions/ListAccountPhoneNumbersParameters.java)
- `result` is of type [AccountPhoneNumbers](./src/main/java/com/ringcentral/definitions/AccountPhoneNumbers.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-listAccountPhoneNumbers) in API Explorer.


## Get Phone Number

HTTP GET `/restapi/v1.0/account/{accountId}/phone-number/{phoneNumberId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).phoneNumber(phoneNumberId).get();
rc.revoke();
```


- `result` is of type [CompanyPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/CompanyPhoneNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-readAccountPhoneNumber) in API Explorer.


## Get User Presence Status List

HTTP GET `/restapi/v1.0/account/{accountId}/presence`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).presence().get(readAccountPresenceParameters);
rc.revoke();
```

- Parameter `readAccountPresenceParameters` is of type [ReadAccountPresenceParameters](./src/main/java/com/ringcentral/definitions/ReadAccountPresenceParameters.java)
- `result` is of type [AccountPresenceInfo](./src/main/java/com/ringcentral/definitions/AccountPresenceInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readAccountPresence) in API Explorer.


## Get Call Recording

HTTP GET `/restapi/v1.0/account/{accountId}/recording/{recordingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).recording(recordingId).get();
rc.revoke();
```


- `result` is of type [GetCallRecordingResponse](./src/main/java/com/ringcentral/definitions/GetCallRecordingResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recordings-readCallRecording) in API Explorer.


## Get Call Recordings Data

HTTP GET `/restapi/v1.0/account/{accountId}/recording/{recordingId}/content`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).recording(recordingId).content().get();
rc.revoke();
```


- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recordings-listCallRecordingData) in API Explorer.


## Get Account Service Info

HTTP GET `/restapi/v1.0/account/{accountId}/service-info`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).serviceInfo().get();
rc.revoke();
```


- `result` is of type [GetServiceInfoResponse](./src/main/java/com/ringcentral/definitions/GetServiceInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountServiceInfo) in API Explorer.


## Make CallOut

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/call-out`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().callOut().post(makeCallOutRequest);
rc.revoke();
```

- Parameter `makeCallOutRequest` is of type [MakeCallOutRequest](./src/main/java/com/ringcentral/definitions/MakeCallOutRequest.java)
- `result` is of type [CallSession](./src/main/java/com/ringcentral/definitions/CallSession.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-createCallOutCallSession) in API Explorer.


## Get Call Session Status

HTTP GET `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).get(readCallSessionStatusParameters);
rc.revoke();
```

- Parameter `readCallSessionStatusParameters` is of type [ReadCallSessionStatusParameters](./src/main/java/com/ringcentral/definitions/ReadCallSessionStatusParameters.java)
- `result` is of type [CallSession](./src/main/java/com/ringcentral/definitions/CallSession.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-readCallSessionStatus) in API Explorer.


## Drop Call Session

HTTP DELETE `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-deleteCallSession) in API Explorer.


## Get Call Party Status

HTTP GET `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).get();
rc.revoke();
```


- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-readCallPartyStatus) in API Explorer.


## Update Call Party

HTTP PATCH `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).patch(partyUpdateRequest);
rc.revoke();
```

- Parameter `partyUpdateRequest` is of type [PartyUpdateRequest](./src/main/java/com/ringcentral/definitions/PartyUpdateRequest.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-updateCallParty) in API Explorer.


## Answer Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/answer`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).answer().post(answerTarget);
rc.revoke();
```

- Parameter `answerTarget` is of type [AnswerTarget](./src/main/java/com/ringcentral/definitions/AnswerTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-answerCallParty) in API Explorer.


## Call Flip on Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/flip`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).flip().post(callPartyFlip);
rc.revoke();
```

- Parameter `callPartyFlip` is of type [CallPartyFlip](./src/main/java/com/ringcentral/definitions/CallPartyFlip.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-callFlipParty) in API Explorer.


## Forward Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/forward`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).forward().post(forwardTarget);
rc.revoke();
```

- Parameter `forwardTarget` is of type [ForwardTarget](./src/main/java/com/ringcentral/definitions/ForwardTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-forwardCallParty) in API Explorer.


## Hold Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/hold`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).hold().post();
rc.revoke();
```


- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-holdCallParty) in API Explorer.


## Ignore Call in Queue

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/ignore`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).ignore().post(ignoreRequestBody);
rc.revoke();
```

- Parameter `ignoreRequestBody` is of type [IgnoreRequestBody](./src/main/java/com/ringcentral/definitions/IgnoreRequestBody.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-ignoreCallInQueue) in API Explorer.


## Call Park

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/park`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).park().post();
rc.revoke();
```


- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-callParkParty) in API Explorer.


## Pickup Call

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/pickup`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).pickup().post(pickupTarget);
rc.revoke();
```

- Parameter `pickupTarget` is of type [PickupTarget](./src/main/java/com/ringcentral/definitions/PickupTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-pickupCallParty) in API Explorer.


## Create Recording

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).recordings().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-startCallRecording) in API Explorer.


## Pause/Resume Recording

HTTP PATCH `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings/{recordingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).recordings(recordingId).patch(callRecordingUpdate, pauseResumeCallRecordingParameters);
rc.revoke();
```

- Parameter `callRecordingUpdate` is of type [CallRecordingUpdate](./src/main/java/com/ringcentral/definitions/CallRecordingUpdate.java)
- Parameter `pauseResumeCallRecordingParameters` is of type [PauseResumeCallRecordingParameters](./src/main/java/com/ringcentral/definitions/PauseResumeCallRecordingParameters.java)
- `result` is of type [CallRecording](./src/main/java/com/ringcentral/definitions/CallRecording.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-pauseResumeCallRecording) in API Explorer.


## Reject Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reject`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).reject().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-rejectParty) in API Explorer.


## Reply with Text

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reply`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).reply().post(callPartyReply);
rc.revoke();
```

- Parameter `callPartyReply` is of type [CallPartyReply](./src/main/java/com/ringcentral/definitions/CallPartyReply.java)
- `result` is of type [ReplyParty](./src/main/java/com/ringcentral/definitions/ReplyParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-replyParty) in API Explorer.


## Supervise Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/supervise`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).supervise().post(partySuperviseRequest);
rc.revoke();
```

- Parameter `partySuperviseRequest` is of type [PartySuperviseRequest](./src/main/java/com/ringcentral/definitions/PartySuperviseRequest.java)
- `result` is of type [PartySuperviseResponse](./src/main/java/com/ringcentral/definitions/PartySuperviseResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-superviseCallParty) in API Explorer.


## Transfer Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/transfer`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).transfer().post(transferTarget);
rc.revoke();
```

- Parameter `transferTarget` is of type [TransferTarget](./src/main/java/com/ringcentral/definitions/TransferTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-transferCallParty) in API Explorer.


## Unhold Call Party

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/unhold`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).unhold().post();
rc.revoke();
```


- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-unholdCallParty) in API Explorer.


## Supervise Call Session

HTTP POST `/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/supervise`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).supervise().post(superviseCallSessionRequest);
rc.revoke();
```

- Parameter `superviseCallSessionRequest` is of type [SuperviseCallSessionRequest](./src/main/java/com/ringcentral/definitions/SuperviseCallSessionRequest.java)
- `result` is of type [SuperviseCallSession](./src/main/java/com/ringcentral/definitions/SuperviseCallSession.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-superviseCallSession) in API Explorer.


## Get User Template List

HTTP GET `/restapi/v1.0/account/{accountId}/templates`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).templates().list(listUserTemplatesParameters);
rc.revoke();
```

- Parameter `listUserTemplatesParameters` is of type [ListUserTemplatesParameters](./src/main/java/com/ringcentral/definitions/ListUserTemplatesParameters.java)
- `result` is of type [UserTemplates](./src/main/java/com/ringcentral/definitions/UserTemplates.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-listUserTemplates) in API Explorer.


## Get User Template

HTTP GET `/restapi/v1.0/account/{accountId}/templates/{templateId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).account(accountId).templates(templateId).get();
rc.revoke();
```


- `result` is of type [TemplateInfo](./src/main/java/com/ringcentral/definitions/TemplateInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-readUserTemplate) in API Explorer.


## Register SIP Device

HTTP POST `/restapi/v1.0/client-info/sip-provision`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).clientInfo().sipProvision().post(createSipRegistrationRequest);
rc.revoke();
```

- Parameter `createSipRegistrationRequest` is of type [CreateSipRegistrationRequest](./src/main/java/com/ringcentral/definitions/CreateSipRegistrationRequest.java)
- `result` is of type [CreateSipRegistrationResponse](./src/main/java/com/ringcentral/definitions/CreateSipRegistrationResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#SIP-createSIPRegistration) in API Explorer.


## Get Country List

HTTP GET `/restapi/v1.0/dictionary/country`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().country().list(listCountriesParameters);
rc.revoke();
```

- Parameter `listCountriesParameters` is of type [ListCountriesParameters](./src/main/java/com/ringcentral/definitions/ListCountriesParameters.java)
- `result` is of type [GetCountryListResponse](./src/main/java/com/ringcentral/definitions/GetCountryListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listCountries) in API Explorer.


## Get Country

HTTP GET `/restapi/v1.0/dictionary/country/{countryId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().country(countryId).get();
rc.revoke();
```


- `result` is of type [GetCountryInfoDictionaryResponse](./src/main/java/com/ringcentral/definitions/GetCountryInfoDictionaryResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readCountry) in API Explorer.


## Get Fax Cover Page List

HTTP GET `/restapi/v1.0/dictionary/fax-cover-page`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().faxCoverPage().get(listFaxCoverPagesParameters);
rc.revoke();
```

- Parameter `listFaxCoverPagesParameters` is of type [ListFaxCoverPagesParameters](./src/main/java/com/ringcentral/definitions/ListFaxCoverPagesParameters.java)
- `result` is of type [ListFaxCoverPagesResponse](./src/main/java/com/ringcentral/definitions/ListFaxCoverPagesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Fax-listFaxCoverPages) in API Explorer.


## Get Standard Greeting List

HTTP GET `/restapi/v1.0/dictionary/greeting`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().greeting().list(listStandardGreetingsParameters);
rc.revoke();
```

- Parameter `listStandardGreetingsParameters` is of type [ListStandardGreetingsParameters](./src/main/java/com/ringcentral/definitions/ListStandardGreetingsParameters.java)
- `result` is of type [DictionaryGreetingList](./src/main/java/com/ringcentral/definitions/DictionaryGreetingList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-listStandardGreetings) in API Explorer.


## Get Standard Greeting

HTTP GET `/restapi/v1.0/dictionary/greeting/{greetingId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().greeting(greetingId).get();
rc.revoke();
```


- `result` is of type [DictionaryGreetingInfo](./src/main/java/com/ringcentral/definitions/DictionaryGreetingInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Rule-Management-readStandardGreeting) in API Explorer.


## Get Language List

HTTP GET `/restapi/v1.0/dictionary/language`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().language().list();
rc.revoke();
```


- `result` is of type [LanguageList](./src/main/java/com/ringcentral/definitions/LanguageList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLanguages) in API Explorer.


## Get Language

HTTP GET `/restapi/v1.0/dictionary/language/{languageId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().language(languageId).get();
rc.revoke();
```


- `result` is of type [LanguageInfo](./src/main/java/com/ringcentral/definitions/LanguageInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readLanguage) in API Explorer.


## Get Location List

HTTP GET `/restapi/v1.0/dictionary/location`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().location().get(listLocationsParameters);
rc.revoke();
```

- Parameter `listLocationsParameters` is of type [ListLocationsParameters](./src/main/java/com/ringcentral/definitions/ListLocationsParameters.java)
- `result` is of type [GetLocationListResponse](./src/main/java/com/ringcentral/definitions/GetLocationListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLocations) in API Explorer.


## Get States List

HTTP GET `/restapi/v1.0/dictionary/state`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().state().list(listStatesParameters);
rc.revoke();
```

- Parameter `listStatesParameters` is of type [ListStatesParameters](./src/main/java/com/ringcentral/definitions/ListStatesParameters.java)
- `result` is of type [GetStateListResponse](./src/main/java/com/ringcentral/definitions/GetStateListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listStates) in API Explorer.


## Get State

HTTP GET `/restapi/v1.0/dictionary/state/{stateId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().state(stateId).get();
rc.revoke();
```


- `result` is of type [GetStateInfoResponse](./src/main/java/com/ringcentral/definitions/GetStateInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readState) in API Explorer.


## Get Timezone List

HTTP GET `/restapi/v1.0/dictionary/timezone`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().timezone().list(listTimezonesParameters);
rc.revoke();
```

- Parameter `listTimezonesParameters` is of type [ListTimezonesParameters](./src/main/java/com/ringcentral/definitions/ListTimezonesParameters.java)
- `result` is of type [GetTimezoneListResponse](./src/main/java/com/ringcentral/definitions/GetTimezoneListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listTimezones) in API Explorer.


## Get Timezone

HTTP GET `/restapi/v1.0/dictionary/timezone/{timezoneId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).dictionary().timezone(timezoneId).get(readTimezoneParameters);
rc.revoke();
```

- Parameter `readTimezoneParameters` is of type [ReadTimezoneParameters](./src/main/java/com/ringcentral/definitions/ReadTimezoneParameters.java)
- `result` is of type [GetTimezoneInfoResponse](./src/main/java/com/ringcentral/definitions/GetTimezoneInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readTimezone) in API Explorer.


## Create Card

HTTP POST `/restapi/v1.0/glip/cards`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().cards().post(glipMessageAttachmentInfoRequest, createGlipCardParameters);
rc.revoke();
```

- Parameter `glipMessageAttachmentInfoRequest` is of type [GlipMessageAttachmentInfoRequest](./src/main/java/com/ringcentral/definitions/GlipMessageAttachmentInfoRequest.java)
- Parameter `createGlipCardParameters` is of type [CreateGlipCardParameters](./src/main/java/com/ringcentral/definitions/CreateGlipCardParameters.java)
- `result` is of type [GlipMessageAttachmentInfo](./src/main/java/com/ringcentral/definitions/GlipMessageAttachmentInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipCard) in API Explorer.


## Get Card

HTTP GET `/restapi/v1.0/glip/cards/{cardId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().cards(cardId).get();
rc.revoke();
```


- `result` is of type [GlipMessageAttachmentInfo](./src/main/java/com/ringcentral/definitions/GlipMessageAttachmentInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipCard) in API Explorer.


## Update Card

HTTP PUT `/restapi/v1.0/glip/cards/{cardId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().cards(cardId).put(glipMessageAttachmentInfoRequest);
rc.revoke();
```

- Parameter `glipMessageAttachmentInfoRequest` is of type [GlipMessageAttachmentInfoRequest](./src/main/java/com/ringcentral/definitions/GlipMessageAttachmentInfoRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-updateGlipCard) in API Explorer.


## Delete Card

HTTP DELETE `/restapi/v1.0/glip/cards/{cardId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().cards(cardId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-deleteGlipCard) in API Explorer.


## Get Chats

HTTP GET `/restapi/v1.0/glip/chats`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats().list(listGlipChatsParameters);
rc.revoke();
```

- Parameter `listGlipChatsParameters` is of type [ListGlipChatsParameters](./src/main/java/com/ringcentral/definitions/ListGlipChatsParameters.java)
- `result` is of type [GlipChatsList](./src/main/java/com/ringcentral/definitions/GlipChatsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipChats) in API Explorer.


## Get Chat

HTTP GET `/restapi/v1.0/glip/chats/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).get();
rc.revoke();
```


- `result` is of type [GlipChatInfo](./src/main/java/com/ringcentral/definitions/GlipChatInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipChat) in API Explorer.


## Add Chat to Favorites

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/favorite`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).favorite().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-favoriteGlipChat) in API Explorer.


## Create Note

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/notes`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).notes().post(glipNoteCreate);
rc.revoke();
```

- Parameter `glipNoteCreate` is of type [GlipNoteCreate](./src/main/java/com/ringcentral/definitions/GlipNoteCreate.java)
- `result` is of type [GlipNoteInfo](./src/main/java/com/ringcentral/definitions/GlipNoteInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-createChatNote) in API Explorer.


## Get Chat Notes

HTTP GET `/restapi/v1.0/glip/chats/{chatId}/notes`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).notes().get(listChatNotesParameters);
rc.revoke();
```

- Parameter `listChatNotesParameters` is of type [ListChatNotesParameters](./src/main/java/com/ringcentral/definitions/ListChatNotesParameters.java)
- `result` is of type [GlipNotesInfo](./src/main/java/com/ringcentral/definitions/GlipNotesInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-listChatNotes) in API Explorer.


## Get Posts

HTTP GET `/restapi/v1.0/glip/chats/{chatId}/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).posts().list(readGlipPostsParameters);
rc.revoke();
```

- Parameter `readGlipPostsParameters` is of type [ReadGlipPostsParameters](./src/main/java/com/ringcentral/definitions/ReadGlipPostsParameters.java)
- `result` is of type [GlipPostsList](./src/main/java/com/ringcentral/definitions/GlipPostsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPosts) in API Explorer.


## Create Post

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).posts().post(glipPostPostBody);
rc.revoke();
```

- Parameter `glipPostPostBody` is of type [GlipPostPostBody](./src/main/java/com/ringcentral/definitions/GlipPostPostBody.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipPost) in API Explorer.


## Get Post

HTTP GET `/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).get();
rc.revoke();
```


- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPost) in API Explorer.


## Update Post

HTTP PATCH `/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).patch(glipPatchPostBody);
rc.revoke();
```

- Parameter `glipPatchPostBody` is of type [GlipPatchPostBody](./src/main/java/com/ringcentral/definitions/GlipPatchPostBody.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-patchGlipPost) in API Explorer.


## Delete Post

HTTP DELETE `/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-deleteGlipPost) in API Explorer.


## Mark Chat as Read

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/read`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).read().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatRead) in API Explorer.


## Get Chat Tasks

HTTP GET `/restapi/v1.0/glip/chats/{chatId}/tasks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).tasks().get(listChatTasksParameters);
rc.revoke();
```

- Parameter `listChatTasksParameters` is of type [ListChatTasksParameters](./src/main/java/com/ringcentral/definitions/ListChatTasksParameters.java)
- `result` is of type [GlipTaskList](./src/main/java/com/ringcentral/definitions/GlipTaskList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-listChatTasks) in API Explorer.


## Create Task

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/tasks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).tasks().post(glipCreateTask);
rc.revoke();
```

- Parameter `glipCreateTask` is of type [GlipCreateTask](./src/main/java/com/ringcentral/definitions/GlipCreateTask.java)
- `result` is of type [GlipTaskInfo](./src/main/java/com/ringcentral/definitions/GlipTaskInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-createTask) in API Explorer.


## Remove Chat from Favorites

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/unfavorite`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).unfavorite().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-unfavoriteGlipChat) in API Explorer.


## Mark Chat as Unread

HTTP POST `/restapi/v1.0/glip/chats/{chatId}/unread`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().chats(chatId).unread().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatUnread) in API Explorer.


## Get Company Info

HTTP GET `/restapi/v1.0/glip/companies/{companyId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().companies(companyId).get();
rc.revoke();
```


- `result` is of type [GlipCompany](./src/main/java/com/ringcentral/definitions/GlipCompany.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipCompany) in API Explorer.


## Get Conversations

HTTP GET `/restapi/v1.0/glip/conversations`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().conversations().list(listGlipConversationsParameters);
rc.revoke();
```

- Parameter `listGlipConversationsParameters` is of type [ListGlipConversationsParameters](./src/main/java/com/ringcentral/definitions/ListGlipConversationsParameters.java)
- `result` is of type [GlipConversationsList](./src/main/java/com/ringcentral/definitions/GlipConversationsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-listGlipConversations) in API Explorer.


## Create/Open Conversation

HTTP POST `/restapi/v1.0/glip/conversations`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().conversations().post(createGlipConversationRequest);
rc.revoke();
```

- Parameter `createGlipConversationRequest` is of type [CreateGlipConversationRequest](./src/main/java/com/ringcentral/definitions/CreateGlipConversationRequest.java)
- `result` is of type [GlipConversationInfo](./src/main/java/com/ringcentral/definitions/GlipConversationInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-createGlipConversation) in API Explorer.


## Get Conversation

HTTP GET `/restapi/v1.0/glip/conversations/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().conversations(chatId).get();
rc.revoke();
```


- `result` is of type [GlipConversationInfo](./src/main/java/com/ringcentral/definitions/GlipConversationInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-readGlipConversation) in API Explorer.


## Create Data Export Task

HTTP POST `/restapi/v1.0/glip/data-export`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().dataExport().post(createDataExportTaskRequest);
rc.revoke();
```

- Parameter `createDataExportTaskRequest` is of type [CreateDataExportTaskRequest](./src/main/java/com/ringcentral/definitions/CreateDataExportTaskRequest.java)
- `result` is of type [DataExportTask](./src/main/java/com/ringcentral/definitions/DataExportTask.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-createDataExportTask) in API Explorer.


## Get Data Export Task List

HTTP GET `/restapi/v1.0/glip/data-export`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().dataExport().list(listDataExportTasksParameters);
rc.revoke();
```

- Parameter `listDataExportTasksParameters` is of type [ListDataExportTasksParameters](./src/main/java/com/ringcentral/definitions/ListDataExportTasksParameters.java)
- `result` is of type [DataExportTaskList](./src/main/java/com/ringcentral/definitions/DataExportTaskList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-listDataExportTasks) in API Explorer.


## Get Data Export Task

HTTP GET `/restapi/v1.0/glip/data-export/{taskId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().dataExport(taskId).get();
rc.revoke();
```


- `result` is of type [DataExportTask](./src/main/java/com/ringcentral/definitions/DataExportTask.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-readDataExportTask) in API Explorer.


## Get Data Export Task Dataset

HTTP GET `/restapi/v1.0/glip/data-export/{taskId}/datasets/{datasetId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().dataExport(taskId).datasets(datasetId).get();
rc.revoke();
```


- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-readDataExportTaskDataset) in API Explorer.


## Get User Events List

HTTP GET `/restapi/v1.0/glip/events`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().events().list(readGlipEventsParameters);
rc.revoke();
```

- Parameter `readGlipEventsParameters` is of type [ReadGlipEventsParameters](./src/main/java/com/ringcentral/definitions/ReadGlipEventsParameters.java)
- `result` is of type [GlipEventsInfo](./src/main/java/com/ringcentral/definitions/GlipEventsInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-readGlipEvents) in API Explorer.


## Create Event

HTTP POST `/restapi/v1.0/glip/events`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().events().post(glipEventCreate);
rc.revoke();
```

- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-createEvent) in API Explorer.


## Get Event

HTTP GET `/restapi/v1.0/glip/events/{eventId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().events(eventId).get();
rc.revoke();
```


- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-readEvent) in API Explorer.


## Update Event

HTTP PUT `/restapi/v1.0/glip/events/{eventId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().events(eventId).put(glipEventCreate);
rc.revoke();
```

- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-updateEvent) in API Explorer.


## Delete Event

HTTP DELETE `/restapi/v1.0/glip/events/{eventId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().events(eventId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-deleteEvent) in API Explorer.


## Get Everyone Chat

HTTP GET `/restapi/v1.0/glip/everyone`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().everyone().get();
rc.revoke();
```


- `result` is of type [GlipEveryoneInfo](./src/main/java/com/ringcentral/definitions/GlipEveryoneInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-readGlipEveryone) in API Explorer.


## Update Everyone Сhat

HTTP PATCH `/restapi/v1.0/glip/everyone`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().everyone().patch(updateGlipEveryoneRequest);
rc.revoke();
```

- Parameter `updateGlipEveryoneRequest` is of type [UpdateGlipEveryoneRequest](./src/main/java/com/ringcentral/definitions/UpdateGlipEveryoneRequest.java)
- `result` is of type [GlipEveryoneInfo](./src/main/java/com/ringcentral/definitions/GlipEveryoneInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-patchGlipEveryone) in API Explorer.


## Get Favorite Chats

HTTP GET `/restapi/v1.0/glip/favorites`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().favorites().get(listFavoriteChatsParameters);
rc.revoke();
```

- Parameter `listFavoriteChatsParameters` is of type [ListFavoriteChatsParameters](./src/main/java/com/ringcentral/definitions/ListFavoriteChatsParameters.java)
- `result` is of type [GlipChatsListWithoutNavigation](./src/main/java/com/ringcentral/definitions/GlipChatsListWithoutNavigation.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listFavoriteChats) in API Explorer.


## Get User Groups

HTTP GET `/restapi/v1.0/glip/groups`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups().list(listGlipGroupsParameters);
rc.revoke();
```

- Parameter `listGlipGroupsParameters` is of type [ListGlipGroupsParameters](./src/main/java/com/ringcentral/definitions/ListGlipGroupsParameters.java)
- `result` is of type [GlipGroupList](./src/main/java/com/ringcentral/definitions/GlipGroupList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipGroups) in API Explorer.


## Create Group

HTTP POST `/restapi/v1.0/glip/groups`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups().post(glipCreateGroup);
rc.revoke();
```

- Parameter `glipCreateGroup` is of type [GlipCreateGroup](./src/main/java/com/ringcentral/definitions/GlipCreateGroup.java)
- `result` is of type [GlipGroupInfo](./src/main/java/com/ringcentral/definitions/GlipGroupInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-createGlipGroup) in API Explorer.


## Get Group

HTTP GET `/restapi/v1.0/glip/groups/{groupId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).get();
rc.revoke();
```


- `result` is of type [GlipGroupInfo](./src/main/java/com/ringcentral/definitions/GlipGroupInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipGroup) in API Explorer.


## Edit Group Members

HTTP POST `/restapi/v1.0/glip/groups/{groupId}/bulk-assign`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).bulkAssign().post(editGroupRequest);
rc.revoke();
```

- Parameter `editGroupRequest` is of type [EditGroupRequest](./src/main/java/com/ringcentral/definitions/EditGroupRequest.java)
- `result` is of type [GlipGroupInfo](./src/main/java/com/ringcentral/definitions/GlipGroupInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-assignGlipGroupMembers) in API Explorer.


## Create Event by Group ID

HTTP POST `/restapi/v1.0/glip/groups/{groupId}/events`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).events().post(glipEventCreate);
rc.revoke();
```

- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-createEventbyGroupId) in API Explorer.


## Get Group Events

HTTP GET `/restapi/v1.0/glip/groups/{groupId}/events`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).events().get();
rc.revoke();
```


- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-listGroupEvents) in API Explorer.


## Get Group Posts

HTTP GET `/restapi/v1.0/glip/groups/{groupId}/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).posts().get(listGlipGroupPostsParameters);
rc.revoke();
```

- Parameter `listGlipGroupPostsParameters` is of type [ListGlipGroupPostsParameters](./src/main/java/com/ringcentral/definitions/ListGlipGroupPostsParameters.java)
- `result` is of type [GlipPosts](./src/main/java/com/ringcentral/definitions/GlipPosts.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-listGlipGroupPosts) in API Explorer.


## Create Post in Group

HTTP POST `/restapi/v1.0/glip/groups/{groupId}/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).posts().post(glipCreatePost);
rc.revoke();
```

- Parameter `glipCreatePost` is of type [GlipCreatePost](./src/main/java/com/ringcentral/definitions/GlipCreatePost.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipGroupPost) in API Explorer.


## Update Post

HTTP PUT `/restapi/v1.0/glip/groups/{groupId}/posts/{postId}/text`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).posts(postId).text().put(string);
rc.revoke();
```

- Parameter `string` is of type [string](./src/main/java/com/ringcentral/definitions/string.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-updateGlipPostText) in API Explorer.


## Create Webhook in Group

HTTP POST `/restapi/v1.0/glip/groups/{groupId}/webhooks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).webhooks().post();
rc.revoke();
```


- `result` is of type [GlipWebhookInfo](./src/main/java/com/ringcentral/definitions/GlipWebhookInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-createGlipGroupWebhook) in API Explorer.


## Get Webhooks in Group

HTTP GET `/restapi/v1.0/glip/groups/{groupId}/webhooks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().groups(groupId).webhooks().get();
rc.revoke();
```


- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-listGlipGroupWebhooks) in API Explorer.


## Get Note

HTTP GET `/restapi/v1.0/glip/notes/{noteId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().notes(noteId).get();
rc.revoke();
```


- `result` is of type [GetGlipNoteInfo](./src/main/java/com/ringcentral/definitions/GetGlipNoteInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-readUserNote) in API Explorer.


## Update Note

HTTP PATCH `/restapi/v1.0/glip/notes/{noteId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().notes(noteId).patch(glipNoteCreate);
rc.revoke();
```

- Parameter `glipNoteCreate` is of type [GlipNoteCreate](./src/main/java/com/ringcentral/definitions/GlipNoteCreate.java)
- `result` is of type [GlipNoteInfo](./src/main/java/com/ringcentral/definitions/GlipNoteInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-patchNote) in API Explorer.


## Delete Note

HTTP DELETE `/restapi/v1.0/glip/notes/{noteId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().notes(noteId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-deleteNote) in API Explorer.


## Lock Note

HTTP POST `/restapi/v1.0/glip/notes/{noteId}/lock`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().notes(noteId).lock().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-lockNote) in API Explorer.


## Publish Note

HTTP POST `/restapi/v1.0/glip/notes/{noteId}/publish`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().notes(noteId).publish().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-publishNote) in API Explorer.


## Unlock Note

HTTP POST `/restapi/v1.0/glip/notes/{noteId}/unlock`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().notes(noteId).unlock().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-unlockNote) in API Explorer.


## Get Person

HTTP GET `/restapi/v1.0/glip/persons/{personId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().persons(personId).get();
rc.revoke();
```


- `result` is of type [GlipPersonInfo](./src/main/java/com/ringcentral/definitions/GlipPersonInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipPerson) in API Explorer.


## Get Posts

HTTP GET `/restapi/v1.0/glip/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().posts().get(listGlipPostsParameters);
rc.revoke();
```

- Parameter `listGlipPostsParameters` is of type [ListGlipPostsParameters](./src/main/java/com/ringcentral/definitions/ListGlipPostsParameters.java)
- `result` is of type [GlipPosts](./src/main/java/com/ringcentral/definitions/GlipPosts.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-listGlipPosts) in API Explorer.


## Create Post

HTTP POST `/restapi/v1.0/glip/posts`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().posts().post(glipCreatePost);
rc.revoke();
```

- Parameter `glipCreatePost` is of type [GlipCreatePost](./src/main/java/com/ringcentral/definitions/GlipCreatePost.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createPost) in API Explorer.


## Get Preferences

HTTP GET `/restapi/v1.0/glip/preferences`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().preferences().get();
rc.revoke();
```


- `result` is of type [GlipPreferencesInfo](./src/main/java/com/ringcentral/definitions/GlipPreferencesInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipPreferences) in API Explorer.


## Get Recent Chats

HTTP GET `/restapi/v1.0/glip/recent/chats`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().recent().chats().get(listRecentChatsParameters);
rc.revoke();
```

- Parameter `listRecentChatsParameters` is of type [ListRecentChatsParameters](./src/main/java/com/ringcentral/definitions/ListRecentChatsParameters.java)
- `result` is of type [GlipChatsListWithoutNavigation](./src/main/java/com/ringcentral/definitions/GlipChatsListWithoutNavigation.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listRecentChats) in API Explorer.


## Get Task

HTTP GET `/restapi/v1.0/glip/tasks/{taskId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().tasks(taskId).get();
rc.revoke();
```


- `result` is of type [GlipTaskInfo](./src/main/java/com/ringcentral/definitions/GlipTaskInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-readTask) in API Explorer.


## Patch Task

HTTP PATCH `/restapi/v1.0/glip/tasks/{taskId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().tasks(taskId).patch(glipUpdateTask);
rc.revoke();
```

- Parameter `glipUpdateTask` is of type [GlipUpdateTask](./src/main/java/com/ringcentral/definitions/GlipUpdateTask.java)
- `result` is of type [GlipTaskList](./src/main/java/com/ringcentral/definitions/GlipTaskList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-patchTask) in API Explorer.


## Delete Task

HTTP DELETE `/restapi/v1.0/glip/tasks/{taskId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().tasks(taskId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-deleteTask) in API Explorer.


## Complete Task

HTTP POST `/restapi/v1.0/glip/tasks/{taskId}/complete`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().tasks(taskId).complete().post(glipCompleteTask);
rc.revoke();
```

- Parameter `glipCompleteTask` is of type [GlipCompleteTask](./src/main/java/com/ringcentral/definitions/GlipCompleteTask.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-completeTask) in API Explorer.


## Get Teams

HTTP GET `/restapi/v1.0/glip/teams`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams().list(listGlipTeamsParameters);
rc.revoke();
```

- Parameter `listGlipTeamsParameters` is of type [ListGlipTeamsParameters](./src/main/java/com/ringcentral/definitions/ListGlipTeamsParameters.java)
- `result` is of type [GlipTeamsList](./src/main/java/com/ringcentral/definitions/GlipTeamsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-listGlipTeams) in API Explorer.


## Create Team

HTTP POST `/restapi/v1.0/glip/teams`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams().post(glipPostTeamBody);
rc.revoke();
```

- Parameter `glipPostTeamBody` is of type [GlipPostTeamBody](./src/main/java/com/ringcentral/definitions/GlipPostTeamBody.java)
- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-createGlipTeam) in API Explorer.


## Get Team

HTTP GET `/restapi/v1.0/glip/teams/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).get();
rc.revoke();
```


- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-readGlipTeam) in API Explorer.


## Update Team

HTTP PATCH `/restapi/v1.0/glip/teams/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).patch(glipPatchTeamBody);
rc.revoke();
```

- Parameter `glipPatchTeamBody` is of type [GlipPatchTeamBody](./src/main/java/com/ringcentral/definitions/GlipPatchTeamBody.java)
- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-patchGlipTeam) in API Explorer.


## Delete Team

HTTP DELETE `/restapi/v1.0/glip/teams/{chatId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-deleteGlipTeam) in API Explorer.


## Add Team Members

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/add`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).add().post(glipPostMembersListBody);
rc.revoke();
```

- Parameter `glipPostMembersListBody` is of type [GlipPostMembersListBody](./src/main/java/com/ringcentral/definitions/GlipPostMembersListBody.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-addGlipTeamMembers) in API Explorer.


## Archive Team

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/archive`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).archive().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-archiveGlipTeam) in API Explorer.


## Join Team

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/join`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).join().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-joinGlipTeam) in API Explorer.


## Leave Team

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/leave`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).leave().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-leaveGlipTeam) in API Explorer.


## Remove Team Members

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/remove`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).remove().post(glipPostMembersIdsListBody);
rc.revoke();
```

- Parameter `glipPostMembersIdsListBody` is of type [GlipPostMembersIdsListBody](./src/main/java/com/ringcentral/definitions/GlipPostMembersIdsListBody.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-removeGlipTeamMembers) in API Explorer.


## Unarchive Team

HTTP POST `/restapi/v1.0/glip/teams/{chatId}/unarchive`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().teams(chatId).unarchive().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-unarchiveGlipTeam) in API Explorer.


## Get Webhooks

HTTP GET `/restapi/v1.0/glip/webhooks`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().webhooks().list();
rc.revoke();
```


- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-listGlipWebhooks) in API Explorer.


## Get Webhook

HTTP GET `/restapi/v1.0/glip/webhooks/{webhookId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().webhooks(webhookId).get();
rc.revoke();
```


- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-readGlipWebhook) in API Explorer.


## Delete Webhook

HTTP DELETE `/restapi/v1.0/glip/webhooks/{webhookId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().webhooks(webhookId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-deleteGlipWebhook) in API Explorer.


## Activate Webhook

HTTP POST `/restapi/v1.0/glip/webhooks/{webhookId}/activate`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().webhooks(webhookId).activate().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-activateGlipWebhook) in API Explorer.


## Suspend Webhook

HTTP POST `/restapi/v1.0/glip/webhooks/{webhookId}/suspend`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).glip().webhooks(webhookId).suspend().post();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-suspendGlipWebhook) in API Explorer.


## Parse Phone Number

HTTP POST `/restapi/v1.0/number-parser/parse`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).numberParser().parse().post(parsePhoneNumberRequest, parsePhoneNumberParameters);
rc.revoke();
```

- Parameter `parsePhoneNumberRequest` is of type [ParsePhoneNumberRequest](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberRequest.java)
- Parameter `parsePhoneNumberParameters` is of type [ParsePhoneNumberParameters](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberParameters.java)
- `result` is of type [ParsePhoneNumberResponse](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-parsePhoneNumber) in API Explorer.


## Get Service Status

HTTP GET `/restapi/v1.0/status`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).status().get();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIStatus) in API Explorer.


## Get Subscriptions

HTTP GET `/restapi/v1.0/subscription`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).subscription().list();
rc.revoke();
```


- `result` is of type [RecordsCollectionResourceSubscriptionResponse](./src/main/java/com/ringcentral/definitions/RecordsCollectionResourceSubscriptionResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-listSubscriptions) in API Explorer.


## Create Subscription

HTTP POST `/restapi/v1.0/subscription`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).subscription().post(createSubscriptionRequest);
rc.revoke();
```

- Parameter `createSubscriptionRequest` is of type [CreateSubscriptionRequest](./src/main/java/com/ringcentral/definitions/CreateSubscriptionRequest.java)
- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-createSubscription) in API Explorer.


## Get Subscription

HTTP GET `/restapi/v1.0/subscription/{subscriptionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).subscription(subscriptionId).get();
rc.revoke();
```


- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-readSubscription) in API Explorer.


## Renew Subscription / Update Event Filters

HTTP PUT `/restapi/v1.0/subscription/{subscriptionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).subscription(subscriptionId).put(modifySubscriptionRequest, updateSubscriptionParameters);
rc.revoke();
```

- Parameter `modifySubscriptionRequest` is of type [ModifySubscriptionRequest](./src/main/java/com/ringcentral/definitions/ModifySubscriptionRequest.java)
- Parameter `updateSubscriptionParameters` is of type [UpdateSubscriptionParameters](./src/main/java/com/ringcentral/definitions/UpdateSubscriptionParameters.java)
- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-updateSubscription) in API Explorer.


## Cancel Subscription

HTTP DELETE `/restapi/v1.0/subscription/{subscriptionId}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).subscription(subscriptionId).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-deleteSubscription) in API Explorer.


## Renew Subscription

HTTP POST `/restapi/v1.0/subscription/{subscriptionId}/renew`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.restapi(apiVersion).subscription(subscriptionId).renew().post();
rc.revoke();
```


- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-renewSubscription) in API Explorer.


## Get Service Provider Config

HTTP GET `/scim/v2/ServiceProviderConfig`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).serviceProviderConfig().get();
rc.revoke();
```


- `result` is of type [ServiceProviderConfig](./src/main/java/com/ringcentral/definitions/ServiceProviderConfig.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-readServiceProviderConfig2) in API Explorer.


## Search/List Users

HTTP GET `/scim/v2/Users`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).users().list(searchViaGet2Parameters);
rc.revoke();
```

- Parameter `searchViaGet2Parameters` is of type [SearchViaGet2Parameters](./src/main/java/com/ringcentral/definitions/SearchViaGet2Parameters.java)
- `result` is of type [UserSearchResponse](./src/main/java/com/ringcentral/definitions/UserSearchResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-searchViaGet2) in API Explorer.


## Create User

HTTP POST `/scim/v2/Users`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).users().post(createUser);
rc.revoke();
```

- Parameter `createUser` is of type [CreateUser](./src/main/java/com/ringcentral/definitions/CreateUser.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-createUser2) in API Explorer.


## Search/List Users

HTTP POST `/scim/v2/Users/.search`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).users().dotSearch().post(searchRequest);
rc.revoke();
```

- Parameter `searchRequest` is of type [SearchRequest](./src/main/java/com/ringcentral/definitions/SearchRequest.java)
- `result` is of type [UserSearchResponse](./src/main/java/com/ringcentral/definitions/UserSearchResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-searchViaPost2) in API Explorer.


## Get User

HTTP GET `/scim/v2/Users/{id}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).users(id).get();
rc.revoke();
```


- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-readUser2) in API Explorer.


## Update/Replace User

HTTP PUT `/scim/v2/Users/{id}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).users(id).put(user);
rc.revoke();
```

- Parameter `user` is of type [User](./src/main/java/com/ringcentral/definitions/User.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-replaceUser2) in API Explorer.


## Delete User

HTTP DELETE `/scim/v2/Users/{id}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).users(id).delete();
rc.revoke();
```


- `result` is `null`
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-deleteUser2) in API Explorer.


## Update/Patch User

HTTP PATCH `/scim/v2/Users/{id}`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).users(id).patch(userPatch);
rc.revoke();
```

- Parameter `userPatch` is of type [UserPatch](./src/main/java/com/ringcentral/definitions/UserPatch.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-patchUser2) in API Explorer.


## Check Health

HTTP GET `/scim/v2/health`

```cs
RestClient rc = new RestClient("clientID", "clientSecret", "serverURL");
rc.authorize("username", "extension", "password");
var result = rc.scim(version).health().get();
rc.revoke();
```


- `result` is `null`
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-checkHealth2) in API Explorer.