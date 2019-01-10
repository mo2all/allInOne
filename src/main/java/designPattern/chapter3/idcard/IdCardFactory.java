package designPattern.chapter3.idcard;

import designPattern.chapter3.framework.Factory;
import designPattern.chapter3.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Factory中的ConcreteCreator的角色
 * @Author Skye
 * @Date 2019/1/4 18:53
 * @Version 1.0
 **/
public class IdCardFactory  extends Factory {
    private List<String> owners = new ArrayList<>();
    private int id=100;
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IdCard(owner,id++);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IdCard)product).getOwner());
    }
    public List getOwners(){
        return owners;
    }
}
