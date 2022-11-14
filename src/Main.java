import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {

     //task1
        int age = 18;
        if (age >= 18);{
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18);{
            System.out.println("Вам еще не исполнилось 18,осталось подождать еще немного :)");
            System.out.println(" ");
        }


       //task2
        int ageGoToSchool = 7;
        if (ageGoToSchool >= 7);{
            System.out.println("Ребенок ходит в школу,если его возраст равен или больше 7 лет.");
        }

        int ageGoToUniversity = 18;
        if (ageGoToUniversity >= 18);{
            System.out.println("Человек уже окончил школу и может отправляться в университет, если его возрат равен или больше 18 лет.");
        }

        int ageGoToFirstWork = 24;
        if (ageGoToFirstWork >= 24);{
            System.out.println("Человек уже окончил университет и ему пора искать первую работу, если ему 24 и больше лет.");
            System.out.println(" ");
        }


        //task3
        int fullCarrriageTrain = 102;
        System.out.println("Всего мест в вагоне " + fullCarrriageTrain);
        if (fullCarrriageTrain < 102);{
            System.out.println("В вагоне еще есть места");

        }
        if (fullCarrriageTrain >= 102);{
            System.out.println("В вагоне нет мест");
            System.out.println(" ");

        }

        int sitPlace = 60;
        System.out.println("Сидячих мест в вагоне " + sitPlace);
        if (sitPlace < 60);{
            System.out.println("В вагоне еще есть сидячие места");
        }
        if (sitPlace >= 60);{
            System.out.println("Сидячих мест в вагоне нет");
            System.out.println(" ");

        }
        int standingPosition = fullCarrriageTrain-sitPlace;
        System.out.println("Стоячих мест в вагоне " + standingPosition);
        if (standingPosition < 42);{
            System.out.println("Стоячие места еще есть в вагоне");

        }
        if (standingPosition >= 42);{
            System.out.println("Стоячих мест в вагоне нет");

        }

    }
}













