package data;

/**
 * PacmanData allows to represent a Pacman character which defines it.
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 * @inv score >= 0
 * @inv Pacman.allInstances() -> forAll(p | p.nb_lives <= 0) implies (Game.allInstances() -> forAll(g | g.game_over = true))
 */
public interface PacmanData extends CharacterData {

	
	/**
	 * return the score of Pacman
	 * @return The score of Pacman
	 * @post result = self.score
	 */
	public int getScore();
	
	/**
	 * Return the number of life left of Pacman
	 * @return The number of life left of Pacman
	 * @post result = self.NbLife;
	 */
	public int getNbLife();
}
