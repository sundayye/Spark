create user spark identified by 12345678;
grant dba to spark;
grant unlimited tablespace to spark;
grant select any table to spark;
grant select any dictionary to spark;
/
create table spark.inbound_config(
     id varchar2(256),
     name varchar2(100) not null,
     created_time timestamp,
     properties CLOB,
     inbound_type varchar2(100)not null
);
/
create table spark.outbound_config(
     id varchar2(256),
     name varchar2(100) not null,
     created_time timestamp,
     properties CLOB,
     outbound_type varchar2(100)not null
);
/
create table spark.flow_config(
     id varchar2(256),
     name varchar2(100) not null,
     created_time timestamp,
     inbound_config_id varchar2(256),
     parser_type varchar2(100),
     key_mapper_id varchar2(256),
     formatter_id varchar2(256),
     outbound_config_id varchar2(256),
     transaction_type varchar2(100),
     flow_status varchar2(100),
     flow_type varchar2(100)
);
/
create table spark.formatter_config(
     id varchar2(256),
     name varchar2(100),
     created_time timestamp,
     template CLOB,
     properties CLOB,
     formatter_type varchar2(100)
);
/
create table spark.key_mapper_config(
    id varchar2(256),
    name varchar2(100),
    created_time timestamp,
    properties CLOB,
    key_mapper_type varchar2(100)
);
/
CREATE SEQUENCE spark.spark_seq
INCREMENT BY 1
START WITH 1;
/
create public SYNONYM inbound_config for spark.inbound_config;
create public SYNONYM outbound_config for spark.outbound_config;
create public SYNONYM flow_config for spark.flow_config;
create public SYNONYM formatter_config for spark.formatter_config;
create public SYNONYM key_mapper_config for spark.key_mapper_config;
create public SYNONYM spark_seq for spark.spark_seq;
/
commit;
/