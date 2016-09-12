package kz.kaznitu.domains;


import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class User {
    private String userName ;
    private String password ;
    private boolean admin ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate ;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
