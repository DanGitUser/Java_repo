package domain;

import java.util.Date;

public class Account {
	//Account number
	private int no;
	// 잔고 	
	private long amount;
	//회원
	private Customer customer;
	//계좌비밀번호
	private String pw;
	//한도맥수
	private long limit;
	//개설일
	private Date date;
	
	public Account(int no, Customer customer, String pw) {
		super();
		this.no = no;
		this.amount = amount;
		this.customer = customer;
		this.pw = pw;
		this.limit = limit;
		this.date = new Date();
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public long getLimit() {
		return limit;
	}
	public void setLimit(long limit) {
		this.limit = limit;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return String.format("Account [no=%s, amount=%s, customer=%s, pw=%s, limit=%s, date=%s]", no, amount, customer,
				pw, limit, date);
	}
	
	
	
	
	
}
