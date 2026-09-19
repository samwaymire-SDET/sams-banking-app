# Sam's Banking App

A banking API built with Spring Boot — a portfolio project demonstrating layered test automation: unit, API, and UI tests running in CI.

## Structure

- `backend-service/` — Spring Boot REST API (Java 25, Maven)
- `frontend/` — minimal web UI (coming soon; exists as a Playwright test target)

The frontend talks to the backend only through HTTP. All business logic lives in the service layer.

## Tech Stack

- Java 25, Spring Boot 4.1.1, Maven
- On the roadmap: Spring Security (BCrypt), H2, RestAssured, Playwright, GitHub Actions

## Run it

```text
cd backend-service
mvnw.cmd spring-boot:run

API
Method	Endpoint	Description
GET	/hello	Health check
POST	/api/accounts	Create an account
GET	/api/accounts	List all accounts
Example:

text


curl -X POST localhost:8080/api/accounts -H "Content-Type: application/json" -d "{\"owner\":\"Sam\",\"balance\":1000}"
Roadmap
 Project scaffold + hello endpoint
 Accounts API (in-memory)
 Register/login with BCrypt
 Deposit / withdraw / transfer
 H2 persistence
 JUnit + Mockito unit tests
 RestAssured API suite
 Minimal UI + Playwright suite
 GitHub Actions CI


