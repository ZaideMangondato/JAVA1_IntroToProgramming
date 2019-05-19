import java.util.*;
public class JavaConsole {
    public static void main(String args[]){
        System.out.println("MCC - Mangondato Computer Corporation\n\nOperating System:  Java Code Operating System\nPowered by:        Java Programming Language");
        System.out.println("Created by:        Zaide A. Mangondato\n");
        System.out.println("March 2004\nAll Rights Reserved");
        System.out.println();
        proceed();
    }
    public static void proceed(){
        String response;
        String start_up = "start";
        String exit_mode = "exit";
        String hint_mode = "hint";
        String author_mode = "zaide";
        Scanner input = new Scanner(System.in);
        System.out.print("Java - COS:/> ");
        response = input.nextLine();
        if(response.equals(start_up)){
            startConsole();
        }
        else if(response.equals(exit_mode)){
            System.out.println("Java - COS Shutdown. . . . .");
            System.exit(0);
        }
        else if(response.equals(hint_mode)){
            System.out.println("Hints: this will help you to access our operating system\ncommands:\n    'start' command used to proceed to access applications\n    'exit' command used to exit the operating system\n    'zaide' command used to view the author/creator of this operating system, also include the his personal information");
            proceed();
        }
        else if(response.equals(author_mode)){
            author();
        }
        else{
            System.out.println("'--Command Unsuccessful--'");
            proceed();
        }
    }
    public static void startConsole(){
        String response;
        String calc_app = "calculator";
        String version_show = "version";
        String exit_mode = "exit";
        Scanner input = new Scanner(System.in);
        //System.out.println("------------------------Java_Code Operating System_Application--------------------------------------------");
        System.out.print("JComputerApps:/> ");
        response = input.nextLine();
        if(response.equals(calc_app)){
            calculator();
        }
        else if(response.equals(exit_mode)){
            proceed();
        }
        else if(response.equals(version_show)){
            version();
        }
        else{
            System.out.println("'--Command Unsuccessful--'");
            startConsole(); 
        }
    }
    public static void calculator(){
            String response;
            Scanner input = new Scanner(System.in);
            String add_mode = "addition";
            String sub_mode = "subtraction";
            String mul_mode = "multiplication";
            String div_mode = "division";
            String exit_mode = "exit";
            System.out.print("Calculator:/> ");
            response = input.nextLine();
            if(response.equals(add_mode)){
                int a;
                int b;
                int result;
                try{
                    System.out.print("Addition_1st#:/> ");
                    a = input.nextInt();
                    System.out.print("Addition_2nd#:/> ");
                    b = input.nextInt();
                    result = a + b;
                    System.out.print("Addition_Answer:/> " + result + "\n");
                }
                catch(ArithmeticException mistake){
                    System.out.println(mistake.getMessage());
                }
                catch(InputMismatchException mistake){
                    System.out.println("'---Computation Unsuccessful---'");
                    calculator();
                }
            }
            else if(response.equals(sub_mode)){
                int a;
                int b;
                int result;
                try{
                    System.out.print("Subtraction_1st#:/> ");
                    a = input.nextInt();
                    System.out.print("Subtraction_2nd#:/> ");
                    b = input.nextInt();
                    result = a - b;
                    System.out.print("Subtraction_Answer:/> " + result + "\n");
                }
                catch(ArithmeticException mistake){
                    System.out.println(mistake.getMessage());
                }
                catch(InputMismatchException mistake){
                    System.out.println("'---Computation Unsuccessful---'");
                    calculator();
                }
            }
            else if(response.equals(mul_mode)){
                int a;
                int b;
                int result;
                try{
                    System.out.print("Multiplication_1st#:/> ");
                    a = input.nextInt();
                    System.out.print("Multiplication_2nd#:/> ");
                    b = input.nextInt();
                    result = a * b;
                    System.out.print("Multiplication_Answer:/> " + result + "\n");
                }
                catch(ArithmeticException mistake){
                    System.out.println(mistake.getMessage());
                }
                catch(InputMismatchException mistake){
                    System.out.println("'---Computation Unsuccessful---'");
                    calculator();
                }
            }
            else if(response.equals(div_mode)){
                int a;
                int b;
                int result;
                try{
                    System.out.print("Division_1st#:/> ");
                    a = input.nextInt();
                    System.out.print("Division_2nd#:/> ");
                    b = input.nextInt();
                    result = a / b;
                    System.out.print("Division_Answer:/> " + result + "\n");
                }
                catch(ArithmeticException mistake){
                    System.out.println(mistake.getMessage());
                }
                catch(InputMismatchException mistake){
                    System.out.println("'---Computation Unsuccessful---'");
                    calculator();
                }
            }
            else if(response.equals(exit_mode)){
                startConsole();
            }
            else
                System.out.println("'--Command Unsuccessful--'");
                calculator();
                   
    }
    public static void version(){
        System.out.println("MCC - Mangondato Computer Corporation\nJava Code Operating System\nVersion 1.0\n");
        startConsole();
    }
    public static void author(){
        System.out.println("Author, Publisher, Creator and Founder:\nZaide A. Mangondato\nLived in Kalilangan Bukidnon");
        proceed();
    }
}

