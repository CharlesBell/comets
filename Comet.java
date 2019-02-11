package comets;
/**
 * Comet.java
 *
 * @author Charles Bell
 */
public abstract class Comet implements AbstractComet {

    /**
     * JPL Astrodynamic Constant Astronomical unit 1 AU= 149597870.691 km
     * http://ssd.jpl.nasa.gov/?constants
     */
    public double au = JPLConstants.AU;

    /**
     * JPL Astrodynamic Constant Speed of light c= 299792.458 km/s
     * http://ssd.jpl.nasa.gov/?constants
     */
    public double c = JPLConstants.C;

    /**
     * JPL Astrodynamic Constants 1 day= 86400.0 s number of seconds in a day 24
     * x 3600 s = 6400.0 s http://ssd.jpl.nasa.gov/?constants
     */
    public double day = JPLConstants.DAY;

    public abstract String getName();

    public abstract double getEpochJD();

    public abstract double getPerihelionDistance();
    public abstract double getPerihelionJD();

    public abstract double getEccentricity();

    public abstract double geInclination();

    public abstract double getLongitudeOfAscendingNode();

    public abstract double getArgumentOfPerihelion();

    public boolean isElliptical() {
        return (getEccentricity() < 1.0d);
    }

    public boolean isParabolic() {
        return (getEccentricity() == 1.0d);
    }

    public boolean isHyperbolic() {
        return (getEccentricity() > 1.0d);
    }

    public boolean isNearParabolic() {
        return ((getEccentricity() > .98d) && (getEccentricity() < 1.02d) && !isParabolic());
    }

}
