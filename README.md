# Zoo (Java 21 + Maven)

A tiny OOP exercise: a **Zoo** with **Zookeepers** and **Animals**.  
Keepers have diet specializations (HERBIVORES / CARNIVORES / OMNIVORES), and the zoo decides who can feed whom.

## Features
- Clear domain model (`Zoo`, `Zookeeper`, `Animal` + concrete animals)
- Diet specialization via enum (`Consumption`)
- Simple console output of feeding assignments
- Unit tests with **JUnit 5** (Surefire)

## Tech Stack
- Java **21**
- Maven
- JUnit 5 (Surefire)

### Prerequisites
- JDK **21**
- Maven 3.8+ (any recent version is fine)

### Build
```bash
mvn clean compile

mvn test

