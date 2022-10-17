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

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }

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

        if (gearBox != null && !gearBox.isBlank()) {
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

        if (bodyType != null && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }

        if (registrationNumber != null && !registrationNumber.isBlank() && registrationNumber.length() == 9) {
            this.registrationNumber = registrationNumber;
        }

        if (seatQuantity > 0) {
            this.seatQuantity = seatQuantity;
        } else {
            this.seatQuantity = 5;
        }

        if (tireType != null && !tireType.isBlank()) {
            this.tireType = tireType;
        } else {
            this.tireType = "зимняя";
        }
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
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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
}
