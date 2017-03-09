package com.qf.chapter8.factory.universal;

/**
 * Created by ios on 16/10/19.
 */
public abstract class AbstractCreator {
    /**
     * 创建一个产品对象,其输入类型可以自己设置,通常为String,Enum.Class等,也可以为空
     *
     */
    public abstract <T extends AbstractProduct> T createProduct(Class<T> tClass);
}
