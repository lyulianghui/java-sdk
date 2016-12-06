package me.ele.shop.sdk.interfaces.enumeration.item;

/**
 * 创建商品属性
 */
public enum OItemCreateProperty {

    /**
     * 商品名称
     */
    name("商品名称"),

    /**
     * 商品单价
     */
    price("商品单价"),

    /**
     * 商品描述
     */
    description("商品描述"),

    /**
     * 图片imageHash
     */
    imageHash("图片imageHash"),

    /**
     * 标签属性集合
     */
    labels("标签属性集合"),

    /**
     * 规格
     */
    specs("规格");

    private String value;

    private OItemCreateProperty(String value) {
        this.value = value;
    }
}
