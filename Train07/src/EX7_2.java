public class EX7_2 {

    public static void main(String[] args) {
        
        Player player = new Player("플레이어", 24, 6);
        Enemy enemy = new Enemy("적", 20, 5);

        int winner = 0;

        for(int i = 0; i < 50; i++) // 50턴 지나면 무승부
        {
            player.printInfo();
            enemy.printInfo();
            System.out.println();

            player.attack(enemy);
            enemy.attack(player);
            System.out.println();

            // 전투 종료 조건 검사

            if(player.getHp() == 0 && enemy.getHp() == 0)
            {
                break;
            }
            if(player.getHp() == 0)
            {
                winner = 2;
                break;
            }
            if(enemy.getHp() == 0)
            {
                winner = 1;
                break;
            }
        }

        player.printInfo();
        enemy.printInfo();
        System.out.println();

        // 전투 결과 검사

        switch(winner)
        {
            case 1:
                System.out.println("플레이어 승리!");
                break;
            case 2:
                System.out.println("적 승리!");
                break;
            case 0:
                System.out.println("무승부!");
                break;
        }
    }
}

class Entity {

    String name;
    int hp;
    int maxHp;
    int maxValue;

    public Entity(String name, int hp, int maxValue)
    {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.maxValue = maxValue;
    }

    public String getName()
    {
        return name;
    }

    public int getHp()
    {
        return hp;
    }
    
    public void attack(Entity enemy, int damage)
    {
        enemy.damaged(damage);
        System.out.println(name + "이(가) " + enemy.getName() + "에게 " + damage + "만큼의 피해를 입혔습니다!");
    }

    public void damaged(int damage)
    {
        hp -= damage;
        if(hp < 0)
        {
            hp = 0;
        }
    }

    public void printInfo()
    {
        System.out.println(name + " HP : " + hp + "/" + maxHp);
    }
}

class Player extends Entity {

    public Player(String name, int hp, int maxValue)
    {
        super(name, hp, maxValue);
    }
    
    public int roll() // 플레이어의 주사위는 최대값의 절반 이상의 값이 무조건 나온다.
    {
        return (int)((Math.random() * 0.5 + 0.5) * maxValue) + 1;
    }

    public void attack(Entity enemy)
    {
        super.attack(enemy, roll()); // roll 함수가 Entity 클래스에 없는 관계로 매개변수로 넣어준다.  
    }
}

class Enemy extends Entity {

    public Enemy(String name, int hp, int maxValue)
    {
        super(name, hp, maxValue);
    }
    
    public int roll() // 적의 주사위는 일반적으로 굴린다.
    {
        return (int)(Math.random() * maxValue) + 1;
    }

    public void attack(Entity enemy)
    {
        super.attack(enemy, roll()); // roll 함수가 Entity 클래스에 없는 관계로 매개변수로 넣어준다.
    }
}