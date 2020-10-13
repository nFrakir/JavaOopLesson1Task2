package com.gmail.seliverstova.hanna;

public class Phone {
    private String number;

    public Phone(String number) {
        super();
        this.number = number;
    }

    public Phone() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void call(String number, Network network) {
        Phone outgoingPhone = network.getRegistered(number);
        if (outgoingPhone == null) {
            System.out.println("Wrong number");
        } else {
            outgoingPhone.incomingCall(this);
        }
    }

    public void incomingCall(Phone phone) {
        System.out.println("Incoming call from number " + phone.number + " to phone number " + this.number);
    }

    public void register(Network network) {
        network.registerPhone(this);
    }
}
