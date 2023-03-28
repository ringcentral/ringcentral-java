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
ApiVersionsList result = rc.restapi().list();
rc.revoke();
```

- `result` is of type [ApiVersionsList](./src/main/java/com/ringcentral/definitions/ApiVersionsList.java)

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
ApiVersionInfo result = rc.restapi(apiVersion).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [ApiVersionInfo](./src/main/java/com/ringcentral/definitions/ApiVersionInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#API-Info-readAPIVersion) in API Explorer.

## authorize

OAuth 2.0 Authorization

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/oauth/authorize`
Rate Limit Group|`Auth`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi().oauth().authorize().get();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#OAuth/OIDC-authorize) in API Explorer.

## authorize2

OAuth 2.0 Authorization (POST)

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/oauth/authorize`
Rate Limit Group|`Auth`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi().oauth().authorize().post(AuthorizeRequest);
rc.revoke();
```

- `AuthorizeRequest` is of type [AuthorizeRequest](./src/main/java/com/ringcentral/definitions/AuthorizeRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#OAuth/OIDC-authorize2) in API Explorer.

## getToken

Get OAuth Token

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
TokenInfo result = rc.restapi().oauth().token().post(GetTokenRequest);
rc.revoke();
```

- `GetTokenRequest` is of type [GetTokenRequest](./src/main/java/com/ringcentral/definitions/GetTokenRequest.java)
- `result` is of type [TokenInfo](./src/main/java/com/ringcentral/definitions/TokenInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#OAuth/OIDC-getToken) in API Explorer.

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

## readCompanyCallLog

List Company Call Records

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
- `readCompanyCallLogParameters` is of
  type [ReadCompanyCallLogParameters](./src/main/java/com/ringcentral/definitions/ReadCompanyCallLogParameters.java)
- `result` is of type [AccountCallLogResponse](./src/main/java/com/ringcentral/definitions/AccountCallLogResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallLog) in API Explorer.

## readCompanyCallRecord

Get Company Call Record(s)

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
CompanyCallLogRecord result = rc.restapi(apiVersion).account(accountId).callLog(callRecordId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CompanyCallLogRecord](./src/main/java/com/ringcentral/definitions/CompanyCallLogRecord.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readCompanyCallRecord) in API Explorer.

## listExtensions

List Extensions

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
- `listExtensionsParameters` is of
  type [ListExtensionsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionsParameters.java)
- `result` is of
  type [GetExtensionListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionListResponse.java)

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
- `extensionCreationRequest` is of
  type [ExtensionCreationRequest](./src/main/java/com/ringcentral/definitions/ExtensionCreationRequest.java)
- `result` is of
  type [ExtensionCreationResponse](./src/main/java/com/ringcentral/definitions/ExtensionCreationResponse.java)

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
- `result` is of
  type [GetExtensionInfoResponse](./src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.java)

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
- `extensionUpdateRequest` is of
  type [ExtensionUpdateRequest](./src/main/java/com/ringcentral/definitions/ExtensionUpdateRequest.java)
- `result` is of
  type [GetExtensionInfoResponse](./src/main/java/com/ringcentral/definitions/GetExtensionInfoResponse.java)

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
- `deleteExtensionParameters` is of
  type [DeleteExtensionParameters](./src/main/java/com/ringcentral/definitions/DeleteExtensionParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-deleteExtension) in API Explorer.

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
- `createCompanyGreetingRequest` is of
  type [CreateCompanyGreetingRequest](./src/main/java/com/ringcentral/definitions/CreateCompanyGreetingRequest.java)
- `result` is of
  type [CustomCompanyGreetingInfo](./src/main/java/com/ringcentral/definitions/CustomCompanyGreetingInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Greetings-createCompanyGreeting) in API Explorer.

## readIVRMenuList

Get IVR Menu list

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/ivr-menus`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
IVRMenuList result = rc.restapi(apiVersion).account(accountId).ivrMenus().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [IVRMenuList](./src/main/java/com/ringcentral/definitions/IVRMenuList.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-readIVRMenuList) in API Explorer.

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
- `result` is of
  type [GetCallRecordingResponse](./src/main/java/com/ringcentral/definitions/GetCallRecordingResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recordings-readCallRecording) in API Explorer.

## listCountries

List Countries

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
CountryListDictionaryModel result = rc.restapi(apiVersion).dictionary().country().list(listCountriesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listCountriesParameters` is of
  type [ListCountriesParameters](./src/main/java/com/ringcentral/definitions/ListCountriesParameters.java)
- `result` is of
  type [CountryListDictionaryModel](./src/main/java/com/ringcentral/definitions/CountryListDictionaryModel.java)

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
CountryInfoDictionaryModel result = rc.restapi(apiVersion).dictionary().country(countryId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of
  type [CountryInfoDictionaryModel](./src/main/java/com/ringcentral/definitions/CountryInfoDictionaryModel.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readCountry) in API Explorer.

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
SubscriptionListResource result = rc.restapi(apiVersion).subscription().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of
  type [SubscriptionListResource](./src/main/java/com/ringcentral/definitions/SubscriptionListResource.java)

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
- `createSubscriptionRequest` is of
  type [CreateSubscriptionRequest](./src/main/java/com/ringcentral/definitions/CreateSubscriptionRequest.java)
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
SubscriptionInfo result = rc.restapi(apiVersion).subscription(subscriptionId).put(updateSubscriptionRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `updateSubscriptionRequest` is of
  type [UpdateSubscriptionRequest](./src/main/java/com/ringcentral/definitions/UpdateSubscriptionRequest.java)
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

## scimListResourceTypes2

List Resource Types

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/ResourceTypes`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ScimResourceTypeSearchResponse result = rc.scim(version).resourceTypes().list();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is of
  type [ScimResourceTypeSearchResponse](./src/main/java/com/ringcentral/definitions/ScimResourceTypeSearchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimListResourceTypes2) in API Explorer.

## scimGetResourceType2

Get Resource Type

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/ResourceTypes/{type}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ScimResourceTypeResponse result = rc.scim(version).resourceTypes(type).get();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is of
  type [ScimResourceTypeResponse](./src/main/java/com/ringcentral/definitions/ScimResourceTypeResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimGetResourceType2) in API Explorer.

## scimListSchemas2

List Schemas

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/Schemas`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ScimSchemaSearchResponse result = rc.scim(version).schemas().list();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is of
  type [ScimSchemaSearchResponse](./src/main/java/com/ringcentral/definitions/ScimSchemaSearchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimListSchemas2) in API Explorer.

## scimGetSchema2

Get Schema

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/Schemas/{uri}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ScimSchemaResponse result = rc.scim(version).schemas(uri).get();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is of type [ScimSchemaResponse](./src/main/java/com/ringcentral/definitions/ScimSchemaResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimGetSchema2) in API Explorer.

## scimSearchViaGet2

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
ScimUserSearchResponse result = rc.scim(version).users().list(scimSearchViaGet2Parameters);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `scimSearchViaGet2Parameters` is of
  type [ScimSearchViaGet2Parameters](./src/main/java/com/ringcentral/definitions/ScimSearchViaGet2Parameters.java)
- `result` is of type [ScimUserSearchResponse](./src/main/java/com/ringcentral/definitions/ScimUserSearchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimSearchViaGet2) in API Explorer.

## scimCreateUser2

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
ScimUserResponse result = rc.scim(version).users().post(scimUser);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `scimUser` is of type [ScimUser](./src/main/java/com/ringcentral/definitions/ScimUser.java)
- `result` is of type [ScimUserResponse](./src/main/java/com/ringcentral/definitions/ScimUserResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimCreateUser2) in API Explorer.

## scimGetUser2

Get User

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/Users/{scimUserId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ScimUserResponse result = rc.scim(version).users(scimUserId).get();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is of type [ScimUserResponse](./src/main/java/com/ringcentral/definitions/ScimUserResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimGetUser2) in API Explorer.

## scimUpdateUser2

Update/Replace User

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/scim/{version}/Users/{scimUserId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ScimUserResponse result = rc.scim(version).users(scimUserId).put(scimUser);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `scimUser` is of type [ScimUser](./src/main/java/com/ringcentral/definitions/ScimUser.java)
- `result` is of type [ScimUserResponse](./src/main/java/com/ringcentral/definitions/ScimUserResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimUpdateUser2) in API Explorer.

## scimDeleteUser2

Delete User

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/scim/{version}/Users/{scimUserId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.scim(version).users(scimUserId).delete();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimDeleteUser2) in API Explorer.

## scimPatchUser2

Update/Patch User

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/scim/{version}/Users/{scimUserId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ScimUserResponse result = rc.scim(version).users(scimUserId).patch(scimUserPatch);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `scimUserPatch` is of type [ScimUserPatch](./src/main/java/com/ringcentral/definitions/ScimUserPatch.java)
- `result` is of type [ScimUserResponse](./src/main/java/com/ringcentral/definitions/ScimUserResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimPatchUser2) in API Explorer.

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
String result = rc.restapi().oauth().revoke().post(RevokeTokenRequest);
rc.revoke();
```

- `RevokeTokenRequest` is of
  type [RevokeTokenRequest](./src/main/java/com/ringcentral/definitions/RevokeTokenRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#OAuth/OIDC-revokeToken) in API Explorer.

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
- `readDeviceParameters` is of
  type [ReadDeviceParameters](./src/main/java/com/ringcentral/definitions/ReadDeviceParameters.java)
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
- `accountDeviceUpdate` is of
  type [AccountDeviceUpdate](./src/main/java/com/ringcentral/definitions/AccountDeviceUpdate.java)
- `updateDeviceParameters` is of
  type [UpdateDeviceParameters](./src/main/java/com/ringcentral/definitions/UpdateDeviceParameters.java)
- `result` is of type [GetDeviceInfoResponse](./src/main/java/com/ringcentral/definitions/GetDeviceInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-updateDevice) in API Explorer.

## readAccountMeeting

Get Account-level Meeting Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/meeting/{meetingId}`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingResponseResource result = rc.restapi(apiVersion).account(accountId).meeting(meetingId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of
  type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-readAccountMeeting) in API Explorer.

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
- `readAccountPresenceParameters` is of
  type [ReadAccountPresenceParameters](./src/main/java/com/ringcentral/definitions/ReadAccountPresenceParameters.java)
- `result` is of type [AccountPresenceInfo](./src/main/java/com/ringcentral/definitions/AccountPresenceInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-readAccountPresence) in API Explorer.

## listStates

List States

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
- `listStatesParameters` is of
  type [ListStatesParameters](./src/main/java/com/ringcentral/definitions/ListStatesParameters.java)
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

## scimGetProviderConfig2

Get Provider Config

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/scim/{version}/ServiceProviderConfig`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ScimProviderConfig result = rc.scim(version).serviceProviderConfig().get();
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `result` is of type [ScimProviderConfig](./src/main/java/com/ringcentral/definitions/ScimProviderConfig.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimGetProviderConfig2) in API Explorer.

## scimSearchViaPost2

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
ScimUserSearchResponse result = rc.scim(version).users().dotSearch().post(scimSearchRequest);
rc.revoke();
```

- Parameter `version` is optional with default value `v2`
- `scimSearchRequest` is of type [ScimSearchRequest](./src/main/java/com/ringcentral/definitions/ScimSearchRequest.java)
- `result` is of type [ScimUserSearchResponse](./src/main/java/com/ringcentral/definitions/ScimUserSearchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SCIM-scimSearchViaPost2) in API Explorer.

## listGlipChatsNew

List Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/chats`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMChatList result = rc.teamMessaging(version).chats().list(listGlipChatsNewParameters);
rc.revoke();
```

- `listGlipChatsNewParameters` is of
  type [ListGlipChatsNewParameters](./src/main/java/com/ringcentral/definitions/ListGlipChatsNewParameters.java)
- `result` is of type [TMChatList](./src/main/java/com/ringcentral/definitions/TMChatList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listGlipChatsNew) in API Explorer.

## readGlipChatNew

Get Chat

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/chats/{chatId}`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMChatInfo result = rc.teamMessaging(version).chats(chatId).get();
rc.revoke();
```

- `result` is of type [TMChatInfo](./src/main/java/com/ringcentral/definitions/TMChatInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-readGlipChatNew) in API Explorer.

## readGlipPostsNew

List Posts

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/chats/{chatId}/posts`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMPostsList result = rc.teamMessaging(version).chats(chatId).posts().list(readGlipPostsNewParameters);
rc.revoke();
```

- `readGlipPostsNewParameters` is of
  type [ReadGlipPostsNewParameters](./src/main/java/com/ringcentral/definitions/ReadGlipPostsNewParameters.java)
- `result` is of type [TMPostsList](./src/main/java/com/ringcentral/definitions/TMPostsList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPostsNew) in API Explorer.

## createGlipPostNew

Create Post

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/chats/{chatId}/posts`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMPostInfo result = rc.teamMessaging(version).chats(chatId).posts().post(tMCreatePostRequest);
rc.revoke();
```

- `tMCreatePostRequest` is of
  type [TMCreatePostRequest](./src/main/java/com/ringcentral/definitions/TMCreatePostRequest.java)
- `result` is of type [TMPostInfo](./src/main/java/com/ringcentral/definitions/TMPostInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipPostNew) in API Explorer.

## readGlipPostNew

Get Post

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMPostInfo result = rc.teamMessaging(version).chats(chatId).posts(postId).get();
rc.revoke();
```

- `result` is of type [TMPostInfo](./src/main/java/com/ringcentral/definitions/TMPostInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-readGlipPostNew) in API Explorer.

## deleteGlipPostNew

Delete Post

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/team-messaging/{version}/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).chats(chatId).posts(postId).delete();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Posts-deleteGlipPostNew) in API Explorer.

## patchGlipPostNew

Update Post

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/team-messaging/{version}/chats/{chatId}/posts/{postId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMPostInfo result = rc.teamMessaging(version).chats(chatId).posts(postId).patch(tMUpdatePostRequest);
rc.revoke();
```

- `tMUpdatePostRequest` is of
  type [TMUpdatePostRequest](./src/main/java/com/ringcentral/definitions/TMUpdatePostRequest.java)
- `result` is of type [TMPostInfo](./src/main/java/com/ringcentral/definitions/TMPostInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-patchGlipPostNew) in API Explorer.

## listChatTasksNew

List Chat Tasks

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/chats/{chatId}/tasks`
Rate Limit Group|`Heavy`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMTaskList result = rc.teamMessaging(version).chats(chatId).tasks().get(listChatTasksNewParameters);
rc.revoke();
```

- `listChatTasksNewParameters` is of
  type [ListChatTasksNewParameters](./src/main/java/com/ringcentral/definitions/ListChatTasksNewParameters.java)
- `result` is of type [TMTaskList](./src/main/java/com/ringcentral/definitions/TMTaskList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-listChatTasksNew) in API Explorer.

## createTaskNew

Create Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/chats/{chatId}/tasks`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMTaskInfo result = rc.teamMessaging(version).chats(chatId).tasks().post(tMCreateTaskRequest);
rc.revoke();
```

- `tMCreateTaskRequest` is of
  type [TMCreateTaskRequest](./src/main/java/com/ringcentral/definitions/TMCreateTaskRequest.java)
- `result` is of type [TMTaskInfo](./src/main/java/com/ringcentral/definitions/TMTaskInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-createTaskNew) in API Explorer.

## readTMCompanyInfoNew

Get Company Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/companies/{companyId}`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMCompanyInfo result = rc.teamMessaging(version).companies(companyId).get();
rc.revoke();
```

- `result` is of type [TMCompanyInfo](./src/main/java/com/ringcentral/definitions/TMCompanyInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Profile-readTMCompanyInfoNew) in API Explorer.

## readGlipEventsNew

List User Events

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/events`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMEventList result = rc.teamMessaging(version).events().list(readGlipEventsNewParameters);
rc.revoke();
```

- `readGlipEventsNewParameters` is of
  type [ReadGlipEventsNewParameters](./src/main/java/com/ringcentral/definitions/ReadGlipEventsNewParameters.java)
- `result` is of type [TMEventList](./src/main/java/com/ringcentral/definitions/TMEventList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-readGlipEventsNew) in API Explorer.

## createEventNew

Create Event

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/events`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMEventInfo result = rc.teamMessaging(version).events().post(tMCreateEventRequest);
rc.revoke();
```

- `tMCreateEventRequest` is of
  type [TMCreateEventRequest](./src/main/java/com/ringcentral/definitions/TMCreateEventRequest.java)
- `result` is of type [TMEventInfo](./src/main/java/com/ringcentral/definitions/TMEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-createEventNew) in API Explorer.

## readEventNew

Get Event

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMEventInfo result = rc.teamMessaging(version).events(eventId).get();
rc.revoke();
```

- `result` is of type [TMEventInfo](./src/main/java/com/ringcentral/definitions/TMEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-readEventNew) in API Explorer.

## updateEventNew

Update Event

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/team-messaging/{version}/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMEventInfo result = rc.teamMessaging(version).events(eventId).put(tMCreateEventRequest);
rc.revoke();
```

- `tMCreateEventRequest` is of
  type [TMCreateEventRequest](./src/main/java/com/ringcentral/definitions/TMCreateEventRequest.java)
- `result` is of type [TMEventInfo](./src/main/java/com/ringcentral/definitions/TMEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-updateEventNew) in API Explorer.

## deleteEventNew

Delete Event

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/team-messaging/{version}/events/{eventId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).events(eventId).delete();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-deleteEventNew) in API Explorer.

## readGlipEveryoneNew

Get Everyone Chat

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/everyone`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
EveryoneTeamInfo result = rc.teamMessaging(version).everyone().get();
rc.revoke();
```

- `result` is of type [EveryoneTeamInfo](./src/main/java/com/ringcentral/definitions/EveryoneTeamInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-readGlipEveryoneNew) in API Explorer.

## patchGlipEveryoneNew

Update Everyone Chat

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/team-messaging/{version}/everyone`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
EveryoneTeamInfo result = rc.teamMessaging(version).everyone().patch(updateEveryoneTeamRequest);
rc.revoke();
```

- `updateEveryoneTeamRequest` is of
  type [UpdateEveryoneTeamRequest](./src/main/java/com/ringcentral/definitions/UpdateEveryoneTeamRequest.java)
- `result` is of type [EveryoneTeamInfo](./src/main/java/com/ringcentral/definitions/EveryoneTeamInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-patchGlipEveryoneNew) in API Explorer.

## listFavoriteChatsNew

List Favorite Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/favorites`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMChatListWithoutNavigation result = rc.teamMessaging(version).favorites().get(listFavoriteChatsNewParameters);
rc.revoke();
```

- `listFavoriteChatsNewParameters` is of
  type [ListFavoriteChatsNewParameters](./src/main/java/com/ringcentral/definitions/ListFavoriteChatsNewParameters.java)
- `result` is of
  type [TMChatListWithoutNavigation](./src/main/java/com/ringcentral/definitions/TMChatListWithoutNavigation.java)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listFavoriteChatsNew) in API Explorer.

## createGlipFileNew

Upload File

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/files`
Rate Limit Group|`Heavy`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMAddFileRequest result = rc.teamMessaging(version).files().post(createGlipFileNewRequest, createGlipFileNewParameters);
rc.revoke();
```

- `createGlipFileNewRequest` is of
  type [CreateGlipFileNewRequest](./src/main/java/com/ringcentral/definitions/CreateGlipFileNewRequest.java)
- `createGlipFileNewParameters` is of
  type [CreateGlipFileNewParameters](./src/main/java/com/ringcentral/definitions/CreateGlipFileNewParameters.java)
- `result` is of type [TMAddFileRequest](./src/main/java/com/ringcentral/definitions/TMAddFileRequest.java)

[Try it out](https://developer.ringcentral.com/api-reference#Posts-createGlipFileNew) in API Explorer.

## readUserNoteNew

Get Note

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMNoteWithBodyInfo result = rc.teamMessaging(version).notes(noteId).get();
rc.revoke();
```

- `result` is of type [TMNoteWithBodyInfo](./src/main/java/com/ringcentral/definitions/TMNoteWithBodyInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-readUserNoteNew) in API Explorer.

## deleteNoteNew

Delete Note

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/team-messaging/{version}/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).notes(noteId).delete();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Notes-deleteNoteNew) in API Explorer.

