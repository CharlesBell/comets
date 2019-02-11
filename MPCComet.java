package comets

/**
 *
 * @author Charles Bell
 * 
 */
public class MPCComet extends Comet {

    public String name;
    public double epochJD;
    public double perihelionDateJD;
    public double perihelionDistance;
    public double eccentricity;
    public double inclination;
    public double longitudeOfAscendingNode;
    public double argumentOfPerihelion;

    public MPCComet(String name, double epochJD, double perihelionDateJD,
            double perihelionDistance, double eccentricity, double inclination,
            double longitudeOfAscendingNode, double argumentOfPerihelion) {

        this.name = name;
        this.epochJD = epochJD;
        this.perihelionDateJD = perihelionDateJD;
        this.perihelionDistance = perihelionDistance;
        this.eccentricity = eccentricity;
        this.inclination = inclination;
        this.longitudeOfAscendingNode = longitudeOfAscendingNode;
        this.argumentOfPerihelion = argumentOfPerihelion;

    }

    public String getName() {
        return name;
    }

    public double getEpochJD() {
        return epochJD;
    }

    public double getPerihelionDistance() {
        return perihelionDistance;
    }
    
    public double getPerihelionJD() {
        return perihelionDateJD;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public double geInclination() {
        return inclination;
    }

    public double getLongitudeOfAscendingNode() {
        return longitudeOfAscendingNode;
    }

    public double getArgumentOfPerihelion() {
        return argumentOfPerihelion;
    }

}
