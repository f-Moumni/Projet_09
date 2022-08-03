package com.mediscreen.patient.dto;

import javax.validation.constraints.NotBlank;

public class PatientDto {

    private long   id;
    @NotBlank(message = "required")
    /*
     * patient's family name
     */
    private String family;
    @NotBlank(message = "required")
    /*
     * patient's first name
     */
    private String given;
    @NotBlank(message = "required")
    /*
     * patient's birthdate
     */
    private String dob;
    @NotBlank(message = "required")
    private String sex;
    private String address;
    private String phone;

    public PatientDto() {

    }

    public PatientDto(long id, String family, String given, String dob, String sex, String address, String phone) {

        this.id      = id;
        this.family  = family;
        this.given   = given;
        this.dob     = dob;
        this.sex     = sex;
        this.address = address;
        this.phone   = phone;
    }


    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getFamily() {

        return family;
    }

    public void setFamily(String family) {

        this.family = family;
    }

    public String getGiven() {

        return given;
    }

    public void setGiven(String given) {

        this.given = given;
    }

    public String getDob() {

        return dob;
    }

    public void setDob(String dob) {

        this.dob = dob;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }
}
