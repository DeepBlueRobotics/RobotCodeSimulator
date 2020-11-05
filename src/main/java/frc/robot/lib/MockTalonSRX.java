package frc.robot.lib;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Talon;

public class MockTalonSRX extends MockPhoenixController {

    public MockTalonSRX(int portPWM) {
        super(portPWM);
        motorPWM = new Talon(portPWM);
    }

    public static WPI_TalonSRX createMockTalonSRX(int portPWM) {
        return Mocks.createMock(WPI_TalonSRX.class, new MockTalonSRX(portPWM));
    }
}