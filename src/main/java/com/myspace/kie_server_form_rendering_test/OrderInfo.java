package com.myspace.kie_server_form_rendering_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrderInfo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Order ID")
	private java.lang.String orderId;

	public OrderInfo() {
	}

	public java.lang.String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(java.lang.String orderId) {
		this.orderId = orderId;
	}

	public OrderInfo(java.lang.String orderId) {
		this.orderId = orderId;
	}

}