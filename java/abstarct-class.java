// abstract class Language {
//     // ABSTRACT METHOD 
//     abstract void method1();

//     void method2(){
//         System.out.println("This is regular method");
//     }
// }


abstract class Language {
    public void display() {
        System.out.println("This is Java Programming");
    }
}

class Python extends Language {
     public void display_lang(){
         System.out.println("Hi! There I am Python");
     }
}

class Main{
    public static void main(String[] args) {
        Python py = new Python();
        //py.display();
        py.display();
        
    }
}