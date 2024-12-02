# 🌟 Simple Bank Account System

This project is a **Simple Bank Account System** implemented in **Java** using **Object-Oriented Programming (OOP)** principles as we are currently learning in **DCIT201**. It allows users to manage bank accounts with basic features like creating accounts, depositing, withdrawing, and checking balances.

---

## ✨ Features

- 🏦 **Create Accounts**  
  Easily create new accounts with an initial balance.  
- 💵 **Deposit Money**  
  Add funds to your account.  
- 💸 **Withdraw Money**  
  Withdraw money if you have sufficient funds.  
- 📊 **Check Balance**  
  View the current balance in your account.  
- 💡 **Object-Oriented Design**  
  The system is designed using OOP principles, ensuring modularity and reusability.

---

## 🛠️ Project Structure

### 🔑 `BankAccount` Class
This is the main class representing a bank account.  

#### **Attributes**
- **`accountNumber`**: A unique identifier for the account.  
- **`accountHolderName`**: The name of the account holder.  
- **`balance`**: The current balance of the account.  

#### **Methods**
- **`deposit(double amount)`**  
  Adds funds to the account balance.  
- **`withdraw(double amount)`**  
  Deducts the specified amount if sufficient funds are available.  
- **`getBalance()`**  
  Returns the current account balance.  
- **`toString()`**  
  Displays the account details in a readable format.

---

## 🚀 How to Run the Project

### Prerequisites
1. Install **Java Development Kit (JDK)** (version 8 or later).  
2. Use a code editor or IDE like IntelliJ IDEA, Eclipse, or VS Code.

### Steps to Run
1. Clone this repository or download the source code.  
2. Open the project in your IDE or terminal.  
3. Compile the Java files:  
   ```bash
   javac Main.java
   java Main
