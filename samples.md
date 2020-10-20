# RingCentral Java SDK Code Samples


## Get API Versions

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi`
Rate Limit Group|`NoThrottling`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi().list(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetVersionsResponse](./src/main/java/com/ringcentral/definitions/GetVersionsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersions) in API Explorer.


## Revoke Token

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/oauth/revoke`
Rate Limit Group|`Auth`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi().oauth().revoke().post(revokeTokenRequest, restRequestConfig);
rc.revoke();
```
- Parameter `revokeTokenRequest` is of type [RevokeTokenRequest](./src/main/java/com/ringcentral/definitions/RevokeTokenRequest.java)
- `result` is `null`

[Try it out](https://developer.ringcentral.com/api-reference#OAuth-2.0-revokeToken) in API Explorer.


## Get Token

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/oauth/token`
Rate Limit Group|`Auth`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi().oauth().token().post(getTokenRequest, restRequestConfig);
rc.revoke();
```
- Parameter `getTokenRequest` is of type [GetTokenRequest](./src/main/java/com/ringcentral/definitions/GetTokenRequest.java)
- `result` is of type [TokenInfo](./src/main/java/com/ringcentral/definitions/TokenInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#OAuth-2.0-getToken) in API Explorer.


## Get Version Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}`
Rate Limit Group|`NoThrottling`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetVersionResponse](./src/main/java/com/ringcentral/definitions/GetVersionResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersion) in API Explorer.


## Get Account Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetAccountInfoResponse](./src/main/java/com/ringcentral/definitions/GetAccountInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountInfo) in API Explorer.


## Send A2P SMS

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/a2p-sms/batch`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).a2pSms().batch().post(messageBatchCreateRequest, restRequestConfig);
rc.revoke();
```
- Parameter `messageBatchCreateRequest` is of type [MessageBatchCreateRequest](./src/main/java/com/ringcentral/definitions/MessageBatchCreateRequest.java)
- `result` is of type [MessageBatchResponse](./src/main/java/com/ringcentral/definitions/MessageBatchResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-createA2PSMS) in API Explorer.


## Get A2P SMS Batch

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/a2p-sms/batch/{batchId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).a2pSms().batch(batchId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [MessageBatchResponse](./src/main/java/com/ringcentral/definitions/MessageBatchResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-readA2PBatch) in API Explorer.


## Get A2P SMS List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/a2p-sms/messages`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).a2pSms().messages().list(listA2PsmsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listA2PsmsParameters` is of type [ListA2PsmsParameters](./src/main/java/com/ringcentral/definitions/ListA2PsmsParameters.java)
- `result` is of type [MessageListResponse](./src/main/java/com/ringcentral/definitions/MessageListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-listA2PSMS) in API Explorer.


## Get A2P SMS

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/a2p-sms/messages/{messageId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).a2pSms().messages(messageId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [MessageDetailsResponse](./src/main/java/com/ringcentral/definitions/MessageDetailsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-readA2PSMS) in API Explorer.


## Get Opted Out Numbers

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/a2p-sms/opt-outs`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).a2pSms().optOuts().get(readA2PsmsOptOutsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readA2PsmsOptOutsParameters` is of type [ReadA2PsmsOptOutsParameters](./src/main/java/com/ringcentral/definitions/ReadA2PsmsOptOutsParameters.java)
- `result` is of type [OptOutListResponse](./src/main/java/com/ringcentral/definitions/OptOutListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-readA2PSMSOptOuts) in API Explorer.


## Get Company Active Calls

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/active-calls`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).activeCalls().get(listCompanyActiveCallsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listCompanyActiveCallsParameters` is of type [ListCompanyActiveCallsParameters](./src/main/java/com/ringcentral/definitions/ListCompanyActiveCallsParameters.java)
- `result` is of type [CompanyActiveCallsResponse](./src/main/java/com/ringcentral/definitions/CompanyActiveCallsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listCompanyActiveCalls) in API Explorer.


## Create Company Call Handling Rule

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/answering-rule`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).answeringRule().post(companyAnsweringRuleRequest, restRequestConfig);
rc.revoke();
```
- Parameter `companyAnsweringRuleRequest` is of type [CompanyAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleRequest.java)
- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-createCompanyAnsweringRule) in API Explorer.


## Get Company Call Handling Rule List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/answering-rule`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).answeringRule().list(listCompanyAnsweringRulesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listCompanyAnsweringRulesParameters` is of type [ListCompanyAnsweringRulesParameters](./src/main/java/com/ringcentral/definitions/ListCompanyAnsweringRulesParameters.java)
- `result` is of type [CompanyAnsweringRuleList](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-listCompanyAnsweringRules) in API Explorer.


## Get Company Call Handling Rule

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-readCompanyAnsweringRule) in API Explorer.


## Update Company Call Handling Rule

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).put(companyAnsweringRuleUpdate, restRequestConfig);
rc.revoke();
```
- Parameter `companyAnsweringRuleUpdate` is of type [CompanyAnsweringRuleUpdate](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleUpdate.java)
- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-updateCompanyAnsweringRule) in API Explorer.


## Delete Company Call Handling Rule

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/answering-rule/{ruleId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-deleteCompanyAnsweringRule) in API Explorer.


## Get Account Business Address

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/business-address`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).businessAddress().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [AccountBusinessAddressResource](./src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountBusinessAddress) in API Explorer.


## Update Company Business Address

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/business-address`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).businessAddress().put(modifyAccountBusinessAddressRequest, restRequestConfig);
rc.revoke();
```
- Parameter `modifyAccountBusinessAddressRequest` is of type [ModifyAccountBusinessAddressRequest](./src/main/java/com/ringcentral/definitions/ModifyAccountBusinessAddressRequest.java)
- `result` is of type [AccountBusinessAddressResource](./src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Company-updateAccountBusinessAddress) in API Explorer.


## Get Company Business Hours

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/business-hours`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).businessHours().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CompanyBusinessHours](./src/main/java/com/ringcentral/definitions/CompanyBusinessHours.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-readCompanyBusinessHours) in API Explorer.


## Update Company Business Hours

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/business-hours`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).businessHours().put(companyBusinessHoursUpdateRequest, restRequestConfig);
rc.revoke();
```
- Parameter `companyBusinessHoursUpdateRequest` is of type [CompanyBusinessHoursUpdateRequest](./src/main/java/com/ringcentral/definitions/CompanyBusinessHoursUpdateRequest.java)
- `result` is of type [CompanyBusinessHours](./src/main/java/com/ringcentral/definitions/CompanyBusinessHours.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateCompanyBusinessHours) in API Explorer.


## Get Company Call Log Records

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-log`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`FullCompanyCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callLog().list(readCompanyCallLogParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readCompanyCallLogParameters` is of type [ReadCompanyCallLogParameters](./src/main/java/com/ringcentral/definitions/ReadCompanyCallLogParameters.java)
- `result` is of type [AccountCallLogResponse](./src/main/java/com/ringcentral/definitions/AccountCallLogResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallLog) in API Explorer.


## Sync Company Call Log

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-log-sync`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callLogSync().get(syncAccountCallLogParameters, restRequestConfig);
rc.revoke();
```
- Parameter `syncAccountCallLogParameters` is of type [SyncAccountCallLogParameters](./src/main/java/com/ringcentral/definitions/SyncAccountCallLogParameters.java)
- `result` is of type [AccountCallLogSyncResponse](./src/main/java/com/ringcentral/definitions/AccountCallLogSyncResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncAccountCallLog) in API Explorer.


## Get Company Call Log Record(s)

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-log/{callRecordId}`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`FullCompanyCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callLog(callRecordId).get(readCompanyCallRecordParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readCompanyCallRecordParameters` is of type [ReadCompanyCallRecordParameters](./src/main/java/com/ringcentral/definitions/ReadCompanyCallRecordParameters.java)
- `result` is of type [CompanyCallLogRecord](./src/main/java/com/ringcentral/definitions/CompanyCallLogRecord.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallRecord) in API Explorer.


## Create Call Monitoring Group

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/call-monitoring-groups`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups().post(createCallMonitoringGroupRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createCallMonitoringGroupRequest` is of type [CreateCallMonitoringGroupRequest](./src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.java)
- `result` is of type [CallMonitoringGroup](./src/main/java/com/ringcentral/definitions/CallMonitoringGroup.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-createCallMonitoringGroup) in API Explorer.


## Get Call Monitoring Groups List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-monitoring-groups`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups().get(listCallMonitoringGroupsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listCallMonitoringGroupsParameters` is of type [ListCallMonitoringGroupsParameters](./src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupsParameters.java)
- `result` is of type [CallMonitoringGroups](./src/main/java/com/ringcentral/definitions/CallMonitoringGroups.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-listCallMonitoringGroups) in API Explorer.


## Updates Call Monitoring Group

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).put(createCallMonitoringGroupRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createCallMonitoringGroupRequest` is of type [CreateCallMonitoringGroupRequest](./src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.java)
- `result` is of type [CallMonitoringGroup](./src/main/java/com/ringcentral/definitions/CallMonitoringGroup.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-updateCallMonitoringGroup) in API Explorer.


## Delete Call Monitoring Group

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-deleteCallMonitoringGroup) in API Explorer.


## Update Call Monitoring Group List

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).bulkAssign().post(callMonitoringBulkAssign, restRequestConfig);
rc.revoke();
```
- Parameter `callMonitoringBulkAssign` is of type [CallMonitoringBulkAssign](./src/main/java/com/ringcentral/definitions/CallMonitoringBulkAssign.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-updateCallMonitoringGroupList) in API Explorer.


## Get Call Monitoring Group Member List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/members`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).members().get(listCallMonitoringGroupMembersParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listCallMonitoringGroupMembersParameters` is of type [ListCallMonitoringGroupMembersParameters](./src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupMembersParameters.java)
- `result` is of type [CallMonitoringGroupMemberList](./src/main/java/com/ringcentral/definitions/CallMonitoringGroupMemberList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-listCallMonitoringGroupMembers) in API Explorer.


## Get Call Queue List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-queues`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callQueues().list(listCallQueuesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listCallQueuesParameters` is of type [ListCallQueuesParameters](./src/main/java/com/ringcentral/definitions/ListCallQueuesParameters.java)
- `result` is of type [CallQueues](./src/main/java/com/ringcentral/definitions/CallQueues.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listCallQueues) in API Explorer.


## Get Call Queue

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-queues/{groupId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallQueueDetails](./src/main/java/com/ringcentral/definitions/CallQueueDetails.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-readCallQueueInfo) in API Explorer.


## Update Call Queue

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/call-queues/{groupId}`
Rate Limit Group|`Light`
App Permission|`EditExtensions`
User Permission|`EditUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).put(callQueueUpdateDetails, restRequestConfig);
rc.revoke();
```
- Parameter `callQueueUpdateDetails` is of type [CallQueueUpdateDetails](./src/main/java/com/ringcentral/definitions/CallQueueUpdateDetails.java)
- `result` is of type [CallQueueDetails](./src/main/java/com/ringcentral/definitions/CallQueueDetails.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-updateCallQueueInfo) in API Explorer.


## Assign Multiple Call Queue Members

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/call-queues/{groupId}/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).bulkAssign().post(callQueueBulkAssignResource, restRequestConfig);
rc.revoke();
```
- Parameter `callQueueBulkAssignResource` is of type [CallQueueBulkAssignResource](./src/main/java/com/ringcentral/definitions/CallQueueBulkAssignResource.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-assignMultipleCallQueueMembers) in API Explorer.


## Get Call Queue Members

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-queues/{groupId}/members`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).members().get(listCallQueueMembersParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listCallQueueMembersParameters` is of type [ListCallQueueMembersParameters](./src/main/java/com/ringcentral/definitions/ListCallQueueMembersParameters.java)
- `result` is of type [CallQueueMembers](./src/main/java/com/ringcentral/definitions/CallQueueMembers.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listCallQueueMembers) in API Explorer.


## Get Call Queue Presence

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-queues/{groupId}/presence`
Rate Limit Group|`Light`
App Permission|`ReadPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).presence().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallQueuePresence](./src/main/java/com/ringcentral/definitions/CallQueuePresence.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readCallQueuePresence) in API Explorer.


## Update Call Queue Presence

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/call-queues/{groupId}/presence`
Rate Limit Group|`Medium`
App Permission|`EditPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).presence().put(callQueueUpdatePresence, restRequestConfig);
rc.revoke();
```
- Parameter `callQueueUpdatePresence` is of type [CallQueueUpdatePresence](./src/main/java/com/ringcentral/definitions/CallQueueUpdatePresence.java)
- `result` is of type [CallQueuePresence](./src/main/java/com/ringcentral/definitions/CallQueuePresence.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateCallQueuePresence) in API Explorer.


## Get Call Recording Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-recording`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callRecording().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-readCallRecordingSettings) in API Explorer.


## Update Call Recording Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/call-recording`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callRecording().put(callRecordingSettingsResource, restRequestConfig);
rc.revoke();
```
- Parameter `callRecordingSettingsResource` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)
- `result` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-updateCallRecordingSettings) in API Explorer.


## Update Call Recording Extension List

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/call-recording/bulk-assign`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callRecording().bulkAssign().post(bulkAccountCallRecordingsResource, restRequestConfig);
rc.revoke();
```
- Parameter `bulkAccountCallRecordingsResource` is of type [BulkAccountCallRecordingsResource](./src/main/java/com/ringcentral/definitions/BulkAccountCallRecordingsResource.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-updateCallRecordingExtensionList) in API Explorer.


## Get Call Recording Custom Greeting List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-recording/custom-greetings`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callRecording().customGreetings().get(listCallRecordingCustomGreetingsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listCallRecordingCustomGreetingsParameters` is of type [ListCallRecordingCustomGreetingsParameters](./src/main/java/com/ringcentral/definitions/ListCallRecordingCustomGreetingsParameters.java)
- `result` is of type [CallRecordingCustomGreetings](./src/main/java/com/ringcentral/definitions/CallRecordingCustomGreetings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-listCallRecordingCustomGreetings) in API Explorer.


## Delete Call Recording Custom Greeting

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/call-recording/custom-greetings/{greetingId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callRecording().customGreetings(greetingId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-deleteCallRecordingCustomGreeting) in API Explorer.


## Get Call Recording Extension List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/call-recording/extensions`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).callRecording().extensions().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallRecordingExtensions](./src/main/java/com/ringcentral/definitions/CallRecordingExtensions.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-listCallRecordingExtensions) in API Explorer.


