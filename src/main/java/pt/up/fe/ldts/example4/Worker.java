package pt.up.fe.ldts.example4;

import java.util.Objects;

public class Worker {
    private final String name;
    private final String phone;

    public Worker(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
