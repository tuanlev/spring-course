package com.tuan.validationhi.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class RegisterRequest {

    @NotBlank(message = "Username required")
    @Size(min = 3, max = 20, message = "Length 3–20")
    private String username;

    @Email(message = "Invalid email")
    private String email;

    @Pattern(regexp = "^[0-9]+$", message = "Only digits")
    private String phone;

    @Min(value = 18, message = "Age ≥ 18")
    @Max(value = 60, message = "Age ≤ 60")
    private int age;

    @DecimalMin(value = "0.01", inclusive = true)
    @DecimalMax(value = "10000.00", inclusive = false)
    private double salary;

    @Past(message = "Birthday must be in the past")
    private LocalDate birthday;
}
