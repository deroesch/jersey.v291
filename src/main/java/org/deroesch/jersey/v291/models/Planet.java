package org.deroesch.jersey.v291.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Planet {

    /**
     * Null constructor.
     */
    public Planet() {
    }

    /**
     * Create a planet.
     * 
     * @param name
     * @param avgSolarDistance
     * @param diameter
     * @param dayLength
     * @param yearLength
     * @param gravityVsEarth
     * @param avgTemp
     * @param atmosphere
     * @param moons
     */
    public Planet(String name, String avgSolarDistance, String diameter, String dayLength, String yearLength,
            String gravityVsEarth, String avgTemp, String atmosphere, Integer moons) {
        super();
        this.name = name;
        this.avgSolarDistance = avgSolarDistance;
        this.diameter = diameter;
        this.dayLength = dayLength;
        this.yearLength = yearLength;
        this.gravityVsEarth = gravityVsEarth;
        this.avgTemp = avgTemp;
        this.atmosphere = atmosphere;
        this.moons = moons;

        assert this.isValid();
    }

    /**
     * Make sure fields are non-null
     * 
     * @return if valid
     */
    public boolean isValid() {
        return this.name != null && this.avgSolarDistance != null && this.diameter != null && this.dayLength != null
                && this.yearLength != null && this.gravityVsEarth != null && this.avgTemp != null
                && this.atmosphere != null && this.moons != null;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the avgSolarDistance
     */
    public String getAvgSolarDistance() {
        return avgSolarDistance;
    }

    /**
     * @param avgSolarDistance the avgSolarDistance to set
     */
    public void setAvgSolarDistance(String avgSolarDistance) {
        this.avgSolarDistance = avgSolarDistance;
    }

    /**
     * @return the diameter
     */
    public String getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the dayLength
     */
    public String getDayLength() {
        return dayLength;
    }

    /**
     * @param dayLength the dayLength to set
     */
    public void setDayLength(String dayLength) {
        this.dayLength = dayLength;
    }

    /**
     * @return the yearLength
     */
    public String getYearLength() {
        return yearLength;
    }

    /**
     * @param yearLength the yearLength to set
     */
    public void setYearLength(String yearLength) {
        this.yearLength = yearLength;
    }

    /**
     * @return the gravityVsEarth
     */
    public String getGravityVsEarth() {
        return gravityVsEarth;
    }

    /**
     * @param gravityVsEarth the gravityVsEarth to set
     */
    public void setGravityVsEarth(String gravityVsEarth) {
        this.gravityVsEarth = gravityVsEarth;
    }

    /**
     * @return the avgTemp
     */
    public String getAvgTemp() {
        return avgTemp;
    }

    /**
     * @param avgTemp the avgTemp to set
     */
    public void setAvgTemp(String avgTemp) {
        this.avgTemp = avgTemp;
    }

    /**
     * @return the atmosphere contents
     */
    public String getAtmosphere() {
        return atmosphere;
    }

    /**
     * @param atmosphere the atmosphere contents to set
     */
    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    /**
     * @return the number of known moons
     */
    public Integer getMoons() {
        return moons;
    }

    /**
     * @param moons the number of known moons to set
     */
    public void setMoons(Integer moons) {
        this.moons = moons;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((atmosphere == null) ? 0 : atmosphere.hashCode());
        result = prime * result + ((avgSolarDistance == null) ? 0 : avgSolarDistance.hashCode());
        result = prime * result + ((avgTemp == null) ? 0 : avgTemp.hashCode());
        result = prime * result + ((dayLength == null) ? 0 : dayLength.hashCode());
        result = prime * result + ((diameter == null) ? 0 : diameter.hashCode());
        result = prime * result + ((gravityVsEarth == null) ? 0 : gravityVsEarth.hashCode());
        result = prime * result + ((moons == null) ? 0 : moons.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((yearLength == null) ? 0 : yearLength.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Planet other = (Planet) obj;
        if (atmosphere == null) {
            if (other.atmosphere != null)
                return false;
        } else if (!atmosphere.equals(other.atmosphere))
            return false;
        if (avgSolarDistance == null) {
            if (other.avgSolarDistance != null)
                return false;
        } else if (!avgSolarDistance.equals(other.avgSolarDistance))
            return false;
        if (avgTemp == null) {
            if (other.avgTemp != null)
                return false;
        } else if (!avgTemp.equals(other.avgTemp))
            return false;
        if (dayLength == null) {
            if (other.dayLength != null)
                return false;
        } else if (!dayLength.equals(other.dayLength))
            return false;
        if (diameter == null) {
            if (other.diameter != null)
                return false;
        } else if (!diameter.equals(other.diameter))
            return false;
        if (gravityVsEarth == null) {
            if (other.gravityVsEarth != null)
                return false;
        } else if (!gravityVsEarth.equals(other.gravityVsEarth))
            return false;
        if (moons == null) {
            if (other.moons != null)
                return false;
        } else if (!moons.equals(other.moons))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (yearLength == null) {
            if (other.yearLength != null)
                return false;
        } else if (!yearLength.equals(other.yearLength))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Planet [name=" + name + ", avgSolarDistance=" + avgSolarDistance + ", diameter=" + diameter
                + ", dayLength=" + dayLength + ", yearLength=" + yearLength + ", gravityVsEarth=" + gravityVsEarth
                + ", avgTemp=" + avgTemp + ", atmosphere=" + atmosphere + ", moons=" + moons + "]";
    }

    private String name = "";
    private String avgSolarDistance = "";
    private String diameter = "";
    private String dayLength = "";
    private String yearLength = "";
    private String gravityVsEarth = "";
    private String avgTemp = "";
    private String atmosphere = "";
    private Integer moons = 0;

    public static final Planet error = new Planet("Error", "AvgSolarDistance", "Diameter", "DayLength", "YearLength",
            "GravityVsEarth", "AvgTemp", "Atmosphere", -1);

}
