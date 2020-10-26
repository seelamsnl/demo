use test_db;
flush table userdata;
create table userdata(
    name varchar(255),
    company_name varchar(255),
    city varchar(255)
);
INSERT INTO test_db.userdata(name,company_name,city) VALUES('Suneel', 'Sinch', 'Malmo');
INSERT INTO test_db.userdata(name,company_name,city) VALUES('Joshika', 'Festina', 'Malmo');