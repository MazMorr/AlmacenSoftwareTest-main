package Model;
import Util.Exception_Product_Not_Found;
import java.util.ArrayList;

public class Inventary {

    ArrayList<Product> products = new ArrayList<>();
    ArrayList<TechnologyStorage> technologies = new ArrayList<>();
    ArrayList<Movement> movements = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public boolean verifyAvaibility(Product product) {
        for (Product p : products){
            if (p.equals(product)) {
                return true;
            }
        }
        return false;
    }

    public Product findProduct(int productId)throws Exception_Product_Not_Found {
        for (Product p : products){
            if (p.getId() == productId) {
                return p;
            }
        }
        throw new Exception_Product_Not_Found();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addTechnology(TechnologyStorage technology) {

        if (){
            technologies.add(technology)
        }
    }

    public ArrayList<TechnologyStorage> getTechnologies() {
        return technologies;
    }

    public TechnologyStorage getTechnologyStorageForProduct(int productId) {
        for (Product p : products){
           if (p.getId()==productId){
               return p.getTechnologyStorage();
           }
        }
        return null;
    }

    public void removeTechnology(TechnologyStorage technology) {
        technologies.remove(technology);
    }

    public void addMovement(Movement movement) {
        movements.add(movement);
    }

    public void removeMovement(Movement movement) {
        movements.remove(movement);
    }

}
