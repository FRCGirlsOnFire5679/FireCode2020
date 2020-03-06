package frc.robot.commands.cargo;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CargoLongRetract extends Command {

    public CargoLongRetract() {
        requires(Robot.intake);
    }

    @Override
    public void execute() {
        Robot.intake.retractLong();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}