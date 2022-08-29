public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!!!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать!");
        }
        System.out.println("");
        System.out.println("Задание 1.2");
        int age1 = 23;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18 && age1 < 24){
            System.out.println("Человек закончил школу и может поступать в университет");
        }
        if (age1 > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("");
        System.out.println("Задание 1.3");
        int numberTicket = 62;
        int totalCapacity = 102;
        int seatCapacity = 60;
        int stayCapacity = totalCapacity - seatCapacity;
        if (numberTicket < 60){
            System.out.println("В вагоне есть сидячее место");
        }
        if (numberTicket > 60 && numberTicket < 102){
            System.out.println("В вагоне остались только стоячие места");
        }
        if (numberTicket > 102){
            System.out.println("Вагон полностью забит");
        }
        System.out.println("");
        System.out.println("Задание 2.1");
        int age2 = 16;
        if (age2 >= 18) {
            System.out.println("Поздравляю с совершеннолетием!!!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать!");
        }

        System.out.println("");
        System.out.println("Задание 2.2");
        int age11 = 25;
        if (age11 >= 7 && age11 < 18) {
            System.out.println("Ребенок ходит в школу");}
        if (age11 >= 18 && age11 < 24){
            System.out.println("Человек закончил школу и может поступать в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("");
        System.out.println("Задание 2.3");
        int numberTicket1 = 111;
        int totalCapacity1 = 102;
        int seatCapacity1 = 60;
        int stayCapacity1 = totalCapacity1 - seatCapacity1;
        if (numberTicket1 < 60){
            System.out.println("В вагоне есть сидячее место");
        }
        if (numberTicket1 > 60 && numberTicket1 < 102){
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("");
        System.out.println("Задание 3.1");
        int age01 = 13;
        boolean goToKidsGarden = age01 >= 2 && age01 < 7;
        boolean goToSchool = age01 >= 7 && age01 <=18;
        boolean goToUnivercity = age01 > 18 && age01 < 24;
        boolean goToWork = age01 > 24;
        if (goToKidsGarden) {
            System.out.println("Если возраст человека равен " + age01 + ", то ему нужно ходить в детский сад");
        }
        if (goToSchool) {
            System.out.println("Если возраст человека равен " + age01 + ", то ему нужно ходить в школу");
        }
        if (goToUnivercity) {
            System.out.println("Если возраст человека равен " + age01 + ", то ему нужно ходить в университет");
        }
        if (goToWork) {
            System.out.println("Если возраст человека равен " + age01 + ", то ему нужно ходить на работу");
        }
        System.out.println("");
        System.out.println("Задание 3.2");
        int ageChild = 13;
        boolean canntUse = ageChild < 5;
        boolean canWithAdult = ageChild > 5 && ageChild <14;
        boolean canAloan = ageChild >= 14;
        if (canntUse) {
            System.out.println("Ты пока не может кататься на атракционах");
        }
        if (canWithAdult) {
            System.out.println("Ты можешь кататься только в сопровождении взрослого!!!");
        } else {
            System.out.println("Ты можешь кататься на атракционах");
        }

        System.out.println("");
        System.out.println("Задание 3.3");
        int one = 100;
        int two = 99;
        int three = 11;
        boolean theBiggest1 = one > two && one > three;
        boolean theBiggest2 = two > one && two > three;
        if (theBiggest1) {
            System.out.println("Самое большое число " + one);
        }
        if (theBiggest2) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + three);
        }





    }
}