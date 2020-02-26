public class Inventory{

  static Player player = new Player();
  Weapon main_weapon = new Weapon();

  public Inventory(){

  }

  public void WeaponInit(){
    main_weapon.weapon();
  }

  public static void setUp(Player yourPlayer){
    player = yourPlayer;
  }

  public void display(){
    System.out.println("\n" + player.Name() + "\nWeapon: " + main_weapon.weaponType() + "\nDamage: " + main_weapon.damage() + "\n");
  }
  

}
