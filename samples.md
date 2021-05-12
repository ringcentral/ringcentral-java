# RingCentral Java SDK Code Samples


## readAPIVersions
Get API Versions

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
GetVersionsResponse result = rc.restapi().list();
rc.revoke();
```

- `result` is of type [GetVersionsResponse](./src/main/java/com/ringcentral/definitions/GetVersionsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersions) in API Explorer.


## readAPIVersion
Get Version Info

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
GetVersionResponse result = rc.restapi(apiVersion).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GetVersionResponse](./src/main/java/com/ringcentral/definitions/GetVersionResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersion) in API Explorer.


## searchViaGet2
Search/List Users

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/Users`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserSearchResponse result = rc.scim(version).users().list(searchViaGet2Parameters);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `searchViaGet2Parameters` is of type [SearchViaGet2Parameters](./src/main/java/com/ringcentral/definitions/SearchViaGet2Parameters.java)
- `result` is of type [UserSearchResponse](./src/main/java/com/ringcentral/definitions/UserSearchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-searchViaGet2) in API Explorer.


## createUser2
Create User

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/scim/{version}/Users`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserResponse result = rc.scim(version).users().post(createUser);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `createUser` is of type [CreateUser](./src/main/java/com/ringcentral/definitions/CreateUser.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-createUser2) in API Explorer.


## readUser2
Get User

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/Users/{id}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserResponse result = rc.scim(version).users(id).get();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-readUser2) in API Explorer.


## replaceUser2
Update/Replace User

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/scim/{version}/Users/{id}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserResponse result = rc.scim(version).users(id).put(user);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `user` is of type [User](./src/main/java/com/ringcentral/definitions/User.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-replaceUser2) in API Explorer.


## deleteUser2
Delete User

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/scim/{version}/Users/{id}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.scim(version).users(id).delete();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-deleteUser2) in API Explorer.


## patchUser2
Update/Patch User

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/scim/{version}/Users/{id}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserResponse result = rc.scim(version).users(id).patch(userPatch);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `userPatch` is of type [UserPatch](./src/main/java/com/ringcentral/definitions/UserPatch.java)
- `result` is of type [UserResponse](./src/main/java/com/ringcentral/definitions/UserResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-patchUser2) in API Explorer.


## authorize
Authorize

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/oauth/authorize`
Rate Limit Group|`undefined`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi().oauth().authorize().post(authorizeRequest);
rc.revoke();
```

- `authorizeRequest` is of type [AuthorizeRequest](./src/main/java/com/ringcentral/definitions/AuthorizeRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#OAuth-2.0-authorize) in API Explorer.


## getToken
Get Token

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
TokenInfo result = rc.restapi().oauth().token().post(getTokenRequest);
rc.revoke();
```

- `getTokenRequest` is of type [GetTokenRequest](./src/main/java/com/ringcentral/definitions/GetTokenRequest.java)
- `result` is of type [TokenInfo](./src/main/java/com/ringcentral/definitions/TokenInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#OAuth-2.0-getToken) in API Explorer.


## readAccountInfo
Get Account Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetAccountInfoResponse result = rc.restapi(apiVersion).account(accountId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [GetAccountInfoResponse](./src/main/java/com/ringcentral/definitions/GetAccountInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountInfo) in API Explorer.


## revokeToken
Revoke Token

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
String result = rc.restapi().oauth().revoke().post(revokeTokenRequest);
rc.revoke();
```

- `revokeTokenRequest` is of type [RevokeTokenRequest](./src/main/java/com/ringcentral/definitions/RevokeTokenRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#OAuth-2.0-revokeToken) in API Explorer.


## createA2PSMS
Send A2P SMS

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/batch`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CreateMessageBatchResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().batch().post(createSMSMessageBatchRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createSMSMessageBatchRequest` is of type [CreateSMSMessageBatchRequest](./src/main/java/com/ringcentral/definitions/CreateSMSMessageBatchRequest.java)
- `result` is of type [CreateMessageBatchResponse](./src/main/java/com/ringcentral/definitions/CreateMessageBatchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-createA2PSMS) in API Explorer.


## readA2PBatch
Get A2P SMS Batch

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/batch/{batchId}`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageBatchResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().batch(batchId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [MessageBatchResponse](./src/main/java/com/ringcentral/definitions/MessageBatchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-readA2PBatch) in API Explorer.


## listA2PSMS
Get A2P SMS List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/messages`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageListResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().messages().list(listA2PSMSParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listA2PSMSParameters` is of type [ListA2PSMSParameters](./src/main/java/com/ringcentral/definitions/ListA2PSMSParameters.java)
- `result` is of type [MessageListResponse](./src/main/java/com/ringcentral/definitions/MessageListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-listA2PSMS) in API Explorer.


## readA2PSMS
Get A2P SMS

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/messages/{messageId}`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageDetailsResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().messages(messageId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [MessageDetailsResponse](./src/main/java/com/ringcentral/definitions/MessageDetailsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-readA2PSMS) in API Explorer.


## readA2PSMSOptOuts
Get Opted Out Numbers

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/opt-outs`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
OptOutListResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().optOuts().get(readA2PSMSOptOutsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `readA2PSMSOptOutsParameters` is of type [ReadA2PSMSOptOutsParameters](./src/main/java/com/ringcentral/definitions/ReadA2PSMSOptOutsParameters.java)
- `result` is of type [OptOutListResponse](./src/main/java/com/ringcentral/definitions/OptOutListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-readA2PSMSOptOuts) in API Explorer.


## listCompanyActiveCalls
Get Company Active Calls

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/active-calls`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyActiveCallsResponse result = rc.restapi(apiVersion).account(accountId).activeCalls().get(listCompanyActiveCallsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listCompanyActiveCallsParameters` is of type [ListCompanyActiveCallsParameters](./src/main/java/com/ringcentral/definitions/ListCompanyActiveCallsParameters.java)
- `result` is of type [CompanyActiveCallsResponse](./src/main/java/com/ringcentral/definitions/CompanyActiveCallsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listCompanyActiveCalls) in API Explorer.


## listCompanyAnsweringRules
Get Company Call Handling Rule List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/answering-rule`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyAnsweringRuleList result = rc.restapi(apiVersion).account(accountId).answeringRule().list(listCompanyAnsweringRulesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listCompanyAnsweringRulesParameters` is of type [ListCompanyAnsweringRulesParameters](./src/main/java/com/ringcentral/definitions/ListCompanyAnsweringRulesParameters.java)
- `result` is of type [CompanyAnsweringRuleList](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-listCompanyAnsweringRules) in API Explorer.


## createCompanyAnsweringRule
Create Company Call Handling Rule

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/answering-rule`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyAnsweringRuleInfo result = rc.restapi(apiVersion).account(accountId).answeringRule().post(companyAnsweringRuleRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `companyAnsweringRuleRequest` is of type [CompanyAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleRequest.java)
- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-createCompanyAnsweringRule) in API Explorer.


## readCompanyAnsweringRule
Get Company Call Handling Rule

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/answering-rule/{ruleId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyAnsweringRuleInfo result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-readCompanyAnsweringRule) in API Explorer.


## updateCompanyAnsweringRule
Update Company Call Handling Rule

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/answering-rule/{ruleId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyAnsweringRuleInfo result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).put(companyAnsweringRuleUpdate);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `companyAnsweringRuleUpdate` is of type [CompanyAnsweringRuleUpdate](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleUpdate.java)
- `result` is of type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-updateCompanyAnsweringRule) in API Explorer.


## deleteCompanyAnsweringRule
Delete Company Call Handling Rule

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/answering-rule/{ruleId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).answeringRule(ruleId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-deleteCompanyAnsweringRule) in API Explorer.


## readAccountBusinessAddress
Get Account Business Address

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/business-address`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AccountBusinessAddressResource result = rc.restapi(apiVersion).account(accountId).businessAddress().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [AccountBusinessAddressResource](./src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountBusinessAddress) in API Explorer.


## updateAccountBusinessAddress
Update Company Business Address

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/business-address`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AccountBusinessAddressResource result = rc.restapi(apiVersion).account(accountId).businessAddress().put(modifyAccountBusinessAddressRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `modifyAccountBusinessAddressRequest` is of type [ModifyAccountBusinessAddressRequest](./src/main/java/com/ringcentral/definitions/ModifyAccountBusinessAddressRequest.java)
- `result` is of type [AccountBusinessAddressResource](./src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Company-updateAccountBusinessAddress) in API Explorer.


## readCompanyBusinessHours
Get Company Business Hours

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/business-hours`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyBusinessHours result = rc.restapi(apiVersion).account(accountId).businessHours().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CompanyBusinessHours](./src/main/java/com/ringcentral/definitions/CompanyBusinessHours.java)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-readCompanyBusinessHours) in API Explorer.


## updateCompanyBusinessHours
Update Company Business Hours

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/business-hours`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyBusinessHours result = rc.restapi(apiVersion).account(accountId).businessHours().put(companyBusinessHoursUpdateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `companyBusinessHoursUpdateRequest` is of type [CompanyBusinessHoursUpdateRequest](./src/main/java/com/ringcentral/definitions/CompanyBusinessHoursUpdateRequest.java)
- `result` is of type [CompanyBusinessHours](./src/main/java/com/ringcentral/definitions/CompanyBusinessHours.java)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateCompanyBusinessHours) in API Explorer.


## readCompanyCallLog
Get Company Call Log Records

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-log`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`FullCompanyCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AccountCallLogResponse result = rc.restapi(apiVersion).account(accountId).callLog().list(readCompanyCallLogParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `readCompanyCallLogParameters` is of type [ReadCompanyCallLogParameters](./src/main/java/com/ringcentral/definitions/ReadCompanyCallLogParameters.java)
- `result` is of type [AccountCallLogResponse](./src/main/java/com/ringcentral/definitions/AccountCallLogResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallLog) in API Explorer.


## readCompanyCallRecord
Get Company Call Log Record(s)

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-log/{callRecordId}`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`FullCompanyCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyCallLogRecord result = rc.restapi(apiVersion).account(accountId).callLog(callRecordId).get(readCompanyCallRecordParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `readCompanyCallRecordParameters` is of type [ReadCompanyCallRecordParameters](./src/main/java/com/ringcentral/definitions/ReadCompanyCallRecordParameters.java)
- `result` is of type [CompanyCallLogRecord](./src/main/java/com/ringcentral/definitions/CompanyCallLogRecord.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallRecord) in API Explorer.


## syncAccountCallLog
Sync Company Call Log

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-log-sync`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AccountCallLogSyncResponse result = rc.restapi(apiVersion).account(accountId).callLogSync().get(syncAccountCallLogParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `syncAccountCallLogParameters` is of type [SyncAccountCallLogParameters](./src/main/java/com/ringcentral/definitions/SyncAccountCallLogParameters.java)
- `result` is of type [AccountCallLogSyncResponse](./src/main/java/com/ringcentral/definitions/AccountCallLogSyncResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncAccountCallLog) in API Explorer.


## listCallQueues
Get Call Queue List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-queues`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallQueues result = rc.restapi(apiVersion).account(accountId).callQueues().list(listCallQueuesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listCallQueuesParameters` is of type [ListCallQueuesParameters](./src/main/java/com/ringcentral/definitions/ListCallQueuesParameters.java)
- `result` is of type [CallQueues](./src/main/java/com/ringcentral/definitions/CallQueues.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listCallQueues) in API Explorer.


## readCallQueueInfo
Get Call Queue

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallQueueDetails result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallQueueDetails](./src/main/java/com/ringcentral/definitions/CallQueueDetails.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-readCallQueueInfo) in API Explorer.


## updateCallQueueInfo
Update Call Queue

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}`
Rate Limit Group|`Light`
App Permission|`EditExtensions`
User Permission|`EditUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallQueueDetails result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).put(callQueueUpdateDetails);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callQueueUpdateDetails` is of type [CallQueueUpdateDetails](./src/main/java/com/ringcentral/definitions/CallQueueUpdateDetails.java)
- `result` is of type [CallQueueDetails](./src/main/java/com/ringcentral/definitions/CallQueueDetails.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-updateCallQueueInfo) in API Explorer.


## readCallRecordingSettings
Get Call Recording Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-recording`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallRecordingSettingsResource result = rc.restapi(apiVersion).account(accountId).callRecording().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-readCallRecordingSettings) in API Explorer.


## updateCallRecordingSettings
Update Call Recording Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-recording`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallRecordingSettingsResource result = rc.restapi(apiVersion).account(accountId).callRecording().put(callRecordingSettingsResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callRecordingSettingsResource` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)
- `result` is of type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-updateCallRecordingSettings) in API Explorer.


