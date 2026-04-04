import java.util.ArrayList;
import java.util.Scanner;

class UnauthorizedModelException extends Exception {
    public UnauthorizedModelException(String message) {
        super(message);
    }
}

class UnapprovedItemException extends Exception {
    public UnapprovedItemException(String message) {
        super(message);
    }
}

class Showroom {
    protected String name;
    protected String location;
    protected double rent;

    public Showroom(String name, String location, double rent) {
        this.name = name;
        this.location = location;
        this.rent = rent;
    }

    public double calculateYearlyRent() {
        return rent * 12;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Yearly Rent: " + calculateYearlyRent());
    }
}

class AutomobileShowroom extends Showroom {
    private String carBrand;
    private ArrayList<String> carModels = new ArrayList<>();

    public AutomobileShowroom(String name, String location, double rent, String carBrand) {
        super(name, location, rent);
        this.carBrand = carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
        this.carModels.clear();
    }

    public void addModel(String model, String[] authorized) throws UnauthorizedModelException {
        boolean valid = false;
        for (String s : authorized) {
            if (s.equalsIgnoreCase(model)) {
                valid = true;
                break;
            }
        }
        if (!valid) throw new UnauthorizedModelException("Unauthorized Model Exception: " + model);
        if (!carModels.contains(model)) carModels.add(model);
    }

    @Override
    public double calculateYearlyRent() {
        return super.calculateYearlyRent() + (500 * carModels.size());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + carBrand);
        System.out.println("Models: " + carModels);
    }
}

class JewelryShowroom extends Showroom {
    private String material;
    private ArrayList<String> items = new ArrayList<>();

    public JewelryShowroom(String name, String location, double rent, String material) {
        super(name, location, rent);
        this.material = material;
    }

    public void addItem(String item, String[] authorized) throws UnapprovedItemException {
        boolean valid = false;
        for (String s : authorized) {
            if (s.equalsIgnoreCase(item)) {
                valid = true;
                break;
            }
        }
        if (!valid) throw new UnapprovedItemException("Unapproveditem Exception: " + item);
        if (!items.contains(item)) items.add(item);
    }

    @Override
    public double calculateYearlyRent() {
        return super.calculateYearlyRent() + (250 * items.size());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Material: " + material);
        System.out.println("Items: " + items);
    }
}

class ElectronicsShowroom extends Showroom {
    private String brand;
    private ArrayList<String> items = new ArrayList<>();

    public ElectronicsShowroom(String name, String location, double rent, String brand) {
        super(name, location, rent);
        this.brand = brand;
    }

    public void addItem(String item, String[] authorized) throws UnapprovedItemException {
        boolean valid = false;
        for (String s : authorized) {
            if (s.equalsIgnoreCase(item)) {
                valid = true;
                break;
            }
        }
        if (!valid) throw new UnapprovedItemException("Unapproveditem Exception: " + item);
        if (!items.contains(item)) items.add(item);
    }

    @Override
    public double calculateYearlyRent() {
        return super.calculateYearlyRent() + (750 * items.size());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Items: " + items);
    }
}

public class Lab15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] toyotaAuth = {"2024 Camry", "2024 Corolla", "2024 GR Supra", "2023 Prius", "2023 GR86", "2023 Mirai"};
        String[] fordAuth = {"2023 Bronco", "2023 Bronco Sport", "2024 Expedition", "2024 Escape"};
        String[] mercAuth = {"E-Class Coupe", "EQS Sedan", "GLE Coupe", "C-Class Cabriolet"};
        
        String[] jewelryAuth = {"Necklaces", "Rings", "Earrings", "Bracelets"};
        String[] electronicsAuth = {"Television", "Refrigerator", "Microwave Oven", "Rice Cooker", "Toaster"};

        AutomobileShowroom auto = new AutomobileShowroom("City Motors", "Dhaka", 5000, "Toyota");
        
        System.out.println("Adding models for Toyota Showroom...");
        int count = 0;
        while (count < 3) {
            try {
                System.out.print("Enter Model: ");
                auto.addModel(sc.nextLine(), toyotaAuth);
                count++;
            } catch (UnauthorizedModelException e) {
                System.out.println(e.getMessage());
            }
        }
        auto.displayInfo();

        System.out.println("\nSwitching brand to Ford...");
        auto.setCarBrand("Ford");
        count = 0;
        while (count < 3) {
            try {
                System.out.print("Enter Model (e.g., 2023 Bronco): ");
                auto.addModel(sc.nextLine(), fordAuth);
                count++;
            } catch (UnauthorizedModelException e) {
                System.out.println(e.getMessage());
            }
        }
        auto.displayInfo();

        JewelryShowroom jewelry = new JewelryShowroom("Glint", "Banani", 8000, "Gold");
        count = 0;
        while (count < 3) {
            try {
                System.out.print("\nEnter Jewelry Item: ");
                jewelry.addItem(sc.nextLine(), jewelryAuth);
                count++;
            } catch (UnapprovedItemException e) {
                System.out.println(e.getMessage());
            }
        }
        jewelry.displayInfo();

        ElectronicsShowroom elec = new ElectronicsShowroom("Smart", "Uttara", 4000, "Sony");
        count = 0;
        while (count < 3) {
            try {
                System.out.print("\nEnter Electronics Item: ");
                elec.addItem(sc.nextLine(), electronicsAuth);
                count++;
            } catch (UnapprovedItemException e) {
                System.out.println(e.getMessage());
            }
        }
        elec.displayInfo();
    }
}