## Create Custom Field

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/custom-fields`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).customFields().post(customFieldCreateRequest, restRequestConfig);
rc.revoke();
```
- Parameter `customFieldCreateRequest` is of type [CustomFieldCreateRequest](./src/main/java/com/ringcentral/definitions/CustomFieldCreateRequest.java)
- `result` is of type [CustomFieldResource](./src/main/java/com/ringcentral/definitions/CustomFieldResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-createCustomField) in API Explorer.


## Get Custom Field List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/custom-fields`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).customFields().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CustomFieldsResource](./src/main/java/com/ringcentral/definitions/CustomFieldsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-listCustomFields) in API Explorer.


## Update Сustom Field

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/custom-fields/{fieldId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).customFields(fieldId).put(customFieldUpdateRequest, restRequestConfig);
rc.revoke();
```
- Parameter `customFieldUpdateRequest` is of type [CustomFieldUpdateRequest](./src/main/java/com/ringcentral/definitions/CustomFieldUpdateRequest.java)
- `result` is of type [CustomFieldResource](./src/main/java/com/ringcentral/definitions/CustomFieldResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-updateCustomField) in API Explorer.


## Delete Custom Field

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/custom-fields/{fieldId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).customFields(fieldId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-deleteCustomField) in API Explorer.


## Get Device

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/device/{deviceId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).device(deviceId).get(readDeviceParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readDeviceParameters` is of type [ReadDeviceParameters](./src/main/java/com/ringcentral/definitions/ReadDeviceParameters.java)
- `result` is of type [GetDeviceInfoResponse](./src/main/java/com/ringcentral/definitions/GetDeviceInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Devices-readDevice) in API Explorer.


## Update Device

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/device/{deviceId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).device(deviceId).put(accountDeviceUpdate, updateDeviceParameters, restRequestConfig);
rc.revoke();
```
- Parameter `accountDeviceUpdate` is of type [AccountDeviceUpdate](./src/main/java/com/ringcentral/definitions/AccountDeviceUpdate.java)
- Parameter `updateDeviceParameters` is of type [UpdateDeviceParameters](./src/main/java/com/ringcentral/definitions/UpdateDeviceParameters.java)
- `result` is of type [GetDeviceInfoResponse](./src/main/java/com/ringcentral/definitions/GetDeviceInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Devices-updateDevice) in API Explorer.


## Get Company Directory Entries

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/directory/entries`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).directory().entries().list(listDirectoryEntriesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listDirectoryEntriesParameters` is of type [ListDirectoryEntriesParameters](./src/main/java/com/ringcentral/definitions/ListDirectoryEntriesParameters.java)
- `result` is of type [DirectoryResource](./src/main/java/com/ringcentral/definitions/DirectoryResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-listDirectoryEntries) in API Explorer.


## Search Company Directory Entries

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/directory/entries/search`
Rate Limit Group|`Heavy`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).directory().entries().search().post(searchDirectoryEntriesRequest, restRequestConfig);
rc.revoke();
```
- Parameter `searchDirectoryEntriesRequest` is of type [SearchDirectoryEntriesRequest](./src/main/java/com/ringcentral/definitions/SearchDirectoryEntriesRequest.java)
- `result` is of type [DirectoryResource](./src/main/java/com/ringcentral/definitions/DirectoryResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-searchDirectoryEntries) in API Explorer.


## Get Corporate Directory Entry

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/directory/entries/{entryId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).directory().entries(entryId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [ContactResource](./src/main/java/com/ringcentral/definitions/ContactResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readDirectoryEntry) in API Explorer.


## Get Account Federation

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/directory/federation`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).directory().federation().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [FederationResource](./src/main/java/com/ringcentral/definitions/FederationResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readAccountFederation) in API Explorer.


## Get Device List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/devices`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().devices().get(listDevicesAutomaticLocationUpdatesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listDevicesAutomaticLocationUpdatesParameters` is of type [ListDevicesAutomaticLocationUpdatesParameters](./src/main/java/com/ringcentral/definitions/ListDevicesAutomaticLocationUpdatesParameters.java)
- `result` is of type [ListDevicesAutomaticLocationUpdates](./src/main/java/com/ringcentral/definitions/ListDevicesAutomaticLocationUpdates.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listDevicesAutomaticLocationUpdates) in API Explorer.


## Enable Automatic Location Updates for Devices

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/devices/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().devices().bulkAssign().post(assignMultipleDevicesAutomaticLocationUpdates, restRequestConfig);
rc.revoke();
```
- Parameter `assignMultipleDevicesAutomaticLocationUpdates` is of type [AssignMultipleDevicesAutomaticLocationUpdates](./src/main/java/com/ringcentral/definitions/AssignMultipleDevicesAutomaticLocationUpdates.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-assignMultipleDevicesAutomaticLocationUpdates) in API Explorer.


## Get Network Map

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks().list(restRequestConfig);
rc.revoke();
```

- `result` is of type [NetworksList](./src/main/java/com/ringcentral/definitions/NetworksList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listNetworks) in API Explorer.


## Create Network

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks().post(createNetworkRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createNetworkRequest` is of type [CreateNetworkRequest](./src/main/java/com/ringcentral/definitions/CreateNetworkRequest.java)
- `result` is of type [NetworkInfo](./src/main/java/com/ringcentral/definitions/NetworkInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createNetwork) in API Explorer.


## Get Network

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [NetworkInfo](./src/main/java/com/ringcentral/definitions/NetworkInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readNetwork) in API Explorer.


## Update Network

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).put(updateNetworkRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateNetworkRequest` is of type [UpdateNetworkRequest](./src/main/java/com/ringcentral/definitions/UpdateNetworkRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateNetwork) in API Explorer.


## Delete Network

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteNetwork) in API Explorer.


## Get Account Switch List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches().list(listAccountSwitchesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listAccountSwitchesParameters` is of type [ListAccountSwitchesParameters](./src/main/java/com/ringcentral/definitions/ListAccountSwitchesParameters.java)
- `result` is of type [SwitchesList](./src/main/java/com/ringcentral/definitions/SwitchesList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listAccountSwitches) in API Explorer.


