package school;
import java.util.Date;

import shcool.dao.StudentService;
import shcool.dto.Student;

public class TestMain {

	
	public static void main(String[] args) {
		//Student item  = new Student(3,"ȫ�α�","hdk@test.co.kr",new Date()); // �Է±��� �׽�Ʈ
		
		StudentService.getInstance().deleteItem(3);;
		
		
		
	}
}
