# NopCommerce Selenium Java Automation Framework

## Overview
This repository contains a robust Test Automation Framework for the **NopCommerce** e-commerce platform. The framework is built using the **Page Object Model (POM)** design pattern to ensure scalability, maintainability, and reusability of code. It covers critical end-to-end user journeys including Registration, Login, and Logout.

##  Author
* **Name:** Dhathri Putty

##  Tech Stack
* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Data Generation:** Java Faker (for dynamic user registration)

## Project Structure
```text
src/main/java/Pages       # Page classes containing locators and actions
src/test/java/Tests       # Test classes for functional validation
src/main/resources        # Configuration files
screenshots/              # Execution proof and failure captures
testng.xml                # Test suite configuration