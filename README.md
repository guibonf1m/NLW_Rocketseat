🚀 NLW Connect - Java | Rocketseat
Este projeto foi desenvolvido durante o NLW Connect - Java da Rocketseat, onde trabalhei na construção de uma aplicação back-end utilizando Java, Spring Boot, Maven, API Rest, Docker, MySQL e Postman para testes.

🔥 Tecnologias Utilizadas
Java 17
Spring Boot
Maven
API Rest
Docker
MySQL (JPA e JDBC)
Postman (para testes da API)
📌 Funcionalidades
Modelagem de dados e implementação das principais funcionalidades
Integração com banco de dados MySQL utilizando JPA e JDBC
Utilização de records para manipulação de dados
Sistema de indicações com ranking dos usuários que mais convidaram pessoas para o evento
Testes dos endpoints utilizando Postman
🚀 Como Rodar o Projeto
🔧 Pré-requisitos
Antes de começar, você precisará ter instalado:

Java 17
Docker
Maven
MySQL
Postman
🏗️ Clonando o Repositório
bash
Copiar
Editar
git clone https://github.com/seu-usuario/nlw-connect-java.git
cd nlw-connect-java
📦 Configurando o Banco de Dados
bash
Copiar
Editar
docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=nlw_connect -p 3306:3306 -d mysql:latest
🚀 Rodando a Aplicação
bash
Copiar
Editar
./mvnw spring-boot:run
A API estará disponível em http://localhost:8080.

🛠️ Testando com o Postman
Abra o Postman
Importe a coleção de requisições (caso tenha exportado uma)
Faça requisições para os endpoints da API
📜 Licença
Este projeto foi desenvolvido para fins educacionais durante o NLW Connect da Rocketseat.
