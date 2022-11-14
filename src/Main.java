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
        int DimaGoToSchool = 7;
        if (DimaGoToSchool >= 7 && DimaGoToSchool < 18){
            System.out.println("Дима ходит в школу");
        }
        else  if (DimaGoToSchool >= 18 && DimaGoToSchool < 24){
            System.out.println("Дима окончил школу и может поступить в университет");

        }
        else {
            System.out.println("Дима окончил университет и может искать первую работу");
            System.out.println(" ");
        }



        int SvetaGoToUniversity = 18;
        if (SvetaGoToUniversity >= 7 && SvetaGoToUniversity >= 18 ){
            System.out.println("Света ходит в школу");
        }
        else if (SvetaGoToUniversity >= 18 && SvetaGoToUniversity <24){
            System.out.println("Света окончила школу и может поступить в университет");
        }
        else {
            System.out.println("Света окончила университет и может искать первую работу");
        }



        int lisaGoToFirstWork = 24;
        if (lisaGoToFirstWork >= 7 && lisaGoToFirstWork >= 24){
            System.out.println("Лиза ходит в школу");
        }
        else if (lisaGoToFirstWork >= 18 && lisaGoToFirstWork <24){
            System.out.println("Лиза окончила школу и может поступать в университет");
        }
        else {
            System.out.println("Лиза окончила универститет и может устраиваться на первую работу");
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













