import java.util.ArrayList;

public class task5 {

    public static void main(String[] args) {

        Team blueTeam = new Team();
        Team redTeam = new Team();

        // 팀별 player 구성 예제
        blueTeam.addCharacter(new Character("블루1", 20, 6)); // 밸런스형
        blueTeam.addCharacter(new Character("블루2", 30, 4)); // 체력이 높지만 공격력이 낮음
        blueTeam.addCharacter(new Character("블루3", 12, 12)); // 체력이 적지만 공격력이 높음

        redTeam.addCharacter(new Character("레드1", 20, 6));
        redTeam.addCharacter(new Character("레드2", 30, 4));
        redTeam.addCharacter(new Character("레드3", 12, 12));

        System.out.println("전투 시작!\n");

        int winner = 0;

        for (int i = 0; i < 50; ++i) // 한 팀 빼고 전부 전멸할 때까지 계속한다. 단, 50턴이 지나면 무승부.
        {
            blueTeam.printInfo();
            redTeam.printInfo();
            System.out.println();

            blueTeam.attack(redTeam); // 공격자가 공격했다는 메시지를 띄운다.
            redTeam.attack(blueTeam); // 공격자가 공격했다는 메시지를 띄운다.

            // todo: add break condition
        }

        // todo: show results.
    }
}

class Team {
    ArrayList<Character> players = new ArrayList<Character>();

    public void addCharacter(Character c) {
        players.add(c);
    }

    public void attack(Team enemy) {
        // 1. 아군 팀의 부대원은 적군 팀의 모둔 플레이어를 공격함 
        // 만약 아군 팀이 2명, 적군 팀이 3명으로 구성되어 있으면, 아군 팀원은 모두 각 적군 플레이를 공격, 총 6번의 공격이 이루어짐. 
    }

    public void printInfo() {
        // 각 구성원의 HP출력하시오
    }

    public ArrayList<Character> getCharacterList() {
        return players;
    }
}