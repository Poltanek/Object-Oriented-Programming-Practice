public class Cat {
    private String name;
    private String weight;
    private String breed;
    private String model;
    private String colour;

    public Cat(String name, String weight, String breed, String model, String colour) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
        this.model = model;
        this.colour = colour;
    }
    public String getName() {
        return name;
    }
    public String getWeight() {
        return weight;
    }
    public String getBreed() {
        return breed;
    }
    public String getModel() {
        return model;
    }
    public String getColour() {
        return colour;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void play() {
        System.out.println("Playing");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Whisker", "4kg", "Siamese", "Model-X", "White");
        System.out.println("Cat Name: " + myCat.getName());
        System.out.println("Cat Weight: " + myCat.getWeight());
        System.out.println("Cat Breed: " + myCat.getBreed());
        System.out.println("Cat Model: " + myCat.getModel());
        System.out.println("Cat Colour: " + myCat.getColour());

        myCat.play();
    }


}