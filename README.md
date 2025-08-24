# Base API Hexagonal

Este projeto é uma **API base** construída utilizando **Arquitetura Hexagonal (Ports and Adapters)** com **Spring Boot**, servindo como modelo para futuros projetos.  
A aplicação implementa um exemplo simples de **ToDo List**, contendo:

- CRUD de **Usuários**
- CRUD de **Tarefas**
- Autenticação e autorização via **JWT**

---

## 🚀 Tecnologias e Ferramentas

- **Java 21**
- **Spring Boot 3.5.5**
- **Maven**
- **Spring Web** – criação de APIs REST
- **Spring Data JPA** – persistência de dados
- **MySQL** – banco de dados relacional principal
- **H2 Database** – banco em memória para testes
- **Spring Security + JWT** – autenticação e controle de acesso
- **Flyway** – versionamento de banco de dados
- **Spring Boot DevTools** – hot reload para desenvolvimento

---

## 📂 Estrutura do Projeto (Hexagonal)

O projeto segue a abordagem hexagonal, separando **domínio, aplicação e infraestrutura**:  

```
src
 └── main
     ├── java
     │   └── com.rafaelaguiar.baseapihexagonal
     │       ├── application     # Casos de uso
     │       ├── domain          # Entidades e regras de negócio
     │       ├── infrastructure  # Adapters (DB, Security, etc.)
     │       └── api             # Controllers (ports de entrada)
     └── resources
         ├── application.yml     # Configurações
         └── db/migration        # Scripts Flyway
```

---

## 📌 Funcionalidades

### Usuários
- Criar usuário
- Listar usuários
- Atualizar usuário
- Deletar usuário

### Tarefas
- Criar tarefa
- Listar tarefas
- Atualizar tarefa
- Deletar tarefa

### Autenticação
- Registro de usuário
- Login com **JWT**
- Endpoints protegidos com **Spring Security**

---

## 🛠️ Como Rodar o Projeto

1. Clone o repositório:
   ```
   git clone https://github.com/seu-usuario/base-api-hexagonal.git
   ```
2. Navegue até o diretório do projeto:
   ```
    cd base-api-hexagonal
   ```
3. Configure o banco de dados MySQL no arquivo `application.yml`.
4. Execute o projeto com Maven:
   ```
   mvn spring-boot:run
   ```
5. A API estará disponível em `http://localhost:8080`.


---
## 📄 Documentação da API
A documentação da API será disponibilizada futuramente e estará disponível em:
```
http://localhost:8080/swagger-ui.html
```   
ou
```
http://localhost:8080/v3/api-docs
```
---
🔑 Endpoints (Passos Futuros e Sugestão de Implementação):

## 🗺️ Roadmap de Features Avançadas

### 🔹 Etapa 1 — Arquitetura Ricas e Fundamentos
- [ ] Aplicar **CQRS** (separar comandos de queries)
- [ ] **Eventos de Domínio (Domain Events)** para criar logs e reações assíncronas
- [ ] **Auditoria & Histórico** de alterações em usuários e tarefas

### 🔹 Etapa 2 — Segurança & Usuários
- [ ] **JWT com Refresh Token**
- [ ] **RBAC (Role-Based Access Control)** com papéis (`ADMIN`, `USER`, `MANAGER`)
- [ ] **MFA (Multi-Factor Authentication)** simples via email/OTP

### 🔹 Etapa 3 — Funcionalidades Diferenciais
- [ ] **Tarefas colaborativas** (múltiplos usuários atribuídos)
- [ ] **Priorização Inteligente** (cálculo automático de prioridade)
- [ ] **Feature Flags** para habilitar/desabilitar funcionalidades em runtime

### 🔹 Etapa 4 — Integração & Observabilidade
- [ ] **Mensageria (Event-Driven)** com RabbitMQ ou Kafka
- [ ] **Notificações Assíncronas** (emails, push notifications)
- [ ] **Monitoramento & Métricas** com Actuator + Prometheus/Grafana

### 🔹 Etapa 5 — Experiência de Dev & Escalabilidade
- [ ] **GraphQL paralelo ao REST**
- [ ] **Testes avançados** (Spring Cloud Contract + Testcontainers)
- [ ] **Infraestrutura com Docker Compose** (API + DB + Mensageria + Adminer)
- [ ] **CI/CD no GitHub Actions** (build, testes, qualidade de código e deploy)  


