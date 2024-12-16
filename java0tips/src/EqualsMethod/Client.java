package EqualsMethod;

import java.util.Objects;

public class Client {
    private int id;

    public Client(int identifier) {
        id = identifier;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