## patchNoteNew

Update Note

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/team-messaging/{version}/notes/{noteId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMNoteInfo result = rc.teamMessaging(version).notes(noteId).patch(tMCreateNoteRequest, patchNoteNewParameters);
rc.revoke();
```

- `tMCreateNoteRequest` is of
  type [TMCreateNoteRequest](./src/main/java/com/ringcentral/definitions/TMCreateNoteRequest.java)
- `patchNoteNewParameters` is of
  type [PatchNoteNewParameters](./src/main/java/com/ringcentral/definitions/PatchNoteNewParameters.java)
- `result` is of type [TMNoteInfo](./src/main/java/com/ringcentral/definitions/TMNoteInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-patchNoteNew) in API Explorer.

## readTaskNew

Get Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMTaskInfo result = rc.teamMessaging(version).tasks(taskId).get();
rc.revoke();
```

- `result` is of type [TMTaskInfo](./src/main/java/com/ringcentral/definitions/TMTaskInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-readTaskNew) in API Explorer.

## deleteTaskNew

Delete Task

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/team-messaging/{version}/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).tasks(taskId).delete();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-deleteTaskNew) in API Explorer.

## patchTaskNew

Update Task

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/team-messaging/{version}/tasks/{taskId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMTaskList result = rc.teamMessaging(version).tasks(taskId).patch(tMUpdateTaskRequest);
rc.revoke();
```

- `tMUpdateTaskRequest` is of
  type [TMUpdateTaskRequest](./src/main/java/com/ringcentral/definitions/TMUpdateTaskRequest.java)
- `result` is of type [TMTaskList](./src/main/java/com/ringcentral/definitions/TMTaskList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-patchTaskNew) in API Explorer.

## listGlipTeamsNew

List Teams

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/teams`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMTeamList result = rc.teamMessaging(version).teams().list(listGlipTeamsNewParameters);
rc.revoke();
```

- `listGlipTeamsNewParameters` is of
  type [ListGlipTeamsNewParameters](./src/main/java/com/ringcentral/definitions/ListGlipTeamsNewParameters.java)
- `result` is of type [TMTeamList](./src/main/java/com/ringcentral/definitions/TMTeamList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-listGlipTeamsNew) in API Explorer.

## createGlipTeamNew

Create Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/teams`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMTeamInfo result = rc.teamMessaging(version).teams().post(tMCreateTeamRequest);
rc.revoke();
```

- `tMCreateTeamRequest` is of
  type [TMCreateTeamRequest](./src/main/java/com/ringcentral/definitions/TMCreateTeamRequest.java)
- `result` is of type [TMTeamInfo](./src/main/java/com/ringcentral/definitions/TMTeamInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-createGlipTeamNew) in API Explorer.

## readGlipTeamNew

Get Team

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/teams/{chatId}`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMTeamInfo result = rc.teamMessaging(version).teams(chatId).get();
rc.revoke();
```

- `result` is of type [TMTeamInfo](./src/main/java/com/ringcentral/definitions/TMTeamInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-readGlipTeamNew) in API Explorer.

## deleteGlipTeamNew

Delete Team

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/team-messaging/{version}/teams/{chatId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).teams(chatId).delete();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-deleteGlipTeamNew) in API Explorer.

## patchGlipTeamNew

Update Team

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/team-messaging/{version}/teams/{chatId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMTeamInfo result = rc.teamMessaging(version).teams(chatId).patch(tMUpdateTeamRequest);
rc.revoke();
```

- `tMUpdateTeamRequest` is of
  type [TMUpdateTeamRequest](./src/main/java/com/ringcentral/definitions/TMUpdateTeamRequest.java)
- `result` is of type [TMTeamInfo](./src/main/java/com/ringcentral/definitions/TMTeamInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Teams-patchGlipTeamNew) in API Explorer.

## listChatNotesNew

List Notes

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/chats/{chatId}/notes`
Rate Limit Group|`Heavy`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMNoteList result = rc.teamMessaging(version).chats(chatId).notes().get(listChatNotesNewParameters);
rc.revoke();
```

- `listChatNotesNewParameters` is of
  type [ListChatNotesNewParameters](./src/main/java/com/ringcentral/definitions/ListChatNotesNewParameters.java)
- `result` is of type [TMNoteList](./src/main/java/com/ringcentral/definitions/TMNoteList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-listChatNotesNew) in API Explorer.

## createChatNoteNew

Create Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/chats/{chatId}/notes`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMNoteInfo result = rc.teamMessaging(version).chats(chatId).notes().post(tMCreateNoteRequest);
rc.revoke();
```

- `tMCreateNoteRequest` is of
  type [TMCreateNoteRequest](./src/main/java/com/ringcentral/definitions/TMCreateNoteRequest.java)
- `result` is of type [TMNoteInfo](./src/main/java/com/ringcentral/definitions/TMNoteInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-createChatNoteNew) in API Explorer.

## listDataExportTasksNew

List Data Export Tasks

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/data-export`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DataExportTaskList result = rc.teamMessaging(version).dataExport().list(listDataExportTasksNewParameters);
rc.revoke();
```

- `listDataExportTasksNewParameters` is of
  type [ListDataExportTasksNewParameters](./src/main/java/com/ringcentral/definitions/ListDataExportTasksNewParameters.java)
- `result` is of type [DataExportTaskList](./src/main/java/com/ringcentral/definitions/DataExportTaskList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Compliance-Exports-listDataExportTasksNew) in API Explorer.

## createDataExportTaskNew

Create Data Export Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/data-export`
Rate Limit Group|`Heavy`
App Permission|`TeamMessaging`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DataExportTask result = rc.teamMessaging(version).dataExport().post(createDataExportTaskRequest);
rc.revoke();
```

- `createDataExportTaskRequest` is of
  type [CreateDataExportTaskRequest](./src/main/java/com/ringcentral/definitions/CreateDataExportTaskRequest.java)
- `result` is of type [DataExportTask](./src/main/java/com/ringcentral/definitions/DataExportTask.java)

[Try it out](https://developer.ringcentral.com/api-reference#Compliance-Exports-createDataExportTaskNew) in API
Explorer.

## readDataExportTaskNew

Get Data Export Task

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/data-export/{taskId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`Glip`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DataExportTask result = rc.teamMessaging(version).dataExport(taskId).get();
rc.revoke();
```

- `result` is of type [DataExportTask](./src/main/java/com/ringcentral/definitions/DataExportTask.java)

[Try it out](https://developer.ringcentral.com/api-reference#Compliance-Exports-readDataExportTaskNew) in API Explorer.

## lockNoteNew

Lock Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/notes/{noteId}/lock`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).notes(noteId).lock().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Notes-lockNoteNew) in API Explorer.

## readGlipPersonNew

Get Person

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/persons/{personId}`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMPersonInfo result = rc.teamMessaging(version).persons(personId).get();
rc.revoke();
```

- `result` is of type [TMPersonInfo](./src/main/java/com/ringcentral/definitions/TMPersonInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Profile-readGlipPersonNew) in API Explorer.

## listGlipWebhooksNew

List Webhooks

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/webhooks`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMWebhookList result = rc.teamMessaging(version).webhooks().list();
rc.revoke();
```

- `result` is of type [TMWebhookList](./src/main/java/com/ringcentral/definitions/TMWebhookList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Incoming-Webhooks-listGlipWebhooksNew) in API Explorer.

## readGlipWebhookNew

Get Webhook

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/webhooks/{webhookId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMWebhookList result = rc.teamMessaging(version).webhooks(webhookId).get();
rc.revoke();
```

- `result` is of type [TMWebhookList](./src/main/java/com/ringcentral/definitions/TMWebhookList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Incoming-Webhooks-readGlipWebhookNew) in API Explorer.

## deleteGlipWebhookNew

Delete Webhook

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/team-messaging/{version}/webhooks/{webhookId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).webhooks(webhookId).delete();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Incoming-Webhooks-deleteGlipWebhookNew) in API Explorer.

## addGlipTeamMembersNew

Add Team Members

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/teams/{chatId}/add`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).teams(chatId).add().post(tMAddTeamMembersRequest);
rc.revoke();
```

- `tMAddTeamMembersRequest` is of
  type [TMAddTeamMembersRequest](./src/main/java/com/ringcentral/definitions/TMAddTeamMembersRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-addGlipTeamMembersNew) in API Explorer.

## listUserTemplates

List User Templates

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
- `listUserTemplatesParameters` is of
  type [ListUserTemplatesParameters](./src/main/java/com/ringcentral/definitions/ListUserTemplatesParameters.java)
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

## listUserRoles

Get Account User Role List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/user-role`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadUserRoles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
RolesCollectionResource result = rc.restapi(apiVersion).account(accountId).userRole().list(listUserRolesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listUserRolesParameters` is of
  type [ListUserRolesParameters](./src/main/java/com/ringcentral/definitions/ListUserRolesParameters.java)
- `result` is of
  type [RolesCollectionResource](./src/main/java/com/ringcentral/definitions/RolesCollectionResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-listUserRoles) in API Explorer.

## createCustomRole

Create Custom Role

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/user-role`
Rate Limit Group|`Medium`
App Permission|`RoleManagement`
User Permission|`EditUserRoles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).userRole().post(roleResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `roleResource` is of type [RoleResource](./src/main/java/com/ringcentral/definitions/RoleResource.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-createCustomRole) in API Explorer.

## readUserRole

Get User Role

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/user-role/{roleId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadUserRoles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
RoleResource result = rc.restapi(apiVersion).account(accountId).userRole(roleId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [RoleResource](./src/main/java/com/ringcentral/definitions/RoleResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-readUserRole) in API Explorer.

## updateUserRole

Update User Role

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/user-role/{roleId}`
Rate Limit Group|`Medium`
App Permission|`RoleManagement`
User Permission|`EditUserRoles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).userRole(roleId).put(roleResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `roleResource` is of type [RoleResource](./src/main/java/com/ringcentral/definitions/RoleResource.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-updateUserRole) in API Explorer.

## deleteCustomRole

Delete Custom Role

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/user-role/{roleId}`
Rate Limit Group|`Medium`
App Permission|`RoleManagement`
User Permission|`EditUserRoles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).userRole(roleId).delete(deleteCustomRoleParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `deleteCustomRoleParameters` is of
  type [DeleteCustomRoleParameters](./src/main/java/com/ringcentral/definitions/DeleteCustomRoleParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-deleteCustomRole) in API Explorer.

## markChatReadNew

Mark Chat as Read

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/chats/{chatId}/read`
Rate Limit Group|`Medium`
App Permission|`TeamMessagingInternal`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).chats(chatId).read().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatReadNew) in API Explorer.

