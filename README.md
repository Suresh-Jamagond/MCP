# 🌐 MCP: Java-Powered Model Context Protocol Server
### *Bridging Enterprise Java with LLM Reasoning*

This repository implements a high-performance **MCP Server** using **Java 21** and **Spring AI**. It allows LLMs like Google Gemini and Claude to securely execute native Java methods to perform system analysis and code reviews in real-time.

---

## 🚀 Why MCP?
The **Model Context Protocol (MCP)** is an open standard that replaces fragmented AI integrations. Instead of writing custom "glue code" for every AI tool, this server provides a universal interface that allows any MCP-compatible AI to:
* 🛠️ **Execute Tools:** Run Java methods for complex logic.
* 📂 **Access Resources:** Read local project files securely.
* 🧠 **Contextualize:** Provide the LLM with real-time system data.

---

## 🛠️ Tech Stack
* **Java 21**: Leveraging modern syntax and performance.
* **Spring Boot 3.4+**: Providing the robust application context.
* **Spring AI (MCP Starter)**: Implementing the official Model Context Protocol.
* **Maven Wrapper (mvnw)**: Ensuring build consistency across environments.

---

## ⚙️ Features
- **STDIO Transport**: Optimized for local development and IDE integration.
- **Smart Tool Discovery**: Uses `@McpTool` annotations for automatic capability exposure.
- **Silent Stream Architecture**: Configured with `web-application-type=none` and zero-banner startup to prevent JSON-RPC protocol corruption.

---

## 🔌 Available Tools
| Tool Name | Description | Inputs |
| :--- | :--- | :--- |
| `check_status` | Returns Java version and server health. | None |
| `analyze_code` | Performs length-based complexity analysis. | `code` (String) |

---


---
## ‍💻 Developed By
- Suresh Jamagond | Java Developer | 4+ Years Experience | Specializing in AI-Driven Backend Architecture
---
## 🚀 Setup & Installation

### 1. Build the Project
Use the Maven Wrapper to generate the JAR file:
```powershell
.\mvnw clean package
