# url-shortener
Developed a URL Shortener application using Java and Spring Boot that converts long URLs into short, manageable links. Implemented RESTful APIs, custom hash generation logic, and in-memory storage using HashMap. Includes redirection functionality and error handling. Ideal for learning backend microservices architecture.
# 🔗 URL Shortener – Spring Boot Project

A lightweight and efficient URL Shortener application built using **Java 17** and **Spring Boot**. This service allows users to convert long URLs into short and manageable links and provides seamless redirection to the original URLs.

---

## 🚀 Features

- 🔐 Shorten long URLs using a custom hash-based algorithm
- 🔄 Redirect short URLs to their original long URLs
- 📦 In-memory storage using `HashMap` for fast lookups
- 💡 RESTful API design using Spring Web
- ⚠️ Basic exception handling for invalid or expired URLs
- 🧹 Clean code and modular architecture

---

## 🛠️ Tech Stack

| Layer        | Technology                     |
|--------------|--------------------------------|
| Language     | Java 17                        |
| Framework    | Spring Boot                    |
| Web          | Spring MVC / REST Controllers  |
| IDE          | IntelliJ IDEA                  |
| Storage      | HashMap (in-memory)            |
| Build Tool   | Maven or Gradle                |
| Testing      | JUnit (optional, add later)    |

---



---

## 📬 API Endpoints

| Method | Endpoint           | Description                       |
|--------|--------------------|-----------------------------------|
| POST   | `/shorten`         | Accepts a long URL and returns a shortened code |
| GET    | `/{shortCode}`     | Redirects to the original long URL |

---

## 📦 Sample Request / Response

### POST `/shorten`

**Request:**
```json
{
  "longUrl": "https://www.example.com/very/long/url"
}


## 📁 Project Structure

