---
title: TokensApi
---
## TokensApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteTokensMe**](TokensApi.html#deleteTokensMe) | Delete  auth token used to make the request. |
{: class="table table-striped"}

<a name="deleteTokensMe"></a>

# **deleteTokensMe**

> String deleteTokensMe()

Delete  auth token used to make the request.



Wraps DELETE /api/v2/tokens/me  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TokensApi apiInstance = new TokensApi();
try {
    String result = apiInstance.deleteTokensMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#deleteTokensMe");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

**String**
