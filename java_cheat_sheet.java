import java.util.*;


class java_cheat_sheet {
    
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        greet();
        System.out.println("What do you want to review?");
        System.out.println("Basics or Advanced?");

        ArrayList<String> basics = new ArrayList<>();
        basics.add("1-Variables");
        basics.add("2-Operators and Arithmetic");
        basics.add("3-Strings and Arrays");
        basics.add("4-if/else and switch");
        basics.add("5-loops");
        basics.add("6-Input and Output");

        ArrayList<String> advanced = new ArrayList<>();
        advanced.add("1-Methods");
        advanced.add("2-Class and Objects");
        advanced.add("3-Inheritance");
        advanced.add("4-Interface");
        advanced.add("5-Exception handling");
        advanced.add("6-GUI");

       

        String option = sc.nextLine();
        int n = -1; 
        int m = -1;

        if (option.equalsIgnoreCase("basics")) {
            for (int i = 0; i < basics.size(); i++) {
                System.out.println(basics.get(i));
            }
            System.out.println("Enter the option number: ");
            n = sc.nextInt();

            switch (n) {
    case 1:
        System.out.println("Reviewing Variables...");
        System.out.println(
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        int x = 10;\n" +
            "        double y = 5.5;\n" +
            "        String name = \"Alice\";\n" +
            "        System.out.println(x + \", \" + y + \", \" + name);\n" +
            "    }\n" +
            "}"
        );
        break;

    case 2:
        System.out.println("Reviewing Operators...");
        System.out.println(
            "Arithmetic: +  -  *  /  %\n" +
            "Assignment: =  +=  -=  *=  /=  %=\n" +
            "Comparison: ==  !=  >  <  >=  <=\n" +
            "Logical: &&  ||  !\n" +
            "Increment/Decrement: ++  --\n\n" +
            "Example:\n" +
            "int a = 5, b = 2;\n" +
            "System.out.println(a + b); // 7\n" +
            "System.out.println(a > b); // true\n"
        );
        break;

    case 3:
        System.out.println("Reviewing Strings and Arrays...");
        System.out.println(
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        String s = \"Hello\";\n" +
            "        System.out.println(s.toUpperCase());\n\n" +
            "        int[] arr = {1, 2, 3};\n" +
            "        for (int num : arr) {\n" +
            "            System.out.print(num + \" \");\n" +
            "        }\n" +
            "    }\n" +
            "}"
        );
        break;

    case 4:
        System.out.println("Reviewing If/Else and Switch...");
        System.out.println(
            "int x = 5;\n" +
            "if (x > 0) {\n" +
            "    System.out.println(\"Positive\");\n" +
            "} else {\n" +
            "    System.out.println(\"Non-positive\");\n" +
            "}\n\n" +
            "switch (x) {\n" +
            "    case 1: System.out.println(\"One\"); break;\n" +
            "    case 5: System.out.println(\"Five\"); break;\n" +
            "    default: System.out.println(\"Other\");\n" +
            "}"
        );
        break;

    case 5:
        System.out.println("Reviewing Loops...");
        System.out.println(
            "for (int i = 0; i < 5; i++) {\n" +
            "    System.out.println(\"For loop: \" + i);\n" +
            "}\n\n" +
            "int j = 0;\n" +
            "while (j < 5) {\n" +
            "    System.out.println(\"While loop: \" + j);\n" +
            "    j++;\n" +
            "}"
        );
        break;

    case 6:
        System.out.println("Reviewing Input and Output...");
        System.out.println(
            "import java.util.Scanner;\n" +
            "Scanner sc = new Scanner(System.in);\n" +
            "int num = sc.nextInt();\n" +
            "String str = sc.nextLine();\n" +
            "System.out.println(\"Hello\");\n" +
            "System.out.print(\"World\");"
        );
        break;

    default:
        System.out.println("Invalid option number!");
}

        } else if (option.equalsIgnoreCase("advanced")) {
            for (int i = 0; i < advanced.size(); i++) {
                System.out.println(advanced.get(i));
            }
            System.out.println("Enter the option number: ");
            m = sc.nextInt();

            switch (m) {
    case 1:
        System.out.println("Reviewing Methods...");
        System.out.println(
            "public class Demo {\n" +
            "    // Method definition\n" +
            "    public static void greet() {\n" +
            "        System.out.println(\"Hello from a method!\");\n" +
            "    }\n\n" +
            "    public static void main(String[] args) {\n" +
            "        greet(); // Method call\n" +
            "    }\n" +
            "}"
        );
        break;

    case 2:
        System.out.println("Reviewing Class and Objects...");
        System.out.println(
            "class Car {\n" +
            "    String model;\n\n" +
            "    Car(String m) {\n" +
            "        model = m;\n" +
            "    }\n\n" +
            "    void display() {\n" +
            "        System.out.println(\"Car model: \" + model);\n" +
            "    }\n" +
            "}\n\n" +
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        Car c = new Car(\"Tesla\");\n" +
            "        c.display();\n" +
            "    }\n" +
            "}"
        );
        break;

    case 3:
        System.out.println("Reviewing Inheritance...");
        System.out.println(
            "class Animal {\n" +
            "    void eat() { System.out.println(\"Eating...\"); }\n" +
            "}\n\n" +
            "class Dog extends Animal {\n" +
            "    void bark() { System.out.println(\"Barking...\"); }\n" +
            "}\n\n" +
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        Dog d = new Dog();\n" +
            "        d.eat();\n" +
            "        d.bark();\n" +
            "    }\n" +
            "}"
        );
        break;

    case 4:
        System.out.println("Reviewing Interface...");
        System.out.println(
            "interface Shape {\n" +
            "    void draw();\n" +
            "}\n\n" +
            "class Circle implements Shape {\n" +
            "    public void draw() { System.out.println(\"Drawing Circle\"); }\n" +
            "}\n\n" +
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        Shape s = new Circle();\n" +
            "        s.draw();\n" +
            "    }\n" +
            "}"
        );
        break;

    case 5:
        System.out.println("Reviewing Exception Handling...");
        System.out.println(
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        try {\n" +
            "            int a = 10 / 0;\n" +
            "        } catch (ArithmeticException e) {\n" +
            "            System.out.println(\"Error: \" + e.getMessage());\n" +
            "        }\n" +
            "    }\n" +
            "}"
        );
        break;

    case 6:
        System.out.println("Reviewing GUI...");
        System.out.println(
            "import javax.swing.*;\n\n" +
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        JFrame frame = new JFrame(\"Simple GUI\");\n" +
            "        JButton btn = new JButton(\"Click Me\");\n" +
            "        frame.add(btn);\n" +
            "        frame.setSize(300, 200);\n" +
            "        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n" +
            "        frame.setVisible(true);\n" +
            "    }\n" +
            "}"
        );
        break;

    default:
        System.out.println("Invalid option number!");
}


switch (n) {
    case 1:
        System.out.println("Reviewing Variables...");
        System.out.println(
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        int x = 10;\n" +
            "        double y = 5.5;\n" +
            "        String name = \"Alice\";\n" +
            "        System.out.println(x + \", \" + y + \", \" + name);\n" +
            "    }\n" +
            "}"
        );
        break;

    case 2:
        System.out.println("Reviewing Operators...");
        System.out.println(
            "Arithmetic: +  -  *  /  %\n" +
            "Assignment: =  +=  -=  *=  /=  %=\n" +
            "Comparison: ==  !=  >  <  >=  <=\n" +
            "Logical: &&  ||  !\n" +
            "Increment/Decrement: ++  --\n\n" +
            "Example:\n" +
            "int a = 5, b = 2;\n" +
            "System.out.println(a + b); // 7\n" +
            "System.out.println(a > b); // true\n"
        );
        break;

    case 3:
        System.out.println("Reviewing Strings and Arrays...");
        System.out.println(
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        String s = \"Hello\";\n" +
            "        System.out.println(s.toUpperCase());\n\n" +
            "        int[] arr = {1, 2, 3};\n" +
            "        for (int num : arr) {\n" +
            "            System.out.print(num + \" \");\n" +
            "        }\n" +
            "    }\n" +
            "}"
        );
        break;

    case 4:
        System.out.println("Reviewing If/Else and Switch...");
        System.out.println(
            "int x = 5;\n" +
            "if (x > 0) {\n" +
            "    System.out.println(\"Positive\");\n" +
            "} else {\n" +
            "    System.out.println(\"Non-positive\");\n" +
            "}\n\n" +
            "switch (x) {\n" +
            "    case 1: System.out.println(\"One\"); break;\n" +
            "    case 5: System.out.println(\"Five\"); break;\n" +
            "    default: System.out.println(\"Other\");\n" +
            "}"
        );
        break;

    case 5:
        System.out.println("Reviewing Loops...");
        System.out.println(
            "for (int i = 0; i < 5; i++) {\n" +
            "    System.out.println(\"For loop: \" + i);\n" +
            "}\n\n" +
            "int j = 0;\n" +
            "while (j < 5) {\n" +
            "    System.out.println(\"While loop: \" + j);\n" +
            "    j++;\n" +
            "}"
        );
        break;

    case 6:
        System.out.println("Reviewing Input and Output...");
        System.out.println(
            "import java.util.Scanner;\n" +
            "Scanner sc = new Scanner(System.in);\n" +
            "int num = sc.nextInt();\n" +
            "String str = sc.nextLine();\n" +
            "System.out.println(\"Hello\");\n" +
            "System.out.print(\"World\");"
        );
        break;

    default:
        System.out.println("Invalid option number!");
}
        } else {
            System.out.println("No such option available");
        }
        sc.close();
}

public static void greet (){
    sc.nextLine();
    System.out.println("Hello. What's your name? ");
    String name= sc.nextLine();
    System.out.println("Nice to meet you "+ name);
}
}
 //more in java_calculator (advanced topics)