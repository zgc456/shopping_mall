package com.zhkj.entity;

/**
 * 收货地址实体类
 */
public class HarvestaddressEntity {
    private int id;
    private String harvestAddressName;
    private Integer harvestIsDefault;
    private Integer typeId;
    private Integer userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHarvestAddressName() {
        return harvestAddressName;
    }

    public void setHarvestAddressName(String harvestAddressName) {
        this.harvestAddressName = harvestAddressName;
    }

    public Integer getHarvestIsDefault() {
        return harvestIsDefault;
    }

    public void setHarvestIsDefault(Integer harvestIsDefault) {
        this.harvestIsDefault = harvestIsDefault;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


}
