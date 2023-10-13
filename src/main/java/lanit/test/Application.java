package lanit.test;

import animals.Kotik;


public class Application {

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik();
        Kotik kotik2 = new Kotik("Котенок_гав", "гав", 4, 10);
        kotik1.setName("Вася");
        kotik1.setVoice("вааасииилий");
        kotik1.setSatiety(20);
        kotik1.setWeight(25);
        for (String str : kotik1.liveAnotherDay()
        ) {
            System.out.println(str);
        }
        if (kotik1.getVoice().equals(kotik2.getVoice())) {
            System.out.println("голоса одинаковые");
        } else {
            System.out.println("голоса разные");
        }
        System.out.println("количество котиков: " + Kotik.getCount());
    }
}

