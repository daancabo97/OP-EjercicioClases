package ob.poo2;


class SmartDevice {
    // Atributos comunes a todos los dispositivos inteligentes
    private String brand;
    private String model;
    private String operatingSystem;
    private int storage;
    private int RAM;

    // Constructor vacío
    public SmartDevice() {
    }

    // Constructor con todos los parámetros
    public SmartDevice(String brand, String model, String operatingSystem, int storage, int RAM) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.RAM = RAM;
    }

    // Métodos getter para acceder a los atributos
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getStorage() {
        return storage;
    }

    public int getRAM() {
        return RAM;
    }
}

class SmartPhone extends SmartDevice {
    // Atributos específicos de los smartphones
    private double screenSize;
    private int cameraResolution;

    // Constructor vacío
    public SmartPhone() {
    }

    // Constructor con todos los parámetros
    public SmartPhone(String brand, String model, String operatingSystem, int storage, int RAM, double screenSize, int cameraResolution) {
        super(brand, model, operatingSystem, storage, RAM);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    // Métodos getter para acceder a los atributos específicos
    public double getScreenSize() {
        return screenSize;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }
}

class SmartWatch extends SmartDevice {
    // Atributos específicos de las smartwatches
    private String watchFace;
    private String strapMaterial;

    // Constructor vacío
    public SmartWatch() {
    }

    // Constructor con todos los parámetros
    public SmartWatch(String brand, String model, String operatingSystem, int storage, int RAM, String watchFace, String strapMaterial) {
        super(brand, model, operatingSystem, storage, RAM);
        this.watchFace = watchFace;
        this.strapMaterial = strapMaterial;
    }

    // Métodos getter para acceder a los atributos específicos
    public String getWatchFace() {
        return watchFace;
    }

    public String getStrapMaterial() {
        return strapMaterial;
    }
}