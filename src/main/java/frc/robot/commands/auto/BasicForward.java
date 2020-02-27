package frc.robot.commands.auto;

import frc.robot.profiling.SwerveWaypoint;
import frc.robot.commands.swerve.*;
import jaci.pathfinder.Pathfinder;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class BasicForward extends CommandGroup {
    public BasicForward() {
        addSequential(new PathCommand(0, 0,
            new SwerveWaypoint(0, 50, Pathfinder.d2r(0), 270)
        ), 2.25);
    }
}
