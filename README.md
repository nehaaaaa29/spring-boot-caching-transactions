# Spring Boot: Advanced Caching & Transactions

This repository contains practical implementations and notes covering advanced Spring Boot backend engineering concepts, specifically focusing on performance optimization via caching and data integrity through robust transaction management.

---

## 📚 Topics Covered

### 1. Caching
* **1.1 Introduction to Caching:** Core principles, cache hit/miss, and performance trade-offs.
* **1.2 Spring Boot Default Caching:** Utilizing Spring's abstraction layer (`@Cacheable`, `@CachePut`, `@CacheEvict`) with simple concurrent map caches.
* **1.3 Redis Cache in Spring Boot:** Integrating Redis as a distributed, high-performance cache store.

### 2. Database Transactions & Concurrency
* **1.4 Database Transactions & ACID Properties:** Deep dive into Atomicity, Consistency, Isolation, and Durability in RDBMS.
* **1.5 Concurrent Transaction Management:** Understanding isolation levels (`READ_UNCOMMITTED`, `READ_COMMITTED`, `REPEATABLE_READ`, `SERIALIZABLE`) and concurrency anomalies (dirty reads, non-repeatable reads, phantom reads).
* **1.6 Transactional Annotation in Spring Boot:** Declarative transaction management using `@Transactional`, propagation behaviors, and rollback rules.
* **1.7 Optimistic & Pessimistic Locking:** Handling concurrent data modifications in Spring Data JPA using versioning (`@Version`) and database-level locks.

---

## 🛠️ Tech Stack
* **Java** (Backend Engineering)
* **Spring Boot** (Core & Data JPA)
* **Redis** (Distributed Caching)
* **RDBMS** (Relational Database Management)

---

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone [https://github.com/nehaaaaa29/spring-boot-caching-transactions.git](https://github.com/nehaaaaa29/spring-boot-caching-transactions.git)
