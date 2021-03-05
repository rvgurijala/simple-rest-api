package com.test.simplerestapi.models;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id_seq")
    @SequenceGenerator(name="person_id_seq", sequenceName = "PERSON_ID_SEQ", initialValue = 2)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    @NotNull(message = "FirstName shouldn't be null")
    @NotBlank(message = "FirstName shouldn't be empty")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotNull(message = "LastName shouldn't be null")
    @NotBlank(message = "LastName shouldn't be empty")
    private String lastName;

    @Column(name = "age")
    @Min(1)
    @Max(999)
    private Integer age;

    @Column(name = "favourite_colour")
    private String favouriteColour;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFavouriteColour(String favouriteColour) {
        this.favouriteColour = favouriteColour;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
