---
title: TrustRequest
---
## TrustRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **createdBy** | [**OrgUser**](OrgUser.html) | User who created this request. |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Date request was created. There is a 48 hour expiration on all requests. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **trustee** | [**Organization**](Organization.html) | Trustee organization who generated this request. |  |
| **users** | [**List&lt;OrgUser&gt;**](OrgUser.html) | The list of trustee users that are requesting access. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}

