package in.co.user;

import java.text.SimpleDateFormat;

public class TestUser {
public static void main(String[] args) throws Exception {
//	testAdd();
//	testUpdate();
	testAuthenticate();
	
}

private static void testAuthenticate() throws Exception {
	 UserModel model = new UserModel();
	UserBean bean =  model.authenticate("shubham@gmail.com", "5678");
	
	 
	 if(bean != null) {
		 System.out.print(bean.getId());
		 System.out.print(" "+bean.getFirstName());
		 System.out.print(" "+bean.getLastName());
		 System.out.print(" "+bean.getLoginId());
		 System.out.print(" "+bean.getPassword());
		 System.out.print(" "+bean.getDob());
		 System.out.println(" "+bean.getAddress());
	 }
	 else 
	 {
		 System.out.println("User does not exist....!!!!");
	 }
	 
}

private static void testUpdate() throws Exception {
	
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	UserBean bean = new UserBean();
	
	bean.setFirstName("Shubham");
	bean.setLastName("Nagwanshi");
	bean.setLoginId("shubham@gmail.com");
	bean.setPassword("5678");
	bean.setDob(sdf.parse("1998-08-12"));
	bean.setAddress("Indore");
	bean.setId(1);
	
	UserModel model = new UserModel();
	
	model.update(bean);
}

private static void testAdd() throws Exception{
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	UserBean bean = new UserBean();
	
	bean.setFirstName("Gopal");
	bean.setLastName("Malviya");
	bean.setLoginId("gopal@gmail.com");
	bean.setPassword("1234");
	bean.setDob(sdf.parse("2000-12-08"));
	bean.setAddress("Khargone");
	
	UserModel model = new UserModel();
	
	model.add(bean);
	
}
}
