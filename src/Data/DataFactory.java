package data;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 * DataFactory initialises the game objects to be handle by the logic part.
 */

public interface DataFactory {

    public RubberData getRubber(int x, int y, int score, boolean isEaten);
    public PacmanData getPacman(int x, int y, int score, int nb_l);
    public WallData getWall(int x, int y);
    public GhostData getGhost(int x, int y);
    public CaseData getCase(int x, int y);
    public LevelData getLevel(int x, int y, int id);
}