## readGlipPreferencesNew

Get Preferences

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/preferences`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMPreferencesInfo result = rc.teamMessaging(version).preferences().get();
rc.revoke();
```

- `result` is of type [TMPreferencesInfo](./src/main/java/com/ringcentral/definitions/TMPreferencesInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Profile-readGlipPreferencesNew) in API Explorer.

## joinGlipTeamNew

Join Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/teams/{chatId}/join`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).teams(chatId).join().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-joinGlipTeamNew) in API Explorer.

## listA2PBatches

Get A2P SMS Batches

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/batches`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
BatchListResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().batches().list(listA2PBatchesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listA2PBatchesParameters` is of
  type [ListA2PBatchesParameters](./src/main/java/com/ringcentral/definitions/ListA2PBatchesParameters.java)
- `result` is of type [BatchListResponse](./src/main/java/com/ringcentral/definitions/BatchListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-listA2PBatches) in API Explorer.

## createA2PSMS

Send A2P SMS

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/batches`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageBatchResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().batches().post(messageBatchCreateRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `messageBatchCreateRequest` is of
  type [MessageBatchCreateRequest](./src/main/java/com/ringcentral/definitions/MessageBatchCreateRequest.java)
- `result` is of type [MessageBatchResponse](./src/main/java/com/ringcentral/definitions/MessageBatchResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-createA2PSMS) in API Explorer.

## readA2PBatch

Get A2P SMS Batch

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/batches/{batchId}`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageBatchResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().batches(batchId).get();
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
- `listA2PSMSParameters` is of
  type [ListA2PSMSParameters](./src/main/java/com/ringcentral/definitions/ListA2PSMSParameters.java)
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
- `readA2PSMSOptOutsParameters` is of
  type [ReadA2PSMSOptOutsParameters](./src/main/java/com/ringcentral/definitions/ReadA2PSMSOptOutsParameters.java)
- `result` is of type [OptOutListResponse](./src/main/java/com/ringcentral/definitions/OptOutListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-readA2PSMSOptOuts) in API Explorer.

## aggregateA2PSMSStatuses

List A2P SMS Statuses

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/statuses`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MessageStatusesResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().statuses().get(aggregateA2PSMSStatusesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `aggregateA2PSMSStatusesParameters` is of
  type [AggregateA2PSMSStatusesParameters](./src/main/java/com/ringcentral/definitions/AggregateA2PSMSStatusesParameters.java)
- `result` is of
  type [MessageStatusesResponse](./src/main/java/com/ringcentral/definitions/MessageStatusesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-aggregateA2PSMSStatuses) in API Explorer.

## listCompanyActiveCalls

List Company Active Calls

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
- `listCompanyActiveCallsParameters` is of
  type [ListCompanyActiveCallsParameters](./src/main/java/com/ringcentral/definitions/ListCompanyActiveCallsParameters.java)
- `result` is of
  type [CompanyActiveCallsResponse](./src/main/java/com/ringcentral/definitions/CompanyActiveCallsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-listCompanyActiveCalls) in API Explorer.

## listCompanyAnsweringRules

List Company Call Handling Rules

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
CompanyAnsweringRuleList result = rc.restapi(apiVersion).account(accountId).answeringRule().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of
  type [CompanyAnsweringRuleList](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-listCompanyAnsweringRules) in API
Explorer.

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
- `companyAnsweringRuleRequest` is of
  type [CompanyAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleRequest.java)
- `result` is of
  type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-createCompanyAnsweringRule) in API
Explorer.

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
- `result` is of
  type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-readCompanyAnsweringRule) in API
Explorer.

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
- `companyAnsweringRuleUpdate` is of
  type [CompanyAnsweringRuleUpdate](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleUpdate.java)
- `result` is of
  type [CompanyAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CompanyAnsweringRuleInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-updateCompanyAnsweringRule) in API
Explorer.

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

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-deleteCompanyAnsweringRule) in API
Explorer.

## listAssignedRoles

Get Assigned Role List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/assigned-role`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadAssignedRoles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ExtensionWithRolesCollectionResource result = rc.restapi(apiVersion).account(accountId).assignedRole().get(listAssignedRolesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listAssignedRolesParameters` is of
  type [ListAssignedRolesParameters](./src/main/java/com/ringcentral/definitions/ListAssignedRolesParameters.java)
- `result` is of
  type [ExtensionWithRolesCollectionResource](./src/main/java/com/ringcentral/definitions/ExtensionWithRolesCollectionResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-listAssignedRoles) in API Explorer.

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
- `result` is of
  type [AccountBusinessAddressResource](./src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.java)

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
- `modifyAccountBusinessAddressRequest` is of
  type [ModifyAccountBusinessAddressRequest](./src/main/java/com/ringcentral/definitions/ModifyAccountBusinessAddressRequest.java)
- `result` is of
  type [AccountBusinessAddressResource](./src/main/java/com/ringcentral/definitions/AccountBusinessAddressResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Company-updateAccountBusinessAddress) in API Explorer.

## readCompanyBusinessHours

Get Company Business Hours

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/business-hours`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyAnsweringRules`

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
- `companyBusinessHoursUpdateRequest` is of
  type [CompanyBusinessHoursUpdateRequest](./src/main/java/com/ringcentral/definitions/CompanyBusinessHoursUpdateRequest.java)
- `result` is of type [CompanyBusinessHours](./src/main/java/com/ringcentral/definitions/CompanyBusinessHours.java)

[Try it out](https://developer.ringcentral.com/api-reference#Business-Hours-updateCompanyBusinessHours) in API Explorer.

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
- `syncAccountCallLogParameters` is of
  type [SyncAccountCallLogParameters](./src/main/java/com/ringcentral/definitions/SyncAccountCallLogParameters.java)
- `result` is of
  type [AccountCallLogSyncResponse](./src/main/java/com/ringcentral/definitions/AccountCallLogSyncResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncAccountCallLog) in API Explorer.

## listCallQueues

List Call Queues

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
- `listCallQueuesParameters` is of
  type [ListCallQueuesParameters](./src/main/java/com/ringcentral/definitions/ListCallQueuesParameters.java)
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
- `callQueueUpdateDetails` is of
  type [CallQueueUpdateDetails](./src/main/java/com/ringcentral/definitions/CallQueueUpdateDetails.java)
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
- `result` is of
  type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-readCallRecordingSettings) in API
Explorer.

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
- `callRecordingSettingsResource` is of
  type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)
- `result` is of
  type [CallRecordingSettingsResource](./src/main/java/com/ringcentral/definitions/CallRecordingSettingsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-updateCallRecordingSettings) in API
Explorer.

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
Rate Limit Group|`Medium`
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
- `customFieldCreateRequest` is of
  type [CustomFieldCreateRequest](./src/main/java/com/ringcentral/definitions/CustomFieldCreateRequest.java)
- `result` is of type [CustomFieldResource](./src/main/java/com/ringcentral/definitions/CustomFieldResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-createCustomField) in API Explorer.

## updateCustomField

Update Custom Field

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/custom-fields/{fieldId}`
Rate Limit Group|`Medium`
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
- `customFieldUpdateRequest` is of
  type [CustomFieldUpdateRequest](./src/main/java/com/ringcentral/definitions/CustomFieldUpdateRequest.java)
- `result` is of type [CustomFieldResource](./src/main/java/com/ringcentral/definitions/CustomFieldResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Custom-Fields-updateCustomField) in API Explorer.

## deleteCustomField

Delete Custom Field

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/custom-fields/{fieldId}`
Rate Limit Group|`Medium`
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

## readDeviceSIPInfo

Get Device SIP Info

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/device/{deviceId}/sip-info`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyDevices`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
SipInfoResource result = rc.restapi(apiVersion).account(accountId).device(deviceId).sipInfo().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [SipInfoResource](./src/main/java/com/ringcentral/definitions/SipInfoResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-readDeviceSIPInfo) in API Explorer.

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
- `listDirectoryEntriesParameters` is of
  type [ListDirectoryEntriesParameters](./src/main/java/com/ringcentral/definitions/ListDirectoryEntriesParameters.java)
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

## readUserCallLog

List User Call Records

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
- `readUserCallLogParameters` is of
  type [ReadUserCallLogParameters](./src/main/java/com/ringcentral/definitions/ReadUserCallLogParameters.java)
- `result` is of type [UserCallLogResponse](./src/main/java/com/ringcentral/definitions/UserCallLogResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-readUserCallLog) in API Explorer.

## deleteUserCallLog

Delete User Call Records

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
- `deleteUserCallLogParameters` is of
  type [DeleteUserCallLogParameters](./src/main/java/com/ringcentral/definitions/DeleteUserCallLogParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-deleteUserCallLog) in API Explorer.

## readUserCallRecord

