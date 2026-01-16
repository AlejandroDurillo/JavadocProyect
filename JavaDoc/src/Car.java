public class Car {
   


    //https://github.com/AlejandroDurillo/JavadocProyect.git

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
     * @param make devuelve la marca del coche
     * @return
     */
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

  /**
     * @param model obtiene el modelo del coche devolviendo el modelo
     * @return
     */
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @param year obtiene el año del coche, devolviendo el precio
     * @return
     */
    public int getYear() {
        return year;
    }
   
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @param price obtiene el precio del coche, devolviendo el precio del mismo
     * @return
     */
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
   
    /**
     * Muestra la descripción del coche aportando año, marca, modelo y precio
     * @return
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    @Override
    
    public String toString() {
        return carDescription();
    }

    /**
     * Se genera el objeto car, da la opcion a poner los datos puestos, la marca, el modelo, el año y el precio
     * y devuelve el mensaje con los datos introducidos
     * @param args
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}