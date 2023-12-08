import java.util.Scanner;


public class  Grades {

    public int getPoint(String grade){
        int point =0;
        switch(grade){
            case"A": point = 5;
            break;
            case "B": point = 4;
            break;
             case "C": point = 3;
            break;
             case "D": point = 2;
            break;
             case "E": point = 1;
            break;
            case "F": point = 0;
            break; 
        }
        return point;
           
    }
    
    
    public String getGrade(double score){
        String grade ="";
        if(score>= 70 && score <= 100){
         grade ="A";
        }
        
        else if(score>= 60 && score < 70){
         grade ="B";
        }
         
         else if(score>= 50 && score < 60){
         grade ="C";
        }
          
          else if(score>= 45 && score < 50){
         grade ="D";
        }
           
           else if(score>= 40 && score < 45){
         grade ="E";
        }
           else {
               grade = "F";
           }
            return grade;
    }
    
    
public static void main(String[] args) {
    System.out.println("SIMPLE GRADING SYSTEM");
            
Scanner i = new Scanner(System.in);

System.out.println("Enter course");
String course1 = i.nextLine();
System.out.println("Enter " + course1 + " course unit");
int course1unit = i.nextInt();
System.out.println("Enter " + course1 + " course score");
int course1score = i.nextInt();
i.nextLine();


System.out.println("Enter course");
String course2 = i.nextLine();
System.out.println("Enter " + course2 + " course unit");
int course2unit = i.nextInt();
System.out.println("Enter " + course2 + " course score");
int course2score = i.nextInt();
i.nextLine();

System.out.println("Enter course");
String course3 = i.nextLine();
System.out.println("Enter " + course3 + " course unit");
int course3unit = i.nextInt();
System.out.println("Enter " + course3 + " course score");
int course3score = i.nextInt();
i.nextLine();


System.out.println("Enter course");
String course4 = i.nextLine();
System.out.println("Enter " + course4 + " course unit");
int course4unit = i.nextInt();
System.out.println("Enter " + course4 + " course score");
int course4score = i.nextInt();
i.nextLine();


System.out.println("Enter course");
String course5 = i.nextLine();
System.out.println("Enter " + course5 + " course unit");
int course5unit = i.nextInt();
System.out.println("Enter " + course5 + " course score");
int course5score = i.nextInt();
i.nextLine();


Grades st = new Grades();

String grade1 = st.getGrade(course1score);
String grade2 = st.getGrade(course2score);
String grade3 = st.getGrade(course3score);
String grade4 = st.getGrade(course4score);
String grade5 = st.getGrade(course5score);

int point1 = st.getPoint(grade1);
int point2 = st.getPoint(grade2);
int point3 = st.getPoint(grade3);
int point4 = st.getPoint(grade4);
int point5 = st.getPoint(grade5);


int totalGradeUnit = course1unit + course2unit + course3unit + course4unit + course5unit;
// double qualityPoint = (((point1 * course1unit) + (point2 * course2unit)  + (point3 * course3unit) 
//         + (point4 * course4unit) +(point5 * course5unit))/ totalGradeUnit);
double qua1 = (point1 * course1unit);
double qua2 = (point2 * course2unit); 
double qua3 = (point3 * course3unit); 
double qua4 = (point4 * course4unit); 
double qua5 = (point5 * course5unit); 
double qualityPoint = qua1 + qua2 + qua3 + qua4 + qua5;

double cgpa = qualityPoint/totalGradeUnit;


System.out.println("|------------|---------------|------------|-----------------|" );
System.out.println("COURSE CODE -|-COURSE UNIT --|----GRADE---|---GRADE UNIT----|" );
System.out.println("|------------|---------------|------------|-----------------|" );
System.out.println( "| " + course1 + "    | " + course1unit + "               |" + grade1 + "       |    " + point1 + "        |" );
System.out.println( "| " + course2 +         "    | " + course2unit + "               |" + grade2 + "       |    " + point2 + "        |" );
System.out.println( "| " + course3 +   "    | " + course3unit + "               |" + grade3 + "       |    " + point3 + "        |" );
System.out.println( "| " + course4 +         "    | " + course4unit + "               |" + grade4 + "       |    " + point4 + "        |" );
System.out.println( "| " + course5 +   "    | " + course5unit + "               |" + grade5 + "       |    " + point5 + "        |" );
System.out.println( "Your CGPA is " + cgpa);

}

}
    

  