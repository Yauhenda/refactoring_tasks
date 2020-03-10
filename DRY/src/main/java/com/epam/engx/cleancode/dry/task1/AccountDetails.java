package com.epam.engx.cleancode.dry.task1;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDetails {
    private Date birth;
    private int age;
    private BigDecimal balance;
    private Date startDate;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
