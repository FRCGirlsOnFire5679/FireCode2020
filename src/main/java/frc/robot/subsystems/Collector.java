package frc.robot.subsystems;

import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Collector extends Subsystem {

    private WPI_VictorSPX collectorMotor = new WPI_VictorSPX(RobotMap.CollectorMotor.C_MOTOR);

    public Collector() {
        super();
    }

    public void push(double speed) {
        collectorMotor.set(-speed);
    } 

    public void pull(double speed) {
        collectorMotor.set(speed);
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
    
}