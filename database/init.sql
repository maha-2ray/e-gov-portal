# ============================
# database/init.sql
# ============================
CREATE TABLE IF NOT EXISTS citizen (
id SERIAL PRIMARY KEY,
full_name VARCHAR(100),
email VARCHAR(100) UNIQUE,
age INT,
nationality VARCHAR(50)
);


CREATE TABLE IF NOT EXISTS government_service (
id SERIAL PRIMARY KEY,
service_name VARCHAR(100),
available BOOLEAN
);


CREATE TABLE IF NOT EXISTS service_application (
id SERIAL PRIMARY KEY,
citizen_id INT REFERENCES citizen(id),
service_id INT REFERENCES government_service(id),
status VARCHAR(50)
);