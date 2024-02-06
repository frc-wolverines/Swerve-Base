package frc.robot.systems.swerve.subsystems;

import com.ctre.phoenix6.hardware.CANcoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;
import frc.montylib.swerve.ModuleFrame;
import frc.robot.systems.swerve.constants.SwerveModuleConstants;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModulePosition;
import edu.wpi.first.math.kinematics.SwerveModuleState;

//(#) STATUS : Unoperable
public class SwerveModule extends ModuleFrame {
    //Motors
    private CANSparkMax driveMotor, pivotMotor = null;
    
    //Encoders
    private RelativeEncoder driveEncoder, pivotEncoder = null;
    private CANcoder absoluteEncoder = null;

    //PID Controller
    private PIDController pivotController = null;

    public SwerveModule() {
        driveMotor = new CANSparkMax(0, MotorType.kBrushless);
        pivotMotor = new CANSparkMax(0, MotorType.kBrushless);

        driveEncoder = driveMotor.getEncoder();
        driveEncoder.setPositionConversionFactor(SwerveModuleConstants.kDriveConversions[0]);
        driveEncoder.setVelocityConversionFactor(SwerveModuleConstants.kDriveConversions[1]);

        pivotEncoder = pivotMotor.getEncoder();
        pivotEncoder.setPositionConversionFactor(SwerveModuleConstants.kPivotConversions[0]);
        pivotEncoder.setVelocityConversionFactor(SwerveModuleConstants.kPivotConversions[1]);

        absoluteEncoder = new CANcoder(0);

        pivotController = new PIDController(0, 0, 0);
        pivotController.enableContinuousInput(-Math.PI, Math.PI);
    }

    @Override
    public double getDrivePosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDrivePosition'");
    }

    @Override
    public double getDriveVelocity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDriveVelocity'");
    }

    @Override
    public double getPivotPosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPivotPosition'");
    }

    @Override
    public double getPivotVelocity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPivotVelocity'");
    }

    @Override
    public Rotation2d getPivotRotation2d() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPivotRotation2d'");
    }

    @Override
    public SwerveModuleState getState() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getState'");
    }

    @Override
    public SwerveModulePosition getPosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPosition'");
    }

    @Override
    public void setDesiredState(SwerveModuleState state) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDesiredState'");
    }

    @Override
    public void resetEncoders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resetEncoders'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
}