public class Car {
   


    /**
     * @param make
     * @param model
     * @param year
     * @param price
     * Estas variables son las que se definen para la marca, modelo, año y precio del coche
     */
    private String make;
    private String model;
    private int year;
    private double price;

   
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    
    /** 
     * @return String
     */
    
    /**
     * @param make devuelve la marca del coche
     * @return
     */
    public String getMake() {
        return make;
    }
    /* Asegura que la marca es la marca */
    public void setMake(String make) {
        this.make = make;
    }

  /**
     * @param model devuelve el modelo del coche
     * @return
     */
    public String getModel() {
        return model;
    }
    /* Asegura e modelo del coche */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @param year devuelve el año del coche
     * @return
     */
    public int getYear() {
        return year;
    }
    /*Asegura el año del coche */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @param price devuelve el precio del coche
     * @return
     */
    public double getPrice() {
        return price;
    }
    /*Asegura el precio del coche */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * @param carDescription() devuelve la descripción del coche, uniendo año, marca, modelo y precio, en ese orden
     * @return
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    @Override
    /*Devuelve dicha descripción del coche */
    public String toString() {
        return carDescription();
    }

    /**
     * @param main instancia a Car para poder añadir la marca, el modelo, el año y el precio y imprime la funcion car
     * @return
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}