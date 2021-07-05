CREATE TABLE apontamentos (
    id_apontamento bigint not null auto_increment,
    alocacao_id_consultor bigint not null,
    alocacao_id_projeto bigint not null,
    alocacao_skill varchar(255)
     not null,
    alocacao_horas_total int not null,
    horas_trabalhadas int,
    descricao varchar(255) not null,
    situacao_apontamento varchar(9) not null,
    primary key (id_apontamento),
    FOREIGN KEY (alocacao_id_consultor) REFERENCES alocacao(id_consultor),
    FOREIGN KEY (alocacao_id_projeto) REFERENCES alocacao(id_consultor)
);

INSERT INTO apontamentos values (
    null,
    1,
    1,
    "Desenvolvimento WEB",
    50,
    8,
    "adição de funcionalidades CRUD ao sistema - 4 horas, adaptação de banco de dados para as funcionalidades",
    "ESPERA");
