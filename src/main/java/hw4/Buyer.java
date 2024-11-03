package hw4;

import lombok.Data;

@Data
public class Buyer {
    String name;
    Gender gender;


    public Buyer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

}
