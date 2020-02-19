use dabang;
show tables;


select * from user;
select * from room;
select * from options;
select * from room_option;
select * from floor;
select * from post_deal;
select * from post_auth;
select * from like_room;-
select * from room_pic;

drop table like_room;
drop table user;
drop table room;
drop table options;
drop table room_option;
drop table room_pic;
drop table floor;
drop table post_deal;
drop table post_auth;


use dabang;
show tables;
CREATE TABLE user(
	userId int AUTO_INCREMENT PRIMARY KEY, 
	email varchar(30) not null,
	name varchar(20) not null,
	password varchar(20) not null,
	phone varchar(11),
	type varchar(1),
    typeImage varchar(1000),
	role varchar(10),
	createDate timestamp,
	profile varchar(1000)
)ENGINE=InnoDB DEFAULT CHARSET = utf8;

select * from user;
insert INTO user VALUES (1, 'ssar@nate.com', '쌀쌀', '1234','01011113333', '3', '공인자격증.jpg', 'not', now(),'내사진.jpg');
insert INTO user VALUES (2, 'cos@nate.com', '코스', '1234','01011113333', '2', null , 'not', now(),'내사진.jpg');
insert INTO user VALUES (3, 'kyj@nate.com', '세입자', '1234','01011113333', '1', null , 'not', now(),'내사진.jpg');

delete from room where roomId=1;
insert INTO room VALUES (1, '투룸', '경기도 시흥시 정왕동','402호',14000, 6000, 40, 18000, 20, 64.7, 4, '즉시입주', 7,
'P','P','P','오늘준공난!평수깡패투룸!!입니댜^^','**신축! 풀옵션은 이제 기본! 이 방의 첫입주 첫주인이 되어주세욥!!', now(), 2, 1, 19.77, 88.32);
insert INTO room VALUES (2, '원룸', '부산시 남구 대연동','303호',18000, 9000, 60, 25000, 30, 77.5, 6, '날짜협의', 10,
'P','P','P','오늘준공난!평수깡패투룸!!입니댜^^','**신축! 풀옵션은 이제 기본! 이 방의 첫입주 첫주인이 되어주세욥!!', now(), 3, 1, 22.22, 80.25);
select * from room;

CREATE TABLE room (
	roomId int auto_increment primary key,
    roomType varchar(20) not null,
    addr varchar(200) not null,
    detailAddr varchar(100) not null,
    yearRent int NOT NULL default '0',
    deposit int NOT NULL default '0',
    monthRent int NOT NULL default '0',
    dealRent int not null,
    areaP double not null,
    areaM double not null,
    floor int not null,
    moveDay varchar(10) not null,
    mCost int NOT NULL default '0',
    parking varchar(2) not null,
    elevator varchar(2) not null,
    lof varchar(2) not null,
    title varchar(50) not null,
    content varchar(200) not null,
    createDate timestamp,
    hostId int default '0',
	agentId int default '0',
    lat double not null,
    lng double not null,
	foreign key (hostId) references user (userId) on delete set null,
    foreign key (agentId) references user (userId) on delete set null
) engine=InnoDB default charset=utf8;
drop table room;


commit;

CREATE TABLE options (
	optionId varchar(20) not null,
    optionName varchar(20) not null	
)ENGINE=InnoDB DEFAULT CHARSET = utf8;
drop table options;

insert INTO options VALUES ('op1', '에어컨');
insert INTO options VALUES ('op2', '세탁기');
insert INTO options VALUES ('op3', '침대');
insert INTO options VALUES ('op4', '책상');
insert INTO options VALUES ('op5', '옷장');
insert INTO options VALUES ('op6', 'TV');
insert INTO options VALUES ('op7', '신발장');
insert INTO options VALUES ('op8', '냉장고');
insert INTO options VALUES ('op9', '가스레인지');
insert INTO options VALUES ('op10', '인덕션');
insert INTO options VALUES ('op11', '전자레인지');
insert INTO options VALUES ('op12', '전자도어락');
insert INTO options VALUES ('op13', '비데');

 
CREATE TABLE room_option(
	roomId int, 
	optionId varchar(20),
    PRIMARY KEY(roomId, optionId)
)ENGINE=InnoDB DEFAULT CHARSET = utf8;

CREATE TABLE room_pic(
	roomId int,
    picId int, 
    picName varchar(30),
    createDate timestamp,
    PRIMARY KEY(roomId, picId)
)ENGINE=InnoDB DEFAULT CHARSET = utf8;


CREATE TABLE floor (
	floorNum int not null,
    floorName varchar(10) not null
)ENGINE=InnoDB DEFAULT CHARSET = utf8;
drop table options;

insert INTO floor VALUES (1, '1층');
insert INTO floor VALUES (2, '2층');
insert INTO floor VALUES (3, '3층');
insert INTO floor VALUES (4, '4층');
insert INTO floor VALUES (5, '5층');
insert INTO floor VALUES (6, '6층');
insert INTO floor VALUES (7, '7층');


CREATE TABLE post_deal (
	postId int auto_increment primary key,
    roomId int default '0',
    agentId int default '0',
    title varchar(40) not null,
    hostId int default '0',
    confirmYN varchar(2) not null,
    createDate timestamp,
    foreign key (roomId) references room (roomId) on delete set null,
	foreign key (hostId) references user (userId) on delete set null,
    foreign key (agentId) references user (userId) on delete set null
) engine=InnoDB default charset=utf8;


CREATE TABLE post_auth (
	postId int auto_increment primary key,
    title varchar(40) not null,
    agentId int default '0',
    confirmYN varchar(2) not null,
    createDate timestamp,
    foreign key (agentId) references user (userId) on delete set null    
) engine=InnoDB default charset=utf8;


CREATE TABLE like_room (
	likeId int auto_increment primary key,
	userId int default '0',
    roomId int default '0',
    createDate timestamp,
    foreign key (userId) references user (userId) on delete set null,
	foreign key (roomId) references room (roomId) on delete set null  
) engine=InnoDB default charset=utf8;
drop table like_room;




