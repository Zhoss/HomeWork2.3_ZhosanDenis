package transport;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия", "МКПП", "седан", "в545нм233", 5, "летняя");
        Car.Insurance ladaInsurance = lada.new Insurance(2020, 1, 10_000, 253478912);
        lada.setInsurance(ladaInsurance);
        System.out.println(lada + "\n");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКПП", "хетчбэк", "у943ос989", 8, "зимняя");
        Car.Insurance audiInsurance = audi.new Insurance(2022, 2, 25_000, 654651689);
        audi.setInsurance(audiInsurance);
        System.out.println(audi + "\n");

        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "АКПП", "кроссовер", "р777рр777", 8, "летняя");
        Car.Insurance bmwInsurance = bmw.new Insurance(2021, 1, 21_000, 443849847);
        bmw.setInsurance(bmwInsurance);
        System.out.println(bmw + "\n");

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея", "вариатор", "седан", "о808рк442", 5, "летняя");
        Car.Insurance kiaInsurance = kia.new Insurance(2021, 2, 18_500, 213291873);
        kia.setInsurance(kiaInsurance);
        System.out.println(kia + "\n");

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "МКПП", "хетчбэк", "а723рр946", 5, "зимняя");
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(2019, 2, 23_000, 12345678);
        hyundai.setInsurance(hyundaiInsurance);
        System.out.println(hyundai + "\n");

        lada.checkRegistrationNumber();
        lada.getInsurance().checkInsuranceValidity();
        hyundai.getInsurance().checkInsuranceNumber();
    }
}
