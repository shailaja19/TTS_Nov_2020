package com.sonata.DaoImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.UserDao;
import com.sonata.Model.User;

public class UserDAOImpl implements UserDao {
	int row=0;
	DbConnection db=new DbConnection();
	User user=null;
	@Override
	public int save(Object object) {
		try {
			user =(User)object;
			PreparedStatement cs=db.getConnection().prepareStatement
					("insert into register values(?,?)");
			cs.setString(1,user.getEmail());
			cs.setString(2,user.getPass());
			row =cs.executeUpdate();
			db.closeConnection();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row;
	}
	
	@Override
	public List<User> getData() {
		List<User> userList=new ArrayList<>();
		try {
			PreparedStatement cs1 =db.getConnection().prepareStatement("select * from register");
			ResultSet rs=cs1.executeQuery();
			//A table of data representing a database result set, which is usually generated b
			//By executing a statement that queries the database.


			while(rs.next()) {
				User user=new User();
				
				String email=rs.getString(1);
				String pass=rs.getString(2);
				user.setEmail(email);
				user.setPass(pass);
				userList.add(user);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return userList;

}
}
