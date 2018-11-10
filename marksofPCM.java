import java.lang.*;
import java.io.*;

class Student{
    int physics,chemistry,maths;
    public Student(int p,int c,int m){
        this.physics = p;
        this.chemistry = c;
        this.maths = m;
    }
}
class GFG{
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int students = sc.nextInt();
            Student[] s = new Student[students];
            for(int i=0;i<students;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int m = sc.nextInt();
                s[i] = new Student(p,c,m);
            }
            Arrays.sort(s, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.physics > o2.physics) return 1;
                    else if(o1.physics < o2.physics) return -1;
                    else{
                        if(o1.chemistry > o2.chemistry) return -1;
                        else if(o1.chemistry < o2.chemistry) return 1;
                        else {

                        }
                    }
                    return o1.maths-o2.maths;
                }

            });

            for(int i=0;i<students;i++){
                sb.append(s[i].physics).append(" ").append(s[i].chemistry).append(" ").append(s[i].maths).append("\n");
            }
        }
        System.out.print(sb);
    }
}