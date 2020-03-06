package frc.robot.commands.cargo;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CargoShortRetract extends Command {

    public CargoShortRetract() {
        requires(Robot.intake);
    }

    @Override
    public void execute() {
        Robot.intake.retractShort();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}