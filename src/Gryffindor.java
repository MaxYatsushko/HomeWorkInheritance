public class Gryffindor extends HogwartsStudent{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Gryffindor student{" +
                super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public boolean compare(Gryffindor student){
        return getTotalAmount() > student.getTotalAmount();
    }

    public int getTotalAmount(){
        return getCourage() + getHonor() + getNobility();
    }

    public static void showBetter(Gryffindor[] students){
        //пузырек
        boolean isSorted = false;
        Gryffindor buf;

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
        System.out.println("Данные по баллам для Гриффиндора:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("место = " + (i + 1) + " Общее количество баллов:" + students[i].getTotalAmount() + "  " + students[i].toString());
        }
    }
}
