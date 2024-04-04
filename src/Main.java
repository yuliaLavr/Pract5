import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Завдання1:
        String s1,s2,s3,s4,s5,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 5 слів: ");
        s1=sc.next();
        s2=sc.next();
        s3=sc.next();
        s4=sc.next();
        s5=sc.next();
        r=s1.concat(" ").concat(" ").concat(s2).concat(" ").concat(s3).concat(" ").concat(s4).concat(" ").concat(s5);
        System.out.println(r);

        //Завдання2:
        String w1,w2,w3,w4,w5,l;
        Scanner wf = new Scanner(System.in);
        System.out.println("Введіть 5 слів: ");
        w1=wf.next();
        w2=wf.next();
        w3=wf.next();
        w4=wf.next();
        w5=wf.next();
        l=w1.substring(0,1)+w2.substring(0,1)+w3.substring(0,1)+w4.substring(0,1)+w5.substring(0,1);
        System.out.println(l);

        //Завданн3:
        double a,b,c,maxN;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введіть перше дроб. число: ");
        if (sc1.hasNextDouble()){
            a=sc1.nextDouble();
            System.out.println("Введіть друге дроб. число: ");
            if (sc1.hasNextDouble()) {
                b = sc1.nextDouble();
                System.out.println("Введіть третє дроб. число: ");
                if (sc1.hasNextDouble()) {
                    c = sc1.nextDouble();
                    maxN=a;
                    if (b > maxN) {
                        maxN = b;
                    }if (c > maxN) {
                        maxN = c;
                    }
                    System.out.println("Максимальне число " + maxN);
                } else {
                    System.out.println("Ви ввели не дроб. число");
                }
            }else{
                System.out.println("Ви ввели не дроб. число");
            }
        }else{
            System.out.println("Ви ввели не дроб. число");
        }

        //Завданн4:
        String n1,n2;
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть перше імя ");
        n1=s.nextLine();
        System.out.println("Введіть друге імя ");
        n2=s.nextLine();
        if(n1.equalsIgnoreCase(n2)){
            System.out.println("Імена ідентичні");
        }else{
            System.out.println("Імена не ідентичні");
        }





    }
}