package hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        Computer computer1 = new Computer("aaa", 2010, 13, 22000,
                new HardDrive("aaaa", TypeHardDrive.SDD, 100, Country.China),
                new Processor("aa", 6, 6, Country.India));
        computers.add(computer1);
        Computer computer2 = new Computer("bbb", 2019, 10, 20000,
                new HardDrive("bbbb", TypeHardDrive.SDD, 200, Country.USA),
                new Processor("bb", 4, 6, Country.India));
        computers.add(computer2);
        Computer computer3 = new Computer("ccc", 2016, 11, 11000,
                new HardDrive("cccc", TypeHardDrive.HDD, 100, Country.India),
                new Processor("cc", 6, 6, Country.Korea));
        computers.add(computer3);
        Computer computer4 = new Computer("ddd", 2020, 12, 52000,
                new HardDrive("dddd", TypeHardDrive.SDD, 3000, Country.USA),
                new Processor("dd", 8, 6, Country.USA));
        computers.add(computer4);
        Computer computer5 = new Computer("fff", 2010, 13, 34000,
                new HardDrive("ffff", TypeHardDrive.SDD, 100, Country.China),
                new Processor("ff", 6, 6, Country.India));
        computers.add(computer5);
        Computer computer6 = new Computer("kkk", 2019, 10, 54000,
                new HardDrive("kkkk", TypeHardDrive.SDD, 2000, Country.USA),
                new Processor("kk", 4, 6, Country.India));
        computers.add(computer6);
        Computer computer7 = new Computer("lll", 2016, 11, 24000,
                new HardDrive("llll", TypeHardDrive.HDD, 1000, Country.India),
                new Processor("ll", 6, 6, Country.Korea));
        computers.add(computer7);
        Computer computer8 = new Computer("mmm", 2020, 12, 67000,
                new HardDrive("mmmm", TypeHardDrive.SDD, 300, Country.USA),
                new Processor("mm", 8, 6, Country.USA));
        computers.add(computer8);
        Computer computer9 = new Computer("ooo", 2010, 13, 28000,
                new HardDrive("oooo", TypeHardDrive.SDD, 100, Country.China),
                new Processor("oo", 6, 6, Country.India));
        computers.add(computer9);
        Computer computer10 = new Computer("ppp", 2019, 10, 18000,
                new HardDrive("pppp", TypeHardDrive.SDD, 200, Country.USA),
                new Processor("pp", 4, 6, Country.India));
        computers.add(computer10);
        Computer computer11 = new Computer("uuu", 2016, 11, 16000,
                new HardDrive("uuuu", TypeHardDrive.HDD, 1000, Country.India),
                new Processor("i7", 6, 6, Country.Korea));
        computers.add(computer11);
        Computer computer12 = new Computer("nnn", 2020, 12, 29000,
                new HardDrive("nnnn", TypeHardDrive.SDD, 300, Country.USA),
                new Processor("nn", 8, 6, Country.USA));
        computers.add(computer12);
        Computer computer13 = new Computer("sss", 2010, 13, 10000,
                new HardDrive("ssss", TypeHardDrive.SDD, 100, Country.China),
                new Processor("ss", 6, 6, Country.India));
        computers.add(computer13);
        Computer computer14 = new Computer("www", 2019, 10, 54000,
                new HardDrive("wwww", TypeHardDrive.SDD, 200, Country.USA),
                new Processor("ww", 4, 6, Country.India));
        computers.add(computer14);
        Computer computer15 = new Computer("qqq", 2016, 11, 123000,
                new HardDrive("qqqq", TypeHardDrive.HDD, 1000, Country.India),
                new Processor("qq", 6, 6, Country.Korea));
        computers.add(computer15);
        Computer computer16 = new Computer("eee", 2020, 12, 90000,
                new HardDrive("eeee", TypeHardDrive.SDD, 3000, Country.USA),
                new Processor("ee", 8, 6, Country.USA));
        computers.add(computer16);
        Computer computer17 = new Computer("vvv", 2010, 13, 44000,
                new HardDrive("vvvv", TypeHardDrive.SDD, 1000, Country.China),
                new Processor("i7", 6, 6, Country.India));
        computers.add(computer17);
        Computer computer18 = new Computer("xxx", 2019, 10, 43000,
                new HardDrive("xxxx", TypeHardDrive.SDD, 2000, Country.USA),
                new Processor("xx", 4, 6, Country.India));
        computers.add(computer18);
        Computer computer19 = new Computer("zzz", 2016, 11, 32000,
                new HardDrive("zzzz", TypeHardDrive.HDD, 600, Country.India),
                new Processor("zz", 6, 6, Country.Korea));
        computers.add(computer19);
        Computer computer20 = new Computer("ggg", 2020, 12, 51000,
                new HardDrive("gggg", TypeHardDrive.SDD, 3000, Country.USA),
                new Processor("i7", 8, 6, Country.USA));
        computers.add(computer20);

//        1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        for (Computer computer : computers) {
//            if (computer.getYear() > 2010){
//                System.out.println(computer);
//            }
//        }

//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник Китай
//        for (Computer computer : computers) {
//            if (computer.getYear() > 2010 && computer.getHardDrive().getCountry().equals(Country.China)){
//                System.out.println(computer);
//            }
//        }
//        3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник дисків не Китай
        //////
//        for (Computer computer : computers) {
//            if (computer.getYear() > 2010 && computer.getHardDrive().getCountry().equals(Country.India)){
//                System.out.println(computer);
//            }
//        }
//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
//        for (Computer computer : computers) {
//            if (computer.getHardDrive().getVolumeHardDrive() > 500){
//                System.out.println(computer);
//            }
//        }
//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//        for (Computer computer : computers) {
//            if (computer.getHardDrive().getVolumeHardDrive() > 500 && computer.getProcessor().getTypeProcessor().equals("i7")){
//                System.out.println(computer);
//            }
//        }
//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//        та процессор і7 посортувати за ціною
        for (Computer computer : computers) {
            if (computer.getHardDrive().getVolumeHardDrive() > 500 && computer.getProcessor().getTypeProcessor().equals("i7")){
                System.out.println(computer);
            }
        }
        Collections.sort(computers, new Comparator<Computer>() {
            @Override
            public int compare(Computer computers1, Computer computers2) {
                return computers1.getPrice() - computers2.getPrice();
            }
        });
        System.out.println(computers);
    }
}