## Create Switch

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches().post(createSwitchInfo, restRequestConfig);
rc.revoke();
```
- Parameter `createSwitchInfo` is of type [CreateSwitchInfo](./src/main/java/com/ringcentral/definitions/CreateSwitchInfo.java)
- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createSwitch) in API Explorer.


## Create Multiple Switches

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-create`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkCreate().post(createMultipleSwitchesRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createMultipleSwitchesRequest` is of type [CreateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/CreateMultipleSwitchesRequest.java)
- `result` is of type [CreateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/CreateMultipleSwitchesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createMultipleSwitches) in API Explorer.


## Update Multiple Switches

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-update`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkUpdate().post(updateMultipleSwitchesRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateMultipleSwitchesRequest` is of type [UpdateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/UpdateMultipleSwitchesRequest.java)
- `result` is of type [UpdateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/UpdateMultipleSwitchesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateMultipleSwitches) in API Explorer.


## Validate Multiple Switches

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-validate`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkValidate().post(validateMultipleSwitchesRequest, restRequestConfig);
rc.revoke();
```
- Parameter `validateMultipleSwitchesRequest` is of type [ValidateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/ValidateMultipleSwitchesRequest.java)
- `result` is of type [ValidateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/ValidateMultipleSwitchesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-validateMultipleSwitches) in API Explorer.


## Get Switch

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readSwitch) in API Explorer.


## Update Switch

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).put(updateSwitchInfo, restRequestConfig);
rc.revoke();
```
- Parameter `updateSwitchInfo` is of type [UpdateSwitchInfo](./src/main/java/com/ringcentral/definitions/UpdateSwitchInfo.java)
- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateSwitch) in API Explorer.


## Delete Switch

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches/{switchId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteSwitch) in API Explorer.


## Get Emergency Map Configuration Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/tasks/{taskId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().tasks(taskId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [AutomaticLocationUpdatesTaskInfo](./src/main/java/com/ringcentral/definitions/AutomaticLocationUpdatesTaskInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readAutomaticLocationUpdatesTask) in API Explorer.


## Get User List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/users`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().users().get(listAutomaticLocationUpdatesUsersParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listAutomaticLocationUpdatesUsersParameters` is of type [ListAutomaticLocationUpdatesUsersParameters](./src/main/java/com/ringcentral/definitions/ListAutomaticLocationUpdatesUsersParameters.java)
- `result` is of type [AutomaticLocationUpdatesUserList](./src/main/java/com/ringcentral/definitions/AutomaticLocationUpdatesUserList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listAutomaticLocationUpdatesUsers) in API Explorer.


## Enable Automatic Location Updates for Users

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/users/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().users().bulkAssign().post(bulkAssignAutomaticLocationUpdatesUsers, restRequestConfig);
rc.revoke();
```
- Parameter `bulkAssignAutomaticLocationUpdatesUsers` is of type [BulkAssignAutomaticLocationUpdatesUsers](./src/main/java/com/ringcentral/definitions/BulkAssignAutomaticLocationUpdatesUsers.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-assignMultipleAutomaticaLocationUpdatesUsers) in API Explorer.


## Get Wireless Point List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints().list(listWirelessPointsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listWirelessPointsParameters` is of type [ListWirelessPointsParameters](./src/main/java/com/ringcentral/definitions/ListWirelessPointsParameters.java)
- `result` is of type [WirelessPointsList](./src/main/java/com/ringcentral/definitions/WirelessPointsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listWirelessPoints) in API Explorer.


## Create Wireless Point

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints().post(createWirelessPoint, restRequestConfig);
rc.revoke();
```
- Parameter `createWirelessPoint` is of type [CreateWirelessPoint](./src/main/java/com/ringcentral/definitions/CreateWirelessPoint.java)
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createWirelessPoint) in API Explorer.


## Create Multiple Wireless Points

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-create`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkCreate().post(createMultipleWirelessPointsRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createMultipleWirelessPointsRequest` is of type [CreateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/CreateMultipleWirelessPointsRequest.java)
- `result` is of type [CreateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/CreateMultipleWirelessPointsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createMultipleWirelessPoints) in API Explorer.


## Update Multiple Wireless Points

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-update`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkUpdate().post(updateMultipleWirelessPointsRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateMultipleWirelessPointsRequest` is of type [UpdateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/UpdateMultipleWirelessPointsRequest.java)
- `result` is of type [UpdateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/UpdateMultipleWirelessPointsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateMultipleWirelessPoints) in API Explorer.


## Validate Multiple Wireless Points

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-validate`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkValidate().post(validateMultipleWirelessPointsRequest, restRequestConfig);
rc.revoke();
```
- Parameter `validateMultipleWirelessPointsRequest` is of type [ValidateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/ValidateMultipleWirelessPointsRequest.java)
- `result` is of type [ValidateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/ValidateMultipleWirelessPointsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-validateMultipleWirelessPoints) in API Explorer.


## Get Wireless Point

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readWirelessPoint) in API Explorer.


## Update Wireless Point

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).put(updateWirelessPoint, restRequestConfig);
rc.revoke();
```
- Parameter `updateWirelessPoint` is of type [UpdateWirelessPoint](./src/main/java/com/ringcentral/definitions/UpdateWirelessPoint.java)
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateWirelessPoint) in API Explorer.


## Delete Wireless Point

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteWirelessPoint) in API Explorer.


## Add Emergency Location

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-locations`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyLocations().post(emergencyLocationInfoRequest, restRequestConfig);
rc.revoke();
```
- Parameter `emergencyLocationInfoRequest` is of type [EmergencyLocationInfoRequest](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfoRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createEmergencyLocation) in API Explorer.


## Get Emergency Location List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-locations`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyLocations().list(listEmergencyLocationsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listEmergencyLocationsParameters` is of type [ListEmergencyLocationsParameters](./src/main/java/com/ringcentral/definitions/ListEmergencyLocationsParameters.java)
- `result` is of type [EmergencyLocationList](./src/main/java/com/ringcentral/definitions/EmergencyLocationList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listEmergencyLocations) in API Explorer.


## Get Emergency Location

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-locations/{locationId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [EmergencyLocationInfo](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readEmergencyLocation) in API Explorer.


## Update Emergency Location

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/emergency-locations/{locationId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).put(emergencyLocationInfoRequest, restRequestConfig);
rc.revoke();
```
- Parameter `emergencyLocationInfoRequest` is of type [EmergencyLocationInfoRequest](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfoRequest.java)
- `result` is of type [EmergencyLocationInfo](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateEmergencyLocation) in API Explorer.


## Get Extension List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension().list(listExtensionsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listExtensionsParameters` is of type [ListExtensionsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionsParameters.java)
- `result` is of type [GetExtensionListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-listExtensions) in API Explorer.


## Create Extension

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`AddRemoveUsers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension().post(extensionCreationRequest, restRequestConfig);
rc.revoke();
```
- Parameter `extensionCreationRequest` is of type [ExtensionCreationRequest](./src/main/java/com/ringcentral/definitions/ExtensionCreationRequest.java)
- `result` is of type [ExtensionCreationResponse](./src/main/java/com/ringcentral/definitions/ExtensionCreationResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-createExtension) in API Explorer.


## Get Extension

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetExtensionInfoResponse](./src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readExtension) in API Explorer.


## Update Extension

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserInfo OR EditUserCredentials`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).put(extensionUpdateRequest, restRequestConfig);
rc.revoke();
```
- Parameter `extensionUpdateRequest` is of type [ExtensionUpdateRequest](./src/main/java/com/ringcentral/definitions/ExtensionUpdateRequest.java)
- `result` is of type [GetExtensionInfoResponse](./src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateExtension) in API Explorer.


## Delete Extension

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`AddRemoveUsers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).delete(deleteExtensionParameters, restRequestConfig);
rc.revoke();
```
- Parameter `deleteExtensionParameters` is of type [DeleteExtensionParameters](./src/main/java/com/ringcentral/definitions/DeleteExtensionParameters.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-deleteExtension) in API Explorer.


## Get User Active Calls

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/active-calls`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).activeCalls().get(listExtensionActiveCallsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listExtensionActiveCallsParameters` is of type [ListExtensionActiveCallsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionActiveCallsParameters.java)
- `result` is of type [UserActiveCallsResponse](./src/main/java/com/ringcentral/definitions/UserActiveCallsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listExtensionActiveCalls) in API Explorer.


## Address Book Synchronization

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book-sync`
Rate Limit Group|`Heavy`
App Permission|`ReadContacts`
User Permission|`ReadPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBookSync().get(syncAddressBookParameters, restRequestConfig);
rc.revoke();
```
- Parameter `syncAddressBookParameters` is of type [SyncAddressBookParameters](./src/main/java/com/ringcentral/definitions/SyncAddressBookParameters.java)
- `result` is of type [AddressBookSync](./src/main/java/com/ringcentral/definitions/AddressBookSync.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-syncAddressBook) in API Explorer.


## Get Contact List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact`
Rate Limit Group|`Heavy`
App Permission|`ReadContacts`
User Permission|`ReadPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact().list(listContactsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listContactsParameters` is of type [ListContactsParameters](./src/main/java/com/ringcentral/definitions/ListContactsParameters.java)
- `result` is of type [ContactList](./src/main/java/com/ringcentral/definitions/ContactList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listContacts) in API Explorer.


## Create Contact

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact`
Rate Limit Group|`Heavy`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact().post(personalContactRequest, createContactParameters, restRequestConfig);
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

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`
Rate Limit Group|`Heavy`
App Permission|`ReadContacts`
User Permission|`ReadPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-readContact) in API Explorer.


## Update Contact

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`
Rate Limit Group|`Heavy`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).put(personalContactRequest, updateContactParameters, restRequestConfig);
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

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`
Rate Limit Group|`Heavy`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-deleteContact) in API Explorer.


## Get Call Handling Rules

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule().list(listAnsweringRulesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listAnsweringRulesParameters` is of type [ListAnsweringRulesParameters](./src/main/java/com/ringcentral/definitions/ListAnsweringRulesParameters.java)
- `result` is of type [UserAnsweringRuleList](./src/main/java/com/ringcentral/definitions/UserAnsweringRuleList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-listAnsweringRules) in API Explorer.


## Create Call Handling Rule

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule().post(createAnsweringRuleRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createAnsweringRuleRequest` is of type [CreateAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/CreateAnsweringRuleRequest.java)
- `result` is of type [CustomAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CustomAnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-createAnsweringRule) in API Explorer.


## Get Call Handling Rule

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).get(readAnsweringRuleParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readAnsweringRuleParameters` is of type [ReadAnsweringRuleParameters](./src/main/java/com/ringcentral/definitions/ReadAnsweringRuleParameters.java)
- `result` is of type [AnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-readAnsweringRule) in API Explorer.


## Update Call Handling Rule

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).put(updateAnsweringRuleRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateAnsweringRuleRequest` is of type [UpdateAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/UpdateAnsweringRuleRequest.java)
- `result` is of type [AnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-updateAnsweringRule) in API Explorer.


## Delete Call Handling Rule

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-deleteAnsweringRule) in API Explorer.


## Get Authorization Profile

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).authzProfile().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [AuthProfileResource](./src/main/java/com/ringcentral/definitions/AuthProfileResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Permissions-readAuthorizationProfile) in API Explorer.


## Check User Permission

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile/check`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).authzProfile().check().get(checkUserPermissionParameters, restRequestConfig);
rc.revoke();
```
- Parameter `checkUserPermissionParameters` is of type [CheckUserPermissionParameters](./src/main/java/com/ringcentral/definitions/CheckUserPermissionParameters.java)
- `result` is of type [AuthProfileCheckResource](./src/main/java/com/ringcentral/definitions/AuthProfileCheckResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Permissions-checkUserPermission) in API Explorer.


## Get User Business Hours

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).businessHours().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetUserBusinessHoursResponse](./src/main/java/com/ringcentral/definitions/GetUserBusinessHoursResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-readUserBusinessHours) in API Explorer.


## Update User Business Hours

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).businessHours().put(userBusinessHoursUpdateRequest, restRequestConfig);
rc.revoke();
```
- Parameter `userBusinessHoursUpdateRequest` is of type [UserBusinessHoursUpdateRequest](./src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateRequest.java)
- `result` is of type [UserBusinessHoursUpdateResponse](./src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateUserBusinessHours) in API Explorer.


## Get User Call Log Records

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog().list(readUserCallLogParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readUserCallLogParameters` is of type [ReadUserCallLogParameters](./src/main/java/com/ringcentral/definitions/ReadUserCallLogParameters.java)
- `result` is of type [UserCallLogResponse](./src/main/java/com/ringcentral/definitions/UserCallLogResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallLog) in API Explorer.


## Delete User Call Log

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log`
Rate Limit Group|`Heavy`
App Permission|`EditCallLog`
User Permission|`EditCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog().delete(deleteUserCallLogParameters, restRequestConfig);
rc.revoke();
```
- Parameter `deleteUserCallLogParameters` is of type [DeleteUserCallLogParameters](./src/main/java/com/ringcentral/definitions/DeleteUserCallLogParameters.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-deleteUserCallLog) in API Explorer.


## Sync User Call Log

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log-sync`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLogSync().get(syncUserCallLogParameters, restRequestConfig);
rc.revoke();
```
- Parameter `syncUserCallLogParameters` is of type [SyncUserCallLogParameters](./src/main/java/com/ringcentral/definitions/SyncUserCallLogParameters.java)
- `result` is of type [CallLogSync](./src/main/java/com/ringcentral/definitions/CallLogSync.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncUserCallLog) in API Explorer.


## Get User Call Record

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log/{callRecordId}`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog(callRecordId).get(readUserCallRecordParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readUserCallRecordParameters` is of type [ReadUserCallRecordParameters](./src/main/java/com/ringcentral/definitions/ReadUserCallRecordParameters.java)
- `result` is of type [UserCallLogRecord](./src/main/java/com/ringcentral/definitions/UserCallLogRecord.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallRecord) in API Explorer.


## Get Agent’s Call Queue Presence

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-queue-presence`
Rate Limit Group|`Light`
App Permission|`ReadPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callQueuePresence().get(readExtensionCallQueuePresenceParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readExtensionCallQueuePresenceParameters` is of type [ReadExtensionCallQueuePresenceParameters](./src/main/java/com/ringcentral/definitions/ReadExtensionCallQueuePresenceParameters.java)
- `result` is of type [ExtensionCallQueuePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueuePresenceList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readExtensionCallQueuePresence) in API Explorer.


## Update Call Queue Presence

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-queue-presence`
Rate Limit Group|`Medium`
App Permission|`EditPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callQueuePresence().put(extensionCallQueueUpdatePresenceList, restRequestConfig);
rc.revoke();
```
- Parameter `extensionCallQueueUpdatePresenceList` is of type [ExtensionCallQueueUpdatePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueueUpdatePresenceList.java)
- `result` is of type [ExtensionCallQueuePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueuePresenceList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateExtensionCallQueuePresence) in API Explorer.


## Update User Call Queues

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/call-queues`
Rate Limit Group|`Medium`
App Permission|`Accounts`
User Permission|`JoinLeaveCallQueue`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callQueues().put(userCallQueues, restRequestConfig);
rc.revoke();
```
- Parameter `userCallQueues` is of type [UserCallQueues](./src/main/java/com/ringcentral/definitions/UserCallQueues.java)
- `result` is of type [UserCallQueues](./src/main/java/com/ringcentral/definitions/UserCallQueues.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-updateUserCallQueues) in API Explorer.


## Get Caller Blocking Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallerBlockingSettings](./src/main/java/com/ringcentral/definitions/CallerBlockingSettings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-readCallerBlockingSettings) in API Explorer.


## Update Caller Blocking Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking`
Rate Limit Group|`Light`
App Permission|`EditExtensions`
User Permission|`EditBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().put(callerBlockingSettingsUpdate, restRequestConfig);
rc.revoke();
```
- Parameter `callerBlockingSettingsUpdate` is of type [CallerBlockingSettingsUpdate](./src/main/java/com/ringcentral/definitions/CallerBlockingSettingsUpdate.java)
- `result` is of type [CallerBlockingSettings](./src/main/java/com/ringcentral/definitions/CallerBlockingSettings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateCallerBlockingSettings) in API Explorer.


## Get Blocked/Allowed Phone Numbers

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers().list(listBlockedAllowedNumbersParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listBlockedAllowedNumbersParameters` is of type [ListBlockedAllowedNumbersParameters](./src/main/java/com/ringcentral/definitions/ListBlockedAllowedNumbersParameters.java)
- `result` is of type [BlockedAllowedPhoneNumbersList](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumbersList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-listBlockedAllowedNumbers) in API Explorer.


## Add Blocked/Allowed Number

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers().post(addBlockedAllowedPhoneNumber, restRequestConfig);
rc.revoke();
```
- Parameter `addBlockedAllowedPhoneNumber` is of type [AddBlockedAllowedPhoneNumber](./src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.java)
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-createBlockedAllowedNumber) in API Explorer.


## Get Blocked/Allowed Number

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-readBlockedAllowedNumber) in API Explorer.


## Delete Blocked/Allowed Number

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-deleteBlockedAllowedNumber) in API Explorer.


