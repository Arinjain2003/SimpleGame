package game;

public class main {
    public static void main(String args[]){
        Player1 player = new Player1("Arin","sword",100);
        System.out.println(player.getName());
        System.out.println(player.getHealth());
        System.out.println(player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun2();

        Player2 betterPlayer = new Player2("Anay","machine gun" ,80,false);
        betterPlayer.damageByGun1();

    }
}
