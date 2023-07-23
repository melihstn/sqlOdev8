/*

1)
create table employee(
id integer primary key,
name varchar(50) not null,
birthday date,
email varchar(100)
);


2)

insert into employee (id, name, birthday, email) values (1, 'Teri', '1991/03/09', 'tcrother0@nsw.gov.au');
insert into employee (id, name, birthday, email) values (2, 'Gordy', '1912/01/11', 'greschke1@amazon.co.uk');
insert into employee (id, name, birthday, email) values (3, 'Marney', '1933/07/06', 'msoro2@i2i.jp');
insert into employee (id, name, birthday, email) values (4, 'Eloise', '1911/09/24', 'ebiddlestone3@ca.gov');
insert into employee (id, name, birthday, email) values (5, 'Corinna', '1942/09/14', 'chardisty4@phoca.cz');
insert into employee (id, name, birthday, email) values (6, 'Rafaelia', '1947/01/28', 'rmartland5@yahoo.com');
insert into employee (id, name, birthday, email) values (7, 'Celestine', '1996/10/08', 'cbredes6@mayoclinic.com');
insert into employee (id, name, birthday, email) values (8, 'Nathanil', '1928/12/28', 'nneave7@noaa.gov');
insert into employee (id, name, birthday, email) values (9, 'Trenna', '1964/05/04', 'twilshin8@amazon.com');
insert into employee (id, name, birthday, email) values (10, 'Linette', '1944/04/10', 'lwagnerin9@storify.com');
insert into employee (id, name, birthday, email) values (11, 'Roselia', '1960/08/01', 'rtoopea@nature.com');
insert into employee (id, name, birthday, email) values (12, 'Cale', '1991/08/24', 'crobersb@boston.com');
insert into employee (id, name, birthday, email) values (13, 'Stepha', '1905/03/07', 'sbellshamc@dyndns.org');
insert into employee (id, name, birthday, email) values (14, 'Bernardine', '1955/08/30', 'bgrgicd@cnbc.com');
insert into employee (id, name, birthday, email) values (15, 'Terence', '1903/12/22', 'tingledowe@marketwatch.com');
insert into employee (id, name, birthday, email) values (16, 'Woodman', '1941/09/22', 'wbeatyf@yellowpages.com');
insert into employee (id, name, birthday, email) values (17, 'Ethelred', '1945/05/02', 'estembridgeg@pbs.org');
insert into employee (id, name, birthday, email) values (18, 'Gabriellia', '2012/01/16', 'gjelphsh@so-net.ne.jp');
insert into employee (id, name, birthday, email) values (19, 'Augusta', '2013/02/26', 'achallinori@harvard.edu');
insert into employee (id, name, birthday, email) values (20, 'Walther', '1969/09/04', 'wplainj@blogtalkradio.com');
insert into employee (id, name, birthday, email) values (21, 'Angele', '2013/05/23', 'arisebrowk@biblegateway.com');
insert into employee (id, name, birthday, email) values (22, 'Massimo', '1954/04/13', 'mdybelll@photobucket.com');
insert into employee (id, name, birthday, email) values (23, 'Sharla', '1935/02/19', 'spoplandm@rediff.com');
insert into employee (id, name, birthday, email) values (24, 'Melli', '1922/08/25', 'mhallawaysn@google.it');
insert into employee (id, name, birthday, email) values (25, 'Norean', '1945/08/27', 'nmussottio@hud.gov');
insert into employee (id, name, birthday, email) values (26, 'Guthry', '1959/09/04', 'gluckeyp@eepurl.com');
insert into employee (id, name, birthday, email) values (27, 'Arlana', '1910/04/26', 'aromeq@vk.com');
insert into employee (id, name, birthday, email) values (28, 'Pauli', '2008/02/20', 'psmedmorer@hostgator.com');
insert into employee (id, name, birthday, email) values (29, 'Patric', '1959/06/16', 'pthatchams@mozilla.org');
insert into employee (id, name, birthday, email) values (30, 'Clive', '1913/01/07', 'cawdet@weather.com');
insert into employee (id, name, birthday, email) values (31, 'Hyacinthe', '1983/06/06', 'hbalmadieru@answers.com');
insert into employee (id, name, birthday, email) values (32, 'Ettore', '1994/12/18', 'ecaulderv@independent.co.uk');
insert into employee (id, name, birthday, email) values (33, 'Gerta', '1951/09/30', 'glachaizew@rediff.com');
insert into employee (id, name, birthday, email) values (34, 'Townie', '1918/06/29', 'tmorlandx@theatlantic.com');
insert into employee (id, name, birthday, email) values (35, 'Rodolph', '1962/09/11', 'rmaffiay@walmart.com');
insert into employee (id, name, birthday, email) values (36, 'Meggi', '2004/03/05', 'merdesz@patch.com');
insert into employee (id, name, birthday, email) values (37, 'Fran', '1951/12/26', 'frablin10@gravatar.com');
insert into employee (id, name, birthday, email) values (38, 'Carmita', '1978/01/29', 'cbennie11@state.tx.us');
insert into employee (id, name, birthday, email) values (39, 'Hermine', '2019/11/22', 'hrodda12@acquirethisname.com');
insert into employee (id, name, birthday, email) values (40, 'Basile', '2003/06/18', 'bmuir13@multiply.com');
insert into employee (id, name, birthday, email) values (41, 'Cecilius', '2006/02/27', 'cbebis14@ibm.com');
insert into employee (id, name, birthday, email) values (42, 'Marlowe', '1919/05/09', 'mwhanstall15@walmart.com');
insert into employee (id, name, birthday, email) values (43, 'Travus', '1988/04/13', 'tjessup16@facebook.com');
insert into employee (id, name, birthday, email) values (44, 'Timothea', '1925/09/14', 'tcasino17@usatoday.com');
insert into employee (id, name, birthday, email) values (45, 'Byrann', '1956/02/11', 'bwhitby18@exblog.jp');
insert into employee (id, name, birthday, email) values (46, 'Kitti', '1901/08/08', 'kludron19@fda.gov');
insert into employee (id, name, birthday, email) values (47, 'Lonee', '2000/11/12', 'lgorden1a@studiopress.com');
insert into employee (id, name, birthday, email) values (48, 'Doug', '2011/11/28', 'dbonifas1b@cloudflare.com');
insert into employee (id, name, birthday, email) values (49, 'Vern', '2018/10/29', 'vshyram1c@discuz.net');
insert into employee (id, name, birthday, email) values (50, 'Abrahan', '1912/12/04', 'abilsford1d@state.gov');


3)

update employee
 set name = 'melih'
 where id = 2;

 update employee
set birthday = '1998-02-09'
where id = 3;

update employee
set email ='melih.stn98@gmail.com'
where name = 'Teri';

update employee
set email = 'nneave7@noaa.gov'
where email = 'spoplandm@rediff.com';

update employee
set birthday = '2023-02-09'
where birthday = '2000-11-12';



4)

delete from employee
where name = 'Eloise';

delete from employee
where id = 43;

delete from employee
where birthday = '2008-02-20';

delete from employee
where email = 'abilsford1d@state.gov';

delete from employee
where id in(5,12,13);


 */