public class Ravenclaw extends HogwartsStudent{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    @Override
    public String toString() {
        return "Ravenclaw student{" +
                super.toString() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public Ravenclaw(int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    public int getTotalAmount(){
        return getCreativity() + getSmart() + getWise() + getWitty();
    }
    public boolean compare(Ravenclaw student){
        return getTotalAmount() > student.getTotalAmount();
    }

    public static void showBetter(Ravenclaw[] students){
        //пузырек
        boolean isSorted = false;
        Ravenclaw buf;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < students.length-1; i++) {
                if(students[i].getTotalAmount() < students[i+1].getTotalAmount()){
                    isSorted = false;

                    buf = students[i];
                    students[i] = students[i+1];
                    students[i+1] = buf;

                }
            }
        }
        //выведем
        System.out.println("Данные по баллам для Когтевран:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("место = " + (i + 1) + " Общее количество баллов:" + students[i].getTotalAmount() + "  " + students[i].toString());
        }
    }
}
