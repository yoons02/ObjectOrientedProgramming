import java.util.ArrayList;

public class task5Edit {

    public static void main(String[] args) {

        Team blueTeam = new Team();
        Team redTeam = new Team();

        // 팀별 player 구성 예제
        blueTeam.addCharacter(new Character3("블루1", 20, 6)); // 밸런스형
        blueTeam.addCharacter(new Character3("블루2", 30, 4)); // 체력이 높지만 공격력이 낮음
        blueTeam.addCharacter(new Character3("블루3", 12, 12)); // 체력이 적지만 공격력이 높음

        redTeam.addCharacter(new Character3("레드1", 20, 6));
        redTeam.addCharacter(new Character3("레드2", 30, 4));
        redTeam.addCharacter(new Character3("레드3", 12, 12));

        System.out.println("전투 시작!\n");


        int winner = 0;

        for (int i = 0; i < 50; ++i) // 한 팀 빼고 전부 전멸할 때까지 계속한다. 단, 50턴이 지나면 무승부.
        {
            blueTeam.printInfo();
            redTeam.printInfo();
            System.out.println();

            blueTeam.attack(redTeam); // 공격자가 공격했다는 메시지를 띄운다.
            redTeam.attack(blueTeam); // 공격자가 공격했다는 메시지를 띄운다.

            blueTeam.removeDeadPlayer();
            redTeam.removeDeadPlayer();
            // todo: add break condition
            // player size가 0이면 break
            if ((blueTeam.players.size() == 0)||(redTeam.players.size() == 0)){
                break;
            }
        }

        // todo: show results.
        if (blueTeam.players.size() == 0){
            System.out.println("redTeam 승리!");
        } else if (redTeam.players.size()==0) {
            System.out.println("blueTeam 승리!");
        }
    }
}

class Team {
    ArrayList<Character3> players = new ArrayList<Character3>();

    public void addCharacter(Character3 c) {
        players.add(c);
    }

    public void removeDeadPlayer() {
        players.removeIf(Character3::isDead);
    }

    public void printInfo(){
        for(int i = 0; i < players.size(); i++){
            players.get(i).printInfo();
        }
    }

    public void attack(Team enemies){
        for (int i = 0; i < players.size(); i++){
            for (int j = 0; j < getCharacterList().size(); j++){
                players.get(i).attack(enemies.getCharacterList().get(j));
            }
        }
    }

    public ArrayList<Character3> getCharacterList() {
        return players;
    }
}

class Character3 {

    String name;
    int hp;
    int maxHp;
    int maxValue; // 공격력 능력치. 주사위를 굴릴 때 1부터 maxValue까지의 값이 나온다.

    public Character3(String name, int hp, int maxValue) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.maxValue = maxValue;
    }

    boolean isDead(){
        if (hp <= 0){
            return true;
        }
        else{
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int roll() // 주사위를 굴려 피해량을 정한다.
    {
        return (int) (Math.random() * maxValue) + 1;
    }

    public void attack(Character3 enemy) {
        // todo: 공격 메시지를 띄운다.
        int damage = roll();
        System.out.println(name + "은(는) "+enemy.getName() +"에게 "+damage + "의 피해를 입혔다!");
        enemy.damaged(damage);
    }

    public void printInfo() // 현재 체력 상태를 띄운다.
    {
        int gauge = (int) (10 * hp / (float) maxHp);

        for (int i = 0; i < gauge; i++) {
            System.out.print("●");
        }
        for (int i = 0; i < 10 - gauge; i++) {
            System.out.print("○");
        }

        System.out.println(" " + name + " " + hp + "/" + maxHp);
    }

    public void damaged(int damage) // 피해를 받아 자신의 체력을 감소시킨다.
    {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }
}