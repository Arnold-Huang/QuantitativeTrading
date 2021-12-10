create table if not exists exchange_log
(
    id            int auto_increment
        primary key,
    merchant_id   varchar(36)                               not null,
    client_ip     varchar(20)                               null,
    url           text                                      null,
    user_agent    text                                      null,
    exchange_type varchar(30)                               not null,
    message       text                                      null,
    method        varchar(36)                               null,
    created_time  timestamp(6) default CURRENT_TIMESTAMP(6) not null
);
