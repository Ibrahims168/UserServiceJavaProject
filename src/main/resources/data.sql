CREATE TABLE user_table (
    user_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(300) NOT NULL DEFAULT '',
    last_name VARCHAR(300) NOT NULL DEFAULT '',
    email VARCHAR(300) NOT NULL DEFAULT '',
    age INT NOT NULL,
    address VARCHAR(300) NOT NULL DEFAULT '',
    joining_date DATE,
    status BOOLEAN DEFAULT FALSE,
    PRIMARY KEY (user_id)
);



