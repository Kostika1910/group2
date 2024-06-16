package com.example.ims.entity;

import com.example.ims.Enum.EnuValue;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Data
@Table(schema = "Mock_project")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer candidateID;

    @Column(name = "cand_name")
    @NotNull
    @Pattern(regexp = "^[a-zA-z\s]{6,}", message = "name must atleast have 6 characters or more and did not include special character ")
    private String candidateName;

    @Column(name = "cand_email")
    @NotNull
    @Email(message = "Email is invalid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    private String candidateEmail;

    @Column(name = "cand_gender")
    @Enumerated(EnumType.STRING)
    private EnuValue.CandidateGender candidateGender;

    @Column(name = "cand_DOB")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime dateOfBirth;

    @Column(name = "cand_address")
    private String candidateAddress;




    @Column(name = "cand_phone")
    @NotNull
    @Pattern(regexp = "^[0-9]{10,11}", message = "phone number only accept numbers and need 10-11 numbers for phone number")
    private String candidatePhone;


    @Column(name = "professional_info")
    private String professionalInformation;


    @Column(name = "cand_current_position")
    @Enumerated(EnumType.STRING)
    private EnuValue.CurrentPosition currentPosition;

    @Column(name = "skill")
    private String Skills;

    @Column(name = "highest_level")
    private int highestLevel;

    @Column(name = "owner_HR")
    private String ownerHR;

    @Column(name = "cand_status")
    @Enumerated(EnumType.STRING)
    private EnuValue.CandidateStatus status;

    @Column(name = "note")
    private String note;

    @Column(name = "year_of_experience")
    private int yearOfExperience;

}

