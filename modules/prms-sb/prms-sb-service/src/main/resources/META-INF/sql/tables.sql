create table prms_lookup (
	uuid_ VARCHAR(75) null,
	lookupId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	lookupKey VARCHAR(75) null,
	lookupValue VARCHAR(75) null,
	lookupName INTEGER
);

create table prms_plantation (
	uuid_ VARCHAR(75) null,
	plantId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	plantType VARCHAR(75) null,
	name VARCHAR(75) null,
	origin VARCHAR(75) null,
	yieldMeasure INTEGER,
	lifeSpan INTEGER,
	breed VARCHAR(75) null
);