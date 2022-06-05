import java.util.*;
public class Fighter {
    String[] charactersName = new String[1000000000];
    int[] charactersHp = new int[10000000];
    int[] charactersMp = new int[10000000];
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    String name;

    int Characternum = 0,moreC, phyDmg,damage=0,temp=1 ,Attacker,characterChice,afterHp,dice2,fireDmg,burn;


    public void setName() {
        for (int i = 0; true; i++) {


            System.out.print("what are the Characters names: ");
            charactersName[i] = input.nextLine();

            charactersHp[i] = 1000;
            charactersMp[i] = 100;
            
            System.out.print("To make more Characters type 1, To exit type 2: ");
            moreC = input2.nextInt();

            Characternum++;

            if (Characternum == 1000000000) {
                System.out.println("To many Characters");
                break;
            }
            if (moreC == 2)
                break;

        }
    }


    public void getName(){
        System.out.println("Number of Characters Created " + Characternum);

        for (int i=0;i<Characternum;i++){
            System.out.println("Name of the Character " + charactersName[i]);

        }
    }

    public void getPhyDmg(){
        System.out.println("Physical Damage");

        if (Characternum > 1) {
            for (int i = 0; i < Characternum;i++){
                System.out.println("The Characters are " + temp + ":" + charactersName[i]);
                temp++;
            }

            System.out.print("Who is Attacking: ");
            Attacker = input2.nextInt();

            System.out.print("Who do you want to attack: ");
            characterChice = input.nextInt();


            damage = rand.nextInt(200) + 1;
            afterHp = charactersHp[Characternum -1] -damage;

            System.out.println(charactersName[characterChice - 1] + " took " + damage + " Physical Damage from " + charactersName[Attacker - 1]);
            System.out.println(charactersName[characterChice - 1] + " Now Has: " + afterHp + "HP");
        }
        if (Characternum == 1) {
            damage = rand.nextInt(100) + 1;
            afterHp = charactersHp[Characternum -1] -damage;

            System.out.println(charactersName[characterChice - 1] + " took " + damage + " fall Damage");
            System.out.println(charactersName[characterChice - 1] + " Now Has: " + afterHp + "HP");
        }
    }
    public void getElementalDmg() {
        dice2 = rand.nextInt(100) + 1;

        if (dice2 <= 10) {
            System.out.println("You got Fire Damage!");

            if (Characternum > 1) {
                for (int i = 0; i < Characternum; i++) {
                    System.out.println("The Characters are " + temp + ":" + charactersName[i]);
                    temp++;
                }

                System.out.print("Who is Attacking: ");
                Attacker = input2.nextInt();

                System.out.print("Who do you want to attack: ");
                characterChice = input.nextInt();


                fireDmg = rand.nextInt(140) + 1;
                burn = rand.nextInt(60) + 1;
                int totalDmg = fireDmg +burn;
                afterHp = charactersHp[Characternum -1] -totalDmg;

                System.out.println(charactersName[characterChice - 1] + " took " + fireDmg + " Fire Damage And " + burn + " Burn Damage " + "from " + charactersName[Attacker - 1]);
                System.out.println(charactersName[characterChice - 1] + " Now Has: " + afterHp+ "HP");
            }
            if (Characternum == 1) {

                fireDmg = rand.nextInt(140) + 1;
                burn = rand.nextInt(60) + 1;
                int totalDmg = fireDmg +burn;
                afterHp = charactersHp[Characternum -1] - totalDmg;

                System.out.println(charactersName[characterChice - 1] +  " Some How Hit himself with the Fire Magic and took " + fireDmg+ " Fire Damage and "+ burn + " Burn damage" );
                System.out.println(charactersName[characterChice - 1] + " Now Has: " + afterHp+ "HP");
            }
        }
    }
}