## Update Blocked/Allowed Number

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).put(addBlockedAllowedPhoneNumber, restRequestConfig);
rc.revoke();
```
- Parameter `addBlockedAllowedPhoneNumber` is of type [AddBlockedAllowedPhoneNumber](./src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.java)
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateBlockedAllowedNumber) in API Explorer.


## Get Extension Caller ID

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-id`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCallerIDSettings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerId().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readExtensionCallerId) in API Explorer.


## Update Extension Caller ID

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-id`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditCallerIDSettings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerId().put(extensionCallerIdInfo, restRequestConfig);
rc.revoke();
```
- Parameter `extensionCallerIdInfo` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)
- `result` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateExtensionCallerId) in API Explorer.


## Create Internal Text Message

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/company-pager`
Rate Limit Group|`Medium`
App Permission|`InternalMessages`
User Permission|`InternalSMS`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).companyPager().post(createInternalTextMessageRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createInternalTextMessageRequest` is of type [CreateInternalTextMessageRequest](./src/main/java/com/ringcentral/definitions/CreateInternalTextMessageRequest.java)
- `result` is of type [GetInternalTextMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetInternalTextMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Pager-Messages-createInternalTextMessage) in API Explorer.


## Get User Conferencing Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`OrganizeConference`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).conferencing().get(readConferencingSettingsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readConferencingSettingsParameters` is of type [ReadConferencingSettingsParameters](./src/main/java/com/ringcentral/definitions/ReadConferencingSettingsParameters.java)
- `result` is of type [GetConferencingInfoResponse](./src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readConferencingSettings) in API Explorer.


## Update User Conferencing Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`OrganizeConference`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).conferencing().put(updateConferencingInfoRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateConferencingInfoRequest` is of type [UpdateConferencingInfoRequest](./src/main/java/com/ringcentral/definitions/UpdateConferencingInfoRequest.java)
- `result` is of type [GetConferencingInfoResponse](./src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateConferencingSettings) in API Explorer.


## Get Extension Device List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/device`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).device().get(listExtensionDevicesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listExtensionDevicesParameters` is of type [ListExtensionDevicesParameters](./src/main/java/com/ringcentral/definitions/ListExtensionDevicesParameters.java)
- `result` is of type [GetExtensionDevicesResponse](./src/main/java/com/ringcentral/definitions/GetExtensionDevicesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Devices-listExtensionDevices) in API Explorer.


## Get Favorite Contact List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite`
Rate Limit Group|`Light`
App Permission|`ReadContacts`
User Permission|`ReadPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).favorite().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [FavoriteContactList](./src/main/java/com/ringcentral/definitions/FavoriteContactList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listFavoriteContacts) in API Explorer.


## Update Favorite Contact List

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite`
Rate Limit Group|`Medium`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).favorite().put(favoriteCollection, restRequestConfig);
rc.revoke();
```
- Parameter `favoriteCollection` is of type [FavoriteCollection](./src/main/java/com/ringcentral/definitions/FavoriteCollection.java)
- `result` is of type [FavoriteContactList](./src/main/java/com/ringcentral/definitions/FavoriteContactList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateFavoriteContactList) in API Explorer.


## Create Fax Message

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/fax`
Rate Limit Group|`Heavy`
App Permission|`Faxes`
User Permission|`OutboundFaxes`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).fax().post(createFaxMessageRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createFaxMessageRequest` is of type [CreateFaxMessageRequest](./src/main/java/com/ringcentral/definitions/CreateFaxMessageRequest.java)
- `result` is of type [FaxResponse](./src/main/java/com/ringcentral/definitions/FaxResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Fax-createFaxMessage) in API Explorer.


## Get User Features

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/features`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).features().get(readUserFeaturesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readUserFeaturesParameters` is of type [ReadUserFeaturesParameters](./src/main/java/com/ringcentral/definitions/ReadUserFeaturesParameters.java)
- `result` is of type [FeatureList](./src/main/java/com/ringcentral/definitions/FeatureList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Features-readUserFeatures) in API Explorer.


## Get Forwarding Number List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber().list(listForwardingNumbersParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listForwardingNumbersParameters` is of type [ListForwardingNumbersParameters](./src/main/java/com/ringcentral/definitions/ListForwardingNumbersParameters.java)
- `result` is of type [GetExtensionForwardingNumberListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionForwardingNumberListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-listForwardingNumbers) in API Explorer.


## Create Forwarding Number

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber().post(createForwardingNumberRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createForwardingNumberRequest` is of type [CreateForwardingNumberRequest](./src/main/java/com/ringcentral/definitions/CreateForwardingNumberRequest.java)
- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-createForwardingNumber) in API Explorer.


## Get Forwarding Number

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-readForwardingNumber) in API Explorer.


## Update Forwarding Number

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).put(updateForwardingNumberRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateForwardingNumberRequest` is of type [UpdateForwardingNumberRequest](./src/main/java/com/ringcentral/definitions/UpdateForwardingNumberRequest.java)
- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-updateForwardingNumber) in API Explorer.


## Delete Forwarding Number

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-deleteForwardingNumber) in API Explorer.


## Get Extension Grant List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/grant`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).grant().get(listExtensionGrantsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listExtensionGrantsParameters` is of type [ListExtensionGrantsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionGrantsParameters.java)
- `result` is of type [GetExtensionGrantListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionGrantListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-listExtensionGrants) in API Explorer.


## Create Custom User Greeting

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).greeting().post(createCustomUserGreetingRequest, createCustomUserGreetingParameters, restRequestConfig);
rc.revoke();
```
- Parameter `createCustomUserGreetingRequest` is of type [CreateCustomUserGreetingRequest](./src/main/java/com/ringcentral/definitions/CreateCustomUserGreetingRequest.java)
- Parameter `createCustomUserGreetingParameters` is of type [CreateCustomUserGreetingParameters](./src/main/java/com/ringcentral/definitions/CreateCustomUserGreetingParameters.java)
- `result` is of type [CustomUserGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomUserGreetingInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-createCustomUserGreeting) in API Explorer.


## Get Custom Greeting

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting/{greetingId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).greeting(greetingId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CustomUserGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomUserGreetingInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-readCustomGreeting) in API Explorer.


## Get Scheduled Meetings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().list(restRequestConfig);
rc.revoke();
```

- `result` is of type [MeetingsResource](./src/main/java/com/ringcentral/definitions/MeetingsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-listMeetings) in API Explorer.


## Create Meeting

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().post(meetingRequestResource, restRequestConfig);
rc.revoke();
```
- Parameter `meetingRequestResource` is of type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-createMeeting) in API Explorer.


## Get User Meeting Recordings List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting-recordings`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`MeetingsRecordings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingRecordings().get(listUserMeetingRecordingsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listUserMeetingRecordingsParameters` is of type [ListUserMeetingRecordingsParameters](./src/main/java/com/ringcentral/definitions/ListUserMeetingRecordingsParameters.java)
- `result` is of type [ListMeetingRecordingsResponse](./src/main/java/com/ringcentral/definitions/ListMeetingRecordingsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Recordings-listUserMeetingRecordings) in API Explorer.


## Get Meeting Service Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/service-info`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().serviceInfo().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [MeetingServiceInfoResource](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readMeetingServiceInfo) in API Explorer.


## Update Meeting Service Info

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/service-info`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().serviceInfo().patch(meetingServiceInfoRequest, restRequestConfig);
rc.revoke();
```
- Parameter `meetingServiceInfoRequest` is of type [MeetingServiceInfoRequest](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoRequest.java)
- `result` is of type [MeetingServiceInfoResource](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-updateMeetingServiceInfo) in API Explorer.


## Get Meeting User Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/user-settings`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().userSettings().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [MeetingUserSettingsResponse](./src/main/java/com/ringcentral/definitions/MeetingUserSettingsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-GetUserSetting) in API Explorer.


## Get Meeting Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-readMeeting) in API Explorer.


## Update Meeting

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).put(meetingRequestResource, restRequestConfig);
rc.revoke();
```
- Parameter `meetingRequestResource` is of type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-updateMeeting) in API Explorer.


## Delete Meeting

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-deleteMeeting) in API Explorer.


## End Meeting

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).end().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-endMeeting) in API Explorer.


## Get Meeting Invitation

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/invitation`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).invitation().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [PublicMeetingInvitationResponse](./src/main/java/com/ringcentral/definitions/PublicMeetingInvitationResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-readMeetingInvitation) in API Explorer.


## Get Assistants

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assistants`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingsConfiguration().assistants().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [AssistantsResource](./src/main/java/com/ringcentral/definitions/AssistantsResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readAssistants) in API Explorer.


## Get Assisted Users

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assisted`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingsConfiguration().assisted().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [AssistedUsersResource](./src/main/java/com/ringcentral/definitions/AssistedUsersResource.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readAssistedUsers) in API Explorer.


## Get Message List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store`
Rate Limit Group|`Light`
App Permission|`ReadMessages`
User Permission|`ReadMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore().list(listMessagesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listMessagesParameters` is of type [ListMessagesParameters](./src/main/java/com/ringcentral/definitions/ListMessagesParameters.java)
- `result` is of type [GetMessageList](./src/main/java/com/ringcentral/definitions/GetMessageList.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-listMessages) in API Explorer.


## Get Message

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`
Rate Limit Group|`Light`
App Permission|`ReadMessages`
User Permission|`ReadMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessage) in API Explorer.


