package ru.koshevoy.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "reviews")
public class Review implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", unique = true, updatable = false)
    private String username;

    @Column(name = "email", unique = true, updatable = false)
    private String email;

    @Column(name = "subject", unique = true, updatable = false)
    private String subject;

    @Column(name = "message", unique = true, updatable = false)
    private String message;

    @SuppressWarnings("UnusedDeclaration")
    public Review() {
    }

    @SuppressWarnings("UnusedDeclaration")
    public Review(String username, String email, String subject, String message) {
        this.username = username;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getClass() + ":[ " + getUsername() + ";" + getEmail() + ";" + getSubject() + ";" + getMessage() + "]";
    }

}
