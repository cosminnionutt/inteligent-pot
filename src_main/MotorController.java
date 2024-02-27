package inteligentpot.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import inteligentpot.com.core.domain.MotorControl;

@Controller
@RequestMapping("/motor")
public class MotorController {
	@Autowired
	MotorControl motorControl;

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody boolean motorState() {
		return motorControl.getMotorState();
	}

	@CrossOrigin
	@RequestMapping(path = "/run", method = RequestMethod.GET)
	public @ResponseBody void runMotor() {
		motorControl.setMotorTrue();
	}

	@CrossOrigin
	@RequestMapping(path = "/stop", method = RequestMethod.GET)
	public @ResponseBody void stopMotor() {
		motorControl.setMotorFalse();
	}
}
