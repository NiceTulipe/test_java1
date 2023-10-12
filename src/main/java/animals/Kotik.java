package animals;

public class Kotik {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private static int count = 0;
    private static int methods = 5;

    private final String animal = "Kotik" + count;
    private String name;
    private String voice;
    private int satiety;
    private double weight;

    public static int getCount() {
        return count;
    }

    public Kotik(String name, String voice, int satiety, double weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public Kotik() {
        count++;
    }

    public boolean play() {
        if (satiety > 0) {
            System.out.println("Кот " + name + " играет.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " слишком голоден для игр.");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("Кот " + name + " спит.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " слишком голоден для сна.");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            System.out.println("Кот " + name + " умывается.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " слишком голоден для умывания.");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            System.out.println("Кот " + name + " гуляет.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " слишком голоден для прогулки.");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            System.out.println("Кот " + name + " охотится.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " слишком голоден для охоты.");
            return false;
        }
    }

    public void eat(int addSatiety) {
        this.satiety = satiety + addSatiety;
    }

    public void eat(int addSatiety, String food) {

    }

    public void eat() {
        eat(5, "Молоко");
    }

    public String[] liveAnotherDay() {
        String[] listOfDay = new String[24];
        for (int i = 0; i < 24; i++) {
            int randomMethods = (int) (Math.random() * methods) + 1;
            switch (randomMethods) {
                case (1):
                    if (play()) {
                        listOfDay[i] = Integer.toString(i) + " - играл";
                    } else {
                        System.out.println("просит кушать");
                        eat(8);
                        listOfDay[i] = Integer.toString(i) + " - ел";
                    }
                    break;
                case (2):
                    if (sleep()) {
                        listOfDay[i] = Integer.toString(i) + " - спал";
                    } else {
                        System.out.println("просит кушать");
                        eat(8);
                        listOfDay[i] = Integer.toString(i) + " - ел";
                    }
                    break;
                case (3):
                    if (wash()) {
                        listOfDay[i] = Integer.toString(i) + " - умывался";
                    } else {
                        System.out.println("просит кушать");
                        eat(8);
                        listOfDay[i] = Integer.toString(i) + " - ел";
                    }
                    break;
                case (4):
                    if (walk()) {
                        listOfDay[i] = Integer.toString(i) + " - гулял";
                    } else {
                        System.out.println("просит кушать");
                        eat(8);
                        listOfDay[i] = Integer.toString(i) + " - ел";
                    }
                    break;
                case (5):
                    if (hunt()) {
                        listOfDay[i] = Integer.toString(i) + " - охотился";
                    } else {
                        System.out.println("просит кушать");
                        eat(8);
                        listOfDay[i] = Integer.toString(i) + " - ел";
                    }
                    break;
            }
        }
        return listOfDay;
    }
}
