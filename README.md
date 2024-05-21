# Java Program: Customer Finance Management

This Java program is designed to manage customer finance information, specifically focusing on calculating monthly repayments for a product purchased over a certain period. It utilizes inheritance and polymorphism to extend base functionalities provided by a superclass to a subclass.

## Overview

The program consists of three main components:

- **Superclass `Customer`**: Represents a generic customer with properties like name, contact number, product price, and repayment months. It includes methods for setting and getting these properties, as well as a method to calculate the monthly repayment amount.
  
- **Subclass `Finance_Period`**: Extends the `Customer` superclass to represent a specific type of customer who purchases a product on a finance period. It overrides the `calculate_repayment()` method to include additional logic for calculating interest when the repayment period exceeds 3 months but does not exceed 12 months.
  
- **Logic Class `Customer_Finance`**: Contains the `mainLogic()` method, which serves as the entry point for the program. This method interacts with the user to collect necessary information, validates the input, and then uses this data to create an instance of `Finance_Period`. Finally, it displays the calculated financial details to the user.

## Key Features

- **Inheritance and Polymorphism**: Demonstrates how a subclass can inherit properties and methods from a superclass and override them to provide specialized functionality.
- **Exception Handling**: Utilizes try-catch blocks to handle exceptions, ensuring the program can gracefully handle errors such as invalid input.
- **User Interaction**: Uses `JOptionPane` for user input and output, providing a simple graphical interface for interaction.

## Code Structure

### Superclass `Customer`

- Defines properties for customer name, contact number, product price, and repayment months.
- Includes getter and setter methods for each property.
- Implements a `calculate_repayment()` method to calculate the monthly repayment amount based on the product price and repayment months.

### Subclass `Finance_Period`

- Extends `Customer` and adds no additional properties.
- Overrides the `calculate_repayment()` method to include logic for calculating interest on the monthly repayment amount when applicable.

### Logic Class `Customer_Finance`

- Contains the `mainLogic()` method, which orchestrates the program flow.
- Interacts with the user to collect necessary information using `JOptionPane`.
- Validates the input and handles exceptions appropriately.
- Creates an instance of `Finance_Period` with the collected data and displays the calculated financial details.

## Usage

When executed, the program prompts the user to enter the customer's name, contact number, product price, and the number of repayment months. It then calculates the monthly repayment amount, taking into account any applicable interest, and displays all relevant financial details to the user.

## Author

**Tertius Denis Liebenberg**  

For any questions or feedback, please contact [tertiusliebenberg7@gmail.com].