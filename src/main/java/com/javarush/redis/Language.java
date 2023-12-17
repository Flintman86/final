package com.javarush.redis;

import java.math.BigDecimal;
import lombok.Data;
@Data
public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;

    //Getters and Setters omitted

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }
}