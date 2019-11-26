package pl.wytworniakodu.design.patterns.mediator;

class GuestUser extends User {

    private static int counter;

    GuestUser(final Chat chat) {
        super(chat, "Guest" + ++counter);
    }

    public void send(final String msg) {
        System.out.println(name + ": sending message not allowed for guests");
    }

    public void receive(final String msg) {
        System.out.println(msg + ", received by: " + name);
    }
}
