CREATE DATABASE fotomoda;

USE fotomoda;

CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    senha VARCHAR(255),
    role VARCHAR(50)
);

CREATE TABLE fotos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(200),
    descricao TEXT,
    url_imagem VARCHAR(500),
    categoria VARCHAR(100),
    data_upload TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE contatos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    mensagem TEXT,
    data_envio TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
