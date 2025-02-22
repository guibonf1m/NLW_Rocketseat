# 🚀 NLW Connect - Java | Rocketseat  

Projeto desenvolvido no **NLW Connect - Java** da Rocketseat, focado na construção de uma aplicação **back-end** com **Java**, **Spring Boot**, **Maven**, **API Rest**, **Docker**, **MySQL** e testes no **Postman**.  

## 🔧 Tecnologias  

- **Java 17**  
- **Spring Boot**  
- **Maven**  
- **API Rest**  
- **Docker**  
- **MySQL (JPA e JDBC)**  
- **Postman**  

## 🚀 Como Rodar  

1️⃣ **Clone o repositório:**  
```bash
git clone https://github.com/seu-usuario/nlw-connect-java.git
cd nlw-connect-java
```

2️⃣ **Suba o banco de dados com Docker:**  
```bash
docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=nlw_connect -p 3306:3306 -d mysql:latest
```

3️⃣ **Inicie a aplicação:**  
```bash
./mvnw spring-boot:run
```

4️⃣ **Testes no Postman:**  
- A API estará disponível em **http://localhost:8080**  
- Use o **Postman** para testar os endpoints  

---

📌 *Projeto desenvolvido durante o NLW Connect da Rocketseat.* 🚀  
