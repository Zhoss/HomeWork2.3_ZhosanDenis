package transport;

import java.time.LocalDate;

public class Car {
    public class Key {
        private String engineStart;
        private String entry;

        public Key(String engineStart, String entry) {
            if (engineStart != null && !engineStart.isBlank()) {
                this.engineStart = engineStart;
            } else {
                this.engineStart = "Remote engine start";
            }

            if (entry != null && !entry.isBlank()) {
                this.entry = entry;
            } else {
                this.entry = "Keyless entry";
            }
        }

        public String getEngineStart() {
            return engineStart;
        }

        public String getEntry() {
            return entry;
        }
    }

    public class Insurance {
        private int startPeriodYear;
        private int validityPeriodYear;
        private int cost;
        private int number;

        public Insurance(int startPeriodYear, int validityPeriodYear, int cost, int number) {
            if (startPeriodYear >= 2020 && startPeriodYear <= LocalDate.now().getYear()) {
                this.startPeriodYear = startPeriodYear;
            } else {
                System.out.println("Год начала действия страхового полиса указан неверно");
            }

            if (validityPeriodYear > 0 && validityPeriodYear <= 3) {
                this.validityPeriodYear = validityPeriodYear;
            } else {
                System.out.println("Срок действия страхового полиса указан некорректно");
            }

            if (cost > 0) {
                this.cost = cost;
            } else {
                System.out.println("Стоимость страхового полиса указана некорректно");
            }

            if (number > 0) {
                this.number = number;
            } else {
                System.out.println("Номер страхового полиса указан некорректно");
            }
        }

        public int getStartPeriodYear() {
            return startPeriodYear;
        }

        public int getValidityPeriodYear() {
            return validityPeriodYear;
        }

        public int getCost() {
            return cost;
        }

        public int getNumber() {
            return number;
        }

        public void checkInsuranceValidity() {
            if ((LocalDate.now().getYear() - getInsurance().getValidityPeriodYear()) > getInsurance().getStartPeriodYear()) {
                System.out.println("Страховой полис просрочен. Требуется оформление нового страхового полиса!\n");
            }
        }
        public void checkInsuranceNumber() {
            if (getInsurance().getNumber() != 9) {
                System.out.println("Номер страхового полиса указан некорректно");
            }
        }
    }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gearBox;
    private final String bodyType;
    private String registrationNumber;
    private final int seatQuantity;
    private String tireType;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String gearBox, String bodyType, String registrationNumber, int seatQuantity, String tireType) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        setEngineVolume(engineVolume);

        setColor(color);

        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        if (productionCountry != null && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }

        setGearBox(gearBox);

        if (bodyType != null && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }

        setRegistrationNumber(registrationNumber);

        if (seatQuantity > 0) {
            this.seatQuantity = seatQuantity;
        } else {
            this.seatQuantity = 5;
        }

        setTireType(tireType);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public String getTireType() {
        return tireType;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public void setGearBox(String gearBox) {
        if (gearBox.equals("АКПП")) {
            this.gearBox = gearBox;
        } else if (gearBox.equals("МКПП")) {
            this.gearBox = gearBox;
        } else if (gearBox.equals("вариатор")) {
            this.gearBox = gearBox;
        } else {
            System.out.println("Выберите тип коробки передач: АКПП, МКПП или вариатор");
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isBlank() && registrationNumber.length() == 9) {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setTireType(String tireType) {
        if (tireType != null && !tireType.isBlank()) {
            this.tireType = tireType;
        } else {
            this.tireType = "зимняя";
        }
    }

    public void setKey(Key key) {
        if (this.key == null) {
            this.key = key;
        }
    }

    public void setInsurance(Insurance insurance) {
        if (this.insurance == null) {
            this.insurance = insurance;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand +
                ", модель - " + model +
                ", объем двигатель - " + engineVolume + " л" +
                ", цвет кузова - " + color +
                ", год производства - " + productionYear +
                ", страна сборки - " + productionCountry +
                ", тип коробки передач - " + gearBox +
                ", тип кузова - " + bodyType +
                ", регистрационный номер - " + registrationNumber +
                ", количество посадочных мест - " + seatQuantity +
                ", тип резины - " + tireType;
    }
    public void checkRegistrationNumber() {
        String str = getRegistrationNumber();
        if (str == null || str.isBlank() || str.length() != 9) {
            System.out.println("Регистрационный номер не соответствует формату\n");
        }
        if (str != null && str.matches("^[а-яА-Я]\\d{3}[а-яА-Я]{2}\\d{3}")) {
            System.out.println("Регистрационный номер указан верно\n");
        } else {
            System.out.println("Регистрационный номер указан неверно\n");
        }
    }
    public void changeTireType() {
        if (LocalDate.now().getMonthValue() <= 4 && LocalDate.now().getMonthValue() >= 10 && getTireType().equals("летняя")) {
            System.out.println("Необходимо поменять шины с летней резиной на шины с зимней");
            setTireType("зимняя");
        } else if (LocalDate.now().getMonthValue() > 4 && LocalDate.now().getMonthValue() < 10 && getTireType().equals("зимняя")) {
            System.out.println("Необходимо поменять шины с зимней резиной на шины с летней");
            setTireType("летняя");
        } else {
            System.out.println("Все в порядке, замена шин не требуется");
        }
    }
}

