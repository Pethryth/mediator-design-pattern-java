package pl.wytworniakodu.design.patterns.mediator;

class DefaultUser extends User {

    DefaultUser(final Chat chat, final String name) {
        super(chat, name);
    }

    public void send(final String msg) {
        chat.send(msg, this);
    }

    public void receive(final String msg) {
        System.out.println(msg + ", received by: " + name);
    }
}
