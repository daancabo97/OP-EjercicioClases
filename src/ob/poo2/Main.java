package ob.poo2;

public class Main {

    public static void main(String[] args) {
        
        // Crear un objeto SmartPhone
        SmartPhone iPhone = new SmartPhone("Apple", "iPhone 12", "iOS", 128, 4, 6.1, 12);
        System.out.println("Marca del SmartPhone: " + iPhone.getBrand());
        System.out.println("Modelo del SmartPhone: " + iPhone.getModel());
        System.out.println("Sistema operativo del SmartPhone: " + iPhone.getOperatingSystem());
        System.out.println("Almacenamiento del SmartPhone: " + iPhone.getStorage());
        System.out.println("RAM del SmartPhone: " + iPhone.getRAM());
        System.out.println("Tamaño de pantalla del SmartPhone: " + iPhone.getScreenSize());
        System.out.println("Resolución de cámara del SmartPhone: " + iPhone.getCameraResolution());

        // Crear un objeto SmartWatch
        SmartWatch appleWatch = new SmartWatch("Apple", "Apple Watch Series 6", "watchOS", 32, 1, "Rectangular", "Aluminum");
        System.out.println("Marca de la SmartWatch: " + appleWatch.getBrand());
        System.out.println("Modelo de la SmartWatch: " + appleWatch.getModel());
        System.out.println("Sistema operativo de la SmartWatch: " + appleWatch.getOperatingSystem());
        System.out.println("Almacenamiento de la SmartWatch: " + appleWatch.getStorage());
        System.out.println("RAM de la SmartWatch: " + appleWatch.getRAM());
        System.out.println("Forma de la pantalla de la SmartWatch: " + appleWatch.getWatchFace());
        System.out.println("Material de la correa de la SmartWatch: " + appleWatch.getStrapMaterial());
    }
}
