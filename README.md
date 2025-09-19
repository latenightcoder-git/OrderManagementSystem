# Order Management System (Java 25)

## 📌 Project Overview
This is a **menu-driven console-based application** built in **Java 25** that performs:
- **CRUD operations** (Create, Read, Update, Delete)
- **Search by Item Name**
- **Sorting by Name / Price**
  - Using **Comparators**
  - Using **Loop-based sorting** (manual bubble sort)

The project uses:
- `HashSet` for item storage ✅
- `Interface` (`OrderOperations`) for contract ✅
- **Custom Exceptions** (`ItemNotFoundException`, `DuplicateItemException`) ✅
- **IO helper class** (`IO.println`) instead of `System.out.println` ✅
- Fully compliant with project rules:
  1. Java 25 only  
  2. No `System.out.println` (only `IO.println`)  
  3. No `Collection` imports for loop sorting (only HashSet allowed)  
  4. Must be run in IntelliJ IDEA  

---

## 📂 Project Structure
```plaintext
src/
│
├── IO.java
├── Item.java
├── OrderOperations.java
├── Order.java
├── ItemNotFoundException.java
├── DuplicateItemException.java
├── SortByName.java
├── SortByPrice.java
├── SortUtils.java
└── MainMenuApp.java
```

---

## ▶️ Running the Project
1. Open **IntelliJ IDEA**.
2. Import this project and set **JDK to Java 25**.
3. Right-click `MainMenuApp.java` → **Run 'MainMenuApp.main()'**.
4. Use the console menu to add, view, update, delete, search, and sort items.

---

## 🖥️ Sample Console Menu
```plaintext
==== Order Management Menu ====
1. Add Item
2. View All Items
3. Update Item
4. Delete Item
5. Search Item by Name
6. Sort Items by Name by Comparator
7. Sort Items by Price by Comparator
8. Sort Items by Name by Loop
9. Sort Items by Price by Loop
10. Exit
```

## 🛠️ Technologies Used
- Java 25
- IntelliJ IDEA

---
