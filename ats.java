//CREATED BY ALEX ZHOU 
import java.util.*; 
//READ ME --------------------------------------------
//Please follow the instructions at the start (the one about your console)
//GAME MAY TAKE SOME TIME TO LOAD cause replit's ram is always dying
//Game lore generated with chat gpt and revised a bit by me
//Sprites taken from asciiart.eu/ and probably somewhere else
class Main {
  public static void main(String[] args) {
    boolean loopOrNot = true; //true
    boolean shopOrNot = true;
    boolean banana = true;
    int maxHp = 10; //10
    int maxMana = 6;
    int m1DmgMin = 0; //0
    int m1DmgMax = 0;
    int currentHp = 10; //10
    int currentMana = 6;  
    int floor = 0; //0
    int temporaryint;
    int howMuchH;
    int coins = 0; //0
    int whatChest = 0;
    int randoInt = 0;
    int randoInt2 = 0;
    int randoInt3 = 0;
    int tempo123 = 0; 
    int whoFight = 0;
    int howMuchDmgYou; 
    int questionNum;
    int f1;
    int f2;
    int f3;
    int f4;
    double randofr;
    double howMuchDmgHe;
    double howMuchHealHe;
    String enemyIntent = "";
    String yourInput = "";
    String whereAt = "";
    String temporaryString2;
    String characterEmoji = "uh";
    String whatequip;
    String whatequipA;
    String whatequipAm;
    String whatequipW;
    String encounter = "";
    String literallydoesntmatter;
    String whatOption;
    String whatBuying;
    String name;
    ArrayList<String> tempString = new ArrayList<String>();
    ArrayList<String> inventory = new ArrayList<String>();
    ArrayList<String> equippedArmor = new ArrayList<String>();
    ArrayList<String> equippedAmulet = new ArrayList<String>();
    ArrayList<String> equippedWeapon = new ArrayList<String>();
    ArrayList<String> spells = new ArrayList<String>();
    ArrayList<String> shopItems = new ArrayList<String>();
   // String[] allItems = new String[]{"\u001B[31mTwin Armor\u001B[37m", "\u001B[31mBlacksteel Armor\u001B[37m", "\u001B[31mWhitesteel Armor\u001B[37m", "\u001B[31mJoe Biden Suit\u001B[37m", "\u001B[31mArmor of Armors\u001B[37m", "\u001B[31mArmor made of Shields\u001B[37m", "\u001B[31mRuby Amulet\u001B[37m", "\u001B[31mEmerald Amulet\u001B[37m", "\u001B[31mRadiant Amulet\u001B[37m", "\u001B[31mJade Amulet\u001B[37m", "\u001B[31mChaos Amulet\u001B[37m", "\u001B[31mBronze Sword\u001B[37m", "\u001B[31mBlue Wand\u001B[37m", "\u001B[31mIron Sword\u001B[37m", "\u001B[31mJade Wand\u001B[37m", "\u001B[31mDiamond Sword\u001B[37m", "\u001B[31mDiamond Wand\u001B[37m", "\u001B[31mRuby Sword\u001B[37m", "\u001B[31mRuby Wand\u001B[37m", "\u001B[31mSword of Swords\u001B[37m", "\u001B[31mWand of Wands\u001B[37m", "\u001B[31mSword of Mystery\u001B[37m", "\u001B[31mTiny Sword of Mystery\u001B[37m", "\u001B[31mLarge Magic Missile\u001B[37m", "\u001B[31mDouble Strike\u001B[37m", "\u001B[31mTriple Strike\u001B[37m", "\u001B[31mUnstable Magic Missile\u001B[37m", "\u001B[31mTriple Magic Missile\u001B[37m", "Big Heal\u001B[37m", "\u001B[31mExplosion!\u001B[37m", "\u001B[31mMagic Missile\u001B[37m", "\u001B[31mBifurcated Magic Missile\u001B[37m", "\u001B[31mSniper Shot\u001B[37m", "\u001B[31mMana Heal\u001B[37m"};    doesn't work cause it doesn't show up cause .indexOf("name here or whatever") doesn't work sadly
  String[] allItems = new String[]{"Twin Armor", "Blacksteel Armor", "Whitesteel Armor", "Joe Biden Suit", "Armor of Armors", "Armor made of Shields", "Ruby Amulet", "Platinum Amulet", "Emerald Amulet", "Gold Amulet", "Radiant Amulet", "Jade Amulet", "Chaos Amulet", "Bronze Sword", "Blue Wand", "Iron Sword", "Jade Wand", "Diamond Sword", "Diamond Wand", "Ruby Sword", "Ruby Wand", "Sword of Swords", "Wand of Wands", "Sword of Mystery", "Tiny Sword of Mystery", "Large Magic Missile", "Double Strike", "Triple Strike", "Unstable Magic Missile", "Triple Magic Missile", "Big Heal", "Explosion!", "Magic Missile", "Bifurcated Magic Missile", "Sniper Shot", "Mana Heal"};
    
    //probably should've used a hashmap (I realized this 1000 lines of code in it's too late now D:)
    String[] allItemsStats = new String[]{"13 hp", "16 hp", "18 hp", "20 hp", "22 hp", "25 hp", "05 mana", "08 mana", "08 mana", "10 mana", "15 mana", "12 mana", "20 mana", "03-07 dmg", "02-08 dmg", "05-08 dmg", "04-09 dmg", "07-08 dmg", "05-10 dmg", "07-10 dmg", "05-12 dmg", "10-14 dmg", "08-16 dmg", "01-30 dmg", "01-15 dmg"};
    String[] allItemsCosts = new String[]{"10", "13", "18", "22", "28", "33", "10", "15", "15", "15", "22", "18", "27", "10", "10", "13", "13", "16", "16", "19", "19", "23", "23", "20", "15", "13", "11", "17", "15", "18", "18", "18", "11", "15", "18", "18"};
    String[] placesToRandomize = new String[]{"3 0", "3 2", "3 4", "5 0", "5 2", "5 5", "8 2"};
    String[] placesToRandomizeP2 = new String[]{"10 2", "13 0", "13 5", "15 0", "15 2", "15 4", "17 0", "17 4", "20 2"};
    String[][] gameMap = {{" "," ","🗡️", " ", " "," "," "},
                          {" "," ","/","|","\\"," "," "},
                          {" ", "/", " ", "|", " ", "\\", " "},
                          {"o"," ","o"," ","o"," "," "},
                          {"/", " "," ","|"," "," ","\\"},
                          {"o"," ","o"," "," ","o"," "},
                          {" ", "\\"," ","|"," ","/"," "},
                          {" "," ","\\","|","/"," "," "},
                          {" "," ","o"," "," "," "," "},
                          {" "," "," ","|"," "," "," "},
                          {" "," ","o"," "," "," "," "},
                          {" "," ","/"," ","\\"," "," "},
                          {" ","/"," "," "," ","\\"," "},
                          {"o"," "," "," "," ","o"," "},
                          {"|","¯","\\"," ","/","¯","|"},
                          {"o"," ","o"," ","o"," "," "},
                          {"|","/","¯"," ","¯","\\","|"},
                          {"o"," "," "," ","o"," "," "},
                          {" ","\\"," "," "," ","/"," "},
                          {" "," ","\\"," ","/"," "," "},
                          {" "," ","o"," "," "," "," "},
                          {" "," "," ","|"," "," "," "},
                          {" "," "," "," "," "," "," "}
                         };
    
   
    //shop 15%, chest 10%, monster 55%, ? 30%
    //? is monster 60%, chest 20%, shop 20%

    
    //game map is semirandomized each time the replit is run (Map layout stays the same, but icons change)
    for(int i =0; i<placesToRandomizeP2.length; i++) {
      temporaryint = (int) (Math.random()*(20)) + 1;
      if(temporaryint == 1 || temporaryint==2 || temporaryint == 3) {
        gameMap[Integer.valueOf(placesToRandomizeP2[i].substring(0, 2))][Integer.valueOf(placesToRandomizeP2[i].substring(3,4))] = "💰";
      }
      else if(temporaryint == 4 || temporaryint==5) {
        gameMap[Integer.valueOf(placesToRandomizeP2[i].substring(0, 2))][Integer.valueOf(placesToRandomizeP2[i].substring(3,4))] = "🎁";
      }
      else if(temporaryint == 7 || temporaryint == 8 || temporaryint == 9 || temporaryint == 10 || temporaryint == 11 || temporaryint == 12) {
        gameMap[Integer.valueOf(placesToRandomizeP2[i].substring(0, 2))][Integer.valueOf(placesToRandomizeP2[i].substring(3,4))] = "❓";
      }
      else {
       gameMap[Integer.valueOf(placesToRandomizeP2[i].substring(0, 2))][Integer.valueOf(placesToRandomizeP2[i].substring(3,4))] = "🗡️"; 
      }
    }
    for(int i =0; i<placesToRandomize.length; i++) {
      temporaryint = (int) (Math.random()*(20)) + 1;
      if(temporaryint == 1 || temporaryint==2 || temporaryint == 3) {
        gameMap[Integer.valueOf(placesToRandomize[i].substring(0, 1))][Integer.valueOf(placesToRandomize[i].substring(2,3))] = "💰";
      }
      else if(temporaryint == 4 || temporaryint==5) {
        gameMap[Integer.valueOf(placesToRandomize[i].substring(0, 1))][Integer.valueOf(placesToRandomize[i].substring(2,3))] = "🎁";
      }
      else if(temporaryint == 7 || temporaryint == 8 || temporaryint == 9 || temporaryint == 10 || temporaryint == 11 || temporaryint == 12) {
        gameMap[Integer.valueOf(placesToRandomize[i].substring(0, 1))][Integer.valueOf(placesToRandomize[i].substring(2,3))] = "❓";
      }
      else {
       gameMap[Integer.valueOf(placesToRandomize[i].substring(0, 1))][Integer.valueOf(placesToRandomize[i].substring(2,3))] = "🗡️"; 
      }
    }
    for(int beginning=0; beginning<1; beginning++) { //just goes through it once, press the down arrow or whatever next to the line number to make the code smaller
    System.out.println("\nPLEASE RUN THE PROGRAM ON FULL SCREEN. Make it so that you can't see your chrome tabs, and the console covers about a half/your entire screen. Otherwise, you might not be able to see some text because your console is not big enough and have to scroll up.\nALSO, PLEASE READ THE INFO WHEN YOU FIRST START THE GAME. <<<<<");
    try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.println("\n\n");
    String biden123 = "As you slowly regain consciousness, you find yourself in an unfamiliar place, surrounded by an eerie silence. Confusion swirls within you as your eyes focus on a towering spire that dominates the landscape. The spire stands defiantly, its ancient stones weathered by time and marred by claw marks. Despite the fear welling up inside you, an unyielding determination takes hold. You resolve to conquer this enigmatic challenge and embark on an arduous ascent, step by step, determined to face the unknown that awaits atop the daunting spire.          ";
    for(int i = 0; i<biden123.length() -6; i+=5) {
      System.out.print("\u001B[35m" + biden123.substring(i, i+5));
       try {
          Thread.sleep(50);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
    System.out.println("\n\n\n");
    try {
      Thread.sleep(3000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
      
    String whoAreYou = "Who are you?";
    for(int i = 0; i<whoAreYou.length(); i++) {
      System.out.print("\u001B[36m" + whoAreYou.substring(i, i+1));
       try {
          Thread.sleep(500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
    System.out.println("\u001B[37m ");
    System.out.println(" _   _   _   _+       |      Knight");
    System.out.println("/_`-'_`-'_`-'_|  \\+/  |      Stats:");
    System.out.println("\\_` '_` '_` '_| _<=>_ |      30 hp");
    System.out.println("  `-' `-' `-' 0/ \\ / o=o     6 mana");
    System.out.println("              \\/\\ ^ /`0      3-7 damage");
    System.out.println("              | /_^_\\        Starts with Double Strike and Heal");
    System.out.println("              | || ||");
    System.out.println("            __|_d|_|b__");
    System.out.println("");
    System.out.println("");
    System.out.println("                 __/\\__      Mage");
    System.out.println("            . _  \\\\''//      Stats:");
    System.out.println("            -( )-/_||_\\      25 hp");
    System.out.println("             .'. \\_()_/      10 mana");
    System.out.println("              |   | . \\      2-5 damage");
    System.out.println("              |   | .  \\     Starts with Magic Missile and Heal");
    System.out.println("             .'. ,\\_____'.");
    System.out.println("");
    System.out.println("");
    System.out.println("                _.+._        Gambler");
    System.out.println("              (^\\/^\\/^)      Stats:");
    System.out.println("               \\@*@*@/       20 hp");
    System.out.println("               {_____}       10 mana");
    System.out.println("              ///\"\"\"\\\\\\      1-16 damage");
    System.out.println("              (/6   6\\)      Starts with Unstable Magic Missile and heal");
    System.out.println("               ||=^=||");
    System.out.println("               \\\\\\\\///");
    System.out.println("                \\\\///");
    System.out.println("                 `)/");
    }

    System.out.println("Enter \"knight\", \"mage\", or \"gambler\".");
    Scanner input = new Scanner(System.in);
    //ok so how the inventory works is that the name of the thing gets added first, and then the stats (both to the same arraylist) I get the value of the stats with substring(0,2).
    String whichclass = input.nextLine().toLowerCase(); 
    if(whichclass.equals("knight")) {
      String starterSword = "03-07 dmg";
      String starterKArmor = "10 hp";
      String starterKAmulet = "00 mana";
      inventory.add("Starter Sword");
      inventory.add(starterSword);
      inventory.add("Starter Knight Armor");
      inventory.add(starterKArmor);
      inventory.add("Old Amulet");
      inventory.add(starterKAmulet);
      equippedWeapon.add("Starter Sword");
      equippedWeapon.add(starterSword);
      equippedArmor.add("Starter Knight Armor");
      equippedArmor.add(starterKArmor);
      equippedAmulet.add("Old Amulet");
      equippedAmulet.add(starterKAmulet);
      characterEmoji = "🤺";
      coins += 5;
      spells.add("Double Strike");
      spells.add("Heal");
      maxHp += Integer.valueOf(starterKArmor.substring(0,2));
      m1DmgMin += Integer.valueOf(starterSword.substring(0,2));
      m1DmgMax += Integer.valueOf(starterSword.substring(3,5));
      System.out.println("Knight chosen");
      currentHp += 10;
      maxHp += 10;
      currentHp = maxHp;
      currentMana = maxMana;
    }  
      
    else if(whichclass.equals("mage")) {
      String starterWand = "02-05 dmg";
      String starterMArmor = "09 hp";
      String starterAmulet = "03 mana";
      currentHp += 6;
      maxHp += 6;
      currentMana += 1;
      maxMana += 1;
      inventory.add("Starter Wand");
      inventory.add(starterWand);
      inventory.add("Starter Mage Armor");
      inventory.add(starterMArmor);
      inventory.add("Starter Amulet");
      inventory.add(starterAmulet);
      equippedWeapon.add("Starter Wand");
      equippedWeapon.add(starterWand);
      equippedArmor.add("Starter Mage Armor");
      equippedArmor.add(starterMArmor);
      equippedAmulet.add("Starter Amulet");
      equippedAmulet.add(starterAmulet);
      spells.add("Magic Missile");
      spells.add("Heal");
      coins += 5;
      maxHp += Integer.valueOf(starterMArmor.substring(0,2));
      maxMana += Integer.valueOf(starterAmulet.substring(0,2));
      m1DmgMin += Integer.valueOf(starterWand.substring(0,2));
      m1DmgMax += Integer.valueOf(starterWand.substring(3,5));
      characterEmoji = "🧙";
      currentHp = maxHp;
      currentMana = maxMana;
      System.out.println("Mage chosen");

    }

    else if(whichclass.equals("gambler")) {
      String starterWhatWeapon = "01-16 dmg";
      String starterWhatArmor = "05 hp";
      String starterWhatAmulet = "04 mana";
      currentHp += 5;
      maxHp += 5;
      currentMana += 1;
      maxMana += 1;
      inventory.add("Starter Mystery Sword");
      inventory.add(starterWhatWeapon);
      inventory.add("Starter King Armor");
      inventory.add(starterWhatArmor);
      inventory.add("Starter King Amulet");
      inventory.add(starterWhatAmulet);
      equippedWeapon.add("Starter Mystery Sword");
      equippedWeapon.add(starterWhatWeapon);
      equippedArmor.add("Starter King Armor");
      equippedArmor.add(starterWhatArmor);
      equippedAmulet.add("Starter King Amulet");
      equippedAmulet.add(starterWhatAmulet);
      spells.add("Unstable Magic Missile");
      spells.add("Heal");
      coins += 5;
      maxHp += Integer.valueOf(starterWhatArmor.substring(0,2));
      maxMana += Integer.valueOf(starterWhatAmulet.substring(0,2));
      m1DmgMin += Integer.valueOf(starterWhatWeapon.substring(0,2));
      m1DmgMax += Integer.valueOf(starterWhatWeapon.substring(3,5));
      characterEmoji = "🤴";
      currentHp = maxHp;
      currentMana = maxMana;
      System.out.println("Gambler chosen");
    }  
    else {
      System.out.println("PLEASE FOLLOW DIRECTIONS (and use your brain). Restart your program. ");
      System.exit(0);
    }
    System.out.println("\nWould you like to turn on easy mode? (Without easy mode, you will likely need to play the game multiple times to beat it. Enter yes or no.");
    whichclass = input.nextLine().toLowerCase();
    if(whichclass.equals("yes")) {
      maxHp += 30;
      currentHp += 30;
      coins += 10;
      maxMana += 4;
      currentMana += 4;
    }
    System.out.println("\n\n\n\nWhat is your name?");
    whichclass = input.nextLine();
    name = whichclass;


    //main game
    while(loopOrNot) { System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("Where shall you venture within the depths of this towering fortress?");
      System.out.println("GAME MAP:");
      System.out.println("  👑");
      System.out.println("   |");
      for(int i = 0; i<gameMap.length; i++) { //prints out game map
      for(int j = 0; j<gameMap[0].length; j++) {
        System.out.print(gameMap[i][j]);
      }
      if(i == 0) {
        System.out.print("         Hp: " + currentHp + "/" + maxHp);
      }
      if(i==1) {
        System.out.print("        Mana: " + currentMana + "/" + maxMana);
      }
      if(i==2) {
        System.out.print("      Damage: " + m1DmgMin + "-" + m1DmgMax);
      }
      if(i==4) {
        System.out.print("       Coins: " + coins);
      }
      if(i==8) {
        System.out.print("       Enter \"adventure\" to continue, ");
      }
      if(i==9) {
        System.out.print("       \"inventory\" to view your inventory,");
      }
      if(i==10) {
        System.out.print("       \"equipped\" to view your equipment,");
      }
      if(i==11) {
        System.out.print("       \"spells\" to view your spells, or");
      }
      if(i==12) {
        System.out.print("       \"info\" for help on the game.");
      }
      if(i==14) {
        System.out.print("       💰 is a store, 🎁 is a chest,");
      }
      if(i==15) {
        System.out.print("       ❓ is a random encounter, and 🗡️ is a fight.");
      }
      System.out.println();
    }
      if(floor == 0) {System.out.println("  " + characterEmoji);}
      whatOption = input.nextLine().toLowerCase(); 

                      
      if(whatOption.equals("adventure")) {
        floor +=1; //person goes up
        //below is all the stuff detecting where you're at in the map and changing the map
        if(floor == 1) {
          whereAt = "11";
          encounter = gameMap[20][2];
          gameMap[20][2] = characterEmoji;
        }
        else if(floor ==2) {
          System.out.println("Do you want to go left or right?");
          System.out.println("Enter L or R");
          temporaryString2 = input.nextLine().toLowerCase();
          if(temporaryString2.equals("l")) {
            whereAt = "21";
            encounter = gameMap[17][0];
            gameMap[17][0] = characterEmoji;

          }
          else if (temporaryString2.equals("r")) {
            whereAt = "22";
            encounter = gameMap[17][4];
            gameMap[17][4] = characterEmoji;

          }
          else {
            System.out.println("error");
          }
          gameMap[20][2] = " x";
        }
        else if (floor == 3) {
          if(whereAt.equals("21")) {
            System.out.println("Do you want to go forward or right?");
            System.out.println("Enter F or R");
            temporaryString2 = input.nextLine().toLowerCase();
            if(temporaryString2.equals("f")) {
            whereAt = "31";
            encounter = gameMap[15][0];
            gameMap[15][0] = characterEmoji;
            gameMap[17][0] = " x";
          }
           else if (temporaryString2.equals("r")) {
            whereAt = "32";
            encounter = gameMap[15][2];
            gameMap[15][2] = characterEmoji;
            gameMap[17][0] = " x";
          }
          else {
            System.out.println("error");
          } 
          }
            
          else if (whereAt.equals("22")) {
            System.out.println("Do you want to go left or forwar?");
            System.out.println("Enter L or F");
            temporaryString2 = input.nextLine().toLowerCase();
            if(temporaryString2.equals("f")) {
            whereAt = "33";
            encounter = gameMap[15][4];
            gameMap[15][4] = characterEmoji;
            gameMap[17][4] = " x";

          }
           else if (temporaryString2.equals("l")) {
            whereAt = "32";
            encounter = gameMap[15][2];
            gameMap[15][2] = characterEmoji;
            gameMap[17][4] = " x";
          }
          else {
            System.out.println("error");
          } 
          }
          else {
            System.out.println("ERROR whereat");
          }
        }
        else if(floor ==4){
          if(whereAt.equals("31")) {
            whereAt = "41";
            encounter = gameMap[13][0];
            gameMap[13][0] = characterEmoji;
            gameMap[15][0] = " x";
          }
          else if(whereAt.equals("32")) {
            System.out.println("Do you want to go left or right?");
          System.out.println("Enter L or R");
          temporaryString2 = input.nextLine().toLowerCase();
          if(temporaryString2.equals("l")) {
            whereAt = "41";
            encounter = gameMap[13][0];
            gameMap[13][0] = characterEmoji;
          }
          else if (temporaryString2.equals("r")) {
            whereAt = "42";
            encounter = gameMap[13][5];
            gameMap[13][5] = characterEmoji;
          }
          else {
            System.out.println("error whereat");
          }
          gameMap[15][2] = " x";

          }
          else if(whereAt.equals("33")) {
            whereAt = "42";
            encounter = gameMap[13][5];
            gameMap[13][5] = characterEmoji;
            gameMap[15][4] = " x";

          }
          else {
            System.out.println("ERRor where at");
          }
        }     
        else if(floor==5) {
          if(whereAt.equals("41")) {
            gameMap[13][0] = " x";
          }
          else {
            gameMap[13][5] = "x";
          }
          whereAt = "51";
          encounter = gameMap[10][2];
          gameMap[10][2] = characterEmoji;
        }
        else if(floor ==6) {
          whereAt = "61";
          encounter = gameMap[8][2];
          gameMap[8][2] = characterEmoji;
          gameMap[10][2] = " x";
        }
        else if(floor == 7) {
          System.out.println("Do you want to go left, forward, or right?");
          System.out.println("Enter L, F, or R");
          temporaryString2 = input.nextLine().toLowerCase();
          if(temporaryString2.equals("l")) {
            whereAt = "71";
            encounter = gameMap[5][0];
            gameMap[5][0] = characterEmoji;
          }
          else if (temporaryString2.equals("f")) {
            whereAt = "72";
            encounter = gameMap[5][2];
            gameMap[5][2] = characterEmoji;
          }
          else if(temporaryString2.equals("r")) {
            whereAt = "73";
            encounter = gameMap[5][5];
            gameMap[5][5] = characterEmoji;

          }
          else {
            System.out.println("error whereat");
          }
          gameMap[8][2] = " x";
        }
        else if(floor == 8) {
          if(whereAt == "71") {
            whereAt = "81";
            encounter = gameMap[3][0];
            gameMap[3][0] = characterEmoji;
            gameMap[5][0] = "x";
          }
          else if(whereAt == "72") {
            whereAt = "82";
            encounter = gameMap[3][2];
            gameMap[3][2] = characterEmoji;
            gameMap[5][2] = "x";
          }
          else if(whereAt == "73") {
            whereAt = "83";
            encounter = gameMap[3][4];
            gameMap[3][4] = characterEmoji;
            gameMap[5][5] = "x";
          }
          else {
            System.out.println("error whereat");
          }
        }
        else if(floor == 9) {
          encounter = "🗡️";
          if(whereAt == "81") {
            whereAt = "91";
            gameMap[3][0] = "x";
          }
          else if(whereAt == "82") {
            whereAt = "91";
            gameMap[3][2] = "x";
          }
          else if(whereAt == "83") {
            whereAt = "91";
            gameMap[3][4] = " x";
          }
          else {
            System.out.println("Error whereat");
        }
          gameMap[0][2] = characterEmoji;
          
        }
        else if(floor == 10) {
          encounter = "👑";
        }
        else {
          System.out.println("uhh this isn't supposed to happen. Past floor 10?");
        }
        banana = true;

        
        while(banana) {
        if(encounter.equals("🎁")) { //Treasure chest
            banana = false;
            whatChest = (int) (Math.random() * 36);
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            String joe123123 = "As you ascend higher through the daunting spire, your weary eyes catch sight of a secluded alcove, and within it, a chest awaits. You open it, unveiling a collection of wondrous goodies. You find:";
            for(int i = 0; i<joe123123.length()-3; i+=3) {
            System.out.print("\u001B[35m" + joe123123.substring(i, i+3));
             try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
            System.out.println(" \u001B[37m ");

            if(whatChest > 24) {
              spells.add(allItems[whatChest]);

            //if if it's a spell it checks what spell and then adds
            if(allItems[whatChest].equals("Heal")) {
              System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
            }
            else if(allItems[whatChest].equals("Large Magic Missile")) {
              System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
            }
            else if(allItems[whatChest].equals("Double Strike")) {
              System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");       
            }
            else if(allItems[whatChest].equals("Triple Strike")) {
              System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
            }
            else if(allItems[whatChest].equals("Unstable Magic Missile")) {
              System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
            }
            else if(allItems[whatChest].equals("Triple Magic Missile")) {
              System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
            }
            else if(allItems[whatChest].equals("Big Heal")) {
              System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
            }
            else if(allItems[whatChest].equals("Explosion!")) {
              System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
            }
            else if(allItems[whatChest].equals("Magic Missile")) {
              System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
            }
            else if(allItems[whatChest].equals("Bifurcated Magic Missile")) {
              System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
            }
            else if(allItems[whatChest].equals("Sniper Shot")) {
              System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
            }
            else if(allItems[whatChest].equals("Mana Heal")) {
              System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
            }
            whatChest = (int) (Math.random() * 10) + 1;
            coins+=whatChest;
            System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
          }
            else {   //otherwise if the thing is an item, it adds to inv

              inventory.add(allItems[whatChest]);
              inventory.add(allItemsStats[whatChest]);
              System.out.println(allItems[whatChest] + ": " + allItemsStats[whatChest]);
              whatChest = (int) (Math.random() * 10) + 1;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
          System.out.println("Enter anything to go back to the menu.");
          literallydoesntmatter = input.nextLine();
          if(literallydoesntmatter == "2") {}
        }
        else if (encounter.equals("💰")) { //Shop
          banana = false;
          shopOrNot = true;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
          String biden132 = "As you navigate through the treacherous corridors of the spire, you stumble upon a dimly lit shop, its shelves adorned with mysterious artifacts, and a figure lurking in the shadows, offering their peculiar wares to unsuspecting souls.";
        for(int i = 0; i<234; i+=3) {
        System.out.print("\u001B[35m" + biden132.substring(i, i+3));
         try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        System.out.print(".\u001B[37m ");
        System.out.println("");
        System.out.println("\n\n\u001B[33m\u001B[33mMysterious Shop\u001B[37m: ");
          System.out.println("---------------------------------------------------");
          shopItems.clear();
          randoInt = (int) (Math.random() * 8) + 4;
          for(int i = 0; i<randoInt; i++) {
            randoInt2 = (int) (Math.random() * 36);
            if(Integer.valueOf(allItemsCosts[randoInt2]) > 10) {
              randoInt3 = (int) (Math.random() * 11) - 5;
            }
            else {
              randoInt3 = (int) (Math.random() * 7) - 3;
            }
            shopItems.add(allItems[randoInt2]);
  shopItems.add(Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3));
            if(randoInt2 < 25) {
              System.out.print("\n" + allItems[randoInt2] + ": " + allItemsStats[randoInt2] + ". " +  "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else {
            if(allItems[randoInt2].equals("Heal")) {
              System.out.print("\n\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Large Magic Missile")) {
              System.out.print("\n\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Double Strike")) {
              System.out.print("\n\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
              
            }else if(allItems[randoInt2].equals("Triple Strike")) {
              System.out.print("\n\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Unstable Magic Missile")) {
              System.out.print("\n\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Triple Magic Missile")) {
              System.out.print("\n\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Big Heal")) {
              System.out.print("\n\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Explosion!")) {
              System.out.print("\n\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Magic Missile")) {
              System.out.print("\n\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Bifurcated Magic Missile")) {
              System.out.print("\n\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");    
            }
            else if(allItems[randoInt2].equals("Sniper Shot")) {
              System.out.print("\n\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
            else if(allItems[randoInt2].equals("Mana Heal")) {
              System.out.print("\n\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana." + " " + "\u001B[33m" + Integer.toString(Integer.valueOf(allItemsCosts[randoInt2]) + randoInt3) + " coins" + "\u001B[37m ");
            }
  
              
            }
            
            if(randoInt3 < -3) {
              System.out.print("     BIG DISCOUNT");
            }      
          }
          System.out.print("\u001B[37m ");
          System.out.println("\n\n---------------------------------------------------");
          while(shopOrNot) {
          System.out.println("\u001B[33m\u001B[33mYour coins: " + coins + "\u001B[37m");
          System.out.println("To buy something, type that item's name (CAPITALIZATION MATTERS). \nOtherwise, type \"leave\".");
          whatBuying = input.nextLine();
          if(whatBuying.equals("leave")) {
            shopOrNot = false;
          }
          else {
            if(shopItems.contains(whatBuying)) {
              randoInt = shopItems.indexOf(whatBuying);
              if (coins >= Integer.valueOf(shopItems.get(randoInt + 1))) {
                coins -= Integer.valueOf(shopItems.get(randoInt + 1));
                if(whatBuying.equals("Mana Heal") || whatBuying.equals("Large Magic Missile") ||whatBuying.equals("Double Strike") ||whatBuying.equals("Triple Strike") ||whatBuying.equals("Unstable Magic Missile") ||whatBuying.equals("Triple Magic Missile") ||whatBuying.equals("Big Heal") ||whatBuying.equals("Explosion!") ||whatBuying.equals("Magic Missile") ||whatBuying.equals("Bifurcated Magic Missile") ||whatBuying.equals("Sniper Shot")) {
                  spells.add(whatBuying);
                }
                else {
                  int len = allItems.length;
                  int i = 0;
                  while(i<len) {
                    if (allItems[i].equals(whatBuying)) {
                      tempo123 = i;
                      i=len+1;
                    }
                    else {
                      i++;
                    }
                  }
                  inventory.add(allItems[tempo123]);
                  inventory.add(allItemsStats[tempo123]);
                }
                System.out.println("\n\nBought!");
              }
              else if(coins >= Integer.valueOf(shopItems.get(shopItems.lastIndexOf(whatBuying) + 1))) {
                coins -= Integer.valueOf(shopItems.get(shopItems.lastIndexOf(whatBuying) + 1));
                if(whatBuying.equals("Mana Heal") || whatBuying.equals("Large Magic Missile") ||whatBuying.equals("Double Strike") ||whatBuying.equals("Triple Strike") ||whatBuying.equals("Unstable Magic Missile") ||whatBuying.equals("Triple Magic Missile") ||whatBuying.equals("Big Heal") ||whatBuying.equals("Explosion!") ||whatBuying.equals("Magic Missile") ||whatBuying.equals("Bifurcated Magic Missile") ||whatBuying.equals("Sniper Shot")) {
                  spells.add(whatBuying);
                }
                else {
                  int len = allItems.length;
                  int i = 0;
                  while(i<len) {
                    if (allItems[i].equals(whatBuying)) {
                      tempo123 = i;
                      i=len+1;
                    }
                    else {
                      i++;
                    }
                  }
                  inventory.add(allItems[tempo123]);
                  inventory.add(allItemsStats[tempo123]);
                }
                System.out.println("\n\nBought!");
              }
              else {
               System.out.println("\n\nYou do not have enough coins."); 
              }
            }
            else {
              System.out.println("\n\nThe shop does not contain this.");
            }
          }
  
          } //end of ShopOrNot
        }
        else if (encounter.equals("🗡️")) { //Fight
          banana = false;
          whoFight = (int) (Math.random() * 4) + 1;
          //whoFight = 4;
          if(whoFight == 1) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou encounter a wild goblin!");
            int whatMonsterDoin = 0;
            double multiplier = 1 + floor/7.0;
            boolean fighting = true;
            double monsterHp = (int) (Math.round(25 * multiplier));
            int blocking = 0;
            enemyIntent = "Attacking";
            while(fighting) {
              whatMonsterDoin += 1;
              if(whatMonsterDoin % 4 == 1 || whatMonsterDoin % 4 == 0 || whatMonsterDoin % 4 == 2) {
                enemyIntent = "Attacking";
              }
              else {
                enemyIntent = "Blocking";
              }
              for(int monsterart= 0; monsterart<1; monsterart++) {
                System.out.println("\n\n\n              ENEMY INTENT: " + enemyIntent);
                  System.out.println("                   (    )");
                  System.out.println("                  ((((()))");
                  System.out.println("                  |o\\ /o)|");
                  System.out.println("                  ( (  _')");
                  System.out.println("                   (._.  /\\__");
                  System.out.println("                  ,\\___,/ '  ')");
                  System.out.println("    '.,_,,       (  .- .   .    )");
                  System.out.println("     \\   \\\\     ( '        )(    )");
                  System.out.println("      \\   \\\\    \\.  _.__ ____( .  |");
                  System.out.println("       \\  /\\\\   .(   .'  /\\  '.  )");
                  System.out.println("        \\(  \\\\.-' ( /    \\/    \\)");
                  System.out.println("         '  ()) _'.-|/\\/\\/\\/\\/\\|");
                  System.out.println("             '\\\\ .( |\\/\\/\\/\\/\\/|");
                  System.out.println("               '((  \\    /\\    /");
                  System.out.println("               ((((  '.__\\/__.')");
                  System.out.println("                ((,) /   ((()   )");
                  System.out.println("                 \"..-,  (()(\"   /");
                  System.out.println("                  _//.   ((() .\"");
                  System.out.println("          _____ //,/\" ___ ((( ', ___");
                  System.out.println("                           ((  )");
                  System.out.println("                            / /");
                  System.out.println("                          _/,/'");
                  System.out.println("                        /,/,\"");
                  System.out.println("                 Hp: " + monsterHp);
                System.out.println("----------------------------------------------------------------");
                  System.out.println("     Your Hp: " + currentHp + "/" + maxHp + "    Your Mana: " + currentMana + "/" + maxMana);
              }
                  //att 1-3, att 1-3, def 4, att 3-4. 
              System.out.println("\n\nWhat do you do?");
              System.out.println("Enter \"attack\" to attack, or enter anything else to use an ability. You cannot go back.");
              yourInput = input.nextLine().toLowerCase(); 
              if(yourInput.equals("attack")) {
                howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                monsterHp -= howMuchDmgYou;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg, and gain 2 mana!");
                if(currentMana + 2 <= maxMana) {
                  currentMana += 2;
                }
                else {
                  currentMana = maxMana;
                }
              }
              else {
                System.out.println("\n\nWhat spell do you want to use? CAPITALIZATION MATTERS. Ex: \"Heal\"");
                for(int i =0; i<spells.size(); i++) {
                  if(spells.get(i).equals("Heal")) {
                    System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
                  }
                  else if(spells.get(i).equals("Large Magic Missile")) {
                    System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
                  }
                  else if(spells.get(i).equals("Double Strike")) {
                    System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");
                    
                  }else if(spells.get(i).equals("Triple Strike")) {
                    System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
                  }
                  else if(spells.get(i).equals("Unstable Magic Missile")) {
                    System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
                  }
                  else if(spells.get(i).equals("Triple Magic Missile")) {
                    System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
                  }
                  else if(spells.get(i).equals("Big Heal")) {
                    System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
                  }
                  else if(spells.get(i).equals("Explosion!")) {
                    System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
                  }
                  else if(spells.get(i).equals("Magic Missile")) {
                    System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
                  }
                  else if(spells.get(i).equals("Bifurcated Magic Missile")) {
                    System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
                  }
                  else if(spells.get(i).equals("Sniper Shot")) {
                    System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
                  }
                  else if(spells.get(i).equals("Mana Heal")) {
                    System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
                  }
                }
                yourInput = input.nextLine();
                String words[]=yourInput.split("\\s");  
                  String capitalizeWord="";  
                  for(String w:words){  
                      String first=w.substring(0,1);  
                      String af=w.substring(1);  
                      capitalizeWord+=first.toUpperCase()+af+" ";  
                  }  
                yourInput = capitalizeWord.trim();
                
                if (spells.contains(yourInput)) {
  
                  if(yourInput.equals("Heal")) {
                    if(currentMana >= 3){
                      howMuchH = (int) (Math.round(maxHp*0.15));
                      if(currentHp+howMuchH>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += howMuchH;
                      }
                      currentMana -=3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for " + howMuchH + " hp!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Large Magic Missile")) {
                    if(currentMana >= 6){
                      monsterHp -= 16;
                      currentMana -= 6;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 16 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Double Strike")) {
                    if(currentMana >= 4){
                      howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*2 + " dmg!");
                      currentMana -= 4;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }                  
                  }else if(yourInput.equals("Triple Strike")) {
                    if(currentMana >= 8){
                      howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*3 + " dmg!");
                      currentMana -= 8;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }                      
                  }
                  else if(yourInput.equals("Unstable Magic Missile")) {
                    if(currentMana >= 3){
                      howMuchDmgYou = (int) (Math.random() * 20) + 1;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                      currentMana -= 3;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }  
                  }
                  else if(yourInput.equals("Triple Magic Missile")) {
                    if(currentMana >= 9){
                      monsterHp -= 24;
                      currentMana -= 9;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 24 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }  
                  }
                  else if(yourInput.equals("Big Heal")) {
                    if(currentMana >= 6){
                      if(currentHp+12>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += 14;
                      }
                      currentMana -=6;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for 14 hp!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Explosion!")) {
                    if(currentMana >= 3){
                      monsterHp -= 12;
                      currentMana -= 3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 12 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Magic Missile")) {
                    if(currentMana >= 3){
                      monsterHp -= 10;
                      currentMana -= 3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 10 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Bifurcated Magic Missile")) {
                    if(currentMana >= 7){
                      howMuchDmgYou = (int) (Math.random() * 4) + 5;
                      monsterHp -= howMuchDmgYou;
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                      for(int i = 0; i<2; i++) {
                        howMuchDmgYou = (int) (Math.random() * 4) + 5;
                        monsterHp -= howMuchDmgYou;
                        System.out.println("You attack for " + howMuchDmgYou + " dmg!");
                      }
  
                      
                      currentMana -= 7;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Sniper Shot")) {
                    if(currentMana >= 10){
                      monsterHp -= 30;
                      currentMana -= 10;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 30 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Mana Heal")) {
                    if(currentMana >= 3){
                      if(currentMana + 5 > maxMana) {
                        currentMana = maxMana;
                      }
                      else {
                      currentMana += 5;
                      }
                      System.out.println("\nYou gained 8 mana (and used 3 mana)!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  
                }
                else {
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou stumble on your words, and your spell fails to cast. In your confusion, the enemy moves! (You mistyped the spell or you don't have that spell.)");
                }
              }
              if(monsterHp <=0) {
                fighting = false;
              }
              if(whatMonsterDoin % 4 == 1 || whatMonsterDoin % 4 == 2) {
                if(fighting) {
                howMuchDmgHe = (int) (Math.random() * 3 ) + 1;
                howMuchDmgHe = Math.round((double) howMuchDmgHe * multiplier);
                howMuchDmgHe = (int) howMuchDmgHe;
                System.out.println("The goblin attacks you for " + howMuchDmgHe + " dmg!");
                currentHp -= howMuchDmgHe;
  
                }
              }
              else if(whatMonsterDoin % 4 == 3) {
                if(fighting) {
                howMuchHealHe = Math.round((double) 4 * multiplier);
                System.out.println("The goblin blocks and heals for " + howMuchHealHe + " hp!");
                monsterHp += howMuchHealHe;
                }
              }
              else {
                if(fighting) {
                howMuchDmgHe = 3;
                howMuchDmgHe = Math.round((double) howMuchDmgHe * multiplier);
                howMuchDmgHe = (int) howMuchDmgHe;
                System.out.println("The goblin attacks you for " + howMuchDmgHe + " dmg!");
                currentHp -= howMuchDmgHe;
                }
              }
              if(fighting) {
                System.out.println("You regen 1 mana!");
                if(currentMana + 1 <= maxMana) {
                  currentMana += 1;
                }
                else {
                  currentMana = maxMana;
                }
              }
              if(currentHp <= 0) {
                System.out.println("You died! Game over.");
                System.out.println("TIP: You should use your heal skill! It's very powerful. You don't regenerate hp between fights.");
                System.exit(0);
              }
                  
                
              
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou win!");
             whatChest = (int) (Math.random() * 36);
            System.out.println("You got: ");
            randofr = (int) (Math.random() * (10) + 1);
            if(randofr > 4 + floor) { //bad 
              whatChest = (int) (Math.random() * (3 + floor)) + 7;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
            else { //good
              if(whatChest > 24) {
              spells.add(allItems[whatChest]);
            if(allItems[whatChest].equals("Heal")) {
              System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
            }
            else if(allItems[whatChest].equals("Large Magic Missile")) {
              System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
            }
            else if(allItems[whatChest].equals("Double Strike")) {
              System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");       
            }
            else if(allItems[whatChest].equals("Triple Strike")) {
              System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
            }
            else if(allItems[whatChest].equals("Unstable Magic Missile")) {
              System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
            }
            else if(allItems[whatChest].equals("Triple Magic Missile")) {
              System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
            }
            else if(allItems[whatChest].equals("Big Heal")) {
              System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
            }
            else if(allItems[whatChest].equals("Explosion!")) {
              System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
            }
            else if(allItems[whatChest].equals("Magic Missile")) {
              System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
            }
            else if(allItems[whatChest].equals("Bifurcated Magic Missile")) {
              System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
            }
            else if(allItems[whatChest].equals("Sniper Shot")) {
              System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
            }
            else if(allItems[whatChest].equals("Mana Heal")) {
              System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
            }
            whatChest = (int) (Math.random() * 10) + 1;
            coins+=whatChest;
            System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
          }
              else {
              inventory.add(allItems[whatChest]);
              inventory.add(allItemsStats[whatChest]);
              System.out.println(allItems[whatChest] + ": " + allItemsStats[whatChest]);
              whatChest = (int) (Math.random() * (10 + floor)) + 1;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
            }
            if(currentMana + 3 <= maxMana) {
                  currentMana += 3;
                }
                else {
                  currentMana = maxMana;
                }
            System.out.println("Enter anything to go back to the menu.");
            literallydoesntmatter = input.nextLine();
            if(literallydoesntmatter == "2") {}
  
            
          }
          else if (whoFight == 2) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou encounter a weird slime!");
            int count = 0;
            double multiplier = 1 + floor/9.0;
            double multiplier2 = 0;
            boolean fighting =true;
            double monsterHp = (int) (Math.round(30 * multiplier));
            double howMuchDmgHe2 = 0;
            while(fighting) {
              enemyIntent = "Attacking";
              multiplier2 = 1 + (int) (count/3);
              

              for(int monsA = 0; monsA<1; monsA++) {
                System.out.println("                  Enemy Intent: " + enemyIntent);
                System.out.println("                    ███████████████████           ");        
                System.out.println("          ██████████░░░░░░░░░░░░░░░░░░░██████████     ");     
                System.out.println("        ██░░░░░░░░░░░░░░██░░░░░░░░██░░░░░░░░░░░░░░██      ");  
                System.out.println("      ██░░░░░░░░░░░░░░██████░░░░██████░░░░░░░░░░░░░░██      ");
                System.out.println("    ██░░░░░░░░░░░░░░░░██████░░░░██████░░░░░░░░░░░░░░░░██    ");
                System.out.println("    ██░░░░░░░░░░░░░░░░██████░░░░██████░░░░░░░░░░░░░░░░██    ");
                System.out.println("  ██░░░░░░░░░░░░░░░░░░██████░░░░██████░░░░░░░░░░░░░░░░░░██  ");
                System.out.println("  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██  ");
                System.out.println("██▓▓░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██");
                System.out.println("██▓▓░░░░▓▓░░▓▓░░██░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░░██");
                System.out.println("██▓▓░░░░░░▓▓░░░░░░████░░░░░░░░░░░░░░░░████░░░░░░░░░░░░░░░░██");
                System.out.println("██▓▓░░░░░░░░░░░░░░░░░░████████████████░░░░░░░░░░░░░░▓▓░░░░██");
                System.out.println("██▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████░░░░░░░░░░▓▓░░▓▓░░░░██");
                System.out.println("██▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░██");
                System.out.println("  ████▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████  ");
                System.out.println("      ████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░████████████      ");
                System.out.println("                  ████████████████████████                ");
                System.out.println("                      Enemy Hp: " + monsterHp);
                System.out.println("----------------------------------------------------------------");
                System.out.println("              Your Hp: " + currentHp + "/" + maxHp + "    Your Mana: " + currentMana + "/" + maxMana);
  
              }
              System.out.println("\n\nWhat do you do?");
              System.out.println("Enter \"attack\" to attack, or enter anything else to use an ability. You cannot go back.");
              yourInput = input.nextLine().toLowerCase();
              if(yourInput.equals("attack")) {
                howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                monsterHp -= howMuchDmgYou;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg, and gain 2 mana!");
                if(currentMana + 2 <= maxMana) {
                  currentMana += 2;
                }
                else {
                  currentMana = maxMana;
                }
              }
              else {
                System.out.println("\n\nWhat spell do you want to use? CAPITALIZATION MATTERS. Ex: \"Heal\"");
                for(int i =0; i<spells.size(); i++) {
                  if(spells.get(i).equals("Heal")) {
                    System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
                  }
                  else if(spells.get(i).equals("Large Magic Missile")) {
                    System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
                  }
                  else if(spells.get(i).equals("Double Strike")) {
                    System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");
                    
                  }else if(spells.get(i).equals("Triple Strike")) {
                    System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
                  }
                  else if(spells.get(i).equals("Unstable Magic Missile")) {
                    System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
                  }
                  else if(spells.get(i).equals("Triple Magic Missile")) {
                    System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
                  }
                  else if(spells.get(i).equals("Big Heal")) {
                    System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
                  }
                  else if(spells.get(i).equals("Explosion!")) {
                    System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
                  }
                  else if(spells.get(i).equals("Magic Missile")) {
                    System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
                  }
                  else if(spells.get(i).equals("Bifurcated Magic Missile")) {
                    System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
                  }
                  else if(spells.get(i).equals("Sniper Shot")) {
                    System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
                  }
                  else if(spells.get(i).equals("Mana Heal")) {
                    System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
                  }
                }
                yourInput = input.nextLine();
                String words[]=yourInput.split("\\s");  
                  String capitalizeWord="";  
                  for(String w:words){  
                      String first=w.substring(0,1);  
                      String af=w.substring(1);  
                      capitalizeWord+=first.toUpperCase()+af+" ";  
                  }  
                yourInput = capitalizeWord.trim();
                if (spells.contains(yourInput)) {
  
                  if(yourInput.equals("Heal")) {
                    if(currentMana >= 3){
                      howMuchH = (int) (Math.round(maxHp*0.15));
                      if(currentHp+howMuchH>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += howMuchH;
                      }
                      currentMana -=3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for " + howMuchH + " hp!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Large Magic Missile")) {
                    if(currentMana >= 6){
                      monsterHp -= 16;
                      currentMana -= 6;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 16 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Double Strike")) {
                    if(currentMana >= 4){
                      howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*2 + " dmg!");
                      currentMana -= 4;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }                  
                  }else if(yourInput.equals("Triple Strike")) {
                    if(currentMana >= 8){
                      howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*3 + " dmg!");
                      currentMana -= 8;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }                      
                  }
                  else if(yourInput.equals("Unstable Magic Missile")) {
                    if(currentMana >= 3){
                      howMuchDmgYou = (int) (Math.random() * 20) + 1;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                      currentMana -= 3;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }  
                  }
                  else if(yourInput.equals("Triple Magic Missile")) {
                    if(currentMana >= 9){
                      monsterHp -= 24;
                      currentMana -= 9;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 24 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }  
                  }
                  else if(yourInput.equals("Big Heal")) {
                    if(currentMana >= 6){
                      if(currentHp+14>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += 14;
                      }
                      currentMana -=6;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for 14 hp!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Explosion!")) {
                    if(currentMana >= 3){
                      monsterHp -= 12;
                      currentMana -= 3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 12 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Magic Missile")) {
                    if(currentMana >= 3){
                      monsterHp -= 10;
                      currentMana -= 3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 10 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Bifurcated Magic Missile")) {
                    if(currentMana >= 7){
                      howMuchDmgYou = (int) (Math.random() * 4) + 5;
                      monsterHp -= howMuchDmgYou;
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                      for(int i = 0; i<2; i++) {
                        howMuchDmgYou = (int) (Math.random() * 4) + 5;
                        monsterHp -= howMuchDmgYou;
                        System.out.println("You attack for " + howMuchDmgYou + " dmg!");
                      }
  
                      
                      currentMana -= 7;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Sniper Shot")) {
                    if(currentMana >= 10){
                      monsterHp -= 30;
                      currentMana -= 10;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 30 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Mana Heal")) {
                    if(currentMana >= 3){
                      if(currentMana + 5 > maxMana) {
                        currentMana = maxMana;
                      }
                      else {
                      currentMana += 5;
                      }
                      System.out.println("\nYou gained 8 mana (and used 3 mana)!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  
                }
                else {
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou stumble on your words, and your spell fails to cast. In your confusion, the enemy moves! (You mistyped the spell or you don't have that spell.)");
                }
              }
              if(monsterHp <=0) {
                fighting = false;
              }
              if(fighting) {
                count++;
                howMuchDmgHe = Math.round((int) (multiplier2) * multiplier);
                if(count == 1) {
                  howMuchDmgHe2 = howMuchDmgHe;
                }
                else {
                  if(howMuchDmgHe > howMuchDmgHe2) {
                    System.out.println("The slime powers up!");
                  }
                }
                howMuchDmgHe2 = howMuchDmgHe;
                System.out.println("The slime attacks you for " + howMuchDmgHe + " dmg!");
                currentHp -= howMuchDmgHe;
  
              }
              if(fighting) {
                System.out.println("You regen 1 mana!");
                if(currentMana + 1 <= maxMana) {
                  currentMana += 1;
                }
                else {
                  currentMana = maxMana;
                }
              }
              if(currentHp <= 0) {
                System.out.println("You died! Game over.");
                  System.out.println("TIP: You should use your heal skill! It's very powerful. You don't regenerate hp between fights.");
                  System.out.println("TIP: The slime grows in size and damage over time. Kill it quickly!");

                System.exit(0);
              }
              
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou win!");
             whatChest = (int) (Math.random() * 36);
            System.out.println("You got: ");
            randofr = (int) (Math.random() * (10) + 1);
            if(randofr > 4 + floor) { //bad 
              whatChest = (int) (Math.random() * (3 + floor)) + 7;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
            else { //good
              if(whatChest > 24) {
              spells.add(allItems[whatChest]);
            if(allItems[whatChest].equals("Heal")) {
              System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
            }
            else if(allItems[whatChest].equals("Large Magic Missile")) {
              System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
            }
            else if(allItems[whatChest].equals("Double Strike")) {
              System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");       
            }
            else if(allItems[whatChest].equals("Triple Strike")) {
              System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
            }
            else if(allItems[whatChest].equals("Unstable Magic Missile")) {
              System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
            }
            else if(allItems[whatChest].equals("Triple Magic Missile")) {
              System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
            }
            else if(allItems[whatChest].equals("Big Heal")) {
              System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
            }
            else if(allItems[whatChest].equals("Explosion!")) {
              System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
            }
            else if(allItems[whatChest].equals("Magic Missile")) {
              System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
            }
            else if(allItems[whatChest].equals("Bifurcated Magic Missile")) {
              System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
            }
            else if(allItems[whatChest].equals("Sniper Shot")) {
              System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
            }
            else if(allItems[whatChest].equals("Mana Heal")) {
              System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
            }
            whatChest = (int) (Math.random() * 10) + 1;
            coins+=whatChest;
            System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
          }
              else {
              inventory.add(allItems[whatChest]);
              inventory.add(allItemsStats[whatChest]);
              System.out.println(allItems[whatChest] + ": " + allItemsStats[whatChest]);
              whatChest = (int) (Math.random() * (10 + floor)) + 1;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
            }
            if(currentMana + 3 <= maxMana) {
                  currentMana += 3;
                }
                else {
                  currentMana = maxMana;
                }
            System.out.println("Enter anything to go back to the menu.");
            literallydoesntmatter = input.nextLine();
            if(literallydoesntmatter == "2") {}
  
            
          }
          else if (whoFight == 3) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou encounter an evil witch!");
            int whatMonsterDoin = 0;
            double multiplier = 1 + floor/9.0;
            boolean fighting = true;
            double monsterHp = (int) (Math.round(25 * multiplier));
            enemyIntent = "???";
            while (fighting) {
              whatMonsterDoin += 1;
              //%3=1 or 2 = nothin; %3 = 0 = attaking
              if(whatMonsterDoin % 3 == 1 || whatMonsterDoin % 3  == 2) {
                enemyIntent = "?????";
                for(int i = 0; i<1; i++) {
                              
                  System.out.println("          ENEMY INTENT: " + enemyIntent);
                  System.out.println("                  _,-'|            ");
                  System.out.println("               ,-'._  |            ");
                  System.out.println("     .||,      |####\\ |           ");
                  System.out.println("    \\.`',/     \\####| |          ");
                  System.out.println("    = ,. =      |###| |            ");
                  System.out.println("    / || \\    ,-'\\#/,'`.");
                  System.out.println("      ||     ,'   `,,. `.");
                  System.out.println("      ,|____,' , ,;' \\| |");
                  System.out.println("     (3|\\    _/|/'   _| |");
                  System.out.println("      ||/,-''  | >-'' _,\\\\");
                  System.out.println("      ||'      ==\\ ,-'  ,'");
                  System.out.println("      ||       |  V \\ ,|");
                  System.out.println("      ||       |    |` |");
                  System.out.println("      ||       |    |   \\");
                  System.out.println("      ||       |    \\    \\");
                  System.out.println("      ||       |     |    \\");
                  System.out.println("      ||       |      \\_,-'");
                  System.out.println("      ||       |___,,--\")_\\");
                  System.out.println("      ||         |_|   ccc/");
                  System.out.println("      ||        ccc/");
                  System.out.println("      ||                ");
                  System.out.println("               Hp: " + monsterHp);
                System.out.println("----------------------------------------------------------------");
                  System.out.println("     Your Hp: " + currentHp + "/" + maxHp + "    Your Mana: " + currentMana + "/" + maxMana);
                }
              }
              //make red explosion wand mayeb idk something cool
              else if (whatMonsterDoin % 3 == 0) {
                enemyIntent = "Attacking";
                for(int i = 0; i<1; i++) {
                              
                  System.out.println("          ENEMY INTENT: " + enemyIntent);
                  System.out.println("                  _,-'|            ");
                  System.out.println("               ,-'._  |            ");
                  System.out.println("\u001B[31m	 .||,    \u001B[37m   |####\\ |           ");
                  System.out.println("\u001B[31m	\\.`',/ \u001B[37m     \\####| |          ");
                  System.out.println("\u001B[31m	= ,. =  \u001B[37m     |###| |            ");
                  System.out.println("\u001B[31m	/ \u001B[37m ||\u001B[31m \\\u001B[37m     ,-'\\#/,'`.");
                  System.out.println("      ||     ,'   `,,. `.");
                  System.out.println("      ,|____,' , ,;' \\| |");
                  System.out.println("     (3|\\    _/|/'   _| |");
                  System.out.println("      ||/,-''  | >-'' _,\\\\");
                  System.out.println("      ||'      ==\\ ,-'  ,'");
                  System.out.println("      ||       |  V \\ ,|");
                  System.out.println("      ||       |    |` |");
                  System.out.println("      ||       |    |   \\");
                  System.out.println("      ||       |    \\    \\");
                  System.out.println("      ||       |     |    \\");
                  System.out.println("      ||       |      \\_,-'");
                  System.out.println("      ||       |___,,--\")_\\");
                  System.out.println("      ||         |_|   ccc/");
                  System.out.println("      ||        ccc/");
                  System.out.println("      ||                ");
                  System.out.println("               Hp: " + monsterHp);
                System.out.println("----------------------------------------------------------------");
                  System.out.println("     Your Hp: " + currentHp + "/" + maxHp + "    Your Mana: " + currentMana + "/" + maxMana);
                }
              }
              else {
                System.out.println("broken");
              }
              System.out.println("\n\nWhat do you do?");
              System.out.println("Enter \"attack\" to attack, or enter anything else to use an ability. You cannot go back.");
              yourInput = input.nextLine().toLowerCase(); 
              if(yourInput.equals("attack")) {
                howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                monsterHp -= howMuchDmgYou;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg, and gain 2 mana!");
                if(currentMana + 2 <= maxMana) {
                  currentMana += 2;
                }
                else {
                  currentMana = maxMana;
                }
              }
              else {
                System.out.println("\n\nWhat spell do you want to use? CAPITALIZATION MATTERS. Ex: \"Heal\"");
                for(int i =0; i<spells.size(); i++) {
                  if(spells.get(i).equals("Heal")) {
                    System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
                  }
                  else if(spells.get(i).equals("Large Magic Missile")) {
                    System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
                  }
                  else if(spells.get(i).equals("Double Strike")) {
                    System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");
                    
                  }else if(spells.get(i).equals("Triple Strike")) {
                    System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
                  }
                  else if(spells.get(i).equals("Unstable Magic Missile")) {
                    System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
                  }
                  else if(spells.get(i).equals("Triple Magic Missile")) {
                    System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
                  }
                  else if(spells.get(i).equals("Big Heal")) {
                    System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
                  }
                  else if(spells.get(i).equals("Explosion!")) {
                    System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
                  }
                  else if(spells.get(i).equals("Magic Missile")) {
                    System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
                  }
                  else if(spells.get(i).equals("Bifurcated Magic Missile")) {
                    System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
                  }
                  else if(spells.get(i).equals("Sniper Shot")) {
                    System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
                  }
                  else if(spells.get(i).equals("Mana Heal")) {
                    System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
                  }
                }
                yourInput = input.nextLine();
                String words[]=yourInput.split("\\s");  
                  String capitalizeWord="";  
                  for(String w:words){  
                      String first=w.substring(0,1);  
                      String af=w.substring(1);  
                      capitalizeWord+=first.toUpperCase()+af+" ";  
                  }  
                yourInput = capitalizeWord.trim();
                if (spells.contains(yourInput)) {
  
                  if(yourInput.equals("Heal")) {
                    if(currentMana >= 3){
                      howMuchH = (int) (Math.round(maxHp*0.15));
                      if(currentHp+howMuchH>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += howMuchH;
                      }
                      currentMana -=3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for " + howMuchH + " hp!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Large Magic Missile")) {
                    if(currentMana >= 6){
                      monsterHp -= 16;
                      currentMana -= 6;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 16 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Double Strike")) {
                    if(currentMana >= 4){
                      howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*2 + " dmg!");
                      currentMana -= 4;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }                  
                  }else if(yourInput.equals("Triple Strike")) {
                    if(currentMana >= 8){
                      howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*3 + " dmg!");
                      currentMana -= 8;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }                      
                  }
                  else if(yourInput.equals("Unstable Magic Missile")) {
                    if(currentMana >= 3){
                      howMuchDmgYou = (int) (Math.random() * 20) + 1;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                      currentMana -= 3;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }  
                  }
                  else if(yourInput.equals("Triple Magic Missile")) {
                    if(currentMana >= 9){
                      monsterHp -= 24;
                      currentMana -= 9;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 24 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }  
                  }
                  else if(yourInput.equals("Big Heal")) {
                    if(currentMana >= 6){
                      if(currentHp+12>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += 14;
                      }
                      currentMana -=6;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for 14 hp!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Explosion!")) {
                    if(currentMana >= 3){
                      monsterHp -= 12;
                      currentMana -= 3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 12 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Magic Missile")) {
                    if(currentMana >= 3){
                      monsterHp -= 10;
                      currentMana -= 3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 10 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Bifurcated Magic Missile")) {
                    if(currentMana >= 7){
                      howMuchDmgYou = (int) (Math.random() * 4) + 5;
                      monsterHp -= howMuchDmgYou;
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                      for(int i = 0; i<2; i++) {
                        howMuchDmgYou = (int) (Math.random() * 4) + 5;
                        monsterHp -= howMuchDmgYou;
                        System.out.println("You attack for " + howMuchDmgYou + " dmg!");
                      }
  
                      
                      currentMana -= 7;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Sniper Shot")) {
                    if(currentMana >= 10){
                      monsterHp -= 30;
                      currentMana -= 10;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 30 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Mana Heal")) {
                    if(currentMana >= 3){
                      if(currentMana + 5 > maxMana) {
                        currentMana = maxMana;
                      }
                      else {
                      currentMana += 5;
                      }
                      System.out.println("\nYou gained 8 mana (and used 3 mana)!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  
                }
                else {
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou stumble on your words, and your spell fails to cast. In your confusion, the enemy moves! (You mistyped the spell or you don't have that spell.)");
                }
              }
              if(monsterHp <=0) {
                fighting = false;
              }
  
              if(whatMonsterDoin % 3 == 1 || whatMonsterDoin % 3 == 2) {
                if(fighting) {
                System.out.println("The witch is preparing herself...");
  
                }
              }
              else if(whatMonsterDoin % 3 == 0) {
                if(fighting) {
                  howMuchDmgHe = Math.round(((int) (Math.random() * 6) + 5) * multiplier);
                  System.out.println("The witch casts a powerful spell on you for " + howMuchDmgHe + " dmg!");
                  currentHp -= howMuchDmgHe;
  
  
                }
              }
              else{
                System.out.println("broke :(");
              }
              if(fighting) {
                System.out.println("You regen 1 mana!");
                if(currentMana + 1 <= maxMana) {
                  currentMana += 1;
                }
                else {
                  currentMana = maxMana;
                }
              }
              if(currentHp <= 0) {
                System.out.println("You died! Game over.");
                System.out.println("TIP: You should use your heal skill! It's very powerful. You don't regenerate hp between fights.");
                System.out.println("TIP: The witch casts a powerful spell after preparing for 2 turns. After she casts it, you should heal yourself if you have enough mana.");

                System.exit(0);
              }
  
            }//end of while fighting 3
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou win!");
            whatChest = (int) (Math.random() * 36);
            System.out.println("You got: ");
            randofr = (int) (Math.random() * (10) + 1);
            if(randofr > 4 + floor) { //bad 
              whatChest = (int) (Math.random() * (3 + floor)) + 7;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
            else { //good
              if(whatChest > 24) {
              spells.add(allItems[whatChest]);
            if(allItems[whatChest].equals("Heal")) {
              System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
            }
            else if(allItems[whatChest].equals("Large Magic Missile")) {
              System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
            }
            else if(allItems[whatChest].equals("Double Strike")) {
              System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");       
            }
            else if(allItems[whatChest].equals("Triple Strike")) {
              System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
            }
            else if(allItems[whatChest].equals("Unstable Magic Missile")) {
              System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
            }
            else if(allItems[whatChest].equals("Triple Magic Missile")) {
              System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
            }
            else if(allItems[whatChest].equals("Big Heal")) {
              System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
            }
            else if(allItems[whatChest].equals("Explosion!")) {
              System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
            }
            else if(allItems[whatChest].equals("Magic Missile")) {
              System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
            }
            else if(allItems[whatChest].equals("Bifurcated Magic Missile")) {
              System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
            }
            else if(allItems[whatChest].equals("Sniper Shot")) {
              System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
            }
            else if(allItems[whatChest].equals("Mana Heal")) {
              System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
            }
            whatChest = (int) (Math.random() * 10) + 1;
            coins+=whatChest;
            System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
          }
              else {
              inventory.add(allItems[whatChest]);
              inventory.add(allItemsStats[whatChest]);
              System.out.println(allItems[whatChest] + ": " + allItemsStats[whatChest]);
              whatChest = (int) (Math.random() * (10 + floor)) + 1;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
            }
            if(currentMana + 3 <= maxMana) {
                  currentMana += 3;
                }
                else {
                  currentMana = maxMana;
                }
            System.out.println("Enter anything to go back to the menu.");
            literallydoesntmatter = input.nextLine();
            if(literallydoesntmatter == "2") {}
  
            
          } //end of whofight3
          else if (whoFight == 4) {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou encounter a priest!");
          //
            int what = 0;
            int count = 0;
            //3, H6, -2 mana, H4, -2 dmg. 
            double multiplier = 1 + floor/7.0;
            boolean fighting =true;
            double monsterHp = (int) (Math.round(30 * multiplier));
            double mMonsterHp = (int) (Math.round(30*multiplier));
            double howMuchDmgHe2 = 0;
            while(fighting) {
            for(int m=0; m<1; m++) {
              System.out.println("             Enemy Intent: " + enemyIntent);
              System.out.println("                    ,-----.   ");
              System.out.println("                   #,-. ,-.#");
              System.out.println("                  () a   e ()");
              System.out.println("                  (   (_)   )");
              System.out.println("                  #\\_  -  _/#");
              System.out.println("                ,'   `\"\"\"`    `.");
              System.out.println("              ,'      \\X/      `.");
              System.out.println("             /         X     ____\\");
              System.out.println("            /          v   ,`  v  `,");
              System.out.println("           /    /         ( <==+==> )");
              System.out.println("           `-._/|__________\\   ^   /");
              System.out.println("          (\\\\)  |______@____\\  ^  /");
              System.out.println("            \\\\  |     ( )    \\ ^ /");
              System.out.println("             )  |             \\^/");
              System.out.println("            (   |             |v");
              System.out.println("           <(^)>|             |");
              System.out.println("             v  |             |");
              System.out.println("                |             |");
              System.out.println("                |_.--.__ .--._|");
              System.out.println("                  `==='  `==='");
              System.out.println("                 Enemy Hp: " + monsterHp);
              System.out.println("----------------------------------------------------------------");
              System.out.println("         Your Hp: " + currentHp + "/" + maxHp + "    Your Mana: " + currentMana + "/" + maxMana);
            }
            System.out.println("\n\nWhat do you do?");
            System.out.println("Enter \"attack\" to attack, or enter anything else to use an ability. You cannot go back.");
            yourInput = input.nextLine().toLowerCase();
            if(yourInput.equals("attack")) {
                  howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                  howMuchDmgYou = (int) (howMuchDmgYou - what);
                  monsterHp -= howMuchDmgYou;
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg, and gain 2 mana!");
                  if(currentMana + 2 <= maxMana) {
                    currentMana += 2;
                  }
                  else {
                    currentMana = maxMana;
                  }
                }
            else {
                  System.out.println("\n\nWhat spell do you want to use? CAPITALIZATION MATTERS. Ex: \"Heal\"");
                  for(int i =0; i<spells.size(); i++) {
                    if(spells.get(i).equals("Heal")) {
                      System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
                    }
                    else if(spells.get(i).equals("Large Magic Missile")) {
                      System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
                    }
                    else if(spells.get(i).equals("Double Strike")) {
                      System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");
                      
                    }else if(spells.get(i).equals("Triple Strike")) {
                      System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
                    }
                    else if(spells.get(i).equals("Unstable Magic Missile")) {
                      System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
                    }
                    else if(spells.get(i).equals("Triple Magic Missile")) {
                      System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
                    }
                    else if(spells.get(i).equals("Big Heal")) {
                      System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
                    }
                    else if(spells.get(i).equals("Explosion!")) {
                      System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
                    }
                    else if(spells.get(i).equals("Magic Missile")) {
                      System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
                    }
                    else if(spells.get(i).equals("Bifurcated Magic Missile")) {
                      System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
                    }
                    else if(spells.get(i).equals("Sniper Shot")) {
                      System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
                    }
                    else if(spells.get(i).equals("Mana Heal")) {
                      System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
                    }
                  }
                  yourInput = input.nextLine();
              String words[]=yourInput.split("\\s");  
                  String capitalizeWord="";  
                  for(String w:words){  
                      String first=w.substring(0,1);  
                      String af=w.substring(1);  
                      capitalizeWord+=first.toUpperCase()+af+" ";  
                  }  
                yourInput = capitalizeWord.trim();
                  if (spells.contains(yourInput)) {
    
                    if(yourInput.equals("Heal")) {
                      if(currentMana >= 3){
                      howMuchH = (int) (Math.round(maxHp*0.15));
                      if(currentHp+howMuchH>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += howMuchH;
                      }
                      currentMana -=3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for " + howMuchH + " hp!");
                    }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      }
                    }
                    else if(yourInput.equals("Large Magic Missile")) {
                      if(currentMana >= 6){
                        monsterHp -= 16;
                        currentMana -= 6;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 16 dmg!");
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      }
                    }
                    else if(yourInput.equals("Double Strike")) {
                      if(currentMana >= 4){
                        howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                        monsterHp -= howMuchDmgYou;
                        monsterHp -= howMuchDmgYou;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*2 + " dmg!");
                        currentMana -= 4;
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      }                  
                    }else if(yourInput.equals("Triple Strike")) {
                      if(currentMana >= 8){
                        howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                        monsterHp -= howMuchDmgYou;
                        monsterHp -= howMuchDmgYou;
                        monsterHp -= howMuchDmgYou;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*3 + " dmg!");
                        currentMana -= 8;
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      }                      
                    }
                    else if(yourInput.equals("Unstable Magic Missile")) {
                      if(currentMana >= 3){
                        howMuchDmgYou = (int) (Math.random() * 20) + 1;
                        monsterHp -= howMuchDmgYou;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                        currentMana -= 3;
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      }  
                    }
                    else if(yourInput.equals("Triple Magic Missile")) {
                      if(currentMana >= 9){
                        monsterHp -= 24;
                        currentMana -= 9;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 24 dmg!");
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      }  
                    }
                    else if(yourInput.equals("Big Heal")) {
                      if(currentMana >= 6){
                        if(currentHp+14>maxHp) {
                          currentHp = maxHp;
                        }
                        else{
                          currentHp += 14;
                        }
                        currentMana -=6;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for 14 hp!");
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      }
                    }
                    else if(yourInput.equals("Explosion!")) {
                      if(currentMana >= 3){
                        monsterHp -= 12;
                        currentMana -= 3;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 12 dmg!");
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      } 
                    }
                    else if(yourInput.equals("Magic Missile")) {
                      if(currentMana >= 3){
                        monsterHp -= 10;
                        currentMana -= 3;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 10 dmg!");
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      } 
                    }
                    else if(yourInput.equals("Bifurcated Magic Missile")) {
                      if(currentMana >= 7){
                        howMuchDmgYou = (int) (Math.random() * 4) + 5;
                        monsterHp -= howMuchDmgYou;
                                              System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                        for(int i = 0; i<2; i++) {
                          howMuchDmgYou = (int) (Math.random() * 4) + 5;
                          monsterHp -= howMuchDmgYou;
                          System.out.println("You attack for " + howMuchDmgYou + " dmg!");
                        }
    
                        
                        currentMana -= 7;
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      } 
                    }
                    else if(yourInput.equals("Sniper Shot")) {
                      if(currentMana >= 10){
                        monsterHp -= 30;
                        currentMana -= 10;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 30 dmg!");
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      } 
                    }
                    else if(yourInput.equals("Mana Heal")) {
                      if(currentMana >= 3){
                        if(currentMana + 5 > maxMana) {
                          currentMana = maxMana;
                        }
                        else {
                        currentMana += 5;
                        }
                        System.out.println("\nYou gained 8 mana (and used 3 mana)!");
                      }
                      else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                      } 
                    }
                    
                  }
                  else {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou stumble on your words, and your spell fails to cast. In your confusion, the enemy moves! (You mistyped the spell or you don't have that spell.)");
                  }
                }
            if(monsterHp <=0) {
                fighting = false;
              }
            if(fighting) {
              count++;
              if(count % 5 == 1) {
                howMuchDmgHe = Math.round((int) (2+(count/5) * multiplier));
                System.out.println("The priest swings his mace at you for " + howMuchDmgHe + " dmg!");
                currentHp -= howMuchDmgHe;
              }
              else if(count%5 ==2) {
                int graa = (int) (5*multiplier);
                System.out.println("The priest heals himself for " + graa + " hp!");
                if(monsterHp + graa > mMonsterHp) {
                  monsterHp = mMonsterHp;
                }
                else {
                  monsterHp += graa;
                }
              }
              else if(count%5 == 3) {
                System.out.println("The priest steals 3 mana from you!");
                if(currentMana - 3 < 0) {
                  currentMana = 0;
                }
                else {
                  currentMana -= 3;
                }
              }
              else if(count%5 == 4) {
                int graa = (int) (4*multiplier);
                System.out.println("The priest heals himself for " + graa + " hp!");
                if(monsterHp + graa > mMonsterHp) {
                  monsterHp = mMonsterHp;
                }
                else {
                  monsterHp += graa;
                }
              }
              else {
                System.out.println("The priest debuffs you. You do 1-2 less damage with your melee attacks for the rest of the fight!");
                what += 1.5;
              }
            }
            if(fighting) {
                System.out.println("You regen 1 mana!");
                if(currentMana + 1 <= maxMana) {
                  currentMana += 1;
                }
                else {
                  currentMana = maxMana;
                }
              }
            if(currentHp <= 0) {
              System.out.println("You died! Game over.");
              System.out.println("TIP: You should use your heal skill! It's very powerful. You don't regenerate hp between fights.");
              System.out.println("TIP: The priest debuffs you and quickly overpowers you. Kill him before he gets too strong!");

                System.exit(0);
              }
          }//end whilefighting
             System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou win!");
             whatChest = (int) (Math.random() * 36);
            System.out.println("You got: ");
            randofr = (int) (Math.random() * (10) + 1);
            if(randofr > 4 + floor) { //bad 
              whatChest = (int) (Math.random() * (3 + floor)) + 7;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
            else { //good
              if(whatChest > 24) {
              spells.add(allItems[whatChest]);
            if(allItems[whatChest].equals("Heal")) {
              System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
            }
            else if(allItems[whatChest].equals("Large Magic Missile")) {
              System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
            }
            else if(allItems[whatChest].equals("Double Strike")) {
              System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");       
            }
            else if(allItems[whatChest].equals("Triple Strike")) {
              System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
            }
            else if(allItems[whatChest].equals("Unstable Magic Missile")) {
              System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
            }
            else if(allItems[whatChest].equals("Triple Magic Missile")) {
              System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
            }
            else if(allItems[whatChest].equals("Big Heal")) {
              System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
            }
            else if(allItems[whatChest].equals("Explosion!")) {
              System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
            }
            else if(allItems[whatChest].equals("Magic Missile")) {
              System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
            }
            else if(allItems[whatChest].equals("Bifurcated Magic Missile")) {
              System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
            }
            else if(allItems[whatChest].equals("Sniper Shot")) {
              System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
            }
            else if(allItems[whatChest].equals("Mana Heal")) {
              System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
            }
            whatChest = (int) (Math.random() * 10) + 1;
            coins+=whatChest;
            System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
          }
              else {
              inventory.add(allItems[whatChest]);
              inventory.add(allItemsStats[whatChest]);
              System.out.println(allItems[whatChest] + ": " + allItemsStats[whatChest]);
              whatChest = (int) (Math.random() * (10 + floor)) + 1;
              coins += whatChest;
              System.out.println("\u001B[33m\u001B[33m" + whatChest + " coins." + "\u001B[37m");
            }
            }
            if(currentMana + 3 <= maxMana) {
                  currentMana += 3;
                }
                else {
                  currentMana = maxMana;
                }
            System.out.println("Enter anything to go back to the menu.");
            literallydoesntmatter = input.nextLine();
            if(literallydoesntmatter == "2") {}
          }
  
  
  
  
        }
        else if (encounter.equals("❓")) {
          questionNum = (int) (Math.random() * 10) + 1;
          if(questionNum < 7) {
            encounter = "🗡️";
          }
          else if (questionNum < 9) {
            encounter = "🎁";
          }
          else {
            encounter = "💰";
          }
        }
        else if (encounter.equals("👑")) {
          banana = false;
          if(loopOrNot) {
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
          String finalB = "After ascending to the summit of the towering spire, your gaze locks onto the sight of a formidable sorcerer, his presence commanding and his powers undeniable, and with a resolute determination, you brace yourself. You ready your mind and body for the impending clash that awaits, preparing to face the sorcerer in a battle of wills and strength.    ";
          System.out.print("\u001B[35m");
          for(int i = 0; i<finalB.length() -2; i+=2) {
            System.out.print(finalB.substring(i, i+2));
             try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
          }
         System.out.println("\u001B[37m ");
        int whatMonsterDoin = 0;
        boolean fighting = true;
        double monsterHp = 99;
        int noRegen = 0;
        int lDamage = 0;
        enemyIntent = "Attacking";
        while(fighting) {
          
          whatMonsterDoin += 1;
          if(whatMonsterDoin % 7 == 1 || whatMonsterDoin % 7 == 4 || whatMonsterDoin % 7 == 2) {
                enemyIntent = "Attacking";
              }
          else if(whatMonsterDoin % 7 == 3 || whatMonsterDoin % 7 == 6) {
            enemyIntent = "?????";
          }
          else if(whatMonsterDoin % 7 == 5 || whatMonsterDoin % 7 == 0){
            enemyIntent = "Debuffing";
          }
          for(int m = 0; m<1; m++) {
            
          
         //boss go now
        System.out.println("\n\n\n     ENEMY INTENT: " + enemyIntent);
        System.out.println("                    ____ ");
        System.out.println("                  .'* *.'");
        System.out.println("               __/_*_*(_");
        System.out.println("              / _______ \\");
        System.out.println("             _\\_)/___\\(_/_ ");
        System.out.println("            / _((\\- -/))_ \\");
        System.out.println("            \\ \\())(-)(()/ /");
        System.out.println("             ' \\(((()))/ '");
        System.out.println("            / ' \\)).))/ ' \\");
        System.out.println("           / _ \\ - | - /_  \\");
        System.out.println("          (   ( .;''';. .'  )");
        System.out.println("          _\\\"__ /    )\\ __\"/_");
        System.out.println("            \\/  \\   ' /  \\/");
        System.out.println("             .'  '...' ' )");
        System.out.println("              / /  |  \\ \\");
        System.out.println("             / .   .   . \\");
        System.out.println("            /   .     .   \\");
        System.out.println("           /   /   |   \\   \\");
        System.out.println("         .'   /    b    '.  '.");
        System.out.println("     _.-'    /     Bb     '-. '-._"); 
        System.out.println(" _.-'       |      BBb       '-.  '-. ");
        System.out.println("(________\\____.dBBBb.________)____)");
        System.out.println("                Hp: " + monsterHp);
                System.out.println("----------------------------------------------------------------");
        System.out.println("   Your Hp: " + currentHp + "/" + maxHp + "    Your Mana: " + currentMana + "/" + maxMana);
          }
          System.out.println("\n\nWhat do you do?");
          System.out.println("Enter \"attack\" to attack, or enter anything else to use an ability. You cannot go back.");
          yourInput = input.nextLine().toLowerCase(); 
          if(yourInput.equals("attack")) {
                howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                if(lDamage > 0) {
                  howMuchDmgYou -= 3;
                }
                monsterHp -= howMuchDmgYou;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg, and gain 2 mana!");
                if(currentMana + 2 <= maxMana) {
                  currentMana += 2;
                }
                else {
                  currentMana = maxMana;
                }
              }
          else {
                System.out.println("\n\nWhat spell do you want to use? CAPITALIZATION MATTERS. Ex: \"Heal\"");
                for(int i =0; i<spells.size(); i++) {
                  if(spells.get(i).equals("Heal")) {
                    System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
                  }
                  else if(spells.get(i).equals("Large Magic Missile")) {
                    System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
                  }
                  else if(spells.get(i).equals("Double Strike")) {
                    System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");
                    
                  }else if(spells.get(i).equals("Triple Strike")) {
                    System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
                  }
                  else if(spells.get(i).equals("Unstable Magic Missile")) {
                    System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
                  }
                  else if(spells.get(i).equals("Triple Magic Missile")) {
                    System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
                  }
                  else if(spells.get(i).equals("Big Heal")) {
                    System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
                  }
                  else if(spells.get(i).equals("Explosion!")) {
                    System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
                  }
                  else if(spells.get(i).equals("Magic Missile")) {
                    System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
                  }
                  else if(spells.get(i).equals("Bifurcated Magic Missile")) {
                    System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
                  }
                  else if(spells.get(i).equals("Sniper Shot")) {
                    System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
                  }
                  else if(spells.get(i).equals("Mana Heal")) {
                    System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
                  }
                }
                yourInput = input.nextLine();
            String words[]=yourInput.split("\\s");  
                  String capitalizeWord="";  
                  for(String w:words){  
                      String first=w.substring(0,1);  
                      String af=w.substring(1);  
                      capitalizeWord+=first.toUpperCase()+af+" ";  
                  }  
                yourInput = capitalizeWord.trim();
                if (spells.contains(yourInput)) {
  
                  if(yourInput.equals("Heal")) {
                    if(currentMana >= 3){
                      howMuchH = (int) (Math.round(maxHp*0.15));
                      if(currentHp+howMuchH>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += howMuchH;
                      }
                      currentMana -=3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for " + howMuchH + " hp!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Large Magic Missile")) {
                    if(currentMana >= 6){
                      monsterHp -= 16;
                      currentMana -= 6;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 16 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Double Strike")) {
                    if(currentMana >= 4){
                      howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*2 + " dmg!");
                      currentMana -= 4;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }                  
                  }else if(yourInput.equals("Triple Strike")) {
                    if(currentMana >= 8){
                      howMuchDmgYou = (int) (Math.random() * (m1DmgMax-m1DmgMin + 1)) + m1DmgMin;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou*3 + " dmg!");
                      currentMana -= 8;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }                      
                  }
                  else if(yourInput.equals("Unstable Magic Missile")) {
                    if(currentMana >= 3){
                      howMuchDmgYou = (int) (Math.random() * 20) + 1;
                      monsterHp -= howMuchDmgYou;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                      currentMana -= 3;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }  
                  }
                  else if(yourInput.equals("Triple Magic Missile")) {
                    if(currentMana >= 9){
                      monsterHp -= 24;
                      currentMana -= 9;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 24 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }  
                  }
                  else if(yourInput.equals("Big Heal")) {
                    if(currentMana >= 6){
                      if(currentHp+12>maxHp) {
                        currentHp = maxHp;
                      }
                      else{
                        currentHp += 14;
                      }
                      currentMana -=6;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou heal for 14 hp!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    }
                  }
                  else if(yourInput.equals("Explosion!")) {
                    if(currentMana >= 3){
                      monsterHp -= 12;
                      currentMana -= 3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 12 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Magic Missile")) {
                    if(currentMana >= 3){
                      monsterHp -= 10;
                      currentMana -= 3;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 10 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Bifurcated Magic Missile")) {
                    if(currentMana >= 7){
                      howMuchDmgYou = (int) (Math.random() * 4) + 5;
                      monsterHp -= howMuchDmgYou;
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for " + howMuchDmgYou + " dmg!");
                      for(int i = 0; i<2; i++) {
                        howMuchDmgYou = (int) (Math.random() * 4) + 5;
                        monsterHp -= howMuchDmgYou;
                        System.out.println("You attack for " + howMuchDmgYou + " dmg!");
                      }
  
                      
                      currentMana -= 7;
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Sniper Shot")) {
                    if(currentMana >= 10){
                      monsterHp -= 30;
                      currentMana -= 10;
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou attack for 30 dmg!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  else if(yourInput.equals("Mana Heal")) {
                    if(currentMana >= 3){
                      if(currentMana + 5 > maxMana) {
                        currentMana = maxMana;
                      }
                      else {
                      currentMana += 5;
                      }
                      System.out.println("\nYou gained 8 mana (and used 3 mana)!");
                    }
                    else {
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou try casting a spell, and realize you don't have enough mana for that. But you realize too late, and the enemy moves!");
                    } 
                  }
                  
                }
                else {
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou stumble on your words, and your spell fails to cast. In your confusion, the enemy moves! (You mistyped the spell or you don't have that spell.)");
                }
              }
          if(monsterHp <=0) {
            fighting = false;
            banana = false;
            loopOrNot = false;

          }
          if(whatMonsterDoin % 7 == 4) {
            if(fighting) {
              System.out.println("The sorcerer casts a bolt of lightning at you, dealing 13 damage!");
              currentHp -= 13;
              
            }
          }
          else if(whatMonsterDoin % 7 == 0) {
            if(fighting) {
            System.out.println("The sorcerer shoots a fireball at you, dealing 6 dmg!");
            currentHp -=6;
            }
          }
          else if(whatMonsterDoin % 7 == 2) {
            if(fighting) {
            f1 = (int) (Math.random() * 3) + 1;
            f2 = (int) (Math.random() * 3) + 1;
            f3 = (int) (Math.random() * 3) + 1;
            f4 = (int) (Math.random() * 3) + 1;
            System.out.println("The sorcerer shoots a barrage of icicles at you, dealing " + f1 + ", " + f2 + ", " + f3 + ", and " + f4 + " dmg!");
            currentHp -= f1;
            currentHp -= f2;
            currentHp -= f3;
            currentHp -= f4;
            }
          }
          else if(whatMonsterDoin % 7 == 3) {
            if(fighting) {
            System.out.println("The sorcerer prepares a powerful spell...");
            }
          }
          else if(whatMonsterDoin % 7 == 5) {
            if(fighting) {
              System.out.println("A dark light emites from the sorcerer's wand. Chains of shadow appear from the ground and latch onto your feet. You lose 2 mana and stop regening mana for 2 turns!");
              if(currentMana >= 2) {
                currentMana -= 2;
              }
              else {
                currentMana = 0;
              }
              noRegen = 2;
            }
          }
          else if(whatMonsterDoin % 7 == 6) {
            if(fighting) {
              System.out.println("The sorcerer casts Mana Heal, and regenerates his mana.");
            }
          }
          else if(whatMonsterDoin % 7 == 1) {
            if(fighting) {
              System.out.println("The sorcerer hits you with a purple beam, making you heavier. Your weapon does 3 less damage for 3 turns!");
              lDamage = 4;
            }
          }
          
          if(fighting && noRegen <= 0) {
                System.out.println("You regen 1 mana!");
                if(currentMana + 1 <= maxMana) {
                  currentMana += 1;
                }
                else {
                  currentMana = maxMana;
                }
              }
          noRegen -= 1;
          lDamage -= 1;
          if(currentHp <= 0) {
                System.out.println("You died! Game over.");
                System.out.println("TIP: Don't die. L bozo");

                System.exit(0);
              }
        }
          }
        } //end of encounter boss
          whatOption = "JOE";
        }
      } // end of adventure
       
      else if (whatOption.equals("inventory")) { //opens your inv
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        for(int i = 0; i<inventory.size(); i+=2) {
          System.out.println(inventory.get(i) + ":  " + inventory.get(i+1));
        }
        System.out.println("\u001B[33m\u001B[33mCoins: \u001B[37m" + coins + "");
        System.out.println("\nIf you would like to change your armor/amulet/weapon, type \"change\". \nOtherwise, type anything else to go back to the menu.");
        whatOption=input.nextLine().toLowerCase();
        
        if(whatOption.equals("change")) {
          System.out.println("What would you like to change? Type \"armor\", \"amulet\", or \"weapon\".");
          whatequip = input.nextLine().toLowerCase();

          
          if(whatequip.equals("armor")) {
            for(int i = 0; i<inventory.size(); i++) {
              if(inventory.get(i).equals("Twin Armor") || inventory.get(i).equals("Blacksteel Armor") || inventory.get(i).equals("Joe Biden Suit") || inventory.get(i).equals("Whitesteel Armor") ||inventory.get(i).equals("Armor of Armors") ||inventory.get(i).equals("Armor made of Shields")) {
                tempString.add(inventory.get(i));
                tempString.add(inventory.get(i+1));
              }

            }
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Your options are: \n ---------------------------------");
            for(int i = 0; i<tempString.size(); i+=2) {
              System.out.println(tempString.get(i) + ": " + tempString.get(i+1) + "");
            }
            
            System.out.println("\nWhat would you like to equip? (CASE SENSITIVE, PLEASE TYPE WITH PROPER CAPITALIZATION AND SPACES AS SHOWN.)\nExample: \"Blacksteel Armor\". \nIf you would like to cancel, type \"cancel\".");
            whatequipA = input.nextLine();
            if (whatequipA.equals("cancel")) {
              tempString.clear(); 
            }
            else if(tempString.contains(whatequipA)) {
              currentHp -= Integer.valueOf(equippedArmor.get(1).substring(0,2));
              maxHp -= Integer.valueOf(equippedArmor.get(1).substring(0,2));
              currentHp += Integer.valueOf(tempString.get(tempString.indexOf(whatequipA) + 1).substring(0,2));
              maxHp += Integer.valueOf(tempString.get(tempString.indexOf(whatequipA) + 1).substring(0,2));
              equippedArmor.clear();
              equippedArmor.add(tempString.get(tempString.indexOf(whatequipA)));
              equippedArmor.add(tempString.get(tempString.indexOf(whatequipA)+ 1));
              tempString.clear();

              
            }
            else {
              System.out.println("You do not have that item.");
            }
          }
      
          else if(whatequip.equals("amulet")) {
           for(int i =0; i<inventory.size(); i++) {
             if(inventory.get(i).equals("Ruby Amulet") || inventory.get(i).equals("Emerald Amulet") || inventory.get(i).equals("Platinum Amulet") || inventory.get(i).equals("Gold Amulet") || inventory.get(i).equals("Radiant Amulet") || inventory.get(i).equals("Jade Amulet") || inventory.get(i).equals("Chaos Amulet")) {
               tempString.add(inventory.get(i));
              tempString.add(inventory.get(i+1));
             }
           }
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Your options are: \n ---------------------------------");
            for(int i = 0; i<tempString.size(); i+=2) {
              System.out.println(tempString.get(i) + ": " + tempString.get(i+1) + "");
            }
            
            System.out.println("\nWhat would you like to equip? (CASE SENSITIVE, PLEASE TYPE WITH PROPER CAPITALIZATION AND SPACES AS SHOWN.)\nExample: \"Ruby Amulet\". \nIf you would like to cancel, type \"cancel\".");
            whatequipAm = input.nextLine();
            if (whatequipAm.equals("cancel")) {
              tempString.clear(); 
            }
            else if (tempString.contains(whatequipAm)) {
              if(equippedAmulet.size() > 0) {
currentMana -= Integer.valueOf(equippedAmulet.get(1).substring(0,2));
              maxMana -= Integer.valueOf(equippedAmulet.get(1).substring(0,2));
              }
              currentMana += Integer.valueOf(tempString.get(tempString.indexOf(whatequipAm) + 1).substring(0,2));
              maxMana += Integer.valueOf(tempString.get(tempString.indexOf(whatequipAm) + 1).substring(0,2));
              equippedAmulet.clear();
              equippedAmulet.add(tempString.get(tempString.indexOf(whatequipAm)));
              equippedAmulet.add(tempString.get(tempString.indexOf(whatequipAm)+ 1));
              tempString.clear();            }
          }
            
          else if(whatequip.equals("weapon")) {
            for(int i = 0; i<inventory.size(); i++) {
              if(inventory.get(i).equals("Bronze Sword") || inventory.get(i).equals("Blue Wand") || inventory.get(i).equals("Iron Sword") || inventory.get(i).equals("Jade Wand") || inventory.get(i).equals("Diamond Sword") || inventory.get(i).equals("Diamond Wand") || inventory.get(i).equals("Ruby Sword") || inventory.get(i).equals("Ruby Wand") || inventory.get(i).equals("Sword of Swords") || inventory.get(i).equals("Wand of Wands") || inventory.get(i).equals("Sword of Mystery") || inventory.get(i).equals("Tiny Sword of Mystery"))  {
              tempString.add(inventory.get(i));
              tempString.add(inventory.get(i+1));
              }
            }
                              System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Your options are: \n ---------------------------------");
            for(int i = 0; i<tempString.size(); i+=2) {
              System.out.println(tempString.get(i) + ": " + tempString.get(i+1) + "");
            }
            System.out.println("\nWhat would you like to equip? (CASE SENSITIVE, PLEASE TYPE WITH PROPER CAPITALIZATION AND SPACES AS SHOWN.)\nExample: \"Diamond Wand\". \nIf you would like to cancel, type \"cancel\".");
            whatequipW = input.nextLine();
            if (whatequipW.equals("cancel")) {
              tempString.clear(); 
            }
            else if (tempString.contains(whatequipW)) {
              m1DmgMin -= Integer.valueOf(equippedWeapon.get(1).substring(0,2));
              m1DmgMax -= Integer.valueOf(equippedWeapon.get(1).substring(3,5));
              m1DmgMin += Integer.valueOf(tempString.get(tempString.indexOf(whatequipW) + 1).substring(0,2));
              m1DmgMax += Integer.valueOf(tempString.get(tempString.indexOf(whatequipW) + 1).substring(3,5));
              equippedWeapon.clear();
              equippedWeapon.add(tempString.get(tempString.indexOf(whatequipW)));
              equippedWeapon.add(tempString.get(tempString.indexOf(whatequipW)+ 1));
              tempString.clear();            }
          }
            
          else {
            System.out.println("Please don't mistype things (it will break the program)");
          }
        }
        else {
          
        }
      }
        
      else if (whatOption.equals("equipped")) { //opens your equipped inventory
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nEquipped Armor: " + equippedArmor.get(0) + ", " + equippedArmor.get(1));
        if(equippedAmulet.size() > 0) {
        System.out.println("Equipped Amulet: " + equippedAmulet.get(0) + ", " + equippedAmulet.get(1));
        }
        System.out.println("Equipped Weapon: " + equippedWeapon.get(0) + ", " + equippedWeapon.get(1));
        System.out.println("Enter anything to go back to the menu.");
        literallydoesntmatter = input.nextLine();
      }

      else if (whatOption.equals("spells")) { //shows you what skills you have
              System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        for(int i =0; i<spells.size(); i++) {
          if(spells.get(i).equals("Heal")) {
            System.out.println("\u001B[32mHeal\u001B[37m: 3 mana, heal 15% hp.");
          }
          else if(spells.get(i).equals("Large Magic Missile")) {
            System.out.println("\u001B[32mLarge Magic Missile\u001B[37m: 6 mana, deal 16 dmg.");
          }
          else if(spells.get(i).equals("Double Strike")) {
            System.out.println("\u001B[32mDouble Strike\u001B[37m: 4 mana, attack twice.");
            
          }else if(spells.get(i).equals("Triple Strike")) {
            System.out.println("\u001B[32mTriple Strike\u001B[37m: 8 mana, attack 3 times.");
          }
          else if(spells.get(i).equals("Unstable Magic Missile")) {
            System.out.println("\u001B[32mUnstable Magic Missile\u001B[37m: 3 mana, deal 1-20 dmg.");
          }
          else if(spells.get(i).equals("Triple Magic Missile")) {
            System.out.println("\u001B[32mTriple Magic Missile\u001B[37m: 9 mana, deal 24 dmg.");
          }
          else if(spells.get(i).equals("Big Heal")) {
            System.out.println("\u001B[32mBig Heal\u001B[37m: 6 mana, heal 14 hp.");
          }
          else if(spells.get(i).equals("Explosion!")) {
            System.out.println("\u001B[32mExplosion!\u001B[37m: 3 mana, deal 12 dmg.");
          }
          else if(spells.get(i).equals("Magic Missile")) {
            System.out.println("\u001B[32mMagic Missile\u001B[37m: 3 mana, deal 10 dmg.");
          }
          else if(spells.get(i).equals("Bifurcated Magic Missile")) {
            System.out.println("\u001B[32mBifurcated Magic Missile\u001B[37m: 7 mana, deal 5-8 dmg 3 times.");     
          }
          else if(spells.get(i).equals("Sniper Shot")) {
            System.out.println("\u001B[32mSniper Shot\u001B[37m: 10 mana, deal 30 dmg.");
          }
          else if(spells.get(i).equals("Mana Heal")) {
            System.out.println("\u001B[32mMana Heal\u001B[37m: 3 mana, heal 8 mana.");
          }
        }
        System.out.println("Enter anything to go back to the menu.");
        literallydoesntmatter = input.nextLine();
        if(literallydoesntmatter == "2") {}
      }

      else if (whatOption.equals("info")) {
        System.out.println("GENERAL GAME INFO:");
        System.out.println("This game is a turn-based, roguelike where you climb up a spire of 9 floors. The spire is semi-randomly generated, where the icons are randomized each time you play the game. You can not go back or turn right/left after you climb up a floor in order to prevent overgearing. There is equipment/coins given out every time you beat a monster or open a treasure chest. To change your equipment, go to inventory and follow the steps. ");
        System.out.println("There are a total of 5 enemies (including the boss), and around 40ish spells/items.");
        System.out.println("COMBAT:");
        System.out.println("Combat is turn based, with you moving first and then the enemy. You can see the enemy's intent above their head, and how much hp they have left under them. Each time you attack with your sword or wand, you gain 2 mana. However, you don't gain that 2 mana after casting spells. At the end of every turn, you regenerate 2 mana. You regenerate 3 mana at the end of every fight. You skip your turn if you try castng a spell without mana, or if you miscast the spell. However, you do not regenerate hp at the end of every fight. The only way to regenerate hp is to use a spell during the battle.");
        System.out.println("DIFFICULTY"); 
        System.out.println("If you decide to play on easy mode, you get 30 extra hp, 10 coins, and 4 extra mana to start with. The difficulty of the monsters gets progressively higher as you climb the spire. The game is coded so that the monsters hp and damage they do scale with each floor.");
        System.out.println("Type anything to go back to the main menu.");
        literallydoesntmatter = input.nextLine();
      }
      else{
        System.out.println("broke");
      }
      

                     } //end of loopornot
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    String finalfrnow = "As the final blow lands, the powerful sorcerer crumples to the ground, his magic dissipating into the air. Silence fills the summit of the spire, broken only by the sound of your heavy breaths. With the defeat of the sorcerer, a sense of accomplishment washes over you, mingled with relief and a newfound inner strength. You stand victorious, gazing out from the pinnacle of the spire, the world stretching before you, transformed by your journey. With a heart filled with pride and a mind brimming with memories, you begin your descent, ready to embrace the next chapter of your extraordinary tale. ";
    for(int i = 0; i<finalfrnow.length(); i+=2) {
      System.out.print("\u001B[35m" + finalfrnow.substring(i, i+2));
       try {
          Thread.sleep(50);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
    System.out.println("\u001B[37m ");
    System.out.println("The end.");

  }
}

