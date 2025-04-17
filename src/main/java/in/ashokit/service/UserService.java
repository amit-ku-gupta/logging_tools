package in.ashokit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
     private Logger logger=LoggerFactory.getLogger(UserService.class);
	public void saveUser() {
		logger.trace("this is trace message");
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.warn("this is warn message");
		logger.error("this is error message");
	}
}
