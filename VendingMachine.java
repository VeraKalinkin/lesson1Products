import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface VendingMachine {
    void initProducts(List<Product>listProducts);

    public void addProduct(Product product);

    public Product getProduct(String name);

}
