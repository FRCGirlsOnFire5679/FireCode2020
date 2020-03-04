package frc.robot.commands.auto;

import frc.robot.profiling.SwerveWaypoint;
import frc.robot.commands.swerve.*;
import jaci.pathfinder.Pathfinder;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class BasicForward extends CommandGroup {
    public BasicForward() {
        addSequential(new PathCommand(-163, 99,
            new SwerveWaypoint(-163, 100, Pathfinder.d2r(90), 270),
            new SwerveWaypoint(-163, 101, Pathfinder.d2r(90), 270),
            new SwerveWaypoint(-167, 102, Pathfinder.d2r(90), 270)
        ), 2.25);
    }
}
