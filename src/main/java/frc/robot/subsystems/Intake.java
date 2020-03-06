package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.cargo.CargoWithJoy;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

    private WPI_VictorSPX intakemotor = new WPI_VictorSPX(RobotMap.Cargo.L_MOTOR);

    /*
    * @param mCargoHandlerL Left Cargo Handler Motor
    * @param mCargoHandlerR Right Gargo Handler Motor
    */
    public Intake() {
        super();
        intakemotor.setNeutralMode(NeutralMode.Brake);
    }

    public void pull(double speed) {
        intakemotor.set(speed);
    }

    public void start(double speed) {
        intakemotor.set(-speed);
    }

    public void stop() {
        start(0);
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new IntakeWithJoy());
    }
    public void push(double speed) {
        intakemotor.set(-speed);
    } 
}