package pl.wytworniakodu.design.patterns.mediator;

interface Chat {

    void register(User user);
    void unregister(User user);
    void send(String msg, User user);
}
