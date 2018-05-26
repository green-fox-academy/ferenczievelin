public class Boss extends Monster {

    Boss () {
        Level level = new Level();
        healthPoint = level.lvl * d6 + d6;
        defendPoint = level.lvl / 2 * d6 + d6 / 2;
        strikePoint = level.lvl * d6 + level.lvl;
    }
}
