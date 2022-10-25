package human;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 35, "Минск", "бренд-менеджер");
        Human anya = new Human("Аня", 29, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артём", 27, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 21, "Казань", "");

        sayHello(maxim);
        sayHello(anya);
        sayHello(katya);
        sayHello(artem);
        sayHello(vladimir);
    }

    public static void sayHello(Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ". Я из города " + human.getCity() + ". Я родился/лась в " + human.getBirthYear() + " году. Я работаю на должности " + human.getJob() + ". Будем знакомы!");
    }
}