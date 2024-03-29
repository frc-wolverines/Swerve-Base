package frc.robot.systems.swerve.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.systems.swerve.subsystems.SwerveDrive;

public class SwerveDriveResetHeading extends Command {

  private SwerveDrive drive;

  public SwerveDriveResetHeading(SwerveDrive subsystem) {
    this.drive = subsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drive.resetHeading();
    drive.zeroModules();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
