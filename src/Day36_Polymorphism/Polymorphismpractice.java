package Day36_Polymorphism;

import day30_inheritance.phoneTask.Iphone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;

public class Polymorphismpractice {

    Phone[] phones = {
            new Iphone("Iphone 11 Pro", "Large", "Black", 900),
            new Iphone("Iphone 12 Pro Max", "Large", "Black", 1200),
            new Iphone("Iphone 9", "Medium", "Gold", 800),
            new Samsung("samsung", "Galaxy19", "Large","Pink", 4500),
            new Samsung("samsung", "Galaxy19", "Large","black", 4500),
            new Samsung("samsung", "Galaxy19", "midium","Pink", 4500),
            new Nokia("XR20", "Small", "Blue", 350),
            new Nokia("G10", "Medium", "Gray", 99),
            new Nokia("G50", "Large", "Silver", 250),
            new Iphone("Iphone 12 Pro", "Large", "Black", 1200),
            new Iphone("Iphone 11 Pro Max", "Large", "Silver", 1100),
            new Samsung("samsung", "Galaxy19", "Large","Pink", 4500),
            new Samsung("samsung", "Galaxy19", "small","Pink", 4500),
            new Nokia("G10", "Medium", "Black", 99),
            new Iphone("Iphone 6", "Smalle", "Gold", 400),
            new Iphone("Iphone 7", "Smalle", "White", 500)
    };

}
