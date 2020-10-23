package org.launchcode.javawebdevtechjobsauthentication.models.s5.dto;

import org.launchcode.javawebdevtechjobsauthentication.models.s5.dto.LoginFormDTO;

public class RegisterFormDTO extends LoginFormDTO {

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }


}
