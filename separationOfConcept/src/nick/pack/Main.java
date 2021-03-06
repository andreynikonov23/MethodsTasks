package nick.pack;



public class Main {
    public static void main(String[] args) {
        /*
        Метод main выводит слишком много строк информации о различных понятиях.
        Было бы логично разделить вывод информации о водороде и об острове Ява на разные методы.
        Создай public static void printHydrogenInfo() метод, который должен выводить все строки о водороде.
        Также создай public static void printJavaInfo() метод, который будет выводить все строки об острове Ява.
        Наконец, в методе main() вызови эти два метода.
        Общий вывод в консоли не должен измениться.
         */
        printHydrogenInfo();
        System.out.println();
        System.out.println();
        System.out.println("Остров Ява");
        printJavaInfo();
    }
    public static void printHydrogenInfo(){
        System.out.println("Водород — химический элемент с порядковым номером 1.");
        System.out.print("Атом водорода состоит из одного протона и одного электрона.");
        System.out.println(" Такое строение обусловливает уникальные свойства водорода. ");
        System.out.println("В периодической системе водород занимает особое место: подобно щелочным металлам водород обладает способностью отдавать один электрон, поэтому он может быть помещен в главную подгруппу 1 группы;");
        System.out.print(" однако, как и галогены, водород способен присоединять один электрон, поэтому его можно поместить в главную подгруппу 5 группы.");
    }
    public static void printJavaInfo(){
        System.out.println("Остров Ява – довольно крупный остров в северо-восточной части Индийского океана, входящий в состав Больших Зондских островов, формирующих Малайский архипелаг.");
        System.out.print(" Остров Ява расположен на юго-восток от острова Суматра и отделяется от него Зондским проливом. ");
        System.out.print("Происхождение названия острова до сих пор непонятно. ");
        System.out.println("Существует несколько версий происхождения названия «Ява». ");
        System.out.println("По одной из них оно является корнем прото-австронезийского слова, обозначающего «дом», по другой – оно произошло от слова Yawadvipa, упоминающегося в раннем индийском эпосе Рамаяна:");
        System.out.print(" Сугрива, начальник армии Рамы, направил своих людей на остров Yawadvipa (dvipa – на санскрите остров) в поисках Ситы.");
    }
}
