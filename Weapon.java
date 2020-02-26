import java.util.Random;

public class Weapon{

  int damage = 0;
  String weapon = new String();

  public String weapon(){
    damage = 1;
    weapon = "unarmed";
    return weapon;
  }

  public String weapon(String initial){
    if (initial.equalsIgnoreCase("broken straight sword")) {
      damage = 5;
      weapon = initial;
    }
    else if (initial.equalsIgnoreCase("straight sword")) {
      damage = 20;
      weapon = initial;
    }
    else if (initial.equalsIgnoreCase("long sword")) {
      damage = 25;
      weapon = initial;
    }
    else if (initial.equalsIgnoreCase("falchion")) {
      damage = 27;
      weapon = initial;
    }
    else if (initial.equalsIgnoreCase("claymore")) {
      damage = 30;
      weapon = initial;
    }
    else if (initial.equalsIgnoreCase("rapier")) {
      damage = 23;
      weapon = initial;
    }
    /*else if (initial.equalsIgnoreCase("")) {
      damage = ;
      weapon = initial;
    }
    else if (initial.equalsIgnoreCase("")) {
      damage = ;
      weapon = initial;
    }
    else if (initial.equalsIgnoreCase("")) {
      damage = ;
      weapon = initial;
    }
    else if (initial.equalsIgnoreCase("")) {
      damage = ;
      weapon = initial;
    }
    */
      return weapon;
  }

  public int damage(){
    return damage;
  }

  public String weaponType(){
    return weapon;
  }

}
