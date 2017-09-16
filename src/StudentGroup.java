import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students == null){  
          throw new IllegalArgumentException();
          }  
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		else if(students == null){  
          throw new IllegalArgumentException();
        } 
        else{
        	students[index] = student;
        }
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students == null){  
          throw new IllegalArgumentException();
        }
        else{	
        		int index=0;
		       	for(int i=0; i< students.length; i++) {

		        if (i == index){

		            for (int j = students.length; j >= index; j-- ){
		                students[j]= students[j-1];
		            }

		            students[index]=student;
		        }

    			}
        }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students == null){  
          throw new IllegalArgumentException();
        }else {
        	int n=students.length;
        	students[n+1]=student;
        } 
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		else if(students == null){  
          throw new IllegalArgumentException();
        } 
        else{
	        for(int i=0; i< students.length; i++) {

	        if (i == index){

	            for (int j = students.length; j >= index; j-- ){
	                students[j]= students[j-1];
	            }

	            students[index]=student;
	        }

    		}
        }
	}

	@Override
	public void remove(int index) {
		if(index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		else if(students == null){  
          throw new IllegalArgumentException();
        } 
        else{
	        for(int i=0; i< students.length; i++) {

	        if (i == index){

	            for (int j = i; j < students.length; j++ ){
	                	students[j]= students[j+1];
	            }
	            students[students.length]=null;
	            return;
	        }

	    	}
        }
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(students == null){  
          throw new IllegalArgumentException();
      }else{
      		for(int i=0; i< students.length; i++) {

	        if (students[i] == student){

	            for (int j = i; j < students.length; j++ ){
	                students[j]= students[j+1];
	            }
	            students[students.length]=null;
	            return;
	        }

    		}
    		throw new IllegalArgumentException("Student not exist");
      }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		else{
			for(int i=0;i<students.length;i++){
				if(i==index){
					for(int j=i+1;j<students.length;j++){
						students[j]=null;
					}
				}
			}
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(students == null){  
          throw new IllegalArgumentException();
        }else{
        	for(int i=0;i<students.length;i++){
				if(students[i]==student){
					for(int j=i+1;j<students.length;j++){
						students[j]=null;
					}
				}
			}

        }

	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(students == null){  
          throw new IllegalArgumentException();
        }else{
        	for(int i=0;i<students.length;i++){
        		students[i]=null;
        		if(i==index){
        			return;
        		}
        	}
        }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(students == null){  
          throw new IllegalArgumentException();
        }else{
        	for(int i=0;i<students.length;i++){
        		students[i]=null;
        		if(students[i]==student){
        			return;
        		}
        	}
        }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		/*boolean swapped = true;
	    while (swapped) {
	       swapped = false;
	       for(int i=1; i<students.length; i++) {
	           int temp=0;
	           if((students[i-1]) > (students[i])) {
	               temp = students[i-1];
	                students[i-1] = students[i];
	                students[i] = temp;
	                swapped = true;
	            }
	        }
	    }*/
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null){
			throw new IllegalArgumentException();
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==null){
			throw new IllegalArgumentException();
		}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
