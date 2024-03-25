// Clasa 1
class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void drive() {
        System.out.println("Driving the " + brand + " " + model);
    }
}

// Clasa 2
class Animal {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("The " + species + " makes a sound");
    }
}

// Clasa 3
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}

// Clasa 4
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

// Clasa 5
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// Clasa 6
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println("Salary increased to " + salary);
    }
}

// Clasa 7
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Clasa 8
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void study() {
        System.out.println(name + " is studying");
    }
}

// Clasa 9
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// Clasa 10
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}
