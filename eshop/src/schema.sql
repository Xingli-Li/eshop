/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  lixi3350
 * Created: 9/08/2016
 */



create table product (
id integer not null,
name varchar not null,
description varchar,
category varchar not null,
price integer not null,
quantity integer not null,
constraint pk_products primary key (id)
);