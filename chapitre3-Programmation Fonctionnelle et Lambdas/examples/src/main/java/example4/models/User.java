package example4.models;

import java.util.Objects;

public class User {
    private String name;       // Nom de l'utilisateur
    private String firstname;  // Prénom de l'utilisateur
    private Integer id;           // Identifiant de l'utilisateur
    private int age;          // Âge de l'utilisateur

    // Constructeur
    public User(String name, String firstname, Integer id, int age) {
        this.name = name;
        this.firstname = firstname;
        this.id = id;
        this.age = age;
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Setter pour le nom
    public void setName(String name) {
        this.name = name;
    }

    // Getter pour le prénom
    public String getFirstname() {
        return firstname;
    }

    // Setter pour le prénom
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Getter pour l'identifiant
    public Integer getId() {
        return id;
    }

    // Setter pour l'identifiant
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Setter pour l'âge
    public void setAge(int age) {
        this.age = age;
    }

    // Méthode toString pour afficher les informations de l'utilisateur
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User user = (User) obj;
        return age == user.age &&
               Objects.equals(name, user.name) &&
               Objects.equals(firstname, user.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstname, age);
    }
}