## Update Message List

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`
Rate Limit Group|`Medium`
App Permission|`EditMessages`
User Permission|`EditMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).put(updateMessageRequest, updateMessageParameters, restRequestConfig);
rc.revoke();
```
- Parameter `updateMessageRequest` is of type [UpdateMessageRequest](./src/main/java/com/ringcentral/definitions/UpdateMessageRequest.java)
- Parameter `updateMessageParameters` is of type [UpdateMessageParameters](./src/main/java/com/ringcentral/definitions/UpdateMessageParameters.java)
- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessage) in API Explorer.


## Delete Message

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}`
Rate Limit Group|`Medium`
App Permission|`EditMessages`
User Permission|`EditMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).delete(deleteMessageParameters, restRequestConfig);
rc.revoke();
```
- Parameter `deleteMessageParameters` is of type [DeleteMessageParameters](./src/main/java/com/ringcentral/definitions/DeleteMessageParameters.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-deleteMessage) in API Explorer.


## Get Message Content

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId}`
Rate Limit Group|`Medium`
App Permission|`ReadMessages`
User Permission|`ReadMessageContent`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).content(attachmentId).get(readMessageContentParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readMessageContentParameters` is of type [ReadMessageContentParameters](./src/main/java/com/ringcentral/definitions/ReadMessageContentParameters.java)
- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageContent) in API Explorer.

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).


## Sync Messages

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/message-sync`
Rate Limit Group|`Light`
App Permission|`ReadMessages`
User Permission|`ReadMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageSync().get(syncMessagesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `syncMessagesParameters` is of type [SyncMessagesParameters](./src/main/java/com/ringcentral/definitions/SyncMessagesParameters.java)
- `result` is of type [GetMessageSyncResponse](./src/main/java/com/ringcentral/definitions/GetMessageSyncResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-syncMessages) in API Explorer.


## Send MMS

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/mms`
Rate Limit Group|`Medium`
App Permission|`SMS`
User Permission|`OutboundSMS`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).mms().post(createMmsMessage, restRequestConfig);
rc.revoke();
```
- Parameter `createMmsMessage` is of type [CreateMMSMessage](./src/main/java/com/ringcentral/definitions/CreateMMSMessage.java)
- `result` is of type [GetSMSMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetSMSMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#SMS-createMMS) in API Explorer.


## Get Notification Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadMessagesNotificationsSettings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).notificationSettings().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [NotificationSettings](./src/main/java/com/ringcentral/definitions/NotificationSettings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readNotificationSettings) in API Explorer.


## Update Notification Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditMessagesNotificationsSettings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).notificationSettings().put(notificationSettingsUpdateRequest, restRequestConfig);
rc.revoke();
```
- Parameter `notificationSettingsUpdateRequest` is of type [NotificationSettingsUpdateRequest](./src/main/java/com/ringcentral/definitions/NotificationSettingsUpdateRequest.java)
- `result` is of type [NotificationSettings](./src/main/java/com/ringcentral/definitions/NotificationSettings.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateNotificationSettings) in API Explorer.


## Get Extension Phone Number List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/phone-number`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserPhoneNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).phoneNumber().get(listExtensionPhoneNumbersParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listExtensionPhoneNumbersParameters` is of type [ListExtensionPhoneNumbersParameters](./src/main/java/com/ringcentral/definitions/ListExtensionPhoneNumbersParameters.java)
- `result` is of type [GetExtensionPhoneNumbersResponse](./src/main/java/com/ringcentral/definitions/GetExtensionPhoneNumbersResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-listExtensionPhoneNumbers) in API Explorer.


## Get User Presence Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/presence`
Rate Limit Group|`Light`
App Permission|`ReadPresence`
User Permission|`ReadPresenceStatus`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).presence().get(readUserPresenceStatusParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readUserPresenceStatusParameters` is of type [ReadUserPresenceStatusParameters](./src/main/java/com/ringcentral/definitions/ReadUserPresenceStatusParameters.java)
- `result` is of type [GetPresenceInfo](./src/main/java/com/ringcentral/definitions/GetPresenceInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readUserPresenceStatus) in API Explorer.


## Update User Presence Status

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/presence`
Rate Limit Group|`Medium`
App Permission|`EditPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).presence().put(presenceInfoResource, restRequestConfig);
rc.revoke();
```
- Parameter `presenceInfoResource` is of type [PresenceInfoResource](./src/main/java/com/ringcentral/definitions/PresenceInfoResource.java)
- `result` is of type [PresenceInfoResponse](./src/main/java/com/ringcentral/definitions/PresenceInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateUserPresenceStatus) in API Explorer.


## Get User Profile Image

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().list(restRequestConfig);
rc.revoke();
```

- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readUserProfileImage) in API Explorer.

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).


## Upload User Profile Image

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`EditUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().post(createUserProfileImageRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createUserProfileImageRequest` is of type [CreateUserProfileImageRequest](./src/main/java/com/ringcentral/definitions/CreateUserProfileImageRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-createUserProfileImage) in API Explorer.


## Update User Profile Image

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`EditUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().put(updateUserProfileImageRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateUserProfileImageRequest` is of type [UpdateUserProfileImageRequest](./src/main/java/com/ringcentral/definitions/UpdateUserProfileImageRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateUserProfileImage) in API Explorer.


## Get Scaled User Profile Image

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image/{scaleSize}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage(scaleSize).get(restRequestConfig);
rc.revoke();
```

- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readScaledPofileImage) in API Explorer.

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).


## Make RingOut Call

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out`
Rate Limit Group|`Heavy`
App Permission|`RingOut`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut().post(makeRingOutRequest, restRequestConfig);
rc.revoke();
```
- Parameter `makeRingOutRequest` is of type [MakeRingOutRequest](./src/main/java/com/ringcentral/definitions/MakeRingOutRequest.java)
- `result` is of type [GetRingOutStatusResponse](./src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-createRingOutCall) in API Explorer.


## Get RingOut Call Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}`
Rate Limit Group|`Light`
App Permission|`RingOut`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut(ringoutId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetRingOutStatusResponse](./src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-readRingOutCallStatus) in API Explorer.


## Cancel RingOut Call

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}`
Rate Limit Group|`Heavy`
App Permission|`RingOut`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut(ringoutId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-deleteRingOutCall) in API Explorer.


## Send SMS

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/sms`
Rate Limit Group|`Medium`
App Permission|`SMS`
User Permission|`OutboundSMS`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).sms().post(createSmsMessage, restRequestConfig);
rc.revoke();
```
- Parameter `createSmsMessage` is of type [CreateSMSMessage](./src/main/java/com/ringcentral/definitions/CreateSMSMessage.java)
- `result` is of type [GetSMSMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetSMSMessageInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#SMS-createSMSMessage) in API Explorer.


## Get Unified Presence

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/unified-presence`
Rate Limit Group|`Medium`
App Permission|`ReadPresence`
User Permission|`ReadPresenceStatus`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).unifiedPresence().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [UnifiedPresence](./src/main/java/com/ringcentral/definitions/UnifiedPresence.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readUnifiedPresence) in API Explorer.


## Update Unified Presence

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/unified-presence`
Rate Limit Group|`Medium`
App Permission|`EditPresence`
User Permission|`EditPresenceStatus`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).unifiedPresence().patch(updateUnifiedPresence, restRequestConfig);
rc.revoke();
```
- Parameter `updateUnifiedPresence` is of type [UpdateUnifiedPresence](./src/main/java/com/ringcentral/definitions/UpdateUnifiedPresence.java)
- `result` is of type [UnifiedPresence](./src/main/java/com/ringcentral/definitions/UnifiedPresence.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateUnifiedPresence) in API Explorer.


## Get User Video Configuration

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/video-configuration`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).videoConfiguration().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [UserVideoConfiguration](./src/main/java/com/ringcentral/definitions/UserVideoConfiguration.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Video-Configuration-readUserVideoConfiguration) in API Explorer.


## Update User Video Configuration

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/extension/{extensionId}/video-configuration`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).extension(extensionId).videoConfiguration().put(userVideoConfiguration, restRequestConfig);
rc.revoke();
```
- Parameter `userVideoConfiguration` is of type [UserVideoConfiguration](./src/main/java/com/ringcentral/definitions/UserVideoConfiguration.java)
- `result` is of type [UserVideoConfiguration](./src/main/java/com/ringcentral/definitions/UserVideoConfiguration.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Video-Configuration-updateUserVideoConfiguration) in API Explorer.


## Create Company Greeting

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/greeting`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ReadUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).greeting().post(createCompanyGreetingRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createCompanyGreetingRequest` is of type [CreateCompanyGreetingRequest](./src/main/java/com/ringcentral/definitions/CreateCompanyGreetingRequest.java)
- `result` is of type [CustomCompanyGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomCompanyGreetingInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-createCompanyGreeting) in API Explorer.


## Create IVR Menu

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-menus`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`AutoReceptionist`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrMenus().post(ivrMenuInfo, restRequestConfig);
rc.revoke();
```
- Parameter `ivrMenuInfo` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-createIVRMenu) in API Explorer.


## Get IVR Menu

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`AutoReceptionist`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrMenus(ivrMenuId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-readIVRMenu) in API Explorer.


## Update IVR Menu

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`AutoReceptionist`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrMenus(ivrMenuId).put(ivrMenuInfo, restRequestConfig);
rc.revoke();
```
- Parameter `ivrMenuInfo` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-updateIVRMenu) in API Explorer.


## Create IVR Prompts

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-prompts`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`EditCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts().post(createIvrPromptRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createIvrPromptRequest` is of type [CreateIvrPromptRequest](./src/main/java/com/ringcentral/definitions/CreateIvrPromptRequest.java)
- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-createIVRPrompt) in API Explorer.


## Get IVR Prompt List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-prompts`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts().list(restRequestConfig);
rc.revoke();
```

- `result` is of type [IVRPrompts](./src/main/java/com/ringcentral/definitions/IVRPrompts.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-listIVRPrompts) in API Explorer.


## Get IVR Prompt

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-readIVRPrompt) in API Explorer.


## Delete IVR Prompt

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`EditCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-deleteIVRPrompt) in API Explorer.


## Update IVR Prompt

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).put(updateIvrPromptRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateIvrPromptRequest` is of type [UpdateIVRPromptRequest](./src/main/java/com/ringcentral/definitions/UpdateIVRPromptRequest.java)
- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-updateIVRPrompt) in API Explorer.


## Get IVR Prompt Content

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}/content`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).content().get(restRequestConfig);
rc.revoke();
```

- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#IVR-readIVRPromptContent) in API Explorer.

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).


## Get Account Meeting Recordings List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/meeting-recordings`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`MeetingsRecordings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).meetingRecordings().get(listAccountMeetingRecordingsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listAccountMeetingRecordingsParameters` is of type [ListAccountMeetingRecordingsParameters](./src/main/java/com/ringcentral/definitions/ListAccountMeetingRecordingsParameters.java)
- `result` is of type [ListMeetingRecordingsResponse](./src/main/java/com/ringcentral/definitions/ListMeetingRecordingsResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Recordings-listAccountMeetingRecordings) in API Explorer.


## Get Locked Meeting Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/meeting/locked-settings`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).meeting().lockedSettings().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [AccountLockedSettingResponse](./src/main/java/com/ringcentral/definitions/AccountLockedSettingResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-GetAccountLockedSetting) in API Explorer.


