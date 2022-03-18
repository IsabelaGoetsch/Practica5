package com.example.demo;

public class Contacto {
    private String name;
    private String surname;
    private String mail;
    private String mensaje;

    public Contacto(String name, String surname, String mail, String mensaje) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
