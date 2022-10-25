package human;

import java.time.LocalDate;

public class Human {
    private String name;
    private int birthYear;
    private String city;
    private String job;

    public Human(String name, int age, String city, String job) {
        setName(name);

        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            throw new RuntimeException("Возраст не может быть отрицательным");
        }

        setCity(city);

        setJob(job);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 0) {
            this.birthYear = birthYear;
        } else {
            this.birthYear = 0;
        }
    }

    public void setCity(String city) {
        if (city != null && !city.isBlank()) {
            this.city = city;
        } else {
            this.city = "Информация не указана";
        }
    }

    public void setJob(String job) {
        if (job != null && !job.isBlank()) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }
}