Get User Call Record(s)

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
UserCallLogRecord result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callLog(callRecordId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
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
- `listExtensionDevicesParameters` is of
  type [ListExtensionDevicesParameters](./src/main/java/com/ringcentral/definitions/ListExtensionDevicesParameters.java)
- `result` is of
  type [GetExtensionDevicesResponse](./src/main/java/com/ringcentral/definitions/GetExtensionDevicesResponse.java)

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
- `createFaxMessageRequest` is of
  type [CreateFaxMessageRequest](./src/main/java/com/ringcentral/definitions/CreateFaxMessageRequest.java)
- `result` is of type [FaxResponse](./src/main/java/com/ringcentral/definitions/FaxResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Fax-createFaxMessage) in API Explorer.

## listExtensionGrants

List Extension Grants

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
- `listExtensionGrantsParameters` is of
  type [ListExtensionGrantsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionGrantsParameters.java)
- `result` is of
  type [GetExtensionGrantListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionGrantListResponse.java)

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
- `createCustomUserGreetingRequest` is of
  type [CreateCustomUserGreetingRequest](./src/main/java/com/ringcentral/definitions/CreateCustomUserGreetingRequest.java)
- `createCustomUserGreetingParameters` is of
  type [CreateCustomUserGreetingParameters](./src/main/java/com/ringcentral/definitions/CreateCustomUserGreetingParameters.java)
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

List Scheduled Meetings

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
- `meetingRequestResource` is of
  type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of
  type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)

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
- `result` is of
  type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)

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
- `meetingRequestResource` is of
  type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of
  type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)

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
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).delete(deleteMeetingParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `deleteMeetingParameters` is of
  type [DeleteMeetingParameters](./src/main/java/com/ringcentral/definitions/DeleteMeetingParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-deleteMeeting) in API Explorer.

## patchMeeting

Update Meeting

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
MeetingResponseResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meeting(meetingId).patch(meetingRequestResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `meetingRequestResource` is of
  type [MeetingRequestResource](./src/main/java/com/ringcentral/definitions/MeetingRequestResource.java)
- `result` is of
  type [MeetingResponseResource](./src/main/java/com/ringcentral/definitions/MeetingResponseResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Management-patchMeeting) in API Explorer.

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
- `result` is of
  type [GetSMSMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetSMSMessageInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SMS-createMMS) in API Explorer.

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
- `makeRingOutRequest` is of
  type [MakeRingOutRequest](./src/main/java/com/ringcentral/definitions/MakeRingOutRequest.java)
- `result` is of
  type [GetRingOutStatusResponse](./src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.java)

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
- `result` is of
  type [GetRingOutStatusResponse](./src/main/java/com/ringcentral/definitions/GetRingOutStatusResponse.java)

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
- `result` is of
  type [GetSMSMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetSMSMessageInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#SMS-createSMSMessage) in API Explorer.

## getForwardAllCompanyCalls

Get Forward All Company Calls

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/forward-all-calls`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ForwardAllCompanyCallsInfo result = rc.restapi(apiVersion).account(accountId).forwardAllCalls().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of
  type [ForwardAllCompanyCallsInfo](./src/main/java/com/ringcentral/definitions/ForwardAllCompanyCallsInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-getForwardAllCompanyCalls) in API
Explorer.

## updateForwardAllCompanyCalls

Update Forward All Company Calls

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/forward-all-calls`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCompanyAnsweringRules`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ForwardAllCompanyCallsInfo result = rc.restapi(apiVersion).account(accountId).forwardAllCalls().patch(forwardAllCompanyCallsInfo);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `forwardAllCompanyCallsInfo` is of
  type [ForwardAllCompanyCallsInfo](./src/main/java/com/ringcentral/definitions/ForwardAllCompanyCallsInfo.java)
- `result` is of
  type [ForwardAllCompanyCallsInfo](./src/main/java/com/ringcentral/definitions/ForwardAllCompanyCallsInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Handling-Rules-updateForwardAllCompanyCalls) in API
Explorer.

## listIvrPrompts

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
IvrPrompts result = rc.restapi(apiVersion).account(accountId).ivrPrompts().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [IvrPrompts](./src/main/java/com/ringcentral/definitions/IvrPrompts.java)

[Try it out](https://developer.ringcentral.com/api-reference#IVR-listIvrPrompts) in API Explorer.

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
- `createIVRPromptRequest` is of
  type [CreateIVRPromptRequest](./src/main/java/com/ringcentral/definitions/CreateIVRPromptRequest.java)
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
- `updateIVRPromptRequest` is of
  type [UpdateIVRPromptRequest](./src/main/java/com/ringcentral/definitions/UpdateIVRPromptRequest.java)
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

List Company Phone Numbers

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
- `listAccountPhoneNumbersParameters` is of
  type [ListAccountPhoneNumbersParameters](./src/main/java/com/ringcentral/definitions/ListAccountPhoneNumbersParameters.java)
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
AccountServiceInfo result = rc.restapi(apiVersion).account(accountId).serviceInfo().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [AccountServiceInfo](./src/main/java/com/ringcentral/definitions/AccountServiceInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Company-readAccountServiceInfo) in API Explorer.

## readDefaultRole

Get Default User Role

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/user-role/default`
Rate Limit Group|`Light`
App Permission|`RoleManagement`
User Permission|`Roles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).userRole().default().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-readDefaultRole) in API Explorer.

## updateDefaultUserRole

Set Default User Role

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/user-role/default`
Rate Limit Group|`Medium`
App Permission|`RoleManagement`
User Permission|`Roles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).userRole().default().put(defaultUserRoleRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `defaultUserRoleRequest` is of
  type [DefaultUserRoleRequest](./src/main/java/com/ringcentral/definitions/DefaultUserRoleRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-updateDefaultUserRole) in API Explorer.

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
- `createSipRegistrationRequest` is of
  type [CreateSipRegistrationRequest](./src/main/java/com/ringcentral/definitions/CreateSipRegistrationRequest.java)
- `result` is of
  type [CreateSipRegistrationResponse](./src/main/java/com/ringcentral/definitions/CreateSipRegistrationResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Device-SIP-Registration-createSIPRegistration) in API
Explorer.

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
- `listFaxCoverPagesParameters` is of
  type [ListFaxCoverPagesParameters](./src/main/java/com/ringcentral/definitions/ListFaxCoverPagesParameters.java)
- `result` is of
  type [ListFaxCoverPagesResponse](./src/main/java/com/ringcentral/definitions/ListFaxCoverPagesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Fax-listFaxCoverPages) in API Explorer.

## listStandardGreetings

List Standard Greetings

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
- `listStandardGreetingsParameters` is of
  type [ListStandardGreetingsParameters](./src/main/java/com/ringcentral/definitions/ListStandardGreetingsParameters.java)
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

List Languages

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

List Locations

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
- `listLocationsParameters` is of
  type [ListLocationsParameters](./src/main/java/com/ringcentral/definitions/ListLocationsParameters.java)
- `result` is of
  type [GetLocationListResponse](./src/main/java/com/ringcentral/definitions/GetLocationListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-listLocations) in API Explorer.

## listPermissions

Get Permission List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/permission`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PermissionCollectionResource result = rc.restapi(apiVersion).dictionary().permission().list(listPermissionsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listPermissionsParameters` is of
  type [ListPermissionsParameters](./src/main/java/com/ringcentral/definitions/ListPermissionsParameters.java)
- `result` is of
  type [PermissionCollectionResource](./src/main/java/com/ringcentral/definitions/PermissionCollectionResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Permissions-listPermissions) in API Explorer.

## readPermission

Get Permission

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/permission/{permissionId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PermissionResource result = rc.restapi(apiVersion).dictionary().permission(permissionId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [PermissionResource](./src/main/java/com/ringcentral/definitions/PermissionResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Permissions-readPermission) in API Explorer.

## listTimezones

List Timezones

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
- `listTimezonesParameters` is of
  type [ListTimezonesParameters](./src/main/java/com/ringcentral/definitions/ListTimezonesParameters.java)
- `result` is of
  type [GetTimezoneListResponse](./src/main/java/com/ringcentral/definitions/GetTimezoneListResponse.java)

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
- `readTimezoneParameters` is of
  type [ReadTimezoneParameters](./src/main/java/com/ringcentral/definitions/ReadTimezoneParameters.java)
- `result` is of
  type [GetTimezoneInfoResponse](./src/main/java/com/ringcentral/definitions/GetTimezoneInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Regional-Settings-readTimezone) in API Explorer.

## listStandardUserRole

Get Standard User Role List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/user-role`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
RolesCollectionResource result = rc.restapi(apiVersion).dictionary().userRole().list(listStandardUserRoleParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listStandardUserRoleParameters` is of
  type [ListStandardUserRoleParameters](./src/main/java/com/ringcentral/definitions/ListStandardUserRoleParameters.java)
- `result` is of
  type [RolesCollectionResource](./src/main/java/com/ringcentral/definitions/RolesCollectionResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-listStandardUserRole) in API Explorer.

## readStandardUserRole

Get Standard User Role

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/user-role/{roleId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
RoleResource result = rc.restapi(apiVersion).dictionary().userRole(roleId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of type [RoleResource](./src/main/java/com/ringcentral/definitions/RoleResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-readStandardUserRole) in API Explorer.

## parsePhoneNumber

Parse Phone Number(s)

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
- `parsePhoneNumberRequest` is of
  type [ParsePhoneNumberRequest](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberRequest.java)
- `parsePhoneNumberParameters` is of
  type [ParsePhoneNumberParameters](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberParameters.java)
- `result` is of
  type [ParsePhoneNumberResponse](./src/main/java/com/ringcentral/definitions/ParsePhoneNumberResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Phone-Numbers-parsePhoneNumber) in API Explorer.

## getGlipAdaptiveCardNew

Get Adaptive Card

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/adaptive-cards/{cardId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AdaptiveCardInfo result = rc.teamMessaging(version).adaptiveCards(cardId).get();
rc.revoke();
```

- `result` is of type [AdaptiveCardInfo](./src/main/java/com/ringcentral/definitions/AdaptiveCardInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Adaptive-Cards-getGlipAdaptiveCardNew) in API Explorer.

## updateGlipAdaptiveCardNew

Update Adaptive Card

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/team-messaging/{version}/adaptive-cards/{cardId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AdaptiveCardShortInfo result = rc.teamMessaging(version).adaptiveCards(cardId).put(adaptiveCardRequest);
rc.revoke();
```

- `adaptiveCardRequest` is of
  type [AdaptiveCardRequest](./src/main/java/com/ringcentral/definitions/AdaptiveCardRequest.java)
- `result` is of type [AdaptiveCardShortInfo](./src/main/java/com/ringcentral/definitions/AdaptiveCardShortInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Adaptive-Cards-updateGlipAdaptiveCardNew) in API Explorer.

## deleteGlipAdaptiveCardNew

Delete Adaptive Card

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/team-messaging/{version}/adaptive-cards/{cardId}`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).adaptiveCards(cardId).delete();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Adaptive-Cards-deleteGlipAdaptiveCardNew) in API Explorer.

## favoriteGlipChatNew

Add Chat to Favorites

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/chats/{chatId}/favorite`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).chats(chatId).favorite().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-favoriteGlipChatNew) in API Explorer.

## unfavoriteGlipChatNew

Remove Chat from Favorites

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/chats/{chatId}/unfavorite`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).chats(chatId).unfavorite().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-unfavoriteGlipChatNew) in API Explorer.

## markChatUnreadNew

Mark Chat as Unread

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/chats/{chatId}/unread`
Rate Limit Group|`Medium`
App Permission|`TeamMessagingInternal`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).chats(chatId).unread().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Chats-markChatUnreadNew) in API Explorer.

## listGlipConversationsNew

List Conversations

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/conversations`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMConversationList result = rc.teamMessaging(version).conversations().list(listGlipConversationsNewParameters);
rc.revoke();
```

- `listGlipConversationsNewParameters` is of
  type [ListGlipConversationsNewParameters](./src/main/java/com/ringcentral/definitions/ListGlipConversationsNewParameters.java)
- `result` is of type [TMConversationList](./src/main/java/com/ringcentral/definitions/TMConversationList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-listGlipConversationsNew) in API Explorer.

## createGlipConversationNew

Create/Open Conversation

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/conversations`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMConversationInfo result = rc.teamMessaging(version).conversations().post(createConversationRequest);
rc.revoke();
```

- `createConversationRequest` is of
  type [CreateConversationRequest](./src/main/java/com/ringcentral/definitions/CreateConversationRequest.java)
- `result` is of type [TMConversationInfo](./src/main/java/com/ringcentral/definitions/TMConversationInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-createGlipConversationNew) in API Explorer.

## readGlipConversationNew

Get Conversation

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/conversations/{chatId}`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMConversationInfo result = rc.teamMessaging(version).conversations(chatId).get();
rc.revoke();
```

- `result` is of type [TMConversationInfo](./src/main/java/com/ringcentral/definitions/TMConversationInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Conversations-readGlipConversationNew) in API Explorer.

## listGroupEventsNew

List Group Events

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/groups/{groupId}/events`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMEventInfo result = rc.teamMessaging(version).groups(groupId).events().get();
rc.revoke();
```

- `result` is of type [TMEventInfo](./src/main/java/com/ringcentral/definitions/TMEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-listGroupEventsNew) in API Explorer.

## createEventByGroupIdNew

Create Event by Group ID

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/groups/{groupId}/events`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMEventInfo result = rc.teamMessaging(version).groups(groupId).events().post(tMCreateEventRequest);
rc.revoke();
```

- `tMCreateEventRequest` is of
  type [TMCreateEventRequest](./src/main/java/com/ringcentral/definitions/TMCreateEventRequest.java)
- `result` is of type [TMEventInfo](./src/main/java/com/ringcentral/definitions/TMEventInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Calendar-Events-createEventByGroupIdNew) in API Explorer.

## listGlipGroupWebhooksNew

List Webhooks in Group

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/groups/{groupId}/webhooks`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMWebhookList result = rc.teamMessaging(version).groups(groupId).webhooks().get();
rc.revoke();
```

- `result` is of type [TMWebhookList](./src/main/java/com/ringcentral/definitions/TMWebhookList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Incoming-Webhooks-listGlipGroupWebhooksNew) in API
Explorer.

## createGlipGroupWebhookNew

Create Webhook in Group

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/groups/{groupId}/webhooks`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMWebhookInfo result = rc.teamMessaging(version).groups(groupId).webhooks().post();
rc.revoke();
```

- `result` is of type [TMWebhookInfo](./src/main/java/com/ringcentral/definitions/TMWebhookInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Incoming-Webhooks-createGlipGroupWebhookNew) in API
Explorer.

## publishNoteNew

Publish Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/notes/{noteId}/publish`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMNoteInfo result = rc.teamMessaging(version).notes(noteId).publish().post();
rc.revoke();
```

- `result` is of type [TMNoteInfo](./src/main/java/com/ringcentral/definitions/TMNoteInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Notes-publishNoteNew) in API Explorer.

## unlockNoteNew

Unlock Note

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/notes/{noteId}/unlock`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).notes(noteId).unlock().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Notes-unlockNoteNew) in API Explorer.

