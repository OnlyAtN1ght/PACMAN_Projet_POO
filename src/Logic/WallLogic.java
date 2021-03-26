package logic;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 * 
 * @inv  (Wall.allInstances() -> exists(Character.allInstances() -> forAll(c | self.x <> c.x or self.y <> c.y)))
 * and (Wall.allInstances() -> exists(Rubber.allInstances() -> forAll(r | (self.x <> r.x) or (self.y <> r.y))))
 */

public interface WallLogic {

}