## Get Message Store Configuration

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/message-store-configuration`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`AccountAdministration`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).messageStoreConfiguration().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageStoreConfiguration) in API Explorer.


## Update Message Store Configuration

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/account/{accountId}/message-store-configuration`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`AccountAdministration`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).messageStoreConfiguration().put(messageStoreConfiguration, restRequestConfig);
rc.revoke();
```
- Parameter `messageStoreConfiguration` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)
- `result` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessageStoreConfiguration) in API Explorer.


## Create Message Store Report

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/message-store-report`
Rate Limit Group|`Heavy`
App Permission|`ReadMessages`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).messageStoreReport().post(createMessageStoreReportRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createMessageStoreReportRequest` is of type [CreateMessageStoreReportRequest](./src/main/java/com/ringcentral/definitions/CreateMessageStoreReportRequest.java)
- `result` is of type [MessageStoreReport](./src/main/java/com/ringcentral/definitions/MessageStoreReport.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-createMessageStoreReport) in API Explorer.


## Get Message Store Report Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/message-store-report/{taskId}`
Rate Limit Group|`Heavy`
App Permission|`ReadMessages`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [MessageStoreReport](./src/main/java/com/ringcentral/definitions/MessageStoreReport.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportTask) in API Explorer.


## Get Message Store Report Archive

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive`
Rate Limit Group|`Heavy`
App Permission|`ReadMessages`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).archive().list(restRequestConfig);
rc.revoke();
```

- `result` is of type [MessageStoreReportArchive](./src/main/java/com/ringcentral/definitions/MessageStoreReportArchive.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchive) in API Explorer.


## Get Message Store Report Archive Content

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive/{archiveId}`
Rate Limit Group|`Heavy`
App Permission|`ReadMessages`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).archive(archiveId).get(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchiveContent) in API Explorer.


## Assign Paging Group Users and Devices

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).bulkAssign().post(editPagingGroupRequest, restRequestConfig);
rc.revoke();
```
- Parameter `editPagingGroupRequest` is of type [EditPagingGroupRequest](./src/main/java/com/ringcentral/definitions/EditPagingGroupRequest.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-assignMultiplePagingGroupUsersDevices) in API Explorer.


## Get Paging Group Devices

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/devices`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).devices().get(listPagingGroupDevicesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listPagingGroupDevicesParameters` is of type [ListPagingGroupDevicesParameters](./src/main/java/com/ringcentral/definitions/ListPagingGroupDevicesParameters.java)
- `result` is of type [PagingOnlyGroupDevices](./src/main/java/com/ringcentral/definitions/PagingOnlyGroupDevices.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-listPagingGroupDevices) in API Explorer.


## Get Paging Group Users

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/users`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).users().get(listPagingGroupUsersParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listPagingGroupUsersParameters` is of type [ListPagingGroupUsersParameters](./src/main/java/com/ringcentral/definitions/ListPagingGroupUsersParameters.java)
- `result` is of type [PagingOnlyGroupUsers](./src/main/java/com/ringcentral/definitions/PagingOnlyGroupUsers.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-listPagingGroupUsers) in API Explorer.


## Get Company Phone Number List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/phone-number`
Rate Limit Group|`Heavy`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyPhoneNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).phoneNumber().list(listAccountPhoneNumbersParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listAccountPhoneNumbersParameters` is of type [ListAccountPhoneNumbersParameters](./src/main/java/com/ringcentral/definitions/ListAccountPhoneNumbersParameters.java)
- `result` is of type [AccountPhoneNumbers](./src/main/java/com/ringcentral/definitions/AccountPhoneNumbers.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-listAccountPhoneNumbers) in API Explorer.


## Get Phone Number

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/phone-number/{phoneNumberId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyPhoneNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).phoneNumber(phoneNumberId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CompanyPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/CompanyPhoneNumberInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-readAccountPhoneNumber) in API Explorer.


## Get User Presence Status List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/presence`
Rate Limit Group|`Heavy`
App Permission|`ReadPresence`
User Permission|`ReadPresenceStatus`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).presence().get(readAccountPresenceParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readAccountPresenceParameters` is of type [ReadAccountPresenceParameters](./src/main/java/com/ringcentral/definitions/ReadAccountPresenceParameters.java)
- `result` is of type [AccountPresenceInfo](./src/main/java/com/ringcentral/definitions/AccountPresenceInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readAccountPresence) in API Explorer.


## Get Call Recording

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/recording/{recordingId}`
Rate Limit Group|`Heavy`
App Permission|`ReadCallRecording`
User Permission|`ReadCallRecording`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).recording(recordingId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetCallRecordingResponse](./src/main/java/com/ringcentral/definitions/GetCallRecordingResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recordings-readCallRecording) in API Explorer.


## Get Call Recordings Data

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/recording/{recordingId}/content`
Rate Limit Group|`Heavy`
App Permission|`ReadCallRecording`
User Permission|`ReadCallRecording`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).recording(recordingId).content().get(restRequestConfig);
rc.revoke();
```

- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recordings-listCallRecordingData) in API Explorer.

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).


## Get Account Service Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/service-info`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadServicePlanInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).serviceInfo().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetServiceInfoResponse](./src/main/java/com/ringcentral/definitions/GetServiceInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountServiceInfo) in API Explorer.


## Make CallOut

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/call-out`
Rate Limit Group|`Heavy`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().callOut().post(makeCallOutRequest, restRequestConfig);
rc.revoke();
```
- Parameter `makeCallOutRequest` is of type [MakeCallOutRequest](./src/main/java/com/ringcentral/definitions/MakeCallOutRequest.java)
- `result` is of type [CallSession](./src/main/java/com/ringcentral/definitions/CallSession.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-createCallOutCallSession) in API Explorer.


## Start Conference Call Session

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/conference`
Rate Limit Group|`Heavy`
App Permission|`TelephonySessions`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().conference().post(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallSessionObject](./src/main/java/com/ringcentral/definitions/CallSessionObject.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-createConferenceCallSession) in API Explorer.


## Get Call Session Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).get(readCallSessionStatusParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readCallSessionStatusParameters` is of type [ReadCallSessionStatusParameters](./src/main/java/com/ringcentral/definitions/ReadCallSessionStatusParameters.java)
- `result` is of type [CallSession](./src/main/java/com/ringcentral/definitions/CallSession.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-readCallSessionStatus) in API Explorer.


## Drop Call Session

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-deleteCallSession) in API Explorer.


## Bring-In Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/bring-in`
Rate Limit Group|`Light`
App Permission|`TelephonySessions`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties().bringIn().post(addPartyRequest, restRequestConfig);
rc.revoke();
```
- Parameter `addPartyRequest` is of type [AddPartyRequest](./src/main/java/com/ringcentral/definitions/AddPartyRequest.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-createCallPartyWithBringIn) in API Explorer.


## Get Call Party Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-readCallPartyStatus) in API Explorer.


## Delete Call Party

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}`
Rate Limit Group|`Light`
App Permission|`TelephonySessions`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-deleteCallParty) in API Explorer.


## Update Call Party

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).patch(partyUpdateRequest, restRequestConfig);
rc.revoke();
```
- Parameter `partyUpdateRequest` is of type [PartyUpdateRequest](./src/main/java/com/ringcentral/definitions/PartyUpdateRequest.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-updateCallParty) in API Explorer.


## Answer Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/answer`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).answer().post(answerTarget, restRequestConfig);
rc.revoke();
```
- Parameter `answerTarget` is of type [AnswerTarget](./src/main/java/com/ringcentral/definitions/AnswerTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-answerCallParty) in API Explorer.


## Bridge Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/bridge`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).bridge().post(bridgeTargetRequest, restRequestConfig);
rc.revoke();
```
- Parameter `bridgeTargetRequest` is of type [BridgeTargetRequest](./src/main/java/com/ringcentral/definitions/BridgeTargetRequest.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-bridgeCallParty) in API Explorer.


## Call Flip on Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/flip`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).flip().post(callPartyFlip, restRequestConfig);
rc.revoke();
```
- Parameter `callPartyFlip` is of type [CallPartyFlip](./src/main/java/com/ringcentral/definitions/CallPartyFlip.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-callFlipParty) in API Explorer.


## Forward Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/forward`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).forward().post(forwardTarget, restRequestConfig);
rc.revoke();
```
- Parameter `forwardTarget` is of type [ForwardTarget](./src/main/java/com/ringcentral/definitions/ForwardTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-forwardCallParty) in API Explorer.


## Hold Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/hold`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).hold().post(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-holdCallParty) in API Explorer.


## Ignore Call in Queue

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/ignore`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).ignore().post(ignoreRequestBody, restRequestConfig);
rc.revoke();
```
- Parameter `ignoreRequestBody` is of type [IgnoreRequestBody](./src/main/java/com/ringcentral/definitions/IgnoreRequestBody.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-ignoreCallInQueue) in API Explorer.


## Call Park

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/park`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).park().post(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-callParkParty) in API Explorer.


## Pickup Call

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/pickup`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).pickup().post(pickupTarget, restRequestConfig);
rc.revoke();
```
- Parameter `pickupTarget` is of type [PickupTarget](./src/main/java/com/ringcentral/definitions/PickupTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-pickupCallParty) in API Explorer.


## Create Recording

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).recordings().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-startCallRecording) in API Explorer.


## Pause/Resume Recording

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings/{recordingId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).recordings(recordingId).patch(callRecordingUpdate, pauseResumeCallRecordingParameters, restRequestConfig);
rc.revoke();
```
- Parameter `callRecordingUpdate` is of type [CallRecordingUpdate](./src/main/java/com/ringcentral/definitions/CallRecordingUpdate.java)
- Parameter `pauseResumeCallRecordingParameters` is of type [PauseResumeCallRecordingParameters](./src/main/java/com/ringcentral/definitions/PauseResumeCallRecordingParameters.java)
- `result` is of type [CallRecording](./src/main/java/com/ringcentral/definitions/CallRecording.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-pauseResumeCallRecording) in API Explorer.


## Reject Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reject`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).reject().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-rejectParty) in API Explorer.


## Reply with Text

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reply`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).reply().post(callPartyReply, restRequestConfig);
rc.revoke();
```
- Parameter `callPartyReply` is of type [CallPartyReply](./src/main/java/com/ringcentral/definitions/CallPartyReply.java)
- `result` is of type [ReplyParty](./src/main/java/com/ringcentral/definitions/ReplyParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-replyParty) in API Explorer.


