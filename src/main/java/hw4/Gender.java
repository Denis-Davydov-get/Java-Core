package hw4;

public enum Gender {
    MALE("Мальчик"),
    FEMALE("Девочка");

    private final String getRusGenderTitle;

    Gender(String rusGenderTitle){
        this.getRusGenderTitle = rusGenderTitle;
    }

    public String getRusGenderTitle() {
        return getRusGenderTitle;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "getRusGenderTitle='" + getRusGenderTitle + '\'' +
                '}';
    }
}