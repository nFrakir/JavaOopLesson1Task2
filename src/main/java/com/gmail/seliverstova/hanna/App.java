package com.gmail.seliverstova.hanna;

public class App {
    public static void main( String[] args ) {
        Phone incomingPhone = new Phone("2128506");
        Phone outgoingPhone = new Phone("2128507");
        Network network = new Network();

        incomingPhone.register(network);
        outgoingPhone.register(network);
        outgoingPhone.call("2128506", network);
        outgoingPhone.call("2128508", network);
    }
}
