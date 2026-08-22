package com.springcore.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.orm.dao.StudentDao;
import com.springcore.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Welcome to Spring ORM Project..");

		boolean isRunning = true;

		while (isRunning) {

			System.out.println("PRESS 1 - Add Student");
			System.out.println("PRESS 2 - Display All");
			System.out.println("PRESS 3 - Get Detail of Student");
			System.out.println("PRESS 4 - Remove Student");
			System.out.println("PRESS 5 - Update Student Details");
			System.out.println("PRESS 6 - Exit");

			try {

				int userInput = Integer.parseInt(br.readLine());
				switch (userInput) {
				case 1:
					System.out.println("Enter Student ID : ");
					int studentId = Integer.parseInt(br.readLine());

					System.out.println("Enter Student Name : ");
					String studentName = br.readLine();

					System.out.println("Enter Student City : ");
					String studentCity = br.readLine();

					Student s = new Student();
					s.setStudentId(studentId);
					s.setStudentName(studentName);
					s.setStudentCity(studentCity);
					String result = studentDao.insert(s);
					System.out.println(result);
					System.out.println("********************************");
					break;
				case 2:

					List<Student> students = studentDao.getAllStudents();
					for (Student st : students) {
						System.out.println("Id : " + st.getStudentId());
						System.out.println("Name : " + st.getStudentName());
						System.out.println("City : " + st.getStudentCity());
						System.out.println("********************************");
					}

					break;
				case 3:
					System.out.println("Enter Student ID : ");
					int userInputId = Integer.parseInt(br.readLine());

					Student stGot = studentDao.getStudent(userInputId);
					System.out.println("********************************");
					System.out.println("Id : " + stGot.getStudentId());
					System.out.println("Name : " + stGot.getStudentName());
					System.out.println("City : " + stGot.getStudentCity());
					System.out.println("********************************");

					break;
				case 4:
					System.out.println("Enter Student ID : ");
					int userDelId = Integer.parseInt(br.readLine());
					
					studentDao.deleteStudent(userDelId);
					System.out.println("Student Info deleted successfully..!!");

					break;
				case 5:
					System.out.println("Enter Student ID : ");
					int userUpdateId = Integer.parseInt(br.readLine());
					
					System.out.println("Old Details : ");
					Student stGotOld = studentDao.getStudent(userUpdateId);
					System.out.println("********************************");
					System.out.println("Id : " + stGotOld.getStudentId());
					System.out.println("Name : " + stGotOld.getStudentName());
					System.out.println("City : " + stGotOld.getStudentCity());
					System.out.println("********************************");
					
					System.out.println("Enter Student Name : ");
					String studentNameUpdated = br.readLine();

					System.out.println("Enter Student City : ");
					String studentCityUpdated = br.readLine();
					
					Student sUpdated = new Student();
					sUpdated.setStudentId(userUpdateId);
					sUpdated.setStudentName(studentNameUpdated);
					sUpdated.setStudentCity(studentCityUpdated);
					studentDao.updateStudent(sUpdated);
					System.out.println("Student info updated successfully..!!");
					System.out.println("********************************");
					

					break;
				case 6:
					isRunning = false;
					break;
				}

			} catch (Exception e) {
				System.out.println("Invalid user input.. Try Again!");
				System.out.println(e.getMessage());

			}

		}

		System.out.println("Application Closed...!");

	}
}
