package inteligentpot.com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import inteligentpot.com.core.domain.DataLogs;
import inteligentpot.com.core.domain.MotorControl;
import inteligentpot.com.core.service.DataLogsService;

@Controller
@RequestMapping("/")
public class WebController {
	@Autowired
	DataLogsService dataLogsService;

	@Autowired
	MotorControl motorControl;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
		List<DataLogs> dataLogs = dataLogsService.getAllDataLogs();
		model.put("data", dataLogs);
		model.put("motorState", motorControl.getMotorState());
		return "index";
	}
}
