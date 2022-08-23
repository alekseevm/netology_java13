package netology_java13;

public class ProductRepo {
    private Product[] items = new Product[0];


    public void save(Product item) {
        Product[] tmp = new Product[items.length + 1]; {
            for (int i = 0; i < items.length; i++) {
                tmp[i] = items[i];
            }
            tmp[tmp.length - 1] = item;
            items = tmp;
        }
    }

    public Product[] getItem() {
        Product[] result = new Product[items.length];
        for(int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void delete(int id) {
        Product[] tmp = new Product[items.length - 1];
        {
            int copyToIndex = 0;
            for (Product item : items) {
                if (item.getId() != id) {
                    tmp[copyToIndex] = item;
                    copyToIndex++;
                }
            }
            items = tmp;
        }

    }
}

