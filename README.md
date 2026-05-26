# Issue Tracking & Management System

A RESTful backend API built with Java Spring Boot to help teams report, track, and resolve software issues securely. Designed with a clean layered architecture and JWT-based authentication to ensure only authorized users can access the system.

## Why I Built This

During my Java Full Stack training, I wanted to build something that reflects real-world backend systems. Issue tracking is at the core of every software team's workflow, so I challenged myself to build a secure, production-style backend from scratch.

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 4.0 |
| Security | Spring Security + JWT |
| Database | MySQL 8.0 |
| ORM | Spring Data JPA + Hibernate |
| Build Tool | Maven |
| API Testing | Postman |

## Project Structure
src/main/java/com/issuetracker/
├── controller/
│   ├── AuthController.java      ← Register & Login
│   └── IssueController.java     ← Issue CRUD APIs
├── service/
│   └── IssueService.java        ← Business logic
├── repository/
│   ├── IssueRepository.java     ← Issue DB queries
│   └── UserRepository.java      ← User DB queries
├── model/
│   ├── Issue.java               ← Issue entity
│   └── User.java                ← User entity
└── security/
├── JwtUtil.java             ← Token generation
├── JwtFilter.java           ← Token validation
└── SecurityConfig.java      ← Security rules
## Features

- User Registration with encrypted password (BCrypt)
- JWT Login — token expires in 10 hours
- Full CRUD operations on Issues
- Protected APIs — JWT token required
- Auto timestamp and status on issue creation
- Filter issues by status and priority

## API Endpoints

### Authentication (Public)
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /auth/register | Register new user |
| POST | /auth/login | Login and get JWT token |

### Issues (Protected)
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/issues | Create new issue |
| GET | /api/issues | Get all issues |
| GET | /api/issues/{id} | Get issue by ID |
| PUT | /api/issues/{id} | Update issue |
| DELETE | /api/issues/{id} | Delete issue |
| GET | /api/issues/status/{status} | Filter by status |

## How to Run

1. Clone the repository
2. Create MySQL database: `CREATE DATABASE issuetracker;`
3. Update `application.properties` with your MySQL password
4. Run as Spring Boot App in STS
5. Test APIs in Postman — Register → Login → Copy token → Use in Authorization header

## What I Learned

- Designing RESTful APIs with proper HTTP methods
- Implementing stateless JWT authentication from scratch
- Spring Security filter chain configuration
- JPA/Hibernate entity mapping and relationships
- Clean layered architecture in Spring Boot

---
*Built by Ravuri Vinay