## Supervise Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/supervise`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).supervise().post(partySuperviseRequest, restRequestConfig);
rc.revoke();
```
- Parameter `partySuperviseRequest` is of type [PartySuperviseRequest](./src/main/java/com/ringcentral/definitions/PartySuperviseRequest.java)
- `result` is of type [PartySuperviseResponse](./src/main/java/com/ringcentral/definitions/PartySuperviseResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-superviseCallParty) in API Explorer.


## Transfer Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/transfer`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).transfer().post(transferTarget, restRequestConfig);
rc.revoke();
```
- Parameter `transferTarget` is of type [TransferTarget](./src/main/java/com/ringcentral/definitions/TransferTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-transferCallParty) in API Explorer.


## Unhold Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/unhold`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).unhold().post(restRequestConfig);
rc.revoke();
```

- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-unholdCallParty) in API Explorer.


## Supervise Call Session

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/supervise`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).supervise().post(superviseCallSessionRequest, restRequestConfig);
rc.revoke();
```
- Parameter `superviseCallSessionRequest` is of type [SuperviseCallSessionRequest](./src/main/java/com/ringcentral/definitions/SuperviseCallSessionRequest.java)
- `result` is of type [SuperviseCallSession](./src/main/java/com/ringcentral/definitions/SuperviseCallSession.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-superviseCallSession) in API Explorer.


## Get User Template List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/templates`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).templates().list(listUserTemplatesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listUserTemplatesParameters` is of type [ListUserTemplatesParameters](./src/main/java/com/ringcentral/definitions/ListUserTemplatesParameters.java)
- `result` is of type [UserTemplates](./src/main/java/com/ringcentral/definitions/UserTemplates.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-listUserTemplates) in API Explorer.


## Get User Template

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/account/{accountId}/templates/{templateId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).account(accountId).templates(templateId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [TemplateInfo](./src/main/java/com/ringcentral/definitions/TemplateInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-readUserTemplate) in API Explorer.


## Register Device

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/client-info/sip-provision`
Rate Limit Group|`Heavy`
App Permission|`VoipCalling`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).clientInfo().sipProvision().post(createSipRegistrationRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createSipRegistrationRequest` is of type [CreateSipRegistrationRequest](./src/main/java/com/ringcentral/definitions/CreateSipRegistrationRequest.java)
- `result` is of type [CreateSipRegistrationResponse](./src/main/java/com/ringcentral/definitions/CreateSipRegistrationResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Device-SIP-Registration-createSIPRegistration) in API Explorer.


## Get Country List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/country`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().country().list(listCountriesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listCountriesParameters` is of type [ListCountriesParameters](./src/main/java/com/ringcentral/definitions/ListCountriesParameters.java)
- `result` is of type [GetCountryListResponse](./src/main/java/com/ringcentral/definitions/GetCountryListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listCountries) in API Explorer.


## Get Country

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/country/{countryId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().country(countryId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetCountryInfoDictionaryResponse](./src/main/java/com/ringcentral/definitions/GetCountryInfoDictionaryResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readCountry) in API Explorer.


## Get Fax Cover Page List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/fax-cover-page`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().faxCoverPage().get(listFaxCoverPagesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listFaxCoverPagesParameters` is of type [ListFaxCoverPagesParameters](./src/main/java/com/ringcentral/definitions/ListFaxCoverPagesParameters.java)
- `result` is of type [ListFaxCoverPagesResponse](./src/main/java/com/ringcentral/definitions/ListFaxCoverPagesResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Fax-listFaxCoverPages) in API Explorer.


## Get Standard Greeting List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/greeting`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().greeting().list(listStandardGreetingsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listStandardGreetingsParameters` is of type [ListStandardGreetingsParameters](./src/main/java/com/ringcentral/definitions/ListStandardGreetingsParameters.java)
- `result` is of type [DictionaryGreetingList](./src/main/java/com/ringcentral/definitions/DictionaryGreetingList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-listStandardGreetings) in API Explorer.


## Get Standard Greeting

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/greeting/{greetingId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().greeting(greetingId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [DictionaryGreetingInfo](./src/main/java/com/ringcentral/definitions/DictionaryGreetingInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-readStandardGreeting) in API Explorer.


## Get Language List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/language`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().language().list(restRequestConfig);
rc.revoke();
```

- `result` is of type [LanguageList](./src/main/java/com/ringcentral/definitions/LanguageList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLanguages) in API Explorer.


## Get Language

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/language/{languageId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().language(languageId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [LanguageInfo](./src/main/java/com/ringcentral/definitions/LanguageInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readLanguage) in API Explorer.


## Get Location List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/location`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().location().get(listLocationsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listLocationsParameters` is of type [ListLocationsParameters](./src/main/java/com/ringcentral/definitions/ListLocationsParameters.java)
- `result` is of type [GetLocationListResponse](./src/main/java/com/ringcentral/definitions/GetLocationListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLocations) in API Explorer.


## Get States List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/state`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().state().list(listStatesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listStatesParameters` is of type [ListStatesParameters](./src/main/java/com/ringcentral/definitions/ListStatesParameters.java)
- `result` is of type [GetStateListResponse](./src/main/java/com/ringcentral/definitions/GetStateListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listStates) in API Explorer.


## Get State

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/state/{stateId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().state(stateId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetStateInfoResponse](./src/main/java/com/ringcentral/definitions/GetStateInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readState) in API Explorer.


## Get Timezone List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/timezone`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().timezone().list(listTimezonesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listTimezonesParameters` is of type [ListTimezonesParameters](./src/main/java/com/ringcentral/definitions/ListTimezonesParameters.java)
- `result` is of type [GetTimezoneListResponse](./src/main/java/com/ringcentral/definitions/GetTimezoneListResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listTimezones) in API Explorer.


## Get Timezone

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/dictionary/timezone/{timezoneId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).dictionary().timezone(timezoneId).get(readTimezoneParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readTimezoneParameters` is of type [ReadTimezoneParameters](./src/main/java/com/ringcentral/definitions/ReadTimezoneParameters.java)
- `result` is of type [GetTimezoneInfoResponse](./src/main/java/com/ringcentral/definitions/GetTimezoneInfoResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readTimezone) in API Explorer.


## Get Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/chats`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats().list(listGlipChatsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listGlipChatsParameters` is of type [ListGlipChatsParameters](./src/main/java/com/ringcentral/definitions/ListGlipChatsParameters.java)
- `result` is of type [GlipChatsList](./src/main/java/com/ringcentral/definitions/GlipChatsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipChats) in API Explorer.


## Get Chat

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipChatInfo](./src/main/java/com/ringcentral/definitions/GlipChatInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipChat) in API Explorer.


## Add Chat to Favorites

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/favorite`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).favorite().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-favoriteGlipChat) in API Explorer.


## Create Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/notes`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).notes().post(glipNoteCreate, restRequestConfig);
rc.revoke();
```
- Parameter `glipNoteCreate` is of type [GlipNoteCreate](./src/main/java/com/ringcentral/definitions/GlipNoteCreate.java)
- `result` is of type [GlipNoteInfo](./src/main/java/com/ringcentral/definitions/GlipNoteInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-createChatNote) in API Explorer.


## Get Chat Notes

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/notes`
Rate Limit Group|`Heavy`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).notes().get(listChatNotesParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listChatNotesParameters` is of type [ListChatNotesParameters](./src/main/java/com/ringcentral/definitions/ListChatNotesParameters.java)
- `result` is of type [GlipNotesInfo](./src/main/java/com/ringcentral/definitions/GlipNotesInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-listChatNotes) in API Explorer.


## Get Posts

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/posts`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).posts().list(readGlipPostsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readGlipPostsParameters` is of type [ReadGlipPostsParameters](./src/main/java/com/ringcentral/definitions/ReadGlipPostsParameters.java)
- `result` is of type [GlipPostsList](./src/main/java/com/ringcentral/definitions/GlipPostsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPosts) in API Explorer.


## Create Post

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/posts`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).posts().post(glipPostPostBody, restRequestConfig);
rc.revoke();
```
- Parameter `glipPostPostBody` is of type [GlipPostPostBody](./src/main/java/com/ringcentral/definitions/GlipPostPostBody.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipPost) in API Explorer.


## Get Post

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPost) in API Explorer.


## Update Post

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).patch(glipPatchPostBody, restRequestConfig);
rc.revoke();
```
- Parameter `glipPatchPostBody` is of type [GlipPatchPostBody](./src/main/java/com/ringcentral/definitions/GlipPatchPostBody.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-patchGlipPost) in API Explorer.


## Delete Post

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-deleteGlipPost) in API Explorer.


## Mark Chat as Read

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/read`
Rate Limit Group|`Medium`
App Permission|`GlipInternal`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).read().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatRead) in API Explorer.


## Get Chat Tasks

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/tasks`
Rate Limit Group|`Heavy`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).tasks().get(listChatTasksParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listChatTasksParameters` is of type [ListChatTasksParameters](./src/main/java/com/ringcentral/definitions/ListChatTasksParameters.java)
- `result` is of type [GlipTaskList](./src/main/java/com/ringcentral/definitions/GlipTaskList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-listChatTasks) in API Explorer.


## Create Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/tasks`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).tasks().post(glipCreateTask, restRequestConfig);
rc.revoke();
```
- Parameter `glipCreateTask` is of type [GlipCreateTask](./src/main/java/com/ringcentral/definitions/GlipCreateTask.java)
- `result` is of type [GlipTaskInfo](./src/main/java/com/ringcentral/definitions/GlipTaskInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-createTask) in API Explorer.


## Remove Chat from Favorites

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/unfavorite`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).unfavorite().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-unfavoriteGlipChat) in API Explorer.


## Mark Chat as Unread

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/chats/{chatId}/unread`
Rate Limit Group|`Medium`
App Permission|`GlipInternal`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().chats(chatId).unread().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatUnread) in API Explorer.


## Get Company Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/companies/{companyId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().companies(companyId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipCompany](./src/main/java/com/ringcentral/definitions/GlipCompany.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipCompany) in API Explorer.


## Get Conversations

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/conversations`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().conversations().list(listGlipConversationsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listGlipConversationsParameters` is of type [ListGlipConversationsParameters](./src/main/java/com/ringcentral/definitions/ListGlipConversationsParameters.java)
- `result` is of type [GlipConversationsList](./src/main/java/com/ringcentral/definitions/GlipConversationsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-listGlipConversations) in API Explorer.


## Create/Open Conversation

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/conversations`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().conversations().post(createGlipConversationRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createGlipConversationRequest` is of type [CreateGlipConversationRequest](./src/main/java/com/ringcentral/definitions/CreateGlipConversationRequest.java)
- `result` is of type [GlipConversationInfo](./src/main/java/com/ringcentral/definitions/GlipConversationInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-createGlipConversation) in API Explorer.


## Get Conversation

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/conversations/{chatId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().conversations(chatId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipConversationInfo](./src/main/java/com/ringcentral/definitions/GlipConversationInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-readGlipConversation) in API Explorer.


## Create Data Export Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/data-export`
Rate Limit Group|`Heavy`
App Permission|`Glip`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().dataExport().post(createDataExportTaskRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createDataExportTaskRequest` is of type [CreateDataExportTaskRequest](./src/main/java/com/ringcentral/definitions/CreateDataExportTaskRequest.java)
- `result` is of type [DataExportTask](./src/main/java/com/ringcentral/definitions/DataExportTask.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-createDataExportTask) in API Explorer.


## Get Data Export Task List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/data-export`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().dataExport().list(listDataExportTasksParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listDataExportTasksParameters` is of type [ListDataExportTasksParameters](./src/main/java/com/ringcentral/definitions/ListDataExportTasksParameters.java)
- `result` is of type [DataExportTaskList](./src/main/java/com/ringcentral/definitions/DataExportTaskList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-listDataExportTasks) in API Explorer.


## Get Data Export Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/data-export/{taskId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().dataExport(taskId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [DataExportTask](./src/main/java/com/ringcentral/definitions/DataExportTask.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-readDataExportTask) in API Explorer.


## Get Data Export Task Dataset

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/data-export/{taskId}/datasets/{datasetId}`
Rate Limit Group|`Heavy`
App Permission|`Glip`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().dataExport(taskId).datasets(datasetId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type `byte[]`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-readDataExportTaskDataset) in API Explorer.

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).


## Get User Events List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/events`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().events().list(readGlipEventsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `readGlipEventsParameters` is of type [ReadGlipEventsParameters](./src/main/java/com/ringcentral/definitions/ReadGlipEventsParameters.java)
- `result` is of type [GlipEventsInfo](./src/main/java/com/ringcentral/definitions/GlipEventsInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-readGlipEvents) in API Explorer.


## Create Event

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/events`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().events().post(glipEventCreate, restRequestConfig);
rc.revoke();
```
- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-createEvent) in API Explorer.


## Get Event

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().events(eventId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-readEvent) in API Explorer.


## Update Event

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/glip/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().events(eventId).put(glipEventCreate, restRequestConfig);
rc.revoke();
```
- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-updateEvent) in API Explorer.


## Delete Event

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/glip/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().events(eventId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-deleteEvent) in API Explorer.


## Get Everyone Chat

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/everyone`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().everyone().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipEveryoneInfo](./src/main/java/com/ringcentral/definitions/GlipEveryoneInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-readGlipEveryone) in API Explorer.


## Update Everyone Сhat

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/glip/everyone`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().everyone().patch(updateGlipEveryoneRequest, restRequestConfig);
rc.revoke();
```
- Parameter `updateGlipEveryoneRequest` is of type [UpdateGlipEveryoneRequest](./src/main/java/com/ringcentral/definitions/UpdateGlipEveryoneRequest.java)
- `result` is of type [GlipEveryoneInfo](./src/main/java/com/ringcentral/definitions/GlipEveryoneInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-patchGlipEveryone) in API Explorer.


## Get Favorite Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/favorites`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().favorites().get(listFavoriteChatsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listFavoriteChatsParameters` is of type [ListFavoriteChatsParameters](./src/main/java/com/ringcentral/definitions/ListFavoriteChatsParameters.java)
- `result` is of type [GlipChatsListWithoutNavigation](./src/main/java/com/ringcentral/definitions/GlipChatsListWithoutNavigation.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listFavoriteChats) in API Explorer.


## Create Event by Group ID

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/groups/{groupId}/events`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().groups(groupId).events().post(glipEventCreate, restRequestConfig);
rc.revoke();
```
- Parameter `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-createEventbyGroupId) in API Explorer.


## Get Group Events

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/groups/{groupId}/events`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().groups(groupId).events().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-listGroupEvents) in API Explorer.


