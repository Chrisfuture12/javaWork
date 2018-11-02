package complexnumber;

class FPF2 {
  int real;
  int imaginary;

FPF2(int real, int imaginary){
  this.real = real;
  this.imaginary = imaginary;
}

FPF2(){
  real = 0;
  imaginary=0;
}

void setReal(int real){
  this.real = real
}

 int getReal(){
   return real;
 }

 void setImaginary(){
   this.imaginary = imaginary;
 }

*int setImaginary(){

}

void add(FPF2 c11, FPF2 c22){
  real = c11.real++c22.real;
  imaginary =c11.imaginary+c22.imaginary;
}
 void subtract(FPF2 c11, FPF2 c22){
   real = c11.real++c22.real;
   imaginary =c11.imaginary+c22.imaginary;
}

void display()
{
  if (imaginary > 0 ){
    System.out.println(real+"+"+imaginary+"i");
  } else {
    System.out.println(real+""+imaginary+"i");
  }
}
public static void main(String[] args) {
  int n11 = Integer.parseInt(Args[0]);
  int n22 = Integer.parseInt(Args[1]);
  int n33 = Integer.parseInt(Args[2]);
  int n44 = Integer.parseInt(Args[3]);


  FPF2 c11 = new FPF2(n1,n2);
  FPF2 c22 = new FPF2(n3,n4);
  FPF2 c33 = new FPF2();

c11.display();
c22.display();

}

}
