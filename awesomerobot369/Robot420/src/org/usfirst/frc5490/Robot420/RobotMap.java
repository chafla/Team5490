// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5490.Robot420;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController pIDSubsystem1SpeedController1;
    public static AnalogInput pIDSubsystem1AnalogInput1;
    public static DigitalInput pIDSubsystem1DigitalInput1;
    public static DigitalOutput pIDSubsystem1DigitalOutput1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        pIDSubsystem1SpeedController1 = new Talon(0);
        LiveWindow.addActuator("PID Subsystem 1", "Speed Controller 1", (Talon) pIDSubsystem1SpeedController1);
        
        pIDSubsystem1AnalogInput1 = new AnalogInput(0);
        LiveWindow.addSensor("PID Subsystem 1", "Analog Input 1", pIDSubsystem1AnalogInput1);
        
        pIDSubsystem1DigitalInput1 = new DigitalInput(0);
        LiveWindow.addSensor("PID Subsystem 1", "Digital Input 1", pIDSubsystem1DigitalInput1);
        
        pIDSubsystem1DigitalOutput1 = new DigitalOutput(1);
        LiveWindow.addActuator("PID Subsystem 1", "Digital Output 1", pIDSubsystem1DigitalOutput1);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
    }
}
