package com.val.checkname;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/UNcheck")
public class UNcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UNcheck() {    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {// TODO Auto-generated method stub
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\NNK\\Project2\\FormValidation\\UName.txt");
		boolean b=f.exists();
		boolean notpres=true;
		String fd=request.getParameter("un");
		fd.toString();
		if(b)
		{
			BufferedReader data=new BufferedReader(new FileReader(f));
			String rd=data.readLine();
			while(rd!=null)
			{
				log(rd+"\n");
				if(rd.equals(fd))
				{
					notpres=false;
					break;
				}
				rd=data.readLine();
			}
			data.close();
		}
		log(fd+"\n"+notpres+"\n"+b);
		response.getWriter().write(Boolean.toString(notpres));
	}
}
