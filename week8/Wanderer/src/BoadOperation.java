public class BoadOperation {
    Board board = new Board();
    int posY, posX;

    BoadOperation(int posX, int posY) {
        this.posX = board.hero.posX;
        this.posY = board.hero.posY;

    }

    public boolean isPath(int posX, int posY) {
        return Maze.map.get(posX / 72).get(posY / 72).equals('p');
    }

}
