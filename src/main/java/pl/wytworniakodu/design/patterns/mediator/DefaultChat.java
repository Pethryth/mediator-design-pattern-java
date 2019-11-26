package pl.wytworniakodu.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

class DefaultChat implements Chat {

    private List<User> users = new ArrayList<>();

    @Override
    public void register(final User userToRegister) {
        users.forEach(user -> user.receive("User: " + userToRegister.name + " entered chat"));
        users.add(userToRegister);
    }

    @Override
    public void unregister(final User userToRemove) {
        users.remove(userToRemove);
        users.forEach(user -> user.receive("User: " + userToRemove.name + " left chat"));
    }

    @Override
    public void send(final String msg, final User sender) {
        users.stream().filter(user -> !user.equals(sender))
                .forEach(user -> user.receive(sender.name + ": " + msg));
    }
}
