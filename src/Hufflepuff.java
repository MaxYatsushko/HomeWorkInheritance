public class Hufflepuff extends HogwartsStudent{
    private int hardWorking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int magicPower, int transgressionDistance, int hardWorking, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff student{" +
                super.toString() +
                ", hardWorking=" + hardWorking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public int getTotalAmount(){
        return getHonesty() + getLoyalty() + getHardWorking();
    }
    public boolean compare(Hufflepuff student){
        return getTotalAmount() > student.getTotalAmount();
    }

    public static void showBetter(Hufflepuff[] students){
        //пузырек
        boolean isSorted = false;
        Hufflepuff buf;

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
        System.out.println("Данные по баллам для Пуффендуй:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("место = " + (i + 1) + " Общее количество баллов:" + students[i].getTotalAmount() + "  " + students[i].toString());
        }
    }
}
