create database springbtMusicdb;
use springbtMusicdb;
drop database springbtMusicdb;

select * from song;
delete from song where song_id=2;
insert into song values("2","Romance","Tere Bn Giya..","3:15","2","2");

select * from album;
delete from album where album_id=1;
insert into album values ( "2","Senorita","2022-08-17","2");

select * from artist;
delete from artist where artist_id=1;
insert into artist values ("2","Gilead","1999-11-03");

select * from user;
delete from user where user_id=1;
insert into user values ("1",true,"Pranay","jadhavpranay08@gmail.com","abc123");

select * from playlist;
delete from playlist where playlist_id=1;
insert into playlist values ("1","Pranay's Playlist","1");

