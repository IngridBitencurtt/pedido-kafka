# 📦 Sistema de Pedidos com Kafka (Producer + Consumer)

Este projeto é um **exemplo prático de comunicação assíncrona** utilizando **Apache Kafka** com **Spring Boot**, seguindo os princípios da **Arquitetura Hexagonal (Ports and Adapters)**.

O objetivo é simular o envio e processamento de pedidos de forma desacoplada, utilizando Kafka como broker de mensagens.

---

## 🧠 Visão Geral

### Fluxo do sistema

1. Um pedido é criado via **API REST**
2. O pedido é enviado para um **tópico Kafka**
3. Um **Consumer Kafka** consome a mensagem
4. O pedido é persistido no **PostgreSQL**
5. Os pedidos podem ser consultados via API


---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Spring Kafka**
- **Apache Kafka**
- **PostgreSQL**
- **Docker / Docker Compose**
- **Lombok**
- **Jackson**

---

## 🧱 Arquitetura

O projeto segue **Arquitetura Hexagonal**


### Por que Hexagonal?

- Baixo acoplamento
- Facilidade para testes
- Clareza de responsabilidades
- Fácil evolução (ex: trocar Kafka, banco, REST)

---

Um pedido contém:

- `id` (UUID)
- `produto` (String)
- `valor` (BigDecimal)
- `data` (LocalDateTime)

---

## 🚀 Endpoints REST

### ➕ Criar Pedido

**POST** `/pedidos`

```json
{
  "produto": "Monitor 27",
  "valor": 1899.90
}

📌 Retorna 202 Accepted
O pedido é enviado para o Kafka e processado de forma assíncrona.

### Listar Pedidos
**GET** /pedidos
GET /pedidos

---
🐳 Subindo a Infraestrutura (Kafka + PostgreSQL)

O projeto utiliza Docker Compose.

Subir tudo
docker-compose up -d


Isso irá subir:

Kafka

Zookeeper

PostgreSQL

▶️ Executando a Aplicação
./mvnw spring-boot:run

Ou pela IDE (IntelliJ / Eclipse).


