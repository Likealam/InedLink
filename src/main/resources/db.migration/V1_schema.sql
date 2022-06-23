BEGIN;


CREATE TABLE IF NOT EXISTS public.credentials
(
    username character varying(20) NOT NULL,
    password uuid NOT NULL,
    id integer,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS public."user"
(
    portfolio text,
    id integer,
    name character varying(20),
    surname character varying(20),
    PRIMARY KEY (id)
    );

ALTER TABLE IF EXISTS public.credentials
    ADD FOREIGN KEY (id)
    REFERENCES public."user" (id) MATCH SIMPLE
    ON UPDATE NO ACTION
       ON DELETE NO ACTION
    NOT VALID;

END;