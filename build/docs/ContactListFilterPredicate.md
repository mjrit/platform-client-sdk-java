---
title: ContactListFilterPredicate
---
## ContactListFilterPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **column** | **String** | Contact List column that must match a contact list column in the ContactListFilter&#39;s contactList object |  [optional] |
| **columnType** | [**ColumnTypeEnum**](#ColumnTypeEnum) | Whether the contact column contains numeric or alphabetic data |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional] |
| **value** | **String** | Contact List value to operate on. This could be text, a number, or a relative time. A value for relative time should follow the format PxxDTyyHzzM, where xx, yy, and zz specify the days, hours and minutes. For example, a value of P01DT08H30M corresponds to 1 day, 8 hours, and 30 minutes from now. To specify a time in the past, include a negative sign before each numeric value. For example, a value of P-01DT-08H-30M corresponds to 1 day, 8 hours, and 30 minutes in the past. You can also do things like P01DT00H-30M, which would correspond to 23 hours and 30 minutes from now (1 day - 30 minutes). |  [optional] |
| **range** | [**ContactListFilterRange**](ContactListFilterRange.html) | Range is only required for ContactListFilterComparisonOperator&#39;s BETWEEN and IN |  [optional] |
| **inverted** | **Boolean** | Inverts the result of the predicate (i.e., if the predicate returns true, inverting it will return false). |  [optional] |
{: class="table table-striped"}


<a name="ColumnTypeEnum"></a>

## Enum: ColumnTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NUMERIC | &quot;numeric&quot; |
| ALPHABETIC | &quot;alphabetic&quot; |


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
| BETWEEN | &quot;BETWEEN&quot; |
| IN | &quot;IN&quot; |
{: class="table table-striped"}

