---
title: StationsApi
---
## StationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteStationAssociateduser**](StationsApi.html#deleteStationAssociateduser) | Unassigns the user assigned to this station |
| [**getStation**](StationsApi.html#getStation) | Get station. |
| [**getStations**](StationsApi.html#getStations) | Get the list of available stations. |
{: class="table table-striped"}

<a name="deleteStationAssociateduser"></a>

# **deleteStationAssociateduser**

> String deleteStationAssociateduser(stationId)

Unassigns the user assigned to this station



Wraps DELETE /api/v2/stations/{stationId}/associateduser  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

StationsApi apiInstance = new StationsApi();
String stationId = "stationId_example"; // String | Station ID
try {
    String result = apiInstance.deleteStationAssociateduser(stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#deleteStationAssociateduser");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stationId** | **String**| Station ID | |
{: class="table table-striped"}

### Return type

**String**

<a name="getStation"></a>

# **getStation**

> [Station](Station.html) getStation(stationId)

Get station.



Wraps GET /api/v2/stations/{stationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

StationsApi apiInstance = new StationsApi();
String stationId = "stationId_example"; // String | Station ID
try {
    Station result = apiInstance.getStation(stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#getStation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stationId** | **String**| Station ID | |
{: class="table table-striped"}

### Return type

[**Station**](Station.html)

<a name="getStations"></a>

# **getStations**

> [StationEntityListing](StationEntityListing.html) getStations(pageSize, pageNumber, sortBy, name, id, lineAppearanceId)

Get the list of available stations.



Wraps GET /api/v2/stations  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

StationsApi apiInstance = new StationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String name = "name_example"; // String | Name
String id = "id_example"; // String | Comma separated list of stationIds
String lineAppearanceId = "lineAppearanceId_example"; // String | lineAppearanceId
try {
    StationEntityListing result = apiInstance.getStations(pageSize, pageNumber, sortBy, name, id, lineAppearanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#getStations");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **sortBy** | **String**| Sort by | [optional] [default to name] |
| **name** | **String**| Name | [optional] |
| **id** | **String**| Comma separated list of stationIds | [optional] |
| **lineAppearanceId** | **String**| lineAppearanceId | [optional] |
{: class="table table-striped"}

### Return type

[**StationEntityListing**](StationEntityListing.html)
