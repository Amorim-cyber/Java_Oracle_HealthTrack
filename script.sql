-----------------------------------
-- CRIAÇÃO DAS TABELAS ------------
-----------------------------------

CREATE TABLE t_alimento (
    id_alimento           NUMBER(6) NOT NULL,
    nm_alimento           VARCHAR2(60) NOT NULL,
    nr_calorias_alimento  NUMBER(6, 2) NOT NULL,
    hr_consumo_alimento   DATE NOT NULL,
    t_usuario_id_usuario  NUMBER(6) NOT NULL
);

CREATE TABLE t_atividade (
    id_atividade              NUMBER(6) NOT NULL,
    t_usuario_id_usuario      NUMBER(6) NOT NULL,
    t_exercicio_id_exercicio  NUMBER(6) NOT NULL,
    dt_atividade              DATE NOT NULL
);

CREATE TABLE t_exercicio (
    id_exercicio            NUMBER(6) NOT NULL,
    nm_exercicio            VARCHAR2(80) NOT NULL,
    nr_sets_exercicio       NUMBER(2) NOT NULL,
    nr_repeticao_exercicio  NUMBER(3) NOT NULL
);

CREATE TABLE t_hist_peso (
    id_hist_peso          NUMBER(6) NOT NULL,
    nr_hist_peso          NUMBER(5, 2) NOT NULL,
    dt_registro_peso      DATE NOT NULL,
    t_usuario_id_usuario  NUMBER(6) NOT NULL
);

CREATE TABLE t_hist_pressao (
    id_hist_pressao       NUMBER(6) NOT NULL,
    nr_valor_pressao      NUMBER(5, 2) NOT NULL,
    dt_registro_pressao   DATE NOT NULL,
    t_usuario_id_usuario  NUMBER(6) NOT NULL
);

CREATE TABLE t_usuario (
    id_usuario        NUMBER(6) NOT NULL,
    nm_usuario        VARCHAR2(60) NOT NULL,
    nr_idade_usuario  NUMBER(2) NOT NULL
);

-----------------------------------
-- CHAVES PRIMÁRIAS ---------------
-----------------------------------

ALTER TABLE t_alimento ADD CONSTRAINT t_alimento_pk PRIMARY KEY ( id_alimento );

ALTER TABLE t_atividade ADD CONSTRAINT t_atividade_pk PRIMARY KEY ( id_atividade );

ALTER TABLE t_exercicio ADD CONSTRAINT t_exercicio_pk PRIMARY KEY ( id_exercicio );

ALTER TABLE t_hist_peso ADD CONSTRAINT t_historico_peso_pk PRIMARY KEY ( id_hist_peso );

ALTER TABLE t_hist_pressao ADD CONSTRAINT t_historico_pressao_pk PRIMARY KEY ( id_hist_pressao );

ALTER TABLE t_usuario ADD CONSTRAINT t_usuario_pk PRIMARY KEY ( id_usuario );

-----------------------------------
-- CHAVES ESTRANGEIRAS ------------
-----------------------------------

ALTER TABLE t_alimento
    ADD CONSTRAINT t_alimento_t_usuario_fk FOREIGN KEY ( t_usuario_id_usuario )
        REFERENCES t_usuario ( id_usuario );

ALTER TABLE t_atividade
    ADD CONSTRAINT t_atividade_t_exercicio_fk FOREIGN KEY ( t_exercicio_id_exercicio )
        REFERENCES t_exercicio ( id_exercicio );

ALTER TABLE t_atividade
    ADD CONSTRAINT t_atividade_t_usuario_fk FOREIGN KEY ( t_usuario_id_usuario )
        REFERENCES t_usuario ( id_usuario );

ALTER TABLE t_hist_peso
    ADD CONSTRAINT t_hist_peso_t_usuario_fk FOREIGN KEY ( t_usuario_id_usuario )
        REFERENCES t_usuario ( id_usuario );

ALTER TABLE t_hist_pressao
    ADD CONSTRAINT t_hist_pressao_t_usuario_fk FOREIGN KEY ( t_usuario_id_usuario )
        REFERENCES t_usuario ( id_usuario );

-----------------------------------
-- CRIANDO SEQUENCES --------------
-----------------------------------

CREATE SEQUENCE alimento_seq
  MINVALUE 1
  MAXVALUE 999999999999999999999999999
  START WITH 1
  INCREMENT BY 1
  CACHE 20;

CREATE SEQUENCE atividade_seq
  MINVALUE 1
  MAXVALUE 999999999999999999999999999
  START WITH 1
  INCREMENT BY 1
  CACHE 20;

CREATE SEQUENCE exercicio_seq
  MINVALUE 1
  MAXVALUE 999999999999999999999999999
  START WITH 1
  INCREMENT BY 1
  CACHE 20;

CREATE SEQUENCE peso_seq
  MINVALUE 1
  MAXVALUE 999999999999999999999999999
  START WITH 1
  INCREMENT BY 1
  CACHE 20;

CREATE SEQUENCE pressao_seq
  MINVALUE 1
  MAXVALUE 999999999999999999999999999
  START WITH 1
  INCREMENT BY 1
  CACHE 20;

CREATE SEQUENCE usuario_seq
  MINVALUE 1
  MAXVALUE 999999999999999999999999999
  START WITH 1
  INCREMENT BY 1
  CACHE 20;