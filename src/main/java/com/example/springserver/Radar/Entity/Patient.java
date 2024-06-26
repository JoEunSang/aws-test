package com.example.springserver.Radar.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String patientid;
    private String name;
    private String sex;
    private String age;
    private String phone;
    private String email;
    private String address;
    private String emergencycall;
    private String managerid;
    @Builder.Default
    private String imagename = "noimage";
    private String height;
    private String weight;

    private String X1;
    private String X2;
    private String Y1;
    private String Y2;
    private String Z1;
    private String Z2;
    private String Zslope;
    private String Yslope2;
}