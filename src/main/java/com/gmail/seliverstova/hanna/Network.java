package com.gmail.seliverstova.hanna;

import java.util.Arrays;

public class Network {
    private Phone[] registeredPhones;

    public Network(Phone[] registeredPhones) {
        super();
        this.registeredPhones = registeredPhones;
    }

    public Network() {
        super();
        this.registeredPhones = new Phone[0];
    }

    public Phone[] getRegisteredPhones() {
        return registeredPhones;
    }

    public void setRegisteredPhones(Phone[] registeredPhones) {
        this.registeredPhones = registeredPhones;
    }

    public void registerPhone(Phone phone) {
        this.registeredPhones = Arrays.copyOf(registeredPhones, registeredPhones.length + 1);
        this.registeredPhones[registeredPhones.length - 1] = phone;
    }

    public Phone getRegistered(String number) {
        Phone registered = new Phone();
        boolean flag = false;
        for (Phone element: registeredPhones) {
            if (element.getNumber().equalsIgnoreCase(number)) {
                flag = true;
                registered = element;
                break;
            }
        }
        return (flag) ? registered : null;
    }

    @Override
    public String toString() {
        return "Network [registeredPhones=" + Arrays.toString(registeredPhones) + "]";
    }
}