## listCustomFields
Get Custom Field List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/custom-fields`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CustomFieldsResource result = rc.restapi(apiVersion).account(accountId).customFields().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CustomFieldsResource](./src/main/java/com/ringcentral/definitions/CustomFieldsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-listCustomFields) in API Explorer.


## createCustomField
Create Custom Field

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/custom-fields`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CustomFieldResource result = rc.restapi(apiVersion).account(accountId).customFields().post(customFieldCreateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `customFieldCreateRequest` is of type [CustomFieldCreateRequest](./src/main/java/com/ringcentral/definitions/CustomFieldCreateRequest.java)
- `result` is of type [CustomFieldResource](./src/main/java/com/ringcentral/definitions/CustomFieldResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-createCustomField) in API Explorer.


## updateCustomField
Update Сustom Field

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/custom-fields/{fieldId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CustomFieldResource result = rc.restapi(apiVersion).account(accountId).customFields(fieldId).put(customFieldUpdateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `customFieldUpdateRequest` is of type [CustomFieldUpdateRequest](./src/main/java/com/ringcentral/definitions/CustomFieldUpdateRequest.java)
- `result` is of type [CustomFieldResource](./src/main/java/com/ringcentral/definitions/CustomFieldResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-updateCustomField) in API Explorer.


## deleteCustomField
Delete Custom Field

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/custom-fields/{fieldId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).customFields(fieldId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-deleteCustomField) in API Explorer.


## readDevice
Get Device

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/device/{deviceId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetDeviceInfoResponse result = rc.restapi(apiVersion).account(accountId).device(deviceId).get(readDeviceParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `readDeviceParameters` is of type [ReadDeviceParameters](./src/main/java/com/ringcentral/definitions/ReadDeviceParameters.java)
- `result` is of type [GetDeviceInfoResponse](./src/main/java/com/ringcentral/definitions/GetDeviceInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-readDevice) in API Explorer.


## updateDevice
Update Device

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/device/{deviceId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetDeviceInfoResponse result = rc.restapi(apiVersion).account(accountId).device(deviceId).put(accountDeviceUpdate, updateDeviceParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `accountDeviceUpdate` is of type [AccountDeviceUpdate](./src/main/java/com/ringcentral/definitions/AccountDeviceUpdate.java)
- `updateDeviceParameters` is of type [UpdateDeviceParameters](./src/main/java/com/ringcentral/definitions/UpdateDeviceParameters.java)
- `result` is of type [GetDeviceInfoResponse](./src/main/java/com/ringcentral/definitions/GetDeviceInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-updateDevice) in API Explorer.


## listDirectoryEntries
Get Company Directory Entries

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/directory/entries`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DirectoryResource result = rc.restapi(apiVersion).account(accountId).directory().entries().list(listDirectoryEntriesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listDirectoryEntriesParameters` is of type [ListDirectoryEntriesParameters](./src/main/java/com/ringcentral/definitions/ListDirectoryEntriesParameters.java)
- `result` is of type [DirectoryResource](./src/main/java/com/ringcentral/definitions/DirectoryResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-listDirectoryEntries) in API Explorer.


## readDirectoryEntry
Get Corporate Directory Entry

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/directory/entries/{entryId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ContactResource result = rc.restapi(apiVersion).account(accountId).directory().entries(entryId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [ContactResource](./src/main/java/com/ringcentral/definitions/ContactResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readDirectoryEntry) in API Explorer.


## listExtensions
Get Extension List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetExtensionListResponse result = rc.restapi(apiVersion).account(accountId).extension().list(listExtensionsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listExtensionsParameters` is of type [ListExtensionsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionsParameters.java)
- `result` is of type [GetExtensionListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-listExtensions) in API Explorer.


## createExtension
Create Extension

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`AddRemoveUsers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ExtensionCreationResponse result = rc.restapi(apiVersion).account(accountId).extension().post(extensionCreationRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `extensionCreationRequest` is of type [ExtensionCreationRequest](./src/main/java/com/ringcentral/definitions/ExtensionCreationRequest.java)
- `result` is of type [ExtensionCreationResponse](./src/main/java/com/ringcentral/definitions/ExtensionCreationResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-createExtension) in API Explorer.


## readExtension
Get Extension

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetExtensionInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [GetExtensionInfoResponse](./src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readExtension) in API Explorer.


## updateExtension
Update Extension

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserInfo OR EditUserCredentials`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetExtensionInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).put(extensionUpdateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `extensionUpdateRequest` is of type [ExtensionUpdateRequest](./src/main/java/com/ringcentral/definitions/ExtensionUpdateRequest.java)
- `result` is of type [GetExtensionInfoResponse](./src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateExtension) in API Explorer.


## deleteExtension
Delete Extension

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`AddRemoveUsers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).delete(deleteExtensionParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `deleteExtensionParameters` is of type [DeleteExtensionParameters](./src/main/java/com/ringcentral/definitions/DeleteExtensionParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-deleteExtension) in API Explorer.


## readUserCallLog
Get User Call Log Records

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-log`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserCallLogResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog().list(readUserCallLogParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readUserCallLogParameters` is of type [ReadUserCallLogParameters](./src/main/java/com/ringcentral/definitions/ReadUserCallLogParameters.java)
- `result` is of type [UserCallLogResponse](./src/main/java/com/ringcentral/definitions/UserCallLogResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallLog) in API Explorer.


## deleteUserCallLog
Delete User Call Log

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-log`
Rate Limit Group|`Heavy`
App Permission|`EditCallLog`
User Permission|`EditCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog().delete(deleteUserCallLogParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `deleteUserCallLogParameters` is of type [DeleteUserCallLogParameters](./src/main/java/com/ringcentral/definitions/DeleteUserCallLogParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-deleteUserCallLog) in API Explorer.


## readUserCallRecord
Get User Call Record

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-log/{callRecordId}`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserCallLogRecord result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog(callRecordId).get(readUserCallRecordParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readUserCallRecordParameters` is of type [ReadUserCallRecordParameters](./src/main/java/com/ringcentral/definitions/ReadUserCallRecordParameters.java)
- `result` is of type [UserCallLogRecord](./src/main/java/com/ringcentral/definitions/UserCallLogRecord.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallRecord) in API Explorer.


## listExtensionDevices
Get Extension Device List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/device`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetExtensionDevicesResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).device().get(listExtensionDevicesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listExtensionDevicesParameters` is of type [ListExtensionDevicesParameters](./src/main/java/com/ringcentral/definitions/ListExtensionDevicesParameters.java)
- `result` is of type [GetExtensionDevicesResponse](./src/main/java/com/ringcentral/definitions/GetExtensionDevicesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-listExtensionDevices) in API Explorer.


## createFaxMessage
Create Fax Message

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/fax`
Rate Limit Group|`Heavy`
App Permission|`Faxes`
User Permission|`OutboundFaxes`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
FaxResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).fax().post(createFaxMessageRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createFaxMessageRequest` is of type [CreateFaxMessageRequest](./src/main/java/com/ringcentral/definitions/CreateFaxMessageRequest.java)
- `result` is of type [FaxResponse](./src/main/java/com/ringcentral/definitions/FaxResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Fax-createFaxMessage) in API Explorer.


## listExtensionGrants
Get Extension Grant List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/grant`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetExtensionGrantListResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).grant().get(listExtensionGrantsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listExtensionGrantsParameters` is of type [ListExtensionGrantsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionGrantsParameters.java)
- `result` is of type [GetExtensionGrantListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionGrantListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-listExtensionGrants) in API Explorer.


## createCustomUserGreeting
Create Custom User Greeting

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/greeting`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CustomUserGreetingInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).greeting().post(createCustomUserGreetingRequest, createCustomUserGreetingParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createCustomUserGreetingRequest` is of type [CreateCustomUserGreetingRequest](./src/main/java/com/ringcentral/definitions/CreateCustomUserGreetingRequest.java)
- `createCustomUserGreetingParameters` is of type [CreateCustomUserGreetingParameters](./src/main/java/com/ringcentral/definitions/CreateCustomUserGreetingParameters.java)
- `result` is of type [CustomUserGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomUserGreetingInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-createCustomUserGreeting) in API Explorer.


## readCustomGreeting
Get Custom Greeting

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/greeting/{greetingId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CustomUserGreetingInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).greeting(greetingId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [CustomUserGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomUserGreetingInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-readCustomGreeting) in API Explorer.


## listMeetings
Get Scheduled Meetings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingsResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [MeetingsResource](./src/main/java/com/ringcentral/definitions/MeetingsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-listMeetings) in API Explorer.


## createMeeting
Create Meeting

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingResponseResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().post(meetingRequestResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `meetingRequestResource` is of type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-createMeeting) in API Explorer.


## readMeeting
Get Meeting Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingResponseResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-readMeeting) in API Explorer.


## updateMeeting
Update Meeting

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingResponseResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).put(meetingRequestResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `meetingRequestResource` is of type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-updateMeeting) in API Explorer.


## deleteMeeting
Delete Meeting

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-deleteMeeting) in API Explorer.


## createMMS
Send MMS

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/mms`
Rate Limit Group|`Medium`
App Permission|`SMS`
User Permission|`OutboundSMS`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetSMSMessageInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).mms().post(CreateMMSMessage);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `CreateMMSMessage` is of type [CreateMMSMessage](./src/main/java/com/ringcentral/definitions/CreateMMSMessage.java)
- `result` is of type [GetSMSMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetSMSMessageInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SMS-createMMS) in API Explorer.


## createSMSMessage
Send SMS

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/sms`
Rate Limit Group|`Medium`
App Permission|`SMS`
User Permission|`OutboundSMS`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetSMSMessageInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).sms().post(CreateSMSMessage);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `CreateSMSMessage` is of type [CreateSMSMessage](./src/main/java/com/ringcentral/definitions/CreateSMSMessage.java)
- `result` is of type [GetSMSMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetSMSMessageInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SMS-createSMSMessage) in API Explorer.


## createCompanyGreeting
Create Company Greeting

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/greeting`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ReadUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CustomCompanyGreetingInfo result = rc.restapi(apiVersion).account(accountId).greeting().post(createCompanyGreetingRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createCompanyGreetingRequest` is of type [CreateCompanyGreetingRequest](./src/main/java/com/ringcentral/definitions/CreateCompanyGreetingRequest.java)
- `result` is of type [CustomCompanyGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomCompanyGreetingInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-createCompanyGreeting) in API Explorer.


## createIVRMenu
Create IVR Menu

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-menus`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`AutoReceptionist`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
IVRMenuInfo result = rc.restapi(apiVersion).account(accountId).ivrMenus().post(iVRMenuInfo);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `iVRMenuInfo` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-createIVRMenu) in API Explorer.


## readIVRMenu
Get IVR Menu

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-menus/{ivrMenuId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`AutoReceptionist`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
IVRMenuInfo result = rc.restapi(apiVersion).account(accountId).ivrMenus(ivrMenuId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-readIVRMenu) in API Explorer.


## updateIVRMenu
Update IVR Menu

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-menus/{ivrMenuId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`AutoReceptionist`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
IVRMenuInfo result = rc.restapi(apiVersion).account(accountId).ivrMenus(ivrMenuId).put(iVRMenuInfo);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `iVRMenuInfo` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)
- `result` is of type [IVRMenuInfo](./src/main/java/com/ringcentral/definitions/IVRMenuInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-updateIVRMenu) in API Explorer.


## listIVRPrompts
Get IVR Prompt List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-prompts`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
IVRPrompts result = rc.restapi(apiVersion).account(accountId).ivrPrompts().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [IVRPrompts](./src/main/java/com/ringcentral/definitions/IVRPrompts.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-listIVRPrompts) in API Explorer.


## createIVRPrompt
Create IVR Prompts

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-prompts`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`EditCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PromptInfo result = rc.restapi(apiVersion).account(accountId).ivrPrompts().post(createIVRPromptRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createIVRPromptRequest` is of type [CreateIVRPromptRequest](./src/main/java/com/ringcentral/definitions/CreateIVRPromptRequest.java)
- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-createIVRPrompt) in API Explorer.


## readIVRPrompt
Get IVR Prompt

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PromptInfo result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-readIVRPrompt) in API Explorer.


## updateIVRPrompt
Update IVR Prompt

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PromptInfo result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).put(updateIVRPromptRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `updateIVRPromptRequest` is of type [UpdateIVRPromptRequest](./src/main/java/com/ringcentral/definitions/UpdateIVRPromptRequest.java)
- `result` is of type [PromptInfo](./src/main/java/com/ringcentral/definitions/PromptInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-updateIVRPrompt) in API Explorer.


## deleteIVRPrompt
Delete IVR Prompt

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`EditCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#IVR-deleteIVRPrompt) in API Explorer.


## listAccountPhoneNumbers
Get Company Phone Number List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/phone-number`
Rate Limit Group|`Heavy`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyPhoneNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AccountPhoneNumbers result = rc.restapi(apiVersion).account(accountId).phoneNumber().list(listAccountPhoneNumbersParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listAccountPhoneNumbersParameters` is of type [ListAccountPhoneNumbersParameters](./src/main/java/com/ringcentral/definitions/ListAccountPhoneNumbersParameters.java)
- `result` is of type [AccountPhoneNumbers](./src/main/java/com/ringcentral/definitions/AccountPhoneNumbers.java)

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-listAccountPhoneNumbers) in API Explorer.


## readAccountPhoneNumber
Get Phone Number

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/phone-number/{phoneNumberId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyPhoneNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CompanyPhoneNumberInfo result = rc.restapi(apiVersion).account(accountId).phoneNumber(phoneNumberId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CompanyPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/CompanyPhoneNumberInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-readAccountPhoneNumber) in API Explorer.


## readAccountPresence
Get User Presence Status List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/presence`
Rate Limit Group|`Heavy`
App Permission|`ReadPresence`
User Permission|`ReadPresenceStatus`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AccountPresenceInfo result = rc.restapi(apiVersion).account(accountId).presence().get(readAccountPresenceParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `readAccountPresenceParameters` is of type [ReadAccountPresenceParameters](./src/main/java/com/ringcentral/definitions/ReadAccountPresenceParameters.java)
- `result` is of type [AccountPresenceInfo](./src/main/java/com/ringcentral/definitions/AccountPresenceInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readAccountPresence) in API Explorer.


## readCallRecording
Get Call Recording

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/recording/{recordingId}`
Rate Limit Group|`Heavy`
App Permission|`ReadCallRecording`
User Permission|`ReadCallRecording`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetCallRecordingResponse result = rc.restapi(apiVersion).account(accountId).recording(recordingId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [GetCallRecordingResponse](./src/main/java/com/ringcentral/definitions/GetCallRecordingResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recordings-readCallRecording) in API Explorer.


## listCallRecordingData
Get Call Recordings Data

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/recording/{recordingId}/content`
Rate Limit Group|`Heavy`
App Permission|`ReadCallRecording`
User Permission|`ReadCallRecording`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
byte[] result = rc.restapi(apiVersion).account(accountId).recording(recordingId).content().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type `byte[]`

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recordings-listCallRecordingData) in API Explorer.


## readAccountServiceInfo
Get Account Service Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/service-info`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadServicePlanInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetServiceInfoResponse result = rc.restapi(apiVersion).account(accountId).serviceInfo().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [GetServiceInfoResponse](./src/main/java/com/ringcentral/definitions/GetServiceInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountServiceInfo) in API Explorer.


## listUserTemplates
Get User Template List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/templates`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserTemplates result = rc.restapi(apiVersion).account(accountId).templates().list(listUserTemplatesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listUserTemplatesParameters` is of type [ListUserTemplatesParameters](./src/main/java/com/ringcentral/definitions/ListUserTemplatesParameters.java)
- `result` is of type [UserTemplates](./src/main/java/com/ringcentral/definitions/UserTemplates.java)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-listUserTemplates) in API Explorer.


## readUserTemplate
Get User Template

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/templates/{templateId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TemplateInfo result = rc.restapi(apiVersion).account(accountId).templates(templateId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [TemplateInfo](./src/main/java/com/ringcentral/definitions/TemplateInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-readUserTemplate) in API Explorer.


## createSIPRegistration
Register Device

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/client-info/sip-provision`
Rate Limit Group|`Heavy`
App Permission|`VoipCalling`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CreateSipRegistrationResponse result = rc.restapi(apiVersion).clientInfo().sipProvision().post(createSipRegistrationRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `createSipRegistrationRequest` is of type [CreateSipRegistrationRequest](./src/main/java/com/ringcentral/definitions/CreateSipRegistrationRequest.java)
- `result` is of type [CreateSipRegistrationResponse](./src/main/java/com/ringcentral/definitions/CreateSipRegistrationResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Device-SIP-Registration-createSIPRegistration) in API Explorer.


## listCountries
Get Country List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/country`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetCountryListResponse result = rc.restapi(apiVersion).dictionary().country().list(listCountriesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listCountriesParameters` is of type [ListCountriesParameters](./src/main/java/com/ringcentral/definitions/ListCountriesParameters.java)
- `result` is of type [GetCountryListResponse](./src/main/java/com/ringcentral/definitions/GetCountryListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listCountries) in API Explorer.


## readCountry
Get Country

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/country/{countryId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetCountryInfoDictionaryResponse result = rc.restapi(apiVersion).dictionary().country(countryId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GetCountryInfoDictionaryResponse](./src/main/java/com/ringcentral/definitions/GetCountryInfoDictionaryResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readCountry) in API Explorer.


## listFaxCoverPages
Get Fax Cover Page List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/fax-cover-page`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ListFaxCoverPagesResponse result = rc.restapi(apiVersion).dictionary().faxCoverPage().get(listFaxCoverPagesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listFaxCoverPagesParameters` is of type [ListFaxCoverPagesParameters](./src/main/java/com/ringcentral/definitions/ListFaxCoverPagesParameters.java)
- `result` is of type [ListFaxCoverPagesResponse](./src/main/java/com/ringcentral/definitions/ListFaxCoverPagesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Fax-listFaxCoverPages) in API Explorer.


## listStandardGreetings
Get Standard Greeting List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/greeting`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DictionaryGreetingList result = rc.restapi(apiVersion).dictionary().greeting().list(listStandardGreetingsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listStandardGreetingsParameters` is of type [ListStandardGreetingsParameters](./src/main/java/com/ringcentral/definitions/ListStandardGreetingsParameters.java)
- `result` is of type [DictionaryGreetingList](./src/main/java/com/ringcentral/definitions/DictionaryGreetingList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-listStandardGreetings) in API Explorer.


## readStandardGreeting
Get Standard Greeting

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/greeting/{greetingId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DictionaryGreetingInfo result = rc.restapi(apiVersion).dictionary().greeting(greetingId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [DictionaryGreetingInfo](./src/main/java/com/ringcentral/definitions/DictionaryGreetingInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-readStandardGreeting) in API Explorer.


## listLanguages
Get Language List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/language`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
LanguageList result = rc.restapi(apiVersion).dictionary().language().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [LanguageList](./src/main/java/com/ringcentral/definitions/LanguageList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLanguages) in API Explorer.


## readLanguage
Get Language

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/language/{languageId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
LanguageInfo result = rc.restapi(apiVersion).dictionary().language(languageId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [LanguageInfo](./src/main/java/com/ringcentral/definitions/LanguageInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readLanguage) in API Explorer.


## listLocations
Get Location List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/location`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetLocationListResponse result = rc.restapi(apiVersion).dictionary().location().get(listLocationsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listLocationsParameters` is of type [ListLocationsParameters](./src/main/java/com/ringcentral/definitions/ListLocationsParameters.java)
- `result` is of type [GetLocationListResponse](./src/main/java/com/ringcentral/definitions/GetLocationListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLocations) in API Explorer.


## listStates
Get States List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/state`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetStateListResponse result = rc.restapi(apiVersion).dictionary().state().list(listStatesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listStatesParameters` is of type [ListStatesParameters](./src/main/java/com/ringcentral/definitions/ListStatesParameters.java)
- `result` is of type [GetStateListResponse](./src/main/java/com/ringcentral/definitions/GetStateListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listStates) in API Explorer.


## readState
Get State

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/state/{stateId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetStateInfoResponse result = rc.restapi(apiVersion).dictionary().state(stateId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GetStateInfoResponse](./src/main/java/com/ringcentral/definitions/GetStateInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readState) in API Explorer.


## listTimezones
Get Timezone List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/timezone`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetTimezoneListResponse result = rc.restapi(apiVersion).dictionary().timezone().list(listTimezonesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listTimezonesParameters` is of type [ListTimezonesParameters](./src/main/java/com/ringcentral/definitions/ListTimezonesParameters.java)
- `result` is of type [GetTimezoneListResponse](./src/main/java/com/ringcentral/definitions/GetTimezoneListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listTimezones) in API Explorer.


## readTimezone
Get Timezone

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/timezone/{timezoneId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetTimezoneInfoResponse result = rc.restapi(apiVersion).dictionary().timezone(timezoneId).get(readTimezoneParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `readTimezoneParameters` is of type [ReadTimezoneParameters](./src/main/java/com/ringcentral/definitions/ReadTimezoneParameters.java)
- `result` is of type [GetTimezoneInfoResponse](./src/main/java/com/ringcentral/definitions/GetTimezoneInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readTimezone) in API Explorer.


## listGlipChats
Get Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/chats`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipChatsList result = rc.restapi(apiVersion).glip().chats().list(listGlipChatsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listGlipChatsParameters` is of type [ListGlipChatsParameters](./src/main/java/com/ringcentral/definitions/ListGlipChatsParameters.java)
- `result` is of type [GlipChatsList](./src/main/java/com/ringcentral/definitions/GlipChatsList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipChats) in API Explorer.


## readGlipChat
Get Chat

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipChatInfo result = rc.restapi(apiVersion).glip().chats(chatId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipChatInfo](./src/main/java/com/ringcentral/definitions/GlipChatInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipChat) in API Explorer.


## favoriteGlipChat
Add Chat to Favorites

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/favorite`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().chats(chatId).favorite().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-favoriteGlipChat) in API Explorer.


## listChatNotes
Get Chat Notes

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/notes`
Rate Limit Group|`Heavy`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipNotesInfo result = rc.restapi(apiVersion).glip().chats(chatId).notes().get(listChatNotesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listChatNotesParameters` is of type [ListChatNotesParameters](./src/main/java/com/ringcentral/definitions/ListChatNotesParameters.java)
- `result` is of type [GlipNotesInfo](./src/main/java/com/ringcentral/definitions/GlipNotesInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-listChatNotes) in API Explorer.


## createChatNote
Create Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/notes`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipNoteInfo result = rc.restapi(apiVersion).glip().chats(chatId).notes().post(glipNoteCreate);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipNoteCreate` is of type [GlipNoteCreate](./src/main/java/com/ringcentral/definitions/GlipNoteCreate.java)
- `result` is of type [GlipNoteInfo](./src/main/java/com/ringcentral/definitions/GlipNoteInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-createChatNote) in API Explorer.


## readGlipPosts
Get Posts

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/posts`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipPostsList result = rc.restapi(apiVersion).glip().chats(chatId).posts().list(readGlipPostsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `readGlipPostsParameters` is of type [ReadGlipPostsParameters](./src/main/java/com/ringcentral/definitions/ReadGlipPostsParameters.java)
- `result` is of type [GlipPostsList](./src/main/java/com/ringcentral/definitions/GlipPostsList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPosts) in API Explorer.


## createGlipPost
Create Post

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/posts`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipPostInfo result = rc.restapi(apiVersion).glip().chats(chatId).posts().post(glipPostPostBody);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipPostPostBody` is of type [GlipPostPostBody](./src/main/java/com/ringcentral/definitions/GlipPostPostBody.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipPost) in API Explorer.


## readGlipPost
Get Post

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipPostInfo result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPost) in API Explorer.


## deleteGlipPost
Delete Post

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Posts-deleteGlipPost) in API Explorer.


## patchGlipPost
Update Post

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipPostInfo result = rc.restapi(apiVersion).glip().chats(chatId).posts(postId).patch(glipPatchPostBody);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipPatchPostBody` is of type [GlipPatchPostBody](./src/main/java/com/ringcentral/definitions/GlipPatchPostBody.java)
- `result` is of type [GlipPostInfo](./src/main/java/com/ringcentral/definitions/GlipPostInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-patchGlipPost) in API Explorer.


## markChatRead
Mark Chat as Read

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/read`
Rate Limit Group|`Medium`
App Permission|`GlipInternal`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().chats(chatId).read().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatRead) in API Explorer.


## listChatTasks
Get Chat Tasks

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/tasks`
Rate Limit Group|`Heavy`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipTaskList result = rc.restapi(apiVersion).glip().chats(chatId).tasks().get(listChatTasksParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listChatTasksParameters` is of type [ListChatTasksParameters](./src/main/java/com/ringcentral/definitions/ListChatTasksParameters.java)
- `result` is of type [GlipTaskList](./src/main/java/com/ringcentral/definitions/GlipTaskList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-listChatTasks) in API Explorer.


## createTask
Create Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/tasks`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipTaskInfo result = rc.restapi(apiVersion).glip().chats(chatId).tasks().post(glipCreateTask);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipCreateTask` is of type [GlipCreateTask](./src/main/java/com/ringcentral/definitions/GlipCreateTask.java)
- `result` is of type [GlipTaskInfo](./src/main/java/com/ringcentral/definitions/GlipTaskInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-createTask) in API Explorer.


## unfavoriteGlipChat
Remove Chat from Favorites

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/unfavorite`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().chats(chatId).unfavorite().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-unfavoriteGlipChat) in API Explorer.


## markChatUnread
Mark Chat as Unread

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/chats/{chatId}/unread`
Rate Limit Group|`Medium`
App Permission|`GlipInternal`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().chats(chatId).unread().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatUnread) in API Explorer.


## readGlipCompany
Get Company Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/companies/{companyId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipCompany result = rc.restapi(apiVersion).glip().companies(companyId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipCompany](./src/main/java/com/ringcentral/definitions/GlipCompany.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipCompany) in API Explorer.


## listGlipConversations
Get Conversations

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/conversations`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipConversationsList result = rc.restapi(apiVersion).glip().conversations().list(listGlipConversationsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listGlipConversationsParameters` is of type [ListGlipConversationsParameters](./src/main/java/com/ringcentral/definitions/ListGlipConversationsParameters.java)
- `result` is of type [GlipConversationsList](./src/main/java/com/ringcentral/definitions/GlipConversationsList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-listGlipConversations) in API Explorer.


## createGlipConversation
Create/Open Conversation

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/conversations`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipConversationInfo result = rc.restapi(apiVersion).glip().conversations().post(createGlipConversationRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `createGlipConversationRequest` is of type [CreateGlipConversationRequest](./src/main/java/com/ringcentral/definitions/CreateGlipConversationRequest.java)
- `result` is of type [GlipConversationInfo](./src/main/java/com/ringcentral/definitions/GlipConversationInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-createGlipConversation) in API Explorer.


## readGlipConversation
Get Conversation

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/conversations/{chatId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipConversationInfo result = rc.restapi(apiVersion).glip().conversations(chatId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipConversationInfo](./src/main/java/com/ringcentral/definitions/GlipConversationInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-readGlipConversation) in API Explorer.


## listDataExportTasks
Get Data Export Task List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/data-export`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DataExportTaskList result = rc.restapi(apiVersion).glip().dataExport().list(listDataExportTasksParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listDataExportTasksParameters` is of type [ListDataExportTasksParameters](./src/main/java/com/ringcentral/definitions/ListDataExportTasksParameters.java)
- `result` is of type [DataExportTaskList](./src/main/java/com/ringcentral/definitions/DataExportTaskList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-listDataExportTasks) in API Explorer.


## createDataExportTask
Create Data Export Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/data-export`
Rate Limit Group|`Heavy`
App Permission|`Glip`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DataExportTask result = rc.restapi(apiVersion).glip().dataExport().post(createDataExportTaskRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `createDataExportTaskRequest` is of type [CreateDataExportTaskRequest](./src/main/java/com/ringcentral/definitions/CreateDataExportTaskRequest.java)
- `result` is of type [DataExportTask](./src/main/java/com/ringcentral/definitions/DataExportTask.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-createDataExportTask) in API Explorer.


## readDataExportTask
Get Data Export Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/data-export/{taskId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DataExportTask result = rc.restapi(apiVersion).glip().dataExport(taskId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [DataExportTask](./src/main/java/com/ringcentral/definitions/DataExportTask.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-readDataExportTask) in API Explorer.


## readDataExportTaskDataset
Get Data Export Task Dataset

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/data-export/{taskId}/datasets/{datasetId}`
Rate Limit Group|`Heavy`
App Permission|`Glip`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
byte[] result = rc.restapi(apiVersion).glip().dataExport(taskId).datasets(datasetId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type `byte[]`

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Compliance-Exports-readDataExportTaskDataset) in API Explorer.


## readGlipEveryone
Get Everyone Chat

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/everyone`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipEveryoneInfo result = rc.restapi(apiVersion).glip().everyone().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipEveryoneInfo](./src/main/java/com/ringcentral/definitions/GlipEveryoneInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-readGlipEveryone) in API Explorer.


## patchGlipEveryone
Update Everyone Сhat

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/glip/everyone`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipEveryoneInfo result = rc.restapi(apiVersion).glip().everyone().patch(updateGlipEveryoneRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `updateGlipEveryoneRequest` is of type [UpdateGlipEveryoneRequest](./src/main/java/com/ringcentral/definitions/UpdateGlipEveryoneRequest.java)
- `result` is of type [GlipEveryoneInfo](./src/main/java/com/ringcentral/definitions/GlipEveryoneInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-patchGlipEveryone) in API Explorer.


## listFavoriteChats
Get Favorite Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/favorites`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipChatsListWithoutNavigation result = rc.restapi(apiVersion).glip().favorites().get(listFavoriteChatsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listFavoriteChatsParameters` is of type [ListFavoriteChatsParameters](./src/main/java/com/ringcentral/definitions/ListFavoriteChatsParameters.java)
- `result` is of type [GlipChatsListWithoutNavigation](./src/main/java/com/ringcentral/definitions/GlipChatsListWithoutNavigation.java)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listFavoriteChats) in API Explorer.


## listGroupEvents
Get Group Events

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/groups/{groupId}/events`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipEventInfo result = rc.restapi(apiVersion).glip().groups(groupId).events().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-listGroupEvents) in API Explorer.


## createEventByGroupId
Create Event by Group ID

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/groups/{groupId}/events`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipEventInfo result = rc.restapi(apiVersion).glip().groups(groupId).events().post(glipEventCreate);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-createEventByGroupId) in API Explorer.


## listGlipGroupWebhooks
Get Webhooks in Group

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/groups/{groupId}/webhooks`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipWebhookList result = rc.restapi(apiVersion).glip().groups(groupId).webhooks().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-listGlipGroupWebhooks) in API Explorer.


## createGlipGroupWebhook
Create Webhook in Group

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/groups/{groupId}/webhooks`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipWebhookInfo result = rc.restapi(apiVersion).glip().groups(groupId).webhooks().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipWebhookInfo](./src/main/java/com/ringcentral/definitions/GlipWebhookInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-createGlipGroupWebhook) in API Explorer.


## readUserNote
Get Note

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetGlipNoteInfo result = rc.restapi(apiVersion).glip().notes(noteId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GetGlipNoteInfo](./src/main/java/com/ringcentral/definitions/GetGlipNoteInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-readUserNote) in API Explorer.


## deleteNote
Delete Note

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/glip/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().notes(noteId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Notes-deleteNote) in API Explorer.


## patchNote
Update Note

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/glip/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipNoteInfo result = rc.restapi(apiVersion).glip().notes(noteId).patch(glipNoteCreate);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipNoteCreate` is of type [GlipNoteCreate](./src/main/java/com/ringcentral/definitions/GlipNoteCreate.java)
- `result` is of type [GlipNoteInfo](./src/main/java/com/ringcentral/definitions/GlipNoteInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-patchNote) in API Explorer.


## publishNote
Publish Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/notes/{noteId}/publish`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().notes(noteId).publish().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Notes-publishNote) in API Explorer.


## unlockNote
Unlock Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/notes/{noteId}/unlock`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().notes(noteId).unlock().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Notes-unlockNote) in API Explorer.


## listRecentChats
Get Recent Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/recent/chats`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipChatsListWithoutNavigation result = rc.restapi(apiVersion).glip().recent().chats().get(listRecentChatsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listRecentChatsParameters` is of type [ListRecentChatsParameters](./src/main/java/com/ringcentral/definitions/ListRecentChatsParameters.java)
- `result` is of type [GlipChatsListWithoutNavigation](./src/main/java/com/ringcentral/definitions/GlipChatsListWithoutNavigation.java)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listRecentChats) in API Explorer.


## readTask
Get Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipTaskInfo result = rc.restapi(apiVersion).glip().tasks(taskId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipTaskInfo](./src/main/java/com/ringcentral/definitions/GlipTaskInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-readTask) in API Explorer.


## deleteTask
Delete Task

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/glip/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().tasks(taskId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-deleteTask) in API Explorer.


## patchTask
Patch Task

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/glip/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipTaskList result = rc.restapi(apiVersion).glip().tasks(taskId).patch(glipUpdateTask);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipUpdateTask` is of type [GlipUpdateTask](./src/main/java/com/ringcentral/definitions/GlipUpdateTask.java)
- `result` is of type [GlipTaskList](./src/main/java/com/ringcentral/definitions/GlipTaskList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-patchTask) in API Explorer.


## completeTask
Complete Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/tasks/{taskId}/complete`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().tasks(taskId).complete().post(glipCompleteTask);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipCompleteTask` is of type [GlipCompleteTask](./src/main/java/com/ringcentral/definitions/GlipCompleteTask.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-completeTask) in API Explorer.


## listGlipTeams
Get Teams

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/teams`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipTeamsList result = rc.restapi(apiVersion).glip().teams().list(listGlipTeamsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listGlipTeamsParameters` is of type [ListGlipTeamsParameters](./src/main/java/com/ringcentral/definitions/ListGlipTeamsParameters.java)
- `result` is of type [GlipTeamsList](./src/main/java/com/ringcentral/definitions/GlipTeamsList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-listGlipTeams) in API Explorer.


## createGlipTeam
Create Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/teams`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipTeamInfo result = rc.restapi(apiVersion).glip().teams().post(glipPostTeamBody);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipPostTeamBody` is of type [GlipPostTeamBody](./src/main/java/com/ringcentral/definitions/GlipPostTeamBody.java)
- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-createGlipTeam) in API Explorer.


## readGlipTeam
Get Team

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipTeamInfo result = rc.restapi(apiVersion).glip().teams(chatId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-readGlipTeam) in API Explorer.


## deleteGlipTeam
Delete Team

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().teams(chatId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-deleteGlipTeam) in API Explorer.


## patchGlipTeam
Update Team

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipTeamInfo result = rc.restapi(apiVersion).glip().teams(chatId).patch(glipPatchTeamBody);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipPatchTeamBody` is of type [GlipPatchTeamBody](./src/main/java/com/ringcentral/definitions/GlipPatchTeamBody.java)
- `result` is of type [GlipTeamInfo](./src/main/java/com/ringcentral/definitions/GlipTeamInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-patchGlipTeam) in API Explorer.


## readGlipEvents
Get User Events List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/events`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipEventsInfo result = rc.restapi(apiVersion).glip().events().list(readGlipEventsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `readGlipEventsParameters` is of type [ReadGlipEventsParameters](./src/main/java/com/ringcentral/definitions/ReadGlipEventsParameters.java)
- `result` is of type [GlipEventsInfo](./src/main/java/com/ringcentral/definitions/GlipEventsInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-readGlipEvents) in API Explorer.


## createEvent
Create Event

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/events`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipEventInfo result = rc.restapi(apiVersion).glip().events().post(glipEventCreate);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-createEvent) in API Explorer.


## readEvent
Get Event

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipEventInfo result = rc.restapi(apiVersion).glip().events(eventId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-readEvent) in API Explorer.


## updateEvent
Update Event

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/glip/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipEventInfo result = rc.restapi(apiVersion).glip().events(eventId).put(glipEventCreate);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipEventCreate` is of type [GlipEventCreate](./src/main/java/com/ringcentral/definitions/GlipEventCreate.java)
- `result` is of type [GlipEventInfo](./src/main/java/com/ringcentral/definitions/GlipEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-updateEvent) in API Explorer.


## deleteEvent
Delete Event

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/glip/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().events(eventId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-deleteEvent) in API Explorer.


## lockNote
Lock Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/notes/{noteId}/lock`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().notes(noteId).lock().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Notes-lockNote) in API Explorer.


## readGlipPerson
Get Person

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/persons/{personId}`
Rate Limit Group|`Light`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipPersonInfo result = rc.restapi(apiVersion).glip().persons(personId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipPersonInfo](./src/main/java/com/ringcentral/definitions/GlipPersonInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipPerson) in API Explorer.


## readGlipPreferences
Get Preferences

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/preferences`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipPreferencesInfo result = rc.restapi(apiVersion).glip().preferences().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipPreferencesInfo](./src/main/java/com/ringcentral/definitions/GlipPreferencesInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Profile-readGlipPreferences) in API Explorer.


## addGlipTeamMembers
Add Team Members

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}/add`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().teams(chatId).add().post(glipPostMembersListBody);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipPostMembersListBody` is of type [GlipPostMembersListBody](./src/main/java/com/ringcentral/definitions/GlipPostMembersListBody.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-addGlipTeamMembers) in API Explorer.


## archiveGlipTeam
Archive Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}/archive`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().teams(chatId).archive().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-archiveGlipTeam) in API Explorer.


## leaveGlipTeam
Leave Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}/leave`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().teams(chatId).leave().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-leaveGlipTeam) in API Explorer.


## listGlipWebhooks
Get Webhooks

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/webhooks`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipWebhookList result = rc.restapi(apiVersion).glip().webhooks().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-listGlipWebhooks) in API Explorer.


## readGlipWebhook
Get Webhook

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/glip/webhooks/{webhookId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GlipWebhookList result = rc.restapi(apiVersion).glip().webhooks(webhookId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [GlipWebhookList](./src/main/java/com/ringcentral/definitions/GlipWebhookList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-readGlipWebhook) in API Explorer.


## deleteGlipWebhook
Delete Webhook

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/glip/webhooks/{webhookId}`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().webhooks(webhookId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-deleteGlipWebhook) in API Explorer.


## listSubscriptions
Get Subscription List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/subscription`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
RecordsCollectionResourceSubscriptionResponse result = rc.restapi(apiVersion).subscription().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [RecordsCollectionResourceSubscriptionResponse](./src/main/java/com/ringcentral/definitions/RecordsCollectionResourceSubscriptionResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-listSubscriptions) in API Explorer.


## createSubscription
Create Subscription

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/subscription`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SubscriptionInfo result = rc.restapi(apiVersion).subscription().post(createSubscriptionRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `createSubscriptionRequest` is of type [CreateSubscriptionRequest](./src/main/java/com/ringcentral/definitions/CreateSubscriptionRequest.java)
- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-createSubscription) in API Explorer.


## readSubscription
Get Subscription

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/subscription/{subscriptionId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SubscriptionInfo result = rc.restapi(apiVersion).subscription(subscriptionId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-readSubscription) in API Explorer.


## updateSubscription
Update Subscription

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/subscription/{subscriptionId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SubscriptionInfo result = rc.restapi(apiVersion).subscription(subscriptionId).put(modifySubscriptionRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `modifySubscriptionRequest` is of type [ModifySubscriptionRequest](./src/main/java/com/ringcentral/definitions/ModifySubscriptionRequest.java)
- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-updateSubscription) in API Explorer.


## deleteSubscription
Cancel Subscription

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/subscription/{subscriptionId}`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).subscription(subscriptionId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-deleteSubscription) in API Explorer.


## searchViaPost2
Search/List Users

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/scim/{version}/Users/dotSearch`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserSearchResponse result = rc.scim(version).users().dotSearch().post(searchRequest);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `searchRequest` is of type [SearchRequest](./src/main/java/com/ringcentral/definitions/SearchRequest.java)
- `result` is of type [UserSearchResponse](./src/main/java/com/ringcentral/definitions/UserSearchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-searchViaPost2) in API Explorer.


## joinGlipTeam
Join Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}/join`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().teams(chatId).join().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-joinGlipTeam) in API Explorer.


## removeGlipTeamMembers
Remove Team Members

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}/remove`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().teams(chatId).remove().post(glipPostMembersIdsListBody);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `glipPostMembersIdsListBody` is of type [GlipPostMembersIdsListBody](./src/main/java/com/ringcentral/definitions/GlipPostMembersIdsListBody.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-removeGlipTeamMembers) in API Explorer.


## unarchiveGlipTeam
Unarchive Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/teams/{chatId}/unarchive`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().teams(chatId).unarchive().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-unarchiveGlipTeam) in API Explorer.


## activateGlipWebhook
Activate Webhook

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/webhooks/{webhookId}/activate`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().webhooks(webhookId).activate().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-activateGlipWebhook) in API Explorer.


## suspendGlipWebhook
Suspend Webhook

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/glip/webhooks/{webhookId}/suspend`
Rate Limit Group|`Medium`
App Permission|`Glip`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).glip().webhooks(webhookId).suspend().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Glip-Webhooks-suspendGlipWebhook) in API Explorer.


## parsePhoneNumber
Parse Phone Number

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/number-parser/parse`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ParsePhoneNumberResponse result = rc.restapi(apiVersion).numberParser().parse().post(parsePhoneNumberRequest, parsePhoneNumberParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `parsePhoneNumberRequest` is of type [ParsePhoneNumberRequest](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberRequest.java)
- `parsePhoneNumberParameters` is of type [ParsePhoneNumberParameters](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberParameters.java)
- `result` is of type [ParsePhoneNumberResponse](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-parsePhoneNumber) in API Explorer.


## renewSubscription
Renew Subscription

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/subscription/{subscriptionId}/renew`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SubscriptionInfo result = rc.restapi(apiVersion).subscription(subscriptionId).renew().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [SubscriptionInfo](./src/main/java/com/ringcentral/definitions/SubscriptionInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Subscriptions-renewSubscription) in API Explorer.


## readServiceProviderConfig2
Get Service Provider Config

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/ServiceProviderConfig`
Rate Limit Group|`NoThrottling`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ServiceProviderConfig result = rc.scim(version).serviceProviderConfig().get();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is of type [ServiceProviderConfig](./src/main/java/com/ringcentral/definitions/ServiceProviderConfig.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-readServiceProviderConfig2) in API Explorer.


## addressBookBulkUpload
Update Multiple Contacts

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/address-book-bulk-upload`
Rate Limit Group|`Heavy`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AddressBookBulkUploadResponse result = rc.restapi(apiVersion).account(accountId).addressBookBulkUpload().post(addressBookBulkUploadRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `addressBookBulkUploadRequest` is of type [AddressBookBulkUploadRequest](./src/main/java/com/ringcentral/definitions/AddressBookBulkUploadRequest.java)
- `result` is of type [AddressBookBulkUploadResponse](./src/main/java/com/ringcentral/definitions/AddressBookBulkUploadResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-addressBookBulkUpload) in API Explorer.


## listCallMonitoringGroups
Get Call Monitoring Groups List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-monitoring-groups`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallMonitoringGroups result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups().get(listCallMonitoringGroupsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listCallMonitoringGroupsParameters` is of type [ListCallMonitoringGroupsParameters](./src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupsParameters.java)
- `result` is of type [CallMonitoringGroups](./src/main/java/com/ringcentral/definitions/CallMonitoringGroups.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-listCallMonitoringGroups) in API Explorer.


## createCallMonitoringGroup
Create Call Monitoring Group

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-monitoring-groups`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallMonitoringGroup result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups().post(createCallMonitoringGroupRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createCallMonitoringGroupRequest` is of type [CreateCallMonitoringGroupRequest](./src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.java)
- `result` is of type [CallMonitoringGroup](./src/main/java/com/ringcentral/definitions/CallMonitoringGroup.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-createCallMonitoringGroup) in API Explorer.


## updateCallMonitoringGroup
Updates Call Monitoring Group

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallMonitoringGroup result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).put(createCallMonitoringGroupRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createCallMonitoringGroupRequest` is of type [CreateCallMonitoringGroupRequest](./src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.java)
- `result` is of type [CallMonitoringGroup](./src/main/java/com/ringcentral/definitions/CallMonitoringGroup.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-updateCallMonitoringGroup) in API Explorer.


## deleteCallMonitoringGroup
Delete Call Monitoring Group

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-deleteCallMonitoringGroup) in API Explorer.


## assignMultipleCallQueueMembers
Assign Multiple Call Queue Members

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).bulkAssign().post(callQueueBulkAssignResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callQueueBulkAssignResource` is of type [CallQueueBulkAssignResource](./src/main/java/com/ringcentral/definitions/CallQueueBulkAssignResource.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-assignMultipleCallQueueMembers) in API Explorer.


## listCallQueueMembers
Get Call Queue Members

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}/members`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallQueueMembers result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).members().get(listCallQueueMembersParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listCallQueueMembersParameters` is of type [ListCallQueueMembersParameters](./src/main/java/com/ringcentral/definitions/ListCallQueueMembersParameters.java)
- `result` is of type [CallQueueMembers](./src/main/java/com/ringcentral/definitions/CallQueueMembers.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-listCallQueueMembers) in API Explorer.


## readCallQueuePresence
Get Call Queue Presence

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}/presence`
Rate Limit Group|`Light`
App Permission|`ReadPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallQueuePresence result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).presence().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallQueuePresence](./src/main/java/com/ringcentral/definitions/CallQueuePresence.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readCallQueuePresence) in API Explorer.


## updateCallQueuePresence
Update Call Queue Presence

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}/presence`
Rate Limit Group|`Medium`
App Permission|`EditPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallQueuePresence result = rc.restapi(apiVersion).account(accountId).callQueues(groupId).presence().put(callQueueUpdatePresence);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callQueueUpdatePresence` is of type [CallQueueUpdatePresence](./src/main/java/com/ringcentral/definitions/CallQueueUpdatePresence.java)
- `result` is of type [CallQueuePresence](./src/main/java/com/ringcentral/definitions/CallQueuePresence.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateCallQueuePresence) in API Explorer.


## updateCallRecordingExtensionList
Update Call Recording Extension List

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-recording/bulk-assign`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).callRecording().bulkAssign().post(bulkAccountCallRecordingsResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `bulkAccountCallRecordingsResource` is of type [BulkAccountCallRecordingsResource](./src/main/java/com/ringcentral/definitions/BulkAccountCallRecordingsResource.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-updateCallRecordingExtensionList) in API Explorer.


## listCallRecordingExtensions
Get Call Recording Extension List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-recording/extensions`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallRecordingExtensions result = rc.restapi(apiVersion).account(accountId).callRecording().extensions().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallRecordingExtensions](./src/main/java/com/ringcentral/definitions/CallRecordingExtensions.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-listCallRecordingExtensions) in API Explorer.


## searchDirectoryEntries
Search Company Directory Entries

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/directory/entries/search`
Rate Limit Group|`Heavy`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DirectoryResource result = rc.restapi(apiVersion).account(accountId).directory().entries().search().post(searchDirectoryEntriesRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `searchDirectoryEntriesRequest` is of type [SearchDirectoryEntriesRequest](./src/main/java/com/ringcentral/definitions/SearchDirectoryEntriesRequest.java)
- `result` is of type [DirectoryResource](./src/main/java/com/ringcentral/definitions/DirectoryResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-searchDirectoryEntries) in API Explorer.


## readAccountFederation
Get Account Federation

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/directory/federation`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
FederationResource result = rc.restapi(apiVersion).account(accountId).directory().federation().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [FederationResource](./src/main/java/com/ringcentral/definitions/FederationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readAccountFederation) in API Explorer.


## listEmergencyLocations
Get Emergency Location List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-locations`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
EmergencyLocationList result = rc.restapi(apiVersion).account(accountId).emergencyLocations().list(listEmergencyLocationsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listEmergencyLocationsParameters` is of type [ListEmergencyLocationsParameters](./src/main/java/com/ringcentral/definitions/ListEmergencyLocationsParameters.java)
- `result` is of type [EmergencyLocationList](./src/main/java/com/ringcentral/definitions/EmergencyLocationList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listEmergencyLocations) in API Explorer.


## createEmergencyLocation
Add Emergency Location

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-locations`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).emergencyLocations().post(emergencyLocationInfoRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `emergencyLocationInfoRequest` is of type [EmergencyLocationInfoRequest](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfoRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createEmergencyLocation) in API Explorer.


## readEmergencyLocation
Get Emergency Location

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-locations/{locationId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
EmergencyLocationInfo result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [EmergencyLocationInfo](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readEmergencyLocation) in API Explorer.


## updateEmergencyLocation
Update Emergency Location

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-locations/{locationId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
EmergencyLocationInfo result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).put(emergencyLocationInfoRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `emergencyLocationInfoRequest` is of type [EmergencyLocationInfoRequest](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfoRequest.java)
- `result` is of type [EmergencyLocationInfo](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateEmergencyLocation) in API Explorer.


## deleteEmergencyLocation
Delete Emergency Location

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-locations/{locationId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).delete(deleteEmergencyLocationParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `deleteEmergencyLocationParameters` is of type [DeleteEmergencyLocationParameters](./src/main/java/com/ringcentral/definitions/DeleteEmergencyLocationParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteEmergencyLocation) in API Explorer.


## extensionBulkUpdate
Update Multiple Extensions

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension-bulk-update`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`EditExtensionInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ExtensionBulkUpdateTaskResource result = rc.restapi(apiVersion).account(accountId).extensionBulkUpdate().post(extensionBulkUpdateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `extensionBulkUpdateRequest` is of type [ExtensionBulkUpdateRequest](./src/main/java/com/ringcentral/definitions/ExtensionBulkUpdateRequest.java)
- `result` is of type [ExtensionBulkUpdateTaskResource](./src/main/java/com/ringcentral/definitions/ExtensionBulkUpdateTaskResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-extensionBulkUpdate) in API Explorer.


## getExtensionBulkUpdateTask
Get Update Task Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension-bulk-update/tasks/{taskId}`
Rate Limit Group|`Light`
App Permission|`EditExtensions`
User Permission|`EditExtensionInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ExtensionBulkUpdateTaskResource result = rc.restapi(apiVersion).account(accountId).extensionBulkUpdate().tasks(taskId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [ExtensionBulkUpdateTaskResource](./src/main/java/com/ringcentral/definitions/ExtensionBulkUpdateTaskResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-getExtensionBulkUpdateTask) in API Explorer.


## listExtensionActiveCalls
Get User Active Calls

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/active-calls`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserActiveCallsResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).activeCalls().get(listExtensionActiveCallsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listExtensionActiveCallsParameters` is of type [ListExtensionActiveCallsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionActiveCallsParameters.java)
- `result` is of type [UserActiveCallsResponse](./src/main/java/com/ringcentral/definitions/UserActiveCallsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listExtensionActiveCalls) in API Explorer.


## syncAddressBook
Address Book Synchronization

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book-sync`
Rate Limit Group|`Heavy`
App Permission|`ReadContacts`
User Permission|`ReadPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AddressBookSync result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBookSync().get(syncAddressBookParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `syncAddressBookParameters` is of type [SyncAddressBookParameters](./src/main/java/com/ringcentral/definitions/SyncAddressBookParameters.java)
- `result` is of type [AddressBookSync](./src/main/java/com/ringcentral/definitions/AddressBookSync.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-syncAddressBook) in API Explorer.


## listAnsweringRules
Get Call Handling Rules

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserAnsweringRuleList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule().list(listAnsweringRulesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listAnsweringRulesParameters` is of type [ListAnsweringRulesParameters](./src/main/java/com/ringcentral/definitions/ListAnsweringRulesParameters.java)
- `result` is of type [UserAnsweringRuleList](./src/main/java/com/ringcentral/definitions/UserAnsweringRuleList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-listAnsweringRules) in API Explorer.


## createAnsweringRule
Create Call Handling Rule

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CustomAnsweringRuleInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule().post(createAnsweringRuleRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createAnsweringRuleRequest` is of type [CreateAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/CreateAnsweringRuleRequest.java)
- `result` is of type [CustomAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CustomAnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-createAnsweringRule) in API Explorer.


## readAnsweringRule
Get Call Handling Rule

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AnsweringRuleInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).get(readAnsweringRuleParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readAnsweringRuleParameters` is of type [ReadAnsweringRuleParameters](./src/main/java/com/ringcentral/definitions/ReadAnsweringRuleParameters.java)
- `result` is of type [AnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-readAnsweringRule) in API Explorer.


## updateAnsweringRule
Update Call Handling Rule

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AnsweringRuleInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).put(updateAnsweringRuleRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `updateAnsweringRuleRequest` is of type [UpdateAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/UpdateAnsweringRuleRequest.java)
- `result` is of type [AnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/AnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-updateAnsweringRule) in API Explorer.


## deleteAnsweringRule
Delete Call Handling Rule

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).answeringRule(ruleId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-deleteAnsweringRule) in API Explorer.


## readAuthorizationProfile
Get Authorization Profile

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/authz-profile`
Rate Limit Group|`Medium`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AuthProfileResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).authzProfile().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [AuthProfileResource](./src/main/java/com/ringcentral/definitions/AuthProfileResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Permissions-readAuthorizationProfile) in API Explorer.


## readUserBusinessHours
Get User Business Hours

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/business-hours`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetUserBusinessHoursResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).businessHours().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [GetUserBusinessHoursResponse](./src/main/java/com/ringcentral/definitions/GetUserBusinessHoursResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-readUserBusinessHours) in API Explorer.


## updateUserBusinessHours
Update User Business Hours

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/business-hours`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserBusinessHoursUpdateResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).businessHours().put(userBusinessHoursUpdateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `userBusinessHoursUpdateRequest` is of type [UserBusinessHoursUpdateRequest](./src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateRequest.java)
- `result` is of type [UserBusinessHoursUpdateResponse](./src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateUserBusinessHours) in API Explorer.


## syncUserCallLog
Sync User Call Log

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-log-sync`
Rate Limit Group|`Heavy`
App Permission|`ReadCallLog`
User Permission|`ReadCallLog`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallLogSync result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLogSync().get(syncUserCallLogParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `syncUserCallLogParameters` is of type [SyncUserCallLogParameters](./src/main/java/com/ringcentral/definitions/SyncUserCallLogParameters.java)
- `result` is of type [CallLogSync](./src/main/java/com/ringcentral/definitions/CallLogSync.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncUserCallLog) in API Explorer.


## updateUserCallQueues
Update User Call Queues

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-queues`
Rate Limit Group|`Medium`
App Permission|`Accounts`
User Permission|`JoinLeaveCallQueue`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserCallQueues result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callQueues().put(userCallQueues);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `userCallQueues` is of type [UserCallQueues](./src/main/java/com/ringcentral/definitions/UserCallQueues.java)
- `result` is of type [UserCallQueues](./src/main/java/com/ringcentral/definitions/UserCallQueues.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-updateUserCallQueues) in API Explorer.


## readCallerBlockingSettings
Get Caller Blocking Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallerBlockingSettings result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [CallerBlockingSettings](./src/main/java/com/ringcentral/definitions/CallerBlockingSettings.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-readCallerBlockingSettings) in API Explorer.


## updateCallerBlockingSettings
Update Caller Blocking Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking`
Rate Limit Group|`Light`
App Permission|`EditExtensions`
User Permission|`EditBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallerBlockingSettings result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().put(callerBlockingSettingsUpdate);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `callerBlockingSettingsUpdate` is of type [CallerBlockingSettingsUpdate](./src/main/java/com/ringcentral/definitions/CallerBlockingSettingsUpdate.java)
- `result` is of type [CallerBlockingSettings](./src/main/java/com/ringcentral/definitions/CallerBlockingSettings.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateCallerBlockingSettings) in API Explorer.


## readExtensionCallerId
Get Extension Caller ID

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-id`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCallerIDSettings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ExtensionCallerIdInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerId().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readExtensionCallerId) in API Explorer.


## updateExtensionCallerId
Update Extension Caller ID

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-id`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditCallerIDSettings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ExtensionCallerIdInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerId().put(extensionCallerIdInfo);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `extensionCallerIdInfo` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)
- `result` is of type [ExtensionCallerIdInfo](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateExtensionCallerId) in API Explorer.


## createInternalTextMessage
Create Internal Text Message

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/company-pager`
Rate Limit Group|`Medium`
App Permission|`InternalMessages`
User Permission|`InternalSMS`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetInternalTextMessageInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).companyPager().post(createInternalTextMessageRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createInternalTextMessageRequest` is of type [CreateInternalTextMessageRequest](./src/main/java/com/ringcentral/definitions/CreateInternalTextMessageRequest.java)
- `result` is of type [GetInternalTextMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetInternalTextMessageInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Pager-Messages-createInternalTextMessage) in API Explorer.


## readConferencingSettings
Get User Conferencing Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/conferencing`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`OrganizeConference`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetConferencingInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).conferencing().get(readConferencingSettingsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readConferencingSettingsParameters` is of type [ReadConferencingSettingsParameters](./src/main/java/com/ringcentral/definitions/ReadConferencingSettingsParameters.java)
- `result` is of type [GetConferencingInfoResponse](./src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readConferencingSettings) in API Explorer.


## updateConferencingSettings
Update User Conferencing Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/conferencing`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`OrganizeConference`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetConferencingInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).conferencing().put(updateConferencingInfoRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `updateConferencingInfoRequest` is of type [UpdateConferencingInfoRequest](./src/main/java/com/ringcentral/definitions/UpdateConferencingInfoRequest.java)
- `result` is of type [GetConferencingInfoResponse](./src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateConferencingSettings) in API Explorer.


## listFavoriteContacts
Get Favorite Contact List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/favorite`
Rate Limit Group|`Light`
App Permission|`ReadContacts`
User Permission|`ReadPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
FavoriteContactList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).favorite().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [FavoriteContactList](./src/main/java/com/ringcentral/definitions/FavoriteContactList.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listFavoriteContacts) in API Explorer.


## updateFavoriteContactList
Update Favorite Contact List

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/favorite`
Rate Limit Group|`Medium`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
FavoriteContactList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).favorite().put(favoriteCollection);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `favoriteCollection` is of type [FavoriteCollection](./src/main/java/com/ringcentral/definitions/FavoriteCollection.java)
- `result` is of type [FavoriteContactList](./src/main/java/com/ringcentral/definitions/FavoriteContactList.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateFavoriteContactList) in API Explorer.


## readUserFeatures
Get User Features

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/features`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
FeatureList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).features().get(readUserFeaturesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readUserFeaturesParameters` is of type [ReadUserFeaturesParameters](./src/main/java/com/ringcentral/definitions/ReadUserFeaturesParameters.java)
- `result` is of type [FeatureList](./src/main/java/com/ringcentral/definitions/FeatureList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Features-readUserFeatures) in API Explorer.


## listForwardingNumbers
Get Forwarding Number List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetExtensionForwardingNumberListResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber().list(listForwardingNumbersParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listForwardingNumbersParameters` is of type [ListForwardingNumbersParameters](./src/main/java/com/ringcentral/definitions/ListForwardingNumbersParameters.java)
- `result` is of type [GetExtensionForwardingNumberListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionForwardingNumberListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-listForwardingNumbers) in API Explorer.


## createForwardingNumber
Create Forwarding Number

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ForwardingNumberInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber().post(createForwardingNumberRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createForwardingNumberRequest` is of type [CreateForwardingNumberRequest](./src/main/java/com/ringcentral/definitions/CreateForwardingNumberRequest.java)
- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-createForwardingNumber) in API Explorer.


## readForwardingNumber
Get Forwarding Number

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ForwardingNumberInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-readForwardingNumber) in API Explorer.


## updateForwardingNumber
Update Forwarding Number

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ForwardingNumberInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).put(updateForwardingNumberRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `updateForwardingNumberRequest` is of type [UpdateForwardingNumberRequest](./src/main/java/com/ringcentral/definitions/UpdateForwardingNumberRequest.java)
- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-updateForwardingNumber) in API Explorer.


## deleteForwardingNumber
Delete Forwarding Number

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-deleteForwardingNumber) in API Explorer.


## listUserMeetingRecordings
Get User Meeting Recordings List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting-recordings`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`MeetingsRecordings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ListMeetingRecordingsResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingRecordings().get(listUserMeetingRecordingsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listUserMeetingRecordingsParameters` is of type [ListUserMeetingRecordingsParameters](./src/main/java/com/ringcentral/definitions/ListUserMeetingRecordingsParameters.java)
- `result` is of type [ListMeetingRecordingsResponse](./src/main/java/com/ringcentral/definitions/ListMeetingRecordingsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Recordings-listUserMeetingRecordings) in API Explorer.


## endMeeting
End Meeting

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).end().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-endMeeting) in API Explorer.


## readMeetingInvitation
Get Meeting Invitation

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/invitation`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PublicMeetingInvitationResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).invitation().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [PublicMeetingInvitationResponse](./src/main/java/com/ringcentral/definitions/PublicMeetingInvitationResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-readMeetingInvitation) in API Explorer.


## listMessages
Get Message List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store`
Rate Limit Group|`Light`
App Permission|`ReadMessages`
User Permission|`ReadMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetMessageList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore().list(listMessagesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listMessagesParameters` is of type [ListMessagesParameters](./src/main/java/com/ringcentral/definitions/ListMessagesParameters.java)
- `result` is of type [GetMessageList](./src/main/java/com/ringcentral/definitions/GetMessageList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-listMessages) in API Explorer.


## deleteMessageByFilter
Delete Conversation

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store`
Rate Limit Group|`Medium`
App Permission|`EditMessages`
User Permission|`EditMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore().deleteAll(deleteMessageByFilterParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `deleteMessageByFilterParameters` is of type [DeleteMessageByFilterParameters](./src/main/java/com/ringcentral/definitions/DeleteMessageByFilterParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-deleteMessageByFilter) in API Explorer.


## readMessage
Get Message

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}`
Rate Limit Group|`Light`
App Permission|`ReadMessages`
User Permission|`ReadMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetMessageInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessage) in API Explorer.


## updateMessage
Update Message List

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}`
Rate Limit Group|`Medium`
App Permission|`EditMessages`
User Permission|`EditMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetMessageInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).put(updateMessageRequest, updateMessageParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `updateMessageRequest` is of type [UpdateMessageRequest](./src/main/java/com/ringcentral/definitions/UpdateMessageRequest.java)
- `updateMessageParameters` is of type [UpdateMessageParameters](./src/main/java/com/ringcentral/definitions/UpdateMessageParameters.java)
- `result` is of type [GetMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetMessageInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessage) in API Explorer.


## deleteMessage
Delete Message

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}`
Rate Limit Group|`Medium`
App Permission|`EditMessages`
User Permission|`EditMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).delete(deleteMessageParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `deleteMessageParameters` is of type [DeleteMessageParameters](./src/main/java/com/ringcentral/definitions/DeleteMessageParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-deleteMessage) in API Explorer.


## syncMessages
Sync Messages

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-sync`
Rate Limit Group|`Light`
App Permission|`ReadMessages`
User Permission|`ReadMessages`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetMessageSyncResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageSync().get(syncMessagesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `syncMessagesParameters` is of type [SyncMessagesParameters](./src/main/java/com/ringcentral/definitions/SyncMessagesParameters.java)
- `result` is of type [GetMessageSyncResponse](./src/main/java/com/ringcentral/definitions/GetMessageSyncResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-syncMessages) in API Explorer.


## listExtensionPhoneNumbers
Get Extension Phone Number List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/phone-number`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserPhoneNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetExtensionPhoneNumbersResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).phoneNumber().get(listExtensionPhoneNumbersParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listExtensionPhoneNumbersParameters` is of type [ListExtensionPhoneNumbersParameters](./src/main/java/com/ringcentral/definitions/ListExtensionPhoneNumbersParameters.java)
- `result` is of type [GetExtensionPhoneNumbersResponse](./src/main/java/com/ringcentral/definitions/GetExtensionPhoneNumbersResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-listExtensionPhoneNumbers) in API Explorer.


## readUserPresenceStatus
Get User Presence Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/presence`
Rate Limit Group|`Light`
App Permission|`ReadPresence`
User Permission|`ReadPresenceStatus`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetPresenceInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).presence().get(readUserPresenceStatusParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readUserPresenceStatusParameters` is of type [ReadUserPresenceStatusParameters](./src/main/java/com/ringcentral/definitions/ReadUserPresenceStatusParameters.java)
- `result` is of type [GetPresenceInfo](./src/main/java/com/ringcentral/definitions/GetPresenceInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readUserPresenceStatus) in API Explorer.


## updateUserPresenceStatus
Update User Presence Status

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/presence`
Rate Limit Group|`Medium`
App Permission|`EditPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PresenceInfoResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).presence().put(presenceInfoRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `presenceInfoRequest` is of type [PresenceInfoRequest](./src/main/java/com/ringcentral/definitions/PresenceInfoRequest.java)
- `result` is of type [PresenceInfoResponse](./src/main/java/com/ringcentral/definitions/PresenceInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateUserPresenceStatus) in API Explorer.


## readUserProfileImage
Get User Profile Image

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
byte[] result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type `byte[]`

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readUserProfileImage) in API Explorer.


## createUserProfileImage
Upload User Profile Image

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`EditUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().post(createUserProfileImageRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createUserProfileImageRequest` is of type [CreateUserProfileImageRequest](./src/main/java/com/ringcentral/definitions/CreateUserProfileImageRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-createUserProfileImage) in API Explorer.


## updateUserProfileImage
Update User Profile Image

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`EditUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().put(updateUserProfileImageRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `updateUserProfileImageRequest` is of type [UpdateUserProfileImageRequest](./src/main/java/com/ringcentral/definitions/UpdateUserProfileImageRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateUserProfileImage) in API Explorer.


## readScaledProfileImage
Get Scaled User Profile Image

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image/{scaleSize}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
byte[] result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage(scaleSize).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type `byte[]`

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readScaledProfileImage) in API Explorer.


## createRingOutCall
Make RingOut Call

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/ring-out`
Rate Limit Group|`Heavy`
App Permission|`RingOut`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetRingOutStatusResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut().post(makeRingOutRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `makeRingOutRequest` is of type [MakeRingOutRequest](./src/main/java/com/ringcentral/definitions/MakeRingOutRequest.java)
- `result` is of type [GetRingOutStatusResponse](./src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-createRingOutCall) in API Explorer.


## readRingOutCallStatus
Get RingOut Call Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}`
Rate Limit Group|`Light`
App Permission|`RingOut`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
GetRingOutStatusResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut(ringoutId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [GetRingOutStatusResponse](./src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-readRingOutCallStatus) in API Explorer.


## deleteRingOutCall
Cancel RingOut Call

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}`
Rate Limit Group|`Heavy`
App Permission|`RingOut`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).ringOut(ringoutId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#RingOut-deleteRingOutCall) in API Explorer.


## readUnifiedPresence
Get Unified Presence

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/unified-presence`
Rate Limit Group|`Medium`
App Permission|`ReadPresence`
User Permission|`ReadPresenceStatus`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UnifiedPresence result = rc.restapi(apiVersion).account(accountId).extension(extensionId).unifiedPresence().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [UnifiedPresence](./src/main/java/com/ringcentral/definitions/UnifiedPresence.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readUnifiedPresence) in API Explorer.


## updateUnifiedPresence
Update Unified Presence

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/unified-presence`
Rate Limit Group|`Medium`
App Permission|`EditPresence`
User Permission|`EditPresenceStatus`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UnifiedPresence result = rc.restapi(apiVersion).account(accountId).extension(extensionId).unifiedPresence().patch(updateUnifiedPresence);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `updateUnifiedPresence` is of type [UpdateUnifiedPresence](./src/main/java/com/ringcentral/definitions/UpdateUnifiedPresence.java)
- `result` is of type [UnifiedPresence](./src/main/java/com/ringcentral/definitions/UnifiedPresence.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateUnifiedPresence) in API Explorer.


## readIVRPromptContent
Get IVR Prompt Content

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}/content`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyGreetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
byte[] result = rc.restapi(apiVersion).account(accountId).ivrPrompts(promptId).content().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type `byte[]`

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).

[Try it out](https://developer.ringcentral.com/api-reference#IVR-readIVRPromptContent) in API Explorer.


## listAccountMeetingRecordings
Get Account Meeting Recordings List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/meeting-recordings`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`MeetingsRecordings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ListMeetingRecordingsResponse result = rc.restapi(apiVersion).account(accountId).meetingRecordings().get(listAccountMeetingRecordingsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listAccountMeetingRecordingsParameters` is of type [ListAccountMeetingRecordingsParameters](./src/main/java/com/ringcentral/definitions/ListAccountMeetingRecordingsParameters.java)
- `result` is of type [ListMeetingRecordingsResponse](./src/main/java/com/ringcentral/definitions/ListMeetingRecordingsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Recordings-listAccountMeetingRecordings) in API Explorer.


## GetAccountLockedSetting
Get Locked Meeting Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/meeting/locked-settings`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AccountLockedSettingResponse result = rc.restapi(apiVersion).account(accountId).meeting().lockedSettings().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [AccountLockedSettingResponse](./src/main/java/com/ringcentral/definitions/AccountLockedSettingResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-GetAccountLockedSetting) in API Explorer.


## readMessageStoreConfiguration
Get Message Store Configuration

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/message-store-configuration`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`AccountAdministration`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageStoreConfiguration result = rc.restapi(apiVersion).account(accountId).messageStoreConfiguration().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageStoreConfiguration) in API Explorer.


## updateMessageStoreConfiguration
Update Message Store Configuration

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/message-store-configuration`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`AccountAdministration`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageStoreConfiguration result = rc.restapi(apiVersion).account(accountId).messageStoreConfiguration().put(messageStoreConfiguration);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `messageStoreConfiguration` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)
- `result` is of type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessageStoreConfiguration) in API Explorer.


## createMessageStoreReport
Create Message Store Report

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/message-store-report`
Rate Limit Group|`Heavy`
App Permission|`ReadMessages`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageStoreReport result = rc.restapi(apiVersion).account(accountId).messageStoreReport().post(createMessageStoreReportRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createMessageStoreReportRequest` is of type [CreateMessageStoreReportRequest](./src/main/java/com/ringcentral/definitions/CreateMessageStoreReportRequest.java)
- `result` is of type [MessageStoreReport](./src/main/java/com/ringcentral/definitions/MessageStoreReport.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-createMessageStoreReport) in API Explorer.


## readMessageStoreReportTask
Get Message Store Report Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/message-store-report/{taskId}`
Rate Limit Group|`Heavy`
App Permission|`ReadMessages`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageStoreReport result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [MessageStoreReport](./src/main/java/com/ringcentral/definitions/MessageStoreReport.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportTask) in API Explorer.


## readMessageStoreReportArchive
Get Message Store Report Archive

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/message-store-report/{taskId}/archive`
Rate Limit Group|`Heavy`
App Permission|`ReadMessages`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageStoreReportArchive result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).archive().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [MessageStoreReportArchive](./src/main/java/com/ringcentral/definitions/MessageStoreReportArchive.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchive) in API Explorer.


## readMessageStoreReportArchiveContent
Get Message Store Report Archive Content

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/message-store-report/{taskId}/archive/{archiveId}`
Rate Limit Group|`Heavy`
App Permission|`ReadMessages`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
byte[] result = rc.restapi(apiVersion).account(accountId).messageStoreReport(taskId).archive(archiveId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type `byte[]`

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchiveContent) in API Explorer.


## listPagingGroupDevices
Get Paging Group Devices

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/devices`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PagingOnlyGroupDevices result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).devices().get(listPagingGroupDevicesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listPagingGroupDevicesParameters` is of type [ListPagingGroupDevicesParameters](./src/main/java/com/ringcentral/definitions/ListPagingGroupDevicesParameters.java)
- `result` is of type [PagingOnlyGroupDevices](./src/main/java/com/ringcentral/definitions/PagingOnlyGroupDevices.java)

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-listPagingGroupDevices) in API Explorer.


## listPagingGroupUsers
Get Paging Group Users

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/users`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PagingOnlyGroupUsers result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).users().get(listPagingGroupUsersParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listPagingGroupUsersParameters` is of type [ListPagingGroupUsersParameters](./src/main/java/com/ringcentral/definitions/ListPagingGroupUsersParameters.java)
- `result` is of type [PagingOnlyGroupUsers](./src/main/java/com/ringcentral/definitions/PagingOnlyGroupUsers.java)

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-listPagingGroupUsers) in API Explorer.


## createCallOutCallSession
Make CallOut

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/call-out`
Rate Limit Group|`Heavy`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallSession result = rc.restapi(apiVersion).account(accountId).telephony().callOut().post(makeCallOutRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `makeCallOutRequest` is of type [MakeCallOutRequest](./src/main/java/com/ringcentral/definitions/MakeCallOutRequest.java)
- `result` is of type [CallSession](./src/main/java/com/ringcentral/definitions/CallSession.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-createCallOutCallSession) in API Explorer.


## createConferenceCallSession
Start Conference Call Session

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/conference`
Rate Limit Group|`Heavy`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallSessionObject result = rc.restapi(apiVersion).account(accountId).telephony().conference().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallSessionObject](./src/main/java/com/ringcentral/definitions/CallSessionObject.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-createConferenceCallSession) in API Explorer.


## readCallSessionStatus
Get Call Session Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallSessionObject result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).get(readCallSessionStatusParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `readCallSessionStatusParameters` is of type [ReadCallSessionStatusParameters](./src/main/java/com/ringcentral/definitions/ReadCallSessionStatusParameters.java)
- `result` is of type [CallSessionObject](./src/main/java/com/ringcentral/definitions/CallSessionObject.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-readCallSessionStatus) in API Explorer.


## deleteCallSession
Drop Call Session

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-deleteCallSession) in API Explorer.


## readCallPartyStatus
Get Call Party Status

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-readCallPartyStatus) in API Explorer.


## deleteCallParty
Delete Call Party

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}`
Rate Limit Group|`Light`
App Permission|`TelephonySessions`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-deleteCallParty) in API Explorer.


## updateCallParty
Update Call Party

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).patch(partyUpdateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `partyUpdateRequest` is of type [PartyUpdateRequest](./src/main/java/com/ringcentral/definitions/PartyUpdateRequest.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-updateCallParty) in API Explorer.


## superviseCallSession
Supervise Call Session

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/supervise`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SuperviseCallSession result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).supervise().post(superviseCallSessionRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `superviseCallSessionRequest` is of type [SuperviseCallSessionRequest](./src/main/java/com/ringcentral/definitions/SuperviseCallSessionRequest.java)
- `result` is of type [SuperviseCallSession](./src/main/java/com/ringcentral/definitions/SuperviseCallSession.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-superviseCallSession) in API Explorer.


## getAddressBookBulkUploadTask
Get Contacts Update Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/address-book-bulk-upload/tasks/{taskId}`
Rate Limit Group|`Light`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AddressBookBulkUploadResponse result = rc.restapi(apiVersion).account(accountId).addressBookBulkUpload().tasks(taskId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [AddressBookBulkUploadResponse](./src/main/java/com/ringcentral/definitions/AddressBookBulkUploadResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-getAddressBookBulkUploadTask) in API Explorer.


## updateCallMonitoringGroupList
Update Call Monitoring Group List

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).bulkAssign().post(callMonitoringBulkAssign);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callMonitoringBulkAssign` is of type [CallMonitoringBulkAssign](./src/main/java/com/ringcentral/definitions/CallMonitoringBulkAssign.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-updateCallMonitoringGroupList) in API Explorer.


## listCallMonitoringGroupMembers
Get Call Monitoring Group Member List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}/members`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallMonitoringGroupMemberList result = rc.restapi(apiVersion).account(accountId).callMonitoringGroups(groupId).members().get(listCallMonitoringGroupMembersParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listCallMonitoringGroupMembersParameters` is of type [ListCallMonitoringGroupMembersParameters](./src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupMembersParameters.java)
- `result` is of type [CallMonitoringGroupMemberList](./src/main/java/com/ringcentral/definitions/CallMonitoringGroupMemberList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-listCallMonitoringGroupMembers) in API Explorer.


## listCallRecordingCustomGreetings
Get Call Recording Custom Greeting List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-recording/custom-greetings`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallRecordingCustomGreetings result = rc.restapi(apiVersion).account(accountId).callRecording().customGreetings().get(listCallRecordingCustomGreetingsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listCallRecordingCustomGreetingsParameters` is of type [ListCallRecordingCustomGreetingsParameters](./src/main/java/com/ringcentral/definitions/ListCallRecordingCustomGreetingsParameters.java)
- `result` is of type [CallRecordingCustomGreetings](./src/main/java/com/ringcentral/definitions/CallRecordingCustomGreetings.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-listCallRecordingCustomGreetings) in API Explorer.


## deleteCallRecordingCustomGreetingList
Delete Call Recording Custom Greeting List

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-recording/custom-greetings`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).callRecording().customGreetings().deleteAll();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-deleteCallRecordingCustomGreetingList) in API Explorer.


## deleteCallRecordingCustomGreeting
Delete Call Recording Custom Greeting

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/call-recording/custom-greetings/{greetingId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).callRecording().customGreetings(greetingId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-deleteCallRecordingCustomGreeting) in API Explorer.


## listDevicesAutomaticLocationUpdates
Get Device List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/devices`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ListDevicesAutomaticLocationUpdates result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().devices().get(listDevicesAutomaticLocationUpdatesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listDevicesAutomaticLocationUpdatesParameters` is of type [ListDevicesAutomaticLocationUpdatesParameters](./src/main/java/com/ringcentral/definitions/ListDevicesAutomaticLocationUpdatesParameters.java)
- `result` is of type [ListDevicesAutomaticLocationUpdates](./src/main/java/com/ringcentral/definitions/ListDevicesAutomaticLocationUpdates.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listDevicesAutomaticLocationUpdates) in API Explorer.


## listNetworks
Get Network Map

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
NetworksList result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [NetworksList](./src/main/java/com/ringcentral/definitions/NetworksList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listNetworks) in API Explorer.


## createNetwork
Create Network

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
NetworkInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks().post(createNetworkRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createNetworkRequest` is of type [CreateNetworkRequest](./src/main/java/com/ringcentral/definitions/CreateNetworkRequest.java)
- `result` is of type [NetworkInfo](./src/main/java/com/ringcentral/definitions/NetworkInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createNetwork) in API Explorer.


## readNetwork
Get Network

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks/{networkId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
NetworkInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [NetworkInfo](./src/main/java/com/ringcentral/definitions/NetworkInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readNetwork) in API Explorer.


## updateNetwork
Update Network

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks/{networkId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).put(updateNetworkRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `updateNetworkRequest` is of type [UpdateNetworkRequest](./src/main/java/com/ringcentral/definitions/UpdateNetworkRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateNetwork) in API Explorer.


## deleteNetwork
Delete Network

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks/{networkId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteNetwork) in API Explorer.


## listAccountSwitches
Get Account Switch List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SwitchesList result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches().list(listAccountSwitchesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listAccountSwitchesParameters` is of type [ListAccountSwitchesParameters](./src/main/java/com/ringcentral/definitions/ListAccountSwitchesParameters.java)
- `result` is of type [SwitchesList](./src/main/java/com/ringcentral/definitions/SwitchesList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listAccountSwitches) in API Explorer.


## createSwitch
Create Switch

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SwitchInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches().post(createSwitchInfo);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createSwitchInfo` is of type [CreateSwitchInfo](./src/main/java/com/ringcentral/definitions/CreateSwitchInfo.java)
- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createSwitch) in API Explorer.


## readSwitch
Get Switch

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches/{switchId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SwitchInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readSwitch) in API Explorer.


## updateSwitch
Update Switch

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches/{switchId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SwitchInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).put(updateSwitchInfo);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `updateSwitchInfo` is of type [UpdateSwitchInfo](./src/main/java/com/ringcentral/definitions/UpdateSwitchInfo.java)
- `result` is of type [SwitchInfo](./src/main/java/com/ringcentral/definitions/SwitchInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateSwitch) in API Explorer.


## deleteSwitch
Delete Switch

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches/{switchId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switches(switchId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteSwitch) in API Explorer.


## readAutomaticLocationUpdatesTask
Get Emergency Map Configuration Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/tasks/{taskId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AutomaticLocationUpdatesTaskInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().tasks(taskId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [AutomaticLocationUpdatesTaskInfo](./src/main/java/com/ringcentral/definitions/AutomaticLocationUpdatesTaskInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readAutomaticLocationUpdatesTask) in API Explorer.


## listAutomaticLocationUpdatesUsers
Get User List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/users`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AutomaticLocationUpdatesUserList result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().users().get(listAutomaticLocationUpdatesUsersParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listAutomaticLocationUpdatesUsersParameters` is of type [ListAutomaticLocationUpdatesUsersParameters](./src/main/java/com/ringcentral/definitions/ListAutomaticLocationUpdatesUsersParameters.java)
- `result` is of type [AutomaticLocationUpdatesUserList](./src/main/java/com/ringcentral/definitions/AutomaticLocationUpdatesUserList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listAutomaticLocationUpdatesUsers) in API Explorer.


## assignMultipleAutomaticaLocationUpdatesUsers
Enable Automatic Location Updates for Users

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/users/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().users().bulkAssign().post(bulkAssignAutomaticLocationUpdatesUsers);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `bulkAssignAutomaticLocationUpdatesUsers` is of type [BulkAssignAutomaticLocationUpdatesUsers](./src/main/java/com/ringcentral/definitions/BulkAssignAutomaticLocationUpdatesUsers.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-assignMultipleAutomaticaLocationUpdatesUsers) in API Explorer.


## listWirelessPoints
Get Wireless Point List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
WirelessPointsList result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints().list(listWirelessPointsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listWirelessPointsParameters` is of type [ListWirelessPointsParameters](./src/main/java/com/ringcentral/definitions/ListWirelessPointsParameters.java)
- `result` is of type [WirelessPointsList](./src/main/java/com/ringcentral/definitions/WirelessPointsList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listWirelessPoints) in API Explorer.


## createWirelessPoint
Create Wireless Point

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
WirelessPointInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints().post(createWirelessPoint);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createWirelessPoint` is of type [CreateWirelessPoint](./src/main/java/com/ringcentral/definitions/CreateWirelessPoint.java)
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createWirelessPoint) in API Explorer.


## readWirelessPoint
Get Wireless Point

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
WirelessPointInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readWirelessPoint) in API Explorer.


## updateWirelessPoint
Update Wireless Point

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
WirelessPointInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).put(updateWirelessPoint);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `updateWirelessPoint` is of type [UpdateWirelessPoint](./src/main/java/com/ringcentral/definitions/UpdateWirelessPoint.java)
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateWirelessPoint) in API Explorer.


## deleteWirelessPoint
Delete Wireless Point

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPoints(pointId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteWirelessPoint) in API Explorer.


## listContacts
Get Contact List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact`
Rate Limit Group|`Heavy`
App Permission|`ReadContacts`
User Permission|`ReadPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ContactList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact().list(listContactsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listContactsParameters` is of type [ListContactsParameters](./src/main/java/com/ringcentral/definitions/ListContactsParameters.java)
- `result` is of type [ContactList](./src/main/java/com/ringcentral/definitions/ContactList.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listContacts) in API Explorer.


## createContact
Create Contact

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact`
Rate Limit Group|`Heavy`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PersonalContactResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact().post(personalContactRequest, createContactParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `personalContactRequest` is of type [PersonalContactRequest](./src/main/java/com/ringcentral/definitions/PersonalContactRequest.java)
- `createContactParameters` is of type [CreateContactParameters](./src/main/java/com/ringcentral/definitions/CreateContactParameters.java)
- `result` is of type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-createContact) in API Explorer.


## readContact
Get Contact

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`
Rate Limit Group|`Heavy`
App Permission|`ReadContacts`
User Permission|`ReadPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PersonalContactResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-readContact) in API Explorer.


## updateContact
Update Contact

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`
Rate Limit Group|`Heavy`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PersonalContactResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).put(personalContactRequest, updateContactParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `personalContactRequest` is of type [PersonalContactRequest](./src/main/java/com/ringcentral/definitions/PersonalContactRequest.java)
- `updateContactParameters` is of type [UpdateContactParameters](./src/main/java/com/ringcentral/definitions/UpdateContactParameters.java)
- `result` is of type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateContact) in API Explorer.


## deleteContact
Delete Contact

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`
Rate Limit Group|`Heavy`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-deleteContact) in API Explorer.


## checkUserPermission
Check User Permission

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/authz-profile/check`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AuthProfileCheckResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).authzProfile().check().get(checkUserPermissionParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `checkUserPermissionParameters` is of type [CheckUserPermissionParameters](./src/main/java/com/ringcentral/definitions/CheckUserPermissionParameters.java)
- `result` is of type [AuthProfileCheckResource](./src/main/java/com/ringcentral/definitions/AuthProfileCheckResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Permissions-checkUserPermission) in API Explorer.


## readExtensionCallQueuePresence
Get Agent’s Call Queue Presence

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-queue-presence`
Rate Limit Group|`Light`
App Permission|`ReadPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ExtensionCallQueuePresenceList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callQueuePresence().get(readExtensionCallQueuePresenceParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readExtensionCallQueuePresenceParameters` is of type [ReadExtensionCallQueuePresenceParameters](./src/main/java/com/ringcentral/definitions/ReadExtensionCallQueuePresenceParameters.java)
- `result` is of type [ExtensionCallQueuePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueuePresenceList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readExtensionCallQueuePresence) in API Explorer.


## updateExtensionCallQueuePresence
Update Call Queue Presence

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-queue-presence`
Rate Limit Group|`Medium`
App Permission|`EditPresence`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ExtensionCallQueuePresenceList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callQueuePresence().put(extensionCallQueueUpdatePresenceList);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `extensionCallQueueUpdatePresenceList` is of type [ExtensionCallQueueUpdatePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueueUpdatePresenceList.java)
- `result` is of type [ExtensionCallQueuePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueuePresenceList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateExtensionCallQueuePresence) in API Explorer.


## getExtensionEmergencyLocations
Get User Emergency Location List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserEmergencyLocationList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).emergencyLocations().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [UserEmergencyLocationList](./src/main/java/com/ringcentral/definitions/UserEmergencyLocationList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-getExtensionEmergencyLocations) in API Explorer.


## createUserMeetingProfileImage
Upload User Meeting Profile Image

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting-configuration/profile-image`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingConfiguration().profileImage().post(createUserMeetingProfileImageRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createUserMeetingProfileImageRequest` is of type [CreateUserMeetingProfileImageRequest](./src/main/java/com/ringcentral/definitions/CreateUserMeetingProfileImageRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-createUserMeetingProfileImage) in API Explorer.


## readMeetingServiceInfo
Get Meeting Service Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/service-info`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingServiceInfoResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().serviceInfo().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [MeetingServiceInfoResource](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readMeetingServiceInfo) in API Explorer.


## updateMeetingServiceInfo
Update Meeting Service Info

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/service-info`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingServiceInfoResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().serviceInfo().patch(meetingServiceInfoRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `meetingServiceInfoRequest` is of type [MeetingServiceInfoRequest](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoRequest.java)
- `result` is of type [MeetingServiceInfoResource](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-updateMeetingServiceInfo) in API Explorer.


## readMessageContent
Get Message Content

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId}`
Rate Limit Group|`Medium`
App Permission|`ReadMessages`
User Permission|`ReadMessageContent`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
byte[] result = rc.restapi(apiVersion).account(accountId).extension(extensionId).messageStore(messageId).content(attachmentId).get(readMessageContentParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readMessageContentParameters` is of type [ReadMessageContentParameters](./src/main/java/com/ringcentral/definitions/ReadMessageContentParameters.java)
- `result` is of type `byte[]`

### ❗❗❗ Code sample above may not work

Please refer to [Binary content downloading](/README.md#Binary-content-downloading).

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageContent) in API Explorer.


## readUserVideoConfiguration
Get User Video Configuration

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/video-configuration`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserVideoConfiguration result = rc.restapi(apiVersion).account(accountId).extension(extensionId).videoConfiguration().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [UserVideoConfiguration](./src/main/java/com/ringcentral/definitions/UserVideoConfiguration.java)

[Try it out](https://developer.ringcentral.com/api-reference#Video-Configuration-readUserVideoConfiguration) in API Explorer.


## updateUserVideoConfiguration
Update User Video Configuration

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/video-configuration`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UserVideoConfiguration result = rc.restapi(apiVersion).account(accountId).extension(extensionId).videoConfiguration().put(userVideoConfiguration);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `userVideoConfiguration` is of type [UserVideoConfiguration](./src/main/java/com/ringcentral/definitions/UserVideoConfiguration.java)
- `result` is of type [UserVideoConfiguration](./src/main/java/com/ringcentral/definitions/UserVideoConfiguration.java)

[Try it out](https://developer.ringcentral.com/api-reference#Video-Configuration-updateUserVideoConfiguration) in API Explorer.


## assignMultiplePagingGroupUsersDevices
Assign Paging Group Users and Devices

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`Groups`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).pagingOnlyGroups(pagingOnlyGroupId).bulkAssign().post(editPagingGroupRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `editPagingGroupRequest` is of type [EditPagingGroupRequest](./src/main/java/com/ringcentral/definitions/EditPagingGroupRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-assignMultiplePagingGroupUsersDevices) in API Explorer.


## assignMultipleDevicesAutomaticLocationUpdates
Enable Automatic Location Updates for Devices

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/devices/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().devices().bulkAssign().post(assignMultipleDevicesAutomaticLocationUpdates);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `assignMultipleDevicesAutomaticLocationUpdates` is of type [AssignMultipleDevicesAutomaticLocationUpdates](./src/main/java/com/ringcentral/definitions/AssignMultipleDevicesAutomaticLocationUpdates.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-assignMultipleDevicesAutomaticLocationUpdates) in API Explorer.


## createMultipleSwitches
Create Multiple Switches

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches-bulk-create`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CreateMultipleSwitchesResponse result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkCreate().post(createMultipleSwitchesRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createMultipleSwitchesRequest` is of type [CreateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/CreateMultipleSwitchesRequest.java)
- `result` is of type [CreateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/CreateMultipleSwitchesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createMultipleSwitches) in API Explorer.


## updateMultipleSwitches
Update Multiple Switches

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches-bulk-update`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UpdateMultipleSwitchesResponse result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkUpdate().post(updateMultipleSwitchesRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `updateMultipleSwitchesRequest` is of type [UpdateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/UpdateMultipleSwitchesRequest.java)
- `result` is of type [UpdateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/UpdateMultipleSwitchesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateMultipleSwitches) in API Explorer.


## validateMultipleSwitches
Validate Multiple Switches

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches-bulk-validate`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ValidateMultipleSwitchesResponse result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().switchesBulkValidate().post(validateMultipleSwitchesRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `validateMultipleSwitchesRequest` is of type [ValidateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/ValidateMultipleSwitchesRequest.java)
- `result` is of type [ValidateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/ValidateMultipleSwitchesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-validateMultipleSwitches) in API Explorer.


## createMultipleWirelessPoints
Create Multiple Wireless Points

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-create`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CreateMultipleWirelessPointsResponse result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkCreate().post(createMultipleWirelessPointsRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `createMultipleWirelessPointsRequest` is of type [CreateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/CreateMultipleWirelessPointsRequest.java)
- `result` is of type [CreateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/CreateMultipleWirelessPointsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createMultipleWirelessPoints) in API Explorer.


## updateMultipleWirelessPoints
Update Multiple Wireless Points

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-update`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
UpdateMultipleWirelessPointsResponse result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkUpdate().post(updateMultipleWirelessPointsRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `updateMultipleWirelessPointsRequest` is of type [UpdateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/UpdateMultipleWirelessPointsRequest.java)
- `result` is of type [UpdateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/UpdateMultipleWirelessPointsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateMultipleWirelessPoints) in API Explorer.


## validateMultipleWirelessPoints
Validate Multiple Wireless Points

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-validate`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`ConfigureEmergencyMaps`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ValidateMultipleWirelessPointsResponse result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().wirelessPointsBulkValidate().post(validateMultipleWirelessPointsRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `validateMultipleWirelessPointsRequest` is of type [ValidateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/ValidateMultipleWirelessPointsRequest.java)
- `result` is of type [ValidateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/ValidateMultipleWirelessPointsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-validateMultipleWirelessPoints) in API Explorer.


## listBlockedAllowedNumbers
Get Blocked/Allowed Phone Numbers

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
BlockedAllowedPhoneNumbersList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers().list(listBlockedAllowedNumbersParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listBlockedAllowedNumbersParameters` is of type [ListBlockedAllowedNumbersParameters](./src/main/java/com/ringcentral/definitions/ListBlockedAllowedNumbersParameters.java)
- `result` is of type [BlockedAllowedPhoneNumbersList](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumbersList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-listBlockedAllowedNumbers) in API Explorer.


## createBlockedAllowedNumber
Add Blocked/Allowed Number

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
BlockedAllowedPhoneNumberInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers().post(addBlockedAllowedPhoneNumber);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `addBlockedAllowedPhoneNumber` is of type [AddBlockedAllowedPhoneNumber](./src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.java)
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-createBlockedAllowedNumber) in API Explorer.


## readBlockedAllowedNumber
Get Blocked/Allowed Number

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
BlockedAllowedPhoneNumberInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-readBlockedAllowedNumber) in API Explorer.


## updateBlockedAllowedNumber
Update Blocked/Allowed Number

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
BlockedAllowedPhoneNumberInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).put(addBlockedAllowedPhoneNumber);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `addBlockedAllowedPhoneNumber` is of type [AddBlockedAllowedPhoneNumber](./src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.java)
- `result` is of type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateBlockedAllowedNumber) in API Explorer.


## deleteBlockedAllowedNumber
Delete Blocked/Allowed Number

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditBlockedNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerBlocking().phoneNumbers(blockedNumberId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-deleteBlockedAllowedNumber) in API Explorer.


## GetUserSetting
Get Meeting User Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/user-settings`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingUserSettingsResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting().userSettings().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [MeetingUserSettingsResponse](./src/main/java/com/ringcentral/definitions/MeetingUserSettingsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-GetUserSetting) in API Explorer.


## readAssistants
Get Assistants

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meetings-configuration/assistants`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AssistantsResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingsConfiguration().assistants().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [AssistantsResource](./src/main/java/com/ringcentral/definitions/AssistantsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readAssistants) in API Explorer.


## readAssistedUsers
Get Assisted Users

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meetings-configuration/assisted`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AssistedUsersResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingsConfiguration().assisted().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [AssistedUsersResource](./src/main/java/com/ringcentral/definitions/AssistedUsersResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readAssistedUsers) in API Explorer.


## readNotificationSettings
Get Notification Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/notification-settings`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadMessagesNotificationsSettings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
NotificationSettings result = rc.restapi(apiVersion).account(accountId).extension(extensionId).notificationSettings().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [NotificationSettings](./src/main/java/com/ringcentral/definitions/NotificationSettings.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-readNotificationSettings) in API Explorer.


## updateNotificationSettings
Update Notification Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/notification-settings`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditMessagesNotificationsSettings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
NotificationSettings result = rc.restapi(apiVersion).account(accountId).extension(extensionId).notificationSettings().put(notificationSettingsUpdateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `notificationSettingsUpdateRequest` is of type [NotificationSettingsUpdateRequest](./src/main/java/com/ringcentral/definitions/NotificationSettingsUpdateRequest.java)
- `result` is of type [NotificationSettings](./src/main/java/com/ringcentral/definitions/NotificationSettings.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateNotificationSettings) in API Explorer.


## createCallPartyWithBringIn
Bring-In Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/bring-in`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties().bringIn().post(addPartyRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `addPartyRequest` is of type [AddPartyRequest](./src/main/java/com/ringcentral/definitions/AddPartyRequest.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-createCallPartyWithBringIn) in API Explorer.


## answerCallParty
Answer Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/answer`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).answer().post(answerTarget);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `answerTarget` is of type [AnswerTarget](./src/main/java/com/ringcentral/definitions/AnswerTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-answerCallParty) in API Explorer.


## bridgeCallParty
Bridge Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/bridge`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).bridge().post(bridgeTargetRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `bridgeTargetRequest` is of type [BridgeTargetRequest](./src/main/java/com/ringcentral/definitions/BridgeTargetRequest.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-bridgeCallParty) in API Explorer.


## callFlipParty
Call Flip on Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/flip`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).flip().post(callPartyFlip);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callPartyFlip` is of type [CallPartyFlip](./src/main/java/com/ringcentral/definitions/CallPartyFlip.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-callFlipParty) in API Explorer.


## forwardCallParty
Forward Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/forward`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).forward().post(forwardTarget);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `forwardTarget` is of type [ForwardTarget](./src/main/java/com/ringcentral/definitions/ForwardTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-forwardCallParty) in API Explorer.


## holdCallParty
Hold Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/hold`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).hold().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-holdCallParty) in API Explorer.


## ignoreCallInQueue
Ignore Call in Queue

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/ignore`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).ignore().post(ignoreRequestBody);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `ignoreRequestBody` is of type [IgnoreRequestBody](./src/main/java/com/ringcentral/definitions/IgnoreRequestBody.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-ignoreCallInQueue) in API Explorer.


## callParkParty
Call Park

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/park`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).park().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-callParkParty) in API Explorer.


## pickupCallParty
Pickup Call

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/pickup`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).pickup().post(pickupTarget);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `pickupTarget` is of type [PickupTarget](./src/main/java/com/ringcentral/definitions/PickupTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-pickupCallParty) in API Explorer.


## startCallRecording
Create Recording

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).recordings().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-startCallRecording) in API Explorer.


## pauseResumeCallRecording
Pause/Resume Recording

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings/{recordingId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallRecording result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).recordings(recordingId).patch(callRecordingUpdate, pauseResumeCallRecordingParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callRecordingUpdate` is of type [CallRecordingUpdate](./src/main/java/com/ringcentral/definitions/CallRecordingUpdate.java)
- `pauseResumeCallRecordingParameters` is of type [PauseResumeCallRecordingParameters](./src/main/java/com/ringcentral/definitions/PauseResumeCallRecordingParameters.java)
- `result` is of type [CallRecording](./src/main/java/com/ringcentral/definitions/CallRecording.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-pauseResumeCallRecording) in API Explorer.


## rejectParty
Reject Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reject`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).reject().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-rejectParty) in API Explorer.


## replyParty
Reply with Text

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reply`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ReplyParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).reply().post(callPartyReply);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callPartyReply` is of type [CallPartyReply](./src/main/java/com/ringcentral/definitions/CallPartyReply.java)
- `result` is of type [ReplyParty](./src/main/java/com/ringcentral/definitions/ReplyParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-replyParty) in API Explorer.


## superviseCallParty
Supervise Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/supervise`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PartySuperviseResponse result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).supervise().post(partySuperviseRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `partySuperviseRequest` is of type [PartySuperviseRequest](./src/main/java/com/ringcentral/definitions/PartySuperviseRequest.java)
- `result` is of type [PartySuperviseResponse](./src/main/java/com/ringcentral/definitions/PartySuperviseResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-superviseCallParty) in API Explorer.


## transferCallParty
Transfer Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/transfer`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).transfer().post(transferTarget);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `transferTarget` is of type [TransferTarget](./src/main/java/com/ringcentral/definitions/TransferTarget.java)
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-transferCallParty) in API Explorer.


## unholdCallParty
Unhold Call Party

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/unhold`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallParty result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).unhold().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallParty](./src/main/java/com/ringcentral/definitions/CallParty.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-unholdCallParty) in API Explorer.