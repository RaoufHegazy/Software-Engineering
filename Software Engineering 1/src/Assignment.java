public class Assignment {
private double mark=-1;
Assignment(int m) {
this.mark=m;}
public double getMark() throws NotYetSetException {
if (mark==-1) {
throw new
NotYetSetException("Mark is not yet set");
}
return mark;
}
}