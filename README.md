# REST API com Spring Boot e Spring Security

Este projeto é uma API RESTful desenvolvida com **Spring Boot** e **Spring Security**, implementando autenticação e autorização de forma eficiente e seguindo os princípios de **stateless**. Utiliza **arquitetura baseada em Records**, tornando o código mais limpo e fácil de manter.

---

## Funcionalidades Principais

### 🔒 Segurança
- Autenticação com **Spring Security**.
- Implementação de roles e perfis usando **enum** (e.g., `ALUNO`, `PROFESSOR`).
- Geração de tokens JWT para acesso seguro.
- Restrições baseadas em roles no acesso às rotas.

### 📜 API RESTful
- Princípios RESTful totalmente implementados.
- Stateless: Cada requisição carrega todas as informações necessárias.
- Métodos HTTP: `GET`, `POST`, `PUT`, `DELETE`.

### 🛠️ Técnicas e Ferramentas
- **Arquitetura modular**: Uso de classes e records para melhor organização.
- Banco de dados relacional com **JPA/Hibernate**.
- Configuração e execução de contêineres com **Docker**.
- Testes e validações robustas com o Spring.

---

## Como Executar o Projeto

### Pré-requisitos
- [JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven 3.9+](https://maven.apache.org/download.cgi)
- [Docker](https://www.docker.com/) e Docker Compose

### Passos para execução
1. Clone este repositório:
   ```bash
   git clone https://github.com/seuusuario/seu-projeto.git
   cd seu-projeto
   ```

2. Configure o banco de dados no arquivo `application.yml` (ou use as configurações padrão).

3. Suba o banco de dados com Docker:
   ```bash
   docker-compose up -d
   ```

4. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

5. Acesse a aplicação em: `http://localhost:8080`

---

## Rotas Disponíveis

### Autenticação
- `POST /auth/login`: Autentica o usuário e retorna o token JWT.

### Usuários
- `POST /usuarios`: Cria um novo usuário.
- `GET /usuarios`: Retorna todos os usuários (somente para ADMIN).
- `GET /usuarios/{id}`: Retorna informações de um usuário pelo ID.

### Perfis
- `GET /perfis`: Lista todos os perfis disponíveis.

---

## Estrutura do Projeto

```plaintext
src/main/java
├── domain
│   ├── usuario
│   │   ├── Usuario.java
│   │   ├── UsuarioRepository.java
│   │   ├── UsuarioService.java
│   │   └── UsuarioController.java
│   ├── perfil
│       ├── PerfilEnum.java
│       └── PerfilService.java
├── security
│   ├── SecurityConfig.java
│   ├── JwtService.java
│   └── SecurityFilter.java
└── REST
    ├── Application.java
    └── application.yml
```

### Detalhes da Arquitetura
- **Records** são usados para DTOs (Data Transfer Objects).
- Divisão em pacotes para melhor organização: `domain`, `security`, etc.
- Serviços seguem o princípio da responsabilidade única (SRP).

---

## Testando o Sistema

### Testes Automatizados
- Execute os testes com:
  ```bash
  mvn test
  ```

- Inclui testes de integração para rotas protegidas e serviços principais.

### Ferramentas de Teste
- **Postman**: Importe a coleção de rotas do Postman para testar as funcionalidades.

---

## Tecnologias Utilizadas

- **Java 17**: Linguagem principal.
- **Spring Boot 3.3**: Framework de aplicação.
- **Spring Security**: Autenticação e autorização.
- **JWT**: Token para autenticação stateless.
- **JPA/Hibernate**: Persistência de dados.
- **Docker**: Contêineres para banco de dados.
- **MySQL**: Banco de dados utilizado.
- **Maven**: Gerenciamento de dependências e build.

---

## Autor
Desenvolvido por [Seu Nome](https://github.com/seuusuario). Contribuições e feedbacks são bem-vindos!

---

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).
