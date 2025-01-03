// Copyright (c) 2025 by [Your Name or Organization]. All rights reserved.
// This code is intended for educational and academic purposes only.

// Base Class: User
abstract class User {
    private int userId;
    private String name;
    private String email;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getName() { // Add this method
        return name;
    }

    public String getEmail() {
        return email;
    }

    public abstract void displayDetails();
}
