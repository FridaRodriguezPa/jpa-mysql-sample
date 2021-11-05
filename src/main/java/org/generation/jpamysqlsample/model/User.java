package org.generation.jpamysqlsample.model;

import javax.persistence.*;

//Representacion de la base de datos
@Entity(name = "Users")
public class User
{
    //Campos de la tabla en la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    //Cambiar la informacion y anotar los cambios
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "correo")
    private String email;

    public User()
    {
    }

    public User( String name, Integer id )
    {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
