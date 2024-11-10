package com.jamme.dev.filter_querying.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@ToString
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Person Identity Number is required")
    private String personIdentityNumber;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotNull(message = "isAlive status is required")
    private boolean isAlive;

    private boolean isAml;

    private boolean isFraud;

    private String kycStatus;

    public Customer(String personIdentityNumber,
                    String firstName,
                    String lastName,
                    boolean isAlive,
                    boolean isAml,
                    boolean isFraud,
                    String kycStatus) {
        this.personIdentityNumber = personIdentityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAlive = isAlive;
        this.isAml = isAml;
        this.isFraud = isFraud;
        this.kycStatus = kycStatus;
    }
}
