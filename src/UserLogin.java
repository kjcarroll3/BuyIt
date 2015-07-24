import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UserLogin {
	
	Connection con;
	Statement st;
	ResultSet rs;
	
	JFrame f = new JFrame("User Login");
	JLabel l = new JLabel("Username:");
	JLabel l1 = new JLabel("Password:");
	JTextField t = new JTextField(10);
	JTextField t1 = new JTextField(10);
	JButton b = new JButton("Login");
	
	public UserLogin() {
		ConnectDB();
		Frame();
	}
	
	public void ConnectDB() {
		try {
			String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
			Class.forName(driver);
			
			String db = "jdbc:odbc:db1";
			con = DriverManager.getConnection(db);
			st = con.createStatement();
		}
		catch(Exception ex) {
			
		}
	}
	
	public void Frame() {
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel p = new JPanel();
		
		p.add(l);
		p.add(t);
		p.add(l1);
		p.add(t1);
		p.add(b);
		
		f.add(p);
	}
	
	public static void main(String[] args) {
		new UserLogin();
	}

}
