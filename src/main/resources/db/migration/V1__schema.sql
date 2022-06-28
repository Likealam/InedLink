BEGIN;



CREATE TABLE IF NOT EXISTS public.users
(
    id SERIAL,
    username character varying(20) NOT NULL UNIQUE,
    password character varying NOT NULL,
    portfolio text,
    name character varying(20),
    surname character varying(20),
    PRIMARY KEY (id)
    );


END;