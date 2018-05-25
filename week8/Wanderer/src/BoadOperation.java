public class BoadOperation {
    Board board = new Board();
    Maze maze = new Maze();
    int posY, posX;

    BoadOperation (int posX, int posY) {
        this.posX = board.hero.posX;
        this.posY = board.hero.posY;

    }

    public boolean isPath (int posX, int posY) {
                if (maze.map.get(posX/72).get(posY/72).equals('p')) {
                    return true;

        }return false;
    }

}
