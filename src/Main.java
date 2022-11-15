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
        int dimaGoToSchool = 7;
        if (dimaGoToSchool >= 7){
            System.out.println("Дима ходит в школу,если ешл возраст больше или равен 7 годам");
        }
        else {
            System.out.println("Дима не может ходить в школу если его возраст меньше 7 лет");
            System.out.println(" ");
        }



        int dimaGoToUniversity = 18;
        if (dimaGoToUniversity >= 18){
            System.out.println("Дима ходит в университет,если его возраст больше или равен 18 годам");
        }
        else {
            System.out.println("Дима не может учиться в университете,если его возраст меньше 18");
        }



        int dimaGoToFirstWork = 24;
        if ( dimaGoToFirstWork >= 24){
            System.out.println("Дима может искать свою первую работу,если его возраст больше или равен 24 годам");
        }
        else {
            System.out.println("Дима не может искать первую работу,ему нет 24 лет");
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

         //Homework4.3
        //task1
        int ageMan1 = 21;
        boolean manGoTo = ageMan1 >=2 && ageMan1<6 || ageMan1 >=7 && ageMan1 <18 ||ageMan1 >=18 && ageMan1<=24 || ageMan1>24;

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


        //task2
        int ageChildren1 = 13;
        boolean ageChildrenGoToAttraction = ageChildren1<5 || ageChildren1>5 && ageChildren1<14 || ageChildren1>14;
        if (ageChildren1<5){
            System.out.println("Кататься на аттракционе нельзя");
        }
        else if (ageChildren1>5 && ageChildren1<14){
            System.out.println("Можно кататься только в сопровождении взрослого. Если взрослого нет,то кататься нельзя");
        }
        else if (ageChildren1>14){
            System.out.println("Можно кататься без сопровождения взрослого");
        }

        //task3
        int one = 1;
        int two = 2;
        int free = 10;
        boolean bigNumber = one<two && one<free||two>one && two<free||free>one && free>two;
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













