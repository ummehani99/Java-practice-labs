public class Matrix2x2{
    int a,b,c,d;

//parametrised constructor
public Matrix2x2(int a,int b,int c,int d){
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;

}
public void displayMatrix() {
        System.out.println("| " + a + "  " + b + " |");
        System.out.println("| " + c + "  " + d + " |");
}
public Matrix2x2 add(Matrix2x2 m) {
        return new Matrix2x2(a+m.a, b+m.b, c+m.c, d+m.d);
    }
    public static void main(String[] args) {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(5, 6, 7, 8);

        System.out.println("Matrix 1:");
        m1.displayMatrix();

        System.out.println("Matrix 2:");
        m2.displayMatrix();

        Matrix2x2 m3 = m1.add(m2);
        System.out.println("Result:");
        m3.displayMatrix();
    }
}
