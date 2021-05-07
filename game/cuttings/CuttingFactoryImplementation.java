package mpjp.game.cuttings;
import java.util.Set;
import java.util.HashSet;
import mpjp.shared.MPJPException;

public class CuttingFactoryImplementation implements CuttingFactory {

    /*
     * Set of valid cutting names. They can be used as argument for CuttingFactory.createCutting(String)
     * @return set of valid cutting names
     */
    public java.util.Set<java.lang.String> getAvaliableCuttings() {
        Set<String> cuttings = new HashSet<String>();
        cuttings.add("Standard");
        cuttings.add("Straight");
        cuttings.add("Round");
        cuttings.add("Triangular");
        return cuttings;
    }

    /*
     * Create a cutting with given name. Provided name must be one of given by CuttingFactory.getAvaliableCuttings()
     * @return cutting
     */

    public Cutting createCutting​(String name) throws MPJPException {

            switch (name) {
            case "STANDARD":
                return new StandardCutting();
            case "STRAIGHT":
                return new StraightCutting();
            case "ROUND":
                return new RoundCutting();
            case "TRIANGULAR":
                return new TriangularCutting();
            default:
                throw new MPJPException("Invalid input");
            }
        }

}