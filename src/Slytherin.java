public class Slytherin extends HogwartsStudent{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    @Override
    public String toString() {
        return "Slytherin student{" +
                super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }

    public Slytherin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getTotalAmount(){
        return getAmbition() + getCunning() + getDetermination() + getResourcefulness() + getThirstPower();
    }
    public boolean compare(Slytherin student){
        return getTotalAmount() > student.getTotalAmount();
    }

    public static void showBetter(Slytherin[] students){
        //пузырек
        boolean isSorted = false;
        Slytherin buf;

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
        System.out.println("Данные по баллам для Слизерин:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("место = " + (i + 1) + " Общее количество баллов:" + students[i].getTotalAmount() + "  " + students[i].toString());
        }
    }
}
