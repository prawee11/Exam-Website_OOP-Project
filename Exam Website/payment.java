package com.customer;

public class payment {
	
	private int Userid;
	private String Paymenttype;
	private String Amount;
	public payment(int Userid, String Paymenttype, String amount) { 
		this.Userid = Userid;
		this.Paymenttype = Paymenttype;
		this.Amount = amount;
	}
	public int getUserid() {
		return Userid;
	}
	public String getPaymenttype() {
		return Paymenttype;
	}
	public String getAmount() {
		return Amount;
	}
	

}
