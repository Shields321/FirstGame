import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Random rand = new Random();
        Fighter fighter = new Fighter();
        char Choice, Choice2;
        int dice;


        System.out.print("Do you Want to Make Characters y/n: ");
        Choice = input.next().charAt(0);

        if (Choice == 'y') {
            fighter.setName();
        } else if (Choice == 'n') {
            System.out.print("If You Do Not Make A Character the Game can't run. Enter n for ending Game y To continue: ");
            Choice = input.next().charAt(0);
            if (Choice == 'n') {
                System.exit(0);
            } else {
                fighter.setName();

            }
        }
        while(true) {
            dice = rand.nextInt(100) + 1;
            if (dice >= 50) {
                System.out.print("Do you Want to Start Fighting y/n: ");
                Choice2 = input.next().charAt(0);
                if (Choice2 == 'y') {
                    fighter.getPhyDmg();
                } else if (Choice2 == 'n') {
                    System.out.print("If You Do Attack the Game can't run. Enter n for ending Game y To continue: ");
                    Choice2 = input.next().charAt(0);

                    if (Choice2 == 'n')
                        System.exit(0);
                    else if (Choice2 == 'y')
                        fighter.getPhyDmg();
                }
            } else if (dice < 50) {
                System.out.print("Do you Want to Start Fighting y/n: ");
                Choice2 = input.next().charAt(0);
                if (Choice2 == 'y') {
                    fighter.getElementalDmg();
                } else if (Choice2 == 'n') {
                    System.out.print("If You Do Attack the Game can't run. Enter n for ending Game y To continue: ");
                    Choice2 = input.next().charAt(0);
                    if (Choice2 == 'n')
                        System.exit(0);
                    else if (Choice2 == 'y') {
                        fighter.getElementalDmg();
                    }
                }
            }
        }
    }
}




