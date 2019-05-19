import java.util.*;
import javax.swing.JOptionPane;
public class MCCJavaCodeOperatingSystem {
    public static void main(String args[]){
        password();
    }
    public static void password(){
        String res;
	String rural_mode = "rural transit";
        String password_mode = "mangondato computer corporation";
        Scanner input = new Scanner(System.in);
        System.out.println("\nUser login\n");
        System.out.print("Password : ");
        res = input.nextLine();
        if(res.equals(password_mode)){
            main();
        }
	else if(res.equals(rural_mode)){
	    displayRuralTransitData();
	}
        else
            System.out.println("\nPassword is Incorrect---Please try again");
            password();
    }
    public static void main(){
        System.out.println("\n-------------------------------------");
        System.out.println("MCC - Mangondato Computer Corporation\n-------------------------------------\nOperating System:  Java Code Operating System\nPowered by:        Java Programming Language");
        System.out.println("Created by:        Zaide A. Mangondato\n");
        System.out.println("March 2004\nAll Rights Reserved");
        System.out.println();
        proceed();
    }
    public static void proceed(){
        String response;
        String re_fresh = "refresh";
        String re_boot = "reboot";
        String start_up = "programs";
        String exit_mode = "shutdown";
        String hint_mode = "show commands";
        String author_mode = "zaide";
        Scanner input = new Scanner(System.in);
        System.out.print("MCC-COS:/> ");
        response = input.nextLine();
        if(response.equals(start_up)){
            startConsole();
        }
        else if(response.equals(exit_mode)){
            System.out.println("Java - COS Shutdown. . . . .");
            System.exit(0);
        }
        else if(response.equals(hint_mode)){
            //System.out.println("Hints: this will help you to access our operating system\ncommands:\n    'start' command used to proceed to access applications\n    'shutdown' command used to exit the operating system\n    'zaide' command used to view the author/creator of this operating system, also include the his personal information\n    'reboot' command used to restart the operating System");
            System.out.println("Commands:\n");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("MCC-COS:/> Commands     MCC Programs:/> Commands    MCC Calculator:/> Commands\n");
            System.out.println("'programs'              'version'                   'addition'");
            System.out.println("'shutdown'              'calculator'                'subtraction'");
            System.out.println("'zaide'                 'random game'               'multiplication'");
            System.out.println("'show commands'         'exit'                      'division'");
            System.out.println("'refresh'               'switch RT mode'            'exit'");
            System.out.println("-------------------------------------------------------------------------\n");
            proceed();
        }
        else if(response.equals(author_mode)){
            author();
        }
        else if(response.equals(re_boot)){
            password();
        }
        else if(response.equals(re_fresh)){
            main();
        }
        else{
            //System.out.println("'--Command Unsuccessful--'");
            System.out.println("=================");
            System.out.println("Incorrect Command");
            System.out.println("-----------------");
            proceed();
        }
    }
    public static void startConsole(){
        String response;
        String dis_rural = "switch RT mode";
        String ran_game = "random game";
        String calc_app = "calculator";
        String version_show = "version";
        String exit_mode = "exit";
        Scanner input = new Scanner(System.in);
        //System.out.println("------------------------Java_Code Operating System_Application--------------------------------------------");
        System.out.print("MCC Programs:/> ");
        response = input.nextLine();
        if(response.equals(calc_app)){
            calculator();
        }
        else if(response.equals(dis_rural)){
            System.out.println("*****Rural Transit Routing Data*****");
            System.out.println("      _________________");
            System.out.println("     |_|_|_|_|_|_|_| |_|");
            System.out.println("      -----O--------O--\n");
            displayRuralTransitData();
        }
        else if(response.equals(exit_mode)){
            proceed();
        }
        else if(response.equals(version_show)){
            version();
        }
        else if(response.equals(ran_game)){
            randomGame();
        }
        else{
            //System.out.println("'--Command Unsuccessful--'");
            System.out.println("=================");
            System.out.println("Incorrect Command");
            System.out.println("-----------------");
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
            System.out.print("MCC Calculator:/> ");
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
                //System.out.println("=================");
                System.out.println("=================\nIncorrect Command\n-----------------");
                //System.out.println("-----------------");
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
    private static int yes;
    public static void randomGame(){
        int confirm;
        confirm = JOptionPane.showConfirmDialog(null,"Random Game\n\nMCC - Mangondato Computer Corporation\nPowered by: JAVA Code Operating System\n\nDow you want to play this game?");
        if(confirm == yes){
            startGame();
        }
        else{
            JOptionPane.showMessageDialog(null,"Bye Bye!");
            System.out.println("Game shutdown");
            startConsole();
        }
    }
    public static void startGame(){
        String response;
        int res;
        int ran = ((int)(Math.random() * 9)+1);
        try{
            response = JOptionPane.showInputDialog(null,"Instructions: Guess a number Properly\n\nEnter the number you guess from 0 to 9 >>");
            res = Integer.parseInt(response);
            if(res > ran){
                JOptionPane.showMessageDialog(null,"your guess: "+res+"\nCPU number: "+ran+"\n\nYour guess is too High");
                System.out.println("user guess too high\n");
                startGame();
            }
            else if(res < ran){
                JOptionPane.showMessageDialog(null,"your guess: "+res+"\nCPU number: "+ran+"\n\nYour guess is too Low");
                System.out.println("user guess too low\n");
                startGame();
            }
            else
                JOptionPane.showMessageDialog(null,"your guess: "+res+"\nCPU number: "+ran+"\n\nYou win");
                System.out.println("user guess match --- user WIN\n");
                startConsole();
        }
        
        catch(NumberFormatException mistake){
            JOptionPane.showMessageDialog(null,"Error Input");
            startGame();
        }
    }
    public static void displayRuralTransitData(){
        //Cagayan de Oro
        String cdo_man = "cagayan to manolo";
        String cdo_mal = "cagayan to malaybalay";
        String cdo_val = "cagayan to valencia";
        String cdo_mar = "cagayan to maramag";
        String cdo_pan = "cagayan to pangantucan";
        String cdo_kal = "cagayan to kalilangan";
        String cdo_wao = "cagayan to wao";
        //Manolo Fortich
        String man_cdo = "manolo to cagayan";
        String man_mal = "manolo to malaybalay";
        String man_val = "manolo to valencia";
        String man_mar = "manolo to maramag";
        String man_pan = "manolo to pangantucan";
        String man_kal = "manolo to kalilangan";
        String man_wao = "manolo to wao";
        //Malaybalay City
        String mal_cdo = "malaybalay to cagayan";         
        String mal_man = "malaybalay to manolo";
        String mal_val = "malaybalay to valencia";
        String mal_mar = "malaybalay to maramag";
        String mal_pan = "malaybalay to pangantucan";
        String mal_kal = "malaybalay to kalilangan";
        String mal_wao = "malaybalay to wao";
        //Valencia City
        String val_cdo = "valencia to cagayan";
        String val_man = "valencia to manolo";
        String val_mal = "valencia to malaybalay";
        String val_mar = "valencia to maramag";
        String val_pan = "valencia to pangantucan";
        String val_kal = "valencia to kalilangan";
        String val_wao = "valencia to wao";
        //Maramag
        String mar_cdo = "maramag to cagayan";
        String mar_man = "maramag to manolo";
        String mar_mal = "maramag to malaybalay";
        String mar_val = "maramag to valencia";
        String mar_pan = "maramag to pangantucan";
        String mar_kal = "maramag to kalilangan";
        String mar_wao = "maramag to wao";
        //Pangantucan
        String pan_cdo = "pangantucan to cagayan";
        String pan_man = "pangantucan to manolo";
        String pan_mal = "pangantucan to malaybalay";
        String pan_val = "pangantucan to valencia";
        String pan_mar = "pangantucan to maramag";
        String pan_kal = "pangantucan to kalilangan";
        String pan_wao = "pangantucan to wao";
        //Kalilangan
        String kal_cdo = "kalilangan to cagayan";
        String kal_man = "kalilangan to manolo";
        String kal_mal = "kalilangan to malaybalay";
        String kal_val = "kalilangan to valencia";
        String kal_mar = "kalilangan to maramag";
        String kal_pan = "kalilangan to pangantucan";
        String kal_wao = "kalilangan to wao";
        //Wao
        String wao_cdo = "wao to cagayan";
        String wao_man = "wao to manolo";
        String wao_mal = "wao to malaybalay";
        String wao_val = "wao to valencia";
        String wao_mar = "wao to maramag";
        String wao_pan = "wao to pangantucan";
        String wao_kal = "wao to kalilangan";
        
        String exit_mode = "exit";
        String show_route = "bus route";
        String response;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter_Bus Route:/> ");
        response = input.nextLine();
        //Cagayan de Oro--------------------------------------------------------------------------------------
        if(response.equals(cdo_man)){
            System.out.println("\nCagayan to Manolo\nRegular Fare: Php 30.00\nSP SC Fare: Php 25.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(cdo_mal)){
            System.out.println("\nCagayan to Malaybalay\nRegular Fare: Php 100.00\nSP SC Fare: Php 90.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(cdo_val)){
            System.out.println("\nCagayan to Valencia\nRegular Fare: Php 125.00\nSP SC Fare: Php 115.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(cdo_mar)){
            System.out.println("\nCagayan to Maramag\nRegular Fare: Php 150.00\nSP SC Fare: Php 140.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(cdo_pan)){
            System.out.println("\nCagayan to Pangantucan\nRegular Fare: Php 175.00\nSP SC Fare: Php 165.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(cdo_kal)){
            System.out.println("\nCagayan to Kalilangan\nRegular Fare: Php 200.00\nSP SC Fare: Php 190.00\n");
            displayRuralTransitData();
        }
         else if(response.equals(cdo_wao)){
            System.out.println("\nCagayan to Wao\nRegular Fare: Php 225.00\nSP SC Fare: Php 215.00\n");
            displayRuralTransitData();
        }
        //Manolo Fortich-------------------------------------------------------------------------------------
        else if(response.equals(man_cdo)){
            System.out.println("\nManolo to Cagayan\nRegular Fare: Php 30.00\nSP SC Fare: Php 20.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(man_mal)){
            System.out.println("\nManolo to Malaybalay\nRegular Fare: Php 70.00\nSP SC Fare: Php 60.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(man_val)){
            System.out.println("\nManolo to Valencia\nRegular Fare: Php 95.00\nSP SC Fare: Php 85.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(man_mar)){
            System.out.println("\nManolo to Maramag\nRegular Fare: Php 120.00\nSP SC Fare: Php 110.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(man_pan)){
            System.out.println("\nManolo to Pangantucan\nRegular Fare: Php 145.00\nSP SC Fare: Php 135.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(man_kal)){
            System.out.println("\nManolo to Kalilangan\nRegular Fare: Php 170.00\nSP SC Fare: Php 160.00\n");
            displayRuralTransitData();
        }
         else if(response.equals(man_wao)){
            System.out.println("\nManolo to Cagayan\nRegular Fare: Php 195.00\nSP SC Fare: Php 185.00\n");
            displayRuralTransitData();
         }
         //Malaybalay------------------------------------------------------------------------------------------
        else if(response.equals(mal_cdo)){
            System.out.println("\nMalaybalay to Cagayan\nRegular Fare: Php 100.00\nSP SC Fare: Php 90.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(mal_man)){
            System.out.println("\nMalaybalay to Manolo\nRegular Fare: Php 70.00\nSP SC Fare: Php 60.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(mal_val)){
            System.out.println("\nMalaybalay to valencia\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(mal_mar)){
            System.out.println("\nMalaybalay to Maramag\nRegular Fare: Php 50.00\nSP SC Fare: Php 40.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(mal_pan)){
            System.out.println("\nMalaybalay to Pangantucan\nRegular Fare: Php 75.00\nSP SC Fare: Php 65.00\n");
            displayRuralTransitData();
        }
        else if(response.equals(mal_kal)){
            System.out.println("\nMalaybalay to Kalilangan\nRegular Fare: Php 100.00\nSP SC Fare: Php 90.00\n");
            displayRuralTransitData();
        }
         else if(response.equals(mal_wao)){
            System.out.println("\nMalaybalay to Wao\nRegular Fare: Php 125.00\nSP SC Fare: Php 115.00\n");
            displayRuralTransitData();
         }
         //Valencia------------------------------------------------------------------------------------------------------
         else if(response.equals(val_cdo)){
            System.out.println("\nValencia to Cagayan\nRegular Fare: Php 125.00\nSP SC Fare: Php 115.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(val_man)){
            System.out.println("\nValencia to Manolo\nRegular Fare: Php 95.00\nSP SC Fare: Php 85.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(val_mal)){
            System.out.println("\nValencia to Malaybalay\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(val_mar)){
            System.out.println("\nValencia to Maramag\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(val_pan)){
            System.out.println("\nValencia to Pangantucan\nRegular Fare: Php 50.00\nSP SC Fare: Php 40.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(val_kal)){
            System.out.println("\nValencia to Kalilangan\nRegular Fare: Php 75.00\nSP SC Fare: Php 65.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(val_wao)){
            System.out.println("\nValencia to Wao\nRegular Fare: Php 100.00\nSP SC Fare: Php 90.00\n");
            displayRuralTransitData();
         }
         //Maramag-----------------------------------------------------------------------------------------------
         else if(response.equals(mar_cdo)){
            System.out.println("\nMaramag to Cagayan\nRegular Fare: Php 150.00\nSP SC Fare: Php 140.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(mar_man)){
            System.out.println("\nMaramag to Manolo\nRegular Fare: Php 120.00\nSP SC Fare: Php 110.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(mar_mal)){
            System.out.println("\nMaramag to Malaybalay\nRegular Fare: Php 50.00\nSP SC Fare: Php 40.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(mar_val)){
            System.out.println("\nMaramag to Valencia\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(mar_pan)){
            System.out.println("\nMaramag to Pangantucan\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(mar_kal)){
            System.out.println("\nMaramag to Kalilangan\nRegular Fare: Php 50.00\nSP SC Fare: Php 40.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(mar_wao)){
            System.out.println("\nMaramag to Wao\nRegular Fare: Php 75.00\nSP SC Fare: Php 65.00\n");
            displayRuralTransitData();
         }
         //Pangantucan-------------------------------------------------------------------------------------------
         else if(response.equals(pan_cdo)){
            System.out.println("\nPangantucan to Cagayan\nRegular Fare: Php 175.00\nSP SC Fare: Php 165.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(pan_man)){
            System.out.println("\nPangantucan to Manolo\nRegular Fare: Php 145.00\nSP SC Fare: Php 135.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(pan_mal)){
            System.out.println("\nPangantucan to Malaybalay\nRegular Fare: Php 75.00\nSP SC Fare: Php 65.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(pan_val)){
            System.out.println("\nPangantucan to Valencia\nRegular Fare: Php 50.00\nSP SC Fare: Php 40.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(pan_mar)){
            System.out.println("\nPangantucan to Maramag\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(pan_kal)){
            System.out.println("\nPangantucan to Kalilangan\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(pan_wao)){
            System.out.println("\nPangantucan to Wao\nRegular Fare: Php 50.00\nSP SC Fare: Php 40.00\n");
            displayRuralTransitData();
         }
         //Kalilangan--------------------------------------------------------------------------------------------
         else if(response.equals(kal_cdo)){
            System.out.println("\nKalilangan to Cagayan\nRegular Fare: Php 200.00\nSP SC Fare: Php 190.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(kal_man)){
            System.out.println("\nKalilangan to Manolo\nRegular Fare: Php 170.00\nSP SC Fare: Php 160.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(kal_mal)){
            System.out.println("\nKalilangan to Malaybalay\nRegular Fare: Php 100.00\nSP SC Fare: Php 90.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(kal_val)){
            System.out.println("\nKalilangan to Valencia\nRegular Fare: Php 75.00\nSP SC Fare: Php 65.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(kal_mar)){
            System.out.println("\nKalilangan to Maramag\nRegular Fare: Php 50.00\nSP SC Fare: Php 40.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(kal_pan)){
            System.out.println("\nKalilangan to Pangantucan\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(kal_wao)){
            System.out.println("\nKalilangan to Wao\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         }
         //Wao---------------------------------------------------------------------------------------------------
         else if(response.equals(wao_cdo)){
            System.out.println("\nWao to Cagayan\nRegular Fare: Php 225.00\nSP SC Fare: Php 215.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(wao_man)){
            System.out.println("\nWao to Manolo\nRegular Fare: Php 195.00\nSP SC Fare: Php 185.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(wao_mal)){
            System.out.println("\nWao to Malaybalay\nRegular Fare: Php 125.00\nSP SC Fare: Php 115.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(wao_val)){
            System.out.println("\nWao to Valencia\nRegular Fare: Php 100.00\nSP SC Fare: Php 90.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(wao_mar)){
            System.out.println("\nWao to Maramag\nRegular Fare: Php 75.00\nSP SC Fare: Php 65.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(wao_pan)){
            System.out.println("\nWao to Pangantucan\nRegular Fare: Php 50.00\nSP SC Fare: Php 40.00\n");
            displayRuralTransitData();
         }
         else if(response.equals(wao_kal)){
            System.out.println("\nWao to Kalilangan\nRegular Fare: Php 25.00\nSP SC Fare: Php 15.00\n");
            displayRuralTransitData();
         } 
         //Bus Route
         else if(response.equals(show_route)){
             System.out.println("\nDestination        Command used\n");
             System.out.println("Cagayan de oro     'cagayan'");
             System.out.println("Manolo Fortich     'manolo'");
             System.out.println("Malaybalay         'malaybalay'");
             System.out.println("Valencia           'valencia'");
             System.out.println("Maramag            'maramag'");
             System.out.println("Pangantucan        'pangantucan'");
             System.out.println("Kalilangan         'kalilangan'");
             System.out.println("Wao                'wao'\n\nExample Enter_Bus Route:/> manolo to cagayan\n");
         }
         //exit--------------------------------------------------------------------------------------------------
        else if(response.equals(exit_mode)){
            startConsole();
        }
        else
            System.out.println("--RT Data input Incorrect--");
            displayRuralTransitData();
    }
}


