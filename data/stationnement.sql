--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.14
-- Dumped by pg_dump version 10.4

-- Started on 2018-10-04 03:56:25

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12355)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2109 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 182 (class 1259 OID 24629)
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
-- TOC entry 181 (class 1259 OID 24627)
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
-- TOC entry 2110 (class 0 OID 0)
-- Dependencies: 181
-- Name: stationnement_id_stationnement_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.stationnement_id_stationnement_seq OWNED BY public.stationnement.id_stationnement;


--
-- TOC entry 1982 (class 2604 OID 24632)
-- Name: stationnement id_stationnement; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stationnement ALTER COLUMN id_stationnement SET DEFAULT nextval('public.stationnement_id_stationnement_seq'::regclass);


--
-- TOC entry 2100 (class 0 OID 24629)
-- Dependencies: 182
-- Data for Name: stationnement; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.stationnement (id_stationnement, nom, nombre_place, nombre_etage, ville) FROM stdin;
\.


--
-- TOC entry 2111 (class 0 OID 0)
-- Dependencies: 181
-- Name: stationnement_id_stationnement_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.stationnement_id_stationnement_seq', 1, false);


--
-- TOC entry 1984 (class 2606 OID 24637)
-- Name: stationnement stationnement_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stationnement
    ADD CONSTRAINT stationnement_pkey PRIMARY KEY (id_stationnement);


--
-- TOC entry 2108 (class 0 OID 0)
-- Dependencies: 6
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2018-10-04 03:56:25

--
-- PostgreSQL database dump complete
--

