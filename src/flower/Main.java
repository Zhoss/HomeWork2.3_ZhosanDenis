package flower;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза", "красный", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15, 5);
        Flower peony = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "розовый", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        calculateBouquetCost(rose, 5, chrysanthemum, 2, peony, 4, gypsophila, 0);
    }

    public static void calculateBouquetCost(Flower flower1, int flower1Number, Flower flower2, int flower2Number, Flower flower3, int flower3Number, Flower flower4, int flower4Number) {
        int floristPaymentPercent = 10;
        double totalCost = 0;
        if ((flower1Number + flower2Number + flower3Number + flower4Number) % 2 == 0) {
            System.out.println("Необходимо добавить цветов в букет");
        } else {
            double scale = Math.pow(10, 2);
            totalCost = Math.round((flower1.getCost() * flower1Number + flower2.getCost() * flower2Number + flower3.getCost() * flower3Number + flower4.getCost() * flower4Number) * ((100 + floristPaymentPercent) / 100.0) * scale) / scale;

            ArrayList<Integer> tmpList = new ArrayList<>();
            int[] flowerNumber = {flower1Number, flower2Number, flower3Number, flower4Number};
            int[] minLifeSpan = {flower1.getLifeSpan(), flower2.getLifeSpan(), flower3.getLifeSpan(), flower4.getLifeSpan()};
            int minLifeSpanDays = Integer.MAX_VALUE;
            for (int i = 0; i < flowerNumber.length; i++) {
                if (flowerNumber[i] > 0) {
                    tmpList.add(minLifeSpan[i]);
                }
            }
            for (int i = 0; i < tmpList.size(); i++) {
                if (tmpList.get(i) < minLifeSpanDays) {
                    minLifeSpanDays = tmpList.get(i);
                }
            }
            System.out.println("Стоимость букета составяет " + totalCost + " руб. Продолжительность жизни цветов в букете - " + minLifeSpanDays + " дней.");
        }
    }
}
