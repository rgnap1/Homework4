import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {

        System.out.println("//Homework4.1");
        System.out.println(" ");
        System.out.println("//task1");
        //Homework4.1
     //task1
        int ageSasha = 18;
        if (ageSasha >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (ageSasha < 18) {
            System.out.println("Вам еще не исполнилось 18,осталось подождать еще немного :)");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task2 ");


       //task2
        int ageGoTo = 20;
        if (ageGoTo >= 7 && ageGoTo < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (ageGoTo >= 18 && ageGoTo < 24) {
            System.out.println("Человек уже окончил школу и может отправляться в университет.");
        }
        if (ageGoTo >= 24) {
            System.out.println("Человек уже окончил университет и ему пора искать первую работу.");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task3");


        //task3
        int fullCarrriageTrain = 102;
        //System.out.println("Всего мест в вагоне " + fullCarrriageTrain);
        int fullSitPlace = 60;
        //System.out.println("Сидячих мест в вагоне " + fullSitPlace);
        int fullStandingPlace = fullCarrriageTrain-fullSitPlace;
        //System.out.println("Стоячих мест в вагоне " + fullStandingPlace);
        int sitPlace = 50;
        int standingPlace = 13;
         if (sitPlace>= fullSitPlace && standingPlace >= fullStandingPlace){
             System.out.println("Мест в вагоне нет");
        }
         if (sitPlace<fullSitPlace ){
             System.out.println(" В вагоне есть сидячие места");
         }
        if (standingPlace<fullStandingPlace ){
            System.out.println(" В вагоне есть стоячие места");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//Homework4.2 ");
        System.out.println(" ");
        System.out.println("//task1");


         //Homework4.2
        //task1
        int agePeople = 17;
        if (agePeople >= 18){
            System.out.println("Поздравляем с совершеннолетием!");
        }
         else {
            System.out.println("Вам еще не исполнилось 18,подождите еще немного!");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("//task2 ");
        }



        //task2
        int dimaGoTo = 25;
        if ( dimaGoTo>= 7 && dimaGoTo <18 ){
            System.out.println("Дима ходит в школу.");
        }
        else if (dimaGoTo >= 18 && dimaGoTo <24){
            System.out.println("Дима ходит в университет.");
        }
        else if (dimaGoTo >= 24) {
            System.out.println("Дима может искать свою первую работу.");
        }
        else {
            System.out.println("Дима не ходит в школу, в университет и на работу.");
        }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("// task3 ");



        //task3

        int fullCarrriageTrain2 = 102;
        //System.out.println("Всего мест в вагоне " + fullCarrriageTrain2);
        int fullSitPosition = 60;
        //System.out.println("Всего мест в сидячем вагоне " + sitPosition);
        int fullStandingPosition = fullCarrriageTrain2 - fullSitPosition;
        //System.out.println("Всего мест в стоячем вагоне" + standingPosition2);
        int sitPosition = 60;
        int standPosition = 15;
        if (sitPosition >= 60 && standPosition >= 42){
            System.out.println("Мест в вагоне нет");
        }
        else if (sitPosition < 60 ){
            System.out.println("В сидячем вагоне остались места");
        }
        else if (standPosition < 42){
            System.out.println("В стоячем вагоне остались места");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//Homework4.3");
        System.out.println(" ");
        System.out.println("//task1 ");

         //Homework4.3
        //task1
        int ageMan1 = 21;
        if (ageMan1 >=2 && ageMan1<6){
            System.out.println("Если возраст человека равен " + ageMan1 + " лет,то ему нужно ходить в детский сад");
        }

        else if (ageMan1 >=7 && ageMan1 <18){
            System.out.println("Если возраст человека равен " + ageMan1 + " лет,то ему нужно ходить в школу");
        }

        else  if (ageMan1 >=18 && ageMan1<=24){
            System.out.println("Если возраст человека равен " + ageMan1 + " лет, то ему нужно ходить в университет");
        }

        else  if (ageMan1>24){
            System.out.println("Если возраст человека равен " + ageMan1 + " лет, то ему нужно ходить на работу");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task2 ");


        //task2
        int ageChildren1 = 13;
        if (ageChildren1<5){
            System.out.println("Кататься на аттракционе нельзя");
        }
        else if (ageChildren1>5 && ageChildren1<14){
            System.out.println("Можно кататься только в сопровождении взрослого. Если взрослого нет,то кататься нельзя");
        }
        else if (ageChildren1>14){
            System.out.println("Можно кататься без сопровождения взрослого");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task3");

        //task3
        int one = 1;
        int two = 2;
        int free = 10;
        if (one>two && one>free){
            System.out.println("one");
        }
        else if (two>one && two>free){
            System.out.println("two");
        }
        else if (free>one && free>two){
            System.out.println("free");
        }













    }
}













