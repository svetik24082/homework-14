public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        Human human = new Human(" Максим ", currentYear - 36, "Москва", " бренд-менеджер");
        Human human1 = new Human(" Аня", currentYear - 29, " Москва", " методистом образовательных программ");
        Human human2 = new Human(" Катя", currentYear - 28, " Калининград", " продакт-менеджер ");
        Human human3 = new Human(" Артем", currentYear - 27, " Москва", " директором по развитию бизнеса ");
        Human human4 = new Human("Владимир", currentYear - 21, "Казань", null);


        printInfo(human);
        printInfo(human1);
        printInfo(human2);
        printInfo(human3);
        printInfo(human4);

    }

    private static void printInfo(Human human) {
        System.out.println(" Привет! Меня зовут" + human.name + ". Я из города " + human.getCityOfResident() + ". Я родился в " + human.getNumberOfYears() + " году.  Я работаю на должности " + human.post + ". Будем знакомы!");

    }


}





