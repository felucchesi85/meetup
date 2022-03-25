/* Populate tables */

INSERT INTO members (name, last_name) VALUES('Fernando', 'Lucchesi');
INSERT INTO members (name, last_name) VALUES('Gabriel', 'Tevez');
INSERT INTO members (name, last_name) VALUES('Edgardo', 'Perez');
INSERT INTO members (name, last_name) VALUES('Lidia', 'Rodriguez');
INSERT INTO members (name, last_name) VALUES('Emiliano', 'Nazar');
INSERT INTO members (name, last_name) VALUES('Mariana', 'Moscheni');
INSERT INTO members (name, last_name) VALUES('Lucia', 'Gomez');
INSERT INTO members (name, last_name) VALUES('Walter', 'Knorr');
INSERT INTO members (name, last_name) VALUES('Mateo', 'Guzman');
INSERT INTO members (name, last_name) VALUES('Rodrigo', 'Maiz');
INSERT INTO members (name, last_name) VALUES('Gonzalo', 'Matheu');
INSERT INTO members (name, last_name) VALUES('Gonzalo', 'Velazques');
INSERT INTO members (name, last_name) VALUES('Agustin', 'Verde');
INSERT INTO members (name, last_name) VALUES('Jane', 'Roe');
INSERT INTO members (name, last_name) VALUES('Richard', 'Doe');
INSERT INTO members (name, last_name) VALUES('Janie', 'Doe');
INSERT INTO members (name, last_name) VALUES('Phillip', 'Webb');
INSERT INTO members (name, last_name) VALUES('Stephane', 'Nicoll');
INSERT INTO members (name, last_name) VALUES('Sam', 'Brannen');
INSERT INTO members (name, last_name) VALUES('Juergen', 'Hoeller');
INSERT INTO members (name, last_name) VALUES('Janie', 'Roe');
INSERT INTO members (name, last_name) VALUES('John', 'Smith');
INSERT INTO members (name, last_name) VALUES('Joe', 'Bloggs');
INSERT INTO members (name, last_name) VALUES('John', 'Stiles');
INSERT INTO members (name, last_name) VALUES('Richard', 'Roe');

/* Populate tabla weather */
INSERT INTO weathers (dt, temp,sunrise,sunset) VALUES(1800,1800,1800,1900);
INSERT INTO weather_temp (min, max, eve, nigth ,morn, day) VALUES(25, 28, 19, 20, 17, 10);
INSERT INTO weather_temp (min, max, eve, nigth ,morn, day) VALUES(20, 27, 19, 20, 17, 10);
INSERT INTO weather_temp (min, max, eve, nigth ,morn, day) VALUES(18, 25, 19, 20, 17, 10);
INSERT INTO weather_temp (min, max, eve, nigth ,morn, day) VALUES(18, 20, 19, 20, 17, 10);
INSERT INTO weather_temp (min, max, eve, nigth ,morn, day) VALUES(20, 21, 19, 20, 17, 10);
INSERT INTO weather_temp (min, max, eve, nigth ,morn, day) VALUES(22, 30, 19, 20, 17, 10);

/* Algunas meet_up */

INSERT INTO meet_ups (address, create_at) VALUES('Calasanz 348', NOW());
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 1);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 2);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 3);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 4);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 5);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 6);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 7);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 8);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 9);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 10);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 11);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 12);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 13);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 14);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 15);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 16);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 17);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 18);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 19);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 20);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 21);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 1, 22);

INSERT INTO meet_ups (address, create_at) VALUES('Lavalleja 3232', NOW());
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 2, 5);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 2, 6);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 2, 7);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 2, 8);

INSERT INTO meet_ups (address, create_at) VALUES('Caseros 145', NOW());
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 3, 9);

INSERT INTO meet_ups (address, create_at) VALUES('Cordoba 2500', NOW());
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 4, 10);

INSERT INTO meet_ups (address, create_at) VALUES('Colon 38', NOW());
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 5, 11);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 5, 12);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 5, 13);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 5, 14);

INSERT INTO meet_ups (address, create_at) VALUES('Republica 1520', NOW());
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 6, 15);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 6, 16);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 6, 17);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 6, 18);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 6, 19);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 6, 20);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 6, 21);
INSERT INTO member_assist (assist, meet_ups_id, members_id) VALUES(TRUE, 6, 22);