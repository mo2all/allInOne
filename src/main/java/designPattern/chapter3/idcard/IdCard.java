package designPattern.chapter3.idcard;

import designPattern.chapter3.framework.Product;

/**
 * @Description Factory模式中的 ConcreteProduct
 * @Author Skye
 * @Date 2019/1/4 18:53
 * @Version 1.0
 **/
public class IdCard extends Product {

    String owner;
    int id;
    IdCard(String owner, int id){
        System.out.println("制作"+owner+"("+id+")"+"的ID卡");
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"("+id+")"+"的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }
}
