# HW12_Maktab133
purpose of this repository is to save HW codes for maktabsharif



## 📁 Project 1: Vehicle Management System

A JPA-based application for managing a fleet of vehicles (Cars and Trucks) for a transportation company.

### 🏗️ Entity Structure
- **Abstract Entity:** `Vehicle`
  - **Fields:** `id`, `brand`, `model`, `year`, `status` (Enum: `ACTIVE, INACTIVE, MAINTENANCE`)
  - **Embeddable Class:** `Registration` (with `plateNumber`, `registrationDate`, `state`)
- **Concrete Entities:**
  - `Car` (extends `Vehicle`) - Adds `seatingCapacity`, `fuelType`
  - `Truck` (extends `Vehicle`) - Adds `loadCapacity`, `numberOfAxles`

### ⚙️ Features & Operations
- **Full CRUD Operations:** Create, Read, Update, and Delete vehicles.
- **Advanced Queries:** Find by ID, brand, and custom filters using Java Streams.
- **Entity Lifecycle Demo:** Demonstrates detaching and merging entities with the persistence context.

### 🔍 Stream API Examples (Implemented)
- Find all cars with seating capacity > 4.
- List all trucks with load capacity > 10 tons.
- Calculate the average manufacturing year of all vehicles.
- Group vehicles by brand and count them.

---

## 📁 Project 2: Online Education Content Management System

A JPA-based application for managing educational content (Courses and Tutorials) on an e-learning platform.

### 🏗️ Entity Structure
- **Abstract Entity:** `Content`
  - **Fields:** `id`, `title`, `author`, `duration`, `status` (Enum: `DRAFT, PUBLISHED, ARCHIVED`)
  - **Embeddable Class:** `Category` (with `name`, `description`)
- **Concrete Entities:**
  - `Course` (extends `Content`) - Adds `level`, `price`
  - `Tutorial` (extends `Content`) - Adds `topic`, `isFree`

### ⚙️ Features & Operations
- **Full CRUD Operations:** Create, Read, Update, and Delete content items.
- **Advanced Queries:** Find by ID, title, and custom filters using Java Streams.
- **Entity Lifecycle Demo:** Demonstrates detaching and merging entities with the persistence context.

### 🔍 Stream API Examples (Implemented)
- Find all free tutorials and print their titles.
- List all paid courses with a price > 100 USD.
- Calculate the total duration of all content.
- Group content by author and count their items.

---

## 🛠️ Technology Stack

- **Java**
- **JPA (Java Persistence API)**
- **Hibernate** (JPA Provider)
- **Maven** (Dependency Management)
- **MySQL** / **H2 Database** (Database)
- **JUnit** (Optional, for testing)