## listRecentChatsNew

List Recent Chats

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/team-messaging/{version}/recent/chats`
Rate Limit Group|`Light`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TMChatListWithoutNavigation result = rc.teamMessaging(version).recent().chats().get(listRecentChatsNewParameters);
rc.revoke();
```

- `listRecentChatsNewParameters` is of
  type [ListRecentChatsNewParameters](./src/main/java/com/ringcentral/definitions/ListRecentChatsNewParameters.java)
- `result` is of
  type [TMChatListWithoutNavigation](./src/main/java/com/ringcentral/definitions/TMChatListWithoutNavigation.java)

[Try it out](https://developer.ringcentral.com/api-reference#Chats-listRecentChatsNew) in API Explorer.

## completeTaskNew

Complete Task

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/tasks/{taskId}/complete`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).tasks(taskId).complete().post(tMCompleteTaskRequest);
rc.revoke();
```

- `tMCompleteTaskRequest` is of
  type [TMCompleteTaskRequest](./src/main/java/com/ringcentral/definitions/TMCompleteTaskRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Tasks-completeTaskNew) in API Explorer.

## archiveGlipTeamNew

Archive Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/teams/{chatId}/archive`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).teams(chatId).archive().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-archiveGlipTeamNew) in API Explorer.

## leaveGlipTeamNew

Leave Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/teams/{chatId}/leave`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).teams(chatId).leave().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-leaveGlipTeamNew) in API Explorer.

## removeGlipTeamMembersNew

Remove Team Members

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/teams/{chatId}/remove`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).teams(chatId).remove().post(tMRemoveTeamMembersRequest);
rc.revoke();
```

- `tMRemoveTeamMembersRequest` is of
  type [TMRemoveTeamMembersRequest](./src/main/java/com/ringcentral/definitions/TMRemoveTeamMembersRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-removeGlipTeamMembersNew) in API Explorer.

## unarchiveGlipTeamNew

Unarchive Team

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/teams/{chatId}/unarchive`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).teams(chatId).unarchive().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Teams-unarchiveGlipTeamNew) in API Explorer.

## activateGlipWebhookNew

Activate Webhook

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/webhooks/{webhookId}/activate`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).webhooks(webhookId).activate().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Incoming-Webhooks-activateGlipWebhookNew) in API Explorer.

## suspendGlipWebhookNew

Suspend Webhook

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/webhooks/{webhookId}/suspend`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.teamMessaging(version).webhooks(webhookId).suspend().post();
rc.revoke();
```

- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Incoming-Webhooks-suspendGlipWebhookNew) in API Explorer.

## analyticsCallsAggregationFetch

Calls Aggregation Data

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/analytics/calls/{version}/accounts/{accountId}/aggregation/fetch`
Rate Limit Group|`Light`
App Permission|`Analytics`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AggregationResponse result = rc.analytics().calls(version).accounts(accountId).aggregation().fetch().post(aggregationRequest, analyticsCallsAggregationFetchParameters);
rc.revoke();
```

- `aggregationRequest` is of
  type [AggregationRequest](./src/main/java/com/ringcentral/definitions/AggregationRequest.java)
- `analyticsCallsAggregationFetchParameters` is of
  type [AnalyticsCallsAggregationFetchParameters](./src/main/java/com/ringcentral/definitions/AnalyticsCallsAggregationFetchParameters.java)
- `result` is of type [AggregationResponse](./src/main/java/com/ringcentral/definitions/AggregationResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Line-Of-Business-Analytics-analyticsCallsAggregationFetch)
in API Explorer.

## analyticsCallsTimelineFetch

Calls Timeline Data

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/analytics/calls/{version}/accounts/{accountId}/timeline/fetch`
Rate Limit Group|`Light`
App Permission|`Analytics`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
TimelineResponse result = rc.analytics().calls(version).accounts(accountId).timeline().fetch().post(timelineRequest, analyticsCallsTimelineFetchParameters);
rc.revoke();
```

- `timelineRequest` is of type [TimelineRequest](./src/main/java/com/ringcentral/definitions/TimelineRequest.java)
- `analyticsCallsTimelineFetchParameters` is of
  type [AnalyticsCallsTimelineFetchParameters](./src/main/java/com/ringcentral/definitions/AnalyticsCallsTimelineFetchParameters.java)
- `result` is of type [TimelineResponse](./src/main/java/com/ringcentral/definitions/TimelineResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Line-Of-Business-Analytics-analyticsCallsTimelineFetch) in
API Explorer.

## addressBookBulkUpload

Upload Multiple User Contacts

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
- `addressBookBulkUploadRequest` is of
  type [AddressBookBulkUploadRequest](./src/main/java/com/ringcentral/definitions/AddressBookBulkUploadRequest.java)
- `result` is of
  type [AddressBookBulkUploadResponse](./src/main/java/com/ringcentral/definitions/AddressBookBulkUploadResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-addressBookBulkUpload) in API Explorer.

## auditTrailSearch

Search Audit Trail Data

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/audit-trail/search`
Rate Limit Group|`Heavy`
App Permission|`ReadAuditTrail`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AccountHistorySearchPublicResponse result = rc.restapi(apiVersion).account(accountId).auditTrail().search().post(accountHistorySearchPublicRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `accountHistorySearchPublicRequest` is of
  type [AccountHistorySearchPublicRequest](./src/main/java/com/ringcentral/definitions/AccountHistorySearchPublicRequest.java)
- `result` is of
  type [AccountHistorySearchPublicResponse](./src/main/java/com/ringcentral/definitions/AccountHistorySearchPublicResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Audit-Trail-auditTrailSearch) in API Explorer.

## listCallMonitoringGroups

List Call Monitoring Groups

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
- `listCallMonitoringGroupsParameters` is of
  type [ListCallMonitoringGroupsParameters](./src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupsParameters.java)
- `result` is of type [CallMonitoringGroups](./src/main/java/com/ringcentral/definitions/CallMonitoringGroups.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-listCallMonitoringGroups) in API
Explorer.

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
- `createCallMonitoringGroupRequest` is of
  type [CreateCallMonitoringGroupRequest](./src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.java)
- `result` is of type [CallMonitoringGroup](./src/main/java/com/ringcentral/definitions/CallMonitoringGroup.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-createCallMonitoringGroup) in API
Explorer.

## updateCallMonitoringGroup

Update Call Monitoring Group

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
- `createCallMonitoringGroupRequest` is of
  type [CreateCallMonitoringGroupRequest](./src/main/java/com/ringcentral/definitions/CreateCallMonitoringGroupRequest.java)
- `result` is of type [CallMonitoringGroup](./src/main/java/com/ringcentral/definitions/CallMonitoringGroup.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-updateCallMonitoringGroup) in API
Explorer.

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

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-deleteCallMonitoringGroup) in API
Explorer.

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
- `callQueueBulkAssignResource` is of
  type [CallQueueBulkAssignResource](./src/main/java/com/ringcentral/definitions/CallQueueBulkAssignResource.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-assignMultipleCallQueueMembers) in API
Explorer.

## listCallQueueMembers

List Call Queue Members

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
- `listCallQueueMembersParameters` is of
  type [ListCallQueueMembersParameters](./src/main/java/com/ringcentral/definitions/ListCallQueueMembersParameters.java)
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
- `callQueueUpdatePresence` is of
  type [CallQueueUpdatePresence](./src/main/java/com/ringcentral/definitions/CallQueueUpdatePresence.java)
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
- `bulkAccountCallRecordingsResource` is of
  type [BulkAccountCallRecordingsResource](./src/main/java/com/ringcentral/definitions/BulkAccountCallRecordingsResource.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-updateCallRecordingExtensionList)
in API Explorer.

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
- `result` is of
  type [CallRecordingExtensions](./src/main/java/com/ringcentral/definitions/CallRecordingExtensions.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-listCallRecordingExtensions) in API
Explorer.

## directoryGetDeviceTypes

Get types of devices which are present on the account

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/directory/device-types`
Rate Limit Group|`Heavy`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DeviceTypesResource result = rc.restapi(apiVersion).account(accountId).directory().deviceTypes().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [DeviceTypesResource](./src/main/java/com/ringcentral/definitions/DeviceTypesResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-directoryGetDeviceTypes) in API Explorer.

## directorySearchDevices

Search devices within Federated accounts

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/directory/devices/search`
Rate Limit Group|`Heavy`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
DevicesPaginationResource result = rc.restapi(apiVersion).account(accountId).directory().devices().search().post(devicesSearch);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `devicesSearch` is of type [DevicesSearch](./src/main/java/com/ringcentral/definitions/DevicesSearch.java)
- `result` is of
  type [DevicesPaginationResource](./src/main/java/com/ringcentral/definitions/DevicesPaginationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Devices-directorySearchDevices) in API Explorer.

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
DirectoryResource result = rc.restapi(apiVersion).account(accountId).directory().entries().search().post(searchDirectoryEntriesRequest, searchDirectoryEntriesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `searchDirectoryEntriesRequest` is of
  type [SearchDirectoryEntriesRequest](./src/main/java/com/ringcentral/definitions/SearchDirectoryEntriesRequest.java)
- `searchDirectoryEntriesParameters` is of
  type [SearchDirectoryEntriesParameters](./src/main/java/com/ringcentral/definitions/SearchDirectoryEntriesParameters.java)
- `result` is of type [DirectoryResource](./src/main/java/com/ringcentral/definitions/DirectoryResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-searchDirectoryEntries) in API Explorer.

## readDirectoryFederation

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
FederationResource result = rc.restapi(apiVersion).account(accountId).directory().federation().get(readDirectoryFederationParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `readDirectoryFederationParameters` is of
  type [ReadDirectoryFederationParameters](./src/main/java/com/ringcentral/definitions/ReadDirectoryFederationParameters.java)
- `result` is of type [FederationResource](./src/main/java/com/ringcentral/definitions/FederationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Internal-Contacts-readDirectoryFederation) in API Explorer.

## listEmergencyLocations

List Emergency Locations

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
EmergencyLocationsResource result = rc.restapi(apiVersion).account(accountId).emergencyLocations().list(listEmergencyLocationsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listEmergencyLocationsParameters` is of
  type [ListEmergencyLocationsParameters](./src/main/java/com/ringcentral/definitions/ListEmergencyLocationsParameters.java)
- `result` is of
  type [EmergencyLocationsResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listEmergencyLocations) in API
