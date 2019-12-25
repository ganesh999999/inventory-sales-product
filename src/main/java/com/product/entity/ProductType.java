package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_type")
public class ProductType {
	@Id
	private String productTypeCode;
	private String productTypeDescription;

	public ProductType() {
// no code
	}

	public String getProductTypeCode() {
		return productTypeCode;
	}

	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public String getProductTypeDescription() {
		return productTypeDescription;
	}

	public void setProductTypeDescription(String productTypeDescription) {
		this.productTypeDescription = productTypeDescription;
	}

	@Override
	public String toString() {
		return "ProductType [productTypeCode=" + productTypeCode + ", productTypeDescription=" + productTypeDescription
				+ "]";
	}

}
