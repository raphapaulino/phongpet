INSERT INTO company (company_name, trading_name) VALUES ("Associação de Protetores de Animais Clube dos Focinhos ONG", "Clube dos Focinhos")

INSERT INTO user (name, email, email_verified_at, created_at, updated_at) VALUES ('Jane', 'jane@gmail.com', utc_timestamp, utc_timestamp, utc_timestamp);

INSERT INTO animal (company_id, name, name_slug, breed, user_id, created_at, updated_at) VALUES (1, "Nicole", "nicole", "Cat", 1, utc_timestamp, utc_timestamp);
INSERT INTO animal (company_id, name, name_slug, breed, user_id, created_at, updated_at) VALUES (1, "Mil House", "mil-house", "Cat", 1, utc_timestamp, utc_timestamp);
INSERT INTO animal (company_id, name, name_slug, breed, user_id, created_at, updated_at) VALUES (1, "Lucca", "lucca", "Dog", 1, utc_timestamp, utc_timestamp);