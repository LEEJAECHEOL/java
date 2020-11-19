package ch04;
class Job {
	String name = "";
	String getName() {
		return "";
	}
}
class Police extends Job {
	String name = "경찰";
	String getName() {
		return name;
	}
	
}
class Doctor extends Job {
	String name ="의사";
	String getName() {
		return name;
	}
}

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job[] jobs = { new Police(), new Doctor()};
		
		System.out.println(jobs[0].getName());
		System.out.println(jobs[1].getName());
	}

}
