package designPattern.chapter3.framework;

/**
 * @Description Factory中的Creator角色
 * @Author Skye
 * @Date 2019/1/4 18:45
 * @Version 1.0
 **/
public abstract class Factory {
    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
