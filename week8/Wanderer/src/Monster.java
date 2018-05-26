public class Monster extends Character {
    boolean keyholder;



    Monster () {
        Level level = new Level();
        healthPoint = level.lvl * 2 * d6;
        defendPoint = level.lvl * d6;
        strikePoint = level.lvl / d6;
    }
}
