---
title: Condition
---
## Condition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum) | The type of the condition. |  [optional] |
| **inverted** | **Boolean** | If true, inverts the result of evaluating this Condition. Default is false. |  [optional] |
| **attributeName** | **String** | An attribute name associated with this Condition. Required for a contactAttributeCondition. |  [optional] |
| **value** | **String** | A value associated with this Condition. This could be text, a number, or a relative time. A value for relative time should follow the format PxxDTyyHzzM, where xx, yy, and zz specify the days, hours and minutes. For example, a value of P01DT08H30M corresponds to 1 day, 8 hours, and 30 minutes from now. To specify a time in the past, include a negative sign before each numeric value. For example, a value of P-01DT-08H-30M corresponds to 1 day, 8 hours, and 30 minutes in the past. You can also do things like P01DT00H-30M, which would correspond to 23 hours and 30 minutes from now (1 day - 30 minutes). |  [optional] |
| **valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The type of the value associated with this Condition. |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum) | An operation with which to evaluate the Condition. |  [optional] |
| **codes** | **List&lt;String&gt;** | List of wrap-up code identifiers. Required for a wrapupCondition. |  [optional] |
| **property** | **String** | A value associated with the property type of this Condition. Required for a contactPropertyCondition. |  [optional] |
| **propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum) | The type of the property associated with this Condition. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| WRAPUPCONDITION | &quot;wrapupCondition&quot; |
| CONTACTATTRIBUTECONDITION | &quot;contactAttributeCondition&quot; |
| PHONENUMBERCONDITION | &quot;phoneNumberCondition&quot; |
| PHONENUMBERTYPECONDITION | &quot;phoneNumberTypeCondition&quot; |
| CALLANALYSISCONDITION | &quot;callAnalysisCondition&quot; |
| CONTACTPROPERTYCONDITION | &quot;contactPropertyCondition&quot; |


<a name="ValueTypeEnum"></a>

## Enum: ValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| STRING | &quot;STRING&quot; |
| NUMERIC | &quot;NUMERIC&quot; |
| DATETIME | &quot;DATETIME&quot; |
| PERIOD | &quot;PERIOD&quot; |


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EQUALS | &quot;EQUALS&quot; |
| LESS_THAN | &quot;LESS_THAN&quot; |
| LESS_THAN_EQUALS | &quot;LESS_THAN_EQUALS&quot; |
| GREATER_THAN | &quot;GREATER_THAN&quot; |
| GREATER_THAN_EQUALS | &quot;GREATER_THAN_EQUALS&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| BEFORE | &quot;BEFORE&quot; |
| AFTER | &quot;AFTER&quot; |
| IN | &quot;IN&quot; |


<a name="PropertyTypeEnum"></a>

## Enum: PropertyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| LAST_ATTEMPT_BY_COLUMN | &quot;LAST_ATTEMPT_BY_COLUMN&quot; |
| LAST_ATTEMPT_OVERALL | &quot;LAST_ATTEMPT_OVERALL&quot; |
| LAST_WRAPUP_BY_COLUMN | &quot;LAST_WRAPUP_BY_COLUMN&quot; |
| LAST_WRAPUP_OVERALL | &quot;LAST_WRAPUP_OVERALL&quot; |
{: class="table table-striped"}


