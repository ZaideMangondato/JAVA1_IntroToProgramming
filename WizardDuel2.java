import java.util.*;
public class WizardDuel2 {
    public static void main(String args[]){
		System.out.println();
		System.out.println();
		System.out.println("created by: ZAIDE A. MANGONDATO");
        System.out.println("powered by: JAVA");
        proceed1();
    }
    public static void proceed1(){
        int response;
        Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println();
        System.out.println("-------------------------");
        System.out.println("     WIZARD's DUEL");
        System.out.println("-------------------------");
		System.out.println();
        System.out.println("To all Wizards,\n   READ and FOLLOW the instructions very carefully before engaging\n           thank you,");
        System.out.println("Press \"1\" to play the GAME");
        System.out.println("Press \"2\" to quit the GAME");
        response = input.nextInt();
        if(response == 1){
            int fight1;
            String oppName1 = "Wiz";
            String oppName2 = "Maczitor";
            String name;
            String none;
            int ranPowerPlayer = ((int)(Math.random()*100)+1);
            int ranPowerComp1 = ((int)(Math.random()*100)+1);
            System.out.println();
            none = input.nextLine();
            System.out.println("Enter your Wizards name>>>");
            name = input.nextLine();
            //System.out.println("Hello " + name + ",\n You are now a wizard gamer, you have to defeat 5 greatest wizards before get the treasure");
            //System.out.println("to fight this wizards, you must have a maximum power");
            System.out.println("First Opponent is WIZ");
            System.out.println(name + ", you have a power of " + ranPowerPlayer + " points\nPress \"1\" to fight the first Wizard\nPress \"2\" to restart game");
            fight1 = input.nextInt();
            if(fight1 == 1){
                System.out.println("Wiz's Power: " + ranPowerComp1);
                System.out.println(name + "'s Power: " + ranPowerPlayer);
                if(ranPowerPlayer > ranPowerComp1){
					System.out.println();
                    System.out.println(name + " WINS! You can now proceed to the next LEVEL");
                    System.out.println("Press \"1\" to proceed next LEVEL\nPress \"2\" to Quit");
                    int proc = input.nextInt();
                    if(proc == 1){
                        levelTwo();
                    }
                    else if(proc == 2){
						System.out.println();
                        System.out.println("Thank you for playing");
                        System.exit(0);
                    }
                    else{
						System.out.println();
                        System.out.println("Invalid Input");
                        System.exit(0);
                    }
                    
                }
                else if(ranPowerPlayer < ranPowerComp1){
					System.out.println();
                    System.out.println("WIZ wins!");
					System.exit(0);
                    
                }
                else
					System.out.println();
                    System.out.println("Draw");
					proceed1();
                    
            }
            else if(fight1 == 2){
                proceed1();
            }
            else{
				System.out.println();
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }
        else if(response == 2){
            System.exit(0);
        }
        else
			System.out.println();
            System.out.println("Invalid Input");
            proceed1();
        }
    }
    public static void levelTwo(){
        int fight2;
        String name;
        String oppName2 = "Maczitor";
        int ranPowerPlayer = ((int)(Math.random()*100)+1);
        int ranPowerComp2 = ((int)(Math.random()*100)+1);
        Scanner input = new Scanner(System.in);
        System.out.println("-------LEVEL 2--------");
        System.out.println("Enter again your Wizard's name, do not use another wizard's name>>>");
        name = input.nextLine();
        //System.out.println("Computer : Welcome back " + name);
        //System.out.println("    You are now in the 2nd LEVEL, the rules is the same from your battle before");
        System.out.println("    Your next opponent is " + oppName2);
        //System.out.println(oppName2 + "'s message:\n    I know you can beat Wiz's power but with me, you'll survive,\n  SAY GOODBYE TO YOUR BELOVED PLANET EARTH " + name + "!\n    HAHAHAHAHAHA!!!!!!!!!!!");
        System.out.println("Computer : " + oppName2 + "'s power is " + ranPowerComp2);
        System.out.println("Press \"1\" to fight " + oppName2 + "\nPress \"2\" to restart the battle");
        fight2 = input.nextInt();
        if(fight2 == 1){
				System.out.println();
                System.out.println(oppName2 + " Power: " + ranPowerComp2);
                System.out.println(name + " Power: " + ranPowerPlayer);
                if(ranPowerPlayer > ranPowerComp2){
					System.out.println();
                    System.out.println("You defeated " + oppName2 + ", You can now proceed to the next LEVEL");
                    System.out.println("Press \"1\" to proceed next LEVEL\nPress \"2\" to Quit");
                    int proc = input.nextInt();
                    if(proc == 1){
                        levelThree();
                    }
                    else if(proc == 2
						System.out.println();
                        System.out.println("Thank you for playing");
                        System.exit(0);
                    }
                    else{
						System.out.println();
                        System.out.println("Invalid Input");
                        System.exit(0);
                    }
                    
                }
                else if(ranPowerPlayer < ranPowerComp2){
					System.out.println();
                    System.out.println(oppName2 + " wins");
					System.exit(0);
                    
                }
                else
					System.out.println();
                    System.out.println("Draw");
                    levelTwo();
            }
            else if(fight2 == 2){
                levelTwo();
            }
            else{
				System.out.println();
                System.out.println("Invalid Entry");
                System.exit(0);
            }
    }
    public static void levelThree(){
        int fight3;
        String name;
        String oppName3 = "UltiMAx";
        int ranPowerPlayer = ((int)(Math.random()*100)+1);
        int ranPowerComp2 = ((int)(Math.random()*100)+1);
        Scanner input = new Scanner(System.in);
        System.out.println("-------LEVEL 3--------");
        System.out.println("Enter again your Wizard's name, do not use another wizard's name>>>");
        name = input.nextLine();
        //System.out.println("Computer : Welcome back " + name);
        //System.out.println("    You are now in the 3rd LEVEL, the rules is the same from your battle before");
        System.out.println("    Your next opponent is " + oppName3);
        //System.out.println(oppName3 + "'s message:\n    I know you can beat Wiz's power but with me, you'll survive,\n  SAY GOODBYE TO YOUR BELOVED PLANET EARTH " + name + "!\n    HAHAHAHAHAHA!!!!!!!!!!!");
        System.out.println("Computer : " + oppName3 + "'s power is " + ranPowerComp2);
        System.out.println("Press \"1\" to fight " + oppName3 + "\nPress \"2\" to restart the battle");
        fight3 = input.nextInt();
        if(fight3 == 1){
				System.out.println();
				System.out.println(oppName3 + " Power: " + ranPowerComp2);
                System.out.println(name + " Power: " + ranPowerPlayer);
                if(ranPowerPlayer > ranPowerComp2){
					System.out.println();
                    System.out.println("You defeated " + oppName3 + ", You can now proceed to the next LEVEL");
                    System.out.println("Press \"1\" to proceed next LEVEL\nPress \"2\" to Quit");
                    int proc = input.nextInt();
                    if(proc == 1){
                        levelFour();
                    }
                    else if(proc == 2){
						System.out.println();
                        System.out.println("Thank you for playing");
                        System.exit(0);
                    }
                    else{
						System.out.println();
                        System.out.println("Invalid Input");
                        System.exit(0);
                    }
                    
                }
                else if(ranPowerPlayer < ranPowerComp2){
					System.out.println();
                    System.out.println(oppName3 + " wins!");
                    System.exit(0);
                    
                }
                else{
					System.out.println();
                    System.out.println("Draw");
                    levelThree();
            }
            else if(fight3 == 2){
                levelThree();
            }
            else{
				System.out.println();
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }
    public static void levelFour(){
        int fight4;
        String name;
        String oppName3 = "Severus";
        int ranPowerPlayer = ((int)(Math.random()*100)+1);
        int ranPowerComp2 = ((int)(Math.random()*100)+1);
        Scanner input = new Scanner(System.in);
        System.out.println("-------LEVEL 4--------");
        System.out.println("Enter again your Wizard's name, do not use another wizard's name>>>");
        name = input.nextLine();
        //System.out.println("Computer : Welcome back " + name);
        System.out.println("    You are now in the Last LEVEL, the rules are the same from your battle before");
        System.out.println("    Your next opponent is " + oppName3);
        System.out.println(oppName3 + "'s message:\n    Finally, Your are now in my sight , Let See If you can Escape with My POWER\n  SAY GOODBYE TO YOUR BELOVED PLANET EARTH " + name + "!\n    HAHAHAHAHAHA!!!!!!!!!!!");
		System.out.println();
        System.out.println("oppName3 + "'s power is " + ranPowerComp2);
        System.out.println("Press \"1\" to fight " + oppName3 + "\nPress \"2\" to restart the battle");
        fight4 = input.nextInt();
        if(fight4 == 1){
				System.out.println();
				System.out.println(oppName3 + " Power: " + ranPowerComp2);
                System.out.println(name + " Power: " + ranPowerPlayer);
                if(ranPowerPlayer > ranPowerComp2){
					System.out.println();
                    System.out.println("Nice Fight! You defeated " + oppName3 + ", You can now proceed to the next LEVEL");
                    System.out.println("Press \"1\" to proceed\nPress \"2\" to Quit");
                    int proc = input.nextInt();
                    if(proc == 1){
						System.out.println();
                        System.out.println("Congratulations! You Defeated Severus Snape! you Win The GAME");
                        System.out.println("Thank you very much for Playing " + name);
						System.exit(0);
                    }
                    else if(proc == 2){
						System.out.println();
                        System.out.println("Thank you for playing");
                        System.exit(0);
                    }
                    else{
						System.out.println();
                        System.out.println("Invalid Input");
                        System.exit(0);
                    }
                    
                }
                else if(ranPowerPlayer < ranPowerComp2
					System.out.println();
                    System.out.println(oppName3 + " wins!");
                    System.exit(0);
                    
                }
                else
					System.out.println();
                    System.out.println("Draw");
                    levelFour();
            }
            else if(fight4 == 2){
                levelFour();
            }
            else{
				System.out.println();
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }
}