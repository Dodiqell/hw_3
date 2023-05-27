public class Main {
    public static void main (String[] args) {
      //Задача 1
        byte a = -124;
        short b = 15672;
        int c = 1333444;
        long d = -199222555111L;
        float e = -3.22f;
        double f = 6.756;
        System.out.println("Значение переменной byte c типом а равно " + a );
        System.out.println("Значение переменной short c типом b равно " + b );
        System.out.println("Значение переменной int c типом c равно " + c );
        System.out.println("Значение переменной long c типом d равно " + d );
        System.out.println("Значение переменной float c типом e равно " + e );
        System.out.println("Значение переменной double c типом f равно " + f );
        //Задача 2
        float g = 27.12f;
        long h = 987678965549L;
        double m = 2.786;
        int x = 569;
        short z = -159;
        var q = 27897;
        byte o = 67;
        System.out.println(g);
        System.out.println(h);
        System.out.println(m);
        System.out.println(x);
        System.out.println(z);
        System.out.println(q);
        System.out.println(o);
        //Задача 3
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short paper = 480;
        int totalStudents = ludmila + ekaterina + anna;
        System.out.println("На каждого ученика рассчитано " + paper / totalStudents + " листов бумаги.");
        //Задача 4
        short bottleMin = 16 / 2;
        byte aMin = 20;
        short bMin = 24 * 60;
        short cMin = (24 * 3) * 60;
        int dMin = (24 * 30) * 60;
        System.out.println("За 20 минут машина произвела " + bottleMin * aMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleMin * bMin + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleMin * cMin + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleMin * dMin + " штук бутылок");
        //Задача 5
        byte white = 2;
        byte brown = 4;
        byte cans =  120;
        short classroom = (short) (cans / (white + brown));
        System.out.println("В школе, где " + classroom + " классов, нужно " + classroom * white + " банок белой краски и " + classroom * brown + " коричневой краски.");
        //Задача 6
        short weightBananas = 5 * 80;
        short weightMilk = 2 * 105;
        short weightIceCream = 2 * 100;
        short weightEgg = 4 * 70;
        short weighPortion = (short) (weightBananas + weightMilk + weightIceCream + weightEgg);
        System.out.println("Вес порции в граммах равен " + weighPortion + " гр");
        System.out.println("Вес порции в килограммах равен " + weighPortion / 1000f + " кг");
        //Задача 7
        double weight = 7000;
        double grDay = 0.250;
        double grDayTwo = 0.500;
        System.out.println("Потребуется " + weight / grDay + " дней чтобы похудеть к соревнованиям." );
        System.out.println("Потребуется " + weight / grDayTwo + " дней чтобы похудеть к соревнованиям." );
        //Задача 8





    }
}