--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.14
-- Dumped by pg_dump version 9.5.14

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: Stationnement; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "Stationnement" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'French_Canada.1252' LC_CTYPE = 'French_Canada.1252';


ALTER DATABASE "Stationnement" OWNER TO postgres;

\connect "Stationnement"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: stationnement; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.stationnement (
    id_stationnement bigint NOT NULL,
    nom text,
    nombre_place text,
    nombre_etage text,
    ville text
);


ALTER TABLE public.stationnement OWNER TO postgres;

--
-- Name: stationnement_id_stationnement_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.stationnement_id_stationnement_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.stationnement_id_stationnement_seq OWNER TO postgres;

--
-- Name: stationnement_id_stationnement_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.stationnement_id_stationnement_seq OWNED BY public.stationnement.id_stationnement;


--
-- Name: voiture; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.voiture (
    id_voiture bigint NOT NULL,
    marque text,
    modele text,
    puissance text,
    couleur text,
    id_stationnement bigint
);


ALTER TABLE public.voiture OWNER TO postgres;

--
-- Name: voiture_id_voiture_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.voiture_id_voiture_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.voiture_id_voiture_seq OWNER TO postgres;

--
-- Name: voiture_id_voiture_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.voiture_id_voiture_seq OWNED BY public.voiture.id_voiture;


--
-- Name: id_stationnement; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stationnement ALTER COLUMN id_stationnement SET DEFAULT nextval('public.stationnement_id_stationnement_seq'::regclass);


--
-- Name: id_voiture; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.voiture ALTER COLUMN id_voiture SET DEFAULT nextval('public.voiture_id_voiture_seq'::regclass);


--
-- Data for Name: stationnement; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.stationnement VALUES (1, 'Roger Parking Test Modification', '101', '155', 'Rimouski');


--
-- Name: stationnement_id_stationnement_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.stationnement_id_stationnement_seq', 2, true);


--
-- Data for Name: voiture; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Name: voiture_id_voiture_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.voiture_id_voiture_seq', 1, true);


--
-- Name: stationnement_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stationnement
    ADD CONSTRAINT stationnement_pkey PRIMARY KEY (id_stationnement);


--
-- Name: voiture_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.voiture
    ADD CONSTRAINT voiture_pkey PRIMARY KEY (id_voiture);


--
-- Name: fki_voiture_idstationnement_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_voiture_idstationnement_fkey ON public.voiture USING btree (id_stationnement);


--
-- Name: voiture_idstationnement_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.voiture
    ADD CONSTRAINT voiture_idstationnement_fkey FOREIGN KEY (id_stationnement) REFERENCES public.stationnement(id_stationnement) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