## Create Post in Group

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/groups/{groupId}/posts`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().groups(groupId).posts().post(glipCreatePost, restRequestConfig);
rc.revoke();
```
- Parameter `glipCreatePost` is of type [GlipCreatePost](./src/main/java/com/ringcentral/definitions/GlipCreatePost.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipGroupPost) in API Explorer.


## Create Webhook in Group

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/groups/{groupId}/webhooks`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().groups(groupId).webhooks().post(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipWebhookInfo](./src/main/java/com/ringcentral/definitions/GlipWebhookInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-createGlipGroupWebhook) in API Explorer.


## Get Webhooks in Group

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/groups/{groupId}/webhooks`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().groups(groupId).webhooks().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-listGlipGroupWebhooks) in API Explorer.


## Get Note

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().notes(noteId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GetGlipNoteInfo](./src/main/java/com/ringcentral/definitions/GetGlipNoteInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-readUserNote) in API Explorer.


## Update Note

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/glip/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().notes(noteId).patch(glipNoteCreate, restRequestConfig);
rc.revoke();
```
- Parameter `glipNoteCreate` is of type [GlipNoteCreate](./src/main/java/com/ringcentral/definitions/GlipNoteCreate.java)
- `result` is of type [GlipNoteInfo](./src/main/java/com/ringcentral/definitions/GlipNoteInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-patchNote) in API Explorer.


## Delete Note

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/glip/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().notes(noteId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-deleteNote) in API Explorer.


## Lock Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/notes/{noteId}/lock`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().notes(noteId).lock().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-lockNote) in API Explorer.


## Publish Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/notes/{noteId}/publish`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().notes(noteId).publish().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-publishNote) in API Explorer.


## Unlock Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/notes/{noteId}/unlock`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().notes(noteId).unlock().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Notes-unlockNote) in API Explorer.


## Get Person

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/persons/{personId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().persons(personId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipPersonInfo](./src/main/java/com/ringcentral/definitions/GlipPersonInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipPerson) in API Explorer.


## Get Preferences

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/preferences`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().preferences().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipPreferencesInfo](./src/main/java/com/ringcentral/definitions/GlipPreferencesInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipPreferences) in API Explorer.


## Get Recent Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/recent/chats`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().recent().chats().get(listRecentChatsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listRecentChatsParameters` is of type [ListRecentChatsParameters](./src/main/java/com/ringcentral/definitions/ListRecentChatsParameters.java)
- `result` is of type [GlipChatsListWithoutNavigation](./src/main/java/com/ringcentral/definitions/GlipChatsListWithoutNavigation.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listRecentChats) in API Explorer.


## Get Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().tasks(taskId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipTaskInfo](./src/main/java/com/ringcentral/definitions/GlipTaskInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-readTask) in API Explorer.


## Patch Task

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/glip/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().tasks(taskId).patch(glipUpdateTask, restRequestConfig);
rc.revoke();
```
- Parameter `glipUpdateTask` is of type [GlipUpdateTask](./src/main/java/com/ringcentral/definitions/GlipUpdateTask.java)
- `result` is of type [GlipTaskList](./src/main/java/com/ringcentral/definitions/GlipTaskList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-patchTask) in API Explorer.


## Delete Task

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/glip/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().tasks(taskId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-deleteTask) in API Explorer.


## Complete Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/tasks/{taskId}/complete`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().tasks(taskId).complete().post(glipCompleteTask, restRequestConfig);
rc.revoke();
```
- Parameter `glipCompleteTask` is of type [GlipCompleteTask](./src/main/java/com/ringcentral/definitions/GlipCompleteTask.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-completeTask) in API Explorer.


## Get Teams

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/teams`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams().list(listGlipTeamsParameters, restRequestConfig);
rc.revoke();
```
- Parameter `listGlipTeamsParameters` is of type [ListGlipTeamsParameters](./src/main/java/com/ringcentral/definitions/ListGlipTeamsParameters.java)
- `result` is of type [GlipTeamsList](./src/main/java/com/ringcentral/definitions/GlipTeamsList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-listGlipTeams) in API Explorer.


## Create Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/teams`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams().post(glipPostTeamBody, restRequestConfig);
rc.revoke();
```
- Parameter `glipPostTeamBody` is of type [GlipPostTeamBody](./src/main/java/com/ringcentral/definitions/GlipPostTeamBody.java)
- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-createGlipTeam) in API Explorer.


## Get Team

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-readGlipTeam) in API Explorer.


## Update Team

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).patch(glipPatchTeamBody, restRequestConfig);
rc.revoke();
```
- Parameter `glipPatchTeamBody` is of type [GlipPatchTeamBody](./src/main/java/com/ringcentral/definitions/GlipPatchTeamBody.java)
- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-patchGlipTeam) in API Explorer.


## Delete Team

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-deleteGlipTeam) in API Explorer.


## Add Team Members

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}/add`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).add().post(glipPostMembersListBody, restRequestConfig);
rc.revoke();
```
- Parameter `glipPostMembersListBody` is of type [GlipPostMembersListBody](./src/main/java/com/ringcentral/definitions/GlipPostMembersListBody.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-addGlipTeamMembers) in API Explorer.


## Archive Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}/archive`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).archive().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-archiveGlipTeam) in API Explorer.


## Join Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}/join`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).join().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-joinGlipTeam) in API Explorer.


## Leave Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}/leave`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).leave().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-leaveGlipTeam) in API Explorer.


## Remove Team Members

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}/remove`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).remove().post(glipPostMembersIdsListBody, restRequestConfig);
rc.revoke();
```
- Parameter `glipPostMembersIdsListBody` is of type [GlipPostMembersIdsListBody](./src/main/java/com/ringcentral/definitions/GlipPostMembersIdsListBody.java)
- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-removeGlipTeamMembers) in API Explorer.


## Unarchive Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/teams/{chatId}/unarchive`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().teams(chatId).unarchive().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Teams-unarchiveGlipTeam) in API Explorer.


## Get Webhooks

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/webhooks`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().webhooks().list(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-listGlipWebhooks) in API Explorer.


## Get Webhook

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/glip/webhooks/{webhookId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().webhooks(webhookId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-readGlipWebhook) in API Explorer.


## Delete Webhook

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/glip/webhooks/{webhookId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().webhooks(webhookId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-deleteGlipWebhook) in API Explorer.


## Activate Webhook

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/webhooks/{webhookId}/activate`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().webhooks(webhookId).activate().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-activateGlipWebhook) in API Explorer.


## Suspend Webhook

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/glip/webhooks/{webhookId}/suspend`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).glip().webhooks(webhookId).suspend().post(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-suspendGlipWebhook) in API Explorer.


## Parse Phone Number

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/number-parser/parse`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).numberParser().parse().post(parsePhoneNumberRequest, parsePhoneNumberParameters, restRequestConfig);
rc.revoke();
```
- Parameter `parsePhoneNumberRequest` is of type [ParsePhoneNumberRequest](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberRequest.java)
- Parameter `parsePhoneNumberParameters` is of type [ParsePhoneNumberParameters](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberParameters.java)
- `result` is of type [ParsePhoneNumberResponse](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-parsePhoneNumber) in API Explorer.


## Get Subscription List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/subscription`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).subscription().list(restRequestConfig);
rc.revoke();
```

- `result` is of type [RecordsCollectionResourceSubscriptionResponse](./src/main/java/com/ringcentral/definitions/RecordsCollectionResourceSubscriptionResponse.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-listSubscriptions) in API Explorer.


## Create Subscription

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/subscription`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).subscription().post(createSubscriptionRequest, restRequestConfig);
rc.revoke();
```
- Parameter `createSubscriptionRequest` is of type [CreateSubscriptionRequest](./src/main/java/com/ringcentral/definitions/CreateSubscriptionRequest.java)
- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-createSubscription) in API Explorer.


## Get Subscription

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/v1.0/subscription/{subscriptionId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).subscription(subscriptionId).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-readSubscription) in API Explorer.


## Update Subscription

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/v1.0/subscription/{subscriptionId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).subscription(subscriptionId).put(modifySubscriptionRequest, updateSubscriptionParameters, restRequestConfig);
rc.revoke();
```
- Parameter `modifySubscriptionRequest` is of type [ModifySubscriptionRequest](./src/main/java/com/ringcentral/definitions/ModifySubscriptionRequest.java)
- Parameter `updateSubscriptionParameters` is of type [UpdateSubscriptionParameters](./src/main/java/com/ringcentral/definitions/UpdateSubscriptionParameters.java)
- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-updateSubscription) in API Explorer.


## Cancel Subscription

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/v1.0/subscription/{subscriptionId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).subscription(subscriptionId).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-deleteSubscription) in API Explorer.


## Renew Subscription

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/v1.0/subscription/{subscriptionId}/renew`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.restapi(apiVersion).subscription(subscriptionId).renew().post(restRequestConfig);
rc.revoke();
```

- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)
- Parameter `apiVersion` is optional with default value `v1.0`

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-renewSubscription) in API Explorer.


## Get Service Provider Config

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/v2/ServiceProviderConfig`
Rate Limit Group|`NoThrottling`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).serviceProviderConfig().get(restRequestConfig);
rc.revoke();
```

- `result` is of type [ServiceProviderConfig](./src/main/java/com/ringcentral/definitions/ServiceProviderConfig.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-readServiceProviderConfig2) in API Explorer.


## Search/List Users

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/v2/Users`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).users().list(searchViaGet2Parameters, restRequestConfig);
rc.revoke();
```
- Parameter `searchViaGet2Parameters` is of type [SearchViaGet2Parameters](./src/main/java/com/ringcentral/definitions/SearchViaGet2Parameters.java)
- `result` is of type [UserSearchResponse](./src/main/java/com/ringcentral/definitions/UserSearchResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-searchViaGet2) in API Explorer.


## Create User

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/scim/v2/Users`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).users().post(createUser, restRequestConfig);
rc.revoke();
```
- Parameter `createUser` is of type [CreateUser](./src/main/java/com/ringcentral/definitions/CreateUser.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-createUser2) in API Explorer.


## Search/List Users

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/scim/v2/Users/.search`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).users().dotSearch().post(searchRequest, restRequestConfig);
rc.revoke();
```
- Parameter `searchRequest` is of type [SearchRequest](./src/main/java/com/ringcentral/definitions/SearchRequest.java)
- `result` is of type [UserSearchResponse](./src/main/java/com/ringcentral/definitions/UserSearchResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-searchViaPost2) in API Explorer.


## Get User

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/v2/Users/{id}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).users(id).get(restRequestConfig);
rc.revoke();
```

- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-readUser2) in API Explorer.


## Update/Replace User

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/scim/v2/Users/{id}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).users(id).put(user, restRequestConfig);
rc.revoke();
```
- Parameter `user` is of type [User](./src/main/java/com/ringcentral/definitions/User.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-replaceUser2) in API Explorer.


## Delete User

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/scim/v2/Users/{id}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).users(id).delete(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-deleteUser2) in API Explorer.


## Update/Patch User

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/scim/v2/Users/{id}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).users(id).patch(userPatch, restRequestConfig);
rc.revoke();
```
- Parameter `userPatch` is of type [UserPatch](./src/main/java/com/ringcentral/definitions/UserPatch.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-patchUser2) in API Explorer.


## Check Health

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/v2/health`
Rate Limit Group|`NoThrottling`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
var result = rc.scim(version).health().get(restRequestConfig);
rc.revoke();
```

- `result` is `null`
- Parameter `version` is optional with default value `v2`

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-checkHealth2) in API Explorer.