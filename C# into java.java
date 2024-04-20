package pk.cui.sc.fm;

import java.util.HashMap;
import java.util.Map;

// Enum for Product IDs
enum ProductId { MINE, YOURS }

// Defines the interface of objects the factory method creates
interface Product {
    void print();
}

// Implements the Product interface
class ConcreteProductMINE implements Product {
    @Override
    public void print() {
        System.out.println("this=" + this + " print MINE");
    }
}

// Implements the Product interface
class ConcreteProductYOURS implements Product {
    @Override
    public void print() {
        System.out.println("this=" + this + " print YOURS");
    }
}

// Declares the factory method, which returns an object of type Product
class Creator {
    private Map<ProductId, Product> productMap = new HashMap<>();

    public Creator() {
        productMap.put(ProductId.MINE, new ConcreteProductMINE());
        productMap.put(ProductId.YOURS, new ConcreteProductYOURS());
        // Add more products if needed
    }

    public Product create(ProductId id) {
        return productMap.get(id);
    }
}

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        
        Product product = creator.create(ProductId.MINE);
        product.print();

        product = creator.create(ProductId.YOURS);
        product.print();
    }
}