Explorer.

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
EmergencyLocationResource result = rc.restapi(apiVersion).account(accountId).emergencyLocations().post(emergencyLocationInfoRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `emergencyLocationInfoRequest` is of
  type [EmergencyLocationInfoRequest](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfoRequest.java)
- `result` is of
  type [EmergencyLocationResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createEmergencyLocation) in API
Explorer.

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
EmergencyLocationResource result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).get(readEmergencyLocationParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `readEmergencyLocationParameters` is of
  type [ReadEmergencyLocationParameters](./src/main/java/com/ringcentral/definitions/ReadEmergencyLocationParameters.java)
- `result` is of
  type [EmergencyLocationResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readEmergencyLocation) in API
Explorer.

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
EmergencyLocationResource result = rc.restapi(apiVersion).account(accountId).emergencyLocations(locationId).put(emergencyLocationInfoRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `emergencyLocationInfoRequest` is of
  type [EmergencyLocationInfoRequest](./src/main/java/com/ringcentral/definitions/EmergencyLocationInfoRequest.java)
- `result` is of
  type [EmergencyLocationResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateEmergencyLocation) in API
Explorer.

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
- `deleteEmergencyLocationParameters` is of
  type [DeleteEmergencyLocationParameters](./src/main/java/com/ringcentral/definitions/DeleteEmergencyLocationParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteEmergencyLocation) in API
Explorer.

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
- `extensionBulkUpdateRequest` is of
  type [ExtensionBulkUpdateRequest](./src/main/java/com/ringcentral/definitions/ExtensionBulkUpdateRequest.java)
- `result` is of
  type [ExtensionBulkUpdateTaskResource](./src/main/java/com/ringcentral/definitions/ExtensionBulkUpdateTaskResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-extensionBulkUpdate) in API Explorer.

## getExtensionBulkUpdateTask

Get Extension Update Task Status

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
- `result` is of
  type [ExtensionBulkUpdateTaskResource](./src/main/java/com/ringcentral/definitions/ExtensionBulkUpdateTaskResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Extensions-getExtensionBulkUpdateTask) in API Explorer.

## getCallQueueOverflowSettings

Get Call Queue Overflow Settings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{callQueueId}/overflow-settings`
Rate Limit Group|`Heavy`
App Permission|`ReadAccounts`
User Permission|`CallQueueToCallQueue`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallQueueOverflowSettings result = rc.restapi(apiVersion).account(accountId).extension(callQueueId).overflowSettings().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of
  type [CallQueueOverflowSettings](./src/main/java/com/ringcentral/definitions/CallQueueOverflowSettings.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-getCallQueueOverflowSettings) in API Explorer.

## updateCallQueueOverflowSettings

Update Call Queue Overflow Settings

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{callQueueId}/overflow-settings`
Rate Limit Group|`Heavy`
App Permission|`EditExtensions`
User Permission|`CallQueueToCallQueue`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CallQueueOverflowSettings result = rc.restapi(apiVersion).account(accountId).extension(callQueueId).overflowSettings().put(callQueueOverflowSettingsRequestResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `callQueueOverflowSettingsRequestResource` is of
  type [CallQueueOverflowSettingsRequestResource](./src/main/java/com/ringcentral/definitions/CallQueueOverflowSettingsRequestResource.java)
- `result` is of
  type [CallQueueOverflowSettings](./src/main/java/com/ringcentral/definitions/CallQueueOverflowSettings.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Queues-updateCallQueueOverflowSettings) in API
Explorer.

## listExtensionActiveCalls

List User Active Calls

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
ActiveCallsResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).activeCalls().get(listExtensionActiveCallsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listExtensionActiveCallsParameters` is of
  type [ListExtensionActiveCallsParameters](./src/main/java/com/ringcentral/definitions/ListExtensionActiveCallsParameters.java)
- `result` is of type [ActiveCallsResponse](./src/main/java/com/ringcentral/definitions/ActiveCallsResponse.java)

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
- `syncAddressBookParameters` is of
  type [SyncAddressBookParameters](./src/main/java/com/ringcentral/definitions/SyncAddressBookParameters.java)
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
- `listAnsweringRulesParameters` is of
  type [ListAnsweringRulesParameters](./src/main/java/com/ringcentral/definitions/ListAnsweringRulesParameters.java)
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
- `createAnsweringRuleRequest` is of
  type [CreateAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/CreateAnsweringRuleRequest.java)
- `result` is of
  type [CustomAnsweringRuleInfo](./src/main/java/com/ringcentral/definitions/CustomAnsweringRuleInfo.java)

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
- `readAnsweringRuleParameters` is of
  type [ReadAnsweringRuleParameters](./src/main/java/com/ringcentral/definitions/ReadAnsweringRuleParameters.java)
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
- `updateAnsweringRuleRequest` is of
  type [UpdateAnsweringRuleRequest](./src/main/java/com/ringcentral/definitions/UpdateAnsweringRuleRequest.java)
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

## listUserAssignedRoles

Get User Assigned Role List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/assigned-role`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AssignedRolesResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).assignedRole().get(listUserAssignedRolesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listUserAssignedRolesParameters` is of
  type [ListUserAssignedRolesParameters](./src/main/java/com/ringcentral/definitions/ListUserAssignedRolesParameters.java)
- `result` is of type [AssignedRolesResource](./src/main/java/com/ringcentral/definitions/AssignedRolesResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-listUserAssignedRoles) in API Explorer.

## updateUserAssignedRoles

Update User Assigned Roles

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/assigned-role`
Rate Limit Group|`Medium`
App Permission|`RoleManagement`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AssignedRolesResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).assignedRole().put(assignedRolesResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `assignedRolesResource` is of
  type [AssignedRolesResource](./src/main/java/com/ringcentral/definitions/AssignedRolesResource.java)
- `result` is of type [AssignedRolesResource](./src/main/java/com/ringcentral/definitions/AssignedRolesResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-updateUserAssignedRoles) in API Explorer.

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
- `result` is of
  type [GetUserBusinessHoursResponse](./src/main/java/com/ringcentral/definitions/GetUserBusinessHoursResponse.java)

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
- `userBusinessHoursUpdateRequest` is of
  type [UserBusinessHoursUpdateRequest](./src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateRequest.java)
- `result` is of
  type [UserBusinessHoursUpdateResponse](./src/main/java/com/ringcentral/definitions/UserBusinessHoursUpdateResponse.java)

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
- `syncUserCallLogParameters` is of
  type [SyncUserCallLogParameters](./src/main/java/com/ringcentral/definitions/SyncUserCallLogParameters.java)
- `result` is of type [CallLogSync](./src/main/java/com/ringcentral/definitions/CallLogSync.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Log-syncUserCallLog) in API Explorer.

## updateUserCallQueues

Update User Call Queues

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-queues`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditCallQueuePresence`

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
- `callerBlockingSettingsUpdate` is of
  type [CallerBlockingSettingsUpdate](./src/main/java/com/ringcentral/definitions/CallerBlockingSettingsUpdate.java)
- `result` is of type [CallerBlockingSettings](./src/main/java/com/ringcentral/definitions/CallerBlockingSettings.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Blocking-updateCallerBlockingSettings) in API
Explorer.

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
ExtensionCallerIdInfo result = rc.restapi(apiVersion).account(accountId).extension(extensionId).callerId().put(extensionCallerIdInfoRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `extensionCallerIdInfoRequest` is of
  type [ExtensionCallerIdInfoRequest](./src/main/java/com/ringcentral/definitions/ExtensionCallerIdInfoRequest.java)
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
- `createInternalTextMessageRequest` is of
  type [CreateInternalTextMessageRequest](./src/main/java/com/ringcentral/definitions/CreateInternalTextMessageRequest.java)
- `result` is of
  type [GetInternalTextMessageInfoResponse](./src/main/java/com/ringcentral/definitions/GetInternalTextMessageInfoResponse.java)

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
- `readConferencingSettingsParameters` is of
  type [ReadConferencingSettingsParameters](./src/main/java/com/ringcentral/definitions/ReadConferencingSettingsParameters.java)
- `result` is of
  type [GetConferencingInfoResponse](./src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.java)

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
- `updateConferencingInfoRequest` is of
  type [UpdateConferencingInfoRequest](./src/main/java/com/ringcentral/definitions/UpdateConferencingInfoRequest.java)
- `result` is of
  type [GetConferencingInfoResponse](./src/main/java/com/ringcentral/definitions/GetConferencingInfoResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateConferencingSettings) in API Explorer.

## listFavoriteContacts

List Favorite Contacts

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
- `favoriteCollection` is of
  type [FavoriteCollection](./src/main/java/com/ringcentral/definitions/FavoriteCollection.java)
- `result` is of type [FavoriteContactList](./src/main/java/com/ringcentral/definitions/FavoriteContactList.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateFavoriteContactList) in API
Explorer.

## readExtensionFeatures

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
FeatureList result = rc.restapi(apiVersion).account(accountId).extension(extensionId).features().get(readExtensionFeaturesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `readExtensionFeaturesParameters` is of
  type [ReadExtensionFeaturesParameters](./src/main/java/com/ringcentral/definitions/ReadExtensionFeaturesParameters.java)
- `result` is of type [FeatureList](./src/main/java/com/ringcentral/definitions/FeatureList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Features-readExtensionFeatures) in API Explorer.

## listForwardingNumbers

List Forwarding Numbers

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
GetExtensionForwardingNumberListResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of
  type [GetExtensionForwardingNumberListResponse](./src/main/java/com/ringcentral/definitions/GetExtensionForwardingNumberListResponse.java)

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
- `createForwardingNumberRequest` is of
  type [CreateForwardingNumberRequest](./src/main/java/com/ringcentral/definitions/CreateForwardingNumberRequest.java)
- `result` is of type [ForwardingNumberInfo](./src/main/java/com/ringcentral/definitions/ForwardingNumberInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-createForwardingNumber) in API Explorer.

## deleteForwardingNumbers

Delete Forwarding Numbers

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserForwardingFlipNumbers`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber().deleteAll(deleteForwardingNumbersRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `deleteForwardingNumbersRequest` is of
  type [DeleteForwardingNumbersRequest](./src/main/java/com/ringcentral/definitions/DeleteForwardingNumbersRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Forwarding-deleteForwardingNumbers) in API Explorer.

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
ForwardingNumberResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).forwardingNumber(forwardingNumberId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of
  type [ForwardingNumberResource](./src/main/java/com/ringcentral/definitions/ForwardingNumberResource.java)

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
- `updateForwardingNumberRequest` is of
  type [UpdateForwardingNumberRequest](./src/main/java/com/ringcentral/definitions/UpdateForwardingNumberRequest.java)
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
- `result` is of
  type [PublicMeetingInvitationResponse](./src/main/java/com/ringcentral/definitions/PublicMeetingInvitationResponse.java)

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
- `listMessagesParameters` is of
  type [ListMessagesParameters](./src/main/java/com/ringcentral/definitions/ListMessagesParameters.java)
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
- `deleteMessageByFilterParameters` is of
  type [DeleteMessageByFilterParameters](./src/main/java/com/ringcentral/definitions/DeleteMessageByFilterParameters.java)
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
- `updateMessageRequest` is of
  type [UpdateMessageRequest](./src/main/java/com/ringcentral/definitions/UpdateMessageRequest.java)
- `updateMessageParameters` is of
  type [UpdateMessageParameters](./src/main/java/com/ringcentral/definitions/UpdateMessageParameters.java)
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
- `deleteMessageParameters` is of
  type [DeleteMessageParameters](./src/main/java/com/ringcentral/definitions/DeleteMessageParameters.java)
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
- `syncMessagesParameters` is of
  type [SyncMessagesParameters](./src/main/java/com/ringcentral/definitions/SyncMessagesParameters.java)
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
- `listExtensionPhoneNumbersParameters` is of
  type [ListExtensionPhoneNumbersParameters](./src/main/java/com/ringcentral/definitions/ListExtensionPhoneNumbersParameters.java)
- `result` is of
  type [GetExtensionPhoneNumbersResponse](./src/main/java/com/ringcentral/definitions/GetExtensionPhoneNumbersResponse.java)

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
- `readUserPresenceStatusParameters` is of
  type [ReadUserPresenceStatusParameters](./src/main/java/com/ringcentral/definitions/ReadUserPresenceStatusParameters.java)
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
- `presenceInfoRequest` is of
  type [PresenceInfoRequest](./src/main/java/com/ringcentral/definitions/PresenceInfoRequest.java)
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
- `createUserProfileImageRequest` is of
  type [CreateUserProfileImageRequest](./src/main/java/com/ringcentral/definitions/CreateUserProfileImageRequest.java)
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
- `updateUserProfileImageRequest` is of
  type [UpdateUserProfileImageRequest](./src/main/java/com/ringcentral/definitions/UpdateUserProfileImageRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-updateUserProfileImage) in API Explorer.

## deleteUserProfileImage

Delete User Profile Image

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image`
Rate Limit Group|`Medium`
App Permission|`EditExtensions`
User Permission|`EditUserInfo`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).profileImage().delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#User-Settings-deleteUserProfileImage) in API Explorer.

## readScaledProfileImage

Get Scaled Profile Image

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
- `updateUnifiedPresence` is of
  type [UpdateUnifiedPresence](./src/main/java/com/ringcentral/definitions/UpdateUnifiedPresence.java)
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

List Account Meeting Recordings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/meeting-recordings`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ListMeetingRecordingsResponse result = rc.restapi(apiVersion).account(accountId).meetingRecordings().get(listAccountMeetingRecordingsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listAccountMeetingRecordingsParameters` is of
  type [ListAccountMeetingRecordingsParameters](./src/main/java/com/ringcentral/definitions/ListAccountMeetingRecordingsParameters.java)
- `result` is of
  type [ListMeetingRecordingsResponse](./src/main/java/com/ringcentral/definitions/ListMeetingRecordingsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Recordings-listAccountMeetingRecordings) in API
Explorer.

## getAccountLockedSetting

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
- `result` is of
  type [AccountLockedSettingResponse](./src/main/java/com/ringcentral/definitions/AccountLockedSettingResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-getAccountLockedSetting) in API
Explorer.

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
- `result` is of
  type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-readMessageStoreConfiguration) in API
Explorer.

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
- `messageStoreConfiguration` is of
  type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)
- `result` is of
  type [MessageStoreConfiguration](./src/main/java/com/ringcentral/definitions/MessageStoreConfiguration.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Store-updateMessageStoreConfiguration) in API
Explorer.

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
- `createMessageStoreReportRequest` is of
  type [CreateMessageStoreReportRequest](./src/main/java/com/ringcentral/definitions/CreateMessageStoreReportRequest.java)
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

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportTask) in API
Explorer.

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
- `listPagingGroupDevicesParameters` is of
  type [ListPagingGroupDevicesParameters](./src/main/java/com/ringcentral/definitions/ListPagingGroupDevicesParameters.java)
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
- `listPagingGroupUsersParameters` is of
  type [ListPagingGroupUsersParameters](./src/main/java/com/ringcentral/definitions/ListPagingGroupUsersParameters.java)
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
- `makeCallOutRequest` is of
  type [MakeCallOutRequest](./src/main/java/com/ringcentral/definitions/MakeCallOutRequest.java)
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
CallSession result = rc.restapi(apiVersion).account(accountId).telephony().conference().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is of type [CallSession](./src/main/java/com/ringcentral/definitions/CallSession.java)

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
- `readCallSessionStatusParameters` is of
  type [ReadCallSessionStatusParameters](./src/main/java/com/ringcentral/definitions/ReadCallSessionStatusParameters.java)
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
App Permission|`CallControl`
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
- `partyUpdateRequest` is of
  type [PartyUpdateRequest](./src/main/java/com/ringcentral/definitions/PartyUpdateRequest.java)
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
SuperviseCallSessionResponse result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).supervise().post(superviseCallSessionRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `superviseCallSessionRequest` is of
  type [SuperviseCallSessionRequest](./src/main/java/com/ringcentral/definitions/SuperviseCallSessionRequest.java)
- `result` is of
  type [SuperviseCallSessionResponse](./src/main/java/com/ringcentral/definitions/SuperviseCallSessionResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-superviseCallSession) in API Explorer.

## assignMultipleUserRoles

Assign Multiple User Roles

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/user-role/{roleId}/bulk-assign`
Rate Limit Group|`Heavy`
App Permission|`RoleManagement`
User Permission|`EditUserRoles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).userRole(roleId).bulkAssign().post(bulkRoleAssignResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `bulkRoleAssignResource` is of
  type [BulkRoleAssignResource](./src/main/java/com/ringcentral/definitions/BulkRoleAssignResource.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-assignMultipleUserRoles) in API Explorer.

## listContractedCountries

List Contracted Countries

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/brand/{brandId}/contracted-country`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ContractedCountryListResponse result = rc.restapi(apiVersion).dictionary().brand(brandId).contractedCountry().list();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of
  type [ContractedCountryListResponse](./src/main/java/com/ringcentral/definitions/ContractedCountryListResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Company-listContractedCountries) in API Explorer.

## listDomesticCountries

List Domestic Countries

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/brand/{brandId}/contracted-country/{contractedCountryId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
CountryListDictionaryModel result = rc.restapi(apiVersion).dictionary().brand(brandId).contractedCountry(contractedCountryId).get(listDomesticCountriesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listDomesticCountriesParameters` is of
  type [ListDomesticCountriesParameters](./src/main/java/com/ringcentral/definitions/ListDomesticCountriesParameters.java)
- `result` is of
  type [CountryListDictionaryModel](./src/main/java/com/ringcentral/definitions/CountryListDictionaryModel.java)

[Try it out](https://developer.ringcentral.com/api-reference#Company-listDomesticCountries) in API Explorer.

## listPermissionCategories

Get Permission Category List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/permission-category`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PermissionCategoryCollectionResource result = rc.restapi(apiVersion).dictionary().permissionCategory().list(listPermissionCategoriesParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `listPermissionCategoriesParameters` is of
  type [ListPermissionCategoriesParameters](./src/main/java/com/ringcentral/definitions/ListPermissionCategoriesParameters.java)
- `result` is of
  type [PermissionCategoryCollectionResource](./src/main/java/com/ringcentral/definitions/PermissionCategoryCollectionResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Permissions-listPermissionCategories) in API Explorer.

## readPermissionCategory

Get Permission Category

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/dictionary/permission-category/{permissionCategoryId}`
Rate Limit Group|`Light`
App Permission|`N/A`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PermissionCategoryResource result = rc.restapi(apiVersion).dictionary().permissionCategory(permissionCategoryId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- `result` is of
  type [PermissionCategoryResource](./src/main/java/com/ringcentral/definitions/PermissionCategoryResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Permissions-readPermissionCategory) in API Explorer.

## createGlipAdaptiveCardNew

Create Adaptive Card

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/team-messaging/{version}/chats/{chatId}/adaptive-cards`
Rate Limit Group|`Medium`
App Permission|`TeamMessaging`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AdaptiveCardShortInfo result = rc.teamMessaging(version).chats(chatId).adaptiveCards().post(adaptiveCardRequest);
rc.revoke();
```

- `adaptiveCardRequest` is of
  type [AdaptiveCardRequest](./src/main/java/com/ringcentral/definitions/AdaptiveCardRequest.java)
- `result` is of type [AdaptiveCardShortInfo](./src/main/java/com/ringcentral/definitions/AdaptiveCardShortInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Adaptive-Cards-createGlipAdaptiveCardNew) in API Explorer.

## addA2PSMSOptOuts

Assign Multiple Opted Out/In Numbers

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/a2p-sms/opt-outs/bulk-assign`
Rate Limit Group|`Light`
App Permission|`A2PSMS`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
OptOutBulkAssignResponse result = rc.restapi(apiVersion).account(accountId).a2pSms().optOuts().bulkAssign().post(optOutBulkAssignRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `optOutBulkAssignRequest` is of
  type [OptOutBulkAssignRequest](./src/main/java/com/ringcentral/definitions/OptOutBulkAssignRequest.java)
- `result` is of
  type [OptOutBulkAssignResponse](./src/main/java/com/ringcentral/definitions/OptOutBulkAssignResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#High-Volume-SMS-addA2PSMSOptOuts) in API Explorer.

## getAddressBookBulkUploadTask

Get Contacts Upload Task

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
- `result` is of
  type [AddressBookBulkUploadResponse](./src/main/java/com/ringcentral/definitions/AddressBookBulkUploadResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-getAddressBookBulkUploadTask) in API
Explorer.

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
- `callMonitoringBulkAssign` is of
  type [CallMonitoringBulkAssign](./src/main/java/com/ringcentral/definitions/CallMonitoringBulkAssign.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-updateCallMonitoringGroupList) in
API Explorer.

## listCallMonitoringGroupMembers

List Call Monitoring Group Members

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
- `listCallMonitoringGroupMembersParameters` is of
  type [ListCallMonitoringGroupMembersParameters](./src/main/java/com/ringcentral/definitions/ListCallMonitoringGroupMembersParameters.java)
- `result` is of
  type [CallMonitoringGroupMemberList](./src/main/java/com/ringcentral/definitions/CallMonitoringGroupMemberList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Monitoring-Groups-listCallMonitoringGroupMembers) in
API Explorer.

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
- `listCallRecordingCustomGreetingsParameters` is of
  type [ListCallRecordingCustomGreetingsParameters](./src/main/java/com/ringcentral/definitions/ListCallRecordingCustomGreetingsParameters.java)
- `result` is of
  type [CallRecordingCustomGreetings](./src/main/java/com/ringcentral/definitions/CallRecordingCustomGreetings.java)

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-listCallRecordingCustomGreetings)
in API Explorer.

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

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-deleteCallRecordingCustomGreetingList)
in API Explorer.

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

[Try it out](https://developer.ringcentral.com/api-reference#Call-Recording-Settings-deleteCallRecordingCustomGreeting)
in API Explorer.

## listDevicesAutomaticLocationUpdates

List Devices

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
- `listDevicesAutomaticLocationUpdatesParameters` is of
  type [ListDevicesAutomaticLocationUpdatesParameters](./src/main/java/com/ringcentral/definitions/ListDevicesAutomaticLocationUpdatesParameters.java)
- `result` is of
  type [ListDevicesAutomaticLocationUpdates](./src/main/java/com/ringcentral/definitions/ListDevicesAutomaticLocationUpdates.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listDevicesAutomaticLocationUpdates)
in API Explorer.

## assignMultipleDevicesAutomaticLocationUpdates

Enable Automatic Location Updates Feature

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
- `assignMultipleDevicesAutomaticLocationUpdates` is of
  type [AssignMultipleDevicesAutomaticLocationUpdates](./src/main/java/com/ringcentral/definitions/AssignMultipleDevicesAutomaticLocationUpdates.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-assignMultipleDevicesAutomaticLocationUpdates)
in API Explorer.

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
NetworksList result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks().list(listNetworksParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `listNetworksParameters` is of
  type [ListNetworksParameters](./src/main/java/com/ringcentral/definitions/ListNetworksParameters.java)
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
- `createNetworkRequest` is of
  type [CreateNetworkRequest](./src/main/java/com/ringcentral/definitions/CreateNetworkRequest.java)
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
NetworkInfo result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().networks(networkId).put(updateNetworkRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `updateNetworkRequest` is of
  type [UpdateNetworkRequest](./src/main/java/com/ringcentral/definitions/UpdateNetworkRequest.java)
- `result` is of type [NetworkInfo](./src/main/java/com/ringcentral/definitions/NetworkInfo.java)

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

List Account Switches

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
- `listAccountSwitchesParameters` is of
  type [ListAccountSwitchesParameters](./src/main/java/com/ringcentral/definitions/ListAccountSwitchesParameters.java)
- `result` is of type [SwitchesList](./src/main/java/com/ringcentral/definitions/SwitchesList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listAccountSwitches) in API
Explorer.

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
- `createMultipleSwitchesRequest` is of
  type [CreateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/CreateMultipleSwitchesRequest.java)
- `result` is of
  type [CreateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/CreateMultipleSwitchesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createMultipleSwitches) in API
Explorer.

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
- `updateMultipleSwitchesRequest` is of
  type [UpdateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/UpdateMultipleSwitchesRequest.java)
- `result` is of
  type [UpdateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/UpdateMultipleSwitchesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateMultipleSwitches) in API
Explorer.

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
- `validateMultipleSwitchesRequest` is of
  type [ValidateMultipleSwitchesRequest](./src/main/java/com/ringcentral/definitions/ValidateMultipleSwitchesRequest.java)
- `result` is of
  type [ValidateMultipleSwitchesResponse](./src/main/java/com/ringcentral/definitions/ValidateMultipleSwitchesResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-validateMultipleSwitches) in API
Explorer.

## assignMultipleAutomaticLocationUpdatesUsers

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
String result = rc.restapi(apiVersion).account(accountId).emergencyAddressAutoUpdate().users().bulkAssign().post(emergencyAddressAutoUpdateUsersBulkAssignResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `emergencyAddressAutoUpdateUsersBulkAssignResource` is of
  type [EmergencyAddressAutoUpdateUsersBulkAssignResource](./src/main/java/com/ringcentral/definitions/EmergencyAddressAutoUpdateUsersBulkAssignResource.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-assignMultipleAutomaticLocationUpdatesUsers)
in API Explorer.

## listContacts

List Contacts

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
- `listContactsParameters` is of
  type [ListContactsParameters](./src/main/java/com/ringcentral/definitions/ListContactsParameters.java)
- `result` is of type [ContactList](./src/main/java/com/ringcentral/definitions/ContactList.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-listContacts) in API Explorer.

## createContact

Create User Contact

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
- `personalContactRequest` is of
  type [PersonalContactRequest](./src/main/java/com/ringcentral/definitions/PersonalContactRequest.java)
- `createContactParameters` is of
  type [CreateContactParameters](./src/main/java/com/ringcentral/definitions/CreateContactParameters.java)
- `result` is of
  type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-createContact) in API Explorer.

## readContact

Get User Contact(s)

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
- `result` is of
  type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-readContact) in API Explorer.

## updateContact

Update User Contact(s)

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
- `personalContactRequest` is of
  type [PersonalContactRequest](./src/main/java/com/ringcentral/definitions/PersonalContactRequest.java)
- `updateContactParameters` is of
  type [UpdateContactParameters](./src/main/java/com/ringcentral/definitions/UpdateContactParameters.java)
- `result` is of
  type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-updateContact) in API Explorer.

## deleteContact

Delete User Contact(s)

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

## patchContact

Update Contact Attributes

Name|Value
-|-
HTTP Method|`PATCH`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}`
Rate Limit Group|`Heavy`
App Permission|`Contacts`
User Permission|`EditPersonalContacts`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
PersonalContactResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).addressBook().contact(contactId).patch(personalContactRequest, patchContactParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `personalContactRequest` is of
  type [PersonalContactRequest](./src/main/java/com/ringcentral/definitions/PersonalContactRequest.java)
- `patchContactParameters` is of
  type [PatchContactParameters](./src/main/java/com/ringcentral/definitions/PatchContactParameters.java)
- `result` is of
  type [PersonalContactResource](./src/main/java/com/ringcentral/definitions/PersonalContactResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#External-Contacts-patchContact) in API Explorer.

## listAdministeredSites

Get User Administered Site List

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/administered-sites`
Rate Limit Group|`Medium`
App Permission|`ReadAccounts`
User Permission|`ReadExtensions`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).administeredSites().get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Site-Administration-listAdministeredSites) in API Explorer.

## updateUserAdministeredSites

Update User Administered Sites

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/administered-sites`
Rate Limit Group|`Medium`
App Permission|`EditAccounts`
User Permission|`EditAssignedRoles`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
BusinessSiteCollectionResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).administeredSites().put(businessSiteCollectionRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `businessSiteCollectionRequest` is of
  type [BusinessSiteCollectionRequest](./src/main/java/com/ringcentral/definitions/BusinessSiteCollectionRequest.java)
- `result` is of
  type [BusinessSiteCollectionResource](./src/main/java/com/ringcentral/definitions/BusinessSiteCollectionResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Site-Administration-updateUserAdministeredSites) in API
Explorer.

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
- `checkUserPermissionParameters` is of
  type [CheckUserPermissionParameters](./src/main/java/com/ringcentral/definitions/CheckUserPermissionParameters.java)
- `result` is of
  type [AuthProfileCheckResource](./src/main/java/com/ringcentral/definitions/AuthProfileCheckResource.java)

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
- `readExtensionCallQueuePresenceParameters` is of
  type [ReadExtensionCallQueuePresenceParameters](./src/main/java/com/ringcentral/definitions/ReadExtensionCallQueuePresenceParameters.java)
- `result` is of
  type [ExtensionCallQueuePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueuePresenceList.java)

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
- `extensionCallQueueUpdatePresenceList` is of
  type [ExtensionCallQueueUpdatePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueueUpdatePresenceList.java)
- `result` is of
  type [ExtensionCallQueuePresenceList](./src/main/java/com/ringcentral/definitions/ExtensionCallQueuePresenceList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Presence-updateExtensionCallQueuePresence) in API Explorer.

## getExtensionEmergencyLocations

List User Emergency Locations

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
EmergencyLocationsResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).emergencyLocations().list(getExtensionEmergencyLocationsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `getExtensionEmergencyLocationsParameters` is of
  type [GetExtensionEmergencyLocationsParameters](./src/main/java/com/ringcentral/definitions/GetExtensionEmergencyLocationsParameters.java)
- `result` is of
  type [EmergencyLocationsResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationsResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-getExtensionEmergencyLocations)
in API Explorer.

## createExtensionEmergencyLocation

Create User Emergency Location

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`EmergencyFramework`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
EmergencyLocationResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).emergencyLocations().post(createUserEmergencyLocationRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createUserEmergencyLocationRequest` is of
  type [CreateUserEmergencyLocationRequest](./src/main/java/com/ringcentral/definitions/CreateUserEmergencyLocationRequest.java)
- `result` is of
  type [EmergencyLocationResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createExtensionEmergencyLocation)
in API Explorer.

## getExtensionEmergencyLocation

Get User Emergency Location

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations/{locationId}`
Rate Limit Group|`Light`
App Permission|`ReadAccounts`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
EmergencyLocationResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).emergencyLocations(locationId).get();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of
  type [EmergencyLocationResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-getExtensionEmergencyLocation)
in API Explorer.

## updateExtensionEmergencyLocation

Update User Emergency Location

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations/{locationId}`
Rate Limit Group|`Light`
App Permission|`EditAccounts`
User Permission|`EmergencyFramework`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
EmergencyLocationResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).emergencyLocations(locationId).put(emergencyLocationResource);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `emergencyLocationResource` is of
  type [EmergencyLocationResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationResource.java)
- `result` is of
  type [EmergencyLocationResource](./src/main/java/com/ringcentral/definitions/EmergencyLocationResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateExtensionEmergencyLocation)
in API Explorer.

## deleteExtensionEmergencyLocation

Delete User Emergency Location

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations/{locationId}`
Rate Limit Group|`Heavy`
App Permission|`EditAccounts`
User Permission|`EmergencyFramework`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).emergencyLocations(locationId).delete(deleteExtensionEmergencyLocationParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `deleteExtensionEmergencyLocationParameters` is of
  type [DeleteExtensionEmergencyLocationParameters](./src/main/java/com/ringcentral/definitions/DeleteExtensionEmergencyLocationParameters.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteExtensionEmergencyLocation)
in API Explorer.

## listUserMeetingRecordings

List User Meeting Recordings

Name|Value
-|-
HTTP Method|`GET`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting-recordings`
Rate Limit Group|`Medium`
App Permission|`Meetings`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
ListMeetingRecordingsResponse result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingRecordings().get(listUserMeetingRecordingsParameters);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `listUserMeetingRecordingsParameters` is of
  type [ListUserMeetingRecordingsParameters](./src/main/java/com/ringcentral/definitions/ListUserMeetingRecordingsParameters.java)
- `result` is of
  type [ListMeetingRecordingsResponse](./src/main/java/com/ringcentral/definitions/ListMeetingRecordingsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Recordings-listUserMeetingRecordings) in API
Explorer.

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
- `result` is of
  type [MessageStoreReportArchive](./src/main/java/com/ringcentral/definitions/MessageStoreReportArchive.java)

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchive) in API
Explorer.

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

[Try it out](https://developer.ringcentral.com/api-reference#Message-Exports-readMessageStoreReportArchiveContent) in
API Explorer.

## assignDefaultRole

Assign Default Role

Name|Value
-|-
HTTP Method|`PUT`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/assigned-role/default`
Rate Limit Group|`Medium`
App Permission|`RoleManagement`
User Permission|`Users`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
AssignedRolesResource result = rc.restapi(apiVersion).account(accountId).extension(extensionId).assignedRole().default().put();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `result` is of type [AssignedRolesResource](./src/main/java/com/ringcentral/definitions/AssignedRolesResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Role-Management-assignDefaultRole) in API Explorer.

## createUserMeetingProfileImage

Upload User Meeting Profile Image

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting-configuration/profile-image`
Rate Limit Group|`Light`
App Permission|`Meetings`
User Permission|`Meetings`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).extension(extensionId).meetingConfiguration().profileImage().post(createUserMeetingProfileImageRequest);
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- Parameter `extensionId` is optional with default value `~`
- `createUserMeetingProfileImageRequest` is of
  type [CreateUserMeetingProfileImageRequest](./src/main/java/com/ringcentral/definitions/CreateUserMeetingProfileImageRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-createUserMeetingProfileImage) in API
Explorer.

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
- `result` is of
  type [MeetingServiceInfoResource](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-readMeetingServiceInfo) in API
Explorer.

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
- `meetingServiceInfoRequest` is of
  type [MeetingServiceInfoRequest](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoRequest.java)
- `result` is of
  type [MeetingServiceInfoResource](./src/main/java/com/ringcentral/definitions/MeetingServiceInfoResource.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-updateMeetingServiceInfo) in API
Explorer.

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
- `readMessageContentParameters` is of
  type [ReadMessageContentParameters](./src/main/java/com/ringcentral/definitions/ReadMessageContentParameters.java)
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

[Try it out](https://developer.ringcentral.com/api-reference#Video-Configuration-readUserVideoConfiguration) in API
Explorer.

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
- `userVideoConfiguration` is of
  type [UserVideoConfiguration](./src/main/java/com/ringcentral/definitions/UserVideoConfiguration.java)
- `result` is of type [UserVideoConfiguration](./src/main/java/com/ringcentral/definitions/UserVideoConfiguration.java)

[Try it out](https://developer.ringcentral.com/api-reference#Video-Configuration-updateUserVideoConfiguration) in API
Explorer.

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
- `editPagingGroupRequest` is of
  type [EditPagingGroupRequest](./src/main/java/com/ringcentral/definitions/EditPagingGroupRequest.java)
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Paging-Only-Groups-assignMultiplePagingGroupUsersDevices)
in API Explorer.

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
- `result` is of
  type [AutomaticLocationUpdatesTaskInfo](./src/main/java/com/ringcentral/definitions/AutomaticLocationUpdatesTaskInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readAutomaticLocationUpdatesTask)
in API Explorer.

## listAutomaticLocationUpdatesUsers

List Users

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
- `listAutomaticLocationUpdatesUsersParameters` is of
  type [ListAutomaticLocationUpdatesUsersParameters](./src/main/java/com/ringcentral/definitions/ListAutomaticLocationUpdatesUsersParameters.java)
- `result` is of
  type [AutomaticLocationUpdatesUserList](./src/main/java/com/ringcentral/definitions/AutomaticLocationUpdatesUserList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listAutomaticLocationUpdatesUsers)
in API Explorer.

## listWirelessPoints

List Wireless Points

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
- `listWirelessPointsParameters` is of
  type [ListWirelessPointsParameters](./src/main/java/com/ringcentral/definitions/ListWirelessPointsParameters.java)
- `result` is of type [WirelessPointsList](./src/main/java/com/ringcentral/definitions/WirelessPointsList.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-listWirelessPoints) in API
Explorer.

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
- `createWirelessPoint` is of
  type [CreateWirelessPoint](./src/main/java/com/ringcentral/definitions/CreateWirelessPoint.java)
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createWirelessPoint) in API
Explorer.

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

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-readWirelessPoint) in API
Explorer.

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
- `updateWirelessPoint` is of
  type [UpdateWirelessPoint](./src/main/java/com/ringcentral/definitions/UpdateWirelessPoint.java)
- `result` is of type [WirelessPointInfo](./src/main/java/com/ringcentral/definitions/WirelessPointInfo.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateWirelessPoint) in API
Explorer.

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

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-deleteWirelessPoint) in API
Explorer.

## getUserSetting

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
- `result` is of
  type [MeetingUserSettingsResponse](./src/main/java/com/ringcentral/definitions/MeetingUserSettingsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Meeting-Configuration-getUserSetting) in API Explorer.

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
- `notificationSettingsUpdateRequest` is of
  type [NotificationSettingsUpdateRequest](./src/main/java/com/ringcentral/definitions/NotificationSettingsUpdateRequest.java)
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
- `bridgeTargetRequest` is of
  type [BridgeTargetRequest](./src/main/java/com/ringcentral/definitions/BridgeTargetRequest.java)
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

## stopPlayCallParty

Stop Playing Audio File

Name|Value
-|-
HTTP Method|`DELETE`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/play/{playId}`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).play(playId).delete();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-stopPlayCallParty) in API Explorer.

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
- `createMultipleWirelessPointsRequest` is of
  type [CreateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/CreateMultipleWirelessPointsRequest.java)
- `result` is of
  type [CreateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/CreateMultipleWirelessPointsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-createMultipleWirelessPoints) in
API Explorer.

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
- `updateMultipleWirelessPointsRequest` is of
  type [UpdateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/UpdateMultipleWirelessPointsRequest.java)
- `result` is of
  type [UpdateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/UpdateMultipleWirelessPointsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-updateMultipleWirelessPoints) in
API Explorer.

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
- `validateMultipleWirelessPointsRequest` is of
  type [ValidateMultipleWirelessPointsRequest](./src/main/java/com/ringcentral/definitions/ValidateMultipleWirelessPointsRequest.java)
- `result` is of
  type [ValidateMultipleWirelessPointsResponse](./src/main/java/com/ringcentral/definitions/ValidateMultipleWirelessPointsResponse.java)

[Try it out](https://developer.ringcentral.com/api-reference#Automatic-Location-Updates-validateMultipleWirelessPoints)
in API Explorer.

## listBlockedAllowedNumbers

List Blocked/Allowed Phone Numbers

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
- `listBlockedAllowedNumbersParameters` is of
  type [ListBlockedAllowedNumbersParameters](./src/main/java/com/ringcentral/definitions/ListBlockedAllowedNumbersParameters.java)
- `result` is of
  type [BlockedAllowedPhoneNumbersList](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumbersList.java)

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
- `addBlockedAllowedPhoneNumber` is of
  type [AddBlockedAllowedPhoneNumber](./src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.java)
- `result` is of
  type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)

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
- `result` is of
  type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)

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
- `addBlockedAllowedPhoneNumber` is of
  type [AddBlockedAllowedPhoneNumber](./src/main/java/com/ringcentral/definitions/AddBlockedAllowedPhoneNumber.java)
