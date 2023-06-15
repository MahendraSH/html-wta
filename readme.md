# pro1.java

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter name salary id and age");
        StringTokenizer  token = new StringTokenizer(cin.readLine(), " ");
        String name = token.nextToken();
        float salary = Float.parseFloat(token.nextToken());
        int id = Integer.parseInt(token.nextToken());
        int age = Integer.parseInt(token.nextToken());
        System.out.println("Name: "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Id : "+id  );
        System.out.println("Age :"+age);
    }
}

```

---

# pro2.java

```java
import java.util.Scanner;

class Student{
    int usn;
    String name;
    String branch;
    String phone;
    Student(int usn,String name,String branch,String phone){
        this.usn=usn;
        this.name=name;
        this.branch=branch;
        this.phone=phone;
    }
    void display(){
        System.out.println("usn : "+usn + " name: "+name+" branch: "+branch+" phone: "+phone);
    }



}
public class pro2{
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        System.out.println("Enter the number of students");
        Student []s = new Student[cin.nextInt()];
        System.out.println("Enter students details ");
        for(int i=0;i<s.length;i++){
            s[i]=new Student(cin.nextInt(),cin.next(),cin.next(),cin.next());

        }
        System.out.println("students details : ");
        for (int i=0;i<s.length;i++)
        {
            s[i].display();
        }
        cin.close();
    }
}

```

---

# pro3.java

```java
class One {
    One(){
        System.out.println("One");
    }

}
class Two extends One{
    Two(){
        super();
        System.out.println("Two");
    }

}
class Three extends Two{
    Three(){
        super();
        System.out.println("Three");
    }

}

public class pro3{
    public static void main(String[] args) {
        Two two = new Two();
        Three three = new Three();

    }
}

```

---

# pro4.java

```java
class One{
    final int n =10;
    One( ){
        System.out.println("One");
    }
   void display(){
        System.out.println("display One : "+n);
   }
}
class Two extends One{
     Two (){
        super();
        System.out.println("two");

     }
     void display(){
        System.out.println("display Three  square : "+(n*n));
    }

}

class Three extends One{
    Three(){
        super();
        System.out.println("three");
    }

    void display(){
        System.out.println("display Three  cube : "+(n*n*n));
    }

}


class pro4{
    public static void main(String[] args) {
        Two t = new Two();
        t.display();
        Three t1 = new Three();
        t1.display();
    }
}


```

---

# pro5.java

```java
interface One{
  public void  add(int a ,int b);
}
interface two{
  public  void sub(int a ,int b);
}

class three implements One,two{
    public void add(int a ,int b){
        System.out.println(a+b);
    }
    public void sub(int a ,int b){
        System.out.println(a-b);
    }
}
public class pro5{
    public static void main(String[] args) {
        three obj = new three();
        obj.add(10,20);
        obj.sub(10,20);

    }
}


```

---

# pro6.java

```java

```

# pro7.java

## folder stucture

```bash
└───pack1 --Add.java
    └───pack2 -- Sub.java
        └───pack3 --Cal.java

 --  pro7.java  - in root folder of project

```

## pack1 --Add.java

```java
package pack1;

public class Add {
    public void add ( int a ,int b){
        System.out.println(a+b);

    }

}


```

## pack2--sub.java

```java
package pack1.pack2;

public class Sub {
  public  void sub(int a,int b) {
        System.out.println(a-b);

    }
}


```

## pack3 --cal.java

```java
package pack1.pack2.pack3;

import pack1.*;
import pack1.pack2.*;

public class Cal {
    public void cal (int a, int b){
        Add add =new Add();
        Sub sub = new Sub();
        add.add(a,b);
        sub.sub(a,b);
    }


}


```

## pack3--pro7.java

```java

import pack1.pack2.pack3.Cal;

public class pro7 {
    public static void main(String[] args) {
        Cal c =new Cal();
        c.cal(20,10);

    }
}


```

# pro8.java

```java

```

# pro9.java

```java

```
