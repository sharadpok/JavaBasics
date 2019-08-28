package Encapsulation;
class Account
{
private long acc_no;
public long getAcc_no() {
	return acc_no;
}
public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
private String name,email;
private float amount;
}
public class Example2
{

	public static void main(String[] args)
	{
		Account ref=new Account();
		ref.setAcc_no(456789097);
		ref.setAmount(45000);
		ref.setEmail("sharadpokale11@gmail.com");
		ref.setName("Sharad");
		System.out.println("Name: "+ref.getName()+" Email: "+ref.getEmail()+" Account No: "+ref.getAcc_no()+" Amount: "+ref.getAmount());

	}

}
