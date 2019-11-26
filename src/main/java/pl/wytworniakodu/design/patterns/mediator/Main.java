package pl.wytworniakodu.design.patterns.mediator;

public class Main {


    public static void main(final String[] args) {
        Chat chat = new DefaultChat();

        User guest = new GuestUser(chat);
        User jack = new DefaultUser(chat, "Jack");
        User tom = new DefaultUser(chat, "Tom");
        User peter = new DefaultUser(chat, "Peter");

        chat.register(guest);
        chat.register(jack);
        chat.register(tom);
        chat.register(peter);

        jack.send("Hi, everyone!");
        chat.unregister(guest);
        tom.send("Hi!");
        peter.send("Hello");
    }
}