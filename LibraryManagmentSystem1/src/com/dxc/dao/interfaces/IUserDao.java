package com.dxc.dao.interfaces;

import java.util.List;
import com.dxc.pojos.BookPojo;

public interface IUserDao {

	boolean passwordCheck(String name, String password);
	public void closeConnection();
	public List<com.dxc.pojos.BookPojo> getBookList();
	public List<BookPojo> getBookListOfParticularAuther(String autherName);
	void issueBook(int uId, int bId, int day,double balance);
	double getBalance(int userId);
	int getUserId(String name);
	void returnBook(int uId, int bId);
	List<BookPojo> getIssuedBook(int uId);

}
