import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotDrinksMachine implements VendingMachine{
    private List<Product> listProduct= new ArrayList<>();

    @Override
    public void initProducts(List<Product> listProducts){
        listProduct = listProducts;
    }

    @Override
    public void addProduct(Product product){
        listProduct.add(product);
    }

    @Override
    public Product getProduct(String name){
        for (Product product : listProduct)
            if (Objects.equals(product.getName(), name))
                return product;
        return  null;
    }

    public  Product getProduct(String name, double volume, int temperature){
        for (Product product : listProduct){
            if ((Objects.equals(product.getName(), name) || ((HotDrink)product).getVolume() == volume ||
                    ((HotDrink)product).getTemperature() == temperature))
                return product;
        }
        return  null;
    }
}