- `result` is of
  type [BlockedAllowedPhoneNumberInfo](./src/main/java/com/ringcentral/definitions/BlockedAllowedPhoneNumberInfo.java)

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

## pausePlayCallParty

Pause Playing Audio File

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/play/{playId}/pause`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).play(playId).pause().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-pausePlayCallParty) in API Explorer.

## resumePlayCallParty

Resume Playing Audio File

Name|Value
-|-
HTTP Method|`POST`
Endpoint|`/restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/play/{playId}/resume`
Rate Limit Group|`Light`
App Permission|`CallControl`
User Permission|`N/A`

```java
RestClient rc = new RestClient(clientID, clientSecret, serverURL);
rc.authorize(username, extension, password);
String result = rc.restapi(apiVersion).account(accountId).telephony().sessions(telephonySessionId).parties(partyId).play(playId).resume().post();
rc.revoke();
```

- Parameter `apiVersion` is optional with default value `v1.0`
- Parameter `accountId` is optional with default value `~`
- `result` is an empty string

[Try it out](https://developer.ringcentral.com/api-reference#Call-Control-resumePlayCallParty) in API Explorer.

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
- `callRecordingUpdate` is of
  type [CallRecordingUpdate](./src/main/java/com/ringcentral/definitions/CallRecordingUpdate.java)
- `pauseResumeCallRecordingParameters` is of
  type [PauseResumeCallRecordingParameters](./src/main/java/com/ringcentral/definitions/PauseResumeCallRecordingParameters.java)
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
- `partySuperviseRequest` is of
  type [PartySuperviseRequest](./src/main/java/com/ringcentral/definitions/PartySuperviseRequest.java)
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
