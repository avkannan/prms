create index IX_EC35642B on prms_lookup (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4D8EF96D on prms_lookup (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B01BFA9B on prms_plantation (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4A086BDD on prms_plantation (uuid_[$COLUMN_LENGTH:75$], groupId);