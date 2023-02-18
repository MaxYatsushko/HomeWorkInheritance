public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(80, 100, 90, 90, 100);
        Gryffindor hermioneGranger = new Gryffindor(100, 100, 80, 80, 70);
        Gryffindor ronWeasley = new Gryffindor(60, 60, 70, 70 , 60);
        System.out.println(harryPotter);


        Hufflepuff zachariaSmith = new Hufflepuff(80, 30, 70, 80, 80);
        Hufflepuff justinFinchFletchley = new Hufflepuff(60, 80, 90, 70, 60);
        Hufflepuff cedricDiggory = new Hufflepuff(90, 70, 70, 60, 80);
        System.out.println(zachariaSmith);

        Ravenclaw zhouChang = new Ravenclaw(60, 50, 90, 80, 80, 70);
        Ravenclaw padmaPatil = new Ravenclaw(80, 50, 90,100, 70, 70);
        Ravenclaw marcusBelby = new Ravenclaw(60, 90, 90, 70, 80, 30);
        System.out.println(zhouChang);

        Slytherin dracoMalfoy = new Slytherin(40, 40, 90, 70, 80, 90, 90);
        Slytherin grahamMontagu = new Slytherin(30, 40, 10, 10, 10, 10, 10);
        Slytherin gregoryGoyle = new Slytherin(10, 10, 20, 10, 20, 10, 5);
        System.out.println(dracoMalfoy);

        Gryffindor.showBetter(new Gryffindor[]{harryPotter, hermioneGranger, ronWeasley});
        Hufflepuff.showBetter(new Hufflepuff[]{zachariaSmith, justinFinchFletchley, cedricDiggory});
        Ravenclaw.showBetter(new Ravenclaw[]{zhouChang, padmaPatil, marcusBelby});
        Slytherin.showBetter(new Slytherin[]{dracoMalfoy, grahamMontagu, gregoryGoyle});

        System.out.println("Драко Малфой лучше Гарри Поттера?" + dracoMalfoy.compare(harryPotter));
        System.out.println("Гермиона Грейнджер лучше Гарри Поттера?" + hermioneGranger.compare(harryPotter));
    }
}
