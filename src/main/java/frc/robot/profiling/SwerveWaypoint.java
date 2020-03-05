package frc.robot.profiling;

import jaci.pathfinder.Waypoint;

public class SwerveWaypoint extends Waypoint {
    double rotationRate;

    public SwerveWaypoint(double x, double y, double angle, double rotationRate) {
        super(x, y, angle);
        this.rotationRate = rotationRate;
    }

}
