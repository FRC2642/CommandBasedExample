package org.usfirst.frc2642.myRobot.commands;

import org.usfirst.frc2642.myRobot.Robot;
import org.usfirst.frc2642.myRobot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SetLiftToCoop extends Command {
	
	int leftbound, rightbound;
	
    public SetLiftToCoop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.Lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	leftbound = 140;
    	rightbound = 300; // limits for encoder
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (RobotMap.liftEncoder.getDistance() < 800) {
    		
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
    }
}
