import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {

        //Homework4.1
     //task1
        int ageSasha = 18;
        if (ageSasha >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (ageSasha < 18) {
            System.out.println("Вам еще не исполнилось 18,осталось подождать еще немного :)");
            System.out.println(" ");
        }


       //task2
        int ageGoToSchool = 7;
        if (ageGoToSchool >= 7) {
            System.out.println("Ребенок ходит в школу,если его возраст равен или больше 7 лет.");
        }

        int ageGoToUniversity = 18;
        if (ageGoToUniversity >= 18) {
            System.out.println("Человек уже окончил школу и может отправляться в университет, если его возрат равен или больше 18 лет.");
        }

        int ageGoToFirstWork = 24;
        if (ageGoToFirstWork >= 24) {
            System.out.println("Человек уже окончил университет и ему пора искать первую работу, если ему 24 и больше лет.");
            System.out.println(" ");
        }


        //task3
        int fullCarrriageTrain = 102;
        System.out.println("Всего мест в вагоне " + fullCarrriageTrain);
        if (fullCarrriageTrain < 102) {
            System.out.println("В вагоне еще есть места");
        }
        if (fullCarrriageTrain >= 102) {
            System.out.println("В вагоне нет мест");
            System.out.println(" ");
        }

        int sitPlace = 60;
        System.out.println("Сидячих мест в вагоне " + sitPlace);
        if (sitPlace < 60) {
            System.out.println("В вагоне еще есть сидячие места");
        }
        if (sitPlace >= 60) {
            System.out.println("Сидячих мест в вагоне нет");
            System.out.println(" ");
        }
        int standingPosition = fullCarrriageTrain-sitPlace;
        System.out.println("Стоячих мест в вагоне " + standingPosition);
        if (standingPosition < 42) {
            System.out.println("Стоячие места еще есть в вагоне");
        }
        if (standingPosition >= 42) {
            System.out.println("Стоячих мест в вагоне нет");
            System.out.println(" ");
        }

         //Homework4.2
        //task1
        int agePeople = 17;
        if (agePeople >= 18){
            System.out.println("Поздравляем с совершеннолетием!");
        }
         else {
            System.out.println("Вам еще не исполнилось 18,подождите еще немного!");
            System.out.println(" ");
        }



        //task2
        int childrenGoToSchool = 5;
        if (childrenGoToSchool >= 7){
            System.out.println("Ребенок ходит в школу, если его возраст равен или больше 7 лет");
        }
        else {
            System.out.println("Ребенок не ходит в школу,так как его возраст меньше 7 лет");
            System.out.println(" ");
        }



        int manGoToUniversity = 15;
        if (manGoToUniversity >= 18){
            System.out.println("Человек уже окончил школу и может отправиться в университет,если его возраст равен или больше 18 лет");
        }
        else {
            System.out.println("Человек еще не окончил школу и не может отправиться в университет,его возраст меньше 18 лет");
        }



        int manGoToFirstWork = 20;
        if (manGoToFirstWork >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу, если ему 24 года или больше");
        }
        else {
            System.out.println("Человек не может идти искать первую работу, ему не исполнилось 24 лет");
            System.out.println(" ");
        }


        //task3

        int fullCarrriageTrain2 = 102;
        System.out.println("Всего мест в вагоне " + fullCarrriageTrain2);
        if (fullCarrriageTrain2 < 102){
            System.out.println("В вагоне еще есть места");
        }
        else {
            System.out.println("Мест в вагоне не осталось");
        }

        int sitPosition = 60;
        System.out.println("Всего мест в сидячем вагоне " + sitPosition);
        if (sitPosition < 60 ){
            System.out.println("В сидячем вагоне остались места");
        }
        else {
            System.out.println("Мест в сидячем вагоне не осталось");
        }

        int standingPosition2 = fullCarrriageTrain2 - sitPosition;
        System.out.println("Всего мест в стоячем вагоне" + standingPosition2);
        if (standingPosition2 < 42){
            System.out.println("В стоячем вагоне еще остались места");
        }
        else {
            System.out.println("В стоячем вагоне не осталось мест");
            System.out.println(" ");
        }















    }
}













