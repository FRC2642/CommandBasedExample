
package org.usfirst.frc2642.myRobot.commands.Lift;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2642.myRobot.Robot;

/**
 *
 */
public class LiftOverride extends Command {

    public LiftOverride() {
        // Use requires() here to declare subsystem dependencies
        requires(org.usfirst.frc2642.myRobot.Robot.Lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (button1 == true) {
    		Robot.Lift.moveLift(0.5);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
