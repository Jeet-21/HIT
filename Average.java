package Lab2;
class Average {
public static void main(String args[]) {
int n=args.length;
float [] x=new float[n];
 for(int i=0; i<n; i++) {
 x[i]=Float.parseFloat( args[i]);
 }
 float sum=0;
for(int i=0; i<n; i++)
 sum=sum+x[i];
 float average=sum/n;
 System.out.println("Average: "+average);
 }
}