package menu;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;
class students{
	int numb;
	String name;
}
public class menu {
	public static void main(String[] args) {
		students stu1=new students();
		students stu2=new students();
		stu1.numb=1;
		stu1.name="wang";
		stu2.numb=2;
		stu2.name="zhang";
		System.out.println("|1.增加1个学生|"+"\n|2.显示所有学生|"+"\n|3.退出程序|"+"\n|请输入选择（1-3）:");
		Scanner in=new Scanner(System.in);
		int nume=in.nextInt();
		if(nume==1)
		    {
			students stu3=new students();
		    stu3.numb=3;
		    stu3.name="zhao";
		    }
		if(nume==2)
			System.out.println("student 1 ="+stu1.name+" "+stu1.numb+"\nstudent 2 ="+stu2.name+" "+stu2.numb);
		if(nume==3)
			System.exit(0);
			
		
	}

}
