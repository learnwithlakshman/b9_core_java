drop table if exists team;
create table team (team_id bigint not null auto_increment,
city varchar(255),
 coach varchar(255), 
 home varchar(255), 
 label varchar(255), 
 name varchar(255), 
 primary key (team_id));
 
 drop table if exists player;
 
 create table player (player_id bigint not null auto_increment, 
 name varchar(255),
 price double precision not null, 
 role varchar(255), team_id bigint, 
 primary key (player_id),constraint fk_team_id foreign key(team_id) references team(team_id));