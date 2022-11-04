--
-- PostgreSQL database dump
--

-- Dumped from database version 15.0
-- Dumped by pg_dump version 15.0

-- Started on 2022-11-04 11:33:53

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;
SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16448)
-- Name: tb_person; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_person (
    id bigint NOT NULL,
    address character varying(255) NOT NULL,
    birth_date timestamp(6) without time zone,
    first_name character varying(255),
    gender character varying(255) NOT NULL,
    last_name character varying(255)
);


ALTER TABLE public.tb_person OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16447)
-- Name: tb_person_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_person_id_seq OWNER TO postgres;

--
-- TOC entry 3326 (class 0 OID 0)
-- Dependencies: 214
-- Name: tb_person_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_person_id_seq OWNED BY public.tb_person.id;


--
-- TOC entry 3173 (class 2604 OID 16451)
-- Name: tb_person id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_person ALTER COLUMN id SET DEFAULT nextval('public.tb_person_id_seq'::regclass);


--
-- TOC entry 3319 (class 0 OID 16448)
-- Dependencies: 215
-- Data for Name: tb_person; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_person (id, address, birth_date, first_name, gender, last_name) FROM stdin;
1	rua iremarrrrr	\N	lucas	M	lucena
2	rua iremarrrrr	2001-11-18 22:00:00	lucas	M	lucena
\.


--
-- TOC entry 3327 (class 0 OID 0)
-- Dependencies: 214
-- Name: tb_person_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_person_id_seq', 2, true);


--
-- TOC entry 3175 (class 2606 OID 16455)
-- Name: tb_person tb_person_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_person
    ADD CONSTRAINT tb_person_pkey PRIMARY KEY (id);


-- Completed on 2022-11-04 11:33:53

--
-- PostgreSQL database dump complete
--

