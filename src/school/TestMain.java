package school;
import java.util.Date;

import shcool.dao.StudentService;
import shcool.dto.Student;

public class TestMain {

	
	public static void main(String[] args) {
		//Student item  = new Student(3,"È«µÎ±ú","hdk@test.co.kr",new Date()); // ÀÔ·Â±¸ºÐ Å×½ºÆ®
		
		StudentService.getInstance().deleteItem(3);;
		
		
		
	}
}
