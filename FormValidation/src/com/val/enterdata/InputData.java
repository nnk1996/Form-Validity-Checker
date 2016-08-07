package com.val.enterdata;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputData
 */
@WebServlet("/InputData")
public class InputData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InputData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		File name=new File("C:\\NNK\\Project2\\FormValidation\\Name.txt");
		File user=new File("C:\\NNK\\Project2\\FormValidation\\UName.txt");
		File pwd=new File("C:\\NNK\\Project2\\FormValidation\\Password.txt");
		File mailid=new File("C:\\NNK\\Project2\\FormValidation\\Email.txt");
		File gen=new File("C:\\NNK\\Project2\\FormValidation\\Sex.txt");
		File nat=new File("C:\\NNK\\Project2\\FormValidation\\Country.txt");
		File mobile=new File("C:\\NNK\\Project2\\FormValidation\\Mobile.txt");
		File age=new File("C:\\NNK\\Project2\\FormValidation\\Age.txt");
		File dob=new File("C:\\NNK\\Project2\\FormValidation\\DOB.txt");
		File addr=new File("C:\\NNK\\Project2\\FormValidation\\ADDR.txt");
		File pin=new File("C:\\NNK\\Project2\\FormValidation\\PIN.txt");
		if(!(name.exists()))
		{
			name.createNewFile();
			user.createNewFile();
			pwd.createNewFile();
			mailid.createNewFile();
			gen.createNewFile();
			nat.createNewFile();
			mobile.createNewFile();
			age.createNewFile();
			dob.createNewFile();
			addr.createNewFile();
			pin.createNewFile();
			
		}
		String nam=request.getParameter("name");
		String usern=request.getParameter("un");
		String pass=request.getParameter("pwd");
		String birth=request.getParameter("dob");
		String emailid=request.getParameter("email");
		String sex=request.getParameter("gen");
		String nation=request.getParameter("country");
		String number=request.getParameter("mobile");
		String old=request.getParameter("age");
		String house=request.getParameter("addr");
		String pinno=request.getParameter("pin");
		FileWriter fname=new FileWriter(name,true);
		FileWriter fuser=new FileWriter(user,true);
		FileWriter fpwd=new FileWriter(pwd,true);
		FileWriter fmailid=new FileWriter(mailid,true);
		FileWriter fgen=new FileWriter(gen,true);
		FileWriter fnat=new FileWriter(nat,true);
		FileWriter fmobile=new FileWriter(mobile,true);
		FileWriter fage=new FileWriter(age,true);
		FileWriter fdob=new FileWriter(dob,true);
		FileWriter faddr=new FileWriter(addr,true);
		FileWriter fpin=new FileWriter(name,true);
		PrintWriter wname=new PrintWriter(fname);
		PrintWriter wuser=new PrintWriter(fuser,true);
		PrintWriter wpwd=new PrintWriter(fpwd,true);
		PrintWriter wmailid=new PrintWriter(fmailid,true);
		PrintWriter wgen=new PrintWriter(fgen,true);
		PrintWriter wnat=new PrintWriter(fnat,true);
		PrintWriter wmobile=new PrintWriter(fmobile,true);
		PrintWriter wage=new PrintWriter(fage,true);
		PrintWriter wdob=new PrintWriter(fdob,true);
		PrintWriter waddr=new PrintWriter(faddr,true);
		PrintWriter wpin=new PrintWriter(fpin,true);
		wname.println(nam);
		wuser.println(usern);
		wpwd.println(pass);
		wmailid.println(emailid);
		wgen.println(sex);
		wnat.println(nation);
		wmobile.println(number);
		wage.println(old);
		wdob.println(birth);
		waddr.println(house);
		wpin.println(pinno);
		wname.close();
		wuser.close();
		wpwd.close();
		wmailid.close();
		wgen.close();
		wnat.close();
		wmobile.close();
		wage.close();
		wdob.close();
		waddr.close();
		wpin.close();
		response.sendRedirect("index.html");
	}

}
