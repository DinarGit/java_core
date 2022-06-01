public class Main {

   public class LessonFruits {

    public static void main(String[] args) {
        doLesson_Fruits();

        String[] array = {"Sasha", "Masha", "Boris", "Vova", "Artem"};
        //doLesson_Array(array, 1,2);

        Integer[] integers = {5,4,3,2,1};
       // doLesson_ArrayWithoutTemp(integers, 1,2);
    }

    private static void doLesson_Fruits() {
        BoxFruit<Apple> appleBox = new BoxFruit<Apple>(1);
        BoxFruit<Orange> orangeBox = new BoxFruit<Orange>(1.5);
        BoxFruit<Apple> appleBox2 = new BoxFruit<Apple>(1);

        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());


        System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Weights equals - " + appleBox.compare(orangeBox));
        System.out.println("---------------------------------------------");

        appleBox.addFruits(appleBox2);

    }

    private static void doLesson_ArrayWithoutTemp(Integer[] integers, int i, int j) {

        Integer a = integers[i];
        Integer b = integers[j];

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        integers[i] = a;
        integers[j] = b;

        printArray(integers);
    }

    public static void doLesson_Array(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray(array);
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    
}
    }
    
    public class Apple extends Fruit {

    public Apple () {
        super(1.0f);
    }

}
    
    public class BoxFruit<F> {

    private double weightFruit = 0.0;
    ArrayList<F> fruits = new ArrayList();

    public <F> BoxFruit(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(BoxFruit<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(BoxFruit<F> boxFruit){
        System.out.println("Before merging. Quantity box 1: " + fruits.size());
        System.out.println("Before merging. Quantity box 2: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("After merging. Quantity box 1: " + fruits.size());
        System.out.println("After merging. Quantity box 2: " + boxFruit.fruits.size());
    }

}

public class Fruit {
    private int amount;
    private float weight;

    public Fruit (float weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public float getWeight() {
        return weight;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

public class Orange extends Fruit {

    public Orange() {
        super(1.5f);
    }

}
    
}
