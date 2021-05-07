package mpjp.game.cuttings;
import mpjp.shared.MPJPException;


public interface CuttingFactory {
        java.util.Set<java.lang.String> getAvaliableCuttings();
        Cutting createCutting​(java.lang.String name) throws MPJPException;
}