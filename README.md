# API People

API para gerenciamento de informações de pessoas, desenvolvida em Java com Spring Boot.

## Status do Projeto

![Badge](https://img.shields.io/badge/status-em_desenvolvimento-green)

## Funcionalidades

- Adicionar novas pessoas
- Atualizar informações de pessoas
- Deletar pessoas
- Listar todas as pessoas

## Requisitos de Sistema

- Java 11+
- Maven

## Instalação

Para instalar este projeto, siga estas etapas:

1. Clone o repositório:
   ```bash
   git clone https://github.com/SWillames/api-people.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd api-people
   ```
3. Compile o projeto usando Maven:
   ```bash
   mvn clean install
   ```

## Uso

Para usar este projeto, siga estas etapas:

1. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```
2. Acesse a API via `http://localhost:8080`.

## Endpoints

### Adicionar uma nova pessoa

- **URL**: `/api/people`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  {
    "name": "Nome da Pessoa",
    "age": 30,
    "email": "email@exemplo.com"
  }
  ```
- **Resposta de Sucesso**:
  ```json
  {
    "id": 1,
    "name": "Nome da Pessoa",
    "age": 30,
    "email": "email@exemplo.com"
  }
  ```

### Atualizar informações de uma pessoa

- **URL**: `/api/people/{id}`
- **Método**: `PUT`
- **Corpo da Requisição**:
  ```json
  {
    "name": "Nome Atualizado",
    "age": 31,
    "email": "novoemail@exemplo.com"
  }
  ```
- **Resposta de Sucesso**:
  ```json
  {
    "id": 1,
    "name": "Nome Atualizado",
    "age": 31,
    "email": "novoemail@exemplo.com"
  }
  ```

### Deletar uma pessoa

- **URL**: `/api/people/{id}`
- **Método**: `DELETE`
- **Resposta de Sucesso**:
  ```json
  {
    "message": "Pessoa deletada com sucesso"
  }
  ```

### Listar todas as pessoas

- **URL**: `/api/people`
- **Método**: `GET`
- **Resposta de Sucesso**:
  ```json
  [
    {
      "id": 1,
      "name": "Nome da Pessoa",
      "age": 30,
      "email": "email@exemplo.com"
    },
    {
      "id": 2,
      "name": "Outra Pessoa",
      "age": 25,
      "email": "outra@exemplo.com"
    }
  ]
  ```

## Contribuição

Para contribuir com este projeto, siga estas etapas:

1. Bifurque (fork) este repositório.
2. Crie um branch: `git checkout -b <nome-branch>`
3. Faça suas alterações e faça commit: `git commit -m 'Mensagem de commit'`
4. Envie para o branch original: `git push origin <nome-do-branch>`
5. Crie a solicitação de pull.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## Autores

- [**Sergio Willames**](https://www.linkedin.com/in/sergiowillames/)

## Reconhecimentos

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework utilizado
- [Maven](https://maven.apache.org/) - Gerenciamento de dependências
