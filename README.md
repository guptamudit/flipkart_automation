# Flipkart Automation Project 

An automated testing framework designed to validate end-to-end user journeys on the Flipkart e-commerce platform. This project utilizes the **Page Object Model (POM)** design pattern to ensure high code maintainability and scalability.

---

## Key Features

* **User Authentication:** Automated login and logout flows.
* **Search Functionality:** Validating product search accuracy and filter applications.
* **Cart Management:** Adding/removing items and verifying price calculations.
* **Robust Reporting:** Generates detailed execution reports using ExtentReports.

---

## Tech Stack

| Component | Technology |
| :--- | :--- |
| **Language** | Java and Gherkin |
| **Automation Tool** | Selenium WebDriver |
| **Test Framework** | TestNG and Junit |
| **Build Tool** | Maven |
| **Design Pattern** | Page Object Model (POM) |
| **Assertions** | AssertJ / TestNG Assertions |

---

## Prerequisites

Before running the tests, ensure you have the following installed:

* **JDK 11** or higher
* **Maven**
* **IDE** (IntelliJ IDEA or Eclipse)
* **Browser Drivers** (Handled automatically via WebDriverManager)

---

## Installation & Setup

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/guptamudit/flipkart_automation.git](https://github.com/guptamudit/flipkart_automation.git)
    cd flipkart_automation
    ```

2.  **Install dependencies:**
    ```bash
    mvn clean install
    ```

3.  **Configure Environment:**
    Navigate to `src/main/resources/config.properties` to update your credentials, base URL, or browser preferences.

---

## Running Tests

**Run all tests via Maven:**
```bash
mvn test
```

**Run a specific test suite:**
```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📊 Project Structure

The project follows a standard Maven directory structure, separating application logic (Page Objects) from test execution logic.

```plaintext
flipkart-automation
├── src
│   ├── main/java/flipkart
│   │   └── BaseClass
│   │   └── ReusableFunctions
│   ├── main/resources
│   │   └── Excel      
│   └── test/resources
│   |   ├── Features
│   |   ├── Properties
│   └── test/java
│       ├── Pages
│       ├── StepDefinitions
        ├── TestRunner
├── reports/                         
├── pom.xml                          
└── README.md


## Author

**Mudit Gupta**
