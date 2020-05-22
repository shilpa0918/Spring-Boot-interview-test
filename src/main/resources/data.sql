
create table IF NOT EXISTS shipping_line(shipping_line_id int,shipping_line_name varchar(32),line_code int,description varchar(100),primary key(shipping_line_id))
 
create table IF NOT EXISTS vessel(vessel_id int,ETA datetime, vesselatadate datetime, vessel_code int, vessel_name varchar(32),shipping_line_id int,primary key(vessel_id),foreign key(shipping_line_id) references shipping_line(shipping_line_id))
 
create table IF NOT EXISTS container(container_id int,container_full_or_empty int,container_iso_code varchar(32),container_number int,container_type varchar(32),gross_weight int,length int,height int,width int,is_dggoods int,sealnumber varchar(32),primary key(container_id),vessel_id int, foreign key(vessel_id)references vessel(vessel_id))
 
-- insert into shipping_line (shipping_line_id,shipping_line_name,line_code,description) values (1,'new Ship line',10,'this is best ship') 

-- insert into vessel (vessel_id,ETA,vesselatadate,vessel_code,vessel_name,shipping_line_id) values (1,'12-12-2018','7-1-2017',120,'new vessel',1)

-- insert into container(container_id,container_full_or_empty,container_iso_code,container_number,container_type,gross_weight,length,height,width,is_dggoods,sealnumber,vessel_id) values  (1,1,'abc125',101,'Tunnel container',100,20,50,20,1,'xyz123',1)
 
 
 
 
