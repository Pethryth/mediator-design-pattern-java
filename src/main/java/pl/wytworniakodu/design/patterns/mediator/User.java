package pl.wytworniakodu.design.patterns.mediator;

import java.util.Objects;

abstract class User {

    Chat chat;
    String name;

    User(final Chat chat, final String name) {
        this.chat = chat;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
