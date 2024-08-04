CREATE TABLE examples (
    id bigint GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    title varchar(255) NOT NULL UNIQUE,
    description varchar(1024) NOT NULL
);