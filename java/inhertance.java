import javax.swing.plaf.synth.SynthEditorPaneUI;
import javax.swing.text.Style;

// class Animal {
//     public void eat(){
//         System.out.println("I can eat");
//     }

//     public void sleep() {
//         System.out.println("I can sleep");
//     }
// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println("I can bark");
//     }
// }




class Animal {
    public void displayInfo() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog");
    }
}




class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.displayInfo();
    }
}