import com.ejercicio.clases.SmartDevice;
import com.ejercicio.herencias.SmartPhone;
import com.ejercicio.herencias.SmartWatch;

public class Main {
    public static void main(String[] args) {


        System.out.println("----------SmartPhone--------------");
        SmartPhone iphone = new SmartPhone("apple", "13 plus", 12000, 2022, "microsd");
        System.out.println(iphone.marca);
        System.out.println(iphone.modelo);
        System.out.println(iphone.precio);
        System.out.println(iphone.year);
        System.out.println(iphone.tipeSim);

        System.out.println("---------SmartWatch----------");
        SmartWatch swatch = new SmartWatch("Hawue", "se433", 2000, 2019, true);
        System.out.println(swatch.marca);
        System.out.println(swatch.modelo);
        System.out.println(swatch.precio);
        System.out.println(swatch.year);
        System.out.println(swatch.diseñoDeportivo);

    }
}