create table `employee_info` (
    `employee_id` int not null auto_increment,
    `employee_name` varchar(64) not null comment '员工名称',
    `gender` int not null comment '员工性别',
    `role` varchar(64) not null comment '员工职位',
    `location` varchar(64) comment '地理位置',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`employee_id`)
);