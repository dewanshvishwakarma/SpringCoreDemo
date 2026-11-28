package org.example.HandleObject;

import org.springframework.stereotype.Component;

@Component
public class User {
    int roll;
    String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
