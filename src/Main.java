//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Первое задание
    System.out.println("Введите возраст:");
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    if (age < 18) {
        System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
    } else {
        System.out.println("Если возраст человека равен " + age + " то  он совершеннолетний ");
    }

    // Второе задание
    System.out.println("Введите температуру на улице:");
    Scanner scanner2 = new Scanner(System.in);
    int temperature = scanner2.nextInt();
    if (temperature < 5) {
        System.out.println("На улице холодно, нужно надеть шапку");
    } else {
        System.out.println("Сегодня тепло, можно идти без шапки");
    }


    // Третье задание
    System.out.println("Введите скорость:");
    Scanner scanner3 = new Scanner(System.in);
    int speed = scanner3.nextInt();
    if (speed < 60) {
        System.out.println("Если скорость " + age + " то можно ездить спокойно");
    } else {
        System.out.println("Если скорость " + speed + " то придется заплатить штраф ");
    }

    // Четвертое задание
    System.out.println("Введите возраст:");
    Scanner scanner4 = new Scanner(System.in);
    int age2 = scanner4.nextInt();
    if (2 <= age2 && age2 <= 6) {
        System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад");
    } else if (7 <= age2 && age2 <= 17) {
        System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу");
    } else if (18 <= age2 && age2 <= 24) {
        System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университет");
    } else if (age2 > 24) {
        System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить на работу");
    }
    // Пятое задание
    System.out.println("Введите возраст:");
    Scanner scanner5 = new Scanner(System.in);
    int age3 = scanner5.nextInt();
    boolean withAdult = true;
    if (age3 < 5) {
        System.out.println("Если возраст ребенка равен " + age3 + " то он не может кататься на аттракционе");
    } else if (5 <= age3 && age3 <= 14) {
        if (withAdult == true) {
            System.out.println("Если возраст ребенка равен " + age3 + " то он может кататься только в сопровождении взрослого.");
        } else {
            System.out.println("В возрасте " + age3 + " НЕ МОЖЕТ кататься без  сопровождения взрослого.");
        }
    } else {
        System.out.println("Если возраст ребенка равен " + age3 + " то он может кататься без сопровождения взрослого.");
    }

    // Шестое задание
    System.out.println("Введите количество пассажиров:");
    Scanner scanner6 = new Scanner(System.in);
    int numberOfPassengers = scanner6.nextInt();
    if (numberOfPassengers < 60) {
        int freeSet = 60 - numberOfPassengers;
        System.out.println("В вагоне есть как минимум " + freeSet + "сидячих мест");
    } else if (60 <= numberOfPassengers && numberOfPassengers < 102) {
        int freeSpace = 102 - numberOfPassengers;
        System.out.println("В вагоне есть  " + freeSpace + " мест");
    } else {
        System.out.println("В вагоне мест нет ");
    }
    // Седьмое задание
    System.out.println("Введите первое число:");
    Scanner scanner7 = new Scanner(System.in);
    int one = scanner7.nextInt();
    System.out.println("Введите второе число:");
    Scanner scanner8 = new Scanner(System.in);
    int two = scanner8.nextInt();
    System.out.println("Введите второе число:");
    Scanner scanner9 = new Scanner(System.in);
    int three = scanner9.nextInt();
    int max;
    if (one > two && one > three) {
        max = one;
    } else if (two > three) {
        max = two;
    } else {
        max = three;
    }
    System.out.println("Самое большое число это число  " + max);
}

