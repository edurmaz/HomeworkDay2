import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		teacher1.id = 11;
		teacher1.name = "Engin";

		Teacher teacher2 = new Teacher(22, "Emre", "�al��kan ");
		Teacher teacher3 = new Teacher(33, "Taner", "s�per");

		Teacher[] teachers = { teacher1, teacher2 };
		for (Teacher teacher : teachers) {
			System.out.println(teacher.id + teacher.name + teacher.student + "T�m ��retmenler listelendi");
		}

		TeacherManager teacherManager = new TeacherManager();
		teacherManager.teacherAdd(teacher2);
		teacherManager.teacherDelete(teacher1);
		teacherManager.teacherUpdate(teacher3);

	}

}